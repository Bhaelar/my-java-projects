/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlights;
import java.util.EnumSet;
/**
 *
 * @author Modupe Okenla
 */
public class TrafficLights {
    public enum traffic {
        RED(30),
        YELLOW(5),
        GREEN(60);
        private int duration;
        traffic(int duration) {
            this.duration = duration;
        }
        public int getDuration() {
            return duration;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Traffic lights and duration: ");
        for (traffic trafficlight : traffic.values()) {
            System.out.println(trafficlight + "  " + trafficlight.getDuration());
        }
    }
    
}
