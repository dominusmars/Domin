using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Diagnostics;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConvertGui
{
    public partial class Length : Form
    {
        public Length()
        {
            InitializeComponent();    

        }

        private void btnMain_Click(object sender, EventArgs e)
        {
            MainMenu main = new MainMenu();
            main.Show();
            Hide();
        }
        private void ConvertUnit_SelectedIndexChanged(object sender, EventArgs e)
        {
            double frtNumber = double.Parse(frtNum.Text);
            String frtsUnit = numUnit.Text;
            if (frtNumber != 0 && frtsUnit != "")
            {
                String ConvertUnits = ConvertUnit.Text;
                JavaSend javaSend = new JavaSend(frtNumber, frtsUnit, ConvertUnits);
                String value = javaSend.JavaInput();
                convertNum.Text = value;
            }
        }

        private void frtNum_KeyPress_1(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) &&
                (e.KeyChar != '.'))
            {
                e.Handled = true;
            }
        }
    }
}
