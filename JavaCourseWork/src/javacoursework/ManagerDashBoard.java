/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacoursework;

import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


/**
 *
 * @author User
 */
public class ManagerDashBoard {
    
    private String name ;
    private String password;
            
    public ManagerDashBoard(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public void Icon(String name){
        
        //Frame
        JFrame frame = new JFrame("Manager Dash Board");
        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        JPanel outer = new JPanel(new GridBagLayout()); // centers inner panel
        frame.add(outer);
        
        //name panel
        JLabel Greeting = new JLabel("Welcome to the Manager DashBoard" + this.name);
        
        //Panel
        JPanel Panel = new JPanel();
        Panel.setSize(800,500);
        Panel.setLayout(null);
        Panel.setVisible(true);
        
        
        
        
        //setLayout or setBounds
        Greeting.setBounds(400,490,100,100);
        
        
        
        //adding frame
        frame.add(Greeting);
        
        
    }
    
}
