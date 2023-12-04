import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        login();

       
    }
    public static void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tWelcome to RDS");
        System.out.println("Who are you?");
        System.out.println("1.Faculy");
        System.out.println("2.Student");
        int op;
       System.out.print("Please tell us who are you:");
    
        op = input.nextInt();
        switch (op) {
            case 1:
            {
                System.out.print("\n\nOkey you are a faculty\n");
                faculty_login() ;
                break;
               
            }
            case 2:
            {
                System.out.print("\n\nOkey you are a Student\n");
                student_login(); 
                break;
            }
                
               
        
            default:
            {
                System.out.println("Something went wrong\nPlease try again later.");
                break;
            }
               
        }
        
    }
    public static void faculty_login() {
    
   
        Scanner input = new Scanner(System.in);
        String[] fac_id = {"4201","4202","4203","4204","4205"};
        String[] fac_In = {"ARa2","MSK1","SfR1","SfM1","SnS1"};
        String[] fac_pa = {"NSU4201","NSU4202","NSU4203","NSU4204","NSU4205"};
        int k=0;
        int flag=0;
        int count=0;

        String NAME="0";
        String pass="0";
        System.out.print("Please enter your intial:");
        NAME = input.nextLine();
       
        for (int i = 0; i < fac_In.length; i++) {
            if (NAME.equals(fac_In[i])) 
            {
               k=i;
               System.out.println("Initial found.");
               flag++;
            }
        }
            if (flag==1) 
            {
             System.out.print("Please enter the NSU password:");   
             pass = input.nextLine() ;
            }
             else if(flag==0)
            {
               System.out.println("Please enter the valid initial"); 
            
            }
            for (int i = k; i <= k; i++) {
                if (pass.equals(fac_pa[k])) 
                {
                   count++; 
                }
            }
            if (count==1) 
            {
                System.out.println("Log-in Successful");
                FacultyView( NAME);
                Fac_Window(NAME);
                
                
            } 
            else if(count==0)
            {
                System.out.println("Incorrect password");
                
            }

        
    }


    public static void FacultyView(String Name) {  
        Scanner input = new Scanner(System.in);
        int k=0;
        String [] fac_in = {"ARa2","MSK1","SfR1","SfM1","SnS1"};
        String [] fac_course = {"CSE115","CSE173","CSE215","CSE225","CSE299"};
          String [] section = {"1","2","3","4","5"};
        String [] Time = {"11:20 AM - 12:50 PM ST","01:00 PM - 02:30 PM MW","02:40 PM-04:10 PM RA","08:00 AM - 09:30 AM ST","04:20 PM -05:50  PM RA"};
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
                    System.out.println("\n");
                }
          
        }   

        public static void Fac_Window(String Name){
            Scanner input = new Scanner(System.in);
            int k=0;
            String [] fac_in = {"ARa2","MSK1","SfR1","SfM1","SnS1"};
            String [] st_name_1 = {"Ishika","Meraj","Neam","Nuriva","Abyaj"};
            String [] st_name_2 = {"Ishan","Matab","Rayyan","Ivy","Nibir"};
            String [] st_name_3 = {"Rian","Parisa","Pritom","Alindo","Shaan"};
            String [] st_name_4 = {"Real","Abrar","ak8ib","Sayed","Ayon"};      
            String [] st_name_5 = {"Nishan","Juboraj","Talha","Meher","Soniya"};
          
      
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
          public static void student_login() {
    
   
            Scanner input = new Scanner(System.in);
            String[] stu_Id = {"2211275042","2212104642","2211138642","2211060642","2131814642"};
            String[] stu_pa = {"Alindo","Easha","Sayed","Ivy","Nuriva"};
            int k=0;
            int flag=0;
            int count=0;
    
            String Id="0";
            String pass="0";
            System.out.print("Please enter NSU id:");
            Id = input.nextLine();
           
            for (int i = 0; i < stu_Id.length; i++) {
                if (Id.equals(stu_Id[i])) 
                {
                   k=i;
                   System.out.println("Id found.");
                   flag++;
                }
            }
                if (flag==1) 
                {
                 System.out.print("Please enter the password:");   
                 pass = input.nextLine() ;
                }
                 else if(flag==0)
                {
                   System.out.println("Please enter the valid id"); 
                
                }
                for (int i = k; i <= k; i++) {
                    if (pass.equals(stu_pa[k])) 
                    {
                       count++; 
                    }
                }
                if (count==1) 
                {
                    System.out.println("Log-in Successful");
                    System.out.println("1. Add a Course");
                    
                    System.out.print("Please tell us what you want to do:");
                    int choice = 0;
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                        {
                            System.out.println("\n");
                            add_course(Id);
                            break;
                        }
                       
                            
                          
                    
                        default:
                        {
                            System.out.println("Somethinf went wrong . Please try again later.");
                            break;
                        }
                            
                    }                    
                    
                } 
                else if(count==0)
                {
                    System.out.println("Incorrect password");
                    
                }
    
            
        }
        public static void add_course(String ID) {
            Scanner input = new Scanner(System.in);
            String [] Course_list = new String[5];
            System.out.println("Your offered course list:");
            System.out.println("CSE115");
            System.out.println("CSE173");
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
                    int k = -1;
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
                    int indx = 1;
                    System.out.println("Your courses: ");
                    for(int i = 0 ;i<course_list.length;i++) {
                        if(i != k){
                            System.out.print(indx++ + " - "+course_list[i]+"\n");
                        }
                        
                    }   
                    }



    
    
}