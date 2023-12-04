package com.ifriend.domain.toggle;

import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: FeatureToggle.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/toggle/FeatureToggle;", "", Constants.ENABLE_DISABLE, "Lkotlinx/coroutines/flow/StateFlow;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabledCachedValue", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FeatureToggle {
    Object isEnabled(Continuation<? super StateFlow<Boolean>> continuation);

    Object isEnabledCachedValue(Continuation<? super Boolean> continuation);
}
