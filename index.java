
// variables: x = xaxis, y = yaxis, n = limit of steps, steps = counter
int n = 300;
int steps = 0;
int x = 200;
int y = 200;


void setup() {
	size(500, 500);
  	frameRate(10);
}


void draw() {
	stroke(1);
	fill(255);
	rect(x, y, 10, 10);
	steps++; // adds 1 after rect() is drawn

	if(steps == n) {
		noLoop(); // stops draw()
	}else {
		int z = (int)(Math.random() * 4);

		if(z == 0) {
			// nested ifs supposedly contain the rect() within the canvas
			if(x < 490) {
				x+=10;
			}else {
				x-=10;
			}
		}else if(z == 1) {
			if(y > 0) {
				y-=10;
			}else {
				y+=10;
			}
		}else if(z == 2) {
			if(x > 0) {
				x-=10
			}else {
				x+=10;
			}
		}else {
			if(y < 490) {
				y+=10;
			}else {
				y-=10;
			}
		}

		fill(0, 0, 255); 
		rect(x, y, 10, 10); // it is drawn the original rect()
	}

	println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}



	



