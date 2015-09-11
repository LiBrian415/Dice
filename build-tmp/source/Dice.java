import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(300,300);
	noLoop();
}
public void draw()
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
public void mousePressed()
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
	public void roll()
	{
		if (Math.random()<.165f)
		{
			roll =1;
		}
		else if (Math.random()<.330f)
		{
			roll =2;
		}
		else if (Math.random()<.495f)
		{
			roll=3;
		}
		else if (Math.random()<.660f)
		{
			roll=4;
		}
		else if (Math.random()<.825f)
		{
			roll=5;
		}
		else if (Math.random()<.999f)
		{
			roll=6;
		}
		//your code here
	}
	public void show()
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
