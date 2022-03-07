package 백준_10828_스택;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //Stack 객체 선언
        Stack<Integer> s = new Stack<>();
        //BufferedReader, BufferedWriter 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //첫째줄에 부어지는 명령의 수 n
        //readLine은 String 형태로 리턴하므로 형 변환 필수
        int n = Integer.parseInt(br.readLine());
        //명령 수 만큼 n반복
        for(int i = 0; i < n; i++){
            //명령은 push 14형태이므로 " "으로 split
            String[] input = br.readLine().split(" ");
            //스위치문으로 명령문 마다의 행위를 정의
            switch (input[0]){
                case "push" :
                    //정수 input[1]을 스택에 넣는 연산
                    s.push(Integer.parseInt(input[1]));
                    break;
                case "pop" :
                    //스택에서 가장 위에 있는 정수를 빼고 그 수를 출력
                    //단, 스택이 비어있는 경우에는 -1을 출력
                    if(s.empty()) {
                        //BufferedWriter의 writer함수는 개행문자 포함하지 않고있어 일일이 넣어주거나
                        //bw.newLine();을 추가해 줄바꿈 해줘야 한다.
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.pop() + "\n");
                    }
                    break;
                case "size" :
                    //스택에 들어있는 정수의 개수 출력
                    bw.write(s.size() + "\n");
                    break;
                case "empty" :
                    //스택이 비어있으면 1 출력
                    if(s.empty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "top" :
                    //스택의 가장 위에 있는 정수를 출력
                    if (s.empty()) { //비어있으면 -1 출력
                        bw.write("-1" + "\n");
                    } else {
                        //pop해서 꺼내는 것이 아니라 출력만 해야 하므로 peek
                        bw.write(s.peek() + "\n");
                    }
                    break;
            }
        }
        //버퍼에 남아있는 문자열을 출력해서 버퍼를 비움
        bw.flush();
        //스트림 닫아주기
        bw.close();

//        <시간초과>
//        //int형 스택 선언
//        Stack<Integer> stack = new Stack<>();
//        //스캐너 클래스 객체 생성
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=0; i<n; i++) {
//            String input = sc.next();
//            if(input.contains("push")) {
//                int input2 = sc.nextInt();
//                stack.push(input2);
//            }else if(input.equals("pop")){
//                System.out.println(stack.isEmpty()?-1:stack.pop());
//            }else if(input.equals("size")) {
//                System.out.println(stack.size());
//            }else if(input.equals("empty")) {
//                System.out.println(stack.isEmpty()?1:0);
//            }else if(input.equals("top")) {
//                System.out.println(stack.isEmpty()?-1:stack.peek());
//            }
//        }

    }
}
