package org.skywalking.springcloud.test.projecta.vo;

public class Result {
    private String projectB;
    private String projectC;

    public Result(String projectB, String projectC) {
        this.projectB = projectB;
        this.projectC = projectC;
    }

    public String getProjectB() {
        return projectB;
    }

    public void setProjectB(String projectB) {
        this.projectB = projectB;
    }

    public String getProjectC() {
        return projectC;
    }

    public void setProjectC(String projectC) {
        this.projectC = projectC;
    }
}
