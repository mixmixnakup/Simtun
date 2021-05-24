/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simtun;

public class MVC {

    public static void main(String[] args) {
        CalView v = new CalView();
        CalModel m = new CalModel();
        CalController con = new CalController();
        con.setModel(m);
        con.setView(v);
        v.setVisible(true);

    }
}
