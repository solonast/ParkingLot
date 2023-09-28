package parkinglotapp;

public class ParkingLot implements IParkingLot {
    @Override
    public double calculatePrice(ITicket ticket) {
        int[] duration = ticket.calculateDuration();

        if( duration[1] > 7){
            return 15 + duration[0]*15;
        } else if (duration[1] == 7 && duration[2] > 0) {
            return 15 + duration[0]*15;
        } else if (duration[1] == 0 && duration[2] <= 30) {
            return  duration[0]*15;
        } else if (duration[2] > 0) {
            return 2 * (duration[1] + 1) +  duration[0]*15;
        } else {
            return 2 * duration[1] + duration[0]*15;
        }
    }
}
