package streams;

import java.util.stream.IntStream;

public class intermediateoperatons {
    public static  void main(String args[]) {
        var lepyear=IntStream.iterate(2000,i->i<=2025,i->i+1).filter(i->i%4==0).summaryStatistics();
        System.out.println(lepyear);

    }
    }
