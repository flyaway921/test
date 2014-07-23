package connection;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionManager {
	static AtomicInteger i = new AtomicInteger(0);
	static Queue<Connection> connections = new java.util.concurrent.ArrayBlockingQueue<Connection>(10);
	static{
		for(int i = 0; i < 10; i++){
			connections.add(new Connection());
			System.out.println(connections);
		}
	}
	public static Connection connect(){
		return connections.poll();
	}
	public static void main(String[] args) {
		for(int i=0;i<12;i++){
			System.out.println(connect());
		}
	}
	
	

}

class Connection{
	Connection(){
		System.out.println("constructor of connection");
	}
}
