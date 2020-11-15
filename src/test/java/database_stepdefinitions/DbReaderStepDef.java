package database_stepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class DbReaderStepDef {

    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=kaolapalacedb;user=Ahmet_User;password=Ahmet123!";
    String username = "Ahmet_User";
    String password = "Ahmet123!";

    Connection connection; // veritabanina baglanmak icin kullanilir
    Statement statement; // Query leri calistirmak ve verileri almak icin kullanilir
    ResultSet resultSet; // Aldigimiz verileri resultset in icine eklenir.

    @Given("kullanici veri tabanina baglanir")
    public void kullanici_veri_tabanina_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("kullanici {string} tablosundaki {string} verileri alir")
    public void kullanici_tablosundaki_verileri_alir(String string, String string2) throws SQLException {
        resultSet = statement.executeQuery("SELECT " + string2 + " FROM dbo. " + string);


    }

    @Given("kullanici  {string} verilerini okur")
    public void kullanici_verilerini_okur(String string) throws SQLException {
        resultSet.next();// resultsetin icindeki ilk satiri atliyoruz
        /*Object birinciVeri = resultSet.getObject(string);
        System.out.println(birinciVeri.toString());

        resultSet.next();// resultsetin icindeki ilk satiri atliyoruz
        Object ikinciVeri = resultSet.getObject(string);
        System.out.println(ikinciVeri.toString()); */


        // resultSet.first();// bu kod ilk satira goturmek icin kullanilir
        int count = 0;
        while (resultSet.next()) {
            count++;
            Object veri = resultSet.getObject(string);
            System.out.println(count + "." + veri.toString());

        }


    }


}
