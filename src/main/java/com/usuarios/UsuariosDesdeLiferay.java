package com.usuarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.usuarios.entidades.UsuarioLiferay;

/**
 * Portlet implementation class UsuariosDesdeLiferay
 */
public class UsuariosDesdeLiferay extends MVCPortlet {
 

	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws IOException, PortletException {
		
		List<UsuarioLiferay> usuario = new ArrayList<UsuarioLiferay>();
		
		try {
			List<User>usuarioLife = UserLocalServiceUtil.getUsers(0, 100);
			
			for (User user : usuarioLife){
				
				usuario.add(new UsuarioLiferay(user.getUserId(),user.getFirstName()));
			}
			

		} catch (SystemException e) {
			
			e.printStackTrace();
		}

		
		String usuariosJSON = JSONFactoryUtil.serialize(usuario);
		
		response.getWriter().print(usuariosJSON);
		
	}
	
}
