import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.pritnln("Enter your course");
        String name=sc.next();
        String course=sc.next();
        new Demo().printName(name);
        new Demo().printCourse(course);
    }

	void printName(String name){
		System.out.println(name);
	}
}