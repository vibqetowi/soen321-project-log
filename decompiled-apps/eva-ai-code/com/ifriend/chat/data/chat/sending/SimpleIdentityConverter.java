package com.ifriend.chat.data.chat.sending;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/SimpleIdentityConverter;", "", "()V", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleIdentityConverter {
    public static final Companion Companion = new Companion(null);
    private static final long SystemIdMod = 100;
    private static final long SystemIdMultiplier = 10000000000L;

    /* compiled from: ChatMessagesRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/SimpleIdentityConverter$Companion;", "", "()V", "SystemIdMod", "", "SystemIdMultiplier", "convertToDBID", "", "fromClientId", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String convertToDBID(String fromClientId) {
            Intrinsics.checkNotNullParameter(fromClientId, "fromClientId");
            long parseLong = Long.parseLong(fromClientId);
            return String.valueOf(((parseLong % 100) * 10000000000L) + (parseLong / 100));
        }
    }
}
