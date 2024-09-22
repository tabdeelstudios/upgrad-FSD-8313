public class TrainRoute {
    private TrainStation head;

    public TrainRoute(){
        this.head = null;
    }

    public void addStation(String stationName){
        TrainStation newStation = new TrainStation(stationName);

        if(head == null){
            head = newStation;
        } else {
            TrainStation current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newStation;
        }
        System.out.println("Added station: "+newStation);
    }

    public void removeStation(String stationName){
        if(head == null){
           System.out.println("Route is empty");
           return;
        }

        if(head.stationName.equals(stationName)){
            head=head.next;
            System.out.println("Removed Station: "+stationName);
        }

        TrainStation current = head;
        while(current.next != null && !current.next.stationName.equals(stationName)){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("Station not found: "+stationName);
        } else {
            current.next = current.next.next;
            System.out.println("Removed Station: "+stationName);
        }
    }

    public void displayRoute(){
        if(head==null){
            System.out.println("The route is empty.");
        } else {
            TrainStation current = head;
            System.out.println("Train Route:");
            while(current != null){
                System.out.println("Station: "+current.stationName);
                current = current.next;
            }
        }
    }
}