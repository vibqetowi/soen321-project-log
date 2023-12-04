package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.domain.socket.notifications.ActivationTopicErrorNotification;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotGenderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotGenderViewModel$save$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ BotGenderViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGenderViewModel$save$1(BotGenderViewModel botGenderViewModel) {
        super(1);
        this.this$0 = botGenderViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable it) {
        InternalNotificationHandler internalNotificationHandler;
        Intrinsics.checkNotNullParameter(it, "it");
        internalNotificationHandler = this.this$0.internalNotificationHandler;
        internalNotificationHandler.handle(ActivationTopicErrorNotification.INSTANCE);
        this.this$0.isEdited().setValue(true);
    }
}
