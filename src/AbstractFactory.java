public class AbstractFactory
{
    Factory createFactory( String typeOfFactory )
    {
        switch (typeOfFactory)
        {
            case "Client": return new FactoryClient();
            default: return null;
        }
    }
}
