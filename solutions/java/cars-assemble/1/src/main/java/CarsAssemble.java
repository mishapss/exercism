public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate;

        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else { // speed == 10
            successRate = 0.77;
        }
        
        double result = 221 * speed * successRate;
        return result;
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHour = productionRatePerHour(speed);
        int carsPerMinute = (int) (carsPerHour/60);
        return carsPerMinute;
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
}
