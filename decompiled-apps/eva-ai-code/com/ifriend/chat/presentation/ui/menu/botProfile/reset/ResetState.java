package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResetState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "(Lcom/ifriend/domain/models/profile/bot/Bot;)V", "getBot", "()Lcom/ifriend/domain/models/profile/bot/Bot;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetState extends BaseState {
    private final Bot bot;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ResetState copy$default(ResetState resetState, Bot bot, int i, Object obj) {
        if ((i & 1) != 0) {
            bot = resetState.bot;
        }
        return resetState.copy(bot);
    }

    public final Bot component1() {
        return this.bot;
    }

    public final ResetState copy(Bot bot) {
        return new ResetState(bot);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetState) && Intrinsics.areEqual(this.bot, ((ResetState) obj).bot);
    }

    public int hashCode() {
        Bot bot = this.bot;
        if (bot == null) {
            return 0;
        }
        return bot.hashCode();
    }

    public String toString() {
        Bot bot = this.bot;
        return "ResetState(bot=" + bot + ")";
    }

    /* compiled from: ResetState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetState$Companion;", "", "()V", "empty", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/reset/ResetState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ResetState empty() {
            return new ResetState(null);
        }
    }

    public ResetState(Bot bot) {
        this.bot = bot;
    }

    public final Bot getBot() {
        return this.bot;
    }
}
