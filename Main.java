import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int speed[] = {12,112,100,13,55};
        int rel[] = {31,4,100,55,50};
        int k = 3;
        System.out.println(maxComputer(speed, rel, k));
    }

    public static int maxComputer(int speed[], int rel[], int k) {
        Obj obj[] = new Obj[speed.length];
        for (int i = 0; i < speed.length; i++) {
            obj[i] = new Obj(speed[i], rel[i]);
        }

        Arrays.sort(obj);
        for(Obj o : obj){
            System.out.println(o.speed + " " + o.rel);
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += obj[i].speed;
            min = Math.min(min, obj[i].rel);
        }
        return sum * min;
    }

    static class Obj implements Comparable<Obj> {
        int speed;
        int rel;

        Obj(int speed, int rel) {
            this.speed = speed;
            this.rel = rel;
        }

        @Override
        public int compareTo(Obj o) {
            return  o.speed-this.speed;
        }
    }
}
