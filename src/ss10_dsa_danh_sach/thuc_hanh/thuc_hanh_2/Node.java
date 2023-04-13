package ss10_dsa_danh_sach.thuc_hanh.thuc_hanh_2;

public class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
