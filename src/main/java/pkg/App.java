package pkg;

import java.util.Arrays;
import java.util.List;
public class App 
{
    public static void main( String[] args )
    {
    	List <Integer> arr = Arrays.asList(10,4,5,2,5);
    	
        MyListUtil l = new MyListUtil();
        System.out.println("abc");
        l.riordinaDecrescente(arr);
        System.out.println(arr);
        l.riordinaCrescente(arr);
        System.out.println(arr);
    }
}
