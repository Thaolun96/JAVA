/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoan;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author DELL
 */
public class Tinhtoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Frame F = new Frame();
        F.setTitle("TÍNH TOÁN");
        F.setSize(350,400);
        F.setLayout(new FlowLayout());
        Label tbl =new Label("a=");
        F.add(tbl);
        TextField lbl= new TextField(30);
        F.add(lbl);
        Label tbl1 = new Label("b=");
        F.add(tbl1);
        TextField tnc = new TextField(30);
        F.add(tnc);
        Button ab1 = new Button("+");
        F.add(ab1);
        Button ab2 = new Button("-");
        F.add(ab2);
        Button ab3 = new Button("*");
        F.add(ab3);
        Button ab4 = new Button("/");
        F.add(ab4);
        Label kq = new Label("KQ");
        F.add(kq);
        TextField tnn = new TextField(30);
         F.add(tnn);
        F.setVisible(true );
    }
    
}
