class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryPercentage;
    private int drivenDistance;

    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryPercentage = 100;
        this.drivenDistance = 0;
    }
	   
    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }
 
    public int distanceDriven() {
        return drivenDistance;
        }

    public void drive() {
        if (batteryPercentage > 0) {
            drivenDistance += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getBatteryPercentage() { return batteryPercentage; }
    public int getBatteryDrain() { return batteryDrain; }
    public int getSpeed() { return speed; }
} 

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrives = car.getBatteryPercentage() / car.getBatteryDrain();
        int maxDistance = maxDrives * car.getSpeed();
        return maxDistance >= distance;
    }
}
