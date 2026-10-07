package demo1;

/**
 * usb接口
 */


public interface IUsb {
    void openDevice();
    void closeDevice();
    void input();
}
