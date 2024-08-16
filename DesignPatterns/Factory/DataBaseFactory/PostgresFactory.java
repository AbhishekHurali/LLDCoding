package DesignPatterns.Factory.DataBaseFactory;

import DesignPatterns.Factory.DataBaseFactory.CreateQuery.CreateQueryMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateQuery.PostgresCreateQuery;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.CreateTransactionMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.PostgresCreateTransaction;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.CreateUpdatorMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.PostgresCreateUpdator;

public class PostgresFactory implements DataBaseComponentFactory {
    @Override
    public CreateQueryMethods createQuery() {
        System.out.println("Creating Postgres CreateQuery");
        return new PostgresCreateQuery();
    }

    @Override
    public CreateTransactionMethods createTransaction() {
        System.out.println("Creating postgres CreateTransaction");
        return new PostgresCreateTransaction();
    }

    @Override
    public CreateUpdatorMethods createUpdator() {
        System.out.println("Creating postgres Createupdator");
        return new PostgresCreateUpdator();
    }
}
