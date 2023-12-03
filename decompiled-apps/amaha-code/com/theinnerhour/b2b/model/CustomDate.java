package com.theinnerhour.b2b.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class CustomDate implements Serializable {
    private long time = 0;

    public long getTime() {
        return this.time;
    }

    public void setTime(long j10) {
        if (j10 >= 10000000000L) {
            j10 /= 1000;
        }
        this.time = j10;
    }
}
