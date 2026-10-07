package demo1;

public class KeyBoard implements IUsb{
    public void inputContent() {
        System.out.println("输入内容");
    }


    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }

    @Override
    public void input() {
        this.inputContent();
    }
}
