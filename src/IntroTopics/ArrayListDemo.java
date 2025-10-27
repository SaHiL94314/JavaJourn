package IntroTopics;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();

        //add
        arr1.add("sahil");
        arr1.add("sinha");
        arr1.add("ayush");
        System.out.println(arr1);

        //access
        String str=arr1.get(1);
        System.out.println(str);

        //change
        arr1.set(1,"ayush");
        System.out.println(arr1);

        //erase
        arr1.remove(0);
        System.out.println(arr1);
    }
}
