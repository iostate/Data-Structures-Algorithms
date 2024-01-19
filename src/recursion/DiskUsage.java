package recursion;

import java.io.File;

public class DiskUsage {
	
	public static long diskUsage(File root) {
		long total = root.length();
		
		if(root.isDirectory()) {
			for(String childname : root.list() ) {
				File child = new File(root, childname);
				total += diskUsage(child);
			}
		}
		System.out.println(total + "\t" + root);
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File recursionDir = new File("/Users/qmtruong92/code/java-dsa/dsa/src/recursion");
		long du = diskUsage(recursionDir);
		System.out.printf("Total disk space of %s/ is %d", recursionDir.getName(), du);
	}

}
