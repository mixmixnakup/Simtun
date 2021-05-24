/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simtun;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalController {

    private CalView view;
    private CalModel model;

    public void setModel(CalModel model) {
        this.model = model;
    }

    public void setView(CalView view) {
        this.view = view;
        this.view.addActionListener(new CalListener());
    }

// use inner class
    class CalListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int num1, num2 = 0;

            try {

                num1 = view.getTxtNum1();
                num2 = view.getTxtNum2();
                model.add(num1, num2);
                view.setTxtAns(model.getSum());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                view.displayErrorMessage("Not number");

            }
        }
    }
}
