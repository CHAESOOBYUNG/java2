package project01;

import java.util.Scanner;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. 연락처 추가");
            System.out.println("2. 모든 연락처 보기");
            System.out.println("3. 연락처 검색");
            System.out.println("4. 연락처 삭제");
            System.out.println("5. 연락처 수정");
            System.out.println("6. 종료");
            System.out.print("메뉴 선택: ");
            
            int choice = scan.nextInt();
            scan.nextLine();  // Consume the leftover newline character
            
            switch (choice) {
                case 1:
                    Addr newAddr = phone.inputAddrData();
                    phone.addAddr(newAddr);
                    break;
                case 2:
                    phone.printAllAddr();
                    break;
                case 3:
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scan.nextLine();
                    phone.searchAddr(searchName);
                    break;
                case 4:
                    System.out.print("삭제할 이름을 입력하세요: ");
                    String deleteName = scan.nextLine();
                    phone.deleteAddr(deleteName);
                    break;
                case 5:
                    System.out.print("수정할 이름을 입력하세요: ");
                    String editName = scan.nextLine();
                    Addr editAddr = phone.inputAddrData();
                    phone.editAddr(editName, editAddr);
                    break;
                case 6:
                    System.out.println("프로그램 종료.");
                    scan.close();  // Close the scanner only once, at the end of the program
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
