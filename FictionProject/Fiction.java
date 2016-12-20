import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fiction
{
    private String[][] answerCases= {
            {"right", "his", "john"}, //John
            {"mary", "left", "her", "mary's", "marys"}, //doMaryHome 
            {"alone", "separate", "part", "different"}, //doJohnAlone 
            {"eat", "sandwich", "shop", "food", "forward", "cross", "across", "dinner", "lunch"}, //Sandwich
            {"climb", "tree", "oak"}, //climb tree
            {"walk"}, //walk
            {"kill", "suicide", "escape", "himself", "myself", "give up"}, //suicide
            {"stay", "nothing", "sit", "lay", "stop"}, //nothing
            {"back", "funeral", "grave", "cemetery", "church"}, //funeral
            {"home", "house", "leave"}}; //exceptions
    private ArrayList<String> response;
    public static void main(String[] args)
    {
        System.out.println("This is going to be how many characters normally fit across the screen when you run the program");
        //Fiction projectIF = new Fiction();
        
    }
    
    public void Fiction()
    {
        Scanner s = new Scanner(System.in);
        while(s.hasNext())
        {
            this.response.add(s.next());
        }
        s.close();
        this.chooseEnding();
    }
    
    public void chooseEnding()
    {
        int[] numResults = new int[10];
        for(int i = 0; i < this.answerCases.length; i++)
        {
            numResults[i] = this.lookForResponse(answerCases[i]);
        }
        int highestResult = 0;
        int position = 10;
        for(int i = 0; i < numResults.length -1 ; i++) //-1 to not include exceptions
        {
            if(numResults[i] > highestResult)
            {
                highestResult = numResults[i];
                position = i;
            }
        }
        switch(position)
        {
            case 0:
            {
                this.togetherOrSeparateJohn();
                break;
            }
            case 1:
            {
                this.maryHome();
                break;
            }
            case 2:
            {
                this.johnAlone();
                break;
            }
            case 3:
            {
                this.eatSandwich();
                break;
            }
            case 4:
            {
                this.climbTree();
                break;
            }
            case 5:
            {
                this.walk();
                break;
            }
            case 6:
            {
                this.suicide();
                break;
            }
            case 7:
            {
                this.nothing();
                break;
            }
            case 8:
            {
                this.toFuneral();
                break;
            }
            case 9:
            {
                this.whoseHouse();
            }
            default:
            {
                this.solveExceptions();
            }
        }
    }
    
    public int lookForResponse(String[] scenario)
    {
        int numResults = 0;
        for(int i = 0; i < scenario.length; i++)
        {
            for( int ii = 0; ii< this.response.size(); ii++)
            {
                if (scenario[i].equals(this.response.get(ii)))
                {
                    numResults++;
                }
            }
        }
        return numResults;
    }
    
    public void whoseHouse()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Who's house: Mary or John's? ");
        String answer = s.next();
        s.close();
        if(answer.equals("Mary") || answer.equals("mary") || answer.equals("Mary's") || answer.equals("Marys") || answer.equals("marys") || answer.equals("mary's"))
        {
            this.maryHome();
        }
        else if(answer.equals("John") || answer.equals("john") || answer.equals("John's") || answer.equals("Johns") || answer.equals("johns") || answer.equals("john's"))
        {
            this.johnHome();
        }
        else
        {
            this.whoseHouse();
        }
    }
    
    public void togetherOrSeparateJohn()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Do you want Mary to come? ");
        String answer = s.next();
        if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Mary"))
        {
            this.johnHome();
        }
        else if(answer.equals("no") || answer.equals("No") || answer.equals("alone"))
        {
            this.johnAlone();
        }
        else
        {
            this.togetherOrSeparateJohn();
        }
    }
    
    public void johnHome()
    {
        
    }
    
    public void maryHome()
    {
        
    }
    
    public void johnAlone()
    {
        
    }
    
    public void eatSandwich()
    {
        
    }
    
    public void climbTree()
    {
        
    }
    
    public void walk()
    {
        
    }
    
    public void suicide()
    {
        
    }
    
    public void nothing()
    {
        
    }
    
    public void toFuneral()
    {
        
    }
    
    public void solveExceptions()
    {
        
    }
    
    public void reset()
    {
        this.response.clear();
    }
}
