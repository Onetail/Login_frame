package Mainloading;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Assist.Font_all;


public class LLpersonal extends MainScreen
{
	protected JFrame frame;
	JPanel jp;
	JButton enter;
	JLabel[] label;
	Font_all f = new Font_all();
	String[] s = {"�m�W","�b��","�K�X","���B","�W���n�J�ɶ�","�{�b�ɶ�"};
	public LLpersonal(JFrame frame)
	{
		this.frame= frame;
	}
	private void loading_now()
	{
		setLayout(null);
		setTitle("Game");
		jp = new JPanel();
		enter = new JButton("�T�{�Ӹ�!");
		enter.setFont(f.font[5]);
		for(int i = 0 ;i<s.length;i++)
		{
			label[i] = new JLabel();
			label[i].setText(s[i]);
			label[i].setFont(f.font[6]);
			jp.add(label[i]);
		}
		jp.add(enter);
		add(jp);
	}
}
