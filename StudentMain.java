class Student{
    int roll;                               //instance variables
    String name;
    static String college = "IIT K";        //static variables 
    Student(int r, String n){               //constructor
        roll = r;
        name = n;
    }
    void display()
    {
        System.out.println(roll + " " + name + " " + college);
    }
}
class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "DJ");
        Student s2 = new Student(2, "RJ");
        Student s3 = new Student(3, "MJ");
        s1.display();
        s2.display();
        s3.display();
    }
}