import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import Assist.User_Linkedlist;


public class Register_data 
{
	Connection dbcon = null;
	Statement stmt = null;
	String driver = "com.mysql.jdbc.Driver";
	String scon = "jdbc:mysql://localhost:3306/database?user=root&password=power0515";
	ResultSet rs;
	ResultSetMetaData md = null;
	User_Linkedlist list = new User_Linkedlist();
	public String[][] array_users;
	int load = 0;//監控次數
	public Register_data() 
	{
		link_load();
	}
	public void update()
	{
		
	}
	public boolean add(String name,String account, String passwd) throws ClassNotFoundException
	{
		String searchSQL = "SELECT * FROM tb_database";
		String addSQL = "INSERT INTO tb_database(tb_name,tb_account,tb_passwd,tb_money)VALUES('"+name+"','"+account+"','"+passwd+"','"+100+"')";
		boolean cs = true;// not have common account & name
		try {
			Class.forName(driver);
			System.out.println("mysql連接成功");
			dbcon = DriverManager.getConnection(scon);
			if(dbcon != null)
			{
				System.out.println("資料來源建立成功!");	
			}
			stmt = dbcon.createStatement();
			if(stmt != null)
			{
				System.out.println("建立statement物件");
			}
			rs = stmt.executeQuery(searchSQL);
			while(rs.next())
			{
				if(rs.getString("tb_name").equals(name) || rs.getString("tb_account").equals(account))
				{
					System.out.print("\n已有重複name or account\n");
					cs = false; // already have common account or name
					return cs;
				}
			}
			if(cs)
			{
				stmt.executeUpdate(addSQL);
				return cs;
			}
			dbcon.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;	
	}
	public boolean search(String account, String passwd) throws ClassNotFoundException
	{
		String searchSQL = "SELECT * FROM tb_database ";
		try {

			Class.forName(driver);
			
			System.out.println("mysql連接成功");
			dbcon = DriverManager.getConnection(scon);
			if(dbcon != null)
			{
				System.out.println("資料來源建立成功!");	
			}
			stmt = dbcon.createStatement();
			if(stmt != null)
			{
				System.out.println("建立statement物件成功");
			}
			rs = stmt.executeQuery(searchSQL);
			while(rs.next())
			{
				if(rs.getString("tb_account").equals(account) && rs.getString("tb_passwd").equals(passwd))
				{
					dbcon.close();
					stmt.close();
					return true;
				}
			}
//			System.out.println("\n\t姓名\t帳號\t密碼");			
			dbcon.close();
			stmt.close();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public void delete()
	{
		
	}
	public void link_load()
	{
		if(load == 0)
		{
			String addSQL = "SELECT * FROM database_tb_database";
			boolean cs;
			try {
				try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("mysql連接成功");
				dbcon = DriverManager.getConnection(scon);
				if(dbcon != null)
				{
					System.out.println("資料來源建立成功!");	
				}
				stmt = dbcon.createStatement();
				if(stmt != null)
				{
					System.out.println("建立statement物件成功");
				}
				rs = stmt.executeQuery(addSQL);
//				System.out.println("\n\t姓名\t帳號\t密碼");
				int n = 0;
				while(rs.next())
				{
					System.out.println("\t["+rs.getString("tb_name")+"\t"+rs.getString("tb_account")+"\t"+rs.getString("tb_passwd")+"]");
					list.insert(rs.getString("tb_name"), rs.getString("tb_account"), rs.getString("tb_passwd"));
					n++;
				}
				
				rs = stmt.executeQuery(addSQL);
				int i = 0;
				array_users = new String[n][4];
				while(rs.next())
				{
					array_users[i][0] = ""+rs.getString("tb_name");
					array_users[i][1] = ""+rs.getString("tb_account");
					array_users[i][2] = ""+rs.getString("tb_passwd");
					array_users[i][3] = ""+rs.getString("tb_uid");
					i++;
				}
				
				load  = 1;
				list.print();
				dbcon.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			return;
		}
		
	}
	
}
