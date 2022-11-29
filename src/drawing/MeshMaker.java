package drawing;

import input.ModelLoader;
import maths.Vector2f;
import maths.Vector3f;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MeshMaker
{
    public static Mesh generateShip()
    {
        return ModelLoader.loadModel("res/models/ufo.obj", "/textures/test.png");
    }

    public static Mesh generateFlatTerrain()
    {
        Vertex[] vertices;
        int[] indices;
        BufferedImage imageTerrain;
        Material material;

        vertices = new Vertex[] {
                new Vertex(new Vector3f(-1, 0,  1), new Vector3f(), new Vector2f(0, 0)),
                new Vertex(new Vector3f(-1, 0, -1), new Vector3f(), new Vector2f(0, 1)),
                new Vertex(new Vector3f(1,  0, -1), new Vector3f(), new Vector2f(1, 1)),
                new Vertex(new Vector3f(1,  0,  1), new Vector3f(), new Vector2f(1, 0)),
        };
        indices = new int[] {
                0, 1, 3,
                3, 1, 2
        };
        imageTerrain = new BufferedImage(4, 4, BufferedImage.TYPE_4BYTE_ABGR);
        {
            Graphics2D g;

            g = imageTerrain.createGraphics();
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, 4, 4);
        }
        material = new Material(imageTerrain);

        return new Mesh(vertices, indices, material);
    }
}
