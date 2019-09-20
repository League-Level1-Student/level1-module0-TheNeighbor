Minim minim;
AudioPlayer song;
import ddf.minim.*;
int x=50;
PImage pictureOfRecord;
void setup() {
  size(612,612);
  pictureOfRecord = loadImage("record.jpg");
  minim = new Minim(this);
    song = minim.loadFile("jeopardy.wav", 512); 
}

void draw() {
 if (mousePressed) {
    song = minim.loadFile("jeopardy.wav", 512); 
   rotateImage(pictureOfRecord, x+=10);
 }
  image(pictureOfRecord, 0,0);
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
   
    
