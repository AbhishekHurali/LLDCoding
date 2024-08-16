package DesignPatterns.Factory.DataBaseFactory;

import DesignPatterns.Factory.DataBaseFactory.CreateQuery.CreateQueryMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateQuery.DynamoCreateQuery;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.CreateTransactionMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.DynamoCreateTransaction;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.CreateUpdatorMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.DynamoCreateUpdator;

public class DynamoFactory implements DataBaseComponentFactory {
    @Override
    public CreateQueryMethods createQuery() {
        System.out.println("Creating Dynamo CreateQuery");
        return new DynamoCreateQuery();
    }

    @Override
    public CreateTransactionMethods createTransaction() {
        System.out.println("Creating Dynamo CreateTransaction");
        return new DynamoCreateTransaction();
    }

    @Override
    public CreateUpdatorMethods createUpdator() {
        System.out.println("Creating Dynamo CreateUpdator");
        return new DynamoCreateUpdator();
    }
}
