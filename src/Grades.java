public class Grades {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.firstName = "Jan";
        student1.lastName = "Kowalski";
        student1.gender = 'M';
        student1.mathGrade = 4.5;
        student1.infGrade = 2d;
        student1.phisicsGrade = 3d;

        student2.firstName = "Maria";
        student2.lastName = "Nowak";
        student2.gender = 'K';
        student2.mathGrade = 6d;
        student2.infGrade = 3d;
        student2.phisicsGrade = 4.5d;

        student3.firstName = "Paweł";
        student3.lastName = "Wasilewski";
        student3.gender = 'M';
        student3.mathGrade = 3.5;
        student3.infGrade = 2.5;
        student3.phisicsGrade = 5d;

        System.out.println("Srednia ocen ucznia: " + student1.firstName + " " + student1.lastName + " wynosi: " + (student1.mathGrade + student1.infGrade + student1.phisicsGrade )/3);
        System.out.println("Srednia ocen ucznia: " + student2.firstName + " " + student2.lastName + " wynosi: " + (student2.mathGrade + student2.infGrade + student2.phisicsGrade )/3);
        System.out.println("Srednia ocen ucznia: " + student3.firstName + " " + student3.lastName + " wynosi: " + (student3.mathGrade + student3.infGrade + student3.phisicsGrade )/3);

        System.out.println("Srednia ocen z matematyki wynosi: " + (student1.mathGrade+student2.mathGrade+student3.mathGrade)/3);
        System.out.println("Srednia ocen z fizyki wynosi: " + (student1.phisicsGrade+student2.phisicsGrade+student3.phisicsGrade)/3);
        System.out.println("Srednia ocen z informatyki wynosi: " + (student1.infGrade+student2.infGrade+student3.infGrade)/3);
    }
}
