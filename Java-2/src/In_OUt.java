package Input_Output;




import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

class File_Output{

    void Byte(){

        try{
            FileOutputStream fout = new FileOutputStream("test.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    void string(){
        try{
            FileOutputStream fout = new FileOutputStream("testout.txt");
            String s = "This is an example";
            byte b[]=s.getBytes();
            System.out.println(b);

            fout.write(b);
            fout.close();
            System.out.println("Success..");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


class Caller{
    public static void main(String args[]){
        File_Output File = new File_Output();
        File.Byte();
        File.string();
    }
}