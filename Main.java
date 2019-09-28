import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try{
            System.out.println("Please enter the measurement. (Length, Temperature, or Data):");
            Scanner measurement = new Scanner(System.in);
            String frt = measurement.nextLine();
            System.out.println("Please enter the unit you want to convert it to:");
            String convert = measurement.nextLine();
            String input[] = frt.split(" ",2);
            double measure = Double.parseDouble(input[0]);
            boolean way;
            
        }
        catch(Exception e){
            System.out.println("YOU IDIOT!!!");
        }
    }
}