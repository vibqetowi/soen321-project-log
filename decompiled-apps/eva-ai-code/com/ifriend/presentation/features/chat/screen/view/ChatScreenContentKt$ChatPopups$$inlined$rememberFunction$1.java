package com.ifriend.presentation.features.chat.screen.view;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "R", "P", TtmlNode.TAG_P, "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberFunction$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatScreenContentKt$ChatPopups$$inlined$rememberFunction$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ ChatViewModel $viewModel$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenContentKt$ChatPopups$$inlined$rememberFunction$1(ChatViewModel chatViewModel) {
        super(1);
        this.$viewModel$inlined = chatViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.$viewModel$inlined.dispatchAction((ChatAction) new ChatAction.NightButtonPermissionGranted(bool.booleanValue()));
        return Unit.INSTANCE;
    }
}
