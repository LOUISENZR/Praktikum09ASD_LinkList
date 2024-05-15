public class Tugas2Linked {
    Tugas2 head;

    public Tugas2Linked(){
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addPoint(String tanya, String jawab) {
        Tugas2 newPoint = new Tugas2(tanya, jawab);
        if (isEmpty()) {
            head = newPoint;
        } else {
            Tugas2 currentNode = head;
            while (currentNode.nextPoin != null) {
                currentNode = currentNode.nextPoin;
            }
            currentNode.nextPoin = newPoint;
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada point dalam scavenger hunt.");
        } else {
            Tugas2 current = head;
            while (current != null) {
                System.out.println("Pertanyaan: " + current.tanya);
                System.out.println("Jawaban: " + current.jawab);
                current = current.nextPoin;
            }
        }
    }
}