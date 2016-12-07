package Assist;

import java.util.Random;

public class Array_response 
{
	String[] Array_error= {"操作錯誤了啦.. 請正常操作好嗎?",
							"系統出錯，但無法識別問題喔!親。",
							"滴答滴答，當機當機..",
							"重啟程式，如果再有bug請回報~",
							"paosong91@gmail.com作者郵箱",
							"發生無法預期的錯誤!!",
							"如果產生錯誤，那麼應該是造物者的問題.",
							"又是一個BUG"};
	String[] Array_fail=
		{
			"你這絕逼是在玩我吧....",
			"你或許少輸入了一些東西",
			"你在逗我?",
			"我就笑笑不說話",
			"來不來杯咖啡，騷年?",
			"別逗我笑!"
		};
	String[] Array_welcome = 
		{
				"1",
				"2",
				"3",
				"4",
				"5"
		};
	int x;
	Random rand;
	public String ResponseError()
	{
		rand = new Random();
		x = rand.nextInt(50)+1;
		
		if(x >= 1 && x <5)
		{
			return Array_error[0].trim();
		}else if(x >=5 && x < 10)
		{
			return Array_error[1].trim();
		}
		else if(x >=10 && x < 15)
		{
			return Array_error[3].trim();
		}
		else if(x >=15 && x < 20)
		{
			return Array_error[4].trim();
		}
		else if(x >=20 && x < 25)
		{
			return Array_error[5].trim();
		}
		else if(x >=25 && x < 30)
		{
			return Array_error[6].trim();
		}
		else if(x >=35 && x < 40)
		{
			return Array_error[7].trim();
		}
		else if(x >=40 && x <50)
		{
			return Array_error[2].trim();
		}
		return Array_error[7];
	}
	public String ResponseFailed()
	{
		rand = new Random();
		x = rand.nextInt(50)+1;
		
		if(x >= 1 && x <10)
		{
			return Array_fail[0].trim();
		}else if(x >=10 && x < 20)
		{
			return Array_fail[1].trim();
		}
		else if(x >=20 && x < 30)
		{
			return Array_fail[2].trim();
		}
		else if(x >=30 && x <= 40)
		{
			return Array_fail[3].trim();
		}
		else if(x >=40 && x < 45)
		{
			return Array_fail[4].trim();
		}
		else if(x >=45 && x <= 50)
		{
			return Array_fail[5].trim();
		}
		return Array_fail[4];
	}
	public String ResponseWelcome()
	{
		rand = new Random();
		int x = rand.nextInt(50)+1;
		if(x >= 0 && x <10)
		{
			return Array_welcome[0];
		}else if(x >= 10 && x < 20)
		{
			return Array_welcome[1];
		}
		else if(x >= 20 && x < 30)
		{
			return Array_welcome[2];
		}
		else if(x >= 30 && x < 40)
		{
			return Array_welcome[3];
		}
		else if(x >= 40 && x <= 50)
		{
			return Array_welcome[4];
		}
		return Array_welcome[4];
	}
}
