/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3650_project;

/**
 *
 * @author Johnawin
 */
public class clearScreen {
    
    public static void clearScreen(){
        System.out.println(new String(new char[100]).replace("\0", "\r\n"));
    }
}
