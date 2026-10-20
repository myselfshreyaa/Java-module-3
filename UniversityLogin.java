public class UniversityLogin {
    static void login(String username) {
        if (username == null) {
            throw new NullPointerException("Username cannot be null");
        } 
        System.out.println("Login successfull");
    }

    public static void main(String args[]) {
        try {
            login(null);
        }
        catch (NullPointerException e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
