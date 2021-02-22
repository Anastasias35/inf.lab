package Exception;

public class MassiveException extends Exception{
    public MassiveException(String message){  //выход за границы массива
        super(message);
    }
}
