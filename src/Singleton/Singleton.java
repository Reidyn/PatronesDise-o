package Singleton;

public class Singleton {
	
	private static Singleton INSTANCE = null;
	
	private Singleton(){}
	
	private static void createInstance() {
        if (INSTANCE == null) { 
        	synchronized(Singleton.class) {
                if (INSTANCE == null) { 
                    INSTANCE = new Singleton();
                }
            }
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null){
        	createInstance();
        }
        return INSTANCE;
    }
}
