import java.util.*;
public class compare {

        public static void main(String[] args)
        { Scanner sc=new Scanner(System.in);
            System.out.println("Enter first string");
            String s1=sc.nextLine();
            System.out.println("Enter the second string");
            String s2=sc.nextLine();
            int d=s1.compareTo(s2);
            if (d==0)
                System.out.println(s1+" is equals to "+s2);
            else if(d==-1)
                System.out.println(s1+" ascii value is less "+s2);
            else
                System.out.println(s1+" ascii value is more than "+s2);

        }
    }

