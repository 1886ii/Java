package demo1;

public class Computer {
    public void usbDevice(IUsb iUsb) {
        iUsb.openDevice();
        iUsb.input();
        iUsb.closeDevice();
    }


    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.usbDevice(new KeyBoard());
        computer.usbDevice(new Mouse());
    }
}
