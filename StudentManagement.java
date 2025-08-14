import java.util.ArrayList;
import java.util.Scanner;

class StudentManagement{
    private static ArrayList<Student> students=new ArrayList<>();
    private static Scanner sc=new Scanner(System.in);

    public static void addStudent(){
        System.out.println("Enter Student id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student name");
        String name=sc.nextLine();
        System.out.println("Enter Student grade");
        double grade=sc.nextDouble();
        Student s=new Student(id,name,grade);
        students.add(s);
    }
    public static void removeStudent(){
        System.out.println("Enter student id to remove: ");
        int id=sc.nextInt();
        students.removeIf(s-> s.getId() ==id);
    }
    public static void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No students.");
        }
        else{
            students.forEach(System.out::println);
        }
    }
    public static void main(String[] args){
        while(true){
            System.out.println("\n1.Add  2.Remove 3.Dispaly 4.Exit");
            int ch=sc.nextInt();
            if(ch==1)addStudent();
            if(ch==2)removeStudent();
            if(ch==3)displayStudents();
            else break;

        }

    }

}
