/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author renat
 */
public class Game extends Window implements GameInterface{
    private JFrame window;
    private boolean running;

    public Game(String title,int width,int height){
        super(title,width,height);
    }
    
    @Override
    public int run() {
       
        
        window = new JFrame(title);
        
        window.setSize(width, height);
        window.setTitle(title);
        window.setResizable(resizable);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        
        return 0;
    }



    
}
