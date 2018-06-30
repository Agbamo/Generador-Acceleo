package edu.uclm.esi.disoft.dominio;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

import org.json.JSONArray;
import org.json.JSONObject;


public class Manager {
	private ConcurrentHashMap<Integer, Mesa> mesas;
	private ConcurrentHashMap<String, Categoria> categorias;
	
	private Manager() {
	}
	
	private static class ManagerHolder {
		static Manager singleton=new Manager();
	}
	
	public static Manager get() {
		return ManagerHolder.singleton;
	}

public void add(tipoDelCampo.name/] mesa)
{
	this.mesas.put(mesa.get_id(), mesa);
}
public void add(tipoDelCampo.name/] categoria)
{
	this.categorias.put(categoria.get_id(), categoria);
}

}
