package nightClub;

import java.util.*;
import java.util.Queue;
import java.util.Random;
//Создайте программу Вышибала, которая обслуживает посетителей в
//порядке их прихода в ночной клуб.
//Если посетителю меньше 21 года, то в клуб его не пустят.

public class NightClub {
    public static void main(String[] args) {
        Queue<Integer> queueVisitors = new LinkedList<>();
        List<Integer> listVisitors = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            queueVisitors.offer(rnd.nextInt(20) + 16);
        }
        System.out.println(queueVisitors);
        for (int el : queueVisitors) {
            if (el > 21) {
                System.out.println("Next visitor: " + el);
                listVisitors.add(el);
            } else System.out.println("Your age less than 21, no entry");

        }
        System.out.println("Club visitors: " + listVisitors);
    }

}
