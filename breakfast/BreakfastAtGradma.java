package breakfast;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Напишите программу Завтрак у бабушки.
// Бабушка жарит блинчик и кладёт его сверху на стопку.
// Внук может скушать только верхний блинчик. В цикле смоделируйте,
// что за одну итерацию бабушка жарит 2 блинчика, а внук съедает только один.
// Когда внук наелся. Цикл заканчивается.
// Количество блинов, которые может съесть внук равно его возрасту.
public class BreakfastAtGradma {
    public static void main(String[] args) {
        int grandsonAge = 5;
        int atePancakes = 0;
        int countPancakes = 0;
        Deque<String> pancakes = new LinkedList<>();
        while (atePancakes < grandsonAge) {
            System.out.print("Grandma fried 2 pancakes ");
            countPancakes++;
            pancakes.offer("Pancake" + countPancakes);
            countPancakes++;
            pancakes.offer("Pancake" + countPancakes);
            System.out.println(pancakes);
            System.out.print("Grandson ate 1 pancake ");
            String atePancakeNum = pancakes.pollLast();
            atePancakes++;
            System.out.println(atePancakeNum);
        }
        System.out.println("Leftover pancakes: " + pancakes);
        System.out.println("Nums of left pancakes: " + pancakes.size());
        System.out.println("Nums of ate pancakes: " + atePancakes);
    }
}
