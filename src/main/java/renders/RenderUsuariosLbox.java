package renders;

import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import usuarios.EntidadUsuarios;
import org.zkoss.zul.Listcell;
public class RenderUsuariosLbox implements ListitemRenderer{

	@Override
	public void render(Listitem l, Object t, int index) throws Exception {
		EntidadUsuarios u = (EntidadUsuarios) t;
		Listcell nombre = new Listcell(u.getNombre());
		l.appendChild(nombre);
		Listcell apellido = new Listcell(u.getApellido());
		l.appendChild(apellido);
		Listcell edad = new Listcell(String.valueOf(u.getEdad()));
		l.appendChild(edad);
		Listcell clave = new Listcell("********");
		l.appendChild(clave);
		//clave.appendChild(new Button ("btn"))
		l.setAttribute("selected", u);
		/*
		 * if(u.getEdad()==24){
		 * i.setStyle("background: #000");
		 * 
		 */
		
	}

}
