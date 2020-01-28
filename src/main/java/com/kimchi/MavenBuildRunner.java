package com.kimchi;

import java.util.List;

public class MavenBuildRunner implements BuildRunner {
    private String mavenPath;

    @Override
    public void build(List<String> srcDirs, String binDir) {
        String info = "maven path : " + mavenPath + "\n";
        for(String srcDir : srcDirs) {
            info += "source path : " + srcDir + "\n";
        }
        info += "class file path : " + binDir  + "\n";
        System.out.printf("MavenBuildRunner.build() run : %s", info);
    }

    public void setMavenPath(String mavenPath) {
        this.mavenPath = mavenPath;
    }
}
