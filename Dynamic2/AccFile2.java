import java.io.*;
class AccFile2
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("xyz.txt");
        boolean result=f1.exists();
        System.out.println("Already Exists?:::"+((result)?"Yes":"No"));
        result=f1.createNewFile();
        FileWriter a=new FileWriter("xyz.txt");
        FileReader b=new FileReader("abc.txt");
        int info=b.read();
        while(info != -1)
        {
            a.write((char)info);
            info=b.read();
        }
        a.close();
        b.close();
        FileReader cd=new FileReader("xyz.txt");
        BufferedReader c=new BufferedReader(cd);
        String info2=c.readLine();
        while(info2 != null)
        {
            System.out.println(info2);
            info2=c.readLine();
        }
        cd.close();
        c.close();   
    }
}