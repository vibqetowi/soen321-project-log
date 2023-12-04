package com.ifriend.presentation.features.home.ui.models;

import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.logging.LogFactory;
/* compiled from: HomeChatUi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "", "avatarBadgeLabel", "", "getAvatarBadgeLabel", "()Ljava/lang/String;", "chatAvatarUri", "getChatAvatarUri", "chatId", "getChatId", "chatName", "getChatName", "isCanChatting", "", "()Z", "isVerified", "sorting", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", "getSorting", "()Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", RtspHeaders.Values.TIME, "getTime", "unreadMessagesCount", "getUnreadMessagesCount", "Sorting", "Lcom/ifriend/presentation/features/home/ui/models/HomeActiveChatUi;", "Lcom/ifriend/presentation/features/home/ui/models/HomeUnavailableChatUi;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HomeChatUi {
    String getAvatarBadgeLabel();

    String getChatAvatarUri();

    String getChatId();

    String getChatName();

    Sorting getSorting();

    String getTime();

    String getUnreadMessagesCount();

    boolean isCanChatting();

    boolean isVerified();

    /* compiled from: HomeChatUi.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi$Sorting;", "", "isPromote", "", LogFactory.PRIORITY_KEY, "", "lastMessageTimestamp", "", "unlockLevel", "(ZIJI)V", "()Z", "getLastMessageTimestamp", "()J", "getPriority", "()I", "getUnlockLevel", "compareTo", "other", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Sorting implements Comparable<Sorting> {
        public static final int $stable = 0;
        private final boolean isPromote;
        private final long lastMessageTimestamp;
        private final int priority;
        private final int unlockLevel;

        public static /* synthetic */ Sorting copy$default(Sorting sorting, boolean z, int i, long j, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = sorting.isPromote;
            }
            if ((i3 & 2) != 0) {
                i = sorting.priority;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                j = sorting.lastMessageTimestamp;
            }
            long j2 = j;
            if ((i3 & 8) != 0) {
                i2 = sorting.unlockLevel;
            }
            return sorting.copy(z, i4, j2, i2);
        }

        public final boolean component1() {
            return this.isPromote;
        }

        public final int component2() {
            return this.priority;
        }

        public final long component3() {
            return this.lastMessageTimestamp;
        }

        public final int component4() {
            return this.unlockLevel;
        }

        public final Sorting copy(boolean z, int i, long j, int i2) {
            return new Sorting(z, i, j, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Sorting) {
                Sorting sorting = (Sorting) obj;
                return this.isPromote == sorting.isPromote && this.priority == sorting.priority && this.lastMessageTimestamp == sorting.lastMessageTimestamp && this.unlockLevel == sorting.unlockLevel;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z = this.isPromote;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((r0 * 31) + this.priority) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.lastMessageTimestamp)) * 31) + this.unlockLevel;
        }

        public String toString() {
            boolean z = this.isPromote;
            int i = this.priority;
            long j = this.lastMessageTimestamp;
            int i2 = this.unlockLevel;
            return "Sorting(isPromote=" + z + ", priority=" + i + ", lastMessageTimestamp=" + j + ", unlockLevel=" + i2 + ")";
        }

        public Sorting(boolean z, int i, long j, int i2) {
            this.isPromote = z;
            this.priority = i;
            this.lastMessageTimestamp = j;
            this.unlockLevel = i2;
        }

        public /* synthetic */ Sorting(boolean z, int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, j, i2);
        }

        public final boolean isPromote() {
            return this.isPromote;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final long getLastMessageTimestamp() {
            return this.lastMessageTimestamp;
        }

        public final int getUnlockLevel() {
            return this.unlockLevel;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sorting other) {
            Intrinsics.checkNotNullParameter(other, "other");
            final Comparator comparator = new Comparator() { // from class: com.ifriend.presentation.features.home.ui.models.HomeChatUi$Sorting$compareTo$$inlined$compareByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(((HomeChatUi.Sorting) t2).isPromote()), Boolean.valueOf(((HomeChatUi.Sorting) t).isPromote()));
                }
            };
            final Comparator comparator2 = new Comparator() { // from class: com.ifriend.presentation.features.home.ui.models.HomeChatUi$Sorting$compareTo$$inlined$thenByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compare = comparator.compare(t, t2);
                    return compare != 0 ? compare : ComparisonsKt.compareValues(Long.valueOf(((HomeChatUi.Sorting) t2).getLastMessageTimestamp()), Long.valueOf(((HomeChatUi.Sorting) t).getLastMessageTimestamp()));
                }
            };
            final Comparator comparator3 = new Comparator() { // from class: com.ifriend.presentation.features.home.ui.models.HomeChatUi$Sorting$compareTo$$inlined$thenByDescending$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compare = comparator2.compare(t, t2);
                    return compare != 0 ? compare : ComparisonsKt.compareValues(Integer.valueOf(((HomeChatUi.Sorting) t2).getPriority()), Integer.valueOf(((HomeChatUi.Sorting) t).getPriority()));
                }
            };
            return new Comparator() { // from class: com.ifriend.presentation.features.home.ui.models.HomeChatUi$Sorting$compareTo$$inlined$thenBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compare = comparator3.compare(t, t2);
                    return compare != 0 ? compare : ComparisonsKt.compareValues(Integer.valueOf(((HomeChatUi.Sorting) t).getUnlockLevel()), Integer.valueOf(((HomeChatUi.Sorting) t2).getUnlockLevel()));
                }
            }.compare(this, other);
        }
    }
}
