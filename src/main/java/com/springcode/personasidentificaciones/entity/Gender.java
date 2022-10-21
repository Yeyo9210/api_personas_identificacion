package com.springcode.personasidentificaciones.entity;

public enum Gender {
    HOMBRE {
        @Override
        public String toString(){
            return "H";
        }
    },
    MUJER {
        @Override
        public String toString(){
            return "M";
        }
    },
    OTHER {
        @Override
        public String toString(){
            return " ";
        }
    }
}
