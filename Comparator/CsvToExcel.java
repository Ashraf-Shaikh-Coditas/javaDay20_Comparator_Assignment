package Week6.Day20.Comparator;

import java.io.*;

public class CsvToExcel {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Coditas\\IdeaProjects\\Java_Assignments\\src\\Week6\\Day20\\Comparator\\data.csv"));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dat.xls"));

            String i = "";
            while((i = bufferedReader.readLine()) != null) {
                bufferedWriter.write(i);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        }

}
