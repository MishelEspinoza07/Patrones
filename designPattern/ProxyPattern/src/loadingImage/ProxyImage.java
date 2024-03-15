package loadingImage;

public class ProxyImage implements Image{
	
	private RealImage realImage;
	private String filename;

	public ProxyImage(String filString) {
		this.filename = filString;
	}
	
	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(filename);
		}
		realImage.display();
	}
}
