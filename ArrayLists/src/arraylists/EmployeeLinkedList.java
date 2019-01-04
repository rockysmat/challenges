package arraylists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    
    public void addToFront(Employee emp) {
        EmployeeNode node = new EmployeeNode(emp);
        node.setNext(head);
        head = node;
    }
}
