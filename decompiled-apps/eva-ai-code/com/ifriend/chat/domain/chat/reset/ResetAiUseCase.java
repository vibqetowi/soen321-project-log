package com.ifriend.chat.domain.chat.reset;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.newChat.chat.systems.reset.ResetStateEvent;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResetAiUseCase.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/chat/domain/chat/reset/ResetAiUseCase;", "", "resetDelegate", "Lcom/ifriend/chat/domain/data/ResetAiApiDelegate;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "(Lcom/ifriend/chat/domain/data/ResetAiApiDelegate;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;)V", "callReset", "", "user", "Lcom/ifriend/domain/models/profile/user/User;", TypedValues.CycleType.S_WAVE_PERIOD, "Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;", "(Lcom/ifriend/domain/models/profile/user/User;Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "", "(Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postNotification", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetAiUseCase {
    private final BotRepository botRepository;
    private final ChatClientInteractor chatClientInteractor;
    private final InternalNotificationHandler internalNotificationHandler;
    private final ResetAiApiDelegate resetDelegate;
    private final UserRepository userRepository;

    /* compiled from: ResetAiUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResetAiPeriod.values().length];
            try {
                iArr[ResetAiPeriod.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResetAiPeriod.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResetAiPeriod.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ResetAiUseCase(ResetAiApiDelegate resetDelegate, UserRepository userRepository, BotRepository botRepository, ChatClientInteractor chatClientInteractor, InternalNotificationHandler internalNotificationHandler) {
        Intrinsics.checkNotNullParameter(resetDelegate, "resetDelegate");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        this.resetDelegate = resetDelegate;
        this.userRepository = userRepository;
        this.botRepository = botRepository;
        this.chatClientInteractor = chatClientInteractor;
        this.internalNotificationHandler = internalNotificationHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(ResetAiPeriod resetAiPeriod, Continuation<? super Unit> continuation) {
        ResetAiUseCase$invoke$1 resetAiUseCase$invoke$1;
        Object obj;
        int i;
        ResetAiUseCase resetAiUseCase;
        if (continuation instanceof ResetAiUseCase$invoke$1) {
            resetAiUseCase$invoke$1 = (ResetAiUseCase$invoke$1) continuation;
            if ((resetAiUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                resetAiUseCase$invoke$1.label -= Integer.MIN_VALUE;
                obj = resetAiUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resetAiUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser == null) {
                        throw new Exception("User must be authorized to reset AI: no User in repository");
                    }
                    resetAiUseCase$invoke$1.L$0 = this;
                    resetAiUseCase$invoke$1.label = 1;
                    obj = callReset(currentUser, resetAiPeriod, resetAiUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    resetAiUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        resetAiUseCase = (ResetAiUseCase) resetAiUseCase$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        resetAiUseCase.postNotification();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    resetAiUseCase = (ResetAiUseCase) resetAiUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    resetAiUseCase$invoke$1.L$0 = resetAiUseCase;
                    resetAiUseCase$invoke$1.label = 2;
                    if (resetAiUseCase.chatClientInteractor.handleEventForAll(new ResetStateEvent("Reset AI"), resetAiUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                resetAiUseCase.postNotification();
                return Unit.INSTANCE;
            }
        }
        resetAiUseCase$invoke$1 = new ResetAiUseCase$invoke$1(this, continuation);
        obj = resetAiUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resetAiUseCase$invoke$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        resetAiUseCase.postNotification();
        return Unit.INSTANCE;
    }

    private final void postNotification() {
        Bot currentBot = this.botRepository.getCurrentBot();
        if (currentBot == null) {
            return;
        }
        InternalNotificationHandler internalNotificationHandler = this.internalNotificationHandler;
        String name = currentBot.getName();
        if (name == null) {
            name = "";
        }
        internalNotificationHandler.handle(new AiHasBeenResetInternalNotification(name));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object callReset(User user, ResetAiPeriod resetAiPeriod, Continuation<? super Boolean> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[resetAiPeriod.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.resetDelegate.resetLastHour(user.getAuth(), continuation);
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.resetDelegate.resetLastDay(user.getAuth(), continuation);
        }
        return this.resetDelegate.resetAll(user.getAuth(), continuation);
    }
}
