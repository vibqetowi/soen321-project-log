package com.ifriend.domain.data.update;

import com.ifriend.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InAppUpdateRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/data/update/InAppUpdateRepository;", "", "getDismissCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastDismissTimestamp", "", "incDismissCount", "", "refresh", "setLastDismissTimestamp", AnalyticsConstants.TIMESTAMP, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InAppUpdateRepository {
    Object getDismissCount(Continuation<? super Integer> continuation);

    Object getLastDismissTimestamp(Continuation<? super Long> continuation);

    Object incDismissCount(Continuation<? super Unit> continuation);

    Object refresh(Continuation<? super Unit> continuation);

    Object setLastDismissTimestamp(long j, Continuation<? super Unit> continuation);
}
