
    import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

 
public class file {

    public static void main(String[] args)

    {

        try {

            FileReader fr = new FileReader("output.txt");

            FileWriter fw = new FileWriter("output2.txt");

            String str = "";

            int i;

            while ((i = fr.read()) != -1) {

                str += (char)i;

            }

            System.out.println(str);

           

            fw.write(str);

            fr.close();

            fw.close();

            System.out.println(

                "File reading and writing both done");

        }

        catch (IOException e) {

            System.out.println(

                "There are some IOException");

        }

    }

}

