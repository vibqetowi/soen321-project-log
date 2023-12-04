package com.ifriend.ui.utils;

import android.view.View;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: DebouncedClickListener.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0004\u001a\"\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"setDebouncedOnClickListener", "", "Landroid/view/View;", "onClickBlock", "Lkotlin/Function1;", "setScreenDebouncedOnClickListener", "block", "Lkotlin/Function0;", RtspHeaders.Values.TIME, "", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DebouncedClickListenerKt {
    public static final void setDebouncedOnClickListener(View view, Function1<? super View, Unit> onClickBlock) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickBlock, "onClickBlock");
        view.setOnClickListener(new DebouncedClickListener(0, new DebouncedClickListenerKt$setDebouncedOnClickListener$debouncedClickListener$1(onClickBlock), 1, null));
    }

    public static /* synthetic */ void setScreenDebouncedOnClickListener$default(View view, Function0 function0, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        setScreenDebouncedOnClickListener(view, function0, j);
    }

    public static final void setScreenDebouncedOnClickListener(View view, final Function0<Unit> block, final long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        view.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.utils.DebouncedClickListenerKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DebouncedClickListenerKt.setScreenDebouncedOnClickListener$lambda$0(Ref.ObjectRef.this, j, block, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Long] */
    public static final void setScreenDebouncedOnClickListener$lambda$0(Ref.ObjectRef lastDebounce, long j, Function0 block, View view) {
        Intrinsics.checkNotNullParameter(lastDebounce, "$lastDebounce");
        Intrinsics.checkNotNullParameter(block, "$block");
        Long l = (Long) lastDebounce.element;
        if (l == null || System.currentTimeMillis() - l.longValue() >= j) {
            lastDebounce.element = Long.valueOf(System.currentTimeMillis());
            block.invoke();
        }
    }
}
