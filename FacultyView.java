
import java.util.Scanner;
//import java.util.jar.Attributes.Name;
public class FacultyView {
    public static void FacultyView(String Name) {  
        Scanner input = new Scanner(System.in);
        int k=0;
        String [] fac_in = {"ARa2","MSK1","SfR1","SfM1","SnS1"};
        String [] fac_course = {"CSE115","CSE173","CSE215","CSE225","CSE299"};
          String [] section = {"1","2","3","4","5"};
        String [] Time = {"11:20 AM - 12:50 PM ST","01:00 PM - 02:30 PM MW","2:40 PM-04:10 PM RA","08:00 AM - 09:30 AM ST","04:20 PM -05:50  PM RA"};
        String [] Room = {"NSC993","SAC311","SAC308","SAC508","SAC606"};
            for (int i = 0; i < fac_in.length; i++) {
                if (fac_in[i].equals(Name)) {
                    k=i;
                    break;
                }
             
            }
                for (int i = k; i <= k; i++) {
                    System.out.println("\n");
                    System.out.println("Faculty name:"+fac_in[i]);
                    System.out.println("Course name:"+fac_course[i]);
                    System.out.println("Section:"+section[i]);
                    System.out.println("Time:"+Time[i]);
                    System.out.println("Room:"+Room[i]);
                    System.out.println("\n\n");
                }
          
        }  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name;
    System.out.print("Please enter the initial of the faculty:");
    name = input.nextLine();
    FacultyView(name);

    
} 
}

