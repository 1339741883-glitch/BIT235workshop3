public class WelcomeMessage {
    public static void main(String[] args) {
        String name = "Alice";
        String city = "Melbourne";
        
        // Complete the 3 lines of code below
        StringBuffer message = new StringBuffer("Welcome, ");
        message.append(name).append("! We hope you're enjoying your time in ").append(city).append(".");
        
        System.out.println(message);
    }
}
