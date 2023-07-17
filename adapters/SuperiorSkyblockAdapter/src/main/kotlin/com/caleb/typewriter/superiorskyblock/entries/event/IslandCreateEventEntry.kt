package com.caleb.typewriter.superiorskyblock.entries.event

import com.bgsoftware.superiorskyblock.api.events.IslandCreateEvent
import me.gabber235.typewriter.adapters.Colors
import me.gabber235.typewriter.adapters.Entry
import me.gabber235.typewriter.entry.EntryListener
import me.gabber235.typewriter.entry.Query
import me.gabber235.typewriter.entry.entries.EventEntry
import me.gabber235.typewriter.entry.triggerAllFor
import me.gabber235.typewriter.utils.Icons
import org.bukkit.entity.Player

@Entry("on_island_create", "When a player creates an Island", Colors.YELLOW, Icons.GLOBE)
/**
 * The `Island Create Event` is triggered when an island is created.
 *
 * ## How could this be used?
 *
 * This event could be used to give the player starting items when they create an island.
 */
class IslandCreateEventEntry(
    override val id: String = "",
    override val name: String = "",
    override val triggers: List<String> = emptyList(),
) : EventEntry

@EntryListener(IslandCreateEventEntry::class)
fun onInvite(event: IslandCreateEvent, query: Query<IslandCreateEventEntry>) {
    val player: Player = event.player.asPlayer() ?: return

    query.find() triggerAllFor player
}