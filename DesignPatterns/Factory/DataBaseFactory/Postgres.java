package DesignPatterns.Factory.DataBaseFactory;

public class Postgres extends DataBase {

    @Override
    public DataBaseComponentFactory createDBCompFactory() {
        return new PostgresFactory();
    }
}
