package demo1;

public class Mouse implements IUsb{

    public void click() {
        System.out.println("点击鼠标");
    }

    @Override
    public void openDevice() {
        System.out.println("插入鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }

    @Override
    public void input() {
        this.click();
    }
}
