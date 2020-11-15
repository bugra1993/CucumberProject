package database_stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbUpdateStepDef {
    @Given("user dbutils ile veritabanina baglanir")
    public void user_dbutils_ile_veritabanina_baglanir() {
        DBUtils.createConnection();
    }

    @Given("kullanici id degeri {string} olan verinin {string} bilgisini {string} ile gunceller")
    public void kullanici_id_degeri_olan_verinin_bilgisini_ile_gunceller(String string, String string2, String string3) throws SQLException {
        String query = "SELECT " + string2 + " FROM dbo.tHOTELROOMRESERVATION";
        DBUtils.executeQuery(query);

        DBUtils.getResultset().next();

        System.out.println(DBUtils.getResultset().getObject(string2).toString());

        // tum contactNameSurname verilerini ekrana yazdir

        while (DBUtils.getResultset().next()) {


            System.out.println(DBUtils.getResultset().getObject(string2).toString());


        }

        String updateQuery = "UPDATE dbo.tHOTELROOMRESERVATION SET =" + string2 +
                " = '" + string3 + " WHERE IDHotelReservation = " + string;
        DBUtils.executeQuery(updateQuery);


    }
}