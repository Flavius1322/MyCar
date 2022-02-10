import java.lang.reflect.Type;
import java.net.Proxy;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) { Scanner sc = new Scanner(System.in);

        MyCar myCar1= new MyCar("Mercedes");

        Model m1=new Model("C-Class",30000);
        Model m2=new Model("E-Class",50000);
        Model m3=new Model("S-Class",90000);

        System.out.println("Welocome to MercedesBenz\n");
        Client client=new Client();

        System.out.println("Enter your name");
        String Name=sc.next();
        client.setName(Name);
        System.out.println("First name");
        String First_name = sc.next();
        client.setFirst_name(First_name);




        if(Name != "exit"){
            Model model= new Model();
            int choice = 0;
            System.out.println("We have the following models");
            System.out.println("1.C-Class\n2.E-Class\n3.S-Class");
            String models=sc.next();
            if(choice ==1){
                System.out.println("You have chosen C-Class");
                String type= sc.next();
                model.setType(type);

            }
            if(choice ==2){
                System.out.println("You have chosen E-Class");
                String type= sc.next();
                model.setType(type);

            }
            if(choice ==3){
                System.out.println("You have chosen S-Class");
                String type= sc.next();
                model.setType(type);
            }
            
            System.out.println(Name);
            System.out.println(First_name);
            System.out.println(Type);
        }




    }
}
