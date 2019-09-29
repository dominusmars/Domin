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
            //line 15 gets first unit, line 16 captures unit to convert to
            if(unit.numberUnit() == 0 || convertCheckUnit.numberUnit() == 0){
                System.out.println("Please enter correct units(mm,cm,m,km,inch,feet,yard,mile,");
                main(args);
            }

            boolean way = true; //boolean is used to tell the code which direction to convert in order. this slows down the code but adds flexibility
            if (unit.numberUnit()>= convertCheckUnit.numberUnit()){
                way = false;
            } 
            //Now we turn all the types into objects 
            if(unit.numberUnit() == 1-7){
                if((unit.numberUnit() != 1-3 && convertCheckUnit.numberUnit() != 4-7) || (unit.numberUnit() != 4-7 && convertCheckUnit.numberUnit() != 1-3)){
                    if(way == true){
                        for(int i = unit.numberUnit(); i <= convertCheckUnit.numberUnit();i++){
                            switch(unit.numberUnit()){
                                case 1:
                                
                                break;
                                case 2:

                                break;
                            }
                        }
                    }else{
                        for(int i = unit.numberUnit(); i >= convertCheckUnit.numberUnit();i--){
                            
                        }
                    }
                }

            }else if(unit.numberUnit() == 8-14){

            }
            
        

            
        }
        catch(Exception e){
            System.out.println("YOU IDIOT!!!");
        }
    }
}