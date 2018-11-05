import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Csv_Files {

	public static void main(String[] args) throws IOException {
		File f1 = new File("abc.csv");
		
		PrintWriter f2=new PrintWriter(f1);
		StringBuilder s=new StringBuilder();
		s.append("id");
        s.append('\t');
        s.append("Name");
        s.append('\t');
        s.append("Path");
        s.append('\n');
		    s.append("1");
		    s.append('\t');
            s.append("abc.csv");
            s.append('\t');
            s.append("C:\\Users\\My Pc\\Desktop\\Assignments\\Collections_1_Iterator_and_Lists\\abc.csv");
            s.append("\n");
            s.append("2");
		    s.append('\t');
            s.append("ab.csv");
            s.append('\t');
            s.append("C:\\Users\\My Pc\\Desktop\\Assignments\\Collections_1_Iterator_and_Lists\\ab.csv");
            s.append("\n");
            s.append("3");
		    s.append('\t');
            s.append("a.csv");
            s.append('\t');
            s.append("C:\\Users\\My Pc\\Desktop\\Assignments\\Collections_1_Iterator_and_Lists\\a.csv");
            s.append("\n");
            f2.write(s.toString());
            f2.close();
            
	}

}