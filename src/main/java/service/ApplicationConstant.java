package service;

import java.sql.Connection;

public class ApplicationConstant {

    DBhelper dBhelper=new DBhelper();
    private Connection connection=new DBhelper().connect();

    public DBhelper getdBhelper() {
        return dBhelper;
    }

    public void setdBhelper(DBhelper dBhelper) {
        this.dBhelper = dBhelper;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
