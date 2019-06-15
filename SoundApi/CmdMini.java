import javax.sound.midi.*;

public class CmdMini {
    public static void main (String[] args) {
        CmdMini mini = new CmdMini();
        if (args.length < 2) {
            System.out.println("Insert yer instrument and note lines, fella.  Right here.  C'mon.");
        } else {
            int instrument1 = Integer.parseInt(args[0]);
            int instrument2 = Integer.parseInt(args[1]);
            int note1 = Integer.parseInt(args[2]);
            int note2 = Integer.parseInt(args[3]);
            mini.play(instrument1, instrument2, note1, note2);
        }
    }

    protected MidiEvent changeInstrument(int instrument, long tick) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(192, 1, instrument, 0);
        return new MidiEvent(msg, tick);
    }

    // protected MidiEvent[] playNote(int note, int velocity, int tick, int length) throws InvalidMidiException {
    //     MidiEvent[] events = MidiEvent[2];
    //     ShortMessage msg = new ShortMessage();
    //     msg.setMessage(144, 1, note, velocity);
    //     events[0] = new MidiEvent();
    //     return MidiEvent[2]
    // }

    protected MidiEvent noteOn(int note, int velocity, int tick) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(144, 1, note, velocity);
        return new MidiEvent(msg, tick);
    }

    protected MidiEvent noteOff(int note, int velocity, int tick) throws InvalidMidiDataException {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(128, 1, note, velocity);
        return new MidiEvent(msg, tick);
    }

    public void play (int instrument1, int instrument2, int note1, int note2) {

        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
    
            MidiEvent event = null;

            track.add(changeInstrument(102, 0));
            track.add(noteOn(70, 100, 1));
            track.add(noteOff(70, 100, 8));
            track.add(noteOn(74, 100, 5));
            track.add(noteOff(74, 100, 8));
    
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note1, 70);
            MidiEvent firstNoteOn = new MidiEvent(a, 1);
            track.add(firstNoteOn);
    
            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note1, 70);
            MidiEvent firstNoteOff = new MidiEvent(b, 16);
            track.add(firstNoteOff);

            ShortMessage second = new ShortMessage();
            second.setMessage(192, 1, instrument2, 0);
            MidiEvent secondChangeInstrument = new MidiEvent(second, 1);
            track.add(secondChangeInstrument);

            ShortMessage c = new ShortMessage();
            a.setMessage(144, 1, note2, 70);
            MidiEvent secondNoteOn = new MidiEvent(c, 1);
            track.add(secondNoteOn);
    
            ShortMessage d = new ShortMessage();
            b.setMessage(128, 1, note2, 70);
            MidiEvent secondNoteOff = new MidiEvent(d, 16);
            track.add(secondNoteOff);
            player.setSequence(seq);
            player.start();

            while (true) { 
  
                if (!player.isRunning()) { 
                    player.close(); 
                    System.exit(1); 
                } 
            } 

        } catch (Exception ex) {ex.printStackTrace();}

    }
}
