package com.ifriend.long_term_notifications.impl;

import com.ifriend.domain.notifications.LongTermNotification;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LongTermNotificationManagerImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/ifriend/domain/notifications/LongTermNotification;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongTermNotificationManagerImpl$_notificationPool$2 extends Lambda implements Function0<MutableStateFlow<Set<? extends LongTermNotification>>> {
    final /* synthetic */ LongTermNotificationManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTermNotificationManagerImpl$_notificationPool$2(LongTermNotificationManagerImpl longTermNotificationManagerImpl) {
        super(0);
        this.this$0 = longTermNotificationManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MutableStateFlow<Set<? extends LongTermNotification>> invoke() {
        Set poolFromSp;
        poolFromSp = this.this$0.getPoolFromSp();
        return StateFlowKt.MutableStateFlow(poolFromSp);
    }
}
