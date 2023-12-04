package com.ifriend.domain.rateUs;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.socket.notifications.RateAppInternalNotification;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RateAppShowingPlanner.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;", "", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "(Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lcom/ifriend/base/navigation/api/RouterProvider;)V", "show", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RateAppShowingPlanner {
    private final InternalNotificationHandler handler;
    private final RouterProvider router;

    public RateAppShowingPlanner(InternalNotificationHandler handler, RouterProvider router) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(router, "router");
        this.handler = handler;
        this.router = router;
    }

    public final void show() {
        List<String> localStack;
        AppRouter chatRouter = this.router.getChatRouter();
        boolean z = false;
        if (chatRouter != null && (localStack = chatRouter.getLocalStack()) != null && localStack.contains("rate-app-screen")) {
            z = true;
        }
        if (z) {
            return;
        }
        this.handler.handle(new RateAppInternalNotification());
    }
}
