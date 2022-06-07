package Prova3P.View;

import Prova3P.Model.ModelCalculate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.multi.MultiLabelUI;

public class ViewCalculate extends JFrame {
    JTextField firtNumSum = new JTextField(10);
    JTextField firtNumSub = new JTextField(10);
    JTextField firtNumDiv = new JTextField(10);
    JTextField firtNumMult = new JTextField(10);
    JLabel sumSimbol = new JLabel("+");
    JLabel subSimbol = new JLabel("-");
    JLabel MultSimbol = new JLabel("*");
    JLabel divSimbol = new JLabel("/");
    JTextField secondNumSum = new JTextField(10);
    JTextField secondNumSub = new JTextField(10);
    JTextField secondNumDiv = new JTextField(10);
    JTextField secondNumMult = new JTextField(10);
    JButton buttonCalculate1 = new JButton(" = ");
    JButton buttonCalculate2 = new JButton(" = ");
    JButton buttonCalculate3 = new JButton(" = ");
    JButton buttonCalculate4 = new JButton(" = ");

    JTextField resultado1;
    JTextField resultado2;
    JTextField resultado3;
    JTextField resultado4;

    public ViewCalculate() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel screenCalculate = new JPanel();
        screenCalculate.setLayout(new FlowLayout());

        screenCalculate.add(firtNumSum);
        screenCalculate.add(sumSimbol);
        screenCalculate.add(secondNumSum);

        buttonCalculate1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valorUm = firtNumSum.getText();
                String ValorDois = secondNumSum.getText();
                colherDadosDoUsuario(valorUm, ValorDois);
            }

            private void colherDadosDoUsuario(String valorUm, String valorDois) {
                int valor_um = Integer.parseInt(valorUm);
                int valor_dois = Integer.parseInt(valorDois);
                ModelCalculate model = new ModelCalculate();
                resultado1.setText(String.valueOf(model.numbersSum(valor_um, valor_dois)));
            }
        });
        screenCalculate.add(buttonCalculate1);
        resultado1 = new JTextField(10);
        resultado1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resultado1.setEditable(false);
        resultado1.setHorizontalAlignment(JTextField.RIGHT);
        screenCalculate.add(resultado1);

        screenCalculate.add(firtNumSub);
        screenCalculate.add(subSimbol);
        screenCalculate.add(secondNumSub);
        buttonCalculate2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valorUm = firtNumSub.getText();
                String ValorDois = secondNumSub.getText();
                colherDadosDoUsuario(valorUm, ValorDois);
            }
            private void colherDadosDoUsuario(String valorUm, String valorDois) {
                int valor_um = Integer.parseInt(valorUm);
                int valor_dois = Integer.parseInt(valorDois);
                ModelCalculate model = new ModelCalculate();
                resultado2.setText(String.valueOf(model.numberSub(valor_um, valor_dois)));
            }
        });
        screenCalculate.add(buttonCalculate2);
        resultado2 = new JTextField(10);
        resultado2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resultado2.setEditable(false);
        resultado2.setHorizontalAlignment(JTextField.RIGHT);
        screenCalculate.add(resultado2);

        screenCalculate.add(firtNumMult);
        screenCalculate.add(MultSimbol);
        screenCalculate.add(secondNumMult);
        buttonCalculate3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valorUm = firtNumMult.getText();
                String ValorDois = secondNumMult.getText();
                colherDadosDoUsuario(valorUm, ValorDois);
            }
            private void colherDadosDoUsuario(String valorUm, String valorDois) {
                int valor_um = Integer.parseInt(valorUm);
                int valor_dois = Integer.parseInt(valorDois);
                ModelCalculate model = new ModelCalculate();
                resultado3.setText(String.valueOf(model.numberMult(valor_um, valor_dois)));
            }
        });
        screenCalculate.add(buttonCalculate3);
        resultado3 = new JTextField(10);
        resultado3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resultado3.setEditable(false);
        resultado3.setHorizontalAlignment(JTextField.RIGHT);
        screenCalculate.add(resultado3);

        screenCalculate.add(firtNumDiv);
        screenCalculate.add(divSimbol);
        screenCalculate.add(secondNumDiv);
        buttonCalculate4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valorUm = firtNumDiv.getText();
                String ValorDois = secondNumDiv.getText();
                colherDadosDoUsuario(valorUm, ValorDois);
            }
            private void colherDadosDoUsuario(String valorUm, String valorDois) {
                int valor_um = Integer.parseInt(valorUm);
                int valor_dois = Integer.parseInt(valorDois);
                ModelCalculate model = new ModelCalculate();
                resultado4.setText(String.valueOf(model.numberDivi(valor_um, valor_dois)));
            }
        });

        screenCalculate.add(buttonCalculate4);
        resultado4 = new JTextField(10);
        resultado4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        resultado4.setEditable(false);
        resultado4.setHorizontalAlignment(JTextField.RIGHT);
        screenCalculate.add(resultado4);

        frame.add(screenCalculate);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
