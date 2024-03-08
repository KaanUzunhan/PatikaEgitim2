public class Student {
    String name,stuNo;
    int classes;
    Course sozlu;
    Course fizik;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course sozlu,Course fizik) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.sozlu = sozlu;
        this.fizik = fizik;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int sozlu, int fizik) {

        if (sozlu >= 0 && sozlu  <= 100) {
            this.sozlu.note = sozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }



    }

    public void isPass() {
        if (this.sozlu.note == 0 || this.fizik.note == 0 ) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.80) + (this.sozlu.note*0.20 ) );
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Sözlü Notunuz : " + this.sozlu.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
    }
}
