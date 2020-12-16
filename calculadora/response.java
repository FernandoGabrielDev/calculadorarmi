package calculadora;

public class response implements java.io.Serializable {
    private int status;
    private float result;
    public response(int status, float result) {
        this.status = status;
        this.result = result;
    }
    public response() { }
    public int getStatus() {
        return status;
    }
    public float getResult() {
        return result;
    }
    public void setStatus(int newstatus) {
        status = newstatus;
    }
    public void setResult(float newresult) {
        result = newresult;
    }
}