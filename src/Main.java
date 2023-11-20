import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

import javax.swing.JFileChooser;

public class Main

{

    public static void main(String args[])

    {



        final JFileChooser file_chooser = new JFileChooser();



        int returnVal = file_chooser.showOpenDialog(null);



        File file=file_chooser.getSelectedFile();


        int linecount=0;

        int wordcount=0;

        int charactercount=0;

        String line="";

        try {



            Scanner read=new Scanner(file);



            while(read.hasNextLine())

            {

                line=read.nextLine();


                String words[]=line.split(" ");



                charactercount=charactercount+line.length();

                wordcount=wordcount+words.length;

                linecount=linecount+1;

            }

        } catch (FileNotFoundException e) {


            e.printStackTrace();

        }



        System.out.printf("file name: %s \n character count: %d \n word count: %d \n line count: %d \n",file.getName(),charactercount,wordcount,linecount);

    }

}