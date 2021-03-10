import service.*;
import model.*;
import java.util.*;
class DataProcessing{
    FileProcessing file=new FileProcessing();
    Surgery surgery=new Surgery();
    SurgeryDao surgeryDao=new SurgeryDao();
    ArrayList<String> surgeryList=file.readFile();
}