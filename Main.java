import java.security.MessageDigest;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try{
            //Inputs the first measurement 
            System.out.println("Please enter the measurement. (Length, Temperature, or Data):");
            Scanner measurement = new Scanner(System.in);
            String frt = measurement.nextLine();
            //asks the user what they want to convert it to
            System.out.println("Please enter the unit you want to convert it to:");
            String convert = measurement.nextLine();
            String input[] = frt.split(" ",2); // splits the input to an array
            double measure = Double.parseDouble(input[0]); // doubles the inputted number 
            checkUnit unit = new checkUnit(input[1]);    
            checkUnit convertCheckUnit = new checkUnit(convert);
            int start = unit.numberUnit();
            int goal = convertCheckUnit.numberUnit();
            //line 15 gets first unit, line 16 captures unit to convert to
            if(start == 0 || goal == 0){
                System.out.println("Please enter correct units(mm,cm,m,km,inch,feet,yard,mile,");
                main(args);
            }

            boolean way = true; //boolean is used to tell the code which direction to convert in order. this slows down the code but adds flexibility
           
            //here we start the maths! 
            int loop = Math.abs(start - goal);
            if(0 < start && start < 9){
                if(!(start > 3 && goal < 5) || !(start < 5 && goal > 3)){
                    if (start>= goal){
                        way = false; // false = up the ladder, true = down the ladder
                       // System.out.println("start: " + start);
                        start -= 1;
                        
                    }
                    int i;
                   // System.out.println(way + " this is way" );
                    if(way == false){
                        i = 0;
                        System.out.println("i: " + i +" "+ loop);
                    }
                    else{
                        i = 1;
                        //System.out.println("i: " + i);
                    }
                   // System.out.println(measure +" start:"+ start +" goal:"+ goal +" loop:"+loop);
                    for(;i <= loop;i++){
                        Metric Hold = new Metric(measure,way);
                        Imperial Holds = new Imperial(measure,way);
                        System.out.println(measure +" "+ start);
                        switch(start){
                            case 1:
                            measure = Hold.MMandCM();
                            break;
                            case 2:
                            measure = Hold.CMandM();
                            break;
                            case 3:
                            measure = Hold.MandKM();
                            break;
                           // case 4:
                           // measure = Holds.();
                          //  break;
                            case 5:
                            measure = Holds.InchandFeet();
                            break;
                            case 6:
                            measure = Holds.FeetandYards();
                            break;
                            case 7:
                            measure = Holds.YardsandMiles();
                            break;
                        }
                        if(way == true){
                            start += 1;
                        }
                        else{
                            start -= 1;
                        }
                        
                    }
                    System.out.println("Your new measurement is: " + measure + " " + convert);
                }
                    
            }else if(7 < unit.numberUnit() && unit.numberUnit() < 15){
                
            }            
        }
        catch(Exception e){
            System.out.println("YOU IDIOT!!!");
        }
    }
}