import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Employer emp1 = new Employer("8964321","Elena", 3);
        Employer emp2 = new Employer("8925487512","Alina", 3);
        Employer emp3 = new Employer("4654845646","Elena", 2);
        Employer emp4 = new Employer("8651213","Katya", 1);
        Employer emp5 = new Employer("46546546","Elena", 3);
        BookEmpolyers book1 = new BookEmpolyers();
        book1.addNewEmpoyer(emp1);
        book1.addNewEmpoyer(emp2);
        book1.addNewEmpoyer(emp3);
        book1.addNewEmpoyer(emp4);
        book1.addNewEmpoyer(emp5);
        System.out.println(book1);
        book1.messageAboutExperience(3);
        book1.messageAboutPhone("Alena");
        book1.messageAboutTabNumber(3);



    }
}