package es.rudo.demokmp.domain.repository.character

import es.rudo.demokmp.domain.entity.character.Character

interface CharacterRepository {
    fun getCharacters(): List<Character>
}