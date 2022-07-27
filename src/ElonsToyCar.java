public class ElonsToyCar {
    private int metersDriven = 0;
    private int battery = 100;
    public static ElonsToyCar buy(){
        return new ElonsToyCar();
    }

    public String distanceDisplay(){
        return "Driven " + metersDriven + " meters.";
    }

    public String batteryDisplay(){
        if ( battery != 0){
            return "Battery at " + battery + "%";
        }
        return "Battery empty";
    }

    public int drive(){
        if (battery != 0){
            metersDriven += 20;
            battery -= 1;
        }
        return metersDriven;
    }
}
