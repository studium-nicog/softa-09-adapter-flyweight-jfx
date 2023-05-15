package ohm.softa.a09.resource;

import javafx.scene.image.Image;

public class FxImageLoaderAdapter extends ResourceLoader<Image> {
	public static final FxImageLoaderAdapter INSTANCE = new FxImageLoaderAdapter();

	/**
	 * Create a new ResourceLoader instance
	 */
	private FxImageLoaderAdapter() {
		super(Image::new);
	}

	public Image loadImage(String path) {
		return loadImage(ClassLoader.getSystemClassLoader(), path);
	}

	public Image loadImage(ClassLoader context, String path) {
		return loadResource(context, path);
	}
}
