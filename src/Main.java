public class Main {
    public static void main(String[] args) {
//First ex
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";

        String fullName = firstName + middleName + lastName;
//Second ex
        String fullNameUpCase = fullName.toUpperCase();
        System.out.println("ФИО сотрудника -" + fullNameUpCase);

        //Exercise 3

        String fullName1 = "Иванов Семен Семенович";
        fullName1 = fullName1.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName1);


    }
}