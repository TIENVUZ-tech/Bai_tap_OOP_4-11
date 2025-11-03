public class Teacher extends Person {

    private String ID;
    private String title;

    /**
     * Constructor.
     * @param fullname (ten day du)
     * @param ID (ma so)
     * @param email (email)
     * @param title (chuc danh)
     */
    public Teacher(String fullname, String ID, String email, String title) {
        super(fullname, email);
        this.ID = ID;
        this.title = title;
    }
}