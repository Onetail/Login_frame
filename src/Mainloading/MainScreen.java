package Mainloading;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JLabel;

import Assist.Array_response;
import Assist.Font_all;


@SuppressWarnings("serial")
public class MainScreen extends JFrame implements ActionListener
{
	
	protected JPanel center_panel;
	protected JPanel top_panel;
	protected JPanel down_panel;
	private JLabel text;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	// use cardlayout for turn panel
	int i;
	protected int colora = 155,colorb = 155,colorc = 155;
	Array_response res = new Array_response();
	Font_all f = new Font_all();//字型 字體改變
	Icon Pic1;
	Icon Pic2;
	Icon Pic3;
	Note note;

	
	public MainScreen()
	{
		setTitle("Game");
		Pic1 = new ImageIcon(getClass().getResource("news_img.png"));
		Pic2 = new ImageIcon(getClass().getResource("star_img.png"));
		Pic3 = new ImageIcon(getClass().getResource("note_img.png"));
		
		Paint();
	}
	protected void Paint()
	{
//		card = new CardLayout();
//		All_panel = new JPanel();
//		All_panel.setLayout(card);
//		All_panel.add(new JLabel("one"),"one");
//		All_panel.add(new JLabel("two"), "two");
//		All_panel.add(new JLabel("three"), "three");
//		All_panel.add(new JLabel("main"), "main");
		
		getContentPane().setLayout(new GridLayout(3,3));

		getContentPane().setBackground(new Color(colora,colorb,colorc));
		top_panel = new JPanel(new BorderLayout());
		center_panel = new JPanel(new BorderLayout());
		down_panel = new JPanel(new BorderLayout());
		
		center_panel.setBackground(new Color(colora-15,colorb+15,colorc+25));
		bt1 = new JButton(Pic1);
		bt2 = new JButton(Pic2);
		bt3 = new JButton(Pic3);
		
		bt1.setActionCommand("next1");
		bt2.setActionCommand("next2");
		bt3.setActionCommand("next3");
		
		text = new JLabel("選擇一項=>");
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setVerticalAlignment(JLabel.CENTER);
		text.setFont(new Font(Font.DIALOG,Font.BOLD,40));
		bt1.setBorder(null);
		bt1.setBackground(null);
		bt2.setBorder(null);
		bt2.setBackground(null);
		bt3.setBorder(null);
		bt3.setBackground(null);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		
		center_panel.add(bt1,BorderLayout.WEST);
		center_panel.add(bt2);
		center_panel.add(bt3,BorderLayout.EAST);
		top_panel.add(text);

		add(top_panel);
		add(center_panel);
		add(down_panel);
		top_panel.updateUI();
		center_panel.updateUI();
		down_panel.updateUI();
		getContentPane().revalidate();
		getContentPane().repaint();
		
		
	}
	public void Back()
	{
		Paint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == bt1)
		{
			//news
			News();
			
			
		}else if(e.getSource() == bt2)
		{
			//star
			
			Star();
			
		}else if(e.getSource() == bt3)
			// note
		{
//			DeleteUi();
			Notething();
		}
		
	}
	// Delete Main Ui in panel non frame
	private void DeleteUi() {
		
		top_panel.removeAll();
		center_panel.removeAll();
		down_panel.removeAll();
		
		repaint();
		
	}
	// Main.Button1 News search
	public void News()
	{
		DeleteUi();
		News news = new News();
		down_panel.add(news.leftpanel,BorderLayout.WEST);
		down_panel.add(news.rightpanel);
		top_panel.add(news.news);
		top_panel.updateUI();
		
		news.start_news.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				news.rightpanel.removeAll();
				System.out.print(f.l_text[0]);
				try
				{
					for(int i = 0; i <6; i++)
					{
						news.news_t[i] = new JLabel();
						news.news_t[i].setText(f.l_text[i]);
						news.news_t[i].setFont(f.font[5]);
						news.rightpanel.add(news.news_t[i]);
					}
					news.rightpanel.updateUI();
					repaint();
				}catch(Exception e)
				{
					e.getMessage();
				}
				
			}}
		);
		//                record key in database
		news.record.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}}
		);
		//                  back to old frame panel
		news.back_main.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				getContentPane().removeAll();
				Paint();
				
			}}
		);
	}
	// Main.Button2 star search
	public void Star()
	{
		getContentPane().remove(top_panel);
		getContentPane().remove(center_panel);
		getContentPane().remove(down_panel);
		getContentPane().revalidate();
		getContentPane().repaint();
		getContentPane().setLayout(new BorderLayout());
		Luckystar star = new Luckystar();
		star.Back_main.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().removeAll();
				Paint();
				
			}});
		add(star.star_panel);
		add(star.downpanel,BorderLayout.NORTH);
		getContentPane().revalidate();
		getContentPane().repaint();
		
	}
	public void Notething()
	{
		getContentPane().setLayout(new BorderLayout());
		getContentPane().removeAll();
		getContentPane().revalidate();
		getContentPane().repaint();
		note = new Note(); 
		add(note.news_panel);
		note.back.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
					
				remove(note.news_panel);
				try{
					remove(note.add_panel);
				}catch(Exception e){}
				revalidate();
				repaint();
				Paint();
					
			}});
		note.add_thing.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				note.add_thing.setEnabled(false);
				note.add_your_thing();
				add(note.add_panel,BorderLayout.SOUTH);
				revalidate();
				repaint();
				note.bn1.addActionListener(new ActionListener(){
					// 新增 note 
					
					@Override
					public void actionPerformed(ActionEvent arg0) {

						int x = JOptionPane.showConfirmDialog(null,"你確定嗎", "新增",JOptionPane.YES_NO_OPTION,1);
						if(x == JOptionPane.YES_OPTION)
						{
							
						}else if(x == JOptionPane.NO_OPTION)
						{
							note.add_clear();
							
						}
						
					}});
				note.bn2.addActionListener(new ActionListener(){
					//返回 note介面
					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
							note.add_thing.setEnabled(true);
							remove(note.add_panel);
							revalidate();
							repaint();
					}});
				note.box.addActionListener(new ActionListener(){
					String str;
					@Override
					public void actionPerformed(ActionEvent e) {
							
//							JComboBox tmp = (JComboBox) e.getSource();
//							str = (String) tmp.getSelectedItem();
					}});
			}});
		
	}
}
