/* Copy the code into a new Processing sketch and complete then steps. */

//1. create an array of ints. don't initialize it yet.
int[] jeff;

void setup() {
  //2. set the size of your window
  size(2000,2000);

  //3. initialize your array with the built in width variable
jeff=new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  randomize(jeff);
  //5. call the noStroke() method
   
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
 background(20, 234, 12);

  //7. set the color for your graph

fill(9,23,100);
  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
 for(int k=0;k<width;k++){
 rect(jeff[k], height, 1,-jeff[k]);
 }

  //9. call the stepSort method
 stepSort(jeff); 

  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  if(mousePressed==true){
  randomize(jeff);
  }
}
void randomize(int[] arr){
for(int i=0; i<width; i++){
   arr[i]=(int)random(height);
  }
  
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
