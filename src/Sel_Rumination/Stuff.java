package Sel_Rumination;

public class Stuff {

    
    1. 캡슐화 2. 다형성 3. %d의 정체 4. 연산자 5.
        
        
=============================================================================================================

        
        
        
1.    캡슐화, 은닉
        ↖는 지정자 (선언 대상)에 private 붙인 거다 별거 아님 
                호출이 불가해져서 private 붙은 지정자 녀석은 메소드를 써야함
        
        ex)    private int profeno;
               protected String Oollala;
               public double hagisilta;       -> 이어지지  hagisilta = 3.1425673;    

    
    
    
    
    
    
2.   다형성 - 매개변수 대통합의 장
            ⓐㅡ 본체 클래스 등장! -예시로 add를 드랍한다! hulala도 됨
                                        
                    class ㅁㅁㅁ {    ↙ ●지정자 자리에 예시로 add 넣기!●
                    public int  ●add●  (double ㅁ, int ㅁㅁ  ㅡㅡㅡㅡㅡㅡㅡ>>> 하나가 double 이고 딴건 int인데) {
                                                    return 반환 값 넣고? }  다음으로 감


            ⓑㅡ  오버로딩한 (한 클래스에 메소드 여러개 넣기) 클래스 등장!!
            
                 class 롸롸 {                              ↙ ●예시로 add 넣기!●
                       int로 묶은 메서드1 -> public int ●add●(int ㅁ, int ㅁㅁ, int ㅁㅁㅁ) {
                                             return ㅁ + ㅁㅁ + ㅁㅁㅁ; }
                       double 세트 메서드2 -> public double ●add●(double a, double b) {
                                              return a + b; }   ↙ 다 넣어버려 add!!
                       String 세트 메서드3 -> public String ●add●(String A, String B, String C) {
                                                                return "A" + "B" + "C" ; }
                              } class 롸롸 에 셋씩이나 떄려넣었다! 


             ⓒㅡ 오버로딩할 클래스 등장!!  ●지정자에 umhaha.add 넣기●
                                              ↙지정자명을 umhaha로 했으면
                        class ### {  melala umhaha = new Over();
                                                    ↙ ●지정자에 umhaha.add 로 넣기!●
                        System.out.println( ●umhaha.add● ( ㅁ , ㅁㅁ)); } <- 매개변수 별로 double ㅁ int ㅁㅁ 을 안쓰고
                                                                            ㅁ,ㅁㅁ으로만 써도 정상적으로 println이 됨!!!!
                            그거임☞    웜매?! s = new 웜매?!();
                                        s.영차();
                                        s.어기여차();
                                
                    결론 ::: 스크롤 미아가 안되도 돼!  위아래 다니며 int냐 String이냐 찾아다니지 않아도 됨!  

                        
                        
                        
                    
    
3.  " %d "의 자리에 어떻게 숫자가 알아서 오는가?

                    public static void plusTwo1() {
                    int a, b;
                    int sum = 0;   <ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 값이 0 에서부터 시작한다는 뜻임
                    Scanner sc = new Scanner(System.in);

                    System.out.println("두개의 숫자를 입력하시오.");
                    System.out.print("첫번째 : \n");
                    a = sc.nextInt();
                    System.out.print("두번째 : \n");
                    b = sc.nextInt();

                    sum = a + b;

                    String fmt = "입력한 수 : %d, %d  \n"   +   "총합 :  %d 입니다";  <---  a가 1번 %d 에 오고
                                              ↑   ↑                      ↑                 b가 2번 %d 에 오고
                                              a   b                     sum            ↙  sum 이 세번째라 총합: %d 에 오나봐!
                               System.out.printf(fmt, a, b, sum); }
            
           
                               
                               
4.      연산자       

                         =  왼쪽의 피연산자에 오른쪽의 피연산자를 대입함.
                        += 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        -=	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        *=	왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        /=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        %=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.
                        &=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        |=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        ^=	왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        <<=	왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        >>=	왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        >>>=왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함.
                        ++x	먼저 피연산자의 값을 1 증가시킨 후에 해당 연산을 진행함.
                        x++	먼저 해당 연산을 수행하고 나서, 피연산자의 값을 1 증가시킴.
                        --x	먼저 피연산자의 값을 1 감소시킨 후에 해당 연산을 진행함.
                        x--	먼저 해당 연산을 수행하고 나서, 피연산자의 값을 1 감소시킴.
                        ==	왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 참을 반환함.
                        !=	왼쪽의 피연산자와 오른쪽의 피연산자가 같지 않으면 참을 반환함.
                        >	왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 참을 반환함.
                        >=	왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 참을 반환함.
                        <	왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 참을 반환함.
                        <=	왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 참을 반환함.

                        <논리 연산자>
                        &&	논리식이 모두 참이면 참을 반환함. (논리 AND 연산)
                        ||	논리식 중에서 하나라도 참이면 참을 반환함. (논리 OR 연산)
                        !	논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환함. (논리 NOT 연산)

                        <비트 연산자>
                        &	대응되는 비트가 모두 1이면 1을 반환함. (비트 AND 연산)
                        |	대응되는 비트 중에서 하나라도 1이면 1을 반환함. (비트 OR 연산)
                        ^	대응되는 비트가 서로 다르면 1을 반환함. (비트 XOR 연산)
                        ~	비트를 1이면 0으로, 0이면 1로 반전시킴. (비트 NOT 연산, 1의 보수)
                        <<	명시된 수만큼 비트들을 전부 왼쪽으로 이동시킴. (left shift 연산)
                        >>	부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴. (right shift 연산)
                        >>>	지정한 수만큼 비트를 전부 오른쪽으로 이동시키며, 새로운 비트는 전부 0이 됨.

                        
    
    
    
    
    
    
5. 먹이를 찾아 산기슭을 어슬렁거리는 하이에나를 본 일이 있는가 / 하이애나한테 사과해라 -_-
                        
                        
                        
                        
                        
                        
                        
                        

}
