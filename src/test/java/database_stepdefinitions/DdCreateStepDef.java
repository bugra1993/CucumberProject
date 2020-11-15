package database_stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DdCreateStepDef {

    @Given("kullanici yeni bir hotel olusturur veritabininda")
    public void kullanici_yeni_bir_hotel_olusturur_veritabininda() throws SQLException {
        String query = "INSERT INTO dbo.tHOTEL (Code, Name, Address, Phone, Email, IDGroup, CreateDate, CreateUser)\n" +
                "VALUES ('123', 'Enes', 'AU', '1234567890', 'batch5@gmail.com', 1132020, 'Batch5', 4);";

        DBUtils.executeQuery(query);

        //  String queryRead = "SELECT Name FROM dbo.tHOTEL";

        // DBUtils.executeQuery(queryRead);


        //  DBUtils.getResultset().last();

        // System.out.println(DBUtils.getResultset().getObject("Name").toString());

    }


}
