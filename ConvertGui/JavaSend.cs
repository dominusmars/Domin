using System;
using System.Text;
using System.Diagnostics;
using System.Windows.Forms;
using System.IO;
using System.Reflection;
using System.Security.Policy;
namespace ConvertGui { 
    internal class JavaSend {
        private readonly double frtNum;
        private readonly String frtUnit;
        private readonly String convertUnit;
        public JavaSend(double frtNum, String frtUnit, String ConvertUnit)
        {
            this.frtNum = frtNum;
            this.frtUnit = frtUnit;
            this.convertUnit = ConvertUnit;
        }
        public String JavaInput()
        {
            //OpenFileDialog openFile = new OpenFileDialog();
           // openFile.InitialDirectory = "\\Resources\\ConvertUnits.jar";
            String filename = Application.StartupPath + "\\Resources\\ConvertUnits.jar";
            var process = new Process();
            process.StartInfo = new ProcessStartInfo(){
                RedirectStandardInput = true ,
                RedirectStandardOutput = true,
                UseShellExecute = false,
                FileName = "javaw"
            };
            process.StartInfo.Arguments = " -jar " + filename;
            process.Start();
            process.EnableRaisingEvents = false;
            process.StandardInput.WriteLine(frtNum + " " + frtUnit);
            process.StandardInput.WriteLine(convertUnit);
            var response = process.StandardOutput.ReadLine();
            return response;
        }

    }
}

