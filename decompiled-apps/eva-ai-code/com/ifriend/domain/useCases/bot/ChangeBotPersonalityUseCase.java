package com.ifriend.domain.useCases.bot;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.profile.bot.Personality;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChangeBotPersonalityUseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/useCases/bot/ChangeBotPersonalityUseCase;", "", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/domain/data/BotRepository;)V", "change", "", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "(Lcom/ifriend/domain/models/profile/bot/Personality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeBotPersonalityUseCase {
    private final BotRepository botRepository;

    public ChangeBotPersonalityUseCase(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.botRepository = botRepository;
    }

    public final Object change(Personality personality, Continuation<? super Unit> continuation) {
        Object personality2 = this.botRepository.setPersonality(personality, continuation);
        return personality2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? personality2 : Unit.INSTANCE;
    }
}
