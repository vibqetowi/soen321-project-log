package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GeneratingBotAvatarPlaceholderState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "botName", "", "(Ljava/lang/String;)V", "getBotName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratingBotAvatarPlaceholderState extends BaseState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String botName;

    public static /* synthetic */ GeneratingBotAvatarPlaceholderState copy$default(GeneratingBotAvatarPlaceholderState generatingBotAvatarPlaceholderState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generatingBotAvatarPlaceholderState.botName;
        }
        return generatingBotAvatarPlaceholderState.copy(str);
    }

    public final String component1() {
        return this.botName;
    }

    public final GeneratingBotAvatarPlaceholderState copy(String botName) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        return new GeneratingBotAvatarPlaceholderState(botName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeneratingBotAvatarPlaceholderState) && Intrinsics.areEqual(this.botName, ((GeneratingBotAvatarPlaceholderState) obj).botName);
    }

    public int hashCode() {
        return this.botName.hashCode();
    }

    public String toString() {
        String str = this.botName;
        return "GeneratingBotAvatarPlaceholderState(botName=" + str + ")";
    }

    /* compiled from: GeneratingBotAvatarPlaceholderState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderState$Companion;", "", "()V", "empty", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GeneratingBotAvatarPlaceholderState empty() {
            return new GeneratingBotAvatarPlaceholderState("");
        }
    }

    public GeneratingBotAvatarPlaceholderState(String botName) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        this.botName = botName;
    }

    public final String getBotName() {
        return this.botName;
    }
}
