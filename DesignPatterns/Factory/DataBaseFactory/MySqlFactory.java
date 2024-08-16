package DesignPatterns.Factory.DataBaseFactory;

import DesignPatterns.Factory.DataBaseFactory.CreateQuery.CreateQueryMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateQuery.MySqlCreateQuery;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.CreateTransactionMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.MySqlCreateTransaction;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.CreateUpdatorMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.MySqlCreateUpdator;

public class MySqlFactory implements DataBaseComponentFactory {
    @Override
    public CreateQueryMethods createQuery() {
        System.out.println("Creating Mysql CreateQuery");
        return new MySqlCreateQuery();
    }

    @Override
    public CreateTransactionMethods createTransaction() {
        System.out.println("Creating Mysql CreateTransaction");
        return new MySqlCreateTransaction();
    }

    @Override
    public CreateUpdatorMethods createUpdator() {
        System.out.println("Creating MySql CreateUpdator");
        return new MySqlCreateUpdator();
    }
}
