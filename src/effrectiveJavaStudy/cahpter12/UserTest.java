package effrectiveJavaStudy.cahpter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserTest {
    static final String serializedFile = "user";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        for(int i=0; i<10000 ; i++){
//            serializeByProtocolBuffer();
            deserializeByProtocolBuffer();
//        }
//        stopWatch.stop();
//        log.info("직렬화, 역직렬화 1000번 실행 시간 : {}",stopWatch.getTime());
    }

    private static void serializeByProtocolBuffer() throws IOException {
        User u = new User();
        u.setAge(29);
        u.setName("hosik ham");

        File file = new File(serializedFile);
        try(
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ){
            oos.writeObject(u);
        }

    }
    private static void deserializeByProtocolBuffer() throws IOException, ClassNotFoundException {
        File file = new File(serializedFile);
        try(
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ){
            User u = (User)ois.readObject();
          System.out.println(u);
        }
    }
}
