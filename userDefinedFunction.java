class Student{
    String name;
    int number;
    double cgpa;
    void print(){
        System.out.print(name+ " " +  number + " " + cgpa );
    }
}
public class userDefinedFunction {
   public static void main(String[] args) {
   Student st = new Student();
   st.name  = "saif";
   st.number = 59;
   st.cgpa = 7.2;
   
   st.print();

    }
}
