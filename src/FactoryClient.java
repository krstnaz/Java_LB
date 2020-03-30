public class FactoryClient implements Factory
{
    public Client createClient(String typeOfClient)
    {
        switch (typeOfClient)
        {
            case "Entity": return new EntityClient();
            case "Natural": return new NaturalClient();
            default: return null;
        }
    }
}
