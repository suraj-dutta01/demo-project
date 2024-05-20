import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.pritnln("Enter your course");
        String name=sc.next();
        String course=sc.next();
        System.out.pritnln("Enter your age");
        String age=sc.nextInt();
        new Demo().printName(name);
        new Demo().printCourse(course);
        new Demo().printAge(age);
    }

	void printName(String name){
		System.out.println(name);
	}
    void printAge(int age){
		System.out.println(age);
	}
    void printCourse(String course){
		System.out.println(course);
	}
}
