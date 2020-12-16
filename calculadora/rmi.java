package calculadora;

public interface rmi extends java.rmi.Remote {
    response soma(request r) throws java.rmi.RemoteException;
    response subtracao(request r) throws java.rmi.RemoteException;
    response multiplicacao(request r) throws java.rmi.RemoteException;
    response divisao(request r) throws java.rmi.RemoteException;
    response raiz(request r) throws java.rmi.RemoteException;
    response porcentagem(request r) throws java.rmi.RemoteException;
    response potencia(request r) throws java.rmi.RemoteException;
}