public class NeedForSpeed {
    public int speed = 0;
    public int batteryDrain = 0;
    public int metersDriven = 0;
    public int fullChargebattery = 100;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public void drive(){
        if (fullChargebattery != 0){
            metersDriven += speed;
            fullChargebattery -= batteryDrain;
        }
    }

    public int distanceDriven(){
        return metersDriven;
    }

    public boolean batteryDrained(){
        if (fullChargebattery == 0){
            return true;
        }
        return false;
    }

    public static NeedForSpeed nitro(){
        return new NeedForSpeed(50, 4);
    }

}

