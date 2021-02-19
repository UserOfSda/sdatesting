public class MainTest {

    // 1.all method should be public
    // 2. For each logic, you need to create a test method
    // 3. Test method has no argument
    // 4. Test method never returns results like void
    // 5. Put the word "test" at the beginning or at the end
    // 6. Please, put @Test annotation on the top of your test method

    // Read about: 1.Maven, Annotations in Java
    // 2. GIT, Gitlab

    // Annotations
    @Test
    public void testAddToIntegers() {
        //Given
        Main main = new Main();
        //When
        int sum = main.addTwoIntegers(2, 2);

        /* this should be done automatically bu assertion method
        if (sum == 4) {
            System.out.println(" yes, it is correct");
        }         */


        //Then
        Assertions.assertEquals(4, actual result);

    }


}
