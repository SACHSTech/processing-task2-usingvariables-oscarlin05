import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(34, 206, 245);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    int scaledwidth = width/400;
    int scaledheight = height/400;

	//ground color (foreground)
    stroke(74, 50, 1);
    fill(74, 50, 1);
    rect(0 * scaledwidth, 325 * scaledheight, 400 * scaledwidth, 100 * scaledheight);
    
  //lawn (foreground)
    stroke(0);
    fill(22, 181, 72);
    rect(75 * scaledwidth, 325 * scaledheight, 250 * scaledwidth, 250 * scaledheight);
    //rect(600, 650, 250, 50);

  //pathway (foreground)
    stroke(0);
    fill(130, 148, 148);
    rect(195 * scaledwidth, 325 * scaledheight, 40 * scaledwidth, 100 * scaledheight);    
    
  //house shape
    stroke(0);
    fill(247, 186, 62);
    rect(125 * scaledwidth, 150 * scaledheight, 175 * scaledwidth, 175 * scaledheight);

  //roof
    stroke(0);
    fill(153, 99, 0);
    triangle(75 * scaledwidth, 150 * scaledheight, 212 * scaledwidth , 50 * scaledheight, 350 * scaledwidth, 150 * scaledheight);
    
  //door
    stroke(0);
    rect(195 * scaledwidth, 275 * scaledheight, 40 * scaledwidth, 50 * scaledheight);
    fill(74, 50, 1);
    ellipse(230 * scaledwidth, 305 * scaledheight, 7 * scaledwidth, 7 * scaledheight);

  //window
    stroke(0);
    fill(185, 250, 249);
    rect(195 * scaledwidth , 175 * scaledheight, 40 * scaledwidth, 40 * scaledheight);
    
    //line(390, 390, 470, 390);
    line(195 * scaledwidth, 195 * scaledheight, 235 * scaledwidth, 195 * scaledheight);
    line(215 * scaledwidth, 175 * scaledheight, 215 * scaledwidth, 215* scaledheight);
    
    //sun
    stroke(0);
    fill(250, 225, 0);
    ellipse(375 * scaledwidth, 25 * scaledheight, 50 * scaledwidth, 50 * scaledheight);

  }
  
  // define other methods down here.
}