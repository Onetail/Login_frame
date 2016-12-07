import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Assist.Array_response;
import Assist.Font_all;
import Mainloading.MainScreen;

@SuppressWarnings("serial")
public class GameFrame extends JFrame implements ActionListener{
	
	private JButton Login;
	private JButton Register;
	private JButton Enter;
	private JButton regi_enter;
	private JButton back;
	private JButton lookusers;
	private JLabel Label;
	private JLabel Label2;
	private JTextField getName;
	private JTextField getAccount;
	private JPasswordField getPasswd;
	private JLabel response;
	private JCheckBox ckbox;
	private boolean Root = false;
	private boolean logincheck = false;
	boolean num = true;//list is Visible or not
	private JDialog dia;
	private JScrollPane sp;//讓表單下拉
	JTable list;//表單
	String[] colname ={"姓名","帳號","密碼 ","UID"};
	Array_response res;
	String s;
	Font_all f = new Font_all();
	private int colora = 155,colorb = 205,colorc = 105;
	Register_data data; //database class
	public GameFrame()
	{
		try
		{
			res = new Array_response();
			
			setTitle("Game");
			setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(this);
			getContentPane().setBackground(Color.LIGHT_GRAY);
//			Container con = getContentPane();
//			Panel.setOpaque(false);		
			Label = new JLabel("Look Apple news");;
			Label.setFont(f.font[0]);
			response = new JLabel();
			response.setFont(f.font[3]);
			Login = new JButton("Login");
			Register = new JButton("Register");
			
			Login.setFont(f.font[2]);
			Register.setFont(f.font[2]);
			getAccount = new JTextField("account");
			getPasswd = new JPasswordField();
			
			getPasswd.setEchoChar('*');
			Login.setBackground(Color.white);
			Register.setBackground(Color.white);
			
			getAccount.setFont(f.font[3]);
			getPasswd.setFont(f.font[3]);
			
			response.setVisible(false);
			
			Login.setBounds(720-120 ,550 , 240,60);
			Register.setBounds(720-120  ,650 ,240,60);
			Label.setBounds(720-200 ,60 ,400,60 );
			response.setBounds(720 - 220, 200, 700, 45);
			getAccount.setBounds(720-150,320 ,300,50 );
			getPasswd.setBounds(720-150, 420, 300,50 );
			
			Login.addActionListener(this);
			Register.addActionListener(this);
			
			add(Login);
			add(Register);
			add(response);
			add(Label);
			add(getPasswd);
			add(getAccount);
		}catch(Exception e)
		{
			System.out.print("你的java GUI無法啟動!");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//--   登入  --
		if(e.getSource() == Login)
		{
			
			try
			{
				data =new Register_data();
				logincheck = data.search(getAccount.getText().trim(), getPasswd.getText().trim());
				System.out.print(logincheck);
				if(logincheck)
				{
					Main main = new Main();
					MainScreen screen = new MainScreen();
					screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					screen.setSize(main.Gamewidth, main.Gameheight);
					screen.setLocationRelativeTo(this);
					screen.setVisible(true);
					super.dispose();
				}else
				{
					response.setText("帳號密碼錯誤喔，親");
					response.setVisible(true);
				}
					
			}catch(Exception d)
			{
				response.setText(res.ResponseError());
				response.setVisible(true);
			}
			
		}
		//--  註冊  --
		else if(e.getSource() == Register)
		{
			try
			{
				
				//look database of users detail
				lookusers = new JButton("Users");
				lookusers.setVisible(false);
				
				
				//get account & passwd
				getAccount.setText("account");
				getPasswd.setText("password");
				getName = new JTextField("name");
				getName.setFont(f.font[3]);
				Label.setText("註冊");
				Label.setBounds(720-70 ,60 ,400,60 );
				Label.setForeground(new Color(35,75,15));
				getContentPane().setBackground(new Color(colora,colorb,colorc));
				getAccount.setBounds(720-150,370 ,300,50 );
				getPasswd.setBounds(720-150, 470, 300,50 );
				getName.setBounds(720-150, 270, 300,50 );
				Login.setVisible(false);
				Register.setVisible(false);
				
				ckbox = new JCheckBox("root");
				lookusers.setBounds(1000,600,200,50);
				ckbox.setBounds(720-120,570, 80, 60);
				
				ckbox.setBackground(new Color(colora,colorb,colorc));
				ckbox.setForeground(new Color(255,105,55));
				ckbox.setFont(f.font[5]);
				ckbox.addActionListener(this);
				
				Enter = new JButton("我要註冊!!");
				Enter.setFont(f.font[4]);
				Enter.setBackground(Color.white);
				Enter.setBounds(720-120 , 720 , 240, 60);
				Enter.addActionListener(this);
				Icon Pic = new ImageIcon(getClass().getResource("images.png"));
				back = new JButton(Pic);
				back.setBackground(new Color(colora,colorb,colorc));
				back.setBounds(720/2-200,120,140,100);
				back.setFont(f.font[0]);
				back.setBorder(null);
				back.addActionListener(new ActionListener(){
				
					@Override
					public void actionPerformed(ActionEvent arg0) {
						Screen(1);
						remove(back);
						remove(ckbox);
						remove(Enter);
						remove(getName);
						remove(lookusers);
						
						response.setVisible(false);
						
					}});
				// root detail setvisible & creat
				lookusers.addActionListener(new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 // not see list
						data = new Register_data();
						list = new JTable(data.array_users,colname);
						list.setRowHeight(20);
						list.setFont(f.font[7]);
						
						sp = new JScrollPane(list);
						
						sp.setBounds(1000,100,400,500);
						
						if(num)
						{
							System.out.print("true");
							sp.setVisible(num);
							
							num = false;
						}
						else if(!num)
						{
							System.out.print("false\n");
							getContentPane().validate();
							getContentPane().remove(sp);
							getContentPane().remove(list);
							
							num = true;
						}
						add(sp);
					
						
					}});
				// -------------------------
				
				add(lookusers);
				add(getName);
				add(back);
				add(ckbox);
				add(Enter);
				
			}catch(Exception d)
			{
				response.setText(res.ResponseError());
				response.setVisible(true);
				
			}
		// ------------ 確認註冊 ---------------------	
		}else if(e.getSource() == Enter)
		{
			if(getName.getText().equals(""))
			{
				response.setText(res.ResponseFailed());
				response.setVisible(true);
				return;
			}
			if(getAccount.getText().equals("") && getPasswd.getText().equals(""))
			{//acccount & passwd雙空
				response.setText(res.ResponseFailed());
				response.setVisible(true);
			}else if(getAccount.getText().equals("")&& !getPasswd.getText().equals(""))
			{//account 空
				response.setText("請輸入帳號");
				response.setVisible(true);
			}else if(getPasswd.getText().equals("")&& !getAccount.getText().equals(""))
			{//passwd 空
				response.setText("請輸入密碼");
				response.setVisible(true);
			}else
			{
				if(getAccount.getText().length()<=6 || getPasswd.getText().length()<=6)
				{
					response.setText("帳號與密碼需大於6個字");
					response.setVisible(true);
				}else
				{
					response.setVisible(false);
					int x = JOptionPane.showConfirmDialog(null,"你確定嗎", "註冊",JOptionPane.YES_NO_OPTION,1);
					if(x == JOptionPane.YES_OPTION)
					{
						Register_data data = new Register_data();
						try {
							Root = data.add(getName.getText().trim(),getAccount.getText().trim(),getPasswd.getText().trim());
							if(Root)
							{
								response.setText("註冊成功!!");
								response.setVisible(true);
							}else
							{
								response.setText("帳號或姓名有重複~");
								response.setVisible(true);
							}
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else if(x == JOptionPane.NO_OPTION)
					{
						getAccount.setText("");
						getPasswd.setText("");
						repaint();
					}
				}
				
//					try {
//						data.search(getName.getText().trim(),getAccount.getText().trim(),getPasswd.getText().trim());
//					} catch (ClassNotFoundException e11) {
//						// TODO Auto-generated catch block
//						e11.printStackTrace();
//					}
					
			//-----    register 完 資料顯現  ----
//					dia = new JDialog();
//					dia.setTitle("你的資料喔，親");
//					dia.setSize(800,400);
//					dia.setVisible(true);
//					dia.setLocationRelativeTo(this);
//					
//					dia.setLayout(null);
//					Label2 = new JLabel();
//					Label2.setText("<html>帳號: " +getAccount.getText() +""
//							+ " <br>密碼: " + getPasswd.getText() + ""
//									+ " <br>Uid: 1<br></html>" );
//					Label2.setFont(f.font[0]);
//					regi_enter = new JButton("確認");
//					regi_enter.setBackground(new Color(205,185,95));
//					regi_enter.setBounds(400-150, 250,300, 40);
//					regi_enter.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,20));
//					Label2.setBounds(50,0,500,250);
//					regi_enter.addActionListener(new ActionListener()
//					{
//
//						@Override
//						public void actionPerformed(ActionEvent arg0) {
//							dia.dispose();
//							repaint();
//							Screen(1);
//							
//						}
//						
//					});	
//					dia.add(Label2);
//					dia.add(regi_enter);
				
			}
			
		}
		// --------------   ROOT checkbox    -----------------
		else if(ckbox.isSelected() == true)
		{
			Root = true;
			lookusers.setVisible(true);
			
			getContentPane().setBackground(new Color(colora-55,colorb,colorc+55));
			ckbox.setBackground(new Color(colora-55,colorb,colorc+55));
			ckbox.setForeground(new Color(145,95,75));
			Label.setForeground(new Color(185,25,225));
			back.setBackground(new Color(colora-55,colorb,colorc+55));
		}else if(ckbox.isSelected() == false)
		{
			lookusers.setVisible(false);
			Root = false;
			
			getContentPane().setBackground(new Color(colora,colorb,colorc));
			ckbox.setBackground(new Color(colora,colorb,colorc));
			ckbox.setForeground(new Color(255,105,55));
			Label.setForeground(new Color(35,75,15));
			back.setBackground(new Color(colora,colorb,colorc));
		}
		
	}
	private void Screen(int n)
	{
		if(n == 1)
		{
			getAccount.setText("account");
			getPasswd.setText("");
			Login.setBounds(720-120 ,550 , 240,60);
			Register.setBounds(720-120  ,650 ,240,60);
			Label.setBounds(720-200 ,60 ,400,60 );
			response.setBounds(720 - 220, 200, 700, 45);
			getAccount.setBounds(720-150,320 ,300,50 );
			getPasswd.setBounds(720-150, 420, 300,50 );
			getContentPane().setBackground(Color.LIGHT_GRAY);
			Label.setText("Look Apple news");
			Login.setVisible(true);
			Register.setVisible(true);
			ckbox.setVisible(false);
			Enter.setVisible(false);
			Label.setForeground(Color.black);
			remove(back);
			remove(ckbox);
			remove(Enter);
			
		}else
		{
			
		}
		
	}

}
