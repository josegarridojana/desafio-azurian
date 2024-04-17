/*
 * @(#)UsuarioService.java
 *
 * Copyright (c) (Chile). All rights reserved.
 *
 * All rights to this product are owned by and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.azurian.ms.services;

import com.azurian.ms.entities.Usuario;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * UsuarioService.
 *
 * @author Jose.
 * @version 1.0.0
 */
public interface UsuarioService {

    List<Usuario> getAllUsuarios();

    List<Usuario> getAllUsuariosByName(String nombre);

    Usuario getUsuarioById(long id);

    Usuario createUsuario(Usuario usuario);

    Usuario updateUsuario(long id, Usuario usuario);

    ResponseEntity<HttpStatus> deleteUsuario(long id);

    ResponseEntity<HttpStatus> deleteAllUsuarios();

    List<Usuario> findByIsActive();
}
