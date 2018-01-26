using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace NetGUI
{
    public partial class HomeForm : Form
    {
        private Dictionary<string, string> map;
        public string nextForm = "";

        public HomeForm(Dictionary<string, string> map)
        {
            this.map = map;
            InitializeComponent();
        }

        public HomeForm()
        {
            InitializeComponent();
        }

        private void backButton_Click(object sender, EventArgs e)
        {
            Text = "menu";
            this.Close();
        }
    }
}
