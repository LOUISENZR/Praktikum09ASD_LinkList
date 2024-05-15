public class Tugas2Main {
    public static void main(String[] args) {
        Tugas2Linked hunt = new Tugas2Linked();
        System.out.println("=======================================================");
        System.out.println("========***========== SCAVENGER HUNT ========***=======");        
        hunt.addPoint("Apakah ikan tidur", "Tidak tau");
        hunt.addPoint("Apakah nama zat hijau daun", "Klorofil");
        hunt.addPoint("Planet terbesar", "Jupiter");
        hunt.addPoint("Siapa menteri luar negeri Indonesia", "Retno Marsudi");
        hunt.addPoint("Berapa jumlah kaki jerapah", "empat");
        hunt.print();
        System.out.println("=======================TERIMAKASI======================");
    }
}
