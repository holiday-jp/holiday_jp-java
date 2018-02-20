package com.github.holidayjp.buildscript

import org.yaml.snakeyaml.Yaml

import java.nio.file.Paths

class GeneratorTask {
    static run(String rootDir) {
        def parser = new Yaml()
        def dataSheetFile = Paths.get(rootDir, 'holiday_jp/holidays_detailed.yml').toFile()
        def holidaysDetailed = parser.load(dataSheetFile.text)
        def holidays = holidaysDetailed.values().sort { lhs, rhs -> lhs.date <=> rhs.date }


        def outputFile = Paths.get(rootDir, "holidayjp")

    }
}