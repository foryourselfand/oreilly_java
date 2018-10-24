package Ch12.Examples.MusicPlayer;


import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;

import static Ch12.Examples.MusicPlayer.MiniMusicPlayer1.makeEvent;

public class MiniMusicPlayer3 {
    static JFrame frame = new JFrame();
    static MyDrawPanel drawPanel;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setUpGUI() {
        drawPanel = new MyDrawPanel();
        frame.setContentPane(drawPanel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }

    private void go() {
        setUpGUI();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            sequencer.addControllerEventListener(drawPanel, new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 100; i += 4) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
