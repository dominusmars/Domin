public class Length{
    int start;
    int goal;
    int loop;
    boolean way;
    String convert;
    double measure;
    public Length(int start, double measure, int goal, boolean way, int loop, String convert){
        this.start = start;
        this.goal = goal;
        this.measure = measure;
        this.loop = loop;
        this.way = way;
        this.convert = convert;
    }
    public void conLength(){
            
            if(0 < start && start < 9){
                
                if(!((start > 3 && goal < 5) || (start < 5 && goal > 3))){
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
                }else{
                    boolean direction = false;
                    if (0 < start && start < 5){
                        direction = true;
                    }
                    ConvertImpandMet cons = new ConvertImpandMet(measure, direction,true);
                    switch(start){
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
                    conLength();
                }
               
    }
}
}