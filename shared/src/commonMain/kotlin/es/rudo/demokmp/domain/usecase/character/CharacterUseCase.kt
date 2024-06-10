package es.rudo.demokmp.domain.usecase.character
import es.rudo.demokmp.domain.entity.character.Character

interface CharacterUseCase {
    fun getAll(): List<Character>
    fun getNumber(): Int
}
