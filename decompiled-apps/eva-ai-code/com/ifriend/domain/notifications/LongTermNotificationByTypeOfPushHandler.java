package com.ifriend.domain.notifications;

import java.util.Map;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LongTermNotificationByTypeOfPushHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/notifications/LongTermNotificationByTypeOfPushHandler;", "", "handle", "", "pushData", "", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LongTermNotificationByTypeOfPushHandler {
    boolean handle(Map<String, String> map);
}
