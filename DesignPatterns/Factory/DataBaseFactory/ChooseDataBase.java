package DesignPatterns.Factory.DataBaseFactory;

public class ChooseDataBase {
    public static DataBase getDataBase(String name){
        if(name=="Dynamo"){
            return new Dynamo();
        }else if(name=="MySql"){
            return new MySql();
        }else if(name=="Postgres"){
            return new Postgres();
        }else{
            System.out.println("Invalid Input, No Such DataBase Exists");
        }
        return null;
    }
}
