package keywordsandexpressions;

public class KeywordsAndExpressions {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50; //expression is highScore = 50
        if (highScore == 50) { //expression is highScore == 50
            System.out.println("This is an expression"); //expression is in brackets
        }

        //StatementsWhiteSpaceAndIndenting
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is"
                + "another"
                + "still more.");
        int anotherVariable = 50; myVariable--;System.out.println("This is another one"); // <---- dont do this
        
        
        }
/*

never do this. HARD to READ   
double kilometres = (100 * 1.609344);
int highScore = 50; //expression is highScore = 50
if (highScore == 50) { //expression is highScore == 50
System.out.println("This is an expression"); //expression is in brackets
}

//StatementsWhiteSpaceAndIndenting
int myVariable = 50;
myVariable++;
myVariable--;
System.out.println("This is a test");

System.out.println("This is"
+ "another"
+ "still more.");
int anotherVariable = 50; myVariable--;System.out.println("This is another one"); // <---- dont do this
*/
}
