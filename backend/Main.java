import com.sun.source.doctree.SummaryTree;

public class Main{
 public static void main(String[] args) {
    //信息
    Applicant num1 = new Applicant();
    num1.setData("凤凰院凶真","114514",200);
    System.out.println("姓名："+num1.name+" ID："+num1.ID+" 申请金额："+num1.fund);
    //输入用途
    num1.setUse("研发时间机器");
    System.out.println(num1.use);
    //展示冻结后资金
    FundProvided fp1 = new FundProvided();
    float ff = fp1.Frozen(num1.fund);
    //确认申请通过与否(1:ok , 0:no)
    fp1.ok(0);
    }
}

