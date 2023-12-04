package com.ifriend.long_term_notifications.impl;

import com.ifriend.domain.notifications.LongTermNotificationByPushCreator;
import com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LongTermNotificationByTypeOfPushHandlerImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\"\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0011\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0019\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/LongTermNotificationByTypeOfPushHandlerImpl;", "Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;", "longTermNotificationManager", "Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "creators", "", "Lcom/ifriend/domain/notifications/LongTermNotificationByPushCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/ifriend/domain/notifications/LongTermNotificationManager;Ljava/util/Set;)V", "handle", "", "pushData", "", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongTermNotificationByTypeOfPushHandlerImpl implements LongTermNotificationByTypeOfPushHandler {
    private final Set<LongTermNotificationByPushCreator> creators;
    private final LongTermNotificationManager longTermNotificationManager;

    @Inject
    public LongTermNotificationByTypeOfPushHandlerImpl(LongTermNotificationManager longTermNotificationManager, Set<LongTermNotificationByPushCreator> creators) {
        Intrinsics.checkNotNullParameter(longTermNotificationManager, "longTermNotificationManager");
        Intrinsics.checkNotNullParameter(creators, "creators");
        this.longTermNotificationManager = longTermNotificationManager;
        this.creators = creators;
    }

    @Override // com.ifriend.domain.notifications.LongTermNotificationByTypeOfPushHandler
    public boolean handle(Map<String, String> pushData) {
        Intrinsics.checkNotNullParameter(pushData, "pushData");
        for (LongTermNotificationByPushCreator longTermNotificationByPushCreator : this.creators) {
            if (Intrinsics.areEqual(pushData.get("type"), longTermNotificationByPushCreator.pushType())) {
                LongTermNotificationManager.DefaultImpls.putNotification$default(this.longTermNotificationManager, longTermNotificationByPushCreator.createLongTermNotification(pushData), false, 2, null);
                return true;
            }
        }
        return false;
    }
}
