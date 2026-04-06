import java.util.ArrayList;

public class BilgiSistemi {
	ArrayList<Hasta> hastalar=new ArrayList<Hasta>();
	ArrayList<Doktor> doktorlar=new ArrayList<Doktor>();
	ArrayList<Tedavi> tedaviler=new ArrayList<Tedavi>();
    public BilgiSistemi() {
		
    }
    public static void main(String[] args) {
		BilgiSistemi bs = new BilgiSistemi();
		Hasta emre= new Hasta("Emre","123456789",2001);
    	Hasta umit= new Hasta("Umit","123456788",2002);
    	Doktor doktor1 = new Doktor("doktor1", "123", 12345);
    	Doktor doktor2 = new Doktor("doktor2", "321", 54234);
    	Doktor doktor3 = new Doktor("doktor3", "12345", 123);
    	bs.hastaEkle(emre);
    	bs.hastaEkle(umit);
    	bs.doktorEkle(doktor1);
    	bs.doktorEkle(doktor2);
    	try {
			bs.tedaviEkle(emre, doktor2);
		} catch (KisiBulunamadiException e) {}
    	try {
			bs.tedaviEkle(umit, doktor1);
		} catch (KisiBulunamadiException e) {}
    	try {
			bs.tedaviEkle(umit, doktor3);
		} catch (KisiBulunamadiException e) {}
	}
    public boolean hastaEkle(Hasta hasta) {
    	try {
			if(!hastaBul(hasta.TCKimlik).equals(null)) {
				return false;
			}
		} catch (KisiBulunamadiException e) {
			hastalar.add(hasta);
			System.out.println(hasta.isim + " Isimli " + hasta.TCKimlik + " TcKimlik numarali hasta basariyla eklendi.");
			return true;
		}
    	return false;
    }
    public boolean doktorEkle(Doktor doktor) {
    	try {
			if(!doktorBul(doktor.TCKimlik).equals(null)) {
				return false;
			}
		} catch (KisiBulunamadiException e) {
			doktorlar.add(doktor);
			System.out.println(doktor.isim + " Isimli " + doktor.TCKimlik + " TcKimlik numarali doktor basariyla eklendi.");
			return true;
		}
    	return false;
    }
    public void tedaviEkle(Hasta hasta,Doktor doktor) throws KisiBulunamadiException {
    	try {
			if(!doktorBul(doktor.TCKimlik).equals(null) && !hastaBul(hasta.TCKimlik).equals(null)) {
				Tedavi tedavi = new Tedavi(hasta, doktor);
				tedavi.setAyrintilar("Hasta Adý: " + hasta.isim + "\nDoktor Adý: " + doktor.isim);
				tedaviler.add(tedavi);
				System.out.println("Tedavi basariyla eklendi.");
			}
		} catch (KisiBulunamadiException e) {
			throw new KisiBulunamadiException("Hasta veya doktor bulunamadi!");
		}
    }
    
    public Hasta hastaBul(String TCKimlik) throws KisiBulunamadiException  {
    	for(int i=0;i<hastalar.size();i++) {
			if(hastalar.get(i).TCKimlik == TCKimlik) {
				return hastalar.get(i);
			}
		}
    	throw new KisiBulunamadiException(TCKimlik + " TcKimlik numarali hasta bulunamadi.");
    }
    public Doktor doktorBul(String TCKimlik) throws KisiBulunamadiException  {
    	for(int i=0;i<doktorlar.size();i++) {
			if(doktorlar.get(i).TCKimlik == TCKimlik) {
				return doktorlar.get(i);
			}
		}
    	throw new KisiBulunamadiException(TCKimlik + " TcKimlik numarali doktor bulunamadi!");
    }
    
}
