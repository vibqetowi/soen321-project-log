package com.ifriend.animatedBackground.droplet;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropletBackgroundView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/animatedBackground/droplet/AnimatedBackgroundDelegate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DropletBackgroundView$backgroundDelegate$2 extends Lambda implements Function0<AnimatedBackgroundDelegate> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DropletBackgroundView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropletBackgroundView$backgroundDelegate$2(Context context, DropletBackgroundView dropletBackgroundView) {
        super(0);
        this.$context = context;
        this.this$0 = dropletBackgroundView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AnimatedBackgroundDelegate invoke() {
        return new AnimatedBackgroundDelegate(this.$context, this.this$0);
    }
}
