/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author renat
 * 
 * 
 */
public abstract class Window {
    protected int width;
    protected int height;
    protected String title;
    protected boolean resizable = false;
    
    /**
     * Create and run a window
     *   
     * @param title o titulo da janela
     * @param width a largura da janela
     * @param height a altura da janela
     */
    public Window(String title, int width,int height){
        this.title = title;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Create and run a window with resizable param
     * 
     * @param title o titulo da janela
     * @param width a largura da janela
     * @param height a altura da janela
     * @param resizable 
     */
    public Window(String title, int width, int height,boolean resizable){
        this.title = title;
        this.width = width;
        this.height = height;
        this.resizable = resizable;
    }
    
    
    
}
