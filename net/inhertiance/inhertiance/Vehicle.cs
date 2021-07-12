using System;

namespace inhertiance
{
    public class Vehicle
    {
        private readonly string _regNumber;
        public Vehicle()
        {
            Console.WriteLine("car is being initalized");
        }

        public Vehicle(string regNumber)
        {
            _regNumber = regNumber;
        }
    }
}
