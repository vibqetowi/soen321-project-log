package com.ifriend.presentation.features.chat.offers;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.logic.offers.ChatSubscriptionOfferInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: ChatSubscriptionOfferDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0016R\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/offers/ChatSubscriptionOfferDelegateImpl;", "Lcom/ifriend/presentation/features/chat/offers/ChatSubscriptionOfferDelegate;", "chatSubscriptionOfferInteractor", "Lcom/ifriend/domain/logic/offers/ChatSubscriptionOfferInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/logic/offers/ChatSubscriptionOfferInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "checkIfNeedShowSubscriptionOffer", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferDelegateImpl implements ChatSubscriptionOfferDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor;

    @Inject
    public ChatSubscriptionOfferDelegateImpl(ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(chatSubscriptionOfferInteractor, "chatSubscriptionOfferInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.chatSubscriptionOfferInteractor = chatSubscriptionOfferInteractor;
        this.appEventsEmitter = appEventsEmitter;
    }

    @Override // com.ifriend.presentation.features.chat.offers.ChatSubscriptionOfferDelegate
    public void checkIfNeedShowSubscriptionOffer(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatSubscriptionOfferDelegateImpl$checkIfNeedShowSubscriptionOffer$1(this, null), 3, null);
    }
}
