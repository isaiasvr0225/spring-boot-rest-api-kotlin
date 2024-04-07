package com.example.controller

import com.example.model.Player
import com.example.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/v1/players")
@RestController
class PlayerController {

    @Autowired
    lateinit var playerService: PlayerService

    @GetMapping("/all")
    fun findAll(): MutableList<Player>? {
        return playerService.all
    }

    @GetMapping("/find/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Player> {
        val player = playerService.get(id)
        return if (player != null) {
            ResponseEntity.ok(player)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping("/save")
    fun save(@RequestBody player: Player): HttpStatus {
        playerService.save(player)
        return HttpStatus.CREATED
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long): HttpStatus {
        if (playerService.get(id) == null) return HttpStatus.NOT_FOUND

        playerService.delete(id)
        return HttpStatus.OK
    }
}