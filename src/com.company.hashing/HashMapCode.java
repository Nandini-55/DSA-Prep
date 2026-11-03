import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> { // K and V are two variables which can have any data types - known as generics -
                                 // / K is for key's data type and V is for value's data type
                                 // notice that these are in angular brackets
        private class Node {// sub class which creates a node stored in hashmap
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - Number of nodes
        private int N;// N- buckets.length
        private LinkedList<Node> buckets[]; // bucket

        @SuppressWarnings("unchecked") // avoid warning for line 21-Type safety: The expression of type LinkedList[]
                                       // needs unchecked conversion to conform to
                                       // LinkedList<HashMapCode.HashMap<K,V>.Node>[]

        public HashMap() {// constructor
            this.N = 4;// size of each bucket - max no. of node a bucket can have
            this.buckets = new LinkedList[4];// as the datatype of linkedlist is not defined , it throws warrnings which
                                             // is
                                             // avoided by 18 line - unchecked type warrning - that you haven't check
                                             // the datatype of data stored in linkedlist

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();// create empty linked list on each index of buckets // if not
                                                     // create them , then each time while inserting an node we have to
                                                     // check first that is there a linkedlist exist or not to insert
                                                     // node in it
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();// returns integer hash code for key
            return Math.abs(hc) % N;// returns reminder which lies b/w 0 to 3 as size is 4

        }

        private int searchInLL(K key, int bi) {// bucket index defines at which bucket data needs to be inserted or
                                               // searched
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")//to avoid warning while creating new hashmap's linkedlists
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N *= 2;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // node -> add in bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {// O(lambda) -> lambda is constant = O(1)
            // step 1 - get the bucket index of the key
            int bi = hashFunction(key);

            // step 2 - get the node's address(data index),at which point of linkedlist node
            // is added
            int di = searchInLL(key, bi);// returns valid index if key already exists and return -1 if not
            if (di != -1) {// key exists in bi bucket
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;// total no. of nodes
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {// 2.0 - threshhold
                rehash();
            }
        }

        public boolean containsKey(K key) {// O(1)
            int bi = hashFunction(key);

            int di = searchInLL(key, bi);
            if (di != -1) {// key present and index is valid
                return true;
            }
            return false;
        }

        public V remove(K key) {// O(1)
            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }

            return null;
        }

        public V get(K key) {// O(1)
            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            }

            return null;
        }

        public ArrayList<K> keySet() {// returns set of all keys
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        hm.remove("US");

        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("China"));
    }
}
