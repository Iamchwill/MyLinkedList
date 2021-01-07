public class Node{
 private String data;
 private Node next,prev;
 public Node(String value){
   data = value;
   prev = null;
   next = null;
 }
 public String getValue(){
   return data;
 }

 public void setValue(String value){
   data = value;
 }

 public Node getNext(){
   return next;
 }

 public void setNext(Node next){
   this.next = next;
 }

 public Node getPrev(){
   return prev;
 }

 public void setPrev(Node prev){
   this.prev = prev;
 }
}
