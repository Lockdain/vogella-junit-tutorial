package ru.msk.java.vogella.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

public class RuleTester {

    private Logger log = Logger.getLogger(getClass().getName());

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {
        File createdFolder = folder.newFolder("newFolder");
        log.info("Temp folder created");
        File createdFile = folder.newFile("myFilefile.txt");
        log.info("Temp file created");
        assertTrue(createdFile.exists());
    }
}
