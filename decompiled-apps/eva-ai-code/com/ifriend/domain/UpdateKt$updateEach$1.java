package com.ifriend.domain;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Update.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UpdateKt$updateEach$1 extends Lambda implements Function1<List<T>, Unit> {
    final /* synthetic */ Function1<T, Boolean> $condition;
    final /* synthetic */ Function1<T, T> $update;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdateKt$updateEach$1(Function1<? super T, Boolean> function1, Function1<? super T, ? extends T> function12) {
        super(1);
        this.$condition = function1;
        this.$update = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<T> update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        List<T> list = update;
        Function1<T, Boolean> function1 = this.$condition;
        Function1<T, T> function12 = this.$update;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            if (function1.invoke(obj).booleanValue()) {
                obj = function12.invoke(obj);
            }
            arrayList.add(obj);
        }
    }
}
