package leetCode.MonthlyChallenge.PeekingIterator;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator ;
    Integer nextVal=null;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator=iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(nextVal==null && hasNext()){
            nextVal=next();
            return nextVal;
        }
        return nextVal;
    }

    @Override
    public boolean hasNext() {
        if(nextVal!=null){
            return true;
        }
        return iterator.hasNext();
    }

    @Override
    public Integer next() {
        if(nextVal!=null){
            int temp=nextVal;
            nextVal=null;
            return temp;
        }
        return iterator.next();
    }
}