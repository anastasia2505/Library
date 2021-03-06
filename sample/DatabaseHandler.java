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

    public void deleteBook(String answer_delete_book) {
        int ans_id = Integer.valueOf(answer_delete_book);
        String delete ="DELETE FROM book where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateBook(String Title, int Quantity, int TypeBookId, int PHId, int AuthorId, int ans_id_book) {
        String update = "UPDATE book SET Title = ? , Quantity = ? , TypeBookId = ? , PHId = ? , AuthorId = ? WHERE book.id = ? ";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,Title);
            prst.setInt(2,Quantity);
            prst.setInt(3,TypeBookId);
            prst.setInt(4,PHId);
            prst.setInt(5,AuthorId);
            prst.setInt(6,ans_id_book);
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

    public void deleteTypeBook(String answer_delete_tp) {
        int ans_id = Integer.valueOf(answer_delete_tp);
        String delete ="DELETE FROM type_book where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public void updateTypeBook(String TypeBOOK, Integer answer_update_tp) {
        String update = "UPDATE type_book SET typebook = ? WHERE type_book.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,TypeBOOK);
            prst.setInt(2,answer_update_tp);
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
    public void deleteExampleBook(String answer_delete_exbook) {
        int ans_id = Integer.valueOf(answer_delete_exbook);
        String delete ="DELETE FROM example_of_book where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateExampleBook(Boolean Flagg, Date DataOfIssue, int LibId,
                                  int BookId, int ReaderId , int ans_id_exbook) {
        String update="UPDATE example_of_book SET flagg = ? , dataofissue = ? , libid = ?, bookid = ? , readerid = ?  WHERE example_of_book.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setBoolean(1,Flagg);
            prst.setDate(2,DataOfIssue);
            prst.setInt(3,LibId);
            prst.setInt(4,BookId);
            prst.setInt(5,ReaderId);
            prst.setInt(6,ans_id_exbook);
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
    public void deleteReader(String answer_delete_reader) {
        int ans_id = Integer.valueOf(answer_delete_reader);
        String delete ="DELETE FROM reader where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void updateReader(Boolean status, Integer rticketid, int ans_id_reader) {
        String update ="UPDATE reader SET Status = ? , RTicketId = ?  WHERE reader.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setBoolean(1,status);
            prst.setInt(2,rticketid);
            prst.setInt(3,ans_id_reader);
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
    public void deleteReaderTicket(String answer_delete_rticket) {
        int ans_id = Integer.valueOf(answer_delete_rticket);
        String delete ="DELETE FROM reader_ticket where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void updateReaderTicket(String FullNameReader, Date DataOfBirth, Integer OccupId, Integer ans_id_rticket) {
        String update ="UPDATE reader_ticket SET FullNameReader = ? , DateOfBirth = ? , OccupId = ? WHERE reader_ticket.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,FullNameReader);
            prst.setDate(2,DataOfBirth);
            prst.setInt(3,OccupId);
            prst.setInt(4,ans_id_rticket);
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
    public void deleteOccupation(String answer_delete_occupation) {
        int ans_id = Integer.valueOf(answer_delete_occupation);
        String delete ="DELETE FROM occupation where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void updateOccupation(String TypeOfOccupation, int ans_id_occupation) {
        String update ="UPDATE occupation SET TypeOfOccupation = ? WHERE occupation.id = ? ";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,TypeOfOccupation);
            prst.setInt(2,ans_id_occupation);
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

    public void deleteLibrary(String answer_delete_lib) {
        int ans_id = Integer.valueOf(answer_delete_lib);
        String delete ="DELETE FROM my_library where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateLibrary(String LibName, String LibAddress, String LibEmail, String LibPhone, int ans_id_lib) {
        String update ="UPDATE my_library SET LibName = ? , LibAddress = ? , LibEmail = ?, LibPhone = ?  WHERE my_library.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,LibName);
            prst.setString(2,LibAddress);
            prst.setString(3,LibEmail);
            prst.setString(4,LibPhone);
            prst.setInt(5,ans_id_lib);
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

    public void deletePublishingHouse(String answer_delete_ph) {
        int ans_id = Integer.valueOf(answer_delete_ph);
        String delete ="DELETE FROM publishing_house where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    public void updatePublishingHouse(String PHName, String PHAddress, String PHEmail, String PHPhone, int ans_id_ph) {
        String update ="UPDATE publishing_house SET PHName = ? , PHdAddress = ? , PHEmail = ? , PHPhone = ?  WHERE publishing_house.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,PHName);
            prst.setString(2,PHAddress);
            prst.setString(3,PHEmail);
            prst.setString(4,PHPhone);
            prst.setInt(5,ans_id_ph);
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
    public void deleteAuthor(String answer_delete_author) {
        int ans_id = Integer.valueOf(answer_delete_author);
        String delete ="DELETE FROM author where id=" + ans_id;
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(delete);
            prst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void updateAuthor(String FullName, String Country, String YearsOfLife, int ans_id) {
        String update ="UPDATE author SET FullName = ? , Country = ? , YearsOfLife = ? WHERE author.id = ?";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(update);
            prst.setString(1,FullName);
            prst.setString(2,Country);
            prst.setString(3,YearsOfLife);
            prst.setInt(4,ans_id);
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

    public ObservableList<ShowDebtors> ShowDebtors() {
        ResultSet resSet = null;

        String select = "SELECT status, rticketid, fullnamereader FROM reader\n" +
                "JOIN reader_ticket ON (reader_ticket.id = rticketid)\n" +
                "WHERE status = 'true';";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ShowDebtors> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ShowDebtors show_deb = new ShowDebtors(
                        resSet.getInt(2),
                        resSet.getString(3)
                );

                result.add(show_deb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ObservableList<ShowBookOnHands> ShowBookOnHands() {
        ResultSet resSet = null;

        String select = "SELECT flagg, example_of_book.id, title, dataofissue, libname, fullnamereader FROM example_of_book\n" +
                "JOIN my_library ON (my_library.id = libid) \n" +
                "JOIN book ON (book.id = bookid)\n" +
                "JOIN reader ON (reader.id = example_of_book.readerid )\n" +
                "JOIN reader_ticket ON (reader.rticketid = reader_ticket.id )\n" +
                "WHERE flagg = 'false';";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ShowBookOnHands> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ShowBookOnHands show_books = new ShowBookOnHands(
                        resSet.getInt(2),
                        resSet.getString(3),
                        resSet.getString(4),
                        resSet.getString(5),
                        resSet.getString(6)
                );

                result.add(show_books);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ObservableList<ShowBookByTitle> SearchBook(String answer_search_book) {
        ResultSet resSet = null;

        String select ="SELECT  example_of_book.id, title, fullname, libname FROM example_of_book\n" +
                "JOIN my_library ON (my_library.id = libid) \n" +
                "JOIN book ON (book.id = bookid)\n" +
                "JOIN author ON (author.id = book.authorid)\n" +
                "WHERE title = '"+answer_search_book+"';";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ShowBookByTitle> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ShowBookByTitle show_books = new ShowBookByTitle(
                        resSet.getInt(1),
                        resSet.getString(2),
                        resSet.getString(3),
                        resSet.getString(4)
                );

                result.add(show_books);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

    public ObservableList<ShowBookByType> FindByType (String answer_type) {
        ResultSet resSet = null;

        String select ="SELECT title, typebook FROM book\n" +
                "JOIN type_book ON (type_book.id = typebookid)\n" +
                "WHERE typebook = '"+answer_type+"';";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ShowBookByType> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ShowBookByType show_books = new ShowBookByType(
                        resSet.getString(1),
                        resSet.getString(2)
                );
                result.add(show_books);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public ObservableList<ShowBookByAuthor> FindByAuthor (String answer_author) {
        ResultSet resSet = null;

        String select ="SELECT title, fullname FROM book\n" +
                "JOIN author ON (author.id = book.authorid)\n" +
                "WHERE fullname = '"+answer_author+"';";
        try {
            PreparedStatement prst = getDbConnection().prepareStatement(select);
            resSet = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ObservableList<ShowBookByAuthor> result = FXCollections.observableArrayList();
        try {
            while(resSet.next()) {
                ShowBookByAuthor show_books = new ShowBookByAuthor(
                        resSet.getString(1),
                        resSet.getString(2)
                );
                result.add(show_books);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }
}
