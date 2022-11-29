package parts;

import drawing.MeshMaker;
import maths.Vector3f;

public class Ship extends DrawableObject
{
    private static final float SCALE = 1;
    public Ship()
    {
        super(
                new Vector3f(),
                new Vector3f(),
                new Vector3f(SCALE, SCALE, SCALE),
                MeshMaker.generateShip());
    }
}
