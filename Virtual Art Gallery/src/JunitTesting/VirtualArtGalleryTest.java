package JunitTesting;

import static org.junit.Assert.*;
import org.junit.Test;
import dao.VirtualArtGalleryImpl;
import entity.Artwork;
import entity.Gallery;

public class VirtualArtGalleryTest {	
	 public VirtualArtGalleryImpl artGallery;

	@Test
	public void testUploadNewArtwork() {
		VirtualArtGalleryImpl artGallery = new VirtualArtGalleryImpl();
		Artwork testartwork = new Artwork(7,"Krishna","Depicts Lord Krishna and Radha",java.sql.Date.valueOf("1950-01-01"), "Tempera on Paper","url7",7);
		boolean artworkAdded = artGallery.addArtwork(testartwork);
		assertTrue("New Artwork Uploaded Successfully",artworkAdded);
	}	
	 @Test
	    public void testUpdateArtworkDetails() {
	        VirtualArtGalleryImpl gallery = new VirtualArtGalleryImpl();
	        Artwork existingArtwork = new Artwork(3,"Bindu", "good words",java.sql.Date.valueOf ("1994-01-01"), "Acrylic on Canvas", "url3",3);
	        boolean isArtworkUpdated = gallery.updateArtwork(existingArtwork);
	        assertTrue("Artwork Updated Successfully", isArtworkUpdated);
	    }
	 @Test 
	 public void testRemoveArtwork() {
		 VirtualArtGalleryImpl artwork = new VirtualArtGalleryImpl();
	     int  artworkToRemove = 5;
	     boolean isArtworkRemoved = artwork.removeArtwork(artworkToRemove);
	     assertTrue("Artwork removed successfully", isArtworkRemoved);
	 }
	 
	 @Test
	 public void testsearchArtwork() {
		 VirtualArtGalleryImpl artwork = new VirtualArtGalleryImpl(); 
		 String keywordToSearch = "spiritual";
		 artwork.searchArtworks(keywordToSearch);
		 assertEquals(1, artwork.searchArtworks("spiritual").size());
	 }
	 @Test
		public void testCreateNewGallery() {
			VirtualArtGalleryImpl Gallery = new VirtualArtGalleryImpl();
			Gallery testgallery = new Gallery(7,"Delhi Art Gallery","A major gallery focusing on modern Indian art","New Delhi",2, "10:00AM - 6:00PM");
			boolean GalleryAdded = Gallery.createNewGallery(testgallery);
			assertTrue("New Gallery Created Successfully",GalleryAdded);
		}
	
	 @Test
	    public void testUpdateGalleryDetails() {
	        VirtualArtGalleryImpl gallery = new VirtualArtGalleryImpl();
	        Gallery update = new Gallery(7,"Delhi Art Gallery", "A major gallery focusing on modern Indian art", "New Delhi", 2,"10:00 AM - 06:00 PM");
	        boolean isGalleryUpdated = gallery.updateGallery(update);
	        assertTrue("Gallery Updated Successfully", isGalleryUpdated);
	    }
	 @Test 
	 public void testRemoveGallery() {
		 VirtualArtGalleryImpl gallery = new VirtualArtGalleryImpl();
	     int  galleryToRemove = 5;
	     boolean isGalleryRemoved = gallery.removeArtwork(galleryToRemove);
	     assertTrue("Gallery removed successfully", isGalleryRemoved);
	 }
	 @Test
	 public void testsearchGallery() {
		 VirtualArtGalleryImpl gallery = new VirtualArtGalleryImpl(); 
		 String keywordToSearch = "modern";
		 gallery.searchArtworks(keywordToSearch);
		 assertEquals(1, gallery.searchArtworks("modern").size());
	 }
}
	
	 
	 
	 
	
