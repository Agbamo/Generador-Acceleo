

package edu.uclm.esi.disoft.comandas.dominio;

import org.json.JSONObject;

import edu.uclm.esi.disoft.comandas.etiquetas.JSONable;

import edu.uclm.esi.disoft.comandas.etiquetas.BSONable;

@BSONable
public class Comanda {
	privatelonghoraApertura;
	
	privatelonghoraCierre;
	
	private java.util.Vector<PlatoPedido>platos;
	
	

	private int _id;
	private Comanda comandaActual;
	public Comanda() {
addValoresPorDefecto
}
      publiclongHoraApertura(){
      return this.horaApertura;
      }
      
      publiclongHoraCierre(){
      return this.horaCierre;
      }
      
      public java.util.Vector<PlatoPedido>Platos(){
      return this.platos;
      }
      
      		
public void setLong(longhoraApertura){
this.horaApertura=horaApertura;
}
public void setLong(longhoraCierre){
this.horaCierre=horaCierre;
}
public void add(PlatoPedido platoPedido){
  this.platos.add( platoPedido);
}


	
	


