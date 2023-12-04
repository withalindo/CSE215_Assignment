import java.util.Scanner;
public class faculty_login {
  public static void faculty_login() {
    
   
        Scanner input = new Scanner(System.in);
        String[] fac_In = {"SfR1","SfM1","ARa2","MSK1","SNS1"};
        String[] fac_pa = {"SfR1","SfM1","ARa2","MSK1","SNS1"};
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
                System.out.println("Login Successful");
                
            } 
            else if(count==0)
            {
                System.out.println("Incorrect password");
                
            }

        
    }
   public static void main(String[] args) {
       faculty_login();
   }


}
