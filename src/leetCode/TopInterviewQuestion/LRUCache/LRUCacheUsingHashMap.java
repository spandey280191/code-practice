package leetCode.TopInterviewQuestion.LRUCache;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.util.HashMap;
import java.util.Map;

class Node{

    int key;
    int value;
    Node next;
    Node previous;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }

}

public class LRUCacheUsingHashMap {

    private int capacity;
    private Map<Integer,Node> map;
    Node head;
    Node tail;

    LRUCacheUsingHashMap(int capacity){
        this.capacity = capacity;
        map = new HashMap<Integer, Node>();
    }

    public int get(int key){

        if(map.get(key)==null){
            return -1;
        }else{
           Node node =  map.get(key);
           removeNode(node);
           updateHead(node);
           return node.value;
        }
    }

    private void updateHead(Node node){

        if(head==null){
            head=node;
            tail=node;
        }else{
            node.next = head;
            head.previous=node;
            node.previous=null;
            head=node;
        }

    }

    private void removeNode(Node old){

        // only one node
        if(old.previous==null && old.next==null){
            tail=null;
            head=null;
        }else if (old.previous!=null){
            Node node = old.previous;
            node.next=old.next;
            if(old.next!=null){
                old.next.previous = node;
            }else{
                tail=node;
            }

        }else{
            head = old.next;
        }

    }

    void put(int key, int value){

        if(!map.containsKey(key) && map.size()==capacity){
            // remove entry from Map as well
            map.remove(tail.key);
            // remove oldest node, it will be from tail
            removeNode(tail);

        }

        if(map.containsKey(key)){
            // if node exist remove and add it to first position
            Node node = map.get(key);
            node.value=value;
            map.put(key,node);
            removeNode(node);
            updateHead(node);
        }else{
            // else add new node to first position
            Node newNode = new Node(key,value);
            map.put(key,newNode);
            updateHead(newNode);
        }


    }


    public static void main(String args[]){

      /*  LRUCacheUsingHashMap lruCache = new LRUCacheUsingHashMap(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));*/

/*        LRUCacheUsingHashMap lruCache = new LRUCacheUsingHashMap(2);
        lruCache.put(2,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(2));
        lruCache.put(1,1);
        lruCache.put(4,1);
        System.out.println(lruCache.get(2));*/


        LRUCacheUsingHashMap lruCache = new LRUCacheUsingHashMap(10);

        String[] keys = {"put","put","put","put","put","get","put","get","get","put","get","put","put","put","get","put","get","get","get","get","put","put","get","get","get","put","put","get","put","get","put","get","get","get","put","put","put","get","put","get","get","put","put","get","put","put","put","put","get","put","put","get","put","put","get","put","put","put","put","put","get","put","put","get","put","get","get","get","put","get","get","put","put","put","put","get","put","put","put","put","get","get","get","put","put","put","get","put","put","put","get","put","put","put","get","get","get","put","put","put","put","get","put","put","put","put","put","put","put"};

        int[][] arr = {{10,13},{3,17},{6,11},{10,5},{9,10},{13},{2,19},{2},{3},{5,25},{8},{9,22},{5,5},{1,30},{11},{9,12},{7},{5},{8},{9},{4,30},{9,3},{9},{10},{10},{6,14},{3,1},{3},{10,11},{8},{2,14},{1},{5},{4},{11,4},{12,24},{5,18},{13},{7,23},{8},{12},{3,27},{2,12},{5},{2,9},{13,4},{8,18},{1,7},{6},{9,29},{8,21},{5},{6,30},{1,12},{10},{4,15},{7,22},{11,26},{8,17},{9,29},{5},{3,4},{11,30},{12},{4,29},{3},{9},{6},{3,4},{1},{10},{3,29},{10,28},{1,20},{11,13},{3},{3,12},{3,8},{10,9},{3,26},{8},{7},{5},{13,17},{2,27},{11,15},{12},{9,19},{2,15},{3,16},{1},{12,17},{9,1},{6,19},{4},{5},{5},{8,1},{11,7},{5,2},{9,28},{1},{2,2},{7,4},{4,22},{7,24},{9,26},{13,28},{11,26}};
        int i=0,j=0;
        for(String key : keys){

            if(key.equals("put")){
                lruCache.put(arr[i][0],arr[i][1]);
                System.out.print(null + ",");
                i++;
            }
            if(key.equals("get")){
                int r = lruCache.get(arr[i][0]);
                System.out.print(r + ",");
                i++;
            }



        }


    }

}
