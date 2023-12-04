package com.ifriend.presentation.features.profile.header.view;

import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.profile.header.view.ComposableSingletons$ChatHeaderContentKt$lambda-2$1$1$1$7$1  reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$7$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ MutableState<ChatHeaderUiState> $state$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ChatHeaderContentKt$lambda2$1$1$1$7$1(MutableState<ChatHeaderUiState> mutableState) {
        super(1);
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        ChatHeaderUiState invoke$lambda$11$lambda$1;
        ChatHeaderUiState copy;
        MutableState<ChatHeaderUiState> mutableState = this.$state$delegate;
        invoke$lambda$11$lambda$1 = ComposableSingletons$ChatHeaderContentKt$lambda2$1.invoke$lambda$11$lambda$1(mutableState);
        copy = invoke$lambda$11$lambda$1.copy((r26 & 1) != 0 ? invoke$lambda$11$lambda$1.animatedAvatarState : null, (r26 & 2) != 0 ? invoke$lambda$11$lambda$1.title : null, (r26 & 4) != 0 ? invoke$lambda$11$lambda$1.unreadMessagesCount : 0, (r26 & 8) != 0 ? invoke$lambda$11$lambda$1.lvlProgress : f, (r26 & 16) != 0 ? invoke$lambda$11$lambda$1.lvlLabel : null, (r26 & 32) != 0 ? invoke$lambda$11$lambda$1.isVisibleLvlProgress : false, (r26 & 64) != 0 ? invoke$lambda$11$lambda$1.balanceLabel : null, (r26 & 128) != 0 ? invoke$lambda$11$lambda$1.isVisibleBackButton : false, (r26 & 256) != 0 ? invoke$lambda$11$lambda$1.isVisibleMenuButton : false, (r26 & 512) != 0 ? invoke$lambda$11$lambda$1.isVisibleMenuIndicator : false, (r26 & 1024) != 0 ? invoke$lambda$11$lambda$1.isVisibleUpdateIndicator : false, (r26 & 2048) != 0 ? invoke$lambda$11$lambda$1.isVisibleVerified : false);
        mutableState.setValue(copy);
    }
}
