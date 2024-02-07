using Oracle.ManagedDataAccess.Client;
using System.Data;
using System.Linq.Expressions;

namespace WinFormsApp2
{
    public partial class Form1 : Form
    {
        string connectionString = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.0.38)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";
        string strConnection = "DATA SOURCE=192.168.0.38; User Id=HR; Password=1234";
        OracleConnection conn;
        OracleCommand cmd;

        public Form1()
        {
            InitializeComponent();

            //주석처리단축키 ctrl + k +c
            //mbox tab tab
            //MessageBox.Show(strConnection);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                conn = new OracleConnection(strConnection);
                cmd = new OracleCommand();
                cmd.Connection = conn;
                conn.Open(); //db열기

                DataSet dataSet = new DataSet();
                string sql = "select * from emp";

                OracleDataAdapter adapter = new OracleDataAdapter();
                adapter.SelectCommand = new OracleCommand(sql, conn);
                adapter.Fill(dataSet);

                //추가
                dataGridView1.DataSource = dataSet.Tables[0];
                //MessageBox.Show(dataSet.Tables[0].ToString());
                conn.Close();//db닫기
            }
            catch (Exception ae)
            {
                Console.WriteLine(ae.StackTrace);
            }
            // MessageBox.Show("Test"+strConnection);

        }

    private void button2_Click(object sender, EventArgs e)
        {

        }
    }
}
