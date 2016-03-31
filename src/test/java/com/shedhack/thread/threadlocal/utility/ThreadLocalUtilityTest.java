package com.shedhack.thread.threadlocal.utility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Thread Local Utility test cases.
 *
 * @author imamchishty
 */
public class ThreadLocalUtilityTest {

    @Test
    public void should_create_thread_local() {

        // Arrange
        String value = "supercalifragilisticexpialidocious";

        // Act
        ThreadLocalUtility.set(value);

        // Assert
        assertEquals(value, ThreadLocalUtility.get());
    }

    @Test
    public void should_clear_thread_local() {

        // Arrange
        String value = "pneumonoultramicroscopicsilicovolcanoconiosis";

        // Act
        ThreadLocalUtility.set(value);
        ThreadLocalUtility.clear();

        // Assert
        assertNull(ThreadLocalUtility.get());
    }

    @Test
    public void multiple_threads_should_not_share_threadlocal() {

        // Arrange
        String value = "Hippopotomonstrosesquipedaliophobia";

        // Act
        ThreadLocalUtility.set(value);

        // Assert
        assertEquals(value, ThreadLocalUtility.get());

        // create another thread
        new Thread(new Runnable() {
            public void run() {
                assertNull(ThreadLocalUtility.get());
            }
        }).start();

        assertEquals(value, ThreadLocalUtility.get());
    }

}
