package com.ifriend.internal_notifications.handler;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.internal_notifications.handler.runner.InternalNotificationHandlerRunner;
import com.ifriend.internal_notifications.handler.runner.SimpleInternalNotificationHandlerRunner;
import com.ifriend.internal_notifications.notification.HandlingStrategy;
import com.ifriend.internal_notifications.notification.InternalNotification;
import com.ifriend.internal_notifications.register.AutoRemoveTerminatedHandlersRegister;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ComposedInternalNotificationHandler.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001-B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0018\u0010\u0007\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0096\u0001J\b\u0010)\u001a\u00020\u0015H\u0016J\u0011\u0010*\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0096\u0001J\b\u0010+\u001a\u00020\u0015H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0001H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u000f\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler;", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$OnStateChangedListener;", "Lcom/ifriend/internal_notifications/handler/InternalNotificationsQueue;", "runner", "Lcom/ifriend/internal_notifications/handler/runner/InternalNotificationHandlerRunner;", "register", "(Lcom/ifriend/internal_notifications/handler/runner/InternalNotificationHandlerRunner;Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "eventsHandlingLock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastEventId", "Ljava/util/concurrent/atomic/AtomicLong;", "manuallySetValue", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;", "notificationsQueue", "", "Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler$QueuedNotification;", "kotlin.jvm.PlatformType", "", RemoteConfigComponent.ACTIVATE_FILE_NAME, "", "addEventIntoQueue", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "cancelReadyToDisposeNotifications", "clear", "deactivate", "handle", "", "notification", "handleNextEvent", "internalHandle", "queuedNotification", "makeAllNotificationsReadyToBeHandled", "onStateChanged", "newState", ViewHierarchyConstants.TAG_KEY, "", "handler", "registeredHandlers", "terminate", "unregister", "updateInternalState", "validateHandler", "QueuedNotification", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposedInternalNotificationHandler extends InternalNotificationHandler implements InternalNotificationHandlersRegister, InternalNotificationHandler.OnStateChangedListener, InternalNotificationsQueue {
    private final ReentrantLock eventsHandlingLock;
    private final AtomicLong lastEventId;
    private InternalNotificationHandler.State manuallySetValue;
    private final List<QueuedNotification> notificationsQueue;
    private final InternalNotificationHandlersRegister register;
    private final InternalNotificationHandlerRunner runner;

    public ComposedInternalNotificationHandler() {
        this(null, null, 3, null);
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public List<InternalNotificationHandler> registeredHandlers() {
        return this.register.registeredHandlers();
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public void unregister(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.register.unregister(tag);
    }

    public /* synthetic */ ComposedInternalNotificationHandler(SimpleInternalNotificationHandlerRunner simpleInternalNotificationHandlerRunner, AutoRemoveTerminatedHandlersRegister autoRemoveTerminatedHandlersRegister, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SimpleInternalNotificationHandlerRunner() : simpleInternalNotificationHandlerRunner, (i & 2) != 0 ? new AutoRemoveTerminatedHandlersRegister(null, 1, null) : autoRemoveTerminatedHandlersRegister);
    }

    public ComposedInternalNotificationHandler(InternalNotificationHandlerRunner runner, InternalNotificationHandlersRegister register) {
        Intrinsics.checkNotNullParameter(runner, "runner");
        Intrinsics.checkNotNullParameter(register, "register");
        this.runner = runner;
        this.register = register;
        this.notificationsQueue = Collections.synchronizedList(new ArrayList());
        this.eventsHandlingLock = new ReentrantLock();
        this.lastEventId = new AtomicLong(0L);
        this.manuallySetValue = InternalNotificationHandler.State.ACTIVATED;
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
    public boolean handle(InternalNotification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        addEventIntoQueue(notification);
        handleNextEvent();
        return false;
    }

    private final void addEventIntoQueue(InternalNotification internalNotification) {
        this.notificationsQueue.add(new QueuedNotification(this.lastEventId.getAndIncrement(), System.currentTimeMillis(), true, internalNotification, false));
    }

    private final void handleNextEvent() {
        boolean z;
        Object obj;
        cancelReadyToDisposeNotifications();
        List<QueuedNotification> notificationsQueue = this.notificationsQueue;
        Intrinsics.checkNotNullExpressionValue(notificationsQueue, "notificationsQueue");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = notificationsQueue.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            QueuedNotification queuedNotification = (QueuedNotification) next;
            if ((!queuedNotification.getReadyToBeHandled() || queuedNotification.getHandling()) ? false : false) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.register.registeredHandlers()) {
            if (((InternalNotificationHandler) obj2).getState() == InternalNotificationHandler.State.ACTIVATED) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList2.isEmpty() && !arrayList4.isEmpty()) {
            z = false;
        }
        if (z) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            if (it2.hasNext()) {
                int priority = ((QueuedNotification) next2).getNotification().getHandlingStrategy().getPriority();
                do {
                    Object next3 = it2.next();
                    int priority2 = ((QueuedNotification) next3).getNotification().getHandlingStrategy().getPriority();
                    if (priority < priority2) {
                        next2 = next3;
                        priority = priority2;
                    }
                } while (it2.hasNext());
                obj = next2;
            } else {
                obj = next2;
            }
        } else {
            obj = null;
        }
        QueuedNotification queuedNotification2 = (QueuedNotification) obj;
        if (queuedNotification2 == null) {
            return;
        }
        this.runner.run(new ComposedInternalNotificationHandler$handleNextEvent$1(this, queuedNotification2));
    }

    private final void cancelReadyToDisposeNotifications() {
        List<QueuedNotification> notificationsQueue = this.notificationsQueue;
        Intrinsics.checkNotNullExpressionValue(notificationsQueue, "notificationsQueue");
        CollectionsKt.removeAll((List) notificationsQueue, (Function1) ComposedInternalNotificationHandler$cancelReadyToDisposeNotifications$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        r7.notificationsQueue.remove(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void internalHandle(QueuedNotification queuedNotification) {
        boolean z;
        ReentrantLock reentrantLock = this.eventsHandlingLock;
        reentrantLock.lock();
        try {
            if (!queuedNotification.getHandling() && this.notificationsQueue.contains(queuedNotification)) {
                boolean z2 = true;
                queuedNotification.setHandling(true);
                InternalNotification notification = queuedNotification.getNotification();
                ArrayList arrayList = new ArrayList();
                for (Object obj : CollectionsKt.reversed(this.register.registeredHandlers())) {
                    if (((InternalNotificationHandler) obj).isReadyToHandleEvents()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((InternalNotificationHandler) it.next()).handle(notification)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                boolean z3 = ((notification.getHandlingStrategy() instanceof HandlingStrategy.WaitUntilHandledWithTTL) || (notification.getHandlingStrategy() instanceof HandlingStrategy.WaitUntilHandled)) ? false : true;
                if (!z && !z3) {
                    z2 = false;
                }
                queuedNotification.setReadyToBeHandled(false);
                queuedNotification.setHandling(false);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                handleNextEvent();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public void register(String tag, InternalNotificationHandler handler) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(handler, "handler");
        validateHandler(handler);
        this.register.register(tag, handler);
        handler.addListener(this);
        updateInternalState();
        makeAllNotificationsReadyToBeHandled();
        handleNextEvent();
    }

    private final void validateHandler(InternalNotificationHandler internalNotificationHandler) {
        if (Intrinsics.areEqual(internalNotificationHandler, this)) {
            throw new IllegalArgumentException("Imposable to register handler in itself");
        }
        if (internalNotificationHandler instanceof ComposedInternalNotificationHandler) {
            throw new IllegalArgumentException("Registering ComposedInternalNotificationHandler not supported yet");
        }
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler.OnStateChangedListener
    public void onStateChanged(InternalNotificationHandler.State newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (newState == InternalNotificationHandler.State.ACTIVATED) {
            makeAllNotificationsReadyToBeHandled();
            handleNextEvent();
        }
        updateInternalState();
    }

    private final void updateInternalState() {
        boolean z;
        List<InternalNotificationHandler> registeredHandlers = this.register.registeredHandlers();
        boolean z2 = true;
        if (!(registeredHandlers instanceof Collection) || !registeredHandlers.isEmpty()) {
            Iterator<T> it = registeredHandlers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((InternalNotificationHandler) it.next()).getState() != InternalNotificationHandler.State.ACTIVATED) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2 && this.manuallySetValue == InternalNotificationHandler.State.ACTIVATED) {
            setState(InternalNotificationHandler.State.DEACTIVATED);
        } else if (this.manuallySetValue == InternalNotificationHandler.State.ACTIVATED) {
            setState(InternalNotificationHandler.State.ACTIVATED);
        }
    }

    private final void makeAllNotificationsReadyToBeHandled() {
        List<QueuedNotification> notificationsQueue = this.notificationsQueue;
        Intrinsics.checkNotNullExpressionValue(notificationsQueue, "notificationsQueue");
        for (QueuedNotification queuedNotification : notificationsQueue) {
            queuedNotification.setReadyToBeHandled(true);
        }
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
    public void activate() {
        super.activate();
        this.manuallySetValue = InternalNotificationHandler.State.ACTIVATED;
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
    public void deactivate() {
        super.deactivate();
        this.manuallySetValue = InternalNotificationHandler.State.DEACTIVATED;
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler
    public void terminate() {
        super.terminate();
        this.manuallySetValue = InternalNotificationHandler.State.TERMINATED;
    }

    /* compiled from: ComposedInternalNotificationHandler.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ifriend/internal_notifications/handler/ComposedInternalNotificationHandler$QueuedNotification;", "", "id", "", AnalyticsConstants.TIMESTAMP, "readyToBeHandled", "", "notification", "Lcom/ifriend/internal_notifications/notification/InternalNotification;", "handling", "(JJZLcom/ifriend/internal_notifications/notification/InternalNotification;Z)V", "getHandling", "()Z", "setHandling", "(Z)V", "getId", "()J", "getNotification", "()Lcom/ifriend/internal_notifications/notification/InternalNotification;", "getReadyToBeHandled", "setReadyToBeHandled", "getTimestamp", "equals", "other", "hashCode", "", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class QueuedNotification {
        private boolean handling;
        private final long id;
        private final InternalNotification notification;
        private boolean readyToBeHandled;
        private final long timestamp;

        public QueuedNotification(long j, long j2, boolean z, InternalNotification notification, boolean z2) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.id = j;
            this.timestamp = j2;
            this.readyToBeHandled = z;
            this.notification = notification;
            this.handling = z2;
        }

        public final long getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final boolean getReadyToBeHandled() {
            return this.readyToBeHandled;
        }

        public final void setReadyToBeHandled(boolean z) {
            this.readyToBeHandled = z;
        }

        public final InternalNotification getNotification() {
            return this.notification;
        }

        public final boolean getHandling() {
            return this.handling;
        }

        public final void setHandling(boolean z) {
            this.handling = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ifriend.internal_notifications.handler.ComposedInternalNotificationHandler.QueuedNotification");
                return this.id == ((QueuedNotification) obj).id;
            }
            return false;
        }

        public int hashCode() {
            return AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.id);
        }
    }

    @Override // com.ifriend.internal_notifications.handler.InternalNotificationsQueue
    public void clear() {
        this.notificationsQueue.clear();
    }
}
