import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Duane on 15/07/2016.
 */

public interface Adder extends Remote {
    int add(int x, int y)throws RemoteException;
    String sayHello() throws RemoteException;
}