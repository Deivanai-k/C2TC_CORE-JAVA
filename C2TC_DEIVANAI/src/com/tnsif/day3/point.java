package com.tnsif.day3;

public class point {

	public static void main(String[] args) {}
		
			private float x;
			private float y;

			public void Point() {
				x = 0.0f;
				y = 0.0f;
			}

			public void Point(float x) {
				this.x = x;
				this.y = x;
			}

			public void Point(float x, float y) {
				this.x = x;
				this.y = y;
			}

			@Override
			public String toString() {
				return "Point [x=" + x + ", y=" + y + "]";
			}

		

		// TODO Auto-generated method stub

	}


