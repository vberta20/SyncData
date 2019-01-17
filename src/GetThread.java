public class GetThread implements Runnable {
    Queue q;

    GetThread(Queue queues){
        q = queues;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            Object numb = q.get();
            System.out.println(" Getting Number " + numb);
        }
    }

}

