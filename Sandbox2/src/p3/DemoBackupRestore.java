package p3;

public class DemoBackupRestore {

	public static void main(String[] args) {
		BackupAndRestore.backup("BookData/book_titles.txt");
		BackupAndRestore.restore("BookData/fiveBooksArrayList.dat");
	}
}
