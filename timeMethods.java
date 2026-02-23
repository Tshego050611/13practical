import java.lang.Math.*; import java.io.*; import java.text.*;
public class timeMethods{
  public static int N = 32654;
  public static Node[] records;
  public static Node[] sortedRecords;
  public static int[] searchKeys;
  
  public static void main(String args []){
      // Initialize arrays
        records = new Node[N + 1];
        sortedRecords = new Node[N + 1];
        searchKeys = new int[30];

    DecimalFormat fourD = new DecimalFormat("0.0000");
    DecimalFormat fiveD = new DecimalFormat("0.00000);

    long start, finish; 
    double linearRunTime = 0, lineaRunTime2 = 0, time;
    double binaryRunTime = 0, binaryRunTime2 = 0
      double time;
        int repetition, repetitions = 30;
        Random rand = new Random();
    
       // Read data from file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ulysses.numbered"));
            String line;
           
            while ((line = reader.readLine()) != null) {
                if (line.length() >= 5) {
                    try {
                        int key = Integer.parseInt(line.substring(0, 5).trim());
                        String data = line.substring(5);
                        if (key >= 1 && key <= N) {
                            records[key] = new Node(key, data);
                        }
                    } catch (NumberFormatException e) {
                        // Skip lines that don't start with a valid number
                    }
                }
            }
            reader.close();

  

  

    
