import java.util.*;
import java.util.stream.Stream;

class MaxMoney {



    public static void main(String[] args) {
        List<String> bingopool=new ArrayList<>(75);
        int start=1;
        for(char c: "BINGO".toCharArray()){
            for(int i=start;i<(start+15);i++){
            bingopool.add(""+c+i);
            System.out.println(""+c+i);
            }
            start=start+15;
        }
        System.out.println("\n---------------------------");

        Collections.shuffle(bingopool);
        for(int i=0;i<15;i++){
            System.out.println(bingopool.get(i));
        }
        System.out.println("\n---------------------------");
        List<String> firstones=new ArrayList<>(bingopool.subList(0,15));
          firstones.sort(Comparator.naturalOrder());
        firstones.replaceAll(s->{
            if(s.indexOf("G")==0 || s.indexOf("O")==0){
                String updated=s.charAt(0)+"-"+s.substring(1);
                System.out.println(""+updated);
                return updated;
            }
            return s;
        });
        System.out.println("\n---------------------------");

        for(int i=0;i<15;i++){
            System.out.println(bingopool.get(i));
        }
        System.out.println("\n---------------------------");
        firstones.stream()
                .limit(15)
                .filter(s->s.indexOf("G")==0 || s.indexOf("O")==0)
                .map(s->s.charAt(0)+"-"+s.substring(1))
                .sorted()
                .forEach(s-> System.out.println(s+""));
        String[] alpha={"one","two","three"};
       var f= Arrays.stream(alpha).sorted(Comparator.reverseOrder());//.forEach(System.out::println);
        var s=Stream.of("one","two","three").map(String::toUpperCase);//forEach(System.out::println);
        Stream.concat(f,s).map(n->n.charAt(0)+"-"+n.substring(0)).forEach(System.out::println);


    }

}
