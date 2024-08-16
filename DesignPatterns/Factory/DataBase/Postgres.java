package DesignPatterns.Factory.DataBase;

public class Postgres extends DataBase {
    @Override
    public CreateQuery createQuery() {
        System.out.println("Creating PostgresQuery");
        return new PostgresQuery();
    }
}
