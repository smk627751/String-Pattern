import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        int index = 0;
        for(int i = 1; i < input.length(); i++)
        {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
            {
                index = i;
            }
        }
        String arr[] = new String[2];
        arr[0] = input.substring(0,index);
        arr[1] = input.substring(index);
        int index1 = 1, index2 = 1;
        int len = Math.max(arr[0].length(),arr[1].length());
        for(int i = 0; i < len; i++)
        {
            System.out.println(arr[0].substring(0,index1).toUpperCase() + arr[1].substring(0,index2).toUpperCase());
            if(index1 < arr[0].length())
            {
                index1++;
            }
            if(index2 < arr[1].length())
            {
                index2++;
            }
        }
    }
}