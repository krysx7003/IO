public void editRoute(String data) {
    Role role = currentUser.getRole();
    if(role == Role.ITemployee){
        ArrayList<String> dataArray = new ArrayList<String>(Arrays.asList(data.split(",")));
        String operation;
        int lineID,routeID;
        if (dataArray.size() >= 2) {
            operation = dataArray.get(0);
            dataArray.remove(0);
            lineID = Integer.parseInt(dataArray.get(0));
            dataArray.remove(0);
            routeID = Integer.parseInt(dataArray.get(0));
            dataArray.remove(0);
            if(operation == "delete"){
                dataUpdater.deleteRoute(routeID,lineID);
                return;
            }
            Route route = new Route();
            route.parseRoute(dataArray);
            if(operation == "add"){
                dataUpdater.addRoute(route,lineID);
            }else if(operation == "change"){
                dataUpdater.updateRoute(route,lineID,lineID);
            }
        }
    }
}


public class PresenterTest {
    User currentUser

    @Test
    void testEditRoute(){
        when(currentUser.getRole).thenReturn(Role.ItEmployee);



        ArrayList<String> dataArray = new ArrayList<String>("")

    }
}