public class PutThread implements Runnable {
    Queue q;

    PutThread(Queue queues){
        q = queues;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            q.put(j);
            System.out.println(" Putting Number " + j);
        }
    }
}
