package com.ifriend.ui.utils.insets;

import androidx.core.view.WindowInsetsAnimationControllerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleImeAnimationController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/core/view/WindowInsetsAnimationControllerCompat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimpleImeAnimationController$startAndFling$1 extends Lambda implements Function1<WindowInsetsAnimationControllerCompat, Unit> {
    final /* synthetic */ float $velocityY;
    final /* synthetic */ SimpleImeAnimationController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleImeAnimationController$startAndFling$1(SimpleImeAnimationController simpleImeAnimationController, float f) {
        super(1);
        this.this$0 = simpleImeAnimationController;
        this.$velocityY = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat) {
        invoke2(windowInsetsAnimationControllerCompat);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WindowInsetsAnimationControllerCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.animateToFinish(Float.valueOf(this.$velocityY));
    }
}
