public class HighLevelEmployee extends EmployeeDecorator
{
    public HighLevelEmployee(Employee employeeDecorator)
    {
        super(employeeDecorator);
    }

    @Override
    public void toService()
    {
        employeeDecorator.toService();
        System.out.println("Оформить кредит");
    }
}
