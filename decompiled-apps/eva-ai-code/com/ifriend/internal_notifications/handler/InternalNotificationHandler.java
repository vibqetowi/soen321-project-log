package com.ifriend.internal_notifications.handler;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ifriend.internal_notifications.notification.InternalNotification;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InternalNotificationHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0018\u001a\u00020\u000eH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "", "()V", "value", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;", "state", "getState", "()Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;", "setState", "(Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;)V", "stateListeners", "", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$OnStateChangedListener;", RemoteConfigComponent.ACTIVATE_FILE_NAME, "", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "deactivate", "handle", "", "notification", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "isReadyToHandleEvents", "removeListener", "terminate", "OnStateChangedListener", "State", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InternalNotificationHandler {
    private State state = State.ACTIVATED;
    private final Set<OnStateChangedListener> stateListeners = new LinkedHashSet();

    /* compiled from: InternalNotificationHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$OnStateChangedListener;", "", "onStateChanged", "", "newState", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface OnStateChangedListener {
        void onStateChanged(State state);
    }

    public abstract boolean handle(InternalNotification internalNotification);

    public final State getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setState(State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.state == value) {
            return;
        }
        this.state = value;
        for (OnStateChangedListener onStateChangedListener : this.stateListeners) {
            onStateChangedListener.onStateChanged(value);
        }
    }

    public final void addListener(OnStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.stateListeners.add(listener);
    }

    public final void removeListener(OnStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.stateListeners.remove(listener);
    }

    public final boolean isReadyToHandleEvents() {
        return this.state == State.ACTIVATED;
    }

    public void deactivate() {
        setState(State.DEACTIVATED);
    }

    public void activate() {
        setState(State.ACTIVATED);
    }

    public void terminate() {
        setState(State.TERMINATED);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InternalNotificationHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;", "", "(Ljava/lang/String;I)V", "ACTIVATED", "DEACTIVATED", "TERMINATED", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVATED = new State("ACTIVATED", 0);
        public static final State DEACTIVATED = new State("DEACTIVATED", 1);
        public static final State TERMINATED = new State("TERMINATED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ACTIVATED, DEACTIVATED, TERMINATED};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        private State(String str, int i) {
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
