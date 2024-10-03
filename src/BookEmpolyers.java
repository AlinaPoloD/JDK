import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookEmpolyers {
List<Employer> employers = new ArrayList<>();

public void addNewEmpoyer (Employer employer) {

    employers.add(employer);
}

    @Override
    public String toString() {
        return "Справочник сотрудников:\n" + employers ;
    }


    /*
    * Добавить метод, который ищет сотрудника по стажу
        (может быть список)
    * */
    private List<Employer> findEmployerWithExperience (int year){
        List<Employer> empWithExperience = employers.stream().filter(employer -> employer.getExperience() == year).toList();
        return empWithExperience;

    }
    public void messageAboutExperience(int year){

        if (findEmployerWithExperience(year).isEmpty()) {
            System.out.println("Нет сотрудников с таким опытом");
        }
        else System.out.println("Список сотрудников с опытом " +year +  " лет \n"+ findEmployerWithExperience(year));
    }
    /*● Добавить метод, который возвращает номер телефона
    сотрудника по имени (может быть список)*/
    private List<String> showNumberEmplName (String name){
        List<Employer> listWithName = employers.stream().filter(employer -> employer.getName() == name).toList();
        List<String> phoneNumber= new ArrayList<>();

        for (Employer emp : listWithName) {
           phoneNumber.add(emp.getPhoneNumber());

        }

        return phoneNumber;


    }

    public void messageAboutPhone(String name){

        if (showNumberEmplName(name).isEmpty()) {
            System.out.println("Нет сотрудников с таким именем");
        }
        else System.out.println("Список номеров телефона сотрудников с именем " +name +   "\n"+ showNumberEmplName(name));
    }
    /*● Добавить метод, который ищет сотрудника по
    табельному номеру*/
    private Employer findEmployerWithTabNumber (int tabNumber){
        return employers.stream().filter(employer -> employer.getTabelNumber() == tabNumber).findFirst().orElse(null);


    }

    public void messageAboutTabNumber(int tabNumber){

        if (findEmployerWithTabNumber(tabNumber)==null) {
            System.out.println("Нет сотрудников с таким табельным номером");
        }
        else System.out.println(findEmployerWithTabNumber(tabNumber));
    }






}
