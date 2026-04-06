
public abstract class Kisi {
     String isim;
     String TCKimlik;
     
     public Kisi(String isim,String TCKimlik) {
    	 this.isim=isim;
    	 this.TCKimlik=TCKimlik;
     }
     public String getIsim() {
    	 return this.isim;
     }
     public String getTCKimlik() {
    	 return this.TCKimlik;
     }
}
