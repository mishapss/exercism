public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        if (actualMinutes > 40){
            System.out.println("geben sie die richtige zeit");
            return -1;
        } else {
            int remainingMinutes = 40 - actualMinutes;
            return remainingMinutes;
        }
        
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerNumbers) {
        int preparationTime = layerNumbers*2;
        return preparationTime;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method    
    public int totalTimeInMinutes(int layerNumber, int minutesInOven) {
        int totalTime = layerNumber*2 + minutesInOven;
        return totalTime;
    }

}
