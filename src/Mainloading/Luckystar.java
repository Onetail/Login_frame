package Mainloading;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import Assist.Font_all;

public class Luckystar 
{
	public JPanel star_panel;
	public JPanel downpanel;
	public JButton[] star;
	public JButton Back_main;
	Font_all f = new Font_all();
	public Luckystar()
	{
		star_panel = new JPanel(new GridLayout(6,4));
		downpanel = new JPanel(new BorderLayout());
		star = new JButton[12];
		Back_main = new JButton("ªð¦^");
		for(int i = 0 ; i < star.length;i++)
		{
			star[i] = new JButton(f.star_sort[i]);
			star[i].setFont(f.font[6]);
			star[i].setForeground(new Color(155,95,160));
			star[i].setBackground(Color.white);
			star_panel.add(star[i]);
		}
		downpanel.add(Back_main,BorderLayout.WEST);
		
	}

}
