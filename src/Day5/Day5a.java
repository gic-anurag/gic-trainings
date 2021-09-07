package Day5;

	
	class Day5a{
		public enum Colour {BLACK,BLUE,RED,YELLO,WHITE}
		public static void main(String[] args) {
			for(Colour c:Colour.values())
				System.out.println(c);
		}
	}
