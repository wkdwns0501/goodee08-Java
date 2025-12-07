package homework03;

public class FileController {
	
	FileDao fd = new FileDao();
	
	public boolean checkName(String file) {
		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고
		// 그리고 그 반환 값을 그대로 받아 또 반환해줌
		return fd.checkName(file);
	}

	public void fileSave(String file, StringBuilder sb) {
		// 매개변수로 넘어온 sb를 String으로 바꿔
		// 방법 1
		String sbStr = sb.toString();
		//방법 2
//		String sbStr = new String(sb);
		// fd의 fileSave()메소드 매개변수로 file과 String을 넘김
		fd.fileSave(file, sbStr);
	}

	public StringBuilder fileOpen(String file) {
		// fd의 fileOpen() 매개변수로 file을 넘겨주고
		// 그 반환 값을 그대로 받아 또 반환
		return fd.fileOpen(file);
	}

	public void fileEdit(String file, StringBuilder sb) {
		// 매개변수로 넘어온 sb를 String으로 바꿔
		String sbStr = sb.toString();
		// fd의 fileEdit()메소드 매개변수로 file과 String을 넘김
		fd.fileEdit(file, sbStr);
	}
}
