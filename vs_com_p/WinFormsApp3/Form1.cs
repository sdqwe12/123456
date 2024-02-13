namespace WinFormsApp3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show(((Button)sender).ToString());
            MessageBox.Show(tv.Text);
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            //int num1 = int.parse(tv_num1.text);
            //int num2 = int.parse(tv_num2.text);

            int num1;
            int num2;

            int.TryParse(tv_num1.Text.ToString(), out num1);
            int.TryParse(tv_num2.Text.ToString(), out num2);

            MessageBox.Show("더하기" + (num1+num2));
            lb_result.Text = (num1 + num2)+"";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            int num1;
            int num2;

            int.TryParse(tv_num1.Text.ToString(), out num1);
            int.TryParse(tv_num2.Text.ToString(), out num2);

            MessageBox.Show("빼기" + (num1 - num2));
            lb_result.Text = (num1 - num2) + "";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            try
            {
                //int num1 = int.Parse(tv_num1.Text);
                //int num2 = int.Parse(tv_num2.Text);

                int num1;
                int num2;

                int.TryParse(tv_num1.Text.ToString(), out num1);
                int.TryParse(tv_num2.Text.ToString(), out num2);

                MessageBox.Show("나누기" + (num1 / num2));
                lb_result.Text = (num1 / num2) + "";
            }
            catch (Exception)
            {
                MessageBox.Show("0으로 나눌 수 없습니다");

            }
            
        }
        private void button5_Click(object sender, EventArgs e)
        {
            int num1;
            int num2;

            int.TryParse(tv_num1.Text.ToString(), out num1);
            int.TryParse(tv_num2.Text.ToString(), out num2);

            MessageBox.Show("곱하기" + (num1 * num2));
            lb_result.Text = (num1 * num2)+"";
        }
    }
}
