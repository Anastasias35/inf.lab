package Exception;

public class HeightException extends Exception { // ошибка вылезет,если активация объекта null
    public HeightException(String message){
        super(message);
    }
}
