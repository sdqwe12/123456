using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1.file
{
    internal class filecontrol
    {
        /*
         */
        string filepath = "data.txt";
      public void write(string text)
        {
            Console.WriteLine($"write{text}");
            File.WriteAllText(filepath, text);
        }
        public void read()
        {
            Console.WriteLine("read");
            string text = File.ReadAllText(filepath);
            Console.WriteLine($"text = {text}");
        }
    }
}
