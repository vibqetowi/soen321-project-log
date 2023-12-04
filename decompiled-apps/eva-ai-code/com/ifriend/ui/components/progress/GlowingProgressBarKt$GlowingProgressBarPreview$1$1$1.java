package com.ifriend.ui.components.progress;

import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlowingProgressBar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowingProgressBarKt$GlowingProgressBarPreview$1$1$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ MutableFloatState $progress$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowingProgressBarKt$GlowingProgressBarPreview$1$1$1(MutableFloatState mutableFloatState) {
        super(1);
        this.$progress$delegate = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        this.$progress$delegate.setFloatValue(f);
    }
}
