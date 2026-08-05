package LeetCodeAll.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q_104_Peeking_Iterator {
    public static void main(String[] args) {
         List<Integer> list1 = Arrays.asList(1, 2, 3);
        PeekingIterator it1 = new PeekingIterator(list1.iterator());
        System.out.println("Iterator over [1, 2, 3]:");
        System.out.println("peek()    → " + it1.peek()); // 1
        System.out.println("peek()    → " + it1.peek()); // 1
        System.out.println("next()    → " + it1.next()); // 1
        System.out.println("peek()    → " + it1.peek()); // 2
        System.out.println("next()    → " + it1.next()); // 2
        System.out.println("next()    → " + it1.next()); // 3
        System.out.println("hasNext() → " + it1.hasNext()); // false

        System.out.println();
        List<Integer> list2 = Arrays.asList(42);
        PeekingIterator it2 = new PeekingIterator(list2.iterator());
        System.out.println("Iterator over [42]:");
        System.out.println("hasNext() → " + it2.hasNext()); // true
        System.out.println("peek()    → " + it2.peek());    // 42
        System.out.println("next()    → " + it2.next());    // 42
        System.out.println("hasNext() → " + it2.hasNext()); // false

        System.out.println();
        List<Integer> list3 = Arrays.asList(10, 20, 30);
        PeekingIterator it3 = new PeekingIterator(list3.iterator());
        System.out.println("Iterator over [10, 20, 30] — next only:");
        System.out.println("next()    → " + it3.next()); // 10
        System.out.println("next()    → " + it3.next()); // 20
        System.out.println("next()    → " + it3.next()); // 30
        System.out.println("hasNext() → " + it3.hasNext()); // false 
    }

    public static class PeekingIterator implements Iterator<Integer>{
        private final Iterator<Integer> iterator;
        private Integer cache;
        private boolean hasCache;

        public PeekingIterator(Iterator<Integer> iterator){
            this.iterator=iterator;
            if(iterator.hasNext()){
                cache=iterator.next();
                    hasCache=true;
                
            }
        }
        public Integer peek(){
            return cache;
        }

        @Override
        public Integer next(){
            Integer val=cache;
            if(iterator.hasNext()){
                cache=iterator.next();
            }else{
                cache=null;
                hasCache=false;
            }
            return val;
        }
        @Override
        public boolean hasNext(){
            return hasCache;
        }

    }

}
