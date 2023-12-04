import java.util.Scanner;

//import javax.print.DocFlavor.STRING;
public class Fac_win {
    public static void Fac_Window(String Name){
      Scanner input = new Scanner(System.in);
      int k=0;
      String [] fac_in = {"ARa2","MSK1","SfR1","SfM1","SnS1"};
      String [] st_name_1 = {"Ishika","Meraj","Neam","Nuriva","Abyaj"};
      String [] st_name_2 = {"Ishan","Matab","Rayyan","Ayon","Nibir"};
      String [] st_name_3 = {"Rian","Parisa","Pritom","Alindo","Shaan"};
      String [] st_name_4 = {"Real","Abrar","Akib","Sayed","Ivy"};      
      String [] st_name_5 = {"Nishan","Juboraj","Talha","Meher","Soniya"};
     /*System.out.println("Please enter the initial of the faculty:");
      Name = input.nextLine();*/

      for (int i = 0; i < fac_in.length; i++) {
        if (fac_in[i].equals(Name)) {
           k=i;  
        }
 
      }
      System.out.println("Students of your section:");
      for (int i = k; i <= k; i++) {
        System.out.println(st_name_1 [i]);
        System.out.println(st_name_2 [i]);
        System.out.println(st_name_3 [i]);
        System.out.println(st_name_4 [i]);
        System.out.println(st_name_5 [i]);
      }

        
        
    }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name;
      System.out.print("Please enter the initial of the faculty:");
      name = input.nextLine();
      Fac_Window(name);

        
    }
}
