package DesignPatterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConn {
    String url;
    String password;
    private static  DbConn dbInstance;
    static Lock lock = new ReentrantLock();

    //Eager initialisation(during class loading)
    //Problems: App startup time more, Custom params not possible, wastage of object(if not used)
//    private static DBConnection dbInstance = new DBConnection("localhost:8000", "devakash");

    private DbConn(String url, String password){
        this.url=url;
        this.password = password;
    }

    static DbConn getDBInstance(String url, String password){
        if(dbInstance==null)
        {
            lock.lock();
            if(dbInstance==null)
            {
                return dbInstance = new DbConn(url,password);
            }
            lock.unlock();
        }
        return dbInstance;
    }
}
