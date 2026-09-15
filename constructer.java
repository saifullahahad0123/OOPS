

public class constructer {
    public static  class Student{
    String name;
    int number;
    int cgpa;

    void print(){
        System.out.println(name + " " + number + " " + cgpa);
    }
   Student(){

   }

    Student(String a, int b , int c){
        name = a;
        number = b;
        cgpa = c;

}
}
    public static void main(String[] args) {
        Student s1 = new Student("saifulllah", 11, 7);
        s1.print();
        s1.name = "momin";
        s1.print();
    }
}
