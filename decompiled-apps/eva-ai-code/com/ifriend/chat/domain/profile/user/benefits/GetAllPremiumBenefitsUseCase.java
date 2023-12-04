package com.ifriend.chat.domain.profile.user.benefits;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.benefits.PremiumBenefitsRepository;
import com.ifriend.domain.models.profile.bot.Bot;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GetAllPremiumBenefitsUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b0\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;", "", "repository", "Lcom/ifriend/domain/data/benefits/PremiumBenefitsRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/domain/data/benefits/PremiumBenefitsRepository;Lcom/ifriend/domain/data/BotRepository;)V", "getAll", "", "Lkotlin/Pair;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetAllPremiumBenefitsUseCase {
    private final BotRepository botRepository;
    private final PremiumBenefitsRepository repository;

    @Inject
    public GetAllPremiumBenefitsUseCase(PremiumBenefitsRepository repository, BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.repository = repository;
        this.botRepository = botRepository;
    }

    public final Object getAll(Continuation<? super List<? extends Pair<String, ? extends List<String>>>> continuation) {
        Bot currentBot = this.botRepository.getCurrentBot();
        return currentBot == null ? CollectionsKt.emptyList() : this.repository.getAll(currentBot, continuation);
    }
}
