package Basics;
public class DynamicQueue extends CircularQueue {
    
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

     @Override
     public boolean insert (int item) {
        // this takes care of it being full
        if(this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the previous items in new data
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
                // for circular queue

            }
            front = 0;
            end = data.length;
            data = temp;

            data = temp;

            
        }

        // at this point we know that array is not full, hence:
        // we insert normally from here onwards
        return super.insert(item);
        // tc = O(n)
     }
}
