package DesignPatterns.Factory.DataBaseFactory;

public class Dynamo extends DataBase {
    @Override
    public DataBaseComponentFactory createDBCompFactory() {
        return new DynamoFactory();
    }
}
