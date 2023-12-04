package com.ifriend.core.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
/* compiled from: ResettableLazy.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ifriend/core/utils/ResettableLazy;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "reset", "", "utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ResettableLazy<T> {
    T getValue();

    boolean isInitialized();

    void reset();
}
