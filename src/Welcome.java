import java.io.*;
import java.util.StringTokenizer;

//import java.lang.*; 기본으로 사용중
public class Welcome {  //extends Object 생략되어 있음

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringTokenizer st ;
    Welcome welcome = new Welcome();
    String greeting = "Welcome to Shopping Mall";
    String tagline = "Welcome to Book Market!";
    boolean exit = false;
    String name = "";
    String phoneNumber = "";
    int selectNumber = 0;

    System.out.printf("당신의 이름을 입력하세요 : ");
    name = br.readLine();
    System.out.printf("전화번호를 입력하세요 : ");
    phoneNumber = br.readLine();

    while (!exit) {
            /*for (int n = 0; n < dot; n++)
                System.out.print("*");
            System.out.println();
            System.out.println("\t\t\t\t" + greeting);
            System.out.println("\t\t\t\t" + tagline);
            for (int n = 0; n < dot; n++)
                System.out.print("*");
            System.out.println("\n 1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기");
            System.out.println(" 2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
            System.out.println(" 3. 장바구니 비우기 \t\t\t6. 장바구니의 항목 삭제하기");
            System.out.println(" 7. 영수증 표시하기\t\t\t8. 종료하기");
            for (int n = 0; n < dot; n++)
                System.out.print("*");*/
      welcome.menuIntroduction(greeting, tagline);
      System.out.printf("\n메뉴 번호를 선택해주세요. : ");
      selectNumber = Integer.parseInt(br.readLine());
      switch (selectNumber) {
        case 1 -> welcome.menuGusertInfo(name, phoneNumber);
        case 2 -> welcome.menuCartItemList();
        case 3 -> welcome.menuCartClear();
        case 4 -> welcome.menuCartAddItem();
        case 5 -> welcome.menuCartRemoveItemCount();
        case 6 -> welcome.menuCartRemoveItem();
        case 7 -> welcome.menuCartBill();
        case 8 -> exit = welcome.menuExit();
        default -> System.out.println("잘못 입력하셨습니다. 다시 입력하쇼.");
      }
    }
    br.close();
  }

  /**
   *메뉴 출력
   */
  public void menuIntroduction(String greeting, String tagline) {
    int dot = 57;
    for (int n = 0; n < dot; n++) {
      System.out.print("*");
    }
    System.out.println();
    System.out.println("\t\t\t\t" + greeting);
    System.out.println("\t\t\t\t" + tagline);
    for (int n = 0; n < dot; n++) {
      System.out.print("*");
    }
    System.out.println("\n 1. 고객 정보 확인하기\t\t\t4. 바구니에 항목 추가하기");
    System.out.println(" 2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
    System.out.println(" 3. 장바구니 비우기 \t\t\t\t6. 장바구니의 항목 삭제하기");
    System.out.println(" 7. 영수증 표시하기\t\t\t\t\t8. 종료하기");
    for (int n = 0; n < dot; n++) {
      System.out.print("*");
    }
  }

  /***
   * 고객 정보 출력
   * @이름 name
   * @전화번호 phoneNumber
   */
  public void menuGusertInfo(String name, String phoneNumber) {
    System.out.println("1번 선택 고객 정보를 확인하러 이동합니다.");
    System.out.println("이름 : " + name);
    System.out.println("전화번호 : " + phoneNumber);
  }

  /**
   * 장바구니 상품 목록 확인
   */
  public void menuCartItemList() {
    System.out.println("2번 선택 장바구니 상품 목록을 확인합니다.");
  }

  /**
   * 장바구니 비우기
   */
  public void menuCartClear() {
    System.out.println("3번 선택 장바구니를 비웁니다.");
  }

  /**
   * 바구니에 항목 추가
   */
  public void menuCartAddItem() {
    System.out.println("4번 선택 바구니에 항목을 추가합니다.");
  }

  /**
   * 장바구니의 항목 수량 감소
   */
  public void menuCartRemoveItemCount() {
    System.out.println("5번 선택 장바구니의 항목 수량을 줄입니다.");
  }

  /**
   * 장바구니 항목 삭제
   */
  public void menuCartRemoveItem() {
    System.out.println("6번 선택 장바구니의 항목을 삭제합니다.");
  }

  /**
   * 영수증 표시
   */
  public void menuCartBill() {
    System.out.println("7번 선택 영수증을 표시합니다.");
  }

  /**
   * 종료
   */
  public boolean menuExit() {
    System.out.println("8번 선택 종료합니다.");
    boolean exit = true;
    return exit;
  }
}