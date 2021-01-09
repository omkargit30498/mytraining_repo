package day4.interfaceeg.combined;


	public class Architect extends Human implements MathsGenius, Artist {

		@Override
		public void draw() {
			System.out.println("Architect can draw very well");
			
		}

		@Override
		public void calculate() {
			System.out.println("Architect is very good in calculations");
			
		}

	}

