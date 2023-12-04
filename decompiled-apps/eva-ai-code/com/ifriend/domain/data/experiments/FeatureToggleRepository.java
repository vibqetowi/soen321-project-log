package com.ifriend.domain.data.experiments;

import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: FeatureToggleRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "", "isFeatureEnabled", "", "toggle", "Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;", "(Lcom/ifriend/domain/logic/experiments/FeatureToggleKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFeatureEnabledFlow", "Lkotlinx/coroutines/flow/Flow;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FeatureToggleRepository {
    Object isFeatureEnabled(FeatureToggleKey featureToggleKey, Continuation<? super Boolean> continuation);

    Object isFeatureEnabledFlow(FeatureToggleKey featureToggleKey, Continuation<? super Flow<Boolean>> continuation);
}
