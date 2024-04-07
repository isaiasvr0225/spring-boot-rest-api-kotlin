package com.example.service

import com.example.commons.GenericServiceImpl
import com.example.model.Player
import com.example.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class PlayerServiceImpl: GenericServiceImpl<Player, Long>(), PlayerService{

    @Autowired
    lateinit var playerRepository: PlayerRepository
    override val dao: CrudRepository<Player, Long>
        get() = playerRepository


}