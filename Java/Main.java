import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try { 
            // Inputs the first measurement
           // System.out.println("Please enter the measurement.Format X unit (Length, Temperature, or Data):");
            Scanner measurement = new Scanner(System.in);
            String frt = measurement.nextLine();
            // asks the user what they want to convert it to
            //System.out.println("Please enter the unit you want to convert it to:");
            String convert = measurement.nextLine();
            String input[] = frt.split(" ", 2); // splits the input to an array
            double measure = Double.parseDouble(input[0]); // doubles the inputted number
            checkUnit unit = new checkUnit(input[1]);
            checkUnit convertCheckUnit = new checkUnit(convert);
            int start = unit.numberUnit();
            int goal = convertCheckUnit.numberUnit();
            // line 15 gets first unit, line 16 captures unit to convert to
            if (start == 0 || goal == 0) {
                System.out.println("Please enter correct units(mm,cm,m,km,inch,feet,yard,mile,");
                main(args);
            }
            boolean way = true; // boolean is used to tell the code which direction to convert in order. this
            // slows down the code but adds flexibility
            // here we start the maths!

            if (0 < start && start < 9) {

                if (!((start > 4 && goal < 5) || (start < 5 && goal > 4))) {
                    Length(start, measure, goal, convert);
                } else {
                    boolean direction = false;
                    if (0 < start && start < 5) {
                        direction = true;
                    }
                    ConvertImpandMet cons = new ConvertImpandMet(measure, direction, true);
                    switch (start) {
                    case 1:
                        measure = cons.MMandInch();
                        start = 5;
                        break;
                    case 2:
                        measure = cons.CMandFeet();
                        start = 6;
                        break;
                    case 3:
                        measure = cons.YardandM();
                        start = 7;
                        break;
                    case 4:
                        measure = cons.MileandKM();
                        start = 8;
                        break;
                    case 5:
                        measure = cons.MMandInch();
                        start = 1;
                        break;
                    case 6:
                        measure = cons.CMandFeet();
                        start = 2;
                        break;
                    case 7:
                        measure = cons.YardandM();
                        start = 3;
                        break;
                    case 8:
                        measure = cons.MileandKM();
                        start = 4;
                        break;

                    }
                    Length(start, measure, goal, convert);
                }
            } else if (8 < unit.numberUnit() && unit.numberUnit() < 16) {
                int loop = Math.abs(start - goal);
                if (start > goal) {
                    way = false;
                    start -= 1;
                }
                for (int i = 1; i <= loop; i++) {
                    ConvertData data = new ConvertData(measure, way);
                    switch (start) {
                    case 9:
                        measure = data.bitandByte();
                        break;
                    case 10:
                        measure = data.byteandKb();
                        break;
                    case 11:
                        measure = data.kbandMb();
                        break;
                    case 12:
                        measure = data.mbandGb();
                        break;
                    case 13:
                        measure = data.gbandTb();
                        break;
                    case 14:
                        measure = data.tbandPb();
                        break;

                    }
                    if (start != goal) {
                        if (way == true) {
                            start += 1;
                        } else {
                            start -= 1;
                        }
                    }
                }
                System.out.print(measure);
            }else if(15 < unit.numberUnit() && unit.numberUnit() <19){
                int loop = Math.abs(start - goal);
                if (start > goal) {
                    way = false;
                    start -= 1;
                }
                for (int i = 1; i <= loop; i++) {
                    Temp temp = new Temp(measure, way);
                    switch(start){
                        case 16:
                        measure = temp.FeraandCels();
                        break;
                        case 17:
                        measure = temp.CelsandKel();
                        break;
                    }
                    if (start != goal) {
                        if (way == true) {
                            start += 1;
                        } else {
                            start -= 1;
                        }
                    }
                }
                System.out.print(measure);

            }
        } catch (Exception e) {
            
        }
    }

    public static void Length(int start, double measure, int goal, String convert) {
        boolean way = true;
        int loop = Math.abs(start - goal);
        if (start > goal) {
            way = false; // false = up the ladder, true = down the ladder
            start -= 1;

        }
        int i;
        if (way == false) {
            i = 1;
        } else {
            i = 1;
        }
        for (; i <= loop; i++) {
            Metric Hold = new Metric(measure, way);
            Imperial Holds = new Imperial(measure, way);
            switch (start) {
            case 1:
                measure = Hold.MMandCM();
                break;
            case 2:
                measure = Hold.CMandM();
                break;
            case 3:
                measure = Hold.MandKM();
                break;
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
            if (start != goal) {
                if (way == true) {
                    start += 1;
                } else {
                    start -= 1;
                }
            }
        }
        System.out.print(measure);
    }

}