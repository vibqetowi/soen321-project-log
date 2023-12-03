package com.bugsnag.android;

import android.os.SystemClock;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.DateUtils;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SessionTracker extends BaseObservable {
    private static final int DEFAULT_TIMEOUT_MS = 30000;
    final BackgroundTaskService backgroundTaskService;
    private final CallbackState callbackState;
    private final Client client;
    private final ImmutableConfig configuration;
    private volatile Session currentSession;
    private final Collection<String> foregroundActivities;
    private final ForegroundDetector foregroundDetector;
    private final AtomicLong lastEnteredForegroundMs;
    private final AtomicLong lastExitedForegroundMs;
    final Logger logger;
    final SessionStore sessionStore;
    private final long timeoutMs;

    /* renamed from: com.bugsnag.android.SessionTracker$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$bugsnag$android$DeliveryStatus;

        static {
            int[] iArr = new int[DeliveryStatus.values().length];
            $SwitchMap$com$bugsnag$android$DeliveryStatus = iArr;
            try {
                iArr[DeliveryStatus.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bugsnag$android$DeliveryStatus[DeliveryStatus.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bugsnag$android$DeliveryStatus[DeliveryStatus.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SessionTracker(ImmutableConfig immutableConfig, CallbackState callbackState, Client client, SessionStore sessionStore, Logger logger, BackgroundTaskService backgroundTaskService) {
        this(immutableConfig, callbackState, client, 30000L, sessionStore, logger, backgroundTaskService);
    }

    private void flushInMemorySession(final Session session) {
        try {
            this.backgroundTaskService.submitTask(TaskType.SESSION_REQUEST, new Runnable() { // from class: com.bugsnag.android.SessionTracker.2
                @Override // java.lang.Runnable
                public void run() {
                    SessionTracker.this.deliverInMemorySession(session);
                }
            });
        } catch (RejectedExecutionException unused) {
            this.sessionStore.write(session);
        }
    }

    private void notifyNdkInForeground() {
        boolean z10;
        Boolean isInForeground = isInForeground();
        if (isInForeground != null) {
            z10 = isInForeground.booleanValue();
        } else {
            z10 = false;
        }
        updateState(new StateEvent.UpdateInForeground(z10, getContextActivity()));
    }

    private void notifySessionStartObserver(Session session) {
        updateState(new StateEvent.StartSession(session.getId(), DateUtils.toIso8601(session.getStartedAt()), session.getHandledCount(), session.getUnhandledCount()));
    }

    private boolean trackSessionIfNeeded(Session session) {
        this.logger.d("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        session.setApp(this.client.getAppDataCollector().generateApp());
        session.setDevice(this.client.getDeviceDataCollector().generateDevice());
        if (!this.callbackState.runOnSessionTasks(session, this.logger) || !session.isTracked().compareAndSet(false, true)) {
            return false;
        }
        this.currentSession = session;
        notifySessionStartObserver(session);
        flushInMemorySession(session);
        flushAsync();
        return true;
    }

    public void deliverInMemorySession(Session session) {
        try {
            this.logger.d("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i6 = AnonymousClass3.$SwitchMap$com$bugsnag$android$DeliveryStatus[deliverSessionPayload(session).ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        this.logger.w("Dropping invalid session tracking payload");
                    }
                } else {
                    this.logger.w("Storing session payload for future delivery");
                    this.sessionStore.write(session);
                }
            } else {
                this.logger.d("Sent 1 new session to Bugsnag");
            }
        } catch (Exception e10) {
            this.logger.w("Session tracking payload failed", e10);
        }
    }

    public DeliveryStatus deliverSessionPayload(Session session) {
        return this.configuration.getDelivery().deliver(session, this.configuration.getSessionApiDeliveryParams());
    }

    public void flushAsync() {
        try {
            this.backgroundTaskService.submitTask(TaskType.SESSION_REQUEST, new Runnable() { // from class: com.bugsnag.android.SessionTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    SessionTracker.this.flushStoredSessions();
                }
            });
        } catch (RejectedExecutionException e10) {
            this.logger.w("Failed to flush session reports", e10);
        }
    }

    public void flushStoredSession(File file) {
        this.logger.d("SessionTracker#flushStoredSession() - attempting delivery");
        Session session = new Session(file, this.client.getNotifier(), this.logger);
        if (!session.isV2Payload()) {
            session.setApp(this.client.getAppDataCollector().generateApp());
            session.setDevice(this.client.getDeviceDataCollector().generateDevice());
        }
        int i6 = AnonymousClass3.$SwitchMap$com$bugsnag$android$DeliveryStatus[deliverSessionPayload(session).ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    this.logger.w("Deleting invalid session tracking payload");
                    this.sessionStore.deleteStoredFiles(Collections.singletonList(file));
                    return;
                }
                return;
            } else if (this.sessionStore.isTooOld(file)) {
                Logger logger = this.logger;
                logger.w("Discarding historical session (from {" + this.sessionStore.getCreationDate(file) + "}) after failed delivery");
                this.sessionStore.deleteStoredFiles(Collections.singletonList(file));
                return;
            } else {
                this.sessionStore.cancelQueuedFiles(Collections.singletonList(file));
                this.logger.w("Leaving session payload for future delivery");
                return;
            }
        }
        this.sessionStore.deleteStoredFiles(Collections.singletonList(file));
        this.logger.d("Sent 1 new session to Bugsnag");
    }

    public void flushStoredSessions() {
        for (File file : this.sessionStore.findStoredFiles()) {
            flushStoredSession(file);
        }
    }

    public String getContextActivity() {
        if (this.foregroundActivities.isEmpty()) {
            return null;
        }
        int size = this.foregroundActivities.size();
        return ((String[]) this.foregroundActivities.toArray(new String[size]))[size - 1];
    }

    public Session getCurrentSession() {
        Session session = this.currentSession;
        if (session != null && !session.isPaused.get()) {
            return session;
        }
        return null;
    }

    public long getLastEnteredForegroundMs() {
        return this.lastEnteredForegroundMs.get();
    }

    public Session incrementHandledAndCopy() {
        Session currentSession = getCurrentSession();
        if (currentSession != null) {
            return currentSession.incrementHandledAndCopy();
        }
        return null;
    }

    public Session incrementUnhandledAndCopy() {
        Session currentSession = getCurrentSession();
        if (currentSession != null) {
            return currentSession.incrementUnhandledAndCopy();
        }
        return null;
    }

    public Boolean isInForeground() {
        return this.foregroundDetector.isInForeground();
    }

    public void onActivityStarted(String str) {
        updateForegroundTracker(str, true, SystemClock.elapsedRealtime());
    }

    public void onActivityStopped(String str) {
        updateForegroundTracker(str, false, SystemClock.elapsedRealtime());
    }

    public void pauseSession() {
        Session session = this.currentSession;
        if (session != null) {
            session.isPaused.set(true);
            updateState(StateEvent.PauseSession.INSTANCE);
        }
    }

    public Session registerExistingSession(Date date, String str, User user, int i6, int i10) {
        Session session = null;
        if (this.client.getConfig().shouldDiscardSession(false)) {
            return null;
        }
        if (date != null && str != null) {
            session = new Session(str, date, user, i6, i10, this.client.getNotifier(), this.logger);
            notifySessionStartObserver(session);
        } else {
            updateState(StateEvent.PauseSession.INSTANCE);
        }
        this.currentSession = session;
        return session;
    }

    public boolean resumeSession() {
        Session session = this.currentSession;
        boolean z10 = false;
        if (session == null) {
            session = startSession(false);
        } else {
            z10 = session.isPaused.compareAndSet(true, false);
        }
        if (session != null) {
            notifySessionStartObserver(session);
        }
        return z10;
    }

    public Session startNewSession(Date date, User user, boolean z10) {
        if (this.client.getConfig().shouldDiscardSession(z10)) {
            return null;
        }
        Session session = new Session(UUID.randomUUID().toString(), date, user, z10, this.client.getNotifier(), this.logger);
        if (!trackSessionIfNeeded(session)) {
            return null;
        }
        return session;
    }

    public Session startSession(boolean z10) {
        if (this.client.getConfig().shouldDiscardSession(z10)) {
            return null;
        }
        return startNewSession(new Date(), this.client.getUser(), z10);
    }

    public void updateForegroundTracker(String str, boolean z10, long j10) {
        if (z10) {
            long j11 = j10 - this.lastExitedForegroundMs.get();
            if (this.foregroundActivities.isEmpty()) {
                this.lastEnteredForegroundMs.set(j10);
                if (j11 >= this.timeoutMs && this.configuration.getAutoTrackSessions()) {
                    startNewSession(new Date(), this.client.getUser(), true);
                }
            }
            this.foregroundActivities.add(str);
        } else {
            this.foregroundActivities.remove(str);
            if (this.foregroundActivities.isEmpty()) {
                this.lastExitedForegroundMs.set(j10);
            }
        }
        this.client.getContextState().setAutomaticContext(getContextActivity());
        notifyNdkInForeground();
    }

    public SessionTracker(ImmutableConfig immutableConfig, CallbackState callbackState, Client client, long j10, SessionStore sessionStore, Logger logger, BackgroundTaskService backgroundTaskService) {
        this.foregroundActivities = new ConcurrentLinkedQueue();
        this.lastExitedForegroundMs = new AtomicLong(0L);
        this.lastEnteredForegroundMs = new AtomicLong(0L);
        this.currentSession = null;
        this.configuration = immutableConfig;
        this.callbackState = callbackState;
        this.client = client;
        this.timeoutMs = j10;
        this.sessionStore = sessionStore;
        this.foregroundDetector = new ForegroundDetector(client.getAppContext());
        this.backgroundTaskService = backgroundTaskService;
        this.logger = logger;
        notifyNdkInForeground();
    }
}
