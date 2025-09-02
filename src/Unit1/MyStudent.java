package Unit1;

public class MyStudent {
    public static void main(String[] args) {
        Student st=new Student(12,"Gaurav","A");
        System.out.println(st.name);
        System.out.println(st.roll_no);
        System.out.println(st.getGrade());
    }
}
