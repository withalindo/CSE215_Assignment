import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.ForegroundAction;
public class Add_Course {
    public static void add_course(String ID) {
        Scanner input = new Scanner(System.in);
        String [] Course_list = new String[5];
        System.out.println("Your offered course list:");
        System.out.println("CSE115");
        System.out.println("CSE215");
        System.out.println("CSE225");
        System.out.println("CSE231");
        System.out.println("CSE299");
        System.out.println("ENG102");
        System.out.println("ENG103");
        System.out.println("BEN205");
        System.out.println("Che101");
        System.out.println("EEE154");
        System.out.println("Which Courses do you want to add:");
            for (int i = 0; i < Course_list.length; i++) {
                
                Course_list[i] = input.nextLine();
            }
            System.out.println("Your selected courses:");
            for (int i = 0; i < Course_list.length; i++) {
                System.out.println(i+1+" . "+Course_list[i]);
            }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id = "0";
        System.out.print("Please enter your id:");
        id =  input.nextLine();
        add_course(id);

    }
    
      
}
