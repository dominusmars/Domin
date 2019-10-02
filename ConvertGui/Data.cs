using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConvertGui
{
    public partial class Data : Form
    {
        public Data()
        {
            InitializeComponent();
        }

        private void btnMain_Click(object sender, EventArgs e)
        {
            MainMenu main = new MainMenu();
            main.Show();
            Hide();
        }
        public string numUnit_SelectedIndexChanged(object sender, EventArgs e)
        {
            String frtUnit = numUnit.Text;
            return frtUnit;
        }

        public double frtNum_TextChanged(object sender, EventArgs e)
        {
            String frtNumb = frtNum.Text;
            double frtNumber = double.Parse(frtNumb);
            return frtNumber;
        }
        private void ConvertUnit_SelectedIndexChanged(object sender, EventArgs e)
        {
            double frtNumber = double.Parse(frtNum.Text);
            String frtsUnit =  numUnit.Text;
            if (frtNumber != 0 && frtsUnit != "")
            {
                JavaSend javaSend = new JavaSend(frtNumber, frtsUnit, ConvertUnit.Text);
                double value = javaSend.JavaInput();
                convertNum.Text = value.ToString();
            }
        }

        private void convertNum_Click(object sender, EventArgs e)
        {

        }


    }
}
