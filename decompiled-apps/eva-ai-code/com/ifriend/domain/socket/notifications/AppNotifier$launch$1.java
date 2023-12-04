package com.ifriend.domain.socket.notifications;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppNotifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.socket.notifications.AppNotifier$launch$1", f = "AppNotifier.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppNotifier$launch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppNotifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppNotifier$launch$1(AppNotifier appNotifier, Continuation<? super AppNotifier$launch$1> continuation) {
        super(2, continuation);
        this.this$0 = appNotifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppNotifier$launch$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppNotifier$launch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MessagesSource messagesSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            messagesSource = this.this$0.messagesSource;
            Flow<MessagesSourceMessage> allMessages = messagesSource.getAllMessages(false);
            final AppNotifier appNotifier = this.this$0;
            this.label = 1;
            if (allMessages.collect(new FlowCollector() { // from class: com.ifriend.domain.socket.notifications.AppNotifier$launch$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((MessagesSourceMessage) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(MessagesSourceMessage messagesSourceMessage, Continuation<? super Unit> continuation) {
                    Logger logger;
                    InternalNotificationHandler internalNotificationHandler;
                    InternalNotificationHandler internalNotificationHandler2;
                    InternalNotificationHandler internalNotificationHandler3;
                    InternalNotificationHandler internalNotificationHandler4;
                    InternalNotificationHandler internalNotificationHandler5;
                    InternalNotificationHandler internalNotificationHandler6;
                    InternalNotificationHandler internalNotificationHandler7;
                    try {
                        if (messagesSourceMessage instanceof MessagesSourceMessage.NeuronesPurchased) {
                            internalNotificationHandler7 = AppNotifier.this.handler;
                            internalNotificationHandler7.handle(new NeuronsAddedNotification(((MessagesSourceMessage.NeuronesPurchased) messagesSourceMessage).getChange()));
                        } else if (messagesSourceMessage instanceof MessagesSourceMessage.DailyNeuronsReceived) {
                            internalNotificationHandler6 = AppNotifier.this.handler;
                            internalNotificationHandler6.handle(new DailyNeuronsNotification(((MessagesSourceMessage.DailyNeuronsReceived) messagesSourceMessage).getAmount()));
                        } else if (messagesSourceMessage instanceof MessagesSourceMessage.AccountUpgraded) {
                            internalNotificationHandler5 = AppNotifier.this.handler;
                            internalNotificationHandler5.handle(new AccountUpgraded());
                        } else if (messagesSourceMessage instanceof MessagesSourceMessage.AvatarsGenerated) {
                            internalNotificationHandler4 = AppNotifier.this.handler;
                            internalNotificationHandler4.handle(new AvatarsGeneratedNotification(((MessagesSourceMessage.AvatarsGenerated) messagesSourceMessage).getGeneratedAvatars().getStatus() == AvatarGenerationStatus.SUCCESS, ((MessagesSourceMessage.AvatarsGenerated) messagesSourceMessage).getGeneratedAvatars().getDescription()));
                        } else if (messagesSourceMessage instanceof MessagesSourceMessage.AvatarAnimationGenerated) {
                            if (((MessagesSourceMessage.AvatarAnimationGenerated) messagesSourceMessage).getAnimationStatus() == MessagesSourceMessage.AvatarAnimationGenerated.AvatarAnimationGeneratedStatus.NO_FACE_DETECTED) {
                                internalNotificationHandler3 = AppNotifier.this.handler;
                                internalNotificationHandler3.handle(new GenerationAvatarAnimationErrorNotification());
                            }
                        } else if (messagesSourceMessage instanceof MessagesSourceMessage.LevelInfoUpdate) {
                            if (((MessagesSourceMessage.LevelInfoUpdate) messagesSourceMessage).getChanges().getLevelChanged() > 0) {
                                internalNotificationHandler2 = AppNotifier.this.handler;
                                internalNotificationHandler2.handle(new LevelUpdateCongratulationNotification(((MessagesSourceMessage.LevelInfoUpdate) messagesSourceMessage).getCurrent().getLevel()));
                            }
                            String levelChangedMessage = ((MessagesSourceMessage.LevelInfoUpdate) messagesSourceMessage).getChanges().getLevelChangedMessage();
                            if (levelChangedMessage != null) {
                                internalNotificationHandler = AppNotifier.this.handler;
                                internalNotificationHandler.handle(new LevelUpdateMessageNotification(levelChangedMessage));
                            }
                        }
                    } catch (Exception e) {
                        logger = AppNotifier.this.logger;
                        logger.logException(e);
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
