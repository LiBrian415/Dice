void setup()
{
	size(300,300);
	noLoop();
}
void draw()
{
	background(0);
	for (int y=0;y<300;y+=100)
	{
		for (int x=0; x<300;x+=100)
		{
		Die dice = new Die(x,y);
		dice.show();
		}
	}//your code here
}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int roll;
	int myX, myY;//variable declarations here
	Die(int x, int y) 
	{
	roll();
	myX=x;
	myY=y;
		//variable initializations here
	}
	void roll()
	{
		if (Math.random()<.165)
		{
			roll =1;
		}
		else if (Math.random()<.330)
		{
			roll =2;
		}
		else if (Math.random()<.495)
		{
			roll=3;
		}
		else if (Math.random()<.660)
		{
			roll=4;
		}
		else if (Math.random()<.825)
		{
			roll=5;
		}
		else if (Math.random()<.999)
		{
			roll=6;
		}
		//your code here
	}
	void show()
	{
		strokeWeight(5);
		fill(255,255,255);
		rect(myX,myY,100,100,20);
		fill(0,0,0);
		if (roll==1)
		{
			ellipse(myX+50,myY+50,15,15);
		}
		else if (roll==2)
		{
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+75,myY+75,15,15);
		}
		else if (roll==3)
		{
			ellipse(myX+50,myY+50,15,15);
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+75,myY+75,15,15);
		}
		else if (roll==4)
		{
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+75,myY+75,15,15);
			ellipse(myX+25,myY+75,15,15);
			ellipse(myX+75,myY+25,15,15);
		}
		else if (roll==5)
		{
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+75,myY+75,15,15);
			ellipse(myX+25,myY+75,15,15);
			ellipse(myX+75,myY+25,15,15);
			ellipse(myX+50,myY+50,15,15);
		}
		else if (roll==6)
		{
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+75,myY+75,15,15);
			ellipse(myX+25,myY+75,15,15);
			ellipse(myX+75,myY+25,15,15);
			ellipse(myX+25,myY+50,15,15);
			ellipse(myX+75,myY+50,15,15);//your code here
		}
	}

}
