
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentRecordLL studentList = new StudentRecordLL();
        studentList.insertBeginning(567, "Kanika", 43, 'A');
        studentList.insertLast(571, "Dherya", 21, 'O');
        studentList.display();
        System.out.println();
        studentList.insertAt(545, "khdcacn", 42, 'C', 1);
        studentList.display();

        studentList.updateByRoll(571, 'B');
        System.out.println();
        studentList.display();
        System.out.println();
        studentList.deleteByRoll(545);
        studentList.display();
    }
}