import java.util.ArrayList;

public class RouteData {
    ArrayList<Integer> busIds = new ArrayList<>();
    ArrayList<Boolean> isActives = new ArrayList<>();
    ArrayList<ArrayList<String>> busStops = new ArrayList<>();
    public RouteData(){
        busIds.add(1);isActives.add(true); busStops.add(new ArrayList<>());busStops.get(0).add("abc");busStops.get(0).add("efg");
        busIds.add(2);isActives.add(true); busStops.add(new ArrayList<>());busStops.get(1).add("efg");busStops.get(1).add("abc");
        busIds.add(3);isActives.add(false);busStops.add(new ArrayList<>());busStops.get(2).add("qwe");busStops.get(2).add("rty");
        busIds.add(4);isActives.add(false);busStops.add(new ArrayList<>());busStops.get(3).add("rty");busStops.get(3).add("qwe");
    }
}
