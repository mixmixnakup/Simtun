/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simtun;

import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author surface
 */
public class CalView extends javax.swing.JFrame {

    private final JLabel lblcalcu = new JLabel("คำนวณค่าดัชนีมวลกาย:");
    private final JLabel lblWeight = new JLabel("น้ำหนักตัว");
    private final JTextField txtNum1 = new JTextField(5);
    private final JLabel lbldivide = new JLabel("/");
    private final JLabel lblHeight = new JLabel("ส่วนสูง");
    private final JTextField txtNum2 = new JTextField(5);
    private final JButton btnSum = new JButton("คำนวณ");
    private final JLabel Measurement = new JLabel("                                                    เกณฑ์การวัดBMI");
    private final JLabel lbl = new JLabel("                                                        น้อยกว่า 18.50	น้ำหนักน้อย / ผอม");
    private final JLabel lbl1 = new JLabel("                                                            ระหว่าง 18.50 - 22.90	ปกติ (สุขภาพดี)");
    private final JLabel lbl2 = new JLabel("                                                            ระหว่าง 23 - 24.90	ท้วม / โรคอ้วนระดับ 1");
    private final JLabel lbl3 = new JLabel("                                                            ระหว่าง 25 - 29.90	อ้วน / โรคอ้วนระดับ 2");
    private final JLabel lbl4 = new JLabel("                                                            มากกว่า 30	อ้วนมาก / โรคอ้วนระดับ 3");
    private final JTextField txtAns = new JTextField(9);

    public void setLayout(LayoutManager manager) {
        // TODO Auto-generated method stub
        super.setLayout(manager);
    }

    public CalView() {
        // set all of component to JPanal via constructor
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 250);

//calcPanel.add(lblmultiply);
        calcPanel.add(lblcalcu);
        calcPanel.add(lblWeight);
        calcPanel.add(txtNum1);
        calcPanel.add(lbldivide);
        calcPanel.add(lblHeight );;
        calcPanel.add(btnSum);
        calcPanel.add(txtAns);
        calcPanel.add(Measurement);
        calcPanel.add(lbl);
        calcPanel.add(lbl1);
        calcPanel.add(lbl2);
        calcPanel.add(lbl3);
        calcPanel.add(lbl4);
        this.add(calcPanel);
    }

    public int getTxtNum1() {

        return Integer.parseInt(txtNum1.getText());
    }

    public int getTxtNum2() {

        return Integer.parseInt(txtNum2.getText());

    }

    public void setTxtAns(float sum) {

        txtAns.setText(Float.toString(sum));

    }

// If btnSum clicked execute a method
// use to set action of button
    void addActionListener(ActionListener actionPerformed) {

        btnSum.addActionListener(actionPerformed);
    }

// show error message
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
