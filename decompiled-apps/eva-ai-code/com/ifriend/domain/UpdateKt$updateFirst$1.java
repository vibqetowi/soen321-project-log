package com.ifriend.domain;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Update.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UpdateKt$updateFirst$1 extends Lambda implements Function1<List<T>, Unit> {
    final /* synthetic */ Function1<T, Boolean> $condition;
    final /* synthetic */ Function1<T, T> $update;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdateKt$updateFirst$1(Function1<? super T, Boolean> function1, Function1<? super T, ? extends T> function12) {
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
        Function1<T, Boolean> function1 = this.$condition;
        Iterator it = update.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (function1.invoke(it.next()).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        update.remove(i);
        update.set(i, this.$update.invoke(update.get(i)));
    }
}
