package com.ifriend.domain.notifications;

import java.util.SortedSet;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LongTermNotificationManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000bH&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "", "clearAll", "", "deleteAllTypeOfNotification", "classType", "Ljava/lang/Class;", "Lcom/ifriend/domain/notifications/LongTermNotification;", "deleteNotification", "notification", "notificationPool", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/SortedSet;", "putNotification", "singleInstance", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LongTermNotificationManager {
    void clearAll();

    void deleteAllTypeOfNotification(Class<? extends LongTermNotification> cls);

    void deleteNotification(LongTermNotification longTermNotification);

    Flow<SortedSet<LongTermNotification>> notificationPool();

    void putNotification(LongTermNotification longTermNotification, boolean z);

    /* compiled from: LongTermNotificationManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void putNotification$default(LongTermNotificationManager longTermNotificationManager, LongTermNotification longTermNotification, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putNotification");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            longTermNotificationManager.putNotification(longTermNotification, z);
        }
    }
}
