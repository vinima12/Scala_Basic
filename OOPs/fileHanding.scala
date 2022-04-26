package OOPs
import java.io.File
import java.io.PrintWriter
import scala.io.Source

object fileHanding {

  // Creating object
    // Main method
    def main(args:Array[String])
    {
      // Creating a file
      val file_Object = new File("abc.txt" )

      // Passing reference of file to the printwriter
      val print_Writer = new PrintWriter(file_Object)

      // Writing to the file
      print_Writer.write("Hi vinitha vikram!.")

      // Closing printwriter
      print_Writer.close()

      // file name
      val fname = "abc.txt"

      // creates iterable representation
      // of the source file
      val fSource = Source.fromFile(fname)
      while (fSource.hasNext)
      {
        println(fSource.next)
      }

      for(line<-fSource.getLines)
      {
        println(line)
      }

      // closing file
      fSource.close()
    }


}
