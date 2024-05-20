import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        new Demo().printName(name);
    }

	void printName(String name){
		System.out.println(name);
	}

    public void  display(){
        System.out.println("Project Workshop");
    }
}