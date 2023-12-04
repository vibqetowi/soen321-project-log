package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.chat.domain.chat.reset.ResetAiPeriod;
import com.ifriend.chat.domain.chat.reset.ResetAiUseCase;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: ResetViewModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetState;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "resetAiUseCase", "Lcom/ifriend/chat/domain/chat/reset/ResetAiUseCase;", "logger", "Lcom/ifriend/common_utils/Logger;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/chat/domain/chat/reset/ResetAiUseCase;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/CoroutineDispatchers;)V", "confirmErase", "", TypedValues.CycleType.S_WAVE_PERIOD, "Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;", "(Lcom/ifriend/chat/domain/chat/reset/ResetAiPeriod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "onBotChanged", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetViewModel extends BaseViewModel<ResetState> {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final GetBotUseCase getBotUseCase;
    private final Logger logger;
    private final ResetAiUseCase resetAiUseCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ResetViewModel(GetBotUseCase getBotUseCase, ResetAiUseCase resetAiUseCase, Logger logger, AppEventsEmitter appEventsEmitter, CoroutineDispatchers dispatchers) {
        super(dispatchers, ResetState.Companion.empty());
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(resetAiUseCase, "resetAiUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.getBotUseCase = getBotUseCase;
        this.resetAiUseCase = resetAiUseCase;
        this.logger = logger;
        this.appEventsEmitter = appEventsEmitter;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetViewModel$init$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBotChanged(Bot bot) {
        changeState(new ResetViewModel$onBotChanged$1(bot));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmErase(ResetAiPeriod resetAiPeriod, Continuation<? super Unit> continuation) {
        ResetViewModel$confirmErase$1 resetViewModel$confirmErase$1;
        int i;
        ResetViewModel resetViewModel;
        if (continuation instanceof ResetViewModel$confirmErase$1) {
            resetViewModel$confirmErase$1 = (ResetViewModel$confirmErase$1) continuation;
            if ((resetViewModel$confirmErase$1.label & Integer.MIN_VALUE) != 0) {
                resetViewModel$confirmErase$1.label -= Integer.MIN_VALUE;
                Object obj = resetViewModel$confirmErase$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resetViewModel$confirmErase$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ResetAiUseCase resetAiUseCase = this.resetAiUseCase;
                        resetViewModel$confirmErase$1.L$0 = this;
                        resetViewModel$confirmErase$1.label = 1;
                        if (resetAiUseCase.invoke(resetAiPeriod, resetViewModel$confirmErase$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        resetViewModel = this;
                    } catch (Exception e) {
                        e = e;
                        resetViewModel = this;
                        resetViewModel.logger.logException(e);
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    resetViewModel = (ResetViewModel) resetViewModel$confirmErase$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        resetViewModel.logger.logException(e);
                        return Unit.INSTANCE;
                    }
                }
                resetViewModel.appEventsEmitter.emit(AppEvents.Chat.RefreshConfiguration.INSTANCE);
                resetViewModel.appEventsEmitter.emit(AppEvents.Navigation.BackToChatFlow.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        resetViewModel$confirmErase$1 = new ResetViewModel$confirmErase$1(this, continuation);
        Object obj2 = resetViewModel$confirmErase$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resetViewModel$confirmErase$1.label;
        if (i != 0) {
        }
        resetViewModel.appEventsEmitter.emit(AppEvents.Chat.RefreshConfiguration.INSTANCE);
        resetViewModel.appEventsEmitter.emit(AppEvents.Navigation.BackToChatFlow.INSTANCE);
        return Unit.INSTANCE;
    }
}
