package DesignPatterns.Factory.DataBaseFactory;


import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.CreateUpdatorMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateQuery.CreateQueryMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.CreateTransactionMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.CreateUpdatorMethods;

public interface DataBaseComponentFactory {
    public CreateQueryMethods createQuery();
    public CreateTransactionMethods createTransaction();
    public CreateUpdatorMethods createUpdator();
}
