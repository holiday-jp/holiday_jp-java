package com.github.holidayjp.buildscript

class GitDirtyCheckerTask {
    static run() {
        def isInsideWorkTree = "git rev-parse --is-inside-work-tree".execute()
        if (isInsideWorkTree.waitFor() != 0) {
            throw new RuntimeException("The working directory is not inside git work tree.")
        }

        def diff = "git diff --raw".execute().text
        if (diff.size() > 0) {
            System.err.println(diff)
            throw new RuntimeException("The git work tree is dirty.")
        }

        def cachedDiff = "git diff --cached --raw".execute().text
        if (cachedDiff.size() > 0) {
            System.err.println(cachedDiff)
            throw new RuntimeException("The git work tree is dirty.")
        }
    }
}
