namespace WinFormsApp4
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();

            button1 = new Button();
            button1.Location = new Point(86, 94);
            button1.Name = "button1";
            button1.Size = new Size(147, 104);
            button1.TabIndex = 0;
            button1.Text = "button1";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            Controls.Add(button1);

            button3 = new Button();
            button3.Location = new Point(150, 150);
            button3.Name = "button2";
            button3.Size = new Size(180, 180);
            button3.TabIndex = 0;
            button3.Text = "button2";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button1_Click;
            Controls.Add(button3);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine("안냐심까 박명회입니다.");
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
