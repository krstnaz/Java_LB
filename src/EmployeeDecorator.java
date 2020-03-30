abstract class EmployeeDecorator extends Employee
{
    Employee employeeDecorator;

    public EmployeeDecorator( Employee employeeDecorator )
    {
        this.employeeDecorator = employeeDecorator;
    }

    public abstract void toService();
}
