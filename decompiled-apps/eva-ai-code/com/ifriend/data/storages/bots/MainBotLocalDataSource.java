package com.ifriend.data.storages.bots;

import com.ifriend.domain.models.profile.bot.Bot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
/* compiled from: MainBotLocalDataSource.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H&J\u001b\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "", "getBot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "getBotFlow", "Lkotlinx/coroutines/flow/Flow;", "update", "", "bot", "(Lcom/ifriend/domain/models/profile/bot/Bot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MainBotLocalDataSource {
    Bot getBot();

    Flow<Bot> getBotFlow();

    Object update(Bot bot, Continuation<? super Unit> continuation);
}
