package com.ifriend.animatedBackground.droplet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropletBackgroundView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DropletBackgroundView$moveSystem$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ float $toX;
    final /* synthetic */ float $toY;
    final /* synthetic */ DropletBackgroundView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView$moveSystem$1(DropletBackgroundView dropletBackgroundView, float f, float f2) {
        super(0);
        this.this$0 = dropletBackgroundView;
        this.$toX = f;
        this.$toY = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnimatedBackgroundDelegate backgroundDelegate;
        backgroundDelegate = this.this$0.getBackgroundDelegate();
        backgroundDelegate.move(this.$toX, this.$toY);
    }
}
