using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WindowsFormsApp1.file;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        filecontrol fc = new filecontrol();
        List<string> list = new List<string>() { "홍길동", "김길동", "이길동" };
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
        }

        private void button2_Click(object sender, EventArgs e)
        {

        }
        private void 불러오기_Click(object sender, EventArgs e)
        {
            fc.read();
            
        }
        private void 파일쓰기_Click(object sender, EventArgs e)
        {
           if(textBox1.Text=="")
            {
                MessageBox.Show("글자를 입력하세요.");
                return;
            }
            fc.write(textBox1.Text);

            list.Add(textBox1.Text);
            listBox1.DataSource = null;
            listBox1.DataSource = list;
            textBox1.Text = "";
            //listBox1.Items.Add("추가");

        }
    }
}
