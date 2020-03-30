import java.util.concurrent.ExecutionException;

public class LabOne
{
    public static void main( String[] args )
    {
        try {
            Person person = new Person("PersonOne");
            Employee personEmployee = new Employee("PersonEmployee", "Bank");
            Client personClient = new Client("PersonClient", "Bank");
            personEmployee.toService();
            System.out.println();

            Employee personHighLevelEmployee = new HighLevelEmployee( new Employee() ); //Пример декоратора
            personHighLevelEmployee.toService();
            System.out.println();

            Factory factoryClient = new AbstractFactory().createFactory("Client"); //Абстрактная фабрика -> фабрика клиентов
            Client entityClient = factoryClient.createClient("Entity");
            entityClient.returnType();
            System.out.println();

            Bill billOne = Bill.createBill(0, "billOne"); //Фабричный метод
            System.out.println(billOne.getIdentifier());
            System.out.println();

            Bank bankOne = new Bank.BuilderBank("Sber").setCountOfEmployee(12).build(); //Builder
            System.out.println(bankOne.getName());
            System.out.println(bankOne.getCountOfEmployee());
            System.out.println(bankOne.getAdress());

        }
        catch (Exception e)
        {
            System.out.println("Что-то пошло не так");
        }

    }
}
