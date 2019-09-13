PImage pictureOfRecord;
void setup() {
  size(612,612);
  pictureOfRecord = loadImage("record.jpg");
}

void draw() {
  image(pictureOfRecord, 0,0);
}
