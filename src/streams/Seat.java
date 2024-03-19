package streams;

import java.util.Random;

public record Seat(char rowmaker, int seatnumber, boolean isreserved) {
    public Seat(char rowmaker, int seatnumber) {
       this(rowmaker,seatnumber,new Random().nextBoolean());
    }
}
