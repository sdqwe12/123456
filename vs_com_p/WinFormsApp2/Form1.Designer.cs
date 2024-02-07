namespace WinFormsApp2
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            button1 = new Button();
            button2 = new Button();
            listBox1 = new ListBox();
            dataGridView1 = new DataGridView();
            button3 = new Button();
            ((System.ComponentModel.ISupportInitialize)dataGridView1).BeginInit();
            SuspendLayout();
            // 
            // button1
            // 
            button1.Font = new Font("휴먼둥근헤드라인", 12F, FontStyle.Bold);
            button1.Location = new Point(278, 379);
            button1.Name = "button1";
            button1.Size = new Size(130, 50);
            button1.TabIndex = 0;
            button1.Text = "조회";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Font = new Font("휴먼둥근헤드라인", 12F, FontStyle.Bold);
            button2.Location = new Point(617, 379);
            button2.Name = "button2";
            button2.Size = new Size(130, 50);
            button2.TabIndex = 1;
            button2.Text = "button2";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // listBox1
            // 
            listBox1.FormattingEnabled = true;
            listBox1.ItemHeight = 15;
            listBox1.Location = new Point(63, 47);
            listBox1.Name = "listBox1";
            listBox1.Size = new Size(290, 289);
            listBox1.TabIndex = 2;
            // 
            // dataGridView1
            // 
            dataGridView1.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dataGridView1.Location = new Point(376, 47);
            dataGridView1.Name = "dataGridView1";
            dataGridView1.Size = new Size(316, 290);
            dataGridView1.TabIndex = 3;
            // 
            // button3
            // 
            button3.Font = new Font("휴먼둥근헤드라인", 12F, FontStyle.Bold);
            button3.Location = new Point(63, 379);
            button3.Name = "button3";
            button3.Size = new Size(130, 50);
            button3.TabIndex = 4;
            button3.Text = "button3";
            button3.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button3);
            Controls.Add(dataGridView1);
            Controls.Add(listBox1);
            Controls.Add(button2);
            Controls.Add(button1);
            Name = "Form1";
            Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)dataGridView1).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private Button button1;
        private Button button2;
        private ListBox listBox1;
        private DataGridView dataGridView1;
        private Button button3;
    }
}
