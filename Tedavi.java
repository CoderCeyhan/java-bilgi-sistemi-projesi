
public class Tedavi {
   String ayrintilar;
   Doktor doktor;
   Hasta hasta;
   public Tedavi(Hasta hasta,Doktor doktor) {
	   this.hasta=hasta;
	   this.doktor=doktor;
   }
   public Hasta getHasta() {
	   return this.hasta;
   }
   public Doktor getDoktor() {
	   return this.doktor;
   }
   public String getAyrintilar() {
	   return this.ayrintilar;
   }
   public void setAyrintilar(String ayrintilar) {
	  this.ayrintilar=ayrintilar; 
   }
}
