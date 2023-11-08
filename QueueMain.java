public class QueueMain {
    public static void main(String[] args) throws Exception {
//         CustomQueue queue = new CustomQueue(5);

//         queue.insert(3);                
//         queue.insert(6);
//         queue.insert(5);
//         queue.insert(19);
//         queue.insert(11);

//         queue.display();

//         System.out.println();

//         System.out.println(queue.remove());
// // O(n)
//         queue.display();

//     }

        CircularQueue queue = new CircularQueue(5);

                queue.insert(3);                
                queue.insert(6);
                queue.insert(5);
                queue.insert(19);
                queue.insert(11);

                queue.display();

    
                System.out.println();
                System.out.println(queue.remove());
                 queue.insert(133);
        // tc O(1)
                queue.display();

                System.out.println();
                System.out.println(queue.remove());
                 queue.insert(99);
        // tc O(1)

        
                queue.display();
                // tc = O(n)

        }
}
