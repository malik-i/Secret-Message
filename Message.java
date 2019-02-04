import java.lang.*;

public class Message {
    private String msg = "SFSUSPRING";
    private int origMsL = msg.length();
    private int msg_length = msg.length();


    public String getMsg(){
        return msg;
    }
    public void setMsg(String m){
        this.msg = m;
    }

    public int getMsg_length(){
        return msg_length;
    }

    public void setMsg_length(int m_l){
        this.msg_length = m_l;
    }
    public int getOrigMsL(){
        return origMsL;
    }

    /*
    we want to increment the length by one,
        until the greatest % 0

     */
    public void findSquare(){
        //int greatestSquare = msg_length;
        boolean foundGreatest = false;

        while(foundGreatest == false){
            double sqRoot = (Math.sqrt(msg_length));
            if(sqRoot == (int)sqRoot){
                foundGreatest = true;
                break;
            } else {
                msg_length++;
                foundGreatest = false;
            }
        }
        // System.out.println(msg_length)
    }

    public void buildMatrix(){
        double dim = Math.sqrt(msg_length);
        char msgArr[] = msg.toCharArray();
        int iMsgArr = 0;
        char sqMatrix[][] = new char[(int)dim][(int)dim];

        for(int i = 0; i < (int)dim; i++){
            for(int j = 0; j < (int)dim; j++){
                if (iMsgArr < origMsL) {
                    sqMatrix[i][j] = msgArr[iMsgArr];
                    iMsgArr++;
                } else {
                    sqMatrix[i][j] = '*';
                }

            }
        }

        for(int j = 0; j < (int)dim; j++){
            for(int i = (int)dim-1; i >= 0; i--){
                if(sqMatrix[i][j] != '*')
                System.out.print(sqMatrix[i][j]);
            }
        }
    }
}
