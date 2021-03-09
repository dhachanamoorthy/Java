import service.MysqlCon;
public class App {
    public static void main(String[] args) throws Exception {
        MysqlCon con=new MysqlCon();
        con.connect();
        System.out.println("Moorthy");
    }
}
