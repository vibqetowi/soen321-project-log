package com.ifriend.presentation.features.chat.sextingmessage;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import java.util.HashSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SextingMessagePaywallShowingDelegate.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u00020\u000f¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/features/chat/sextingmessage/SextingMessagePaywallShowingDelegateImpl;", "Lcom/ifriend/presentation/features/chat/sextingmessage/SextingMessagePaywallShowingDelegate;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "chatMessageAccessInteractor", "Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "(Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;)V", "paywallShownForMessages", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "initSextingMessagePaywall", "", "Landroidx/lifecycle/ViewModel;", "chatId", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SextingMessagePaywallShowingDelegateImpl implements SextingMessagePaywallShowingDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatClientInteractor chatClientInteractor;
    private final ChatMessageAccessInteractor chatMessageAccessInteractor;
    private final HashSet<String> paywallShownForMessages;

    @Inject
    public SextingMessagePaywallShowingDelegateImpl(ChatClientInteractor chatClientInteractor, AppEventsEmitter appEventsEmitter, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(chatMessageAccessInteractor, "chatMessageAccessInteractor");
        this.chatClientInteractor = chatClientInteractor;
        this.appEventsEmitter = appEventsEmitter;
        this.chatMessageAccessInteractor = chatMessageAccessInteractor;
        this.paywallShownForMessages = new HashSet<>();
    }

    @Override // com.ifriend.presentation.features.chat.sextingmessage.SextingMessagePaywallShowingDelegate
    public void initSextingMessagePaywall(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new SextingMessagePaywallShowingDelegateImpl$initSextingMessagePaywall$1(this, chatId, context_receiver_0, null), 3, null);
    }
}
