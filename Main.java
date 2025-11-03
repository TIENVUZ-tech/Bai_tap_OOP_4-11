public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "SV001", "a@student.edu.vn");
        Student s2 = new Student("Tran Thi B", "SV002", "b@student.edu.vn");

        Teacher t1 = new Teacher("Vu Van Ha", "GV101", "ha@teacher.edu.vn", "Dr.");
        Advisor a1 = new Advisor("Nguyen Van He", "he@company.com");

        KLTN<Student, Teacher> k1 = new KLTN<>(s1, t1, "Phân tích tấn công mạng");
        KLTN<Student, Advisor> k2 = new KLTN<>(s2, a1, "Hệ thống IoT thông minh");

        ListSortable<KLTN<?, ?>> list = new ListSortable<KLTN<?, ?>>();
        list.add(k1);
        list.add(k2);

        list.print();
    }
}
