/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahan2;

/**
 *
 * @author ASUS
 */
import java.awt.*;
public class Tambahan2 extends Panel{
        Tambahan2(){
            setBackground(Color.WHITE);
        }
    public void paint(Graphics Z) {
        //Buat Badan
        Z.drawLine(175, 300, 175, 160);
        
        //Buat Kaki
        Z.drawLine(155, 310,175,250 );
        Z.drawLine(195, 310,175,250 );
        
        //Buat Tangan
        Z.drawLine(140, 250, 175, 200);
        Z.drawLine(215, 250, 175, 200);
        
        //Buat Bagian Kepala
        Z.drawRoundRect(145, 103, 60 , 60,60, 60);
        
        
        //Buat Bagian Wajah
        Z.drawRoundRect(160, 125, 12, 10,10, 10);
        Z.drawRoundRect(177, 125, 12, 10,10, 10);
       
       
        Z.drawArc(145, 140, 130, 60, -20, 20);
         }
    public static void main(String[] args) {
        Frame f = new Frame("Zizky Yuningsih");
       Tambahan2 Zp = new Tambahan2();
       f.add(Zp);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}

