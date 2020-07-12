package pattern.structural.facade;

import java.sql.Connection;

/**
 * We can have two helper interfaces, namely MySqlHelper and OracleHelper.
 */
public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

}