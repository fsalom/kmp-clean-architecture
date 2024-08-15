package es.rudo.demokmp

import com.example.clean.data.repository.CharacterRepositoryImpl
import es.rudo.demokmp.data.datasource.character.RickAndMorty.CharacterRemoteDataSourceImpl
import es.rudo.demokmp.domain.usecase.character.CharacterUseCaseImpl

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}! this is the result: ${getNumber()}"
    }

    fun getNumber(): Int {
        val datasource = CharacterRemoteDataSourceImpl()
        val repository = CharacterRepositoryImpl(dataSource = datasource)
        val useCase = CharacterUseCaseImpl(repository = repository)
        return useCase.getNumber()
    }
}