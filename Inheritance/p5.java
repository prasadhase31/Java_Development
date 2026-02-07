class Point2D{
	private float x=0.0f;
	private float y=0.0f;

	public Point2D(float x,float y){
		this.x=x;
		this.y=y;
	}

	public float getX(){
		return x;
	}

	public void setX(float x){
		this.x=x;
	}

	public float getY(){
		return y;
	}

	public void setY(float y){
		this.y=y;
	}

	public void setXY(float x,float y){
		this.x=x;
		this.y=y;
	}

	public float[] getXY(){
		return new float[]{x,y};
	}

	public String toString(){
		return "("+ x +","+ y +")";
       
	}
}

class Point3D extends Point2D{
	private float z=0.0f;

	Point3D(float x,float y,float z){
		super(x,y);
		this.z=z;
	}

	public float getZ(){
		return z;
	}

	public void setZ(float z){
		this.z=z;
	}

	public void setXYZ(float x,float y,float z){
		setXY(x,y);
		this.z=z;
	}

	public float[] getXYZ(){
		return new float[]{getX(),getY(),z};

	}

	public String toString(){
		return "("+ getX() +","+ getY() +","+ z +")";
	}
}

class p5{
	
	public static void main(String[] args) {

		Point2D p2=new Point2D(2.5f,5.5f);
		System.out.println("Point2D :"+p2);
		float[]xy=p2.getXY();
		System.out.println("X ="+xy[0]+",Y ="+xy[1]);

		Point3D p3=new Point3D(1.0f,2.0f,3.0f);
        System.out.println("Point3D :"+p3);
        float[]xyz=p3.getXYZ();
        System.out.println("X ="+xyz[0]+",Y ="+xyz[1]+",Z ="+xyz[2]);
		

	}
}