package es.rudo.demokmp.android.data.datasource.character
import es.rudo.demokmp.android.data.datasource.character.remote.dto.CharacterDTO

interface CharacterRemoteDataSource {
    fun getCharacters(): List<CharacterDTO>
}