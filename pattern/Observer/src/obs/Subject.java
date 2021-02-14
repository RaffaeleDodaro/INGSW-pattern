package obs;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> list=new ArrayList<Observer>();
	public void addObserver(Observer obs)
	{
		list.add(obs);
	}
	public void removeObserver(Observer obs)
	{
		list.remove(obs);
	}
	
	public void notifyObserver() {
		for(Observer o:list)
			o.update();
	}
}
