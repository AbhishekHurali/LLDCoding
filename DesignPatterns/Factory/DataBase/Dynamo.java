package DesignPatterns.Factory.DataBase;

public class Dynamo extends DataBase {
    @Override
    public CreateQuery createQuery() {
        System.out.println("Creating DynamoQuery");
        return new DynamoQuery();
    }
}
