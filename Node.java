public class Node{
 private String data;
 private Node next,prev;
 public Node(String value){
   data = value;
   prev = null;
   next = null;
 }

 public String getData(){
   return data;
 }

 public Node getNext(){
   return next;
 }

 public void setNext(Node next){
   this.next = next;
 }
}
