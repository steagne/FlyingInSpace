package drawing;

import enums.ShadersAvailable;
import input.Window;
import maths.Matrix4f;
import maths.Vector4f;
import org.lwjgl.opengl.*;
import parts.*;

public class Renderer
{
	private Window window;
	private ShaderCollection shaders;

	public Renderer(Window window, ShaderCollection shaders)
	{
		this.window = window;
		this.shaders = shaders;
	}

	public void renderObject(DrawableObject object, Camera camera, ShadersAvailable shader)
	{
		Shader shaderUsed;

		shaderUsed = shaders.getShader(shader);
		GL30.glBindVertexArray(object.getMesh().getVAO());
		GL30.glEnableVertexAttribArray(0);
		GL30.glEnableVertexAttribArray(1);
		GL30.glEnableVertexAttribArray(2);
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, object.getMesh().getIBO());
		GL13.glActiveTexture(GL13.GL_TEXTURE0);
		GL13.glBindTexture(GL11.GL_TEXTURE_2D, object.getMesh().getMaterial().getTextureID());
		shaderUsed.bind();
		shaderUsed.setUniform("model", Matrix4f.transform(object.getLocation(), object.getRotation(), object.getScale()));
		shaderUsed.setUniform("view", Matrix4f.view(camera.getPosition(), camera.getRotation()));
		shaderUsed.setUniform("projection", window.getProjection());
		GL11.glDrawElements(GL11.GL_TRIANGLES, object.getMesh().getIndices().length, GL11.GL_UNSIGNED_INT, 0);
		shaderUsed.unbind();
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		GL30.glDisableVertexAttribArray(0);
		GL30.glDisableVertexAttribArray(1);
		GL30.glDisableVertexAttribArray(2);
		GL30.glBindVertexArray(0);
	}
}