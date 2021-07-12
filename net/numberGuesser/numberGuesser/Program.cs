using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace numberGuesser
{
    class Program
    {
        static void Main(string[] args)
        {
            GetAppInfo();

            Console.WriteLine("what is your name?");
            string input = Console.ReadLine();

            Console.WriteLine("Hello {0}, let's play a game...", input);

            while (true)
            {
                Random random = new Random();
                int correctNumber = random.Next(1, 10);
                int guess = 0;

                Console.WriteLine("Guess a number between 1 and 10");
                while (guess != correctNumber)
                {
                    string answer = Console.ReadLine();
                    if (!int.TryParse(answer, out guess))
                    {
                        Console.ForegroundColor = ConsoleColor.Red;
                        Console.WriteLine("It's not a number");
                        Console.ForegroundColor = ConsoleColor.White;
                        continue;
                    }
                    guess = Int32.Parse(answer);
                    if (guess != correctNumber)
                    {
                        Console.ForegroundColor = ConsoleColor.Red;
                        Console.WriteLine("Not the correct number!");
                        Console.ForegroundColor = ConsoleColor.White;
                    }
                    else
                    {
                        Console.ForegroundColor = ConsoleColor.Green;
                        Console.WriteLine("Guessed correctly!!!");
                    }
                }

                Console.WriteLine("Play again? Y or N");
                string reply = Console.ReadLine().ToUpper();
                if (reply == "Y")
                {
                    continue;
                }
                else if(reply == "N")
                {
                    return;
                }
                else
                {
                    return;
                }
            }            
        }

        static void GetAppInfo()
        {
            string appName = "Number Guesser";
            string version = "1.0.0";
            string author = "me";

            //change text color
            Console.ForegroundColor = ConsoleColor.Green;
            Console.WriteLine("{0}: Version {1} by {2}", appName, version, author);
            Console.ForegroundColor = ConsoleColor.White; //or Console.ResetColor();
        }
    }
}
