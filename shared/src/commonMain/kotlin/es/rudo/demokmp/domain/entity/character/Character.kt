package es.rudo.demokmp.domain.entity.character

data class Character(
    val id: Int = 0,
    val name: String = "",
    val status: String = "",
    val species: String = "",
    val image: String = "",
    val episodes: List<String> = listOf()
)