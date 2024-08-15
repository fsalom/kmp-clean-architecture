package es.rudo.demokmp.data.datasource.character.RickAndMorty

import es.rudo.demokmp.data.datasource.character.CharacterRemoteDataSource
import es.rudo.demokmp.data.datasource.character.RickAndMorty.dto.CharacterDTO
import io.ktor.client.HttpClient


class CharacterRemoteDataSourceImpl: CharacterRemoteDataSource {
    private val client = HttpClient()
    override fun getCharacters(): List<CharacterDTO> {
        return createListOfCharacters()
    }

    private fun createListOfCharacters(): List<CharacterDTO> {
        val characterList = ArrayList<CharacterDTO>()
        characterList.add(
            CharacterDTO(id = 0,
            name = "Rick",
            status = "alive",
            species = "human")
        )
        characterList.add(
            CharacterDTO(id = 0,
            name = "Morty",
            status = "alive",
            species = "human")
        )
        characterList.add(
            CharacterDTO(id = 0,
            name = "Rick",
            status = "alive",
            species = "human")
        )
        return characterList
    }
}