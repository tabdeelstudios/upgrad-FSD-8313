public class TrainStation {
    String stationName;
    TrainStation next;

    public TrainStation(String stationName){
        this.stationName = stationName;
        this.next = null;
    }
}
