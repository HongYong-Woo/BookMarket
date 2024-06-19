import java.io.*;
import java.util.StringTokenizer;

public class Welcome {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int dot = 57;
        boolean exit = false;
        while (!exit) {
            for (int n = 0; n < dot; n++)
                System.out.print("*");
            System.out.printf("\n\t\t\t\tWelcome to Shopping Mall\n");
            System.out.printf("\n\t\t\t\tWelcome to Book Market!\n");
            for (int n = 0; n < dot; n++)
                System.out.print("*");
            System.out.printf("\n1. 고객 정보 확인하기\t\t\t4.  바구니에 항목 추가하기\n");
            System.out.printf("2. 장바구니 상품 목록 보기\t5.  장바구니의 항목 수량 줄이기\n");
            System.out.printf("3.  장바구니 비우기 \t\t\t6.  장바구니의 항목 삭제하기\n");
            System.out.printf("7.  영수증 표시하기\t\t\t8.  종료하기\n");
            for (int n = 0; n < dot; n++)
                System.out.print("*");
            System.out.printf("\n메뉴 번호를 선택해주세요. : ");
            st = new StringTokenizer(br.readLine());

            int selectMenu = Integer.parseInt(st.nextToken());
            switch (selectMenu) {
                case 1 -> System.out.println("1번 선택 고객 정보를 확인하러 이동합니다.");
                case 2 -> System.out.println("2번 선택 장바구니 상품 목록을 확인합니다.");
                case 3 -> System.out.println("3번 선택 장바구니를 비웁니다.");
                case 4 -> System.out.println("4번 선택 바구니에 항목을 추가합니다.");
                case 5 -> System.out.println("5번 선택 장바구니의 항목 수량을 줄입니다.");
                case 6 -> System.out.println("6번 선택 장바구니의 항목을 삭제합니다.");
                case 7 -> System.out.println("7번 선택 영수증을 표시합니다.");
                case 8 ->  {System.out.println("8번 선택 종료합니다.");
                    exit = true;}
                default -> System.out.println("잘못 입력하셨습니다. 다시 입력하쇼.");
            }
        }

        br.close();
    }
}