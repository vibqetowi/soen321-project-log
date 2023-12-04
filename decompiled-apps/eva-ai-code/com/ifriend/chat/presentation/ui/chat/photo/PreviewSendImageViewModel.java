package com.ifriend.chat.presentation.ui.chat.photo;

import android.content.Context;
import android.graphics.Bitmap;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PreviewSendImageViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/chat/photo/PreviewSendImageState;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "(Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;)V", "send", "", "context", "Landroid/content/Context;", "chatId", "", "setImage", "bitmap", "Landroid/graphics/Bitmap;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewSendImageViewModel extends BaseViewModel<PreviewSendImageState> {
    public static final int $stable = 8;
    private final ChatClientInteractor chatClientInteractor;
    private final CoroutineScope coroutineScope;
    private final CoroutineDispatchers dispatchers;
    private final InternalNotificationHandler internalNotificationHandler;
    private final Logger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PreviewSendImageViewModel(InternalNotificationHandler internalNotificationHandler, CoroutineScope coroutineScope, CoroutineDispatchers dispatchers, Logger logger, ChatClientInteractor chatClientInteractor) {
        super(dispatchers, PreviewSendImageState.Companion.getEmpty());
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        this.internalNotificationHandler = internalNotificationHandler;
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatchers;
        this.logger = logger;
        this.chatClientInteractor = chatClientInteractor;
    }

    public final void setImage(Bitmap bitmap) {
        changeState(new PreviewSendImageViewModel$setImage$1(bitmap));
    }

    public final void send(Context context, String chatId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.getIO(), null, new PreviewSendImageViewModel$send$1(this, context, chatId, null), 2, null);
    }
}
