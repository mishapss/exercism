
class BirdWatcher {
    //private int[] birdsLastWeek = new int [] {0, 2, 5, 3, 7, 8, 4};
    private final int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int[] array = getLastWeek();
        int arrayLength = array.length;
        int birdsToday = array[arrayLength-1];
        return birdsToday;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        int[] birds = birdsPerDay;

        for (int i = 0; i < birds.length; i++) {
            if (birds[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] birds = birdsPerDay;
        int count = 0;
        
        if (numberOfDays > birds.length){
            for (int i = 0; i < birds.length; i++){
                count = count + birds[i];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++){
                count = count + birds[i];
            }
        }
        
        return count;
    }

    public int getBusyDays() {
        int[] birds = birdsPerDay;
        int countBusyDays = 0;

        for (int i = 0; i < birds.length; i++){
            if (birds[i] >= 5){
                countBusyDays += 1;
            }
        }
        
        return countBusyDays;
    }
}
