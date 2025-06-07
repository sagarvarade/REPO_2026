package com.DSA;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
@DisplayName
@Disabled
@EnabledOnOs(OS.LINUX)
@EnabledOnJre
@EnabledIf
@EnabledIfSystemProperty
@EnabledIfEnvironmentVariable

Assumptions :

1. assumeThat

@Nested : Nest if else

assertAll(()->{},()->{});

@RepeatedTest(3)

@Tag("Tag")

*/


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {
    static MathUtils mathUtils;

    //@BeforeEach
    @BeforeAll
    static void initialize(){
        System.out.println("Int called ");
        mathUtils=new MathUtils();
    }

    //@AfterEach
    @AfterAll
    static void destroy(){
        mathUtils=null;
        System.out.println("Destroy called ");
    }

    @Test
    @DisplayName("Add Test Method ! ")
    void add() {
        boolean asume=false;


        System.out.println("Testing ");
        //fail("Not yet implemented.");
        assertTrue(true);
        assertEquals(30,mathUtils.add(10,20),"This is message!");
        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
        assertIterableEquals(List.of(1,2,3),List.of(1,2,3));
    }

    @Test
    void testComputeCircleRadius() {
        assertEquals(28.274333882308138,mathUtils.computeCircleArea(3));
    }

    @RepeatedTest(3)
    void TestDivide(){
        assertThrows(ArithmeticException.class, ()->mathUtils.div(1,0),"Divide by 0 should throw Arithmetic exceptions!");
    }

    @Test
    @Disabled
    void TestDivide2(){
        assertThrows(ArithmeticException.class, ()->mathUtils.div(1,0),"Divide by 0 should throw Arithmetic exceptions!");
    }
}