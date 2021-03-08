public class Main{
    public static void main(String[] args) {
        MysqlCon con=new MysqlCon();
        con.connect();
        con.close();
        System.out.println("Moorthy");
        // FileProcessing fileProcessor=new FileProcessing();
        // fileProcessor.openFile();
    }
}