public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<T, V>> {
    private T student;
    private V leader;
    private String thesisTitle;

    /**
     * Constructor.
     * @param student (sinh vien)
     * @param leader (nguoi huong dan)
     * @param thesisTitle (de tai)
     */
    public KLTN(T student, V leader, String thesisTitle) {
        this.student = student;
        this.leader = leader;
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return this.thesisTitle;
    }

    public int compareTo(KLTN<T, V> other) {
        return this.thesisTitle.compareTo(other.thesisTitle);
    }

    public String toString() {
        return this.thesisTitle;
    }
}
