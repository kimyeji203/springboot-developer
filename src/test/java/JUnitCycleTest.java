import org.junit.jupiter.api.*;

public class JUnitCycleTest
{
    /**
     * @BeforeAll 전체 테스트를 시작하기 전에 1회 실행
     * => 이 때문에 static 선언
     * <p>
     * 주로 아래 기능에 사용
     * 1. 디비 연결
     * 2. 테스트 환경 초기화
     */
    @BeforeAll
    static void beforeAll ()
    {
        System.out.println("@BeforeAll !!!");
    }

    /**
     * @BeforeEach 테스트 케이스를 시작하기 전마다 실행됨
     * <p>
     * 주로 아래 기능에 사용
     * 1. 테스트 메서드에서 사용하는 객체 초기화
     * 2. 테스트에 필요한 값 미리 세팅
     */
    @BeforeEach
    public void beforeEach ()
    {
        System.out.println("@BeforeEach !!!");
    }

    @Test
    public void test1 ()
    {
        System.out.println("test1 !!!");
    }

    @Test
    public void test2 ()
    {
        System.out.println("test2 !!!");
    }

    @Test
    public void test3 ()
    {
        System.out.println("test3 !!!");
    }

    /**
     * @AfterEach 테스트 케이스 종룧기 전마다 실행
     * <p>
     * 주로 아래 기능에 사용
     * 1. 테스트 이후 특정 데이터 삭제
     */
    @AfterEach
    public void afterEach ()
    {
        System.out.println("@AfterEach !!!");
    }

    /**
     * @AfterAll 전체 테스트를 마치고 종료하기 전에 1회 실행
     * => 이때문에 static 선언
     * <p>
     * 주로 아래 기능에 사용
     * 1. 디비 연결 해제
     * 1. 공통 자원 해제
     */
    @AfterAll
    static void afterAll ()
    {
        System.out.println("@AfterAll !!!");
    }
}
