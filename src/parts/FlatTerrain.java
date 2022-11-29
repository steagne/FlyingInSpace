package parts;

import drawing.Mesh;
import drawing.MeshMaker;
import maths.Vector3f;

public class FlatTerrain extends DrawableObject
{
    private static final float SCALE_FACTOR = 100;

    public FlatTerrain()
    {
        super(
                new Vector3f(0, 0, 0),
                new Vector3f(0, 0, 0),
                new Vector3f(SCALE_FACTOR, SCALE_FACTOR, SCALE_FACTOR),
                MeshMaker.generateFlatTerrain()
        );
    }
}
