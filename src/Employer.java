public class Employer {

    private static int countTabelNumber = 0;
    private int tabelNumber;
    private  String phoneNumber;
    private  String name;
    private  int experience;


    public Employer(String phoneNumber, String name, int experience) {
        this.tabelNumber = ++countTabelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник с " +
                "табельным номером=" + tabelNumber +
                " номер телефона ='" + phoneNumber + '\'' +
                " имя " + name + '\'' +
                " стаж работы лет = " + experience + "\n ";
    }

    public int getExperience() {
        return experience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }
}
