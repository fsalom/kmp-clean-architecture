package es.rudo.demokmp.data.datasource.character.RickAndMorty.dto

data class CharacterDTO(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val image: String = "",
    val episodes: List<String> = listOf()
)