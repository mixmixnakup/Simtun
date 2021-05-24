/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simtun;

public class CalModel {

    private float sum;

    public void add(int num1, int num2) {
        float dnum1, dnum2;
        dnum1 = num1;
        dnum2 = (float) num2 / 100;
        sum = dnum1 / (dnum2 * dnum2);
    }

    public float getSum() {
        return sum;
    }
}
