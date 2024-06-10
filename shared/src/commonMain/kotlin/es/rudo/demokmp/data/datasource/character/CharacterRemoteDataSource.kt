package es.rudo.demokmp.data.datasource.character

import es.rudo.demokmp.data.datasource.character.RickAndMorty.dto.CharacterDTO

interface CharacterRemoteDataSource {
    fun getCharacters(): List<CharacterDTO>
}