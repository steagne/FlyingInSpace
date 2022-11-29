package enums;

public enum ShadersAvailable
{
    MAIN("shaderMain"),
    TERRAIN("shaderTerrain");

    private String name;

    ShadersAvailable(String name)
    {
        this.name = name;
    }

    public String getName() { return name; }
}
