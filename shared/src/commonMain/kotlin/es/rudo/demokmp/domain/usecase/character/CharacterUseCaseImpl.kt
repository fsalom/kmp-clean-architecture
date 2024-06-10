package es.rudo.demokmp.domain.usecase.character

import es.rudo.demokmp.domain.entity.character.Character
import es.rudo.demokmp.domain.repository.character.CharacterRepository

class CharacterUseCaseImpl(private val repository: CharacterRepository) : CharacterUseCase {
    override fun getAll(): List<Character> {
        return repository.getCharacters()
    }

    override fun getNumber(): Int {
        return repository.getCharacters().count()
    }
}