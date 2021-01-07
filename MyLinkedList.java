
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

 public void add(int index, String value){
   if(index > size) throw new IndexOutOfBoundsException();
   if(index == size) this.add(value);
   else if(index == 0){
     Node add = new Node(value);
     add.setNext(start);
     start = add;
   }
   else{
     Node add = new Node(value);
     Node previous = start;
     for(int i = 0; i < index - 1; i++){
       previous = previous.getNext();
     }
     add.setPrev(previous);
     add.setNext(previous.getNext());
     previous.setNext(add);
     previous.getNext().setPrev(add);
   }
   size++;
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
