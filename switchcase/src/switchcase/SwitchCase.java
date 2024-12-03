
package switchcase;
import java.util.Scanner;

class  Demo{
    int a;
    void display(){
        System.out.println("This is zero");
    }
    void info(){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch(a){
            case 0:
                display();
                break;
              
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Enter valid input");
        
        }
    }
    
}
public class SwitchCase {
  
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.info();
    }
}

