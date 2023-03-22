package queue_suDungMang;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return true;
    }
    // phương thức kiểm tra hàng đợi có trống hay không, true-hàng đợi đang trống,
    // false-hàng đợi chứa ít nhất 1 phn tủ
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueEmpty()) {
            System.out.println("hàng đợi đang trống,không thêm phân tử khỏi mảng");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phần tử :" + item + " được đẩy vào queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("hàng đợi đang trống,không thể xóa phần tử khỏi mảng");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("thao tác pop hoàn tất!removed : " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("thao tác pop hoàn tất! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}

