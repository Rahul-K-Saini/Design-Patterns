public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("Rahul", "Saini")
                .age(25)
                .phone("9876543210")
                .address("Saharanpur, UP")
                .email("rahul@example.com")
                .newsletter(true)
                .build();

        System.out.println(user);
    }
}
