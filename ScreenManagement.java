/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3650_project;

import java.io.IOException;

/**
 *
 * @author Johnawin
 */
public class ScreenManagement {
    
    public void clearScreen() {
        System.out.println(new String(new char[100]).replace("\0", "\r\n"));
    }
    
    public void waitForInput() {
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
