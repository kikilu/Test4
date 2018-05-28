public class Test4 {
    public static void main(String[] args){
        String[] str = genRanStr(100,2);
        printStrArr(str,10);
        System.out.println("重复的元素为：");
        findSameStr(str);
    }

    //找出字符数组中相同的元素，并将其打印在控制台上
    private static void findSameStr(String[] strToPro){
        for (int i = 0;i < strToPro.length - 1;i++)
            for (int j = i + 1;j < strToPro.length;j++)
                if (strToPro[i].equals(strToPro[j])) {
                    System.out.print(strToPro[i] + " ");
                    break;
                }
    }

    //生成有numOfEle个元素，每个元素长度为lenOfEle的随机字符数组
    private static String[] genRanStr(int numOfEle,int lenOfEle){
        String[] ranStr = new String[numOfEle];
        for(int i = 0;i < ranStr.length;i++){
            ranStr[i] = randomStr(lenOfEle);
        }
        return ranStr;
    }

    //生成长度为length的随机字符串
    private static String randomStr(int length){
        char[] randChar = new char[length];
        int i = 0;

        while(i < length){
            int c = randomInt('0','z' + 1);
            //将非数字和字母的字符剔除
            if (c <= '9' || (c >= 'A' && c <= 'Z') || c >= 'a'){
                randChar[i] = (char)c;
                i++;
            }
        }
        return new String(randChar);
    }

    //在范围[a,b)内生成随机整数
    private static int randomInt(int a,int b){
        return (int)(a + (b - a) * Math.random());
    }

    //在屏幕上以column列的形式打印出字符数组strArryToPr
    private static void printStrArr(String[] strArrToPr,int column){
        for (int i = 0;i < strArrToPr.length;i++){
            System.out.print(strArrToPr[i] + " ");
            if ((i + 1) % column == 0)
                System.out.println();
        }
    }
}
