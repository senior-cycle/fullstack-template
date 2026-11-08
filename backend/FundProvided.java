public class FundProvided {
    public float Sum = 1000;
    public float total = Sum;
    //冻结资金
    float Frozen(float fund){
        if(fund>=Sum){
            System.out.println("没钱了无法报销");
            return 0;
        }else {
            Sum = Sum - fund;
            System.out.println("你的申请已提交，等待老师审阅");
            return fund;
        }

    }
    //确认
    int ok(int condition) {
        if (condition == 1 && Sum>=0){
            total = Sum;
            System.out.println("你的申请通过！剩余可用金额："+total);
        }
        else if(condition == 0){
            System.out.println("你的申请不通过");
            System.out.println("原因：（待输入）");
        }
        return 0;
    }

}
