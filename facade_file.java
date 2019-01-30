public class facade_file
{
    public static void main(String args[])
    {
        worker  newworker;

                newworker = new worker( "alex",
                                        "ceo",
                                        8000,
                                        10);

        System.out.println( newworker.name                  +"\n"+
                            newworker.position              +"\n"+
                            newworker.calculate_salary());
    }
}
