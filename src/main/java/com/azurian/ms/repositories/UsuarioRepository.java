/*
 * @(#)UsuarioRepository.java
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
package com.azurian.ms.repositories;

import com.azurian.ms.entities.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UsuarioRepository.
 *
 * @author Jose.
 * @version 1.0.0
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByIsActive(boolean isActive);

    List<Usuario> findByNameContaining(String name);

    Optional<Usuario> findByEmail(String email);
}
