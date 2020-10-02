package com.BridgeLabz.JunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserTest {
	@Test
    public void moodTest() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am SAD mood");
        String message = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",message);
    }

    @Test
    public void happyMoodTest() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Im in HAPPY mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("Enter Proper mood",e.getMessage());
        }
    }
    
}
