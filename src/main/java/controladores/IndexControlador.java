package controladores;
import usuarios.EntidadUsuarios;
import org.zkoss.zul.Window;

import renders.RenderUsuariosLbox;

import java.util.ArrayList;

import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;

public class IndexControlador extends ControladorBase{
	protected Window ventana;
	protected Listbox lbxUsuarios;
	protected Label lbl;
	public IndexControlador() {
		
	}
	
	public void onCreate$ventana() {
		llenarListbox();
	}
	
	public void llenarListbox() {
		ArrayList<EntidadUsuarios> ele = new ArrayList<EntidadUsuarios>();
		EntidadUsuarios e = new EntidadUsuarios();
		e.setNombre("Julian");
		e.setApellido("Macri");
		e.setClave("Julian12");
		e.setEdad(24);
		ele.add(e);
		EntidadUsuarios e2 = new EntidadUsuarios();

		e2.setNombre("Julian");
		e2.setApellido("Macri");
		e2.setClave("Julian12");
		e2.setEdad(24);
		ele.add(e2);
		ele.add(e2);
		ele.add(e2);
		ele.add(e2);
		ele.add(e2);
		ele.add(e2);
		
		ListModelList modelo = new ListModelList(ele);
		lbxUsuarios.setModel(modelo);
		lbxUsuarios.setItemRenderer(new RenderUsuariosLbox());
		
	}
	public void onSelect$lbxUsuarios() {
		EntidadUsuarios u = (EntidadUsuarios) lbxUsuarios.getSelectedItem().getAttribute("selected");
		lbl.setValue(u.toString());
	}
}
