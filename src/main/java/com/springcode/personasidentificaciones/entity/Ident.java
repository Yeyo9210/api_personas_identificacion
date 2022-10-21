package com.springcode.personasidentificaciones.entity;

public enum Ident {
    INE {
        @Override
        public String toString(){
            return "INE";
        }
    },
    IFE {
        @Override
        public String toString(){
            return "IFE";
        }
    },
    PASS {
        @Override
        public String toString(){
            return "PASSPORT";
        }
    }
}
