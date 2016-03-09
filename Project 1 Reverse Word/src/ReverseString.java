import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.File;


public class ReverseString {
 
        private static Scanner sc;

		public static void main(String[] args) throws Exception {
        	sc = new Scanner(new File("input.txt"));
        	int i=0;
            while(sc.hasNextLine()){
            	String orginialString = sc.nextLine();
                StringTokenizer st = new StringTokenizer(orginialString, " ");
                String reverse = "";
                
                while(st.hasMoreTokens()){
                	reverse = st.nextToken() + " " + reverse;
                }
                i++;
                System.out.println("Case #"+ i +": " +reverse);
            }
        }
}
