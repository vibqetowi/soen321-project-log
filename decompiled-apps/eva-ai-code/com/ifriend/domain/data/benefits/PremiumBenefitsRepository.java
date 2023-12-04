package com.ifriend.domain.data.benefits;

import com.ifriend.domain.models.profile.bot.Bot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PremiumBenefitsRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/data/benefits/PremiumBenefitsRepository;", "", "getAll", "", "Lkotlin/Pair;", "", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "(Lcom/ifriend/domain/models/profile/bot/Bot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PremiumBenefitsRepository {
    Object getAll(Bot bot, Continuation<? super List<? extends Pair<String, ? extends List<String>>>> continuation);
}
