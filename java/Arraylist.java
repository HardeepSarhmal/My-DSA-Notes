import java.util.ArrayList;

public class Arraylist {
    public static void main (String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
       
        System.out.println(list);
        list.get(0);
        System.out.println(list.get(0));

        list.set(1, 7);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.add(1,5);
         list.add(3,8);
         System.out.println(list);
    }
    
}
