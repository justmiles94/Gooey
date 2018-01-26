using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace NetGUI
{
    public partial class ProfileForm : Form
    {
        private Dictionary<string, string> map;
        public string nextForm = "";

        public ProfileForm(Dictionary<string, string> map)
        {
            this.map = map;
            InitializeComponent();
        }
        public ProfileForm()
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
