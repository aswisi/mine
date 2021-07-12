using System.Collections.Generic;

namespace practice1
{
    public class Order
    {
        public int orders;
    }
    public class Customer
    {
        public int Id;
        public string Names;
        public List<Order> Orders;

        public Customer()
        {
            Orders = new List<Order>();

        }

        public Customer(int id): this() // causes the default constructor to run
        {
            this.Id = id;

        }

        


    }
}
