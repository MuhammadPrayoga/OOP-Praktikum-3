public class InfoPerson {  
    public static void main(String[] args) { 

        // Membuat objek Anton
        Person anton = new Person();

        // Memanggil atribut dan memberi nilai Anton
        anton.setNama("Anton");
        anton.setJenisKelamin("Laki-laki");
        anton.setUmur(20);
        System.out.println("Nama: " + anton.getNama());
        System.out.println("Jenis Kelamin: " + anton.getJenisKelamin());
        System.out.println("Umur: " + anton.getUmur());

        // Membuat objek Riko
        Person riko = new Person();
        
        // Memanggil atribut dan memberi nilai Riko
        riko.setNama("Riko");
        riko.setJenisKelamin("Laki-laki");
        riko.setUmur(18);
        System.out.println("\nNama: " + riko.getNama());
        System.out.println("Jenis Kelamin: " + riko.getJenisKelamin());
        System.out.println("Umur: " + riko.getUmur());
    }
}