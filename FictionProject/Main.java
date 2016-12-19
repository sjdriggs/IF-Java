import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        String[][] answerCases = {
            {""}; //doJohnHome
            {"mary", "left"}; //doMaryHome 
            {"alone", "separate", "part"}; //doJohnAlone 
            {"eat", "sandwich", "shop", "food"}; //Sandwich
            {"climb", "tree",}; //climb tree
            {"walk"}; //walk
            {"kill", "suicide", "escape"}; //suicide
            {"", "stay", "nothing"}; //nothing
            {"back", "funeral", "grave", "cemetery", "church"}; //funeral
            {"home", "go", "john", "house"}; //exceptions
        }
        Scanner s = new Scanner(System.in);
        ArrayList<String> response = new ArrayList<String>();
        Main main = new Main(); 
        while(s.hasNext())
        {
            response.add(s.next());
        }
        for(String[] answer: response)
        {
            for(String word: answer)
            {
                main.lookForResponse(word, 
            }
        }
    }
   }
    
    public void main()
    {
    }
    
    public String lookForResponse(String response, String[] cases)
    {
        for(int i = 0; i < cases.length; i++)
        {
            if(response.equals(cases[i]))
            {
                return 
            }
        }
    }
    
    public static void johnHome()
    {
    }
    
    public static void maryHome()
    {
    }
    
    public static void johnAlone()
    {
    }
    
    public static void eatSandwich()
    {
    }
    
    public static void climbTree()
    {
    }
    
    public static void walk()
    {
    }
    
    public static void suicide()
    {
    }
    
    public static void nothing()
    {
    }
    
    public static void toFuneral()
    {
    }
}
