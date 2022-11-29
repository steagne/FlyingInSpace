package core;

import drawing.Renderer;
import enums.ShadersAvailable;
import maths.Vector3f;
import parts.Camera;
import parts.FlatTerrain;
import parts.Ship;

public class ScenarioMain extends Scenario
{
    private Camera camera;
    private FlatTerrain terrain;
    private Ship ship;

    public ScenarioMain(Renderer renderer)
    {
        super(renderer);

        camera = new Camera(new Vector3f(), new Vector3f());
        terrain = new FlatTerrain();
        ship = new Ship();
        initObjects();
    }

    @Override
    public void render()
    {
        renderer.renderObject(terrain, camera, ShadersAvailable.TERRAIN);
        renderer.renderObject(ship, camera, ShadersAvailable.MAIN);
    }
    @Override
    public void processCommands() { }
    @Override
    public void update()
    {
        camera.update();
    }
    @Override
    public void destroy() { }

    private void initObjects()
    {
        terrain.initMesh();
        ship.initMesh();
    }
}
