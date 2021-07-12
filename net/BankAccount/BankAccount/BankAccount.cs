using System;

namespace BankAccount
{
    public class BankAccount
    {
        private readonly String firstName;
        private readonly String lastName;
        private int accountValue;

        public String FirstName { get { return firstName; } }
        public String LastName { get { return lastName; } }
        public int AccountValue { get { return accountValue; } }

        public BankAccount()
        {
            firstName = "NA";
            lastName = "NA";
            accountValue = 0;
        }

        public BankAccount(String fName, String lName)
        {
            firstName = fName;
            lastName = lName;
            accountValue = 0;
        }

        public void DepositMoney(int money)
        {
            accountValue += money;
            Console.WriteLine("${0} has been deposited to your account.", money);
            Console.WriteLine("Current account value is ${0}", accountValue);
        }

        public void WithdrawMoney(int money)
        {
            accountValue -= money;
            Console.WriteLine("${0} has been withrawn from your account.", money);
            Console.WriteLine("Current account value is ${0}", accountValue);
        }

        public void AccountInfo()
        {
            Console.WriteLine("Name: {0}, {1}", lastName, firstName);
            Console.WriteLine("Account Balance: ${0}", accountValue);
        }




    }
}
