import java.util.ArrayList;

class Respond {
    int position;
    int value;

    Respond(int p, int v) {
        position = p;
        value = v;
    }
}

public class Main {

//    private int i;
//    private Integer j;
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
//       Main t = new Main();
//       t.go();

        int i = 288;
        Integer iWrap = i;
//    Integer iWrap = Integer.valueOf(i); can wrap it bouth way

        int unWrap = iWrap;
//      int unWrap = iWrap.intValue(); unwrapping back to primitive
        Respond r1 = autoboxing(299);
        System.out.println("Added on position " + r1.position + " value " + r1.value);
        Respond r2 = autoboxing(20);
        System.out.println("Added on position " + r2.position + " value " + r2.value);

        int[] numbers = {30, 23, 43, 45, 78};
        for (int n = 0; n < numbers.length; n++) {
            Respond r = autoboxing(numbers[n]);
            System.out.println("Added on position " + r.position + " value " + r.value);
        }
        System.out.print(list);
    }

    public static Respond autoboxing(int x) {
        list.add(x);
        int position = list.indexOf(x);
        return new Respond(position, x);
    }

//    public void go() {
//        i=j;
//        System.out.print(j);
//        System.out.print(i);
//    }

}