import java.util.Scanner;
public class Remove_Course {
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
        System.out.println("CSE311");
        System.out.println("EEE154");
        System.out.println("Which Courses do you want to add:");
            for (int i = 0; i < Course_list.length; i++) {
                System.out.print(i+1+" . ");
                Course_list[i] = input.nextLine();
            }
            System.out.println("Your selected courses:");
            for (int i = 0; i < Course_list.length; i++) {
                System.out.println(i+1+" . "+Course_list[i]);
            }
            System.out.print("Do you want to drop any course:");
            int y=0;
            y= input.nextInt();
            switch (y) {
                case 1:
                {
                    remove_course(Course_list); 
                    break;
                }
                case 2:
                {
                    System.out.println("Your selected courses:");
                    for (int i = 0; i < Course_list.length; i++) {
                        System.out.println(i+1+" . "+Course_list[i]);
                    }
                    break;
                } 
                default:
                {
                    System.out.println("Something went wrong . Please try again later.");
                    break;
 
                }
                   
            }
            }
            public static void remove_course(String[] course_list) {
                Scanner input = new Scanner(System.in);
                int k = ' ';
                String course = "0";
                System.out.print("Which course do you want to drop:");
                course = input.nextLine();
                for (int i = 0; i < course_list.length; i++) 
                {
                    if (course_list[i].equals(course)) 
                    {
                       k=i; 
                    }

                }
                for (int i = k; i <= k; i++) {
                    course_list[i]=" ";
                    
                }
               
                    System.out.println("Your selected courses:");
                    for (int i = 0; i < course_list.length; i++) {
                        System.out.println(i+1+" . "+course_list[i]);
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

