/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
 import java.util.Timer;
 import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sutic
 */
public class start implements timerState {
    private int time;
    public start(int time) {
        this.time = time * 60000;
    }
    @Override
    public void doAction(Timer timer) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                
                stop s = new stop();
                s.doAction(timer);
            }
            
        };
        System.out.println("Timer task started at:"+new Date());
        timer.schedule(task, time);
        
    }
    
}
