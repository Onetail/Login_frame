package Assist;

import java.util.Random;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class Font_all 
{
	public Font[] font = new Font[10];
	public String[] l_text = new String[6]; 
	public String[] star_sort = new String[12];
	
	public Font_all()
	{
		
		
		Choose();
	}
	public void Choose()
	{
		font[0] = new Font(Font.DIALOG,Font.BOLD,45);
		font[1] = new Font("Arial",Font.BOLD,25);
		font[2] = new Font(Font.MONOSPACED, Font.ITALIC, 20);
		font[3] = new Font(Font.SANS_SERIF,Font.ITALIC,25);
		font[4] = new Font(Font.DIALOG,Font.PLAIN,20);
		font[5] = new Font(Font.DIALOG,Font.HANGING_BASELINE,30);
		font[6] = new Font("標楷體",Font.BOLD,35);
		font[7] = new Font("標楷體",Font.BOLD,20);
		font[8] = new Font("標楷體",Font.PLAIN,20);
		font[9] = new Font("微軟正黑體",Font.BOLD,32);
		l_text[0] = "Top新聞";
		l_text[1] = "要聞新聞";
		l_text[2] = "娛樂新聞";
		l_text[3] = "國際新聞";
		l_text[4] = "體育新聞";
		l_text[5] = "財經新聞";
		star_sort[0] = "牡羊座";
		star_sort[1] = "金牛座";
		star_sort[2] = "雙子座";
		star_sort[3] = "巨蟹座";
		star_sort[4] = "獅子座";
		star_sort[5] = "處女座";
		star_sort[6] = "天秤座";
		star_sort[7] = "天蠍座";
		star_sort[8] = "射手座";
		star_sort[9] = "魔羯座";
		star_sort[10] = "水瓶座";
		star_sort[11] = "雙魚座";
	}
	
	
}
