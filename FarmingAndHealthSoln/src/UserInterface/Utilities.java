/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class Utilities {
 
    
     public static void shakeButton(JTextField textField1 ) {
    final Point point = textField1.getLocation();
    
    final int delay = 90;
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 1; i++) {
          try {

            moveButton(new Point(point.x + 5, point.y),textField1);
            Thread.sleep(delay);
            moveButton(point,textField1);
            Thread.sleep(delay);
            moveButton(new Point(point.x - 5, point.y),textField1);
            Thread.sleep(delay);
            moveButton(point,textField1);
            Thread.sleep(delay);
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        }
      }
    };
    Thread t = new Thread(r);
    t.start();
  }

  public static void moveButton(final Point p,JTextField textfied) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        textfied.setLocation(p);
      }
    });
  }
    
  public static void shakeButtonxCombox(JComboBox combobox ) {
    final Point point = combobox.getLocation();
    
    final int delay = 90;
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 1; i++) {
          try {

            moveButton1(new Point(point.x + 5, point.y),combobox);
            Thread.sleep(delay);
            moveButton1(point,combobox);
            Thread.sleep(delay);
            moveButton1(new Point(point.x - 5, point.y),combobox);
            Thread.sleep(delay);
            moveButton1(point,combobox);
            Thread.sleep(delay);
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        }
      }
    };
    Thread t = new Thread(r);
    t.start();
  }

  public static void moveButton1(final Point p,JComboBox comboBox) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        comboBox.setLocation(p);
      }
    });
  }
  
    
}
