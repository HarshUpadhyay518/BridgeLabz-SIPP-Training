import java.io.*;

class BackupData implements Serializable {
    String content;
    BackupData(String content) { this.content = content; }
}

public class DataSerialization {
    public static void main(String[] args) throws Exception {
        BackupData data = new BackupData("Important Backup Data");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.ser"));
        oos.writeObject(data);
        oos.close();
        System.out.println("Data serialized for backup.");
    }
}
