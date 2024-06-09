package es.rudo.demokmp.android.domain.repository.character

import es.rudo.demokmp.android.domain.entity.character.Character

interface CharacterRepository {
    fun getCharacters(): List<Character>
}