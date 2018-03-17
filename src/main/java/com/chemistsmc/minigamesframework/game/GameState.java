package com.chemistsmc.minigamesframework.game;

/**
 * Enumerates the various states that a game can be in.
 */
public enum GameState
{

    /**
     * Game is waiting for first player to join.
     */
    IDLE,

    /**
     * Game is waiting for all players to join.
     * If anything needs to be set up, e.g. chests,
     * this happens in this GameState as well.
     */
    PRE_GAME,

    /**
     * The game is running.
     */
    RUNNING,

    /**
     * The game is over, and the arena needs to be cleaned
     * up.
     */
    POST_GAME,

    /**
     * The game cannot be used.
     */
    DISABLED
}
