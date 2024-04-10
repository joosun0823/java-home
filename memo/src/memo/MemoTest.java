package memo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemoTest {
//	프로그램이 실행되면 새 메모 작성 / 메모 열기 / 메모 저장 / 종료 중 하나를 선택해야함
//	1번 새 메모 작성
//
//	사용자가 새 메모 내용을 작성할 수 있어야함
//	작성한 내용은 프로그램 종료 전까지 메모리에 저장되어야함
//
//	2번 메모 열기
//
//	사용자가 파일 이름을 입력하면 해당 파일의 내용을 화면에 출력해야함
//	파일이 없거나 읽기 오류가 발생하면 오류 메시지 표시
//
//	3번 메모 저장
//
//	사용자가 입력한 파일 이름으로 현재 메모리에 저장된 메모 내용을 저장함
//	저장 중 오류가 발생하면 오류 메시지 표시
//
//	4번 종료

	private static String content = "";

	public static void main(String[] args) throws IOException {
		String msg = "\n 메모 콘솔 프로그램\n" + "1. 새 메모 작성\n" + "2. 메모 열기\n" + "3. 메모 저장\n" + "4. 종료\n" + "메뉴를 선택하세요: ";
		try (Scanner sc = new Scanner(System.in);){
			
			while(true) {
				System.out.print(msg);
				String num = sc.nextLine();
				
				switch(num) {
				case "1": 
					System.out.println("메모 내용을 입력하세요 : ");
					newMemo(sc);        
					break;
				case "2": 
					System.out.println("열어볼 메모의 파일명을 입력하세요 : ");
					openMemo(sc);
					break;
				case "3": 
					System.out.println("저장할 파일명을 입력하세요 : ");
					saveMemo(sc);
					break;
				case "4": 
					System.out.println("종료");
					break;
				default :
					System.out.println("잘못된 입력입니다");
					System.out.print(msg);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void newMemo(Scanner sc) throws IOException{
		// 새메모 내용 입력
		// IOException
		content = sc.nextLine();
	}

	private static void openMemo(Scanner sc) throws IOException{
		// 열고싶은 메모의 파일명 입력
		// 파일이 존재하지 않거나 읽을 수 없을 때 예외처리
		
		try {
			String file = sc.nextLine();
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line ;
			while((line = br.readLine()) != null ) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	private static void saveMemo(Scanner sc) throws IOException{
		// 저장할 파일명
		// 저장할 메모가 없을 때 예외처리
		if(content.isEmpty()) {
			System.out.println("저장할 메모가 없습니다");
			return;
		}
		
		String file = sc.nextLine();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
			bw.write(content);
			System.out.println("메모가 저장되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
