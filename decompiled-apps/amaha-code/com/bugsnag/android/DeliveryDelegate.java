package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DeliveryDelegate extends BaseObservable {
    static long DELIVERY_TIMEOUT = 3000;
    final BackgroundTaskService backgroundTaskService;
    private final CallbackState callbackState;
    private final EventStore eventStore;
    private final ImmutableConfig immutableConfig;
    final Logger logger;
    private final Notifier notifier;

    /* renamed from: com.bugsnag.android.DeliveryDelegate$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
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

    public DeliveryDelegate(Logger logger, EventStore eventStore, ImmutableConfig immutableConfig, CallbackState callbackState, Notifier notifier, BackgroundTaskService backgroundTaskService) {
        this.logger = logger;
        this.eventStore = eventStore;
        this.immutableConfig = immutableConfig;
        this.callbackState = callbackState;
        this.notifier = notifier;
        this.backgroundTaskService = backgroundTaskService;
    }

    private void cacheAndSendSynchronously(Event event) {
        long currentTimeMillis = System.currentTimeMillis() + DELIVERY_TIMEOUT;
        Future<String> writeAndDeliver = this.eventStore.writeAndDeliver(event);
        long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
        if (writeAndDeliver != null && currentTimeMillis2 > 0) {
            try {
                writeAndDeliver.get(currentTimeMillis2, TimeUnit.MILLISECONDS);
            } catch (Exception e10) {
                this.logger.w("failed to immediately deliver event", e10);
            }
            if (!writeAndDeliver.isDone()) {
                writeAndDeliver.cancel(true);
            }
        }
    }

    private void cacheEvent(Event event, boolean z10) {
        this.eventStore.write(event);
        if (z10) {
            this.eventStore.flushAsync();
        }
    }

    private void deliverPayloadAsync(final Event event, final EventPayload eventPayload) {
        try {
            this.backgroundTaskService.submitTask(TaskType.ERROR_REQUEST, new Runnable() { // from class: com.bugsnag.android.DeliveryDelegate.1
                @Override // java.lang.Runnable
                public void run() {
                    DeliveryDelegate.this.deliverPayloadInternal(eventPayload, event);
                }
            });
        } catch (RejectedExecutionException unused) {
            cacheEvent(event, false);
            this.logger.w("Exceeded max queue count, saving to disk to send later");
        }
    }

    public void deliver(Event event) {
        this.logger.d("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        Session session = event.getSession();
        if (session != null) {
            if (event.isUnhandled()) {
                event.setSession(session.incrementUnhandledAndCopy());
                updateState(StateEvent.NotifyUnhandled.INSTANCE);
            } else {
                event.setSession(session.incrementHandledAndCopy());
                updateState(StateEvent.NotifyHandled.INSTANCE);
            }
        }
        if (event.getImpl().getOriginalUnhandled()) {
            boolean equals = "unhandledPromiseRejection".equals(event.getImpl().getSeverityReasonType());
            if (!event.getImpl().isAnr(event) && !equals) {
                if (this.immutableConfig.getAttemptDeliveryOnCrash()) {
                    cacheAndSendSynchronously(event);
                    return;
                } else {
                    cacheEvent(event, false);
                    return;
                }
            }
            cacheEvent(event, true);
        } else if (this.callbackState.runOnSendTasks(event, this.logger)) {
            deliverPayloadAsync(event, new EventPayload(event.getApiKey(), event, this.notifier, this.immutableConfig));
        }
    }

    public DeliveryStatus deliverPayloadInternal(EventPayload eventPayload, Event event) {
        this.logger.d("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        DeliveryStatus deliver = this.immutableConfig.getDelivery().deliver(eventPayload, this.immutableConfig.getErrorApiDeliveryParams(eventPayload));
        int i6 = AnonymousClass2.$SwitchMap$com$bugsnag$android$DeliveryStatus[deliver.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    this.logger.w("Problem sending event to Bugsnag");
                }
            } else {
                this.logger.w("Could not send event(s) to Bugsnag, saving to disk to send later");
                cacheEvent(event, false);
            }
        } else {
            this.logger.i("Sent 1 new event to Bugsnag");
        }
        return deliver;
    }
}
