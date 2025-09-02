package Unit1;//public class Student {
//    int roll_no;
//    String name;
//    Student(){
//        System.out.println("I am default Const");
//    }
//    Student(int r,String n){
//        roll_no=r;
//        name=n;
//    }
//    public void display(){
//        System.out.println("Roll No "+roll_no);
//        System.out.println("Name is "+name);
//    }
//
//}


public class Student{
    private String grade;
    public int roll_no;
    public String name;

    public Student(int roll_no, String name, String grade) {
        this.roll_no = roll_no;
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}