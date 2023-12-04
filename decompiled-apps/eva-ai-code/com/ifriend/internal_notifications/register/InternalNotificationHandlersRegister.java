package com.ifriend.internal_notifications.register;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InternalNotificationHandlersRegister.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "", "register", "", ViewHierarchyConstants.TAG_KEY, "", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "registeredHandlers", "", "unregister", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InternalNotificationHandlersRegister {
    void register(String str, InternalNotificationHandler internalNotificationHandler);

    List<InternalNotificationHandler> registeredHandlers();

    void unregister(String str);
}
