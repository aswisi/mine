using System;
namespace inhertiance
{
    public class Car : Vehicle
    {
        public Car(string regNUmber)
            :base(regNUmber)
        {
            Console.WriteLine("car is being initialized");
        }
    }
}
