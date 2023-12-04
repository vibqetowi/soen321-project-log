package com.ifriend.presentation.common.observers.purchases;

import java.util.UUID;
import kotlin.Metadata;
/* compiled from: PaymentResultObserver.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "", "onPaymentComplete", "", "requestId", "Ljava/util/UUID;", "isSuccessful", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentResultEmitter {
    void onPaymentComplete(UUID uuid, boolean z);
}
