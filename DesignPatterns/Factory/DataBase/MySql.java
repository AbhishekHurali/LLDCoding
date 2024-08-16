package DesignPatterns.Factory.DataBase;

public class MySql extends DataBase {
    @Override
    public CreateQuery createQuery() {
        System.out.println("Creating MySqlQuery");
        return new MySqlQuery();
    }
}
