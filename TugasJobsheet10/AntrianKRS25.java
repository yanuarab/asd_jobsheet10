package TugasJobsheet10;

public class AntrianKRS25 {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalProsesKRS;

    public AntrianKRS25(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalProsesKRS = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        totalProsesKRS = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian25(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void tampilkanSemua25() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanPalingAkhir25() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa di posisi belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan25() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("Dua Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void prosesKRS25() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak dapat memproses KRS.");
            return;
        }
        if (totalProsesKRS >= 30) {
            System.out.println("Jumlah maksimal mahasiswa yang dapat diproses oleh DPA telah tercapai.");
            return;
        }
        System.out.println("Memproses KRS untuk mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            System.out.print((i + 1) + ". ");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalProsesKRS++;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahProsesKRS() {
        return totalProsesKRS;
    }

    public int getJumlahBelumProses() {
        return size;
    }
}