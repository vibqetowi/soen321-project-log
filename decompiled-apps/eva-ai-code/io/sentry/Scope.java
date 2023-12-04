package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.User;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes4.dex */
public final class Scope {
    private List<Attachment> attachments;
    private Queue<Breadcrumb> breadcrumbs;
    private Contexts contexts;
    private List<EventProcessor> eventProcessors;
    private Map<String, Object> extra;
    private List<String> fingerprint;
    private SentryLevel level;
    private final SentryOptions options;
    private Request request;
    private volatile Session session;
    private final Object sessionLock;
    private Map<String, String> tags;
    private ITransaction transaction;
    private final Object transactionLock;
    private String transactionName;
    private User user;

    /* loaded from: classes4.dex */
    interface IWithSession {
        void accept(Session session);
    }

    /* loaded from: classes4.dex */
    public interface IWithTransaction {
        void accept(ITransaction iTransaction);
    }

    public Scope(SentryOptions sentryOptions) {
        this.fingerprint = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.extra = new ConcurrentHashMap();
        this.eventProcessors = new CopyOnWriteArrayList();
        this.sessionLock = new Object();
        this.transactionLock = new Object();
        this.contexts = new Contexts();
        this.attachments = new CopyOnWriteArrayList();
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.options = sentryOptions2;
        this.breadcrumbs = createBreadcrumbsList(sentryOptions2.getMaxBreadcrumbs());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(Scope scope) {
        this.fingerprint = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.extra = new ConcurrentHashMap();
        this.eventProcessors = new CopyOnWriteArrayList();
        this.sessionLock = new Object();
        this.transactionLock = new Object();
        this.contexts = new Contexts();
        this.attachments = new CopyOnWriteArrayList();
        this.transaction = scope.transaction;
        this.transactionName = scope.transactionName;
        this.session = scope.session;
        this.options = scope.options;
        this.level = scope.level;
        User user = scope.user;
        this.user = user != null ? new User(user) : null;
        Request request = scope.request;
        this.request = request != null ? new Request(request) : null;
        this.fingerprint = new ArrayList(scope.fingerprint);
        this.eventProcessors = new CopyOnWriteArrayList(scope.eventProcessors);
        Queue<Breadcrumb> queue = scope.breadcrumbs;
        Queue<Breadcrumb> createBreadcrumbsList = createBreadcrumbsList(scope.options.getMaxBreadcrumbs());
        for (Breadcrumb breadcrumb : queue) {
            createBreadcrumbsList.add(new Breadcrumb(breadcrumb));
        }
        this.breadcrumbs = createBreadcrumbsList;
        Map<String, String> map = scope.tags;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.tags = concurrentHashMap;
        Map<String, Object> map2 = scope.extra;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.extra = concurrentHashMap2;
        this.contexts = new Contexts(scope.contexts);
        this.attachments = new CopyOnWriteArrayList(scope.attachments);
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public String getTransactionName() {
        ITransaction iTransaction = this.transaction;
        return iTransaction != null ? iTransaction.getName() : this.transactionName;
    }

    public void setTransaction(String str) {
        if (str != null) {
            ITransaction iTransaction = this.transaction;
            if (iTransaction != null) {
                iTransaction.setName(str);
            }
            this.transactionName = str;
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Transaction cannot be null", new Object[0]);
    }

    public ISpan getSpan() {
        Span latestActiveSpan;
        ITransaction iTransaction = this.transaction;
        return (iTransaction == null || (latestActiveSpan = iTransaction.getLatestActiveSpan()) == null) ? iTransaction : latestActiveSpan;
    }

    public void setTransaction(ITransaction iTransaction) {
        synchronized (this.transactionLock) {
            this.transaction = iTransaction;
        }
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.setUser(user);
            }
        }
    }

    public Request getRequest() {
        return this.request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> getFingerprint() {
        return this.fingerprint;
    }

    public void setFingerprint(List<String> list) {
        if (list == null) {
            return;
        }
        this.fingerprint = new ArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Queue<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    private Breadcrumb executeBeforeBreadcrumb(SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback, Breadcrumb breadcrumb, Object obj) {
        try {
            return beforeBreadcrumbCallback.execute(breadcrumb, obj);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
            if (th.getMessage() != null) {
                breadcrumb.setData("sentry:message", th.getMessage());
                return breadcrumb;
            }
            return breadcrumb;
        }
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        if (breadcrumb == null) {
            return;
        }
        SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumb = this.options.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            breadcrumb = executeBeforeBreadcrumb(beforeBreadcrumb, breadcrumb, obj);
        }
        if (breadcrumb != null) {
            this.breadcrumbs.add(breadcrumb);
            if (this.options.isEnableScopeSync()) {
                for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                    iScopeObserver.addBreadcrumb(breadcrumb);
                }
                return;
            }
            return;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
    }

    public void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, null);
    }

    public void clearBreadcrumbs() {
        this.breadcrumbs.clear();
    }

    public void clearTransaction() {
        synchronized (this.transactionLock) {
            this.transaction = null;
        }
        this.transactionName = null;
    }

    public ITransaction getTransaction() {
        return this.transaction;
    }

    public void clear() {
        this.level = null;
        this.user = null;
        this.request = null;
        this.fingerprint.clear();
        clearBreadcrumbs();
        this.tags.clear();
        this.extra.clear();
        this.eventProcessors.clear();
        clearTransaction();
        clearAttachments();
    }

    public Map<String, String> getTags() {
        return CollectionUtils.newConcurrentHashMap(this.tags);
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.setTag(str, str2);
            }
        }
    }

    public void removeTag(String str) {
        this.tags.remove(str);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.removeTag(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> getExtras() {
        return this.extra;
    }

    public void setExtra(String str, String str2) {
        this.extra.put(str, str2);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.setExtra(str, str2);
            }
        }
    }

    public void removeExtra(String str) {
        this.extra.remove(str);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.removeExtra(str);
            }
        }
    }

    public Contexts getContexts() {
        return this.contexts;
    }

    public void setContexts(String str, Object obj) {
        this.contexts.put(str, obj);
    }

    public void setContexts(String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", bool);
        setContexts(str, hashMap);
    }

    public void setContexts(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", str2);
        setContexts(str, hashMap);
    }

    public void setContexts(String str, Number number) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", number);
        setContexts(str, hashMap);
    }

    public void setContexts(String str, Collection<?> collection) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", collection);
        setContexts(str, hashMap);
    }

    public void setContexts(String str, Object[] objArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", objArr);
        setContexts(str, hashMap);
    }

    public void setContexts(String str, Character ch) {
        HashMap hashMap = new HashMap();
        hashMap.put("value", ch);
        setContexts(str, hashMap);
    }

    public void removeContexts(String str) {
        this.contexts.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Attachment> getAttachments() {
        return new CopyOnWriteArrayList(this.attachments);
    }

    public void addAttachment(Attachment attachment) {
        this.attachments.add(attachment);
    }

    public void clearAttachments() {
        this.attachments.clear();
    }

    private Queue<Breadcrumb> createBreadcrumbsList(int i) {
        return SynchronizedQueue.synchronizedQueue(new CircularFifoQueue(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Session withSession(IWithSession iWithSession) {
        Session m7250clone;
        synchronized (this.sessionLock) {
            iWithSession.accept(this.session);
            m7250clone = this.session != null ? this.session.m7250clone() : null;
        }
        return m7250clone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionPair startSession() {
        SessionPair sessionPair;
        synchronized (this.sessionLock) {
            if (this.session != null) {
                this.session.end();
            }
            Session session = this.session;
            sessionPair = null;
            if (this.options.getRelease() != null) {
                this.session = new Session(this.options.getDistinctId(), this.user, this.options.getEnvironment(), this.options.getRelease());
                sessionPair = new SessionPair(this.session.m7250clone(), session != null ? session.m7250clone() : null);
            } else {
                this.options.getLogger().log(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
        }
        return sessionPair;
    }

    /* loaded from: classes4.dex */
    static final class SessionPair {
        private final Session current;
        private final Session previous;

        public SessionPair(Session session, Session session2) {
            this.current = session;
            this.previous = session2;
        }

        public Session getPrevious() {
            return this.previous;
        }

        public Session getCurrent() {
            return this.current;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Session endSession() {
        Session session;
        synchronized (this.sessionLock) {
            session = null;
            if (this.session != null) {
                this.session.end();
                Session m7250clone = this.session.m7250clone();
                this.session = null;
                session = m7250clone;
            }
        }
        return session;
    }

    public void withTransaction(IWithTransaction iWithTransaction) {
        synchronized (this.transactionLock) {
            iWithTransaction.accept(this.transaction);
        }
    }
}
