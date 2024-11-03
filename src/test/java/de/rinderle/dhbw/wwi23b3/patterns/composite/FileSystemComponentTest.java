package de.rinderle.dhbw.wwi23b3.patterns.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileSystemComponentTest {

    private CustomDirectory rootDir;
    private CustomDirectory documentsDir;
    private CustomDirectory picturesDir;
    private CustomFile customFile1;
    private CustomFile customFile2;
    private CustomFile customFile3;

    // Setting up the file system structure before each test
    @BeforeEach
    void setUp() {
        customFile1 = new CustomFile("File1.txt", 30);
        customFile2 = new CustomFile("File2.txt", 180);
        customFile3 = new CustomFile("File3.jpg", 200);

        documentsDir = new CustomDirectory("Documents");
        picturesDir = new CustomDirectory("Pictures");

        documentsDir.addComponent(customFile1);
        documentsDir.addComponent(customFile2);

        picturesDir.addComponent(customFile3);

        rootDir = new CustomDirectory("Root");
        rootDir.addComponent(documentsDir);
        rootDir.addComponent(picturesDir);
    }

    @Test
    void testFileSize() {
        // Test that file1 shows the correct details
        int result = customFile1.getSize();
        assertEquals(30, result);
    }

    @Test
    void testDirectoryWithFilesSize() {
        // Test that the directory shows the correct details for files
        int result = documentsDir.getSize();
        assertEquals(210, result);
    }

    @Test
    void testRootDirectorySize() {
        // Test that the root directory shows the correct details, including subdirectories
        int result = rootDir.getSize();
        assertEquals(410, result);
    }
}
