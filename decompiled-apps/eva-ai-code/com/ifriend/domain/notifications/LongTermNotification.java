package com.ifriend.domain.notifications;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LongTermNotification.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/notifications/LongTermNotification;", "", "()V", LogFactory.PRIORITY_KEY, "", "getPriority", "()I", "Companion", "Lcom/ifriend/domain/notifications/AvatarGenerated;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LongTermNotification {
    public static final int AVATAR_GENERATED_PRIORITY = 0;
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ LongTermNotification(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getPriority();

    private LongTermNotification() {
    }

    /* compiled from: LongTermNotification.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/notifications/LongTermNotification$Companion;", "", "()V", "AVATAR_GENERATED_PRIORITY", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
