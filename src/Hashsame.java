public class Hashsame extends RuntimeException{
    public Hashsame(String message) {
        super(message);
    }

    public String getMessage(String e) {
        System.out.println(e);
        return e;
    }
}
