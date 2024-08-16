package DesignPatterns.Factory.DataBaseFactory;

public class MySql extends DataBase {
    @Override
    public DataBaseComponentFactory createDBCompFactory() {
        return new MySqlFactory();
    }
}
