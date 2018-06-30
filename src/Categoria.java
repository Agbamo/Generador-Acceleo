

package edu.uclm.esi.disoft.comandas.dominio;

import org.json.JSONObject;

import edu.uclm.esi.disoft.comandas.etiquetas.JSONable;

import edu.uclm.esi.disoft.comandas.etiquetas.BSONable;

@BSONable
public class Categoria {
	privateString_id;
	
	privateStringnombre;
	
	private java.util.Vector<Plato>platos;
	
	

	private int _id;
	private Comanda comandaActual;
	public Categoria() {
addValoresPorDefecto
}
      publicString_id(){
      return this._id;
      }
      
      publicStringNombre(){
      return this.nombre;
      }
      
      public java.util.Vector<Plato>Platos(){
      return this.platos;
      }
      
      		
public void setString(String_id){
this._id=_id;
}
public void setString(Stringnombre){
this.nombre=nombre;
}
public void add(Plato plato){
  this.platos.add( plato);
}


	
	


