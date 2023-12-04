package com.ifriend.data.storages.bots;

import com.ifriend.domain.models.profile.bot.Bot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: MainBotLocalDataSource.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\bH\u0016J\u001b\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/data/storages/bots/MainBotLocalDataSourceImpl;", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "()V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/profile/bot/Bot;", "getBot", "getBotFlow", "Lkotlinx/coroutines/flow/Flow;", "update", "", "bot", "(Lcom/ifriend/domain/models/profile/bot/Bot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainBotLocalDataSourceImpl implements MainBotLocalDataSource {
    private final MutableStateFlow<Bot> state = StateFlowKt.MutableStateFlow(null);

    @Override // com.ifriend.data.storages.bots.MainBotLocalDataSource
    public Flow<Bot> getBotFlow() {
        return FlowKt.asStateFlow(this.state);
    }

    @Override // com.ifriend.data.storages.bots.MainBotLocalDataSource
    public Bot getBot() {
        return this.state.getValue();
    }

    @Override // com.ifriend.data.storages.bots.MainBotLocalDataSource
    public Object update(Bot bot, Continuation<? super Unit> continuation) {
        Object emit = this.state.emit(bot, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
