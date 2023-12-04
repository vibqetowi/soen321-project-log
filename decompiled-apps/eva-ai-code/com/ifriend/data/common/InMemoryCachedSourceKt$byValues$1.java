package com.ifriend.data.common;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InMemoryCachedSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "key1", "key2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InMemoryCachedSourceKt$byValues$1 extends Lambda implements Function2<T, T, Boolean> {
    public static final InMemoryCachedSourceKt$byValues$1 INSTANCE = new InMemoryCachedSourceKt$byValues$1();

    InMemoryCachedSourceKt$byValues$1() {
        super(2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(T t, T t2) {
        return Boolean.valueOf(Intrinsics.areEqual(t, t2));
    }
}
