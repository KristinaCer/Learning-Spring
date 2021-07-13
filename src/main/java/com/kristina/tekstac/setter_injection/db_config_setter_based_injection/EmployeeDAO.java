package com.kristina.tekstac.setter_injection.db_config_setter_based_injection;

public class EmployeeDAO {
    DBConfig dbConfig;

    public DBConfig getDbConfig() {
        System.out.println("Db config returned " + dbConfig.getUserName().toString());
        return dbConfig;
    }

    public void setDbConfig(DBConfig dbConfig) {
        this.dbConfig = dbConfig;
    }
}
