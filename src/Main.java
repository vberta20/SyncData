public class Main {

    public static void main(String[] args) {
        Queue queues = new Queue();
        GetThread myGetThread = new GetThread(queues);
        PutThread myPutThread = new PutThread(queues);

        Thread getThread = new Thread(myGetThread);
        getThread.start();

        Thread putThread = new Thread(myPutThread);
        putThread.start();


    }


}