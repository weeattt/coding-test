import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[]args) throws IOException {
        
        try {
            BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
            
            String text[] = s_rd.readLine().split(" ");
            int j = Integer.parseInt(text[0]);
            double max=0;
            double sum=0;
 
            String num[] = s_rd.readLine().split(" ");
            double re_num[] = new double[j];
            
//            max 값 구하기
            for(int i=0; i<j; i++) {
                re_num[i] = Integer.parseInt(num[i]);
                if(Integer.parseInt(num[i])>max) {
                    max = Integer.parseInt(num[i]);
                }
            }
//            전체 값 수정하기
            for(int i=0; i<j; i++) {
                re_num[i]= re_num[i]/max*100;
                sum += re_num[i];
            }
//            평균 값 구하기
            System.out.println(sum/j);
        }
        catch(IOException e) {
        }
    }
}
