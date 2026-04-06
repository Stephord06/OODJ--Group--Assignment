/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacoursework;
import javax.swing.*;
/**
 *
 * @author User
 */
public class ModifyRoles extends JFrame{
    
        public void ModifyRolesScreen() {
            this.setTitle("Modify Roles");
            this.setSize(400, 300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("This is the Modify Roles screen.");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(label);

            this.setVisible(true);
        }
      
}
