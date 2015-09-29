package com.zhukovsd.graphs.rectangular;

import com.zhukovsd.graphs.embedded.EmbeddedGraph;

/**
 * Vertex of graph in form of rectangular lattice, which position described by row and column indexes in this lattice.
 */
public class RectangularGraph extends EmbeddedGraph<RectangularVertex> {
    public final int rowCount;
    public final int columnCount;

    public RectangularGraph(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        RectangularVertex[][] lattice = new RectangularVertex[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                RectangularVertex vertex = new RectangularVertex(i, j);

                if (i > 0) connectToEachOther(vertex, lattice[i-1][j]);
                if (j > 0) connectToEachOther(vertex, lattice[i][j-1]);

                lattice[i][j] = vertex;
                vertexList.add(vertex);
            }
        }
    }
}
