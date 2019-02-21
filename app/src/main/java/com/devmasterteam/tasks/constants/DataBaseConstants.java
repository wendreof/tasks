package com.devmasterteam.tasks.constants;

/**
 * Todas as constantes utilizadas no banco de dados
 * Tabelas, Colunas
 */
public class DataBaseConstants {

    /**
     * Não deve ser instanciada
     */
    private DataBaseConstants() {
    }

    /**
     * Tabelas disponíveis no banco de dados com suas colunas
     */
    public static class PRIORITY {
        public static final String TABLE_NAME = "Priority";

        public static class COLUMNS {
            public static final String ID = "_id";
            public static final String DESCRIPTION = "description";
        }
    }

}
