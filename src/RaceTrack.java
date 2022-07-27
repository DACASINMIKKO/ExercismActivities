public class RaceTrack {
    public int distance = 0;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car){
        double carTravel = (double) distance / (double) car.speed;
        double batteryConsumption = Math.ceil(carTravel * car.batteryDrain);
        if (batteryConsumption > 100){
            return false;
        }
        return true;
        //10 5 100/20
    }
}