/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
 import java.util.Timer;
 import java.util.TimerTask;
/**
 *
 * @author sutic
 */
public class stop implements timerState {

    @Override
    public void doAction(Timer timer) {
          timer.cancel();
          System.out.println("Timer finished!!!!!!!" + new Date());
    }
    
}
