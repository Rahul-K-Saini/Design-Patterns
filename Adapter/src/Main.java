import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Adapter Pattern
         so we had a Required Method declared in a required interface,
         we had an existing class that had a useful method that could do what the required method
         needed to do,
         we created a new class that extends the existing class and implements the required interface,
         and in the required method we called the useful method of the existing class,
         and now we can use the new class wherever the required interface is needed
         */
        NewClass newClass = new NewClass();
        newClass.requiredMethod();
    }
}
