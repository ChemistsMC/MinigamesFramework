package com.chemistsmc.minigamesframework.game;

import com.chemistsmc.minigamesframework.arena.Arena;

import java.util.Set;

/**
 * Base interface for all mini-games.
 */
public interface Game
{

    /**
     * Get all of the arenas that can be used for
     * this game.
     *
     * @return All arenas for this game.
     */
    Set<Arena> getArenas();

    /**
     * Get the current state that the game is in.
     *
     * @return The current {@link GameState}.
     */
    GameState getGameState();

    /**
     * Set the game's current state.
     *
     * @param gameState The new {@link GameState}.
     */
    void setGameState(GameState gameState);

    /**
     * Get the maximum number of players that can play
     * in one game at a time.
     *
     * @return The maximum number of players.
     */
    int getMaxPlayers();

    /**
     * Get the minimum number of players needed for the
     * game to be able to start.
     *
     * @return The minimum number of players.
     */
    int getMinPlayers();

    /**
     * Begin setting up a game.
     *
     * This includes but is not limited to making teams,
     * selecting an arena, sending waiting players to the lobby,
     * putting items into arena chests, etc.
     */
    void startPreGame();

    /**
     * Start a game.
     *
     * This includes sending players to the team spawn locations
     * inside the arena, starting timers, etc.
     */
    void startGame();

    /**
     * Begin the post-game cleanup.
     *
     * This includes sending players to the main lobby area,
     * announcing winner(s), and setting the arena back to its
     * default state.
     */
    void startPostGame();
}
