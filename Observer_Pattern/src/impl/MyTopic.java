package impl;

import java.util.ArrayList;
import java.util.List;

import interf.Observer;
import interf.Subject;

public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	

	public MyTopic() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		observers.add(obj);
		
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		observers.remove(obj);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observersLocal=null;
		if (!changed)
			return;
		observersLocal= new ArrayList<Observer>(this.observers);
		this.changed=false;
		for (Observer obj : observersLocal) {
			obj.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}

	@Override
	public void postMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message posted to topic"+msg);
		this.message=msg;
		this.changed= true;
		notifyObservers();
		
	}

}
