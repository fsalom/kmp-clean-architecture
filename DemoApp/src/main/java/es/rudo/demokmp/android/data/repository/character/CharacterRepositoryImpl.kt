package com.example.clean.data.repository
import es.rudo.demokmp.android.data.datasource.character.CharacterRemoteDataSource
import es.rudo.demokmp.android.data.datasource.character.remote.dto.CharacterDTO
import es.rudo.demokmp.android.domain.entity.character.Character
import es.rudo.demokmp.android.domain.repository.character.CharacterRepository

class CharacterRepositoryImpl(dataSource: CharacterRemoteDataSource) : CharacterRepository {
    private val remoteDataSource: CharacterRemoteDataSource = dataSource

    override fun getCharacters(): List<Character> {
        val characters = remoteDataSource.getCharacters().map { it.toDomain() }
        return characters
    }

    private fun CharacterDTO.toDomain(): Character {
        return Character(
            id = id,
            name = name,
            status = status,
            species = species,
            image = image
        )
    }
}