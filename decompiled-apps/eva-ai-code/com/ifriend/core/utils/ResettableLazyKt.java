package com.ifriend.core.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResettableLazy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\b"}, d2 = {"resettableLazy", "Lcom/ifriend/core/utils/ResettableLazy;", ExifInterface.GPS_DIRECTION_TRUE, "initializer", "Lkotlin/Function0;", "lock", "", "resettableLazyUnSynchronized", "utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResettableLazyKt {
    public static final <T> ResettableLazy<T> resettableLazy(Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new ResettableLazyImpl(initializer, null, 2, null);
    }

    public static /* synthetic */ ResettableLazy resettableLazy$default(Object obj, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return resettableLazy(obj, function0);
    }

    public static final <T> ResettableLazy<T> resettableLazy(Object obj, Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new ResettableLazyImpl(initializer, null, 2, null);
    }

    public static final <T> ResettableLazy<T> resettableLazyUnSynchronized(Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new ResettableLazyUnSynchronizedImpl(initializer);
    }
}
