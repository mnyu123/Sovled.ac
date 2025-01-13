import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 작성
        System.out.println("                                                           :8DDDDDDDDDDDDDD$.                                           \n" +
                "                                                      DDDNNN8~~~~~~~~~~=~7DNNDNDDDNNI                                   \n" +
                "                                                  ?NNDD=~=~~~~~~~~~~~~~~~~~=~~==~=INNDNN7                               \n" +
                "                                               +NDDI~~~~~~~~~~~~~~~~~~~~~~~=~~========~ODND+                            \n" +
                "                                            :NND~~~~~~~~~~~~~~~~~~~~~~~~~~~=~~============7NDN                          \n" +
                "                                          $DD$~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=~~==============~DNN                        \n" +
                "                                        $DD=~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=~~=================NND                      \n" +
                "                                       ND7~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=~~===================DD7                    \n" +
                "                                     ~DD=~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=======================8DN.                  \n" +
                "                                    8DO~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=========================DD                  \n" +
                "                                   8N~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=~~=======================DN                 \n" +
                "                                  NN::::::::~~~~~~~~~~~=~~~~~~~~~~~~~~~~~~~=~~========================DDO               \n" +
                "                                 $D$:::::::::::::::~~~~DD~~~~~~~~~~~~~~~~~~=~~=========================DN.              \n" +
                "                                 D8:::::::::::::::::::DN=::~~~~~~~~~~~~~~~~=~~======================~~:~DN              \n" +
                "                                DN:::::::::::::::::::ONO::::::::::::::::::::~~~~~~~~~~~~:::::::::::::::::DN             \n" +
                "                               DN::::::::::::::::::::NN.:::::::::::::::::::::::::::DN::::::::::::::::::::$DO            \n" +
                "                               DD:::::::::::::::::::DNI:::::::::::::::::::::::::::::D=::::::::::::::::::::NN            \n" +
                "                              NN~~~~:::::$N?:::::::.NN::::::::::::::::::::::::::::::ND.:::::::::::::::::::+N8           \n" +
                "                              N7~~~~~~~~OD7::::::::~DD::::::::::::::::::::::::::::::~D$::::::::::::::::::::DN           \n" +
                "                             NN~~~~~~~~IDZ~~~~~::::DN~:::::::::::::::::::::::::::::::DN::::::::::::::::::::=N~          \n" +
                "                             DD~~~~~~~~NN~~~~~~~~~=NN::::::::::::::::::::::::::::::::DN:::::::::::::::~~====NN          \n" +
                "                            8D~~~~~~~~ND~~~~~~~~~~~ND~~~~~~~~:::::::::::::::::::::::::N7:::~~===============NN          \n" +
                "                            DD~~~~~~~ON+~~~~~~~~~~~ND~~~~~~~~~~~~~~~~~~~=+NZ==========NN====================~ND         \n" +
                "               :DD7   DNDD. N8~~~~~~~NN~~~~~~~~~~DDND~~~~~~~~~~~~~~~~~~~~ND~~=========DD=====================ND         \n" +
                "               N~:DDNNN .8NDN~~~~~~~$D=~~~~~~~~+ND.DD~~~~~~~~~~~~~~~~~~~=DD~~=========~D+====================DN         \n" +
                "              :D     .  ..~ND~~~~~~~NN~~~~~~~+NN$..ND~~~~~~~~~~~~~~~~~~~7N=~~=========~ND=======~============ON         \n" +
                "              NN       ...:N?~~~~~~~N=~~~~~NNNI.. .7D+~~~~~~~~~~~~~~~~~=8NN~~==========NN=======N============$N         \n" +
                "         N  ODN       ....DN~~~~~~~DD=8NNND$..     .DD~~~=~~~~~~~~~~~~~=NNDD=~=========8D~======NN===========~N$        \n" +
                "    N? =NN  ND      .....NND~~~~~~~DDNN:...        .ND=~DNN~~~~~~~~~~~~=DN.DN~=========?N+======NN============ND        \n" +
                "   $D? DN    DZ    ....ND8NN~~~~~~$D                .DD~NNDD~~~~~~~~~~~~D8..DN=========~DN======NN============DN        \n" +
                "   DN ~N~   NN    ..:~NN..NZ~~~~~~DN                  NNN8.ND~~~~NDN?~~~DZ...7DD=======~NN======NN============DN        \n" +
                "   ND DD    :DN.  ..ND$  .N?~~~~~=NNN                   . ..DDD$~N8OND8=N+   ..DDDZ~====NN======+D+===========ND        \n" +
                "   NO         DD  ZDN    8NO~~~~~~NNN..DDDNN7               ...NND...:DDD:     .:.NDND=~DD======~DO===========DN        \n" +
                "              DNDDN:.    DN~~~~~~=NNNN.ODNNNNDDNNO              ...     .         ...DNNNN=======ND===========DD        \n" +
                "       INDN7    DD.     .DD~~~~~=IDND:.:~.....?DNDNN.                        ...... ....$D=======ND===========ND        \n" +
                "       NN        ND.    8N=~~~~$ND::.:=~:.~=......=ND~                 .NNNNNNNNNNNNNNN.~N+======NN===========DN        \n" +
                "       $DD        DN:   DD~~~~7NO...~==.:~~:.....                      NNNND? ..::..7NZ.:N?======8D~==========ZN        \n" +
                "       DN?     ~D: DND.?D~~~~~DD....~:.~=~.......                            ....~=:.:~..ND======~N$==========~DO       \n" +
                "       ND    ..DD.  .DNDN=~~~~DI.......:.........                           ....=~..~~~..DN======~DD===========NN       \n" +
                "       DDD  :.:DD.  . DDI~~~~~ND................        .DNNNNNNNNNN7      ....=~:.:~~...NN=======ND===========?D~      \n" +
                "       8D. ...OD..    DD~~~~~~+ND ............          NN:~::::~~~8N      ........~~...:ND=======DN============NN      \n" +
                "       DDI:...ND     .D7~~~~~~~7NN ..........           ID8::::::::8D      .............:DN=======ON============NN      \n" +
                "        ~NNND.N=.   .NN~~~~~~~~~NDN8                       ~::::::~N8       .............DN========D=============NI     \n" +
                "               DDNNN.ND~~~~~~~~DD =DND                                       ............DN========N+~===========NN     \n" +
                "                   ~:N=~~~~~~~~DD   .DDDD                                       ........ NN========DD============8D     \n" +
                "                    8N~~~~~~~~~ND    . .7NDDD? .                                      .8DDN========NN=============D:    \n" +
                "                    DD~~~~~~~~~DND:         IDNNND$.                           .+DNNNNDNIDN========DD=============DD    \n" +
                "                    ND~~~~~~~~ZN 7DD .. .:DDNDDNNDNNNNDDNDND8$?===+$8DDNNNDDDDDN8I~DN====8N========NN=============NN    \n" +
                "                    DD~~~~~~~~8N   DD.  .NN~~~~.~~=DNDNO.:7ODDDDNNDD8DDDND=~~~ =~~~ON====8N========DN=============DN    \n" +
                "                    ND~~~~~~~~DN    ZDD  DN~~~ ~~~~~=.7DDD+.......8NNN==~~~~~ ~~~~~ONN$==DN========8N=============ON    \n" +
                "                    ND~8N~=~~~ZN      DDODN=~.~~~~~=.~~~~INDNNNNDNN~~~~~~~~:~~~~~~~DN~ND=DN========DD=========~ND=8N    \n" +
                "                    IN=NDDI~~~~D8       DNN::~~~~~.~~~~~=.~~ND~~ND~~~~~~~~.~~~~~~~~NN  NDNN====ND==ND~D?======DNN=ND    \n" +
                "                     DNNI8ND=~~DN:       ZN=~~~~~ ~~~~~.~~~~DD~=DD~~~~~~~ ~~~~~~~=.ND. . ND===DNDD=NDDNN=====8NZDDDN    \n" +
                "                      NND  IDNDNNN+       D+~~~:~~~~~~ ~~~~~DDNNN+~~~~~~~~~~~~~~:=?N7   .ND=~ND  DNNN~ID====ND7 NNN     \n" +
                "                       ID                 ND~~ ~~~~~:.~~~7DDN7IDNN==~~ ~~~~~~~~ ~~DN   .:N?DDDDD NND  8N~=DDD  ZNN      \n" +
                "                                          NN~:~~~~~ =7DDDD+8N  :N8DDZ.~~~~~~~~.~~~DD.   NDD+ . DN=     OND+             \n" +
                "                                          DND~~~=8DNDDZ=~~ ND   NN~INND~~~~~.~~~~ND .    .    ..IDD                     \n" +
                "                                         DDNNNDNNN+~~~~~~.7N.    ND~~~NDDI~ ~~~~=NNN             .DDI                   \n" +
                "                                        DN=~~~~.=~~~~~~ ~~DN     +N+~~~~+DNDD~~~NNNND.            ..ND                  \n" +
                "                                         DDI~~ ~~~~~~~ ~~~ND..  ..ND~~~~:~~~DNDNNNN+            ..7O8ND+                \n" +
                "                                          .DND=~~~~=::~~=NN.   . . 8D~~.~~~~~~=DN$ODNDNDNNNDNNNNND8+~..                 \n" +
                "                                             8DNNI=.~~~~=NDDNNNNDDNDNN.~~~~~IDDNDND7:.                                  \n" +
                "                                                ?DNNDD?~DD          ~NN~~=NDD$                                          \n" +
                "                                                     :DDD.            NNNN=                                             ");
    }
}

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String X = bf.readLine();
    //String Y = bf.readLine();
    //int x = Integer.parseInt(X);
    //int y = Integer.parseInt(Y);
    //System.out.println("1");
    //System.out.println("4");
    //System.out.println("2");
    //System.out.println("3");
    //System.out.println("1");
    //}
    //}
    //}
    ///*
    ////// 여기에 작성
    ////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    ////String str = bf.readLine();
    ////System.out.println(str+"??!");
    //*/
///*
////// 여기에 작성
////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////int I = Integer.parseInt(bf.readLine()); // 테스트 케이스
////String A = bf.readLine();
////String arr[] = A.split(" ");
////int a = Integer.parseInt(arr[0]);
////int b = Integer.parseInt(arr[1]);
////int result = add(a, b);
////System.out.println(result);
////}
//*/
///*
////// 여기에 작성
////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////int I = Integer.parseInt(bf.readLine()); // 테스트 케이스
////String A = bf.readLine();
////String arr[] = A.split(" ");
////int a = Integer.parseInt(arr[0]);
////int b = Integer.parseInt(arr[1]);
////int result = add(a, b);
////System.out.println("Case " + "#" + (i + 1) + ": " + result);
////}
//*/
///*
////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////String A = bf.readLine();
////String arr[] = A.split(" "); // 공백 기준으로 나눔
////BigInteger a = new BigInteger(arr[0]);
////BigInteger b = new BigInteger(arr[1]);
////System.out.println(a.multiply(b));
////System.out.println("한국어 테스트");
//*/

/*
    //// 여기에 작성
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String N = br.readLine(); // 입력 숫자를 문자열로 읽기
    //int divisor = 20000303; // 나눌 값
    //int remainder = 0;
    //// 문자열의 각 자리 숫자를 사용하여 나머지 계산
    //remainder = (remainder * 10 + (N.charAt(i) - '0')) % divisor;
    //}
    //System.out.println(remainder); // 결과 출력
*/

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String A = bf.readLine();
    //String arr[] = A.split(" "); // 공백기준 입력 받음
    //BigInteger a = new BigInteger(arr[0]);
    //BigInteger b = new BigInteger(arr[1]);
    //System.out.println(a.add(b));
*/

/*
    //// 여기에 작성
    //Scanner sc = new Scanner(System.in);
    //int N = sc.nextInt();
    //System.out.println(N - 1946);
*/

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String A = bf.readLine();
    //int a = Integer.parseInt(A);
    //String B = bf.readLine();
    //Set<Character> mo = new HashSet<>();
    //mo.add('a');
    //mo.add('i');
    //mo.add('o');
    //mo.add('u');
    //mo.add('e');
    //int count = 0;
    //char ch = B.charAt(i);
    //count++;
    //}
    //}
    //System.out.println(count);
*/

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //// 첫 번째 줄: 자릿수 정보 N, M (사용하지 않음)
    //String[] arr = bf.readLine().split(" ");
    //// 두 번째 줄: 첫 번째 숫자 A
    //BigInteger a = new BigInteger(bf.readLine());
    //// 세 번째 줄: 두 번째 숫자 B
    //BigInteger b = new BigInteger(bf.readLine());
    //// A * B 계산 후 출력
    //System.out.println(a.multiply(b));
*/

/*
    //// 여기에 작성
    //Scanner scanner = new Scanner(System.in);
    //BigInteger a = scanner.nextBigInteger();
    //BigInteger b = scanner.nextBigInteger();
    //BigInteger c = scanner.nextBigInteger();
    //System.out.println(b.subtract(c).divide(a));
    //// 4 * X = 20 * 8
    //// 4 * X = 160
    //// X = 160 / 4
    //// a * X = bc
    //// X = bc / a
*/
