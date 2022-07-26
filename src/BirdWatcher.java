public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public int[] getLastWeek(){
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }
    public int getToday(){
        int today = 0;
        today = birdsPerDay[birdsPerDay.length-1];
        return today;
    }
    public int incrementTodaysCount(){
        if(birdsPerDay.length != 0){
            birdsPerDay[birdsPerDay.length-1]++;
        }
        return birdsPerDay[birdsPerDay.length-1];
    }
    public boolean hasDayWithoutBirds(){
        for (int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays){
        int sum = 0;
        if (numberOfDays > birdsPerDay.length){
            for (int i = 0; i < birdsPerDay.length; i++){
                sum += birdsPerDay[i];
            }
        }else {
            for (int i = 0; i < numberOfDays; i++){
                sum += birdsPerDay[i];
            }
        }
        return sum;
    }
    public int getBusyDays(){
        int counter = 0;
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5){
                counter++;
            }
        }
        return counter;
    }
}
