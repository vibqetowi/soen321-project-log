package com.ifriend.ui.utils;

import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DebouncedClickListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/ui/utils/DebouncedClickListener;", "Landroid/view/View$OnClickListener;", "defaultInterval", "", "onClickBlock", "Lkotlin/Function1;", "Landroid/view/View;", "", "(ILkotlin/jvm/functions/Function1;)V", "lastTimeClicked", "", "onClick", "p0", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DebouncedClickListener implements View.OnClickListener {
    public static final int $stable = 8;
    private final int defaultInterval;
    private long lastTimeClicked;
    private final Function1<View, Unit> onClickBlock;

    /* JADX WARN: Multi-variable type inference failed */
    public DebouncedClickListener(int i, Function1<? super View, Unit> onClickBlock) {
        Intrinsics.checkNotNullParameter(onClickBlock, "onClickBlock");
        this.defaultInterval = i;
        this.onClickBlock = onClickBlock;
    }

    public /* synthetic */ DebouncedClickListener(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000 : i, function1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.lastTimeClicked < this.defaultInterval) {
            return;
        }
        this.lastTimeClicked = SystemClock.elapsedRealtime();
        this.onClickBlock.invoke(view);
    }
}
