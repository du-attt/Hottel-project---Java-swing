/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Main_View;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Login_Controller {
    public Login_Controller(){
        Main_View mv = new Main_View();
        mv.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mv.setVisible(true);
    }
    
}
