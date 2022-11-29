package drawing;

import maths.Vector2f;
import maths.Vector3f;

public class Vertex
{
    private Vector3f location;
    private Vector3f normal;
    private Vector2f textureCoord;

    public Vertex(Vector3f location, Vector3f normal, Vector2f textureCoord)
    {
        this.location = location;
        this.normal = normal;
        this.textureCoord = textureCoord;
    }

    public Vector3f getLocation() { return location; }
    public Vector3f getNormal() { return normal; }
    public Vector2f getTextureCoord() { return textureCoord; }
}
