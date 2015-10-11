/**
 * Created by 1795 on 2-10-2015.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.charset.*;



public class ReadAndCompareImpl implements ReadAndCompare {

    public void readCompareText(Path inpPath, Path refPath) throws IOException {
        Charset cs = Charset.defaultCharset();

        /* #1
            below try-catch block is using
            package: java.nio.file
            class: Files
            method : newBufferedReader and return type of this method is BufferedReader
            */

            try {
                BufferedReader br1 = Files.newBufferedReader(inpPath, cs);
//                Stream<String> in = Files.lines(inpPath, cs); (not right)
                System.out.println("\nRead first file from : " + inpPath.toString());

                BufferedReader br2 = Files.newBufferedReader(refPath, cs);
//                Stream<String> ref = Files.lines(refPath, cs);(not right)
                System.out.println("Read second file from : " + refPath.toString());

                String cLInput, cLReference;
                while ((cLInput = br1.readLine()) != null && (cLReference = br2.readLine()) != null) {

                    if (!cLInput.equals(cLReference)) {
                        System.out.println("Comparison UnSuccessful.");
                        System.out.println("Current line in Input Text File: " + cLInput);
                        System.out.println("Current Line in Referenced Text File: " + cLReference);
                    }
                    else {
                        System.out.println("Comparison Successful.");
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }}
    public static void main(String[] args) {}
}//end of Class
