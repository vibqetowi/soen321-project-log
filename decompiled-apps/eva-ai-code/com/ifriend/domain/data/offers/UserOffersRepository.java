package com.ifriend.domain.data.offers;

import com.ifriend.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserOffersRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/data/offers/UserOffersRepository;", "", "getLastChatSubscriptionOfferTimestamp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShouldShowChatSubscriptionOfferAfterOnboarding", "", "setLastChatSubscriptionOfferTimestamp", "", AnalyticsConstants.TIMESTAMP, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setShouldShowChatSubscriptionOfferAfterOnboarding", "shouldShow", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserOffersRepository {
    Object getLastChatSubscriptionOfferTimestamp(Continuation<? super Long> continuation);

    Object getShouldShowChatSubscriptionOfferAfterOnboarding(Continuation<? super Boolean> continuation);

    Object setLastChatSubscriptionOfferTimestamp(long j, Continuation<? super Unit> continuation);

    Object setShouldShowChatSubscriptionOfferAfterOnboarding(boolean z, Continuation<? super Unit> continuation);
}
