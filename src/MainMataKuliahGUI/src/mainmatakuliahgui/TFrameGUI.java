package mainmatakuliahgui;

import java.awt.*;
import java.awt.event.*;

public class TFrameGUI extends Frame {

    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    CheckboxGroup cbg;
    Checkbox cbNilaiAngka, cbNilaiHuruf, cbASD, cbProbstat, cbProglan, cbMatkomlan;
    Button btnHasil, btnTampil;
    TextArea txtArea;

    String[][] output = new String[4][2];

    public TFrameGUI() {
        setLayout(null);
        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(140, 30, 170, 20);
        cbg = new CheckboxGroup();
        cbASD = new Checkbox("ASD", cbg, false);
        this.add(cbASD).setBounds(20, 50, 80, 20);
        cbProbstat = new Checkbox("Probstat", cbg, false);
        this.add(cbProbstat).setBounds(100, 50, 90, 20);
        cbProglan = new Checkbox("Proglan", cbg, false);
        this.add(cbProglan).setBounds(200, 50, 90, 20);
        cbMatkomlan = new Checkbox("Matkomlan", cbg, false);
        this.add(cbMatkomlan).setBounds(300, 50, 90, 20);

        lbTugas = new Label("Tugas : ");
        add(lbTugas);
        lbTugas.setBounds(100, 80, 62, 20);

        lbKuis = new Label("Kuis : ");
        add(lbKuis);
        lbKuis.setBounds(100, 110, 70, 20);

        lbUTS = new Label("UTS : ");
        add(lbUTS);
        lbUTS.setBounds(100, 140, 70, 20);

        lbUAS = new Label("UAS : ");
        add(lbUAS);
        lbUAS.setBounds(100, 170, 70, 20);
        
        

    }

}