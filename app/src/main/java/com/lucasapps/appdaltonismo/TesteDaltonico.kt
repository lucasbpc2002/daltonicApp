package com.lucasapps.appdaltonismo

data class TesteDaltonico(var resp1:String, var resp2:String, var resp3:String) {
    fun resuldadoResposta(): String {

        if (resp1.equals("") || resp2.equals("") || resp3.equals("")) {
            return "responda novamente"
        } else {
            if (resp1.equals("29") && resp2.equals("74") && resp3.equals("2")) {
                return "sem problema na sua visão"
            } else {
                return "Procure um medico"
            }
        }
    }
}
