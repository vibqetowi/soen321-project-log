package com.ifriend.domain.newChat.chat.systems.sorting;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.common_entities_engine.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SortComponent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", "Lcom/ifriend/common_entities_engine/Component;", "", "()V", "compareTo", "", "other", "LoadMore", "ProcessingOrTyping", "RegularMessage", "TopDecorator", "UnconfirmedSentMessage", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$LoadMore;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$ProcessingOrTyping;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$RegularMessage;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$TopDecorator;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$UnconfirmedSentMessage;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SortComponent implements Component, Comparable<SortComponent> {
    public /* synthetic */ SortComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SortComponent() {
    }

    @Override // java.lang.Comparable
    public int compareTo(SortComponent other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = this instanceof LoadMore;
        if (z && (other instanceof LoadMore)) {
            return 0;
        }
        boolean z2 = this instanceof RegularMessage;
        if (z2 && (other instanceof RegularMessage)) {
            return Intrinsics.compare(((RegularMessage) this).getTimestamp(), ((RegularMessage) other).getTimestamp());
        }
        boolean z3 = this instanceof TopDecorator;
        if (z3 && (other instanceof TopDecorator)) {
            return ((TopDecorator) this).getDecoratable().compareTo(((TopDecorator) other).getDecoratable());
        }
        boolean z4 = this instanceof UnconfirmedSentMessage;
        if (z4 && (other instanceof UnconfirmedSentMessage)) {
            return Intrinsics.compare(((UnconfirmedSentMessage) this).getLocalCreationTimestamp(), ((UnconfirmedSentMessage) other).getLocalCreationTimestamp());
        }
        boolean z5 = this instanceof ProcessingOrTyping;
        if (z5 && (other instanceof ProcessingOrTyping)) {
            return 0;
        }
        if (!z3 || !Intrinsics.areEqual(other, ((TopDecorator) this).getDecoratable())) {
            boolean z6 = other instanceof TopDecorator;
            if (!z6 || !Intrinsics.areEqual(this, ((TopDecorator) other).getDecoratable())) {
                if (z3) {
                    TopDecorator topDecorator = (TopDecorator) this;
                    if (!Intrinsics.areEqual(other, topDecorator.getDecoratable())) {
                        return topDecorator.getDecoratable().compareTo(other);
                    }
                }
                if (z6) {
                    TopDecorator topDecorator2 = (TopDecorator) other;
                    if (!Intrinsics.areEqual(this, topDecorator2.getDecoratable())) {
                        return compareTo(topDecorator2.getDecoratable());
                    }
                }
                if (!z) {
                    if (!(other instanceof LoadMore)) {
                        if (!z2) {
                            if (!(other instanceof RegularMessage)) {
                                if (!z4) {
                                    if (!(other instanceof UnconfirmedSentMessage)) {
                                        if (!z5) {
                                            if (!(other instanceof ProcessingOrTyping)) {
                                                return 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* compiled from: SortComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$LoadMore;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LoadMore extends SortComponent {
        public static final LoadMore INSTANCE = new LoadMore();

        private LoadMore() {
            super(null);
        }
    }

    /* compiled from: SortComponent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$RegularMessage;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", AnalyticsConstants.TIMESTAMP, "", "(J)V", "getTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RegularMessage extends SortComponent {
        private final long timestamp;

        public static /* synthetic */ RegularMessage copy$default(RegularMessage regularMessage, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = regularMessage.timestamp;
            }
            return regularMessage.copy(j);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final RegularMessage copy(long j) {
            return new RegularMessage(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegularMessage) && this.timestamp == ((RegularMessage) obj).timestamp;
        }

        public int hashCode() {
            return AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp);
        }

        public String toString() {
            long j = this.timestamp;
            return "RegularMessage(timestamp=" + j + ")";
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public RegularMessage(long j) {
            super(null);
            this.timestamp = j;
        }
    }

    /* compiled from: SortComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0006\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$TopDecorator;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", "decoratable", "(Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;)V", "getDecoratable", "()Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TopDecorator extends SortComponent {
        private final SortComponent decoratable;

        public static /* synthetic */ TopDecorator copy$default(TopDecorator topDecorator, SortComponent sortComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                sortComponent = topDecorator.decoratable;
            }
            return topDecorator.copy(sortComponent);
        }

        public final SortComponent component1() {
            return this.decoratable;
        }

        public final TopDecorator copy(SortComponent decoratable) {
            Intrinsics.checkNotNullParameter(decoratable, "decoratable");
            return new TopDecorator(decoratable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TopDecorator) && Intrinsics.areEqual(this.decoratable, ((TopDecorator) obj).decoratable);
        }

        public int hashCode() {
            return this.decoratable.hashCode();
        }

        public String toString() {
            SortComponent sortComponent = this.decoratable;
            return "TopDecorator(decoratable=" + sortComponent + ")";
        }

        public final SortComponent getDecoratable() {
            return this.decoratable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopDecorator(SortComponent decoratable) {
            super(null);
            Intrinsics.checkNotNullParameter(decoratable, "decoratable");
            this.decoratable = decoratable;
        }
    }

    /* compiled from: SortComponent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$UnconfirmedSentMessage;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", "localCreationTimestamp", "", "(J)V", "getLocalCreationTimestamp", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UnconfirmedSentMessage extends SortComponent {
        private final long localCreationTimestamp;

        public static /* synthetic */ UnconfirmedSentMessage copy$default(UnconfirmedSentMessage unconfirmedSentMessage, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = unconfirmedSentMessage.localCreationTimestamp;
            }
            return unconfirmedSentMessage.copy(j);
        }

        public final long component1() {
            return this.localCreationTimestamp;
        }

        public final UnconfirmedSentMessage copy(long j) {
            return new UnconfirmedSentMessage(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnconfirmedSentMessage) && this.localCreationTimestamp == ((UnconfirmedSentMessage) obj).localCreationTimestamp;
        }

        public int hashCode() {
            return AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.localCreationTimestamp);
        }

        public String toString() {
            long j = this.localCreationTimestamp;
            return "UnconfirmedSentMessage(localCreationTimestamp=" + j + ")";
        }

        public final long getLocalCreationTimestamp() {
            return this.localCreationTimestamp;
        }

        public UnconfirmedSentMessage(long j) {
            super(null);
            this.localCreationTimestamp = j;
        }
    }

    /* compiled from: SortComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent$ProcessingOrTyping;", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortComponent;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ProcessingOrTyping extends SortComponent {
        public static final ProcessingOrTyping INSTANCE = new ProcessingOrTyping();

        private ProcessingOrTyping() {
            super(null);
        }
    }
}
