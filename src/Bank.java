public class Bank
{
    private String name;
    private String adress;
    private int countOfEmployee;

    private Bank(BuilderBank builderBank)
    {
        this.name = builderBank.name;
        this.adress = builderBank.adress;
        this.countOfEmployee = builderBank.countOfEmployee;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getCountOfEmployee() {
        return countOfEmployee;
    }

    static class BuilderBank
    {
        private String name;
        private String adress;
        private int countOfEmployee;

        public BuilderBank(String name)
        {
            this.name = name;
        }

        public BuilderBank setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public BuilderBank setCountOfEmployee(int countOfEmployee) {
            this.countOfEmployee = countOfEmployee;
            return this;
        }

        public Bank build()
        {
            return new Bank(this);
        }
    }
}


