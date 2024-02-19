package org.example.entity;

import java.util.List;

public class Singers {
    private List<Singer> singers;

    public Singers(List<Singer> singers) {
        this.singers = singers;
    }

    public Singers() {
    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }
}
