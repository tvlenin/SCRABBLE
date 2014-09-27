package scrabble.DATAIO;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener implements KeyListener {
    private boolean[] keys=new boolean[100];//a boolean for every key
    public boolean up,down,left,right,shotup,shotdown,shotleft,shotright;
        
    
public void update(){
    up=keys[KeyEvent.VK_UP];
    down=keys[KeyEvent.VK_DOWN];
    left=keys[KeyEvent.VK_LEFT];
    right=keys[KeyEvent.VK_RIGHT];
    shotup=keys[KeyEvent.VK_W];
    shotdown=keys[KeyEvent.VK_S];
    shotleft=keys[KeyEvent.VK_A];
    shotright=keys[KeyEvent.VK_D];
    for(int i=0;i<keys.length;i++){
        if (keys[i]){
            //System.out.println(i);
        }
    }
}
@Override
public void keyTyped(KeyEvent e) {
}

@Override
public void keyPressed(KeyEvent e) {
    keys[e.getKeyCode()]=true;
    System.out.println("press: "+KeyEvent.getKeyText(e.getKeyCode())); 
           
}

@Override
public void keyReleased(KeyEvent e) {
    keys[e.getKeyCode()]=false;
    //System.out.println("Soltada="+KeyEvent.getKeyText(e.getKeyCode()));
}}
