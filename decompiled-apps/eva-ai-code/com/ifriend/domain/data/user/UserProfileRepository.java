package com.ifriend.domain.data.user;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserProfileRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/data/user/UserProfileRepository;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseCount", "", "getPurchaseTotal", "", "incPurchaseTotal", "amount", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isOnboardingDataSubmitted", "", "purchaseCountInc", "setOnboardingDataSubmitted", "isSubmitted", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserProfileRepository {
    Object clear(Continuation<? super Unit> continuation);

    Object getPurchaseCount(Continuation<? super Integer> continuation);

    Object getPurchaseTotal(Continuation<? super Float> continuation);

    Object incPurchaseTotal(float f, Continuation<? super Unit> continuation);

    Object isOnboardingDataSubmitted(Continuation<? super Boolean> continuation);

    Object purchaseCountInc(Continuation<? super Unit> continuation);

    Object setOnboardingDataSubmitted(boolean z, Continuation<? super Unit> continuation);
}
