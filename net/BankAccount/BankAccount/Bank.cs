
using System.Collections.Generic;


namespace BankAccount
{
    public class Bank
    {
        private readonly List<BankAccount> _listOfAccount;


        public Bank()
        {
            _listOfAccount = new List<BankAccount>();
        }


        public void AddAccount(BankAccount account)
        {
            _listOfAccount.Add(account);
        }

        public BankAccount FindAccount(string fname, string lname)
        {
            var banka = new BankAccount();
            foreach(var acc in _listOfAccount)
            {
                if(acc.FirstName.Equals(fname) && acc.LastName.Equals(lname))
                {
                    banka = acc;
                }
            }
            return banka;
        }
    }
}
