namespace ConvertGui
{
    partial class MainMenu
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
            this.btn_Length = new System.Windows.Forms.Button();
            this.btn_Tempature = new System.Windows.Forms.Button();
            this.btnData = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btn_Length
            // 
            this.btn_Length.BackColor = System.Drawing.SystemColors.Control;
            this.btn_Length.ForeColor = System.Drawing.SystemColors.ControlText;
            this.btn_Length.Location = new System.Drawing.Point(12, 12);
            this.btn_Length.Name = "btn_Length";
            this.btn_Length.Size = new System.Drawing.Size(75, 23);
            this.btn_Length.TabIndex = 0;
            this.btn_Length.Text = "Length";
            this.btn_Length.UseVisualStyleBackColor = false;
            this.btn_Length.Click += new System.EventHandler(this.btn_Length_Click);
            // 
            // btn_Tempature
            // 
            this.btn_Tempature.Location = new System.Drawing.Point(93, 12);
            this.btn_Tempature.Name = "btn_Tempature";
            this.btn_Tempature.Size = new System.Drawing.Size(75, 23);
            this.btn_Tempature.TabIndex = 1;
            this.btn_Tempature.Text = "Tempature";
            this.btn_Tempature.UseVisualStyleBackColor = true;
            this.btn_Tempature.Click += new System.EventHandler(this.btn_Tempature_Click);
            // 
            // btnData
            // 
            this.btnData.Location = new System.Drawing.Point(175, 12);
            this.btnData.Name = "btnData";
            this.btnData.Size = new System.Drawing.Size(75, 23);
            this.btnData.TabIndex = 2;
            this.btnData.Text = "Data";
            this.btnData.UseVisualStyleBackColor = true;
            this.btnData.Click += new System.EventHandler(this.btnData_Click);
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(175, 92);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(75, 23);
            this.btnExit.TabIndex = 3;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // MainMenu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(268, 127);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.btnData);
            this.Controls.Add(this.btn_Tempature);
            this.Controls.Add(this.btn_Length);
            this.Name = "MainMenu";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "ConvertUnits";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btn_Length;
        private System.Windows.Forms.Button btn_Tempature;
        private System.Windows.Forms.Button btnData;
        private System.Windows.Forms.Button btnExit;
    }
}

