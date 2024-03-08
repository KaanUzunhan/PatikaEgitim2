public class Main {
    public static void main(String[] args) {

        Course sozlu = new Course("Sözlü", "Söz101", "Söz");
        Course fizik = new Course("Fizik", "FZK101", "FZK");


        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        sozlu.addTeacher(t1);
        fizik.addTeacher(t2);


        Student s1 = new Student("İnek Şaban", 4, "140144015", sozlu, fizik);
        s1.addBulkExamNote(100,20);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", sozlu, fizik );
        s2.addBulkExamNote(100,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", sozlu, fizik);
        s3.addBulkExamNote(50,20);
        s3.isPass();

    }
}
