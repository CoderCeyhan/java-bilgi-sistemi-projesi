
public class Doktor extends Kisi {
	int diplomaNo;
 public Doktor(String isim, String TCKimlik, int diplomaNo) {
		super(isim, TCKimlik);
		this.diplomaNo=diplomaNo;
	}
 public int getDiplomaNo() {
	 return this.diplomaNo;
 }


 
}
