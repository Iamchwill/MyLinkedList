public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size = 0;
   start = null;
   end = null;
 }

 public int size(){
  return size;
 }

 public boolean add(String value){
  if(start == null) start = new Node(value);
  else if (end == null){
    end = new Node(value);
    start.setNext(end);
  }
  else{
    Node add = new Node(value);
    end.setNext(add);
    end = add;
  }
  size++;
  return true;
 }
 
 public String toString(){
   Node current = start;
   String out = "";
   out += "[";
   while(size != 0 && current.getNext() != null){
     out += current.getData() + ", ";
     current = current.getNext();
   }
   if(end != null) out += end.getData();
   out += "]";
   return out;
 }
}
