package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Models.*;

import java.sql.*;


public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws  SQLException {
        String url = server + nameDB;
        //Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(url, user, password);

        return dbConnection;
    }
    public void addBook (String Title, int Quantity, int TypeBookId,
                         int PHId, int AuthorId ) {
        String insert ="INSERT INTO book(Title, Quantity, TypeBookId, PHId, AuthorId ) VALUES(?,?,?,?,?)";
        //можно и нужно использовать константы из класса Const, см. видео 11
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,Title);
            prst.setInt(2,Quantity);
            prst.setInt(3,TypeBookId);
            prst.setInt(4,PHId);
            prst.setInt(5,AuthorId);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public ObservableList<Book> ViewRecordBook(){
        ResultSet resSet = null;

        String select = "SELECT book.id, title, fullname, typebook, quantity, phname FROM author\n" +
                            "JOIN book ON (author.id = authorid)\n" +
                            "JOIN type_book ON (type_book.id = typebookid)\n" +
                             "JOIN publishing_house ON (publishing_house.id = phid)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<Book> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                Book book = new Book(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4),
                        resSet.getInt(5),
                        resSet.getString(6)
                );

                result.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addTypeBook (String TypeBOOK ) {
        String insert ="INSERT INTO type_book(TypeBOOK) VALUES(?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,TypeBOOK);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public ObservableList<TypeBook> ViewRecordTypeBook(){
        ResultSet resSet = null;

        String select = "SELECT * FROM type_book";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<TypeBook> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                TypeBook tp_book = new TypeBook(
                        resSet.getInt(1),
                        resSet.getString(2)
                );

                result.add(tp_book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addExampleBook (Boolean Flagg, Date DataOfIssue, int LibId,
                                int BookId, int ReaderId  ) {
        String insert ="INSERT INTO example_of_book(flagg, dataofissue, libid, bookid, readerid) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setBoolean(1,Flagg);
            prst.setDate(2,DataOfIssue);
            prst.setInt(3,LibId);
            prst.setInt(4,BookId);
            prst.setInt(5,ReaderId);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }


    public ObservableList<ExampleOfBook> ViewRecordExBook(){
        ResultSet resSet = null;

        String select = "SELECT  example_of_book.id, dataofissue, libname, title, fullnamereader FROM example_of_book\n" +
                "JOIN my_library ON (my_library.id = libid) \n" +
                "JOIN book ON (book.id = bookid)\n" +
                "JOIN reader on (reader.id = example_of_book.readerid )\n" +
                "JOIN reader_ticket on (reader.rticketid = reader_ticket.id );";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ExampleOfBook> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ExampleOfBook exbook = new ExampleOfBook(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4),
                        resSet.getString(5)
                );

                result.add(exbook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addReader (Boolean status, Integer rticketid ) {
        String insert ="INSERT INTO reader(status, rticketid) VALUES(?,?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setBoolean(1,status);
            prst.setInt(2,rticketid);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ObservableList<Reader> ViewRecordReader(){
        ResultSet resSet = null;

        String select = "SELECT * FROM reader;";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<Reader> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                Reader reader = new Reader(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getInt(3)
                );

                result.add(reader);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addReaderTicket (String FullNameReader, Date DataOfBirth, Integer OccupId) {
        String insert ="INSERT INTO reader_ticket(FullNameReader, DateOfBirth, OccupId) VALUES(?,?,?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,FullNameReader);
            prst.setDate(2,DataOfBirth);
            prst.setInt(3,OccupId);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ObservableList<ReaderTicket> ViewRecordReaderTicket(){
        ResultSet resSet = null;

        String select = "SELECT reader_ticket.id, fullnamereader, dateofbirth, typeofoccupation FROM reader_ticket\n" +
                "JOIN occupation ON (occupation.id = occupid);";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ReaderTicket> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ReaderTicket rticket = new ReaderTicket(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4)
                );

                result.add(rticket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addOccupation (String TypeOfOccupation ) {
        String insert ="INSERT INTO occupation(TypeOfOccupation) VALUES(?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,TypeOfOccupation);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public ObservableList<Occupation> ViewRecordOccupation(){
        ResultSet resSet = null;

        String select = "SELECT * FROM occupation";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<Occupation> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                Occupation occupation = new Occupation(
                        resSet.getInt(1),
                        resSet.getString(2)
                );

                result.add(occupation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addLibrary (String LibName, String LibAddress, String LibEmail, String LibPhone) {
        String insert ="INSERT INTO my_library(LibName, LibAddress, LibEmail, LibPhone) VALUES(?,?,?,?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,LibName);
            prst.setString(2,LibAddress);
            prst.setString(3,LibEmail);
            prst.setString(4,LibPhone);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public ObservableList<Library> ViewRecordLibrary(){
        ResultSet resSet = null;

        String select = "SELECT * FROM my_library";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<Library> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                Library library = new Library(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4),
                        resSet.getString(5)
                );

                result.add(library);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addPublishingHouse (String PHName, String PHAddress, String PHEmail, String PHPhone) {
        String insert ="INSERT INTO publishing_house (PHName, PHdAddress, PHEmail, PHPhone) VALUES(?,?,?,?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,PHName);
            prst.setString(2,PHAddress);
            prst.setString(3,PHEmail);
            prst.setString(4,PHPhone);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ObservableList<PublishingHouse> ViewRecordPH(){
        ResultSet resSet = null;

        String select = "SELECT * FROM publishing_house";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<PublishingHouse> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                PublishingHouse publishingHouse = new PublishingHouse(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4),
                        resSet.getString(5)
                );

                result.add(publishingHouse);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addAuthor (String FullName, String Country, String YearsOfLife) {
        String insert ="INSERT INTO author(FullName, Country, YearsOfLife) VALUES(?,?,?)";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1,FullName);
            prst.setString(2,Country);
            prst.setString(3,YearsOfLife);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ObservableList<Author> ViewRecordAuthor(){
        ResultSet resSet = null;

        String select = "SELECT * FROM author;";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<Author> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                Author author = new Author(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4)
                );

                result.add(author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
