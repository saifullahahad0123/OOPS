public class polymorphism{
    public static class dog{
        void speak(){
            System.out.println("wonwon");
        }
    }
      public static class cat{
        void speak(){
            System.out.println("mammam");
        }
    }

    public static void main(String[] args) {
        dog a = new dog();
        cat b = new cat();
        a.speak();
        b.speak();
        
    }
}