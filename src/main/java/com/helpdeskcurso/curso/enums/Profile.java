package com.helpdeskcurso.curso.enums;

public enum Profile {
    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private Integer code;
    private String description;

    Profile(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Profile toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (Profile x : Profile.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Perfil invalido");
    }
}



