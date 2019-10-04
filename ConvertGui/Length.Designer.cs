namespace ConvertGui
{
    partial class Length
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.frtNum = new System.Windows.Forms.TextBox();
            this.numUnit = new System.Windows.Forms.ComboBox();
            this.ConvertUnit = new System.Windows.Forms.ComboBox();
            this.convertNum = new System.Windows.Forms.Label();
            this.btnMain = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // frtNum
            // 
            this.frtNum.Location = new System.Drawing.Point(12, 12);
            this.frtNum.Name = "frtNum";
            this.frtNum.Size = new System.Drawing.Size(100, 20);
            this.frtNum.TabIndex = 0;
            this.frtNum.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.frtNum_KeyPress_1);
            // 
            // numUnit
            // 
            this.numUnit.FormattingEnabled = true;
            this.numUnit.Items.AddRange(new object[] {
            "mm",
            "cm",
            "m",
            "km",
            "inch",
            "feet",
            "yard",
            "mile"});
            this.numUnit.Location = new System.Drawing.Point(118, 12);
            this.numUnit.Name = "numUnit";
            this.numUnit.Size = new System.Drawing.Size(121, 21);
            this.numUnit.TabIndex = 1;
            // 
            // ConvertUnit
            // 
            this.ConvertUnit.FormattingEnabled = true;
            this.ConvertUnit.Items.AddRange(new object[] {
            "mm",
            "cm",
            "m",
            "km",
            "inch",
            "feet",
            "yard",
            "mile"});
            this.ConvertUnit.Location = new System.Drawing.Point(118, 39);
            this.ConvertUnit.Name = "ConvertUnit";
            this.ConvertUnit.Size = new System.Drawing.Size(121, 21);
            this.ConvertUnit.TabIndex = 2;
            this.ConvertUnit.SelectedIndexChanged += new System.EventHandler(this.ConvertUnit_SelectedIndexChanged);
            // 
            // convertNum
            // 
            this.convertNum.AutoSize = true;
            this.convertNum.Location = new System.Drawing.Point(44, 42);
            this.convertNum.Name = "convertNum";
            this.convertNum.Size = new System.Drawing.Size(35, 13);
            this.convertNum.TabIndex = 3;
            this.convertNum.Text = "label1";
            // 
            // btnMain
            // 
            this.btnMain.Location = new System.Drawing.Point(164, 66);
            this.btnMain.Name = "btnMain";
            this.btnMain.Size = new System.Drawing.Size(75, 23);
            this.btnMain.TabIndex = 4;
            this.btnMain.Text = "Main Menu";
            this.btnMain.UseVisualStyleBackColor = true;
            this.btnMain.Click += new System.EventHandler(this.btnMain_Click);
            // 
            // Length
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(252, 102);
            this.Controls.Add(this.btnMain);
            this.Controls.Add(this.convertNum);
            this.Controls.Add(this.ConvertUnit);
            this.Controls.Add(this.numUnit);
            this.Controls.Add(this.frtNum);
            this.Name = "Length";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "ConvertUnit";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox frtNum;
        private System.Windows.Forms.ComboBox numUnit;
        private System.Windows.Forms.ComboBox ConvertUnit;
        private System.Windows.Forms.Label convertNum;
        private System.Windows.Forms.Button btnMain;
    }
}