import java.util.Scanner;
public class Student_Sign_in {
    public static void student_login() {
    
   
        Scanner input = new Scanner(System.in);
        String[] stu_Id = {"2211275042","2212104642","2211138642","2211060648","213184642"};
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
                System.out.println("1. Add Course");
                System.out.println("2. Remove a Couse");
                System.out.println("Please tell us what you want to do:");
                int choice = 0;
                
                
            } 
            else if(count==0)
            {
                System.out.println("Incorrect password");
                
            }

        
    }
   public static void main(String[] args) {
    student_login();
   }


}

    

