package com.usuarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.usuarios.entidades.Usuario;

/**
 * Portlet implementation class Usuarios
 */
public class Usuarios extends MVCPortlet {
 
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		//UserLocalServiceUtil.

		usuarios.add(new Usuario(1, "Iker Babace", "elhipstermolon@guay.com", "@baba_iker"));
		usuarios.add(new Usuario(2, "Andrea Guezmes", "reinadelosgifs@trx.com", "@polgara"));
		usuarios.add(new Usuario(3, "Aroa Llorente", "lentejasalpoder@villalba.com", "@aroussmurefraise"));
		usuarios.add(new Usuario(4, "Jose Martínez", "mordiscosenelpapo@mordor.com", "@josmarjim"));
		usuarios.add(new Usuario(5, "Estefania Novales", "patáenlaboca@ieeeee.com", "@estefinova"));
		usuarios.add(new Usuario(5, "Sergio Rojo", "carlosvelgrande@linux.com", "@SRojoHerrero"));
		
		String personasJSON = JSONFactoryUtil.serialize(usuarios);
		
		resourceResponse.getWriter().print(personasJSON);
		
		
		
	}
	
	
	
}
