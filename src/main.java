import java.util.*;

public class main {
    public static void main(String[] args) {
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));

//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//        //다른 방법
//        int number = st1.indexOf("java");
//        System.out.println(number);

//        //contains: 특정 문자열이 있는지 여부를 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));



        //도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(answer == input){
//            System.out.println("문이 열렸습니다.");
//        } else  {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//        //버스카드 예제
//        System.out.println("현재 가지고 계신 돈은 얼마인가요?");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        //  if, else if 구문에서 조건식은 택1로서, 한 조건에 해당하면 실행 후 전체구문 밖으로 나감.
//        if(myMoney >= 10000){
//            System.out.println("택시를 타시오");
//        } else if(myMoney >= 3000){
//            System.out.println("버스를 타시오");
//        } else if(myMoney >= 2000){
//            System.out.println("킥보드를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }

//        //위와 비교해보기: if-else if는 독립적인 구문 , if는 전부다 실행(위의 구문과 똑같이 하려면 범위값 제대로 지정)
//        //if문이 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면, 모든 if문이 중복되어 실행될 가능성이 존재.
//        if(myMoney >= 10000){
//            System.out.println("택시를 타시오");
//        }
//        if(myMoney >= 3000){
//            System.out.println("버스를 타시오");
//        }
//        if(myMoney >= 2000){
//            System.out.println("킥보드를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }

        //삼항연산자: 결과값 = 조건식 ? 반환값1 : 반환값2
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        String result = answer == input ?  "문이 열렸습니다." : "비밀번호가 틀렸습니다." ;
//        System.out.println(result);

//        //switch문: if, else if 등의 조건문을 가독성있게 표현 구문
//        System.out.println("원하시는 서비스 번호를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        //if-else로 풀기
//        if(number == 1){
//            System.out.println("대출업무입니다.");
//        } else if(number == 2){
//            System.out.println("예금업무입니다.");
//        } else if(number == 3){
//            System.out.println("적금업무입니다.");
//        } else if(number == 3){
//            System.out.println("상담사연결입니다.");
//        }
//        //switch구문으로 풀기
//        switch (number){
//            case 1:
//                System.out.println("대출업무입니다.");
//                break;
//            case 2:
//                System.out.println("예금업무입니다.");
//                break;
//            case 3:
//                System.out.println("적금업무입니다.");
//                break;
//            case 0:
//                System.out.println("상담사연결입니다.");
//                break;
//            default:
//                System.out.println("잘못된 입력입니다.");
//                break;
//        }

//        String input = "hello가나다";
//        System.out.println(input.matches("[A-Za-z]+"));
//         if(input.matches("[A-Za-z]")){
//             System.out.println("제대로 입력하셨습니다.");
//         }else {
//             System.out.println("틀렸습니다. 입력을 확인해주세요.");
//         }
//
//        String[] arr = {"java", "python", "javascript"};
//        String answer = "";
//        for(String a : arr){
//            answer += a;
//        }
//        System.out.println(answer);
//        String answer2 = String.join(":", arr);
//        System.out.println(answer2);


//        String[] stArr = new String[5];
//        for(int i=0; i<stArr.length; i++){
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));
    }
}

