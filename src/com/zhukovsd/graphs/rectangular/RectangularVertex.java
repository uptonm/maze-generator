package com.zhukovsd.graphs.rectangular;

import com.zhukovsd.graphs.embedded.EmbeddedVertex;
import java.awt.geom.Point2D;

/**
 * Vertex of graph in form of rectangular lattice, which position described by row and column indexes in this lattice.
 */
public class RectangularVertex extends EmbeddedVertex<RectangularVertex> {
    private int row, column;

    public RectangularVertex(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Retrieve position for current vertex in the coordinate space. Position for rectangular vertex set by it's
     * row and column indexes in rectangular lattice
     * @return vertex position as {@link Point2D.Double point} object
     */
    @Override
    public Point2D.Double getPosition() {
        return new Point2D.Double(column, row);
    }
}