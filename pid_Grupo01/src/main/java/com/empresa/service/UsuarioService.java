package com.empresa.service;

import java.util.List;

import com.empresa.entity.Rol;
import com.empresa.entity.Usuario;

public interface UsuarioService {

	public abstract Usuario login(Usuario bean);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
}
