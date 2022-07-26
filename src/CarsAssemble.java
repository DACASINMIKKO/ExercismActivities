public class CarsAssemble {
    int minimum = 0;
    int maximum = 10;
    int carsPerHour = 221;

    public double productionRatePerHour(int speed){
        double productionSuccessRate = 0;
        if (speed > minimum && speed <= 4){
            productionSuccessRate = 1;
        } else if (speed >= 5 && speed <= 8) {
            productionSuccessRate = 0.9;
        } else if (speed == 9){
            productionSuccessRate = 0.8;
        } else if (speed == 10) {
            productionSuccessRate = 0.77;
        }

        double productionRatePerHour = speed * carsPerHour * productionSuccessRate;
        return productionRatePerHour;
    }

    public int workingItemsPerMinute(int speed){
        int minutesInHour = 60;
        int workingItemsPerMinute = (int)productionRatePerHour(speed)/minutesInHour;
        return workingItemsPerMinute;
    }
}
