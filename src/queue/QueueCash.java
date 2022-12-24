package queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;


public class QueueCash {

    public static final List<String> NAMES = List.of(
            "Петр Петров",
            "Иван Иванов",
            "Алексей Алексеев",
            "Александр Александров",
            "Михаил Михайлов",
            "Мария Петрова",
            "Анна Иванова",
            "Ольга Алексеева",
            "Наталья Александрова",
            "Марина Михайлова"
    );
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFill(queue1);
        randomFill(queue2);

        System.out.println("первая очередь" + queue1);
        System.out.println("вторая очередь" + queue2 + "\n");

        add("Евгений Савушкин", queue1, queue2);

        System.out.println("первая очередь" + queue1);
        System.out.println("вторая очередь" + queue2 + "\n");

        remove(queue1, queue2);

        System.out.println("первая очередь" + queue1);
        System.out.println("вторая очередь" + queue2 + "\n");
    }

    private static void add(String name,
                            Queue<String> queue1,
                            Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю");
            return;
        }

        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }

    private static void remove(Queue<String> queue1,
                               Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void randomFill(Queue<String> queue) {

        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

        }
    }
}