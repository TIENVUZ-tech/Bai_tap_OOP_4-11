public class Student extends Person {

    private String ID;

    /**
     * Constructor.
     * @param fullname (ten day du)
     * @param ID (ma so)
     * @param email (email)
     */
    public Student(String fullname, String ID, String email) {
        super(fullname, email);
        this.ID = ID;
    }
}