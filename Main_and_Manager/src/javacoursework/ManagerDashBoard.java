/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package javacoursework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ManagerDashBoard {

    private String name;
    private String password;
    

    public ManagerDashBoard(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void DashBoard() {
        // Frame
        JFrame frame = new JFrame("Manager Dash Board");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Outer panel with GridBagLayout to center content
        JPanel outer = new JPanel(new GridBagLayout());
        frame.add(outer);

        // Container panel to stack label and button panel vertically
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        // Greeting label
        JLabel greeting = new JLabel("Welcome to the Manager Dashboard, " + this.name);
        greeting.setFont(new Font("Arial", Font.BOLD, 18));
        greeting.setAlignmentX(Component.CENTER_ALIGNMENT); // center horizontally
        container.add(greeting);

        // Gap between label and buttons
        
         // 50 pixels gap

        // Button panel with GridLayout 2x2
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(300, 150));

        // Add buttons
        
        JButton ModifyRolesButton = new JButton("Modify Roles");
        JButton SetPricesButton = new JButton("Set Prices");
        JButton AnalyzedReportButton = new JButton("Analyzed Report");
        JButton ViewCommentButton = new JButton("View Comment");
        
        buttonPanel.add(ModifyRolesButton);
        buttonPanel.add(SetPricesButton);
        buttonPanel.add(AnalyzedReportButton);
        buttonPanel.add(ViewCommentButton);

        container.add(buttonPanel);

        // GridBagConstraints to center container in outer panel
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        outer.add(container, c);

        // Show frame
        frame.setVisible(true);
        
        
        //modifyRolesButton event Handling;
        ModifyRolesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModifyRoles MR = new ModifyRoles();
                MR.ModifyRolesScreen();// open new screen
                frame.dispose(); // close current dashboard
            }
        });
    }

    public static void main(String[] args) {
        new ManagerDashBoard("Alice", "pass123").DashBoard();
    }
    
    int i = 0;
    
}