package cloud.folium.internship.iostreams;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/java/cloud/folium/internship/iostreams/resources/output.txt");
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

        ByteArrayInputStream byteArrayInputStream = null;

        out.writeUTF("Hello");
        out.writeInt(123);
        out.close();

        System.out.println(in.readUTF());
        System.out.println(in.readInt());
        in.close();

        try{
            String str = "This is byte array input!...";
            byte[] bytearray = str.getBytes("UTF-8");
            byteArrayInputStream = new ByteArrayInputStream(bytearray);
            int ch;
            while((ch = byteArrayInputStream.read()) != -1){
                System.out.print((char) ch);
            }
        }finally{
            if(byteArrayInputStream != null){
                byteArrayInputStream.close();
            }
        }

    }
}
