import java.io.*;
import java.net.SocketTimeoutException;

class Test
{
    public static void main(String[] args) throws Exception {
        
        File f1=new File("raj");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());

        File f2=new File("raj","1.txt");
        f2.createNewFile();

        File f3=new File("raj","2.txt");
        f2.createNewFile();
        
        File f4=new File("raj","2.txt");
        f2.createNewFile();

        //public String getpath()
        System.out.println("path = "+f2.getPath());

        //public String getabsolutepath()
        System.out.println("absolute path= "+f2.getAbsolutePath());

        //public String getparent()
        System.out.println("parent name= "+f2.getParent());

        //public String getName()
        System.out.println("name= "+f2.getName());

        //public boolean isFile()
        System.out.println("isFile "+f2.isFile());

        //public boolean isDirectory()
        System.out.println("isDirectory "+f2.isDirectory());

        //public boolean isabsolute()
        System.out.println("isabsolute "+f2.isAbsolute()); 

        //public boolean canread()
        System.out.println("canread "+f2.canRead());

        //public boolean canwrite()
        System.out.println("canwrite "+f2.canWrite());

        //public boolean canexecute()
        System.out.println("canexecute "+f2.canExecute());

        //public long length()
        System.out.println("length= "+f2.length());

        //public boolean isequals
        System.out.println("isequals "+f3.equals(f4));
    }
}