package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import com.ifriend.animatedBackground.AnimatedBackgroundView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bgState", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFragment$watcher$1$2 extends Lambda implements Function1<AnimatedBackgroundView.State, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$watcher$1$2(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedBackgroundView.State state) {
        invoke2(state);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AnimatedBackgroundView.State bgState) {
        Intrinsics.checkNotNullParameter(bgState, "bgState");
        this.this$0.getBinding().animatedBackgroundView.postState(bgState);
    }
}
