package com.bumptech.glide.load.engine.bitmap_recycle;
/* loaded from: classes2.dex */
interface ArrayAdapterInterface<T> {
    int getArrayLength(T t);

    int getElementSizeInBytes();

    String getTag();

    T newArray(int i);
}
