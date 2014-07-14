public class LRUCache {
    
    class ListNode{
        public int key;
        public int value;
        public ListNode prev;
        public ListNode next;
        public ListNode(int k, int v){
            key = k;
            value = v;
        }
    }
    
    
    private ListNode head;
    private ListNode tail;
    private int capacity;
    private int size;
    private HashMap<Integer, ListNode> map;
    
    public LRUCache(int capacity) {
        head = null;
        tail = null;
        this.capacity = capacity;
        this.size = 0;
        map = new HashMap<Integer, ListNode>();
    }
    

    private void insertHead(ListNode curr){
        curr.next = head;
        curr.prev = null;
        if(head != null)
            head.prev = curr;
        head = curr;
        if(tail == null)
        tail = head;
        size ++;
    }

    private void remove(ListNode curr){
        ListNode prev = curr.prev;
        ListNode next = curr.next;
        if(prev != null){
            prev.next = next;
            curr.prev = null;
        } else
            head = next;
            
        if(next != null){
            next.prev = prev;
            curr.next = null;
        } else
            tail = prev;
        size --;
    }
    
    public int get(int key) {
        if(map.isEmpty() || !map.containsKey(key)){
            return -1;
        }
        ListNode curr = map.get(key);
        remove(curr);
        insertHead(curr);
        return curr.value;
    }
    
    public void set(int key, int value) {
        ListNode curr = new ListNode(key, value);
        if(map.isEmpty() || !map.containsKey(key)){
            if(size == capacity){
                
            	map.remove(tail.key);
                remove(tail);
            }
            insertHead(curr);

            map.put(key,curr);
        } else{
            curr = map.get(key);
            curr.value = value;
            remove(curr);
            insertHead(curr);
        }
    }
    



}