package com.ifriend.presentation.features.chat.input.view;

import android.view.View;
import androidx.compose.runtime.MutableState;
import com.ifriend.ui.haptic.AppHapticConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatInputContentKt$ChatInputContent$3$1$1$3$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChatInputCallbacks $callbacks;
    final /* synthetic */ MutableState<Boolean> $cancelled$delegate;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$3$1$1$3$3(View view, ChatInputCallbacks chatInputCallbacks, MutableState<Boolean> mutableState) {
        super(0);
        this.$view = view;
        this.$callbacks = chatInputCallbacks;
        this.$cancelled$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean ChatInputContent$lambda$6;
        ChatInputContent$lambda$6 = ChatInputContentKt.ChatInputContent$lambda$6(this.$cancelled$delegate);
        if (ChatInputContent$lambda$6) {
            return;
        }
        this.$view.performHapticFeedback(AppHapticConstants.INSTANCE.getCONFIRM());
        this.$callbacks.getOnRecordAudioEnd().invoke();
    }
}
