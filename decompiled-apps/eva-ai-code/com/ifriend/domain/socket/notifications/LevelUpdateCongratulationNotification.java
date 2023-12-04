package com.ifriend.domain.socket.notifications;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LevelUpdateCongratulationNotification.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/socket/notifications/LevelUpdateCongratulationNotification;", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "newLevel", "", "(I)V", "getNewLevel", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelUpdateCongratulationNotification extends InternalNotification {
    private final int newLevel;

    public static /* synthetic */ LevelUpdateCongratulationNotification copy$default(LevelUpdateCongratulationNotification levelUpdateCongratulationNotification, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = levelUpdateCongratulationNotification.newLevel;
        }
        return levelUpdateCongratulationNotification.copy(i);
    }

    public final int component1() {
        return this.newLevel;
    }

    public final LevelUpdateCongratulationNotification copy(int i) {
        return new LevelUpdateCongratulationNotification(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LevelUpdateCongratulationNotification) && this.newLevel == ((LevelUpdateCongratulationNotification) obj).newLevel;
    }

    public int hashCode() {
        return this.newLevel;
    }

    public String toString() {
        int i = this.newLevel;
        return "LevelUpdateCongratulationNotification(newLevel=" + i + ")";
    }

    public final int getNewLevel() {
        return this.newLevel;
    }

    public LevelUpdateCongratulationNotification(int i) {
        super(new HandlingStrategy.WaitUntilHandledWithTTL(0, 0L, 3, null));
        this.newLevel = i;
    }
}
