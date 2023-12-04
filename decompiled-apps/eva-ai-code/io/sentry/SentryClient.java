package io.sentry;

import io.sentry.ISentryClient;
import io.sentry.Scope;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransport;
import io.sentry.util.ApplyScopeUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryClient implements ISentryClient {
    static final String SENTRY_PROTOCOL_VERSION = "7";
    private final SentryOptions options;
    private final SecureRandom random;
    private final ITransport transport;
    private final SortBreadcrumbsByDate sortBreadcrumbsByDate = new SortBreadcrumbsByDate();
    private boolean enabled = true;

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        SentryId captureEnvelope;
        captureEnvelope = captureEnvelope(sentryEnvelope, null);
        return captureEnvelope;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        SentryId captureEvent;
        captureEvent = captureEvent(sentryEvent, null, null);
        return captureEvent;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent, Scope scope) {
        SentryId captureEvent;
        captureEvent = captureEvent(sentryEvent, scope, null);
        return captureEvent;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        SentryId captureEvent;
        captureEvent = captureEvent(sentryEvent, null, obj);
        return captureEvent;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureException(Throwable th) {
        SentryId captureException;
        captureException = captureException(th, null, null);
        return captureException;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureException(Throwable th, Scope scope) {
        SentryId captureException;
        captureException = captureException(th, scope, null);
        return captureException;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureException(Throwable th, Scope scope, Object obj) {
        SentryId captureEvent;
        captureEvent = captureEvent(new SentryEvent(th), scope, obj);
        return captureEvent;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureException(Throwable th, Object obj) {
        SentryId captureException;
        captureException = captureException(th, null, obj);
        return captureException;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureMessage(String str, SentryLevel sentryLevel) {
        SentryId captureMessage;
        captureMessage = captureMessage(str, sentryLevel, null);
        return captureMessage;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureMessage(String str, SentryLevel sentryLevel, Scope scope) {
        return ISentryClient.CC.$default$captureMessage(this, str, sentryLevel, scope);
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ void captureSession(Session session) {
        captureSession(session, null);
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction) {
        SentryId captureTransaction;
        captureTransaction = captureTransaction(sentryTransaction, null, null, null);
        return captureTransaction;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, Scope scope, Object obj) {
        SentryId captureTransaction;
        captureTransaction = captureTransaction(sentryTransaction, null, scope, obj);
        return captureTransaction;
    }

    @Override // io.sentry.ISentryClient
    public /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState) {
        SentryId captureTransaction;
        captureTransaction = captureTransaction(sentryTransaction, traceState, null, null);
        return captureTransaction;
    }

    @Override // io.sentry.ISentryClient
    public boolean isEnabled() {
        return this.enabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SentryClient(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        ITransportFactory transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof NoOpTransportFactory) {
            transportFactory = new AsyncHttpTransportFactory();
            sentryOptions.setTransportFactory(transportFactory);
        }
        this.transport = transportFactory.create(sentryOptions, new RequestDetailsResolver(sentryOptions).resolve());
        this.random = sentryOptions.getSampleRate() != null ? new SecureRandom() : null;
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Object obj) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", sentryBaseEvent.getEventId());
        return false;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj) {
        Session session;
        Objects.requireNonNull(sentryEvent, "SentryEvent is required.");
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing event: %s", sentryEvent.getEventId());
        if (shouldApplyScopeData(sentryEvent, obj) && (sentryEvent = applyScope(sentryEvent, scope, obj)) == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by applyScope", new Object[0]);
            return SentryId.EMPTY_ID;
        }
        SentryEvent processEvent = processEvent(sentryEvent, obj, this.options.getEventProcessors());
        TraceState traceState = null;
        if (processEvent != null) {
            session = updateSessionData(processEvent, obj, scope);
            if (!sample()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event %s was dropped due to sampling decision.", processEvent.getEventId());
                processEvent = null;
            }
        } else {
            session = null;
        }
        if (processEvent != null) {
            if (processEvent.getThrowable() != null && this.options.containsIgnoredExceptionForType(processEvent.getThrowable())) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped as the exception %s is ignored", processEvent.getThrowable().getClass());
                return SentryId.EMPTY_ID;
            }
            processEvent = executeBeforeSend(processEvent, obj);
            if (processEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by beforeSend", new Object[0]);
            }
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        if (processEvent != null && processEvent.getEventId() != null) {
            sentryId = processEvent.getEventId();
        }
        if (scope != null) {
            try {
                if (scope.getTransaction() != null) {
                    traceState = scope.getTransaction().traceState();
                }
            } catch (IOException e) {
                this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing event %s failed.", sentryId);
                return SentryId.EMPTY_ID;
            }
        }
        SentryEnvelope buildEnvelope = buildEnvelope(processEvent, getAttachmentsFromScope(scope), session, traceState);
        if (buildEnvelope != null) {
            this.transport.send(buildEnvelope, obj);
            return sentryId;
        }
        return sentryId;
    }

    private List<Attachment> getAttachmentsFromScope(Scope scope) {
        if (scope != null) {
            return scope.getAttachments();
        }
        return null;
    }

    private SentryEnvelope buildEnvelope(SentryBaseEvent sentryBaseEvent, List<Attachment> list, Session session, TraceState traceState) throws IOException {
        SentryId sentryId;
        ArrayList arrayList = new ArrayList();
        if (sentryBaseEvent != null) {
            arrayList.add(SentryEnvelopeItem.fromEvent(this.options.getSerializer(), sentryBaseEvent));
            sentryId = sentryBaseEvent.getEventId();
        } else {
            sentryId = null;
        }
        if (session != null) {
            arrayList.add(SentryEnvelopeItem.fromSession(this.options.getSerializer(), session));
        }
        if (list != null) {
            for (Attachment attachment : list) {
                arrayList.add(SentryEnvelopeItem.fromAttachment(attachment, this.options.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new SentryEnvelope(new SentryEnvelopeHeader(sentryId, this.options.getSdkVersion(), traceState), arrayList);
    }

    private SentryEvent processEvent(SentryEvent sentryEvent, Object obj, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryEvent = next.process(sentryEvent, obj);
                continue;
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing event by processor: %s", next.getClass().getName());
                continue;
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                break;
            }
        }
        return sentryEvent;
    }

    private SentryTransaction processTransaction(SentryTransaction sentryTransaction, Object obj, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryTransaction = next.process(sentryTransaction, obj);
                continue;
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
                continue;
            }
            if (sentryTransaction == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                break;
            }
        }
        return sentryTransaction;
    }

    @Override // io.sentry.ISentryClient
    public void captureUserFeedback(UserFeedback userFeedback) {
        Objects.requireNonNull(userFeedback, "SentryEvent is required.");
        if (SentryId.EMPTY_ID.equals(userFeedback.getEventId())) {
            this.options.getLogger().log(SentryLevel.WARNING, "Capturing userFeedback without a Sentry Id.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing userFeedback: %s", userFeedback.getEventId());
        try {
            this.transport.send(buildEnvelope(userFeedback));
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing user feedback %s failed.", userFeedback.getEventId());
        }
    }

    private SentryEnvelope buildEnvelope(UserFeedback userFeedback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromUserFeedback(this.options.getSerializer(), userFeedback));
        return new SentryEnvelope(new SentryEnvelopeHeader(userFeedback.getEventId(), this.options.getSdkVersion()), arrayList);
    }

    Session updateSessionData(final SentryEvent sentryEvent, final Object obj, Scope scope) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            if (scope != null) {
                return scope.withSession(new Scope.IWithSession() { // from class: io.sentry.SentryClient$$ExternalSyntheticLambda0
                    @Override // io.sentry.Scope.IWithSession
                    public final void accept(Session session) {
                        SentryClient.this.m7246lambda$updateSessionData$0$iosentrySentryClient(sentryEvent, obj, session);
                    }
                });
            }
            this.options.getLogger().log(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$updateSessionData$0$io-sentry-SentryClient  reason: not valid java name */
    public /* synthetic */ void m7246lambda$updateSessionData$0$iosentrySentryClient(SentryEvent sentryEvent, Object obj, Session session) {
        boolean z = false;
        if (session != null) {
            String str = null;
            Session.State state = sentryEvent.isCrashed() ? Session.State.Crashed : null;
            z = (Session.State.Crashed == state || sentryEvent.isErrored()) ? true : true;
            if (sentryEvent.getRequest() != null && sentryEvent.getRequest().getHeaders() != null && sentryEvent.getRequest().getHeaders().containsKey("user-agent")) {
                str = sentryEvent.getRequest().getHeaders().get("user-agent");
            }
            if (session.update(state, str, z) && (obj instanceof DiskFlushNotification)) {
                session.end();
                return;
            }
            return;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    @Override // io.sentry.ISentryClient
    public void captureSession(Session session, Object obj) {
        Objects.requireNonNull(session, "Session is required.");
        if (session.getRelease() == null || session.getRelease().isEmpty()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            captureEnvelope(SentryEnvelope.from(this.options.getSerializer(), session, this.options.getSdkVersion()), obj);
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        try {
            this.transport.send(sentryEnvelope, obj);
            SentryId eventId = sentryEnvelope.getHeader().getEventId();
            return eventId != null ? eventId : SentryId.EMPTY_ID;
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope.", e);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Scope scope, Object obj) {
        Objects.requireNonNull(sentryTransaction, "Transaction is required.");
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing transaction: %s", sentryTransaction.getEventId());
        SentryId sentryId = SentryId.EMPTY_ID;
        if (sentryTransaction.getEventId() != null) {
            sentryId = sentryTransaction.getEventId();
        }
        if (shouldApplyScopeData(sentryTransaction, obj)) {
            sentryTransaction = (SentryTransaction) applyScope(sentryTransaction, scope);
            if (sentryTransaction != null && scope != null) {
                sentryTransaction = processTransaction(sentryTransaction, obj, scope.getEventProcessors());
            }
            if (sentryTransaction == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (sentryTransaction != null) {
            sentryTransaction = processTransaction(sentryTransaction, obj, this.options.getEventProcessors());
        }
        if (sentryTransaction == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return SentryId.EMPTY_ID;
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(sentryTransaction, filterForTransaction(getAttachmentsFromScope(scope)), null, traceState);
            if (buildEnvelope != null) {
                this.transport.send(buildEnvelope, obj);
            } else {
                sentryId = SentryId.EMPTY_ID;
            }
            return sentryId;
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing transaction %s failed.", sentryId);
            return SentryId.EMPTY_ID;
        }
    }

    private List<Attachment> filterForTransaction(List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Attachment attachment : list) {
            if (attachment.isAddToTransactions()) {
                arrayList.add(attachment);
            }
        }
        return arrayList;
    }

    private SentryEvent applyScope(SentryEvent sentryEvent, Scope scope, Object obj) {
        if (scope != null) {
            applyScope(sentryEvent, scope);
            if (sentryEvent.getTransaction() == null) {
                sentryEvent.setTransaction(scope.getTransactionName());
            }
            if (sentryEvent.getFingerprints() == null) {
                sentryEvent.setFingerprints(scope.getFingerprint());
            }
            if (scope.getLevel() != null) {
                sentryEvent.setLevel(scope.getLevel());
            }
            ISpan span = scope.getSpan();
            if (sentryEvent.getContexts().getTrace() == null && span != null) {
                sentryEvent.getContexts().setTrace(span.getSpanContext());
            }
            return processEvent(sentryEvent, obj, scope.getEventProcessors());
        }
        return sentryEvent;
    }

    private <T extends SentryBaseEvent> T applyScope(T t, Scope scope) {
        if (scope != null) {
            if (t.getRequest() == null) {
                t.setRequest(scope.getRequest());
            }
            if (t.getUser() == null) {
                t.setUser(scope.getUser());
            }
            if (t.getTags() == null) {
                t.setTags(new HashMap(scope.getTags()));
            } else {
                for (Map.Entry<String, String> entry : scope.getTags().entrySet()) {
                    if (!t.getTags().containsKey(entry.getKey())) {
                        t.getTags().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t.getBreadcrumbs() == null) {
                t.setBreadcrumbs(new ArrayList(scope.getBreadcrumbs()));
            } else {
                sortBreadcrumbsByDate(t, scope.getBreadcrumbs());
            }
            if (t.getExtras() == null) {
                t.setExtras(new HashMap(scope.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : scope.getExtras().entrySet()) {
                    if (!t.getExtras().containsKey(entry2.getKey())) {
                        t.getExtras().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Contexts contexts = t.getContexts();
            for (Map.Entry<String, Object> entry3 : new Contexts(scope.getContexts()).entrySet()) {
                if (!contexts.containsKey(entry3.getKey())) {
                    contexts.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t;
    }

    private void sortBreadcrumbsByDate(SentryBaseEvent sentryBaseEvent, Collection<Breadcrumb> collection) {
        List<Breadcrumb> breadcrumbs = sentryBaseEvent.getBreadcrumbs();
        if (breadcrumbs == null || collection.isEmpty()) {
            return;
        }
        breadcrumbs.addAll(collection);
        Collections.sort(breadcrumbs, this.sortBreadcrumbsByDate);
    }

    private SentryEvent executeBeforeSend(SentryEvent sentryEvent, Object obj) {
        SentryOptions.BeforeSendCallback beforeSend = this.options.getBeforeSend();
        if (beforeSend != null) {
            try {
                return beforeSend.execute(sentryEvent, obj);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
                Breadcrumb breadcrumb = new Breadcrumb();
                breadcrumb.setMessage("BeforeSend callback failed.");
                breadcrumb.setCategory("SentryClient");
                breadcrumb.setLevel(SentryLevel.ERROR);
                if (th.getMessage() != null) {
                    breadcrumb.setData("sentry:message", th.getMessage());
                }
                sentryEvent.addBreadcrumb(breadcrumb);
                return sentryEvent;
            }
        }
        return sentryEvent;
    }

    @Override // io.sentry.ISentryClient
    public void close() {
        this.options.getLogger().log(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        try {
            flush(this.options.getShutdownTimeout());
            this.transport.close();
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e);
        }
        for (EventProcessor eventProcessor : this.options.getEventProcessors()) {
            if (eventProcessor instanceof Closeable) {
                try {
                    ((Closeable) eventProcessor).close();
                } catch (IOException e2) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the event processor {}.", eventProcessor, e2);
                }
            }
        }
        this.enabled = false;
    }

    @Override // io.sentry.ISentryClient
    public void flush(long j) {
        this.transport.flush(j);
    }

    private boolean sample() {
        return this.options.getSampleRate() == null || this.random == null || this.options.getSampleRate().doubleValue() >= this.random.nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SortBreadcrumbsByDate implements Comparator<Breadcrumb> {
        private SortBreadcrumbsByDate() {
        }

        @Override // java.util.Comparator
        public int compare(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
            return breadcrumb.getTimestamp().compareTo(breadcrumb2.getTimestamp());
        }
    }
}
