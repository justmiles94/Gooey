using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace NetGUI
{
    public partial class MenuForm : Form
    {
        private Dictionary<string, string> map;
        public string nextForm = "";

        public MenuForm(Dictionary<string, string> map)
        {
            this.map = map;
            InitializeComponent();
        }

        public MenuForm()
        {
            InitializeComponent();
        }

        private void homeButton_Click(object sender, EventArgs e)
        {
            Text = "home";
            this.Close();
        }

        private void profileButton_Click(object sender, EventArgs e)
        {
            Text = "profile";
            this.Close();
        }
    }
}
