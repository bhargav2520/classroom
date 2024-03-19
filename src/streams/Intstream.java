package streams;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Intstream {
    public static  void main(String args[]) {
    IntStream.iterate(65,i->i<=122,i->i+1).filter(c->Character.isAlphabetic(c)).
            filter(i->Character.toUpperCase(i)>'E').
            forEach(d-> System.out.printf("%c",d));
        

    Seat[] seats=new Seat[100];
        Arrays.setAll(seats,i->new Seat((char)('A'+i/10),i%10+1));
        Arrays.asList(seats).forEach(System.out::println);

    }
    }
