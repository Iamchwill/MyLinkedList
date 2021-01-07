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
      end.setPrev(start);
      start.setNext(end);
    }
    else{
      Node add = new Node(value);
      end.setNext(add);
      add.setPrev(end);
      end = add;
    }
    size++;
    return true;
  }

  public void add(int index, String value){
    if(index > size || index < 0) throw new IndexOutOfBoundsException();
    if(index == size){
      this.add(value);
      size--;
    }
    else if(index == 0){
      Node add = new Node(value);
      add.setNext(start);
      start.setPrev(add);
      start = add;
    }
    else{
      Node add = new Node(value);
      Node previous = start;
      for(int i = 0; i < index - 1; i++){
        previous = previous.getNext();
      }
      Node next = previous.getNext();
      add.setPrev(previous);
      add.setNext(next);
      previous.setNext(add);
      next.setPrev(add);
    }
    size++;
  }
  public String get(int index){
    if(index >= size || index < 0) throw new IndexOutOfBoundsException();
    Node value = start;
    for(int i = 0; i < index; i++){
      value = value.getNext();
    }
    return value.getValue();
  }

  public String set(int index, String value){
    if(index >= size || index < 0) throw new IndexOutOfBoundsException();
    Node search = start;
    for(int i = 0; i < index; i++){
      search = search.getNext();
    }
    String out = search.getValue();
    search.setValue(value);
    return out;
  }

  public String toString(){
    Node current = start;
    String out = "";
    out += "[";
    while(current != null){
      out += current.getValue();
      if(current.getNext() != null) out += ", ";
      current = current.getNext();
    }
    out += "]";
    return out;
  }

  public String toStringReversed(){
    Node current = end;
    String out = "";
    out += "[";
    while(current != null){
      out += current.getValue();
      if(current.getPrev() != null) out += ", ";
      current = current.getPrev();
    }
    out += "]";
    return out;
  }
}
