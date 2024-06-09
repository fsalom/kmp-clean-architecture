package es.rudo.demokmp.android.domain.usecase.character

import com.example.clean.data.repository.CharacterRepository
import es.rudo.demokmp.android.domain.entity.character.Character

class CharacterUseCaseImpl(private val repository: CharacterRepository) : CharacterUseCase {
    override fun getCharacters(): List<Character> {
        return repository.getCharacters()
    }
}