import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/*
 * 物理地址是48位，别和ipv6搞错了
 */
public class LOCALMAC {
    /**
     * @param args
     * @throws UnknownHostException
     * @throws SocketException
     */
    public static void main(String[] args) throws UnknownHostException, SocketException {
        // TODO Auto-generated method stub

        //得到IP，输出PC-201309011313/122.206.73.83
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia.getHostAddress());
        getMACAddress(ia.getHostAddress());
    }
    public static  String getMACAddress(String ip) {
        String str = "";
        String macAddress = "";
        try {
            Process p = Runtime.getRuntime().exec("nbtstat -A " + ip);
            InputStreamReader ir = new InputStreamReader(p.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            for (int i = 1; i < 100; i++) {
                str = input.readLine();
                if (str != null) {
                    if (str.indexOf("MAC 地址") > 1)
                    {//客户端使用的是中文版操作系统
                         macAddress = str.substring(str.indexOf("MAC 地址") + 9, str.length());
                         break;
                    }else if(str.indexOf("MAC Address") > 1){
                        macAddress = str.substring(str.indexOf("MAC Address") + 14, str.length());
                        break;}
                    }
                }
        } catch (IOException e) {e.printStackTrace(System.out);}
           return macAddress;}

}