package loadingImage;

public class RealImage implements Image{
	private String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}
	
	public void loadImageFromDisk() {
		System.out.println("Loading image: " + filename);
	}

	@Override
	public void display() {
		System.out.println("Displayin image: " + filename);
		
	}
}
