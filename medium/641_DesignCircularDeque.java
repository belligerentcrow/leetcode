import java.util.Deque;
class MyCircularDeque {
    int max;
    //Deque<Integer> deque = new ArrayDeque<>();
    ArrayDeque<Integer> deque;
    public MyCircularDeque(int k) {
        max = k;
        deque = new ArrayDeque<Integer>(k);
        System.out.println(k);
        
    }
    
    public boolean insertFront(int value) {
        if(deque.size()<max){
            deque.offerFirst(value);
            return true;
        }
        else return false;
    }
    
    public boolean insertLast(int value) {
        if(deque.size()<max){
            deque.offerLast(value);
            return true;
        }
        else return false;
    }
    
    public boolean deleteFront() {
        if(!(deque.isEmpty())){
            deque.removeFirst();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deleteLast() {
        if(!(deque.isEmpty())){
            deque.removeLast();
            return true;
        }else{
            return false;
        }
    }
    
    public int getFront() {
        if(!(deque.isEmpty())){
            return deque.getFirst();
        }else return -1;
    }
    
    public int getRear() {
        if(!(deque.isEmpty())){
            return deque.getLast();
        }else return -1;
    }
    
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    public boolean isFull() {
        return deque.size() == max;
    }
}
