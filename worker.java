public class worker  extends facade_file
{
    String name;
    String position;
    int    salary;
    int    months_quantity;

    worker( String   name,
            String   position,
            int      salary,
            int      months_quantity)
    {
        this.salary          = salary;
        this.position        = position;
        this.name            = name;
        this.months_quantity = months_quantity;
    }

    int calculate_salary()
    {
        return salary * months_quantity;
    }
}