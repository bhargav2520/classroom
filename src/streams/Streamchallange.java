package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Streamchallange {
    public static  void main(String args[]){
    ArrayList<String> val=new ArrayList<>();
    int start=1;
        for(char c: "BINGO".toCharArray()) {
            for( int i=start;i<start+15;i++) {

                val.add("" + c + i);
            }

            start=start+15;
        }
        val.stream().limit(15).map(s->s.charAt(0)+"-"+s.substring(1))
                .forEach(System.out::println);
        int seed=16;
        var streamb= Stream.iterate(seed,i->i<=30,i->i+1).map(i->"I"+"-"+i);
        streamb.forEach(System.out::println);
         seed=31;
        var streama=Stream.iterate(seed,i->i+1).limit(15).map(i->"N"+"-"+i);
        streama.forEach(System.out::println);
        seed=46;
        int nseed=46;
        String [] ones=new String[15];
        int finalSeed = seed;
        Arrays.setAll(ones, i->"G"+"-"+(i+ finalSeed));
        var nan=Stream.of(ones);
        nan.forEach(System.out::println);



        }


    }

