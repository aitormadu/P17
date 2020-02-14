package p17function;

import java.util.Scanner;
import java.text.DecimalFormat;

public class P17Function {

     static Scanner keyboard = new Scanner(System.in);
     
   public static void main(String[] args) {
        int euro, num = 0;
        String euro1;
        float euro2;
        char letter;
        String name;
        String results;
        System.out.println("Author: Aitor Madu");
        DecimalFormat df = new DecimalFormar("0.00");
        int option = -1;
        keyboard.useDelimiter("\n");
       do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.print("How many euro? ");
                    euro = keyboard.nextInt();
                    float result = Function1(euro);
                    System.out.print(euro + "€ " + " = " + df.format(result) + "$");
                    break;

                case 2:
                    System.out.print("How many euro? ");
                    euro = keyboard.nextInt();
                    double result2 = Function2(euro);
                    System.out.println(euro + "€ " + " = " + df.format(result2) + "$");
                    break;
                case 3:
                    System.out.print("How many euro? ");
                    euro = keyboard.nextInt();
                    Function3(euro);
                    break;
                case 4:
                    System.out.print("How many euro? ");
                    euro1 = keyboard.next();
                    int result4 = Function4(euro1);
                    System.out.println(euro1 + "€ " + " = " + result4 + "$");
                    break;
                case 5:
                    System.out.print("How many euro? ");
                    euro2 = keyboard.nextInt();
                    int result5 = Function5(euro2);
                    System.out.println(df.format(euro2) + "€ " + " = " + result5 + "$");
                    break;
                case 6:
                    System.out.println("How many euro? ");
                    euro2 = keyboard.nextFloat();
                    Function6(euro2);
                    break;
                case 7:
                    System.out.println("Letter ?: ");
                    letter = (keyboard.next()).charAt(0);
                    String letterBinary=Integer.toBinaryString(letter);
                    System.out.println(letter + "="+ letterBinary);
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Word?: ");
                    String str=keyboard.next();
                    String resulto = Function8 (str);
                    System.out.println(resulto);
                break;    
                case 9:
                     int numChar;
                    do {
                        System.out.print("Give a number between 0 and 255: ");
                        numChar = keyboard.nextInt();
                    } while (numChar > 255 || 0 > numChar);
                    String numconv = Function9 (numChar);
                    System.out.println(numconv);
                    System.out.println();
                break;
                case 10:
                    Function10();
                break;
                       
                
                default:
                    System.out.println("Option not available :(");
            }
            /*System.out.println("Press any key to continue.");
            String key = keyboard.next();*/
       }while (option !=0);
}
    private static void userMenu() {
        System.out.println("Option1- Int-Float:");
        System.out.println();
        System.out.println("Option2- Int-Double:");
        System.out.println();
        System.out.println("Option3- Int-String");
        System.out.println();
        System.out.println("Option4- String - Int");
        System.out.println();
        System.out.println("Option5- Float - Int");
        System.out.println();
        System.out.println("Option6- Float - String");
        System.out.println();
        System.out.println("Option7- Char:");
        System.out.println();
        System.out.println("Option8- Char - Binary");
        System.out.println();
        System.out.println("Option9- Int - Char");
        System.out.println();
        System.out.println("Option10- Char - Int");
        System.out.println();
        System.out.print("\nSelect an option:");
    }
    
    private static float conversorEdgar (int euro){
        float result=0;
        result = (float) euro/0.91f;
        return result;
    }

    //function CalculoPVP
    private static double functionMarc(double price, double iva) {
        double PVP = 0;
        PVP = price + price * (iva / 100);
        int x=(int) 6.8;
        return PVP;
    }

    public static void methodAitor(double price, double iva, double res) {
        System.out.println(ANSI_CYAN + "price: " + price + ANSI_GREEN+ " iva: " + iva + ANSI_RED+ " res: " + res);
    }  
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

   private static float Function1(int euro) {
        float result = 0;
        result = euro / 0.91f; //cast          
        return result;
    }

    private static double Function2(int euro) {
        double result2 = 0;
        result2 = euro / (double) 0.91;

        return result2;
    }

    private static String Function3(int euro) {
        String result3 = Integer.toString(euro);
        System.out.println(euro + " € " + " = " + result3 + " $");

        return result3;
    }

    private static int Function4(String euro1) {
        int result4;
        result4 = Integer.parseInt(euro1);

        return result4;
    }

    private static int Function5(float euro2) {
        int result5 = 0;
        result5 = (int) (euro2 / 0.91); //cast       
        return result5;
    }

    private static String Function6(float euro2) {
        String result6 = Float.toString(euro2);
        System.out.println(euro2 + " € " + " = " + result6 + " $");

        return result6;
    }

    private static String Function7(char letter) {
        String letterB = Integer.toBinaryString(letter);
        System.out.println(letter + " = " + letterB);
        
        return letterB;
    }
    
    private static String Function8 (String str){
        String result = "";
        
        String letterBinary;
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result += Integer.toBinaryString(ch) + " ";
            
        }
        Integer.toBinaryString(ch);
        
        return result;
    }
    
    private static String Function9(int numberintchar){
        String aChar = new Character((char) numberintchar).toString();
        return aChar;
    }
    
    private static void Function10(){
        System.out.println("---------");
        for(int i=0; i<255; i++){
            System.out.println(i + "\t" + Integer.toString(i, 16) + " = " + (char)i );
        }
    }
    

    private static void functionFloatString(float euro2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void functionChar(char letter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void functionFloatInt(float euro2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void functionStringInt(String euro1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void functionIntString(int euro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void functionIntDouble(int euro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void functionIntFloat(int euro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class DecimalFormar extends DecimalFormat {

        public DecimalFormar(String string) {
        }
    }
    
}
