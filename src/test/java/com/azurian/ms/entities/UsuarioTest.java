package com.azurian.ms.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    public void usuarioObjectConstructWithEmpty() {
        final var usuario = new Usuario();
        usuario.setId(1);
        usuario.setName(null);
        usuario.setEmail(null);
        usuario.setPassword(null);
        usuario.setCreated(null);
        usuario.setModified(null);
        usuario.setLastLogin(null);
        usuario.setActive(false);
        Assertions.assertEquals(1, usuario.getId());
        Assertions.assertEquals(null, usuario.getName());
        Assertions.assertEquals(null, usuario.getEmail());
        Assertions.assertEquals(null, usuario.getPassword());
        Assertions.assertEquals(null, usuario.getCreated());
        Assertions.assertEquals(null, usuario.getModified());
        Assertions.assertEquals(null, usuario.getLastLogin());
        Assertions.assertEquals(false, usuario.isActive());
        Assertions.assertNotNull(usuario.toString());
    }

}
