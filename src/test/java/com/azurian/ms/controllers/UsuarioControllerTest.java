/*
 * @(#)UsuarioControllerTest2.java
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
package com.azurian.ms.controllers;

import com.azurian.ms.entities.Usuario;
import com.azurian.ms.fixture.UsuarioFixture;
import com.azurian.ms.services.UsuarioService;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * UsuarioControllerTest2.
 *
 * @author Jose.
 * @version 1.0.0
 */
@ExtendWith(SpringExtension.class)
public class UsuarioControllerTest {

    /** usuarioService. */
    @Mock
    private UsuarioService usuarioService;
    /** controller. */
    @InjectMocks
    private UsuarioController controller;

    // -------------------------------------------------------------------
    // -- Tests ----------------------------------------------------------
    // -------------------------------------------------------------------
    /**
     * Test.
     *
     * @throws Exception {@link Exception}
     */
    @Test
    void testGetAllUsuarios() {
        final List<Usuario> rs = UsuarioFixture.getUsuarios();
        Mockito.when(this.usuarioService.getAllUsuarios())
            .thenReturn(rs);
        Assertions.assertNotNull(this.controller.getAllUsuarios());
    }

    // -------------------------------------------------------------------
    // -- Tests ----------------------------------------------------------
    // -------------------------------------------------------------------
    /**
     * Test.
     *
     * @throws Exception {@link Exception}
     */
    @Test
    void testCreateUsuario() {
        final Usuario rs = UsuarioFixture.getUsuario();
        final Usuario rq = UsuarioFixture.getUsuarioRequest();
        Mockito.when(this.usuarioService.createUsuario(ArgumentMatchers.any()))
            .thenReturn(rs);
        Assertions.assertNotNull(this.controller.createUsuario(rq));
    }

}
