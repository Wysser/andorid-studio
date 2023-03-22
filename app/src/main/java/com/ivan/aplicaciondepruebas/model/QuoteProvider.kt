package com.ivan.aplicaciondepruebas.model

import kotlin.random.Random

class QuoteProvider {

    companion object {

        fun random():QuoteModel{
            val position = Random.nextInt(0, 6)
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "Quien no echa de menos a la urss no tiene corazon, quien quiera que" +
                        " vuelva no tiene cerebro",
                author = "Vladimir Putin"
            ),
            QuoteModel(
                quote = "La vida es como una caja de chocolates, nunca sabes lo que te va a tocar.",
                author = "Forrest Gump"
            ),

            QuoteModel(
                quote =
                "El éxito no es la clave de la felicidad. La felicidad es la clave del éxito.",
                author = "Albert Schweitzer"
            ),

            QuoteModel(
                quote = "La vida es demasiado corta para perder el tiempo en cosas que no te hacen feliz.",
                author = "Unknown"
            ),

            QuoteModel(
                quote = "Nunca es tarde para ser lo que podrías haber sido.",
                author = "George Eliot"
            ),

            QuoteModel(
                quote = "La felicidad no es algo hecho. Viene de tus propias acciones.",
                author = "Dalai Lama"
            )
        )
    }
}