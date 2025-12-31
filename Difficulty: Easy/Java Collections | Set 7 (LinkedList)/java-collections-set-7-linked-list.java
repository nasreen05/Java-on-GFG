class GfG {
    public void deleteNode(Node node) {
        // Copy data of next node
        node.data = node.next.data;

        // Link to next of next node
        node.next = node.next.next;
    }
}
