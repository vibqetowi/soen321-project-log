package com.ifriend.animatedBackground.droplet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: DropletBackgroundView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isOpen", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DropletBackgroundView$onAttachedToWindow$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ DropletBackgroundView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView$onAttachedToWindow$1(DropletBackgroundView dropletBackgroundView) {
        super(1);
        this.this$0 = dropletBackgroundView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        if (z) {
            DropletBackgroundView dropletBackgroundView = this.this$0;
            dropletBackgroundView.moveSystem(dropletBackgroundView.getWidth() / 1.7f, this.this$0.getHeight() / 3.0f);
            return;
        }
        DropletBackgroundView dropletBackgroundView2 = this.this$0;
        dropletBackgroundView2.moveSystem(dropletBackgroundView2.getWidth() / 1.7f, this.this$0.getHeight() / 2.0f);
    }
}
