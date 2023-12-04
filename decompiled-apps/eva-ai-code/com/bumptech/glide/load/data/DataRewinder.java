package com.bumptech.glide.load.data;

import java.io.IOException;
/* loaded from: classes2.dex */
public interface DataRewinder<T> {

    /* loaded from: classes2.dex */
    public interface Factory<T> {
        DataRewinder<T> build(T t);

        Class<T> getDataClass();
    }

    void cleanup();

    T rewindAndGet() throws IOException;
}
