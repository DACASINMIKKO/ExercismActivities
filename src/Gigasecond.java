import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    public LocalDateTime moment;

    public Gigasecond(LocalDateTime moment){
        this.moment = moment;
    }

    public Gigasecond(LocalDate moment){
        this.moment = moment.atTime(0, 0);
    }

    public LocalDateTime getDateTime(){
        return moment.plusSeconds(1000000000);
    }
}
