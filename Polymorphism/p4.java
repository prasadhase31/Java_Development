class TV{
	 int channel;
	 int volLevel;
	 boolean on;

	public TV(){
		channel=1;
		volLevel=1;
		on=false;

	}

	public void turnOn(){
		on=true;
	}

	public void turnOff(){
		on=false;
	}

	public void setChannel(int newChannel){
		if(on && newChannel>=1 && newChannel<=120){
			channel=newChannel;
		}
	}

	public void setVolume(int newVolLevel){
		if(on && newVolLevel>=1 && newVolLevel<=8){
			volLevel=newVolLevel;
	}
}

public void channelUp(){
	if(on && channel<120){
		channel++;
	}
}

public void channelDown(){
	if(on && channel>1){
		channel--;
	}
}

public void volUp(){
	if(on && volLevel<7){
		volLevel++;
	}
}

public void volDown(){
	if(on && volLevel>1){
		volLevel--;
	}
}
}

class p4{
	
	public static void main(String[] args) {
		
		TV tv=new TV();

		tv.turnOn();
		tv.setChannel(10);
		tv.setVolume(5);

		tv.channelUp();
		tv.channelDown();

		System.out.println("Channel :"+tv.channel);
		System.out.println("Volume :"+tv.volLevel);
		System.out.println("TV On :"+tv.on);

	}
}