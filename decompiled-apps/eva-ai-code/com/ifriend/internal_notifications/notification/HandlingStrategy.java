package com.ifriend.internal_notifications.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.logging.LogFactory;
/* compiled from: HandlingStrategy.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0004\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifriend/internal_notifications/notification/HandlingStrategy;", "", LogFactory.PRIORITY_KEY, "", "ttlInMillis", "", "(IJ)V", "getPriority", "()I", "getTtlInMillis", "()J", "Companion", "FireAndForged", "WaitUntilHandled", "WaitUntilHandledWithTTL", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy$FireAndForged;", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy$WaitUntilHandled;", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy$WaitUntilHandledWithTTL;", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class HandlingStrategy {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TTL = 10000;
    public static final int HIGH_PRIORITY = 6;
    public static final int LOW_PRIORITY = 4;
    public static final int NORMAL_PRIORITY = 5;
    private final int priority;
    private final long ttlInMillis;

    public /* synthetic */ HandlingStrategy(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j);
    }

    private HandlingStrategy(int i, long j) {
        this.priority = i;
        this.ttlInMillis = j;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final long getTtlInMillis() {
        return this.ttlInMillis;
    }

    /* compiled from: HandlingStrategy.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/internal_notifications/notification/HandlingStrategy$Companion;", "", "()V", "DEFAULT_TTL", "", "HIGH_PRIORITY", "", "LOW_PRIORITY", "NORMAL_PRIORITY", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: HandlingStrategy.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/internal_notifications/notification/HandlingStrategy$FireAndForged;", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy;", LogFactory.PRIORITY_KEY, "", "ttlInMillis", "", "(IJ)V", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class FireAndForged extends HandlingStrategy {
        public FireAndForged() {
            this(0, 0L, 3, null);
        }

        public /* synthetic */ FireAndForged(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? HandlingStrategy.DEFAULT_TTL : j);
        }

        public FireAndForged(int i, long j) {
            super(i, j, null);
        }
    }

    /* compiled from: HandlingStrategy.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/internal_notifications/notification/HandlingStrategy$WaitUntilHandledWithTTL;", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy;", LogFactory.PRIORITY_KEY, "", "ttlInMillis", "", "(IJ)V", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class WaitUntilHandledWithTTL extends HandlingStrategy {
        public WaitUntilHandledWithTTL() {
            this(0, 0L, 3, null);
        }

        public /* synthetic */ WaitUntilHandledWithTTL(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? HandlingStrategy.DEFAULT_TTL : j);
        }

        public WaitUntilHandledWithTTL(int i, long j) {
            super(i, j, null);
        }
    }

    /* compiled from: HandlingStrategy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/internal_notifications/notification/HandlingStrategy$WaitUntilHandled;", "Lcom/ifriend/internal_notifications/notification/HandlingStrategy;", LogFactory.PRIORITY_KEY, "", "(I)V", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class WaitUntilHandled extends HandlingStrategy {
        public WaitUntilHandled() {
            this(0, 1, null);
        }

        public /* synthetic */ WaitUntilHandled(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 5 : i);
        }

        public WaitUntilHandled(int i) {
            super(i, 0L, null);
        }
    }
}
