import java.io.*;

class Test1{
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("aa.txt");
        fw.write(97);
        fw.write("akash\nMehta");
        fw.write("\n");
        char[] ch={'a','b','c','d'};
        fw.write(ch);
        fw.flush();
        fw.close();

        /*
         * File reader:-
         * -->It is use to readchar data from perticular file.
         * 
         * Constructors:-
         * 1. FileReader fr=new FileReader(String fname);
         * 2. FileReader fr=new FileReader(File f);
         * 
         * Methods:-
         * 1. in read():-It returns unicode values of character.
         * -->It is use to read next character from the file and return its unicode value.
         * -->If the next character is not available then it return (-1).
         * 
         * 2. in read(carg[] ch):- It is use to read enough character from file and 
         *    return the no. of character copy from perticular file into char[] array
         * 
         * 3. void close();
         */

         //First method
         FileReader fr=new FileReader("aa.txt");
         int i=fr.read();
         while (i!=1)
         {
            System.out.print(" "+(char)i);
            i=fr.read();
         }
         System.out.println();
         fr.close();

         //second method
         FileReader fr1=new FileReader("aa.txt");
         File f1=new File("aa.txt");
         char[] ch1=new char[(int) f1.length()];
         fr1.read(ch1);
         for(char ch2:ch1)
         {
            System.out.println(" "+ch2);
         }
         fr1.close();

         /*
          * usage of FileWriter and FileReader is not recommanded
          *because:-
          * -->1. while writting data by FileWriter, compulsary we should insert line
                  seperator \n manually which is not convenient to programer.
            -->2. while reading by FileReader, we have toread data character by character
                  which is not convenient to programer.
            -->3. To overcome the above limitation we should go BufferedWriter and 
                  BufferedReader concept
          */

          /*
           * BufferedWriter:-
           * -->by using bufferedWriter we can write char data to file.
           * 
           * Constructor:-
           * 1. BufferedWriter bw=new BufferedWriter(write w);
           * --> BufferedWriter never communicate with the file directly but it communicate
           *     to the file via Buffered object.
           * 
           * Methods:-
           * 1. write(int ch);
           * 2. write (char[] ch);
           * 3. write (String);
           * 4. flush();
           * 5. close();
           * 6. newLine();
           */

           FileWriter fw1=new FileWriter("a5.txt");
           BufferedWriter bw=new BufferedWriter(fw1);
           bw.write(97);
           bw.newLine();
           bw.write("Akash");
           bw.newLine();
           char[] ch3={'a','b','c','d'};
           bw.write(ch3);
           bw.newLine();
           bw.flush();
           bw.close();
           System.out.println();

           /*
            * BufferedReader:-
            -->It is used to read char data from particular file

            BufferedReader br=new BufferedReader(Reader r);

            -->It never communicate directly with file but communicate with file via reader object

            Methods:-
            1. int read();
            2. int (cahr[] ch);
            3. void close();
            4. String readLine();
            -->It is used to read and return nextLine from the file,
               if nextLine is not available then it return null. 
            */

            FileReader fr2=new FileReader("a5.txt");
            BufferedReader br=new BufferedReader(fr2);

            String line=br.readLine();
            while(line!=null)
            {
                System.out.println(" "+line);
                line=br.readLine();  
            }
            br.close();
    }
}