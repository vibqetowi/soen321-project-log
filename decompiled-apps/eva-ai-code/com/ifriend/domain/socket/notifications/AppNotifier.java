package com.ifriend.domain.socket.notifications;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AppNotifier.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/socket/notifications/AppNotifier;", "", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;)V", "launch", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppNotifier {
    private final CoroutineDispatchers dispatchers;
    private final InternalNotificationHandler handler;
    private final Logger logger;
    private final MessagesSource messagesSource;
    private final CoroutineScope scope;

    public AppNotifier(MessagesSource messagesSource, InternalNotificationHandler handler, CoroutineScope scope, CoroutineDispatchers dispatchers, Logger logger) {
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.messagesSource = messagesSource;
        this.handler = handler;
        this.scope = scope;
        this.dispatchers = dispatchers;
        this.logger = logger;
    }

    public final void launch() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatchers.getIO(), null, new AppNotifier$launch$1(this, null), 2, null);
    }
}
