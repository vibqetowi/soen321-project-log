package com.ifriend.presentation.common.observers.purchases;

import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: PaymentResultObserver.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "", "getPaymentResultFlow", "Lkotlinx/coroutines/flow/Flow;", "", "requestId", "Ljava/util/UUID;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentResultFlow {
    Flow<Boolean> getPaymentResultFlow(UUID uuid);
}
