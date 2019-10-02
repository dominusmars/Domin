using System;
using System.Diagnostics;
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
        public double JavaInput()
        {
            var process = System.Diagnostics.Process.Start(new ProcessStartInfo { RedirectStandardInput = true, RedirectStandardOutput = true, UseShellExecute = false, FileName = @"/c C:\Users\OneandOnly\Documents\Projects\Domin\Java\Main.java" });
            process.StandardInput.WriteLine(frtNum + " " + frtUnit);
            process.StandardInput.WriteLine(convertUnit);
            var response = double.Parse(process.StandardOutput.ReadLine());
            return response;
        }

    }
}

