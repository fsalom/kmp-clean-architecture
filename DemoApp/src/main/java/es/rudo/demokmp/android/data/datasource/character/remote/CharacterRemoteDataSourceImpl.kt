package es.rudo.demokmp.android.data.datasource.character.remote
import es.rudo.demokmp.android.data.datasource.character.CharacterRemoteDataSource
import es.rudo.demokmp.android.data.datasource.character.remote.dto.CharacterDTO


class CharacterRemoteDataSourceImpl: CharacterRemoteDataSource {
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