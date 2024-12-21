import java.util.ArrayList;

public class StackWithArrayList {
      static class StackA{
            static ArrayList <Integer> list = new ArrayList<>();

            public boolean isEmpty(){
                  return list.size() == 0;
            }

            public void push(int data){
                  list.add(data);
            }
            public int pop(){
                  if(isEmpty()){
                        return -1;
                  }
                  int top = list.get(list.size()-1);
                  list.remove(list.size()-1);
                  
                  return top;
            }
            public int peek(){
                  if(isEmpty()){
                        return -1;
                  }
                  return list.get(list.size()-1);
            }

            
      }

      public static void main(String[] args) {
            

            StackA obj = new StackA();
            obj.push(1);
            obj.push(2);
            obj.push(3);

            System.out.println(obj.isEmpty());
            
           while (!obj.isEmpty()) {
            // System.out.println(obj.peek());
            // obj.pop();
            System.out.println(obj.pop());
           }

      }
}