package es.rudo.demokmp.android.domain.usecase.character
import es.rudo.demokmp.android.domain.entity.character.Character

interface CharacterUseCase {
    fun getCharacters(): List<Character>
}
