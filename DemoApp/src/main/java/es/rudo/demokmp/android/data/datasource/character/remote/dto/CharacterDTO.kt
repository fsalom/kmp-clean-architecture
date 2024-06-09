package es.rudo.demokmp.android.data.datasource.character.remote.dto

import java.io.Serializable

data class CharacterDTO(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val image: String = "",
    val episodes: List<String> = listOf()
): Serializable