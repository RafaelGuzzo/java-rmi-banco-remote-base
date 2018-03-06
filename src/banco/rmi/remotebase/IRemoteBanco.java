package banco.rmi.remotebase;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteBanco extends Remote {
	public double saque(int id, Double vlrSaque) throws RemoteException;
	public double deposito(int id, Double vlrDepo) throws RemoteException;
	public double saldo(int id) throws RemoteException;
}
