/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author cst140021
 */
public class circle implements Shape {

    int area = 0;
    int redians;

    public void calculateArea() {
        int area = (redians * redians * 22) / 7;
        System.out.println("area = " + area);
    }

    public static void main(String args[]) {
        circle obj = new circle(10);
        obj.calculateArea();
    }

    circle(int r) {
        this.redians = r;

    }
}
