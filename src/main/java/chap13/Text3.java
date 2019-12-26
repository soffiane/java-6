package chap13;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;   // utile pour DocumentListener ....

class FenTextChap13Text3 extends JFrame implements DocumentListener {
    public FenTextChap13Text3() {
        setTitle("Miroir d'un texte");
        setSize(300, 110);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());

        saisie = new JTextField(20);
        contenu.add(saisie);
        saisie.getDocument().addDocumentListener(this);

        copie = new JTextField(20);
        copie.setEditable(true);
        copie.setBackground(Color.gray);
        contenu.add(copie);
    }

    public void insertUpdate(DocumentEvent e) {
        String texte = saisie.getText();
        copie.setText(texte);
    }

    public void removeUpdate(DocumentEvent e) {
        String texte = saisie.getText();
        copie.setText(texte);
    }

    public void changedUpdate(DocumentEvent e) {
    }

    private JTextField saisie, copie;
    private JButton bouton;
}

public class Text3 {
    public static void main(String args[]) {
        FenTextChap13Text2 fen = new FenTextChap13Text2();
        fen.setVisible(true);
    }
}


