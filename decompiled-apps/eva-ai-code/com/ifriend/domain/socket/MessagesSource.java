package com.ifriend.domain.socket;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessagesSource.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0006H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0011\u0010\u0005\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H&J\u0011\u0010\u0014\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSource;", "", "getAllMessages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", TtmlNode.START, "", "getLastSync", "", "getSourceEvents", "Lcom/ifriend/domain/socket/MessagesSource$SourceEvent;", "getSourceEventsOf", "type", "isRunning", "isRunningFlow", "Lkotlinx/coroutines/flow/StateFlow;", "reset", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "waitUntilRunning", "SourceEvent", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessagesSource {
    Flow<MessagesSourceMessage> getAllMessages(boolean z);

    long getLastSync();

    Flow<SourceEvent> getSourceEvents();

    Flow<SourceEvent> getSourceEventsOf(SourceEvent sourceEvent);

    boolean isRunning();

    StateFlow<Boolean> isRunningFlow();

    void reset();

    Object start(Continuation<? super Unit> continuation);

    void stop();

    Object waitUntilRunning(Continuation<? super Unit> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSource$SourceEvent;", "", "(Ljava/lang/String;I)V", "OPENED", "CLOSED", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SourceEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceEvent[] $VALUES;
        public static final SourceEvent OPENED = new SourceEvent("OPENED", 0);
        public static final SourceEvent CLOSED = new SourceEvent("CLOSED", 1);

        private static final /* synthetic */ SourceEvent[] $values() {
            return new SourceEvent[]{OPENED, CLOSED};
        }

        public static EnumEntries<SourceEvent> getEntries() {
            return $ENTRIES;
        }

        public static SourceEvent valueOf(String str) {
            return (SourceEvent) Enum.valueOf(SourceEvent.class, str);
        }

        public static SourceEvent[] values() {
            return (SourceEvent[]) $VALUES.clone();
        }

        private SourceEvent(String str, int i) {
        }

        static {
            SourceEvent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: MessagesSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow getAllMessages$default(MessagesSource messagesSource, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return messagesSource.getAllMessages(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllMessages");
        }
    }
}
