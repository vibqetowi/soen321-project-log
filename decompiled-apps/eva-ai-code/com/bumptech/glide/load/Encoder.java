package com.bumptech.glide.load;

import java.io.File;
/* loaded from: classes2.dex */
public interface Encoder<T> {
    boolean encode(T t, File file, Options options);
}
