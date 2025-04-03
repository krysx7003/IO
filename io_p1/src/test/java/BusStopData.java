import java.time.LocalDateTime;
import java.util.ArrayList;

public class BusStopData {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> localizations = new ArrayList<>();
    ArrayList<LocalDateTime> times = new ArrayList<>();
    public BusStopData(){
        names.add("abc");localizations.add(1); times.add(LocalDateTime.parse("2025-01-16T13:45:30"));
        names.add("efg");localizations.add(3); times.add(LocalDateTime.parse("2023-12-10T18:35:50"));
        names.add("qwe");localizations.add(5);times.add(LocalDateTime.parse("2022-07-30T05:55:45"));
        names.add("rty");localizations.add(7);times.add(LocalDateTime.parse("2028-04-18T09:12:45"));
    }
}
