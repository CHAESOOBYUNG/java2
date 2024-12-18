package project01;
import project01.Addr;
import java.util.Scanner;

public class SmartPhone {
	private Addr[] addrArray = new Addr[10];
	private int size = 0;
	Scanner scan = new Scanner(System.in);
	
	// 키보드 입력 -> 객체 생성
	public Addr inputAddrData() {
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("전화번호: ");
		String phoneNo = scan.nextLine();
		
		System.out.print("이메일: ");
		String email = scan.nextLine();
		
		System.out.print("주소: ");
		String address = scan.nextLine();
		
		System.out.print("그룹(친구/가족): ");
		String group = scan.nextLine();
		
		Addr addr = new Addr(name, phoneNo, email, address, group);
		return addr;
	}
	
	// 배열에 연락처 객체 저장
	public void addAddr(Addr addr) {
		if (size < addrArray.length) {
			addrArray[size] = addr;
			size++;
			System.out.println(">>> 데이터가 저장되었습니다.");
		} else {
			System.out.println("연락처 공간이 다 찾습니다.");
		}
	}
	
	// 객체 정보 출력
	public void printAddr(Addr addr) {
		addr.printInfo();
	}
	
	// 모든 연락처 출력
	public void printAllAddr() {
		if (size == 0) {
			System.out.println("저장된 연락처가 없습니다.");
		} else {
			for(int i = 0; i < size; i++) {
				addrArray[i].printInfo();
			}
		}
	}
	
	// 연락처 검색
	public void searchAddr(String name) {
		boolean found = false;
		for(int i = 0; i < size; i++) {
			if(addrArray[i].getName().equals(name)) {
				addrArray[i].printInfo();
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(name + "의 연락처가 없습니다.");
		}
	}
	
	// 연락처 삭제
	public void deleteAddr(String name) {
		boolean found = false;
		for(int i = 0; i < size; i++) {
			// 삭제된 자리 - 마지막 연락처 옮김 -> 빈 공간 X
			if(addrArray[i].getName().equals(name)) {
				for(int j = i; j < size - 1; j++) {
					addrArray[j] = addrArray[j + 1];
				}
				addrArray[size - 1] = null; // 마지막 요소 null
				size--;
				System.out.println(name + "의 연락처가 삭제되었습니다.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println(name + "의 연락처를 찾을 수 없습니다.");
		}
	}
	
	// 연락처 수정
	public void editAddr(String name, Addr newAddr) {
		boolean found = false;
		for(int i = 0; i < size; i++) {
			if(addrArray[i].getName().equals(name)) {
				addrArray[i] = newAddr;
				System.out.println(name + "의 연락처가 수정되었습니다.");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(name + "의 연락처를 찾을 수 없습니다.");
		}
	}
}
