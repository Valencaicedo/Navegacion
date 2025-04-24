package com.tuapp.paquete  // cambia esto por el nombre de tu paquete real

// ---------------- Dos mitades ----------------

fun dosMitades(cadena: String): String {
    if (cadena.isEmpty()) return ""
    val medio = (cadena.length + 1) / 2
    val primeraMitad = cadena.substring(0, medio)
    val segundaMitad = cadena.substring(medio)
    return segundaMitad + primeraMitad
}

// ---------------- Dos palabras ----------------

fun intercambiarPalabras(entrada: String): String {
    val partes = entrada.split(" ")
    return if (partes.size == 2) {
        "${partes[1]} ${partes[0]}"
    } else {
        "error"
    }
}
// ---------------- Quitar fragmento ----------------

fun quitarFragmento(cadena: String): String {
    val primera = cadena.indexOf('h')
    val ultima = cadena.lastIndexOf('h')
    if (primera == -1 || primera == ultima) {
        return "error"
    }
    return cadena.removeRange(primera, ultima + 1)
}
