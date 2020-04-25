public class Pegawai {
	String nik;
	String nama;
	String jabatan;
	boolean isAktif;
		public String getNik() {
		return nik;
		}
		public String getNama() {
		return nama;
		}
		public String getJabatan() {
		return jabatan;
		}
		public boolean isAktif() {
		return isAktif;
		}
		public void cetak() {
		System.out.println(&quot;NIK : &quot; + nik);
		System.out.println(&quot;Nama : &quot; + nama);
		System.out.println(&quot;Jabatan : &quot; + jabatan);
		System.out.println(&quot;Status : &quot; + isAktif);
	}
}