package calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class functions extends UnicastRemoteObject implements rmi {

    public functions() throws RemoteException {
        super();
    }
    public response soma(request r){
        response resp = new response();
        resp.setResult((r.getVal1()) + (r.getVal2()));
        resp.setStatus(0);
        return resp;
    }
    public response subtracao(request r){
        response resp = new response();
        resp.setResult((r.getVal1()) - (r.getVal2()));
        resp.setStatus(0);
        return resp;
    }
    public response multiplicacao(request r){
        response resp = new response();
        resp.setResult((r.getVal1()) * (r.getVal2()));
        resp.setStatus(0);
        return resp;
    }
    public response divisao(request r){
        response resp = new response();
        if (r.getVal2() == 0) { resp.setStatus(1); } else {
            resp.setResult((r.getVal1()) / (r.getVal2()));
            resp.setStatus(0);
        }
        return resp;
    }
    public response potencia(request r){
        response resp = new response();
        resp.setResult((float) Math.pow(r.getVal1(),r.getVal2()));
        resp.setStatus(0);
        return resp;
    }
    public response porcentagem(request r) {
        response resp = new response();
        if (r.getVal2() == 0) { resp.setStatus(1); } else {
            resp.setResult((r.getVal1()*r.getVal2())/100);
            resp.setStatus(0);
        }
        return resp;
    }
    public response raiz(request r){
        response resp = new response();
        resp.setResult((float) Math.pow (r.getVal1(), 1.0 / r.getVal2()));
        resp.setStatus(0);
        return resp;
    }
}