public class Queue {
    // Fields
    Object[] queue;
    int nextPutLocation;
    int nextGetLocation;
    int amountData;

    // Constructor
    Queue() {
        queue = new Object[100];
        nextPutLocation = 0;
        nextGetLocation = 0;
        amountData = 0;
    }

    // Methods

    Object get() {
        if (amountData == 0) {
            System.out.println("get() failed.  Please put() some");
            return null;
        }


        if (nextGetLocation < 99) {
            nextGetLocation = nextGetLocation + 1;
        } else {
        }
        amountData = amountData - 1;
        return queue[nextGetLocation];

    }

    void put(Object object) {
        if (amountData == 100) {
            System.out.println("put() failed.  Please get() some");
            return;
        }

        queue[nextPutLocation] = object;
        amountData = amountData + 1;
        if (nextPutLocation < 99) {
            nextPutLocation = nextPutLocation + 1;
        } else {
            nextPutLocation = 0;
        }
    }
}