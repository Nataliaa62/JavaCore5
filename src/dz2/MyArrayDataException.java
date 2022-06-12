package dz2;

public class MyArrayDataException extends  Exception {
    public MyArrayDataException (String message){
        super(message);
    }

}
   /* Создает новое исключение с указанным подробным сообщением. Причина не инициализируется и впоследствии может быть
   инициализирована вызовом initCause. Параметры: сообщение – подробное сообщение.
   Подробное сообщение сохраняется для последующего извлечения методом GetMessage(). !!!! */