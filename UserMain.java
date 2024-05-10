public class UserMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setEmail("johndoe@example.com")
                .setAddress("123 Main St")
                .setPhone("555-555-5555")
                .setAge(30)
                .build();

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(
