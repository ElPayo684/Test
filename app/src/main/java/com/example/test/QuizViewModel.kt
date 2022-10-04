package com.example.test

import androidx.lifecycle.ViewModel

abstract class QuizViewModel : ViewModel() {

    private var questions = mutableListOf<Question>()

    init {
//        Videojuegos
        questions.add(Question("¿En que lenguaje de programación esta programado el juego de 'Valorant'?"
            ,"C++", true, 10, "videojuegos"))
        questions.add(Question("¿En que lenguaje de programación esta programado el juego de 'The Witcher 3: Wild Hunt'?"
            ,"C++", true, 10, "videojuegos"))
        questions.add(Question("¿En que lenguaje de programación esta programado el juego de 'Minecraft'?"
            ,"Java", true, 10, "videojuegos"))
        questions.add(Question("¿En que lenguaje de programación esta programado el juego de 'Mario 64'?"
            ,"C", true, 10, "videojuegos"))
        questions.add(Question("¿En que lenguaje de programación esta programado el juego de 'The Sims 4'?"
            ,"Python", true, 10, "videojuegos"))
//        Aplicaciones
        questions.add(Question("¿En que lenguaje de programación esta programado la aplicación 'Dropbox'?"
            ,"Python", true, 10, "aplicaiones"))
        questions.add(Question("¿Qué aplicación fue vendida por Kevin Systrom a Facebook?"
            ,"Instagram", true, 10, "aplicaiones"))
        questions.add(Question("Fecha de lanzamiento de TikTok:"
            ,"Septiembre de 2016", true, 10, "aplicaiones"))
        questions.add(Question("¿Cuál de estas aplicaciones no pertenece a la empresa 'meta'?"
            ,"Telegram", true, 10, "aplicaiones"))
        questions.add(Question("¿Qué aplicación es actualmente la más descargada?"
            ,"TikTok", true, 10, "aplicaiones"))
        //        Clima
        questions.add(Question("Según los mexicanos ¿Cuál es el mes más propenso a temblores?"
            ,"Septiembre", true, 10, "clima"))
        questions.add(Question("¿Cómo se le llama a una ola de grandes dimensiones que puede desplazarse a una velocidad de hasta 50 km/h en cualquier dirección"
            ,"Tsunami", true, 10, "clima"))
        questions.add(Question("¿Qué son las líneas que unen en un mapa los puntos con la misma temperatura?"
            ,"Isoterma", true, 10, "clima"))
        questions.add(Question("¿Qué tipo de viento son los Monzones?"
            ,"Viento Estacional", true, 10, "clima"))
        questions.add(Question("¿Cómo se llama el lado de la montaña expuesto a los vientos?"
            ,"Barlovento", true, 10, "clima"))
        //        Geografía
        questions.add(Question("¿Dónde se encuentra la Sagrada Familia?"
            ,"Barcelona", true, 10, "geografia"))
        questions.add(Question("¿Cuál es el océano más grande del mundo?"
            ,"Pacífico", true, 10, "geografia"))
        questions.add(Question("¿Cual es país más poblado de la Tierra?"
            ,"China", true, 10, "geografia"))
        questions.add(Question("¿Qué país del mundo produce más vino?"
            ,"Italia", true, 10, "geografia"))
        questions.add(Question("¿En qué país se encuentra el estadio de Wembley?"
            ,"Reino Unido", true, 10, "geografia"))
        //        Ecuaciones
        questions.add(Question("2(1+2x)=10"
            ,"x=2", true, 10, "ecuaciones"))
        questions.add(Question("-2(3x-2)=-2"
            ,"x=1", true, 10, "ecuaciones"))
        questions.add(Question("5-2(1-x)=2x-3"
            ,"No tiene solución", true, 10, "ecuaciones"))
        questions.add(Question("4(x-10)=-6(2-x)-6x"
            ,"x=7", true, 10, "ecuaciones"))
        questions.add(Question("2(x+1)-3(x-2)=x+6"
            ,"x=1", true, 10, "ecuaciones"))


    }

}