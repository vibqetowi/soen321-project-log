package com.ifriend.domain.useCases.bot.get;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.profile.bot.Bot;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GetBotUseCaseImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/useCases/bot/get/GetBotUseCaseImpl;", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/domain/data/BotRepository;)V", "current", "Lcom/ifriend/domain/models/profile/bot/Bot;", "flow", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetBotUseCaseImpl implements GetBotUseCase {
    private final BotRepository botRepository;

    public GetBotUseCaseImpl(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.botRepository = botRepository;
    }

    @Override // com.ifriend.domain.useCases.bot.get.GetBotUseCase
    public Object flow(Continuation<? super Flow<Bot>> continuation) {
        return this.botRepository.getBot();
    }

    @Override // com.ifriend.domain.useCases.bot.get.GetBotUseCase
    public Bot current() {
        return this.botRepository.getCurrentBot();
    }
}
