package Mainloading;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import Assist.Font_all;

public class Note 
{
	private JPanel up_panel;
	private JPanel right_panel;
	JPanel main_panel;
	TextField text;//add 內容
	JPanel add_panel;//新增 後 add Jpanel
	JButton add_thing;//進入 addpanel
	JButton delete_thing;
	JButton bn1;// 新增 後 add true
	JButton bn2;// 新增 後 add false reback
	public JButton back;
	JScrollPane sp;
	private JLabel time;
	JLabel now_time;
	Font_all f = new Font_all();
	public JPanel news_panel;
	JScrollPane roll;
	
	JLabel[] label = new JLabel[3];
	JComboBox box;
	String[] str_label = {"類型: "," 時間點: " ," 內容: "};
	String[] str_things = {"事情","金錢","*重要*","語錄"};
	int i;
	public Note()
	{
		for(i = 0 ; i< label.length ; i++)
		{
			label[i] = new JLabel(str_label[i]);
			label[i].setFont(f.font[6]);
		}
		news_panel = new JPanel();
		box = new JComboBox(str_things);
		box.setFont(f.font[2]);
		news_panel.setLayout(new BorderLayout());
		news_panel.setBackground(new Color(140,200,155));
		up_panel = new JPanel();
		right_panel = new JPanel(new GridLayout(5,1));
		main_panel = new JPanel(new GridLayout(9,1));
		sp = new JScrollPane();
		time = new JLabel("記事本");
		time.setFont(f.font[8]);
		box.setSize(500, 200);
		up_panel.setBackground(new Color(150,145,185));
		right_panel.setBackground(new Color(200,190,225));
		main_panel.setBackground(new Color(70,85,95));
		add_thing = new JButton("增加");
		delete_thing = new JButton("刪除");
		back = new JButton("返回");
		
		add_thing.setFont(f.font[9]);
		back.setFont(f.font[9]);
		delete_thing.setFont(f.font[9]);
		back.setForeground(new Color(55,95,70));
		back.setBackground(new Color(155,205,135));
		add_thing.setForeground(new Color(55,95,70));
		delete_thing.setForeground(new Color(55,95,70));
		add_thing.setBackground(new Color(155,205,135));
		delete_thing.setBackground(new Color(155,205,135));
		
		up_panel.add(time);
		right_panel.add(add_thing);
		right_panel.add(delete_thing);
		right_panel.add(back);
		news_panel.add(up_panel,BorderLayout.NORTH);
		news_panel.add(right_panel,BorderLayout.EAST);
		news_panel.add(main_panel,BorderLayout.CENTER);
		
	}
	public void add_your_thing()
	{
		add_panel = new JPanel();
		now_time = new JLabel();
		now_time.setFont(f.font[4]);
		now_time.setForeground(Color.BLUE);
		text = new TextField();
		text.setFont(f.font[8]);
		text.setColumns(40);
		
		bn1 = new JButton("新增");
		bn2 = new JButton("取消");
		bn1.setFont(f.font[8]);
		bn2.setFont(f.font[8]);
		
		bn1.setForeground(new Color(25,45,55));
		bn2.setForeground(new Color(25,45,55));
		SimpleDateFormat sformat = new SimpleDateFormat("yyyy 年 MM 月 dd 日 hh 點");
		Date date = new Date();
		String s_time = sformat.format(date);
		
		
		add_panel.add(label[0]);
		add_panel.add(box);
		add_panel.add(label[1]);
		now_time.setText(s_time);
		add_panel.add(now_time);
		add_panel.add(label[2]);
		add_panel.add(text);
		add_panel.add(bn1);
		add_panel.add(bn2);
		
		
	}
	public void add_clear()
	{
		box.setSelectedIndex(0);
		SimpleDateFormat sformat = new SimpleDateFormat("yyyy 年 MM 月 dd 日 hh 點");
		Date date = new Date();
		String s_time = sformat.format(date);
		now_time.setText(s_time);
		text.setText(" ");
		add_panel.repaint();
	}
	
}
