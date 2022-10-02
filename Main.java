import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner answer = new Scanner(System.in);

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    
      System.out.println("\033[3mTHE S.I.M.P TEST- Version 1\033[0m");
    System.out.println("---------------------------------");
    System.out.println("You may think you're smart, but are you? This test will assess your skills in math and some other things as well. This is the Super Important Math Preparation (S.I.M.P) Test. Doing well on this test will mean you can succeed on any test in the future.");
    System.out.println();
    System.out.println("What is your name?");
    String name = answer.nextLine();
    System.out.println();
    System.out.println("Hi "+name+". I hope you are having a good day. We will get you started shortly.");
    System.out.println("To get you warmed up, let's see if you can answer these questions.");
    System.out.println();
    System.out.println("What is 1+1?");
    String s = answer.nextLine();
    if (s.endsWith("2") && s.startsWith("2"))
    {
      System.out.println("Correct! You're doing great so far.");
    }
    else
    {
      System.out.println("Incorrect. It's okay. You're only warming up.");
    }
    System.out.println();
    System.out.println("Next question: What is the answer to 2 x 3?");
    String ss = answer.nextLine();
    if (ss.endsWith("6") && ss.startsWith("6"))
    {
      System.out.println();
      System.out.println("Awesome! You're on a roll!");
    }
    else
    {
      System.out.println();
      System.out.println("Incorrect! It's okay. Everyone struggles with the warm up. I'm sure you'll do great on the test.");
    }
    //\033[3mText goes here\033[0m -- This is used to italicize text.
    System.out.println();
    System.out.println("Nice work on the warmup.");
    
    System.out.println();
    System.out.println();
    
   System.out.println("Are you ready to begin?");
    System.out.println("1. Yes");
    System.out.println("2. No");
    String q = answer.nextLine();
    if ((q.startsWith("1") && q.endsWith("1")) || (q.startsWith("1.") && q.endsWith("1.")) || (q.startsWith("Yes") && q.endsWith("Yes")) || (q.startsWith("yes") && q.endsWith("yes")) || (q.startsWith("1. Yes") && q.endsWith("1. Yes")) || (q.startsWith("1. yes") && q.endsWith("1. yes")))
    {
      System.out.println();
System.out.println("Awesome! 👍");
    }
    else
    {
      System.out.println();
      System.out.println("Why not? What's your excuse?");
      String excuse = answer.nextLine();
      System.out.println();
        
      System.out.println("Well, \""+excuse+"\" is not a good excuse to not take this test. Don't sweat it. You'll do fine!");
    }
    System.out.println();
      System.out.println("The test is about to begin. Is there anything else you wanna say?");
    String lastWords = answer.nextLine();
    System.out.println("Ok! Good luck! 😉");
    System.out.println("\033[3mNote: You will not be able to change your answer once you have entered it in, so make sure you are confident about your answer before pressing enter.\033[0m");
   System.out.println("------------------------------");
    System.out.println();
    System.out.println();
    System.out.println();
    int score = 0;
System.out.println();
    System.out.println();
    System.out.println("Question 1:  Joe has 6 marbles in a bag (1 blue, 2 green, 3 red). What is the probability that Joe will draw a blue marble, put the marble back, then draw a green marble?");
    System.out.println("\033[3mFor multiple choice questions like these, just type in the letter corresponding to the answer choice for your answer. For example, if the answer is A, type in \"A\".\033[0m)");
    System.out.println("A. 1/3");
    System.out.println("B. 1/18 ");
    System.out.println("C. 1/6");
    System.out.println("D. 1/36");
  String a1= answer.nextLine();
    if ((a1.startsWith("B")&&a1.endsWith("B")) || (a1.startsWith("b")&&a1.endsWith("b")))
    {
      score++;
      String result1 = "Correct";
    }
    else
    {
      String result1 = "Incorrect";
    }
    
    
    System.out.println();
    System.out.println();
  System.out.println("Question 2: A ball is thrown up from a height 3 feet with a speed of 125.877 meters per second. What is the speed of the ball when it comes back down to height 3 feet?");
    System.out.println("A. 125.877 meters per second");
    System.out.println("B. 67.051 meters per second");
    System.out.println("C. 83.389 meters per second");
    System.out.println("D. 105.144 meters per second");
  String a2= answer.nextLine();
    if ((a2.startsWith("A")&&a2.endsWith("A")) || (a2.startsWith("a")&&a2.endsWith("a")))
    {
      score++;
      String result2 = "Correct";
    }
    else
    {
      String result2 = "Incorrect";
    }

    System.out.println();
    System.out.println();
  System.out.println("Question 3: Solve this equation for the value of x. ");
    System.out.println("3x+5=4x-9");
    System.out.println("A. 4");
    System.out.println("B. 6");
    System.out.println("C. 2");
    System.out.println("D. 14");
  String a3= answer.nextLine();
    if ((a3.startsWith("D")&&a3.endsWith("D")) || (a3.startsWith("d")&&a3.endsWith("d")))
    {
      score++;
      String result3 = "Correct";
    }
    else
    {
      String result3 = "Incorrect";
    }
    
    
    System.out.println();
    System.out.println();
  System.out.println("Question 4: Which one of these equations is NOT correct?");
    System.out.println("A. 2(x+1) = 2x+2");
    System.out.println("B. (2.5+1)+4 = 2.5+(1+4)");
    System.out.println("C. 2+2 = 2x2");
    System.out.println("D. 15/20 = 20/15");
  String a4= answer.nextLine();
    if ((a4.startsWith("D")&&a4.endsWith("D")) || (a4.startsWith("d")&&a4.endsWith("d")))
    {
      score++;
      String result4 = "Correct";
    }
    else
    {
      String result4 = "Incorrect";
    }

    
    System.out.println();
    System.out.println();
  System.out.println("Question 5: A triangle with 3 equal sides and angles is known as a(n) ____ triangle");
    System.out.println("A. isoceles");
    System.out.println("B. scalene");
    System.out.println("C. equilateral");
    System.out.println("D. perfect");
  String a5= answer.nextLine();
    if ((a5.startsWith("C")&&a5.endsWith("C")) || (a5.startsWith("c")&&a5.endsWith("c")))
    {
      score++;
      String result5 = "Correct";
    }
    else
    {
      String result5 = "Incorrect";
    }
    
    
    System.out.println();
    System.out.println();
  System.out.println("Question 6: if a = 2, b = 1, and c = 3, what is the result of b + (a x c)");
    System.out.println("A. 7");
    System.out.println("B. 6");
    System.out.println("C. 5");
    System.out.println("D. 8");
  String a6= answer.nextLine();
    if ((a6.startsWith("A")&&a6.endsWith("A")) || (a6.startsWith("a")&&a6.endsWith("a")))
    {
      score++;
      String result6 = "Correct";
    }
    else
    {
      String result6 = "Incorrect";
    }


    
  }
}
 //\033[3mText goes here\033[0m -- This is used to italicize text.
