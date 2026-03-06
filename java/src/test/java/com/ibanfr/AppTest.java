package com.ibanfr;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Write a test list for a function that takes a relative path as a string and returns its normalized equivalent. A path
 * may contain "." and ".." with the usual meanings.
 * <p> 
 * Normalizing file paths removes redundant separators, resolves relative segments like . and .. , and standardizes path format for consistent file operations.
 */
class RelativePathNormalizerTest {

    //TEST LIST
    // input: "", output: "", should return an empty path when the input is empty
    // input: "a", output: "a", should return the same path
    // input: "a/b", output: "a/b", should return the same path when there are multiple levels

    // Normalize redundant separators
    // input: "/", output: "", should return the root directory when the input is a single separator
    // input: "//", output: "", should return the root directory when there are multiple path separators at the beginning of the path
    // input: //a output: "a", should return the normalized path when there are multiple path separators at the beginning of the path
    
    // Normalize redundant separators in the middle of the path
    // input: "a//b", output: "a/b", should remove redundant separators in the middle of the path
    // input: "a/b//c", output: "a/b/c", should remove redundant separators in the middle of the path with multiple levels
    // input: "a//b//c", output: "a/b/c", should remove multiple redundant separators in the middle of the path with multiple levels
    
    // Normalize redundant separators at the end of the path
    // input: "a/", output: "a", should remove the redundant separator at the end of the path
    // input: "a//", output: "a", should remove multiple redundant separators at the end of the path
    // input: "a/b/", output: "a/b", should remove the redundant separator at the end of the path with multiple levels
    
    // Normalize current directory at the beginning of the path
    // input: ".", output ".", should return the current directory when there is a single level
    // input: "./a", output: "a", should remove current directory marker and return the normalized path
    // input: "././a", output: "a", should resolve multiple current directory markers and return the normalized path

    // Normalize current directory in the middle of the path
    // input: "a/./b", output: "a", should resolve current directory at the beginning and end of the path
    // input: "a/././b", output: "a/b", should resolve multiple current directory markers in the middle of the path and return the normalized path
    // input: "a/./b/./c", output: "a/b/c", should resolve current directory markers in the middle of the path and return the normalized path

    // Normalize current directory at the end of the path
    // input: "a/.", output: "a", should resolve the current directory and return the normalized path
    // input: "a/./", output: "a", should resolve the current directory and return the normalized path
    //input: "a/././", output: "a", should resolve multiple current directory markers and return the normalized path
    
    // Normalize parent directory at the beginning of the path
    // input: "..", output: "..", should return the parent directory when there is a single level
    // input: "../..", output: "../..", should return the parent directory markers when there are multiple levels
    // input: "../a", output: "../a", should keep the parent directory marker and return the normalized path 
    // input: "../../a", output: "../../a", should keep the parent directory markers and return the normalized path

    // Normalize parent directory in the middle of the path
    // input: "a/../b", output: "b", should resolve the parent directory and return the normalized path
    // input: "a/../../b", output: "../b", should resolve multiple parent directory markers and return the normalized path

    // Normalize parent directory at the end of the path
    // input: "a/..", output: "", should resolve the parent directory and return an empty path
    // input: "a/../..", output: "..", should resolve multiple parent directory markers at the end of the path

    // Normalize mixed current and parent directory markers
    // input: "../a/./b", output: "../a/b", should keep the parent directory marker and resolve the current directory marker in the middle of the path
    
    
    
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue() {
        assertThat(true).isTrue();
    }
}
