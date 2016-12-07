package Mainloading;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Assist.Font_all;

public class News extends JFrame
{
	public JPanel leftpanel;
	public JPanel rightpanel;
	JLabel img_1;
	JButton bt1;
	JLabel news;
	JButton start_news;
	JButton record;
	JButton back_main;
	JLabel[] news_t = new JLabel[6];
	Font_all f = new Font_all();
	
	
	
	public News()
	{
		Icon Pic1 = new ImageIcon(getClass().getResource("news_img.png"));
		leftpanel = new JPanel(new GridLayout(3,1));
		rightpanel = new JPanel(new GridLayout(2,6));
		news = new JLabel(Pic1);
		start_news = new JButton("開始");
		record = new JButton("紀錄");
		back_main = new JButton("返回");
		
		news.setBackground(Color.white);
		news.setBorder(null);
		record.setFont(f.font[3]);
		start_news.setFont(f.font[3]);
		back_main.setFont(f.font[3]);
		
		start_news.setForeground(Color.DARK_GRAY);
		back_main.setForeground(Color.DARK_GRAY);
		record.setForeground(Color.DARK_GRAY);
		start_news.setBackground(Color.WHITE);
		back_main.setBackground(Color.white);
		//                開始爬新聞
		leftpanel.setBackground(new Color(155,155,155));
		leftpanel.add(start_news);
		leftpanel.add(record);
		leftpanel.add(back_main);
		
		repaint();
	}
	
}
