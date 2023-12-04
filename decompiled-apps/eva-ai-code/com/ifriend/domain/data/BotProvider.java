package com.ifriend.domain.data;

import com.ifriend.domain.models.profile.bot.Bot;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BotRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/data/BotProvider;", "", "getBot", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/models/profile/bot/Bot;", "getCurrentBot", "getCurrentServerActualBot", "getServerActualBot", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BotProvider {
    Flow<Bot> getBot();

    Bot getCurrentBot();

    Bot getCurrentServerActualBot();

    Flow<Bot> getServerActualBot();
}
