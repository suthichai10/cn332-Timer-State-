
import java.util.Date;
import java.util.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class timerMain {
    public static void main(String[] args) {
        Timer t = new Timer();    
        start start = new start(1); // 1 minute
        start.doAction(t);
    }
}
