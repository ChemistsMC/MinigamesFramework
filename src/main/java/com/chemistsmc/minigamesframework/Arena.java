package com.chemistsmc.minigamesframework;

import org.bukkit.Location;

import java.util.Set;

/**
 * Class to hold information about an arena.
 */
public class Arena
{

    private boolean inUse;
    private Location lobby;
    private Location upperBound;
    private Location lowerBound;
    private Set<Location> teamSpawns;
    private Set<Location> chests;

    /**
     * Constructor.
     *
     * @param lobby The location of the waiting lobby.
     * @param upperBound The upper corner of the area containing the arena.
     * @param lowerBound The lower corner of the area containing the arena.
     * @param teamSpawns A collection of Locations for the teams to spawn at.
     * @param chests A collection of chests that the arena needs to know about.
     *               If an arena doesn't have chests, pass an empty set.
     */
    public Arena(Location lobby,
                 Location upperBound,
                 Location lowerBound,
                 Set<Location> teamSpawns,
                 Set<Location> chests)
    {
        this.lobby = lobby;
        this.inUse = false;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        this.teamSpawns = teamSpawns;
        this.chests = chests;
    }

    /**
     * Get the waiting lobby for the arena.
     *
     * @return The spawning location in the lobby.
     */
    public Location getLobby()
    {
        return lobby;
    }

    /**
     * Get the {@link Location} upper corner of the arena's area.
     *
     * @return The upper corner location.
     */
    public Location getUpperBound()
    {
        return upperBound;
    }

    /**
     * Get the {@link Location} lower corner of the arena's area.
     *
     * @return The lower corner location.
     */
    public Location getLowerBound()
    {
        return lowerBound;
    }

    /**
     * Get all of the spawn locations in the arena.
     *
     * @return A set containing all of the locations.
     */
    public Set<Location> getTeamSpawns()
    {
        return teamSpawns;
    }

    /**
     * Get all of the chests in the arena.
     *
     * @return A set containing all of the chests.
     */
    public Set<Location> getChests()
    {
        return chests;
    }

    /**
     * Check to see if any game is currently active in
     * this particular arena.
     *
     * @return True if a game is running in this arena.
     */
    public boolean isInUse()
    {
        return inUse;
    }

    /**
     * Set if this arena is currently being used for a game.
     *
     * @param inUse The new status of the arena.
     */
    public void setInUse(boolean inUse)
    {
        this.inUse = inUse;
    }
}
