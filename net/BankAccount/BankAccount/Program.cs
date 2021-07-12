using System;


namespace BankAccount
{
   


    class Program
    {
        static void Main(string[] args)
        {
            var account = new BankAccount("bob", "man");
            account.DepositMoney(100);
            account.WithdrawMoney(27);
            account.DepositMoney(200);
            account.DepositMoney(738);
            Console.WriteLine("\n\n");
            account.AccountInfo();
            

        }
    }
}
