class abc{
	double height;
	double depth;
	double width;
	double volume(){
			return width*depth*height;
			}
	}
class p60{
	public static void main(String args[]){
		abc obj=new abc();
		obj.width=50;
		obj.depth=15;
		obj.height=20;
		double vol=obj.volume();
		System.out.println("volume="+vol);
	
	}

}


