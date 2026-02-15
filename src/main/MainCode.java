/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Game;
import core.StarterGame;

/**
 *
 * @author renat
 */
public class MainCode {
    public static void main(String[] args){
        if(args.length >= 2){
            int width = Integer.parseInt(args[1]);
            int height = Integer.parseInt(args[2]);
            String title = args[0];

            StarterGame.start(new Game(title,width,height));
        }else{
            StarterGame.start(new Game("Default title",1000,800));
        }
    }
}
