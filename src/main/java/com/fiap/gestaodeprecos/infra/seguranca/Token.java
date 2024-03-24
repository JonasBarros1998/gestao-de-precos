package com.fiap.gestaodeprecos.infra.seguranca;

import jakarta.servlet.http.HttpServletRequest;

public class Token {
	private static String tokenDoUsuario;

	public static String recuperar(HttpServletRequest request) {
		var token = request.getHeader("Authorization");
		if(token == null) {
			throw new RuntimeException("envie o token JWT nos headers da sua requisicao");
		}
		tokenDoUsuario = token.replace("Bearer ", "");
		return tokenDoUsuario;
	}

	public static String acessarToken() {
		return tokenDoUsuario;
	}
}
