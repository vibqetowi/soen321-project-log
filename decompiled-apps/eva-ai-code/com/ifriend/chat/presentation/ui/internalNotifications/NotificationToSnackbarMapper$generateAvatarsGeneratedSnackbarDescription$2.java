package com.ifriend.chat.presentation.ui.internalNotifications;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.domain.socket.notifications.AvatarsGeneratedNotification;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationToSnackbarMapper.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationToSnackbarMapper$generateAvatarsGeneratedSnackbarDescription$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AvatarsGeneratedNotification $notification;
    final /* synthetic */ NotificationToSnackbarMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationToSnackbarMapper$generateAvatarsGeneratedSnackbarDescription$2(NotificationToSnackbarMapper notificationToSnackbarMapper, AvatarsGeneratedNotification avatarsGeneratedNotification) {
        super(0);
        this.this$0 = notificationToSnackbarMapper;
        this.$notification = avatarsGeneratedNotification;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RouterProvider routerProvider;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
        routerProvider = this.this$0.router;
        AppRouter route = routerProvider.getRoute();
        generateBotAvatarScreenFactory = this.this$0.generateBotAvatarScreenFactory;
        route.navigateTo(generateBotAvatarScreenFactory.getGenerateBotAvatarScreen(this.$notification.getDescription()));
    }
}
