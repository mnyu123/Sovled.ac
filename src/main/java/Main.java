import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // 여기에 작성
        //10669 오늘 날짜
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        String StringToday = sdf.format(c1.getTime());
        System.out.println(StringToday);
    }
}


    // 여기에 작성
    // String str = bf.readLine();
//          name[i] = str.substring(0, 1) + str.substring(str.length() - 1, str.length());

//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bf.readLine());
//
//        String name[] = new String[n];
//
//        for (int i = 0; i < n; i++) {
    // 여기에 작성
//        }
//        bf.close();
//        for (int i = 0; i < n; i++) {
//            System.out.println(name[i]);
// 8871번 Zadanie próbne 2
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.printf("%d %d", (n + 1) * 2, (n + 1) * 3);

//// 8545번 Zadanie próbne 1
//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//String input = bf.readLine(); // abc
//
//        for (int i = input.length() - 1; i >= 0; i--) {
//        System.out.print(input.charAt(i));
//        }
//// 8437 Julka
//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//BigInteger total = new BigInteger(bf.readLine());
//BigInteger diff = new BigInteger(bf.readLine());
//BigInteger two = new BigInteger("2");
////(1)
//
//BigInteger klaudia = (total.subtract(diff)).divide(two).add(diff);
////(2)
//BigInteger natalia = (total.subtract(diff)).divide(two);
////(3)
//
//        System.out.println(klaudia);
//        System.out.println(natalia);
//// 8393번
//Scanner sc = new Scanner(System.in);
//int input = sc.nextInt();
//int count = 0;
//
//        for (int i = 1; i <= input; i++) {
//count += i;
//        }
//                System.out.println(count);
//8730번 Plane
//        Scanner sc = new Scanner(System.in);
//        int front1 = sc.nextInt();
//        int front2 = sc.nextInt();
//        int back1 = sc.nextInt();
//        int back2 = sc.nextInt();
//
//        System.out.println((front1*front2)+(back1*back2));
// 7891번 Can you add this?
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//
//        for (int i = 0; i < number; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            System.out.println(x + y);
//        }
// 6840번 Who is the middle?
//        Scanner sc = new Scanner(System.in);
//        int[] arrays = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            arrays[i] = sc.nextInt(); // 배열에 값을 입력
//        }
//
//        System.out.println(com(arrays));
//    }
//
//    public static int com(int[] arrays) {
//        if ((arrays[0] > arrays[1] && arrays[0] < arrays[2]) || (arrays[0] < arrays[1] && arrays[0] > arrays[2])) {
//            return arrays[0];
//        } else if ((arrays[1] > arrays[0] && arrays[1] < arrays[2]) || (arrays[1] < arrays[0] && arrays[1] > arrays[2])) {
//            return arrays[1];
//        } else {
//            return arrays[2];
//        }
//    }

//    private static int pyramids(int height) {
//        int count = 0;
//
//        for (int i = 0; i <= height; i++) {
//            count += i;
//        }
//
//        return count;
//    }


// 5522번 카드게임
//        Scanner sc = new Scanner(System.in);
//
//        int count = 0;
//
//        for(int i=0;i<5;i++){
//            int a = sc.nextInt();
//
//            count += a;
//        }
//
//        System.out.println(count);

//        // 5341번 Pyramids
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            int height = sc.nextInt();
//            if (height == 0) {
//                break;
//            }
//            System.out.println(pyramids(height));
//        }


// 1 = 1
// 2 = 3
// 3 = 6
// 4 = 10

//        // 5339번 콜센터
//        System.out.println("     /~\\\n" +
//                "    ( oo|\n" +
//                "    _\\=/_\n" +
//                "   /  _  \\\n" +
//                "  //|/.\\|\\\\\n" +
//                " ||  \\ /  ||\n" +
//                "============\n" +
//                "|          |\n" +
//                "|          |\n" +
//                "|          |");


//        // 5338번 마이크로소프트 로고
//        System.out.println("       _.-;;-._ ");
//        System.out.println("'-..-'|   ||   |");
//        System.out.println("'-..-'|_.-;;-._|");
//        System.out.println("'-..-'|   ||   |");
//        System.out.println("'-..-'|_.-''-._|");


//        // 5337번
//        System.out.println(".  .   .");
//        System.out.println("|  | _ | _. _ ._ _  _");
//        System.out.println("|/\\|(/.|(_.(_)[ | )(/.");


//        // 4999 아!
//        Scanner sc = new Scanner(System.in);
//
//        String a = sc.next();
//        String b = sc.next();
//
//        if (a.length() >= b.length()) {
//            System.out.println("go");
//        }else {
//            System.out.println("no");
//        }
//
//
//        // 4101 크냐?
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (true) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            if (a == 0 && b == 0) {
//                break;
//            }
//            if (a > b) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }


//        // 3773 shares
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            String cur = br.readLine();
//            if (cur == null) break;
//            StringTokenizer st = new StringTokenizer(cur);
//            int n = Integer.parseInt(st.nextToken());
//            int s = Integer.parseInt(st.nextToken());
//            sb.append(s / (n + 1)).append('\n');
//        }
//        System.out.println(sb);


//        // 3003번 킹,퀸,룩,비숍,나이트,폰
//        Scanner scanner = new Scanner(System.in);
//
//
//        int king = 1;
//        int queen = 1;
//        int rook = 2;
//        int bishop = 2;
//        int knight = 2;
//        int pawn = 8;
//
//        king = king - scanner.nextInt();
//        queen = queen - scanner.nextInt();
//        rook = rook - scanner.nextInt();
//        bishop = bishop - scanner.nextInt();
//        knight = knight - scanner.nextInt();
//        pawn = pawn - scanner.nextInt();
//
//        System.out.print(king + " ");
//        System.out.print(queen + " ");
//        System.out.print(rook + " ");
//        System.out.print(bishop + " ");
//        System.out.print(knight + " ");
//        System.out.print(pawn);


//        // 2744번 대소문자 바꾸기
//        Scanner scanner = new Scanner(System.in);
//
//        String a = scanner.nextLine();
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < a.length(); i++) {
//
//            char c = a.charAt(i); // 맨 앞글자 하나씩
//
//            if (Character.isUpperCase(c)) { // 대문자면
//
//                result.append(Character.toLowerCase(c)); // 내부함수로 소문자
//
//            } else if (Character.isLowerCase(c)) { // 소문자면
//
//                result.append(Character.toUpperCase(c)); // 내부함수로 대문자
//
//            } else {
//
//                result.append(c); // 숫자나 특수문자 등은 그대로 추가
//            }
//
//
//        }
//
//        System.out.println(result.toString());
//        scanner.close();
//
//        System.out.println();


//        // 2420 사파리월드
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        //n과 m 입력받기
//        long n = Long.parseLong(st.nextToken());
//        long m = Long.parseLong(st.nextToken());
//        System.out.print(Math.abs(n-m));  //n - m을 절대값을 한 값을 출력하면 된다


//        // 1271번 엄청난 부자2
//        Scanner scanner = new Scanner(System.in);
//
//        BigInteger AllMoney = scanner.nextBigInteger();
//        BigInteger life = scanner.nextBigInteger();
//
//        System.out.println(AllMoney.divide(life));
//        System.out.println(AllMoney.remainder(life));

// 2475 검증수
//        Scanner scanner = new Scanner(System.in);
//
//        int total = 0;
//
//        for (int i = 0; i < 5; i++) {
//
//            int number = scanner.nextInt();
//
//            int test = number * number; // 제곱시킴
//            total = total + test; // 그거 토탈에 저장
//
//            System.out.println(i + "번째 제곱합한 수:" + total);
//
//
//        }
//
//        int sovle = total % 10;
//
//        System.out.println("이게 정답일듯: " + sovle);


//        Scanner scanner = new Scanner(System.in);
//
//        BigInteger a =  scanner.nextBigInteger();
//        BigInteger b =  scanner.nextBigInteger();
//
//        System.out.println(a.add(b));
//        System.out.println(a.subtract(b));
//        System.out.println(a.multiply(b));









    /*
     */
/*
    //// 여기에 작성
    //System.out.println("dasdasd");
    //}
    //// 9086번 문자열
    ///*
    //*/
///*
//*/
///*
//*/
///*
//*/
///*
//*/
///*
//*/
///*
//*/
///*
//*/
////// 여기에 작성
////System.out.println("asdasd");
////}}
//////// 여기에 작성
//////System.out.println("고등학교");
////////// 여기에 작성
////////System.out.println("SAdasda");
////////}}
//////////// 여기에 작성
//////////System.out.println("괄호삭제 버그 수정?");
//////////}
////////////// 여기에 작성
////////////System.out.println("테스트용");
////////////}
//////////////// 9653번 스타워즈 로고
//////////////System.out.println("    8888888888  888    88888\n" +
//////////////"   88     88   88 88   88  88\n" +
//////////////"    8888  88  88   88  88888\n" +
//////////////"       88 88 888888888 88   88\n" +
//////////////"88888888  88 88     88 88    888888\n" +
//////////////"\n" +
//////////////"88  88  88   888    88888    888888\n" +
//////////////"88  88  88  88 88   88  88  88\n" +
//////////////"88 8888 88 88   88  88888    8888\n" +
//////////////" 888  888 888888888 88  88      88\n" +
//////////////"  88  88  88     88 88   88888888");
//////////////}
//////////// 여기에 작성
//////////System.out.println("다시 테스트");
//////////}}
//////////// 여기에 작성
//////////System.out.println("asdasdadasadas");
//////////}}


/*
}

/*
    //public static void main(String[] args) {
        // 여기에 작성
    ////public static void main(String[] args) {
        // 여기에 작성
    //////}
    //////// 여기에 작성
    //////// 여기에 작성
    ///////*
    ////////System.out.println("dasdsa");
    //*/
    ///*
    //*/


/*
    //// 여기에 작성
    //// 10170번 NFC West vs North
    //System.out.println("NFC West       W   L  T");
    //System.out.println("-----------------------");
    //System.out.println("Seattle        13  3  0");
    //System.out.println("San Francisco  12  4  0");
    //System.out.println("Arizona        10  6  0");
    //System.out.println("St. Louis      7   9  0");
    //System.out.println(); // 공백
    //System.out.println("NFC North      W   L  T");
    //System.out.println("-----------------------");
    //System.out.println("Green Bay      8   7  1");
    //System.out.println("Chicago        8   8  0");
    //System.out.println("Detroit        7   9  0");
    //System.out.println("Minnesota      5  10  1");
    //// 여기에 작성
    //// 여기에 작성
    //}
    ///*
    ////// 여기에 작성
    ////System.out.println("?");
    ////// 여기에 작성
    ////// 여기에 작성
*/

/*
    //// 여기에 작성
    //// 10189 hook
    //System.out.println("#  # #### #### #  #");
    //System.out.println("#### #  # #  # # #");
    //System.out.println("#### #  # #  # # #");
    //System.out.println("#  # #### #### #  #");
    //// 여기에 작성
    //// 여기에 작성
    //////}
    //*/
    ///*
    ////// 여기에 작성
    ////System.out.println("커밋 테스트아젠장");
    ////// 여기에 작성
    ////// 여기에 작성

/*
    //// 여기에 작성
    //
    //// 여기에 작성
    //// 여기에 작성
    ////}
    /////*
    //////System.out.println("asdas");
    //////System.out.println("sdadasad");
    //////// 여기에 작성
    //////// 여기에 작성
    ///////*
    ////////// 여기에 작성
    ////////System.out.println("테스트를해요");
    //*/
    ///*
    ////// 여기에 작성
    ////// 9654번 나부 함대 데이터
    ////System.out.println("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE");
    ////System.out.println("N2 Bomber      Heavy Fighter  Limited    21        ");
    ////System.out.println("J-Type 327     Light Combat   Unlimited  1         ");
    ////System.out.println("NX Cruiser     Medium Fighter Limited    18        ");
    ////System.out.println("N1 Starfighter Medium Fighter Unlimited  25        ");
    ////System.out.println("Royal Cruiser  Light Combat   Limited    4         ");
    ////// 여기에 작성
    ////// 여기에 작성

