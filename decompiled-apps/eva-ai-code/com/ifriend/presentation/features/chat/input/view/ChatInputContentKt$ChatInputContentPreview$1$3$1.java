package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$ChatInputContentPreview$1$3$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<ChatInputState> $state$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContentPreview$1$3$1(MutableState<ChatInputState> mutableState) {
        super(1);
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        ChatInputState ChatInputContentPreview$lambda$30$lambda$25;
        Intrinsics.checkNotNullParameter(it, "it");
        MutableState<ChatInputState> mutableState = this.$state$delegate;
        ChatInputContentPreview$lambda$30$lambda$25 = ChatInputContentKt.ChatInputContentPreview$lambda$30$lambda$25(mutableState);
        mutableState.setValue(ChatInputState.copy$default(ChatInputContentPreview$lambda$30$lambda$25, it, null, false, false, null, 0.0f, 62, null));
    }
}
