package de.hsaalen;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void  test_maximum_tile_index_x()
    {
        Board board = new Board();
        int maximum_tile_index_x = board.maxTileX();
        Assert.assertEquals( ( maximum_tile_index_x + 1 ) * board.tileSizeInPixels, board.widthInPixels );
    }

    @Test
    public void  test_maximum_tile_index_y()
    {
        Board board = new Board();
        int maximum_tile_index_y = board.maxTileY();
        Assert.assertEquals( ( maximum_tile_index_y + 1 ) * board.tileSizeInPixels, board.heightInPixels );
    }

    @Test
    public void testConcatenate() {
        Board board = new Board();
        Assert.assertNotNull( board );
    }
}