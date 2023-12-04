package com.ifriend.data.repository;

import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BotRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BotRepositoryImpl$setEthnicity$2 extends Lambda implements Function1<Bot, Bot> {
    final /* synthetic */ Ethnicity $ethnicity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotRepositoryImpl$setEthnicity$2(Ethnicity ethnicity) {
        super(1);
        this.$ethnicity = ethnicity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bot invoke(Bot bot) {
        Intrinsics.checkNotNullParameter(bot, "bot");
        return Bot.copy$default(bot, null, null, null, this.$ethnicity, null, null, 55, null);
    }
}
