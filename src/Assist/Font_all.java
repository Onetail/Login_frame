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
		font[6] = new Font("�з���",Font.BOLD,35);
		font[7] = new Font("�з���",Font.BOLD,20);
		font[8] = new Font("�з���",Font.PLAIN,20);
		font[9] = new Font("�L�n������",Font.BOLD,32);
		l_text[0] = "Top�s�D";
		l_text[1] = "�n�D�s�D";
		l_text[2] = "�T�ַs�D";
		l_text[3] = "��ڷs�D";
		l_text[4] = "��|�s�D";
		l_text[5] = "�]�g�s�D";
		star_sort[0] = "�d�Ϯy";
		star_sort[1] = "�����y";
		star_sort[2] = "���l�y";
		star_sort[3] = "���ɮy";
		star_sort[4] = "��l�y";
		star_sort[5] = "�B�k�y";
		star_sort[6] = "�ѯ��y";
		star_sort[7] = "���Ȯy";
		star_sort[8] = "�g��y";
		star_sort[9] = "�]�~�y";
		star_sort[10] = "���~�y";
		star_sort[11] = "�����y";
	}
	
	
}
