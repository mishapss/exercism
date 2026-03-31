public class JedliksToyCar {
    private int distance = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        String displayDistance = "Driven " + distance + " meters";
        return displayDistance;
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0){
            return "Battery empty";
        } 
        else{
            String displayBattery = "Battery at " + batteryPercentage + "%";
            return displayBattery;    
        }
        
    }

    public void drive() {
        int drivenMeters = 20;
        if (batteryPercentage > 0){
            distance += drivenMeters;
            batteryPercentage -= 1;
        }
        
    }
}
