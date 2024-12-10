import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class study {
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

//        //ArrayList<String> myList1 = new ArrayList<String>(); //int는 안되고 Integer가 들어와야 한다.
//        //ArrayList<String> myList2 = new ArrayList<>(); //오른쪽<>은 값입력 생략 가능함
//
//        //가장 일반적인 List 선언 방식
//        List<String> myList3 = new ArrayList<>();
//        //왼쪽의 List는 인터페이스이며, 오른쪽의 ArrayList는 클래스명이다.
//        //ArrayList는 List의 기능을 구현해내면서, 자기자신만의 메서드도 가지고 있다.
//        //size를 먼저 선언하지 않는다.

//        //초기값 생성방법1: 하나씩 add
//        //List는 size지정 필요없다. 그냥 add하여 더하기만 하면 된다.
////        myList3.add("java");
////        myList3.add("python");
////        myList3.add("C++");
//        //초기값 생성방법2: 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList = new ArrayList<>(Arrays.asList(arr));
//        //new ArrayList<>(arr); 은 안됨, 배열을 그냥 집어넣을 수 없음
//        System.out.println(Arrays.deepToString(myList.toArray()));

//        //add메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList);
//        myList.add(0,30); //이렇게 하면 심각한 성능저하 발생, 올바른 사용 방식이 아님.
//        System.out.println(myList);
//        List<Integer> myList2 = new ArrayList<>(myList);
//        myList2.addAll(myList);
//
//        //get(index): 특정 index의 요소를 반환
//        System.out.println(myList.get(0));

//        //for문 활용해 list의 값 하나씩 모두 출력
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//        for(int a : myList){
//            System.out.println(a);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(20);
//        myList.add(30);
//        //indexOf: 가장 먼저 나오는 값의 index return;
//        System.out.println(myList.indexOf(20));

//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        // 농구: 2, 축구: 2, 야구: 1
//        Map<String, Integer> sports = new HashMap<>();
//        for (String a : arr) {
//            if (sports.containsKey(a)) {
//                sports.put(a, sports.get(a) + 1);
//            } else {
//                sports.put(a, 1);
//            }
//        }
//        System.out.println(sports);


//        //Queue는 뒤에서 데이터를 넣고 앞에서 데이터를 빼는 것이 가장 최적화 되어 있다.
//        //Queue 인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> myQueue = new LinkedList<>();
//        //LinkedList는 List와 Queue 기능을 모두 구현 가능하지만, 왼쪽에 Queue라는 인터페이스를 선언하면서 LinkedList의 사용메서드를 제한함.
//        //중간에 값을 삽입하는 것은 성능이 저하된다.
//        myQueue.add(10);
//        myQueue.add(20);
//        myQueue.add(30);
//        //poll을 사용하면 myQueue에 데이터를 삭제하면서 가장 앞의 데이터를 반환한다
//        System.out.println(myQueue.poll()); //poll은 무조건 맨 앞에 있는 것을 가져옴
//        System.out.println(myQueue);
//        //peek: myQueue의 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue);

//        //Queue
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }
//        //길이제한 큐: ArrayBlockingQueue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        //blockingQueue.add("문서4"); //길이 제한 때문에 에러가 발생한다
//        //offer: Queue에 여유공간이 있을 때만 add
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); // 길이 제한이 있어도 에러가 나지 않고, 대신 삽입도 되지 않는다.
//        System.out.println(blockingQueue);

//        //우선순위 Queue: 데이터를 꺼낼 때 정렬된 데이터 poll
//        //전체 정렬이 아닌, poll할 때마다 최소값을 보장
//        //최소값을 찾을 때 성능이 굉장히 좋다.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); //이렇게 조회만 하면 정렬이 되어있지 않음
//        System.out.println(pq.poll()); //그러나 값을 꺼낼 때는 오름차순 정렬된 형태로 데이터를 꺼낸다.
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll()); //하나꺼낼때마다 log n의 복잡도를 가짐
//        }//Empty가 아닐 때까지 계속 값을 꺼냄

    }
}
