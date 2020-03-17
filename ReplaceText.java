import java.io.*;
import java.util.*;


public class ReplaceText
{
  // args[0] = source file
  // args[1] = target file
  // args[2] = old string
  // args[3] = new string


  public static void main(String[] args)
  {
    // check command line parameter usage

    if (args.length != 4)
    {
      System.out.println("To use program, enter: java ReplaceText sourceFile targetFile oldString newString");
      System.exit(1);
    }




    // Check if source file exists

    File sourceFile = new File(args[0]);

    if (!sourceFile.exists())
    {
      System.out.println("Source file " + args[0] + " does not exist");
      System.exit(2);
    }



    // Check if target file exists
    File targetFile = new File(args[1]);

    if (targetFile.exists())
    {
      System.out.println("Target file " + args[1] + " already");
      System.exit(3);
    }





    // replace text

    try
    (
      Scanner input = new Scanner(sourceFile);
      PrintWriter output = new PrintWriter(targetFile);
    )
    {
      while (input.hasNext())
      {
        String s1 = input.nextLine();                       // get the whole line from source file

        String s2 = s1.replaceAll(args[2], args[3]);        // replace the text string if it exists

        output.println(s2);                                 // write the new line to target file
      }
    }
    catch(Exception ex)
    {
      System.out.println(ex.getMessage());
    }









  }





}
