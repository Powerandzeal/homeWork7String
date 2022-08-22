public class Main {
    public static void main(String[] args) {
//First ex
        {
            String firstName = "Ivan ";
            String middleName = "Ivanovich ";
            String lastName = "Ivanov ";

            String fullName = lastName + firstName + middleName;
//Second ex
            String fullNameUpCase = fullName.toUpperCase();
            System.out.println("ФИО сотрудника -" + fullNameUpCase);
        }

        //Exercise 3

        String fullName = "Иванов Семен Семенович";
        fullName = fullName.replace('ё', 'е');

        String [] s2 = fullName.split(" ");
        for (String element : s2)
        {System.out.println(element);
        }




    }
}