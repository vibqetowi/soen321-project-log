package com.ifriend.presentation.features.app.delegates;

import com.ifriend.presentation.services.ChatMessagesService;
import com.ifriend.presentation.services.ChatService;
import com.ifriend.presentation.services.UserBalanceService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppServicesDelegate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppServicesDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppServicesDelegate;", "userBalanceService", "Lcom/ifriend/presentation/services/UserBalanceService;", "chatMessagesService", "Lcom/ifriend/presentation/services/ChatMessagesService;", "chatService", "Lcom/ifriend/presentation/services/ChatService;", "(Lcom/ifriend/presentation/services/UserBalanceService;Lcom/ifriend/presentation/services/ChatMessagesService;Lcom/ifriend/presentation/services/ChatService;)V", "startAppServices", "", "stopAppServices", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppServicesDelegateImpl implements AppServicesDelegate {
    public static final int $stable = 0;
    private final ChatMessagesService chatMessagesService;
    private final ChatService chatService;
    private final UserBalanceService userBalanceService;

    @Inject
    public AppServicesDelegateImpl(UserBalanceService userBalanceService, ChatMessagesService chatMessagesService, ChatService chatService) {
        Intrinsics.checkNotNullParameter(userBalanceService, "userBalanceService");
        Intrinsics.checkNotNullParameter(chatMessagesService, "chatMessagesService");
        Intrinsics.checkNotNullParameter(chatService, "chatService");
        this.userBalanceService = userBalanceService;
        this.chatMessagesService = chatMessagesService;
        this.chatService = chatService;
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppServicesDelegate
    public void startAppServices() {
        this.userBalanceService.start();
        this.chatMessagesService.start();
        this.chatService.start();
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppServicesDelegate
    public void stopAppServices() {
        this.userBalanceService.stop();
        this.chatMessagesService.stop();
        this.chatService.stop();
    }
}
