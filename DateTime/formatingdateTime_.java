package DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatingdateTime_ {
    public static void main(String[] args) {
        LocalDateTime myobj = LocalDateTime.now();
        System.out.println("before formating date: " + myobj);
        DateTimeFormatter mydateformating = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");

        String forrmattedDate= myobj.format(mydateformating);
        System.out.println("after formating date: " + forrmattedDate);
    }
    
}
