package Basics;
public class DynamicStack extends CustomStack {
    
    public DynamicStack() {
        super();
        // This will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        // this takes care of it being full
       if (this.isFull()) {
        // double the array size
        int [] temp = new int[data.length * 2];

        // copy all previous items in the new data
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;

       }

       // at this point we know that array is not full 

       // insert item normally
       return super.push(item);

    }



}
