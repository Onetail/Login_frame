package Assist;

import java.util.Random;

public class Array_response 
{
	String[] Array_error= {"�ާ@���~�F��.. �Х��`�ާ@�n��?",
							"�t�ΥX���A���L�k�ѧO���D��!�ˡC",
							"�w���w���A������..",
							"���ҵ{���A�p�G�A��bug�Ц^��~",
							"paosong91@gmail.com�@�̶l�c",
							"�o�͵L�k�w�������~!!",
							"�p�G���Ϳ��~�A�������ӬO�y���̪����D.",
							"�S�O�@��BUG"};
	String[] Array_fail=
		{
			"�A�o���G�O�b���ڧa....",
			"�A�γ\�ֿ�J�F�@�ǪF��",
			"�A�b�r��?",
			"�ڴN����������",
			"�Ӥ��ӪM�@�ءA�̦~?",
			"�O�r�گ�!"
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
