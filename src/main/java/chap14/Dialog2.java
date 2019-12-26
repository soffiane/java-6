package chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FenDialogChap14Dialogue2 extends JFrame implements ActionListener {
    public FenDialogChap14Dialogue2() {
        setTitle("Essai boite de dialogue");
        setSize(400, 200);
        lanceDial = new JButton("Lancement dialogue");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(lanceDial);
        lanceDial.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        MonDialog bd = new MonDialog(this);
        texte = bd.lanceDialogue();
        if (texte != null) System.out.println("valeur lue : " + texte);
        else System.out.println("dialogue abandonne");
        bd.dispose();
    }

    private JButton lanceDial;
    private String texte;
}

class MonDialog extends JDialog implements ActionListener {
    public MonDialog(JFrame proprio) {
        super(proprio, "Dialogue de saisie", true);
        setSize(250, 120);
        okBouton = new JButton("OK");
        okBouton.addActionListener(this);
        champTexte = new JTextField(20);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(okBouton);
        contenu.add(champTexte);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okBouton) {
            ok = true;
            setVisible(false);
        }
    }

    public String lanceDialogue() {
        ok = false;
        setVisible(true);
        if (ok) return champTexte.getText();
        else return null;
    }

    private boolean ok;
    private JButton okBouton;
    private JTextField champTexte;
}

public class Dialog2 {
    public static void main(String args[]) {
        FenDialogChap25Dialogue1 fen = new FenDialogChap25Dialogue1();
        fen.setVisible(true);
    }
}


