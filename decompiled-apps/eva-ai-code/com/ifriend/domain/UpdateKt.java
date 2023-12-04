package com.ifriend.domain;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Update.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001d\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u001aD\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u00042\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0004\u001aD\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u00042\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\f"}, d2 = {"update", "", ExifInterface.GPS_DIRECTION_TRUE, "updateBlock", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "updateEach", "condition", "", "updateFirst", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateKt {
    public static final <T> List<T> update(List<? extends T> list, Function1<? super List<T>, Unit> updateBlock) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(updateBlock, "updateBlock");
        List<T> mutableList = CollectionsKt.toMutableList((Collection) list);
        updateBlock.invoke(mutableList);
        return mutableList;
    }

    public static final <T> List<T> updateFirst(List<? extends T> list, Function1<? super T, Boolean> condition, Function1<? super T, ? extends T> update) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(update, "update");
        return update(list, new UpdateKt$updateFirst$1(condition, update));
    }

    public static final <T> List<T> updateEach(List<? extends T> list, Function1<? super T, Boolean> condition, Function1<? super T, ? extends T> update) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(update, "update");
        return update(list, new UpdateKt$updateEach$1(condition, update));
    }
}
