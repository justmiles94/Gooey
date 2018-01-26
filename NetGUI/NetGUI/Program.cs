using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace NetGUI
{
    static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            string name;
            MenuForm menu = new MenuForm();

        }

        static void mapRunner()
        {
            Dictionary<string, string> map = new Dictionary<string, string>();
            map["form"] = "menu";
            while (!map["form"].Equals(""))
            {
                switch (map["form"])
                {
                    case "menu":
                        Application.Run(new MenuForm(map));
                        break;
                    case "home":
                        Application.Run(new HomeForm(map));
                        break;
                    case "profile":
                        Application.Run(new ProfileForm(map));
                        break;
                }
            }
        }
    }
}
