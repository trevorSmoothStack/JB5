package com.ss.jb5.as2;

public class SampleSingleton {

	volatile public static SampleSingleton instance = null;

	private SampleSingleton() {

	}

	public static SampleSingleton getInstance() {
		synchronized (instance) {
			if (instance == null) {
				instance = new SampleSingleton();
			}
		}
		return instance;
	}
}
