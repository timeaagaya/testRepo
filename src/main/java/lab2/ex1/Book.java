package lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS=10;
	public Book() {
		chapters=new String[DEFAULT_CHAPTERS];
		for (int i=0;i<chapters.length;i++)
			chapters[i]="Chapter "+i;
	}
	public Book(String arguement[]) {
		/*construct the object with an array of chapter names*/
		chapters=new String[arguement.length];
		for (int i=0;i<arguement.length;i++)
			chapters[i]=arguement[i];
	}
	public String getChapter(int i) {
		/*return the chapter by the given index. if the index is <0 or >= to the array
		 * size, return "invalid chapter
		 */
		if(i<0 || i>= DEFAULT_CHAPTERS)
			return "invalid chapter";
		return chapters[i];
	}
	public String[] getChapters() {
		return chapters; 
	}
}

