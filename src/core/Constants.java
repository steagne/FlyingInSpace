package core;

import maths.Vector3f;

public class Constants
{
	//WINDOW
	public static final String WND_TITLE 					= "Fly High";
	public static final int WND_W 							= 640;
	public static final int WND_H 							= 400;
	public static final Vector3f BACKGROUND_COLOR 			= new Vector3f(0.02f, 0.02f, 0.02f);

	//CAMERA
	public static final float MOUSE_SENSITIVITY 			= 0.15f;
	public static final float CAMERA_SPEED 					= 0.1f;

	//SWITCHES
	public final static boolean USING_LAPTOP				= true;
	public final static String SHADER_USED					= (USING_LAPTOP ? "portatile" : "shader");
}