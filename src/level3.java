import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class level3 {
    public static void main(String[] args) {
        try{
            LinkedList<Character> ll =new LinkedList<Character>();
            boolean flag = false;
            while(true) {
                char i = (char) System.in.read();
                if(i=='#' && flag == false){
                    flag = true;
                    continue;
                }
                if(flag == true && i=='o'){
                    break;
                }
                else if(flag == true && i=='b'){
                  ll.removeLast();
                  flag = false;
                  continue;
                }else if(i=='c'&& flag == true){
                    for(int j=0;j<=ll.size();j++){
                        if(ll.size()<=0)
                            break;
                        char temp = ll.peekLast();
                        if(	temp =='\n'||temp =='\r' ){
                            break;
                        }else {
                            ll.removeLast();
                        }
                    }
                    flag = false;
                   continue;
                }else if(flag == true ){
                    ll.addLast('#');
                }
                ll.addLast(i);
                flag=false;
            }
            for (int i = 0; i < ll.size(); i++) {
                System.out.print(ll.get(i));
            }
            System.out.println();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}

