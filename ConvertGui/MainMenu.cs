using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConvertGui
{
    public partial class MainMenu : Form
    {
        public MainMenu()
        {
            InitializeComponent();

        }

        private void btn_Length_Click(object sender, EventArgs e)
        {
            Length length = new Length();
            length.Show();
            Hide();
        }

        private void btn_Tempature_Click(object sender, EventArgs e)
        {
            Tempature tempature = new Tempature();
            tempature.Show();
            Hide();
        }
        private void btnData_Click(object sender, EventArgs e)
        {
            Data data = new Data();
            data.Show();
            Hide();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        

    }
}
