package DesignPatterns.Factory.DataBaseFactory;

import DesignPatterns.Factory.DataBaseFactory.CreateQuery.CreateQueryMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateTransaction.CreateTransactionMethods;
import DesignPatterns.Factory.DataBaseFactory.CreateUpdator.CreateUpdatorMethods;

public class Client {
    public static void main(String[] args) {
        DataBase db = new Postgres();//Just change here based on the requirement MySql,postgres etc

        DataBaseComponentFactory dbcfM = db.createDBCompFactory();
        dbcfM.createQuery();
        dbcfM.createTransaction();
        dbcfM.createUpdator();

//        String databaseName = "Dynamo";//Let's create simple factory here
//        DataBase db2 = ChooseDataBase.getDataBase(databaseName);
//        DataBaseComponentFactory dbcf = db2.createDBCompFactory();
//        dbcf.createQuery();
//        dbcf.createTransaction();
//        dbcf.createUpdator();

        String databaseName = "MySql";//Let's create simple factory here
        DataBase db2 = ChooseDataBase.getDataBase(databaseName);
        DataBaseComponentFactory dbcf = db2.createDBCompFactory();
        CreateQueryMethods cq = dbcf.createQuery();
        CreateTransactionMethods ct = dbcf.createTransaction();
        CreateUpdatorMethods cu = dbcf.createUpdator();


//        Scanner scn = new Scanner(System.in);
//        String str = scn.nextLine();
//        System.out.println(str);
//        DataBase db3 = ChooseDataBase.getDataBase(str);
//        DataBaseComponentFactory dbcfInput = db3.createDBCompFactory();
//        dbcfInput.createQuery();
//        dbcfInput.createTransaction();
//        dbcfInput.createUpdator();
    }
}
