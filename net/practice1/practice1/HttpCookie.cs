using System.Collections.Generic;

namespace practice1

    //indexing 
{
    public class HttpCookie
    {
        private readonly Dictionary<string, string> _dictionary;


        public HttpCookie()
        {
            _dictionary = new Dictionary<string, string>();
        }

        //indexer method to set and get keys and values in dictionary 
        public string this[string key]
        {
            get { return _dictionary[key]; }
            set { _dictionary[key] = value; }
        }

    }

   
}
