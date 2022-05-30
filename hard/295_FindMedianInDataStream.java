class MedianFinder {
     PriorityQueue<Integer> left;
     PriorityQueue<Integer> right;

    /** initialize your data structure here. */
    public MedianFinder() {
         left = new PriorityQueue<>(Collections.reverseOrder()); //max priority Q
         right = new PriorityQueue<>(); //min priority Q

    }
    
    public void addNum(int val) {
           if(right.size() > 0 && val > right.peek()){
            right.add(val);
          }else{
              left.add(val);
          }
            //balancing elements in both priority q logic
        
          if(right.size() - left.size() == 2){  //right has more elements
              left.add(right.remove());
          }else if(left.size() - right.size() == 2){
              right.add(left.remove());
          }

    }
    
    public double findMedian() {
        if(left.size() == right.size()){
              return ((double)left.peek() + (double)right.peek()) / 2;
          }else if(left.size() > right.size()){
            return (double)left.peek();
        }else{                                //right.size() > left.size();
              return (double)right.peek();
          }
    }
}

/**
 We want that either size of left and right priority Q is same if yes then median is
 (leftpeek + rightpeek) /2 because left priority Q stores max element and right
 priorityQ stores min element , so these peeks contains 2 adjacent elements required
 for even size median.
 
 if size is odd then one priority q will have extra element , one has n elements and other has n + 1 element , so median will be  from peek of  (n + 1 Size) priority Q's.
 
 We don't want difference of size more than one . so if difference of size becomes 2 we have to balance it , then only we can get our median.
 */
