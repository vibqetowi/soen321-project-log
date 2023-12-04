package io.sentry;

import io.sentry.IHub;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import java.util.Date;
import java.util.List;
/* loaded from: classes4.dex */
public final class HubAdapter implements IHub {
    private static final HubAdapter INSTANCE = new HubAdapter();

    @Override // io.sentry.IHub
    public /* synthetic */ void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, (Object) null);
    }

    @Override // io.sentry.IHub
    public /* synthetic */ void addBreadcrumb(String str) {
        addBreadcrumb(new Breadcrumb(str));
    }

    @Override // io.sentry.IHub
    public /* synthetic */ void addBreadcrumb(String str, String str2) {
        IHub.CC.$default$addBreadcrumb(this, str, str2);
    }

    @Override // io.sentry.IHub
    public /* synthetic */ SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        SentryId captureEnvelope;
        captureEnvelope = captureEnvelope(sentryEnvelope, null);
        return captureEnvelope;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ SentryId captureEvent(SentryEvent sentryEvent) {
        SentryId captureEvent;
        captureEvent = captureEvent(sentryEvent, null);
        return captureEvent;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ SentryId captureException(Throwable th) {
        SentryId captureException;
        captureException = captureException(th, null);
        return captureException;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ SentryId captureMessage(String str) {
        SentryId captureMessage;
        captureMessage = captureMessage(str, SentryLevel.INFO);
        return captureMessage;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState) {
        SentryId captureTransaction;
        captureTransaction = captureTransaction(sentryTransaction, traceState, null);
        return captureTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ SentryId captureTransaction(SentryTransaction sentryTransaction, Object obj) {
        SentryId captureTransaction;
        captureTransaction = captureTransaction(sentryTransaction, null, obj);
        return captureTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        ITransaction startTransaction;
        startTransaction = startTransaction(transactionContext, customSamplingContext, false);
        return startTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(TransactionContext transactionContext, boolean z) {
        ITransaction startTransaction;
        startTransaction = startTransaction(transactionContext, (CustomSamplingContext) null, z);
        return startTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(String str, String str2) {
        ITransaction startTransaction;
        startTransaction = startTransaction(str, str2, (CustomSamplingContext) null);
        return startTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext) {
        ITransaction startTransaction;
        startTransaction = startTransaction(str, str2, customSamplingContext, false);
        return startTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext, boolean z) {
        ITransaction startTransaction;
        startTransaction = startTransaction(new TransactionContext(str, str2), customSamplingContext, z);
        return startTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(String str, String str2, Date date, boolean z, TransactionFinishedCallback transactionFinishedCallback) {
        ITransaction startTransaction;
        startTransaction = startTransaction(new TransactionContext(str, str2), null, false, date, z, transactionFinishedCallback);
        return startTransaction;
    }

    @Override // io.sentry.IHub
    public /* synthetic */ ITransaction startTransaction(String str, String str2, boolean z) {
        ITransaction startTransaction;
        startTransaction = startTransaction(str, str2, (CustomSamplingContext) null, z);
        return startTransaction;
    }

    private HubAdapter() {
    }

    public static HubAdapter getInstance() {
        return INSTANCE;
    }

    @Override // io.sentry.IHub
    public boolean isEnabled() {
        return Sentry.isEnabled();
    }

    @Override // io.sentry.IHub
    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return Sentry.captureEvent(sentryEvent, obj);
    }

    @Override // io.sentry.IHub
    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return Sentry.captureMessage(str, sentryLevel);
    }

    @Override // io.sentry.IHub
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return Sentry.getCurrentHub().captureEnvelope(sentryEnvelope, obj);
    }

    @Override // io.sentry.IHub
    public SentryId captureException(Throwable th, Object obj) {
        return Sentry.captureException(th, obj);
    }

    @Override // io.sentry.IHub
    public void captureUserFeedback(UserFeedback userFeedback) {
        Sentry.captureUserFeedback(userFeedback);
    }

    @Override // io.sentry.IHub
    public void startSession() {
        Sentry.startSession();
    }

    @Override // io.sentry.IHub
    public void endSession() {
        Sentry.endSession();
    }

    @Override // io.sentry.IHub
    public void close() {
        Sentry.close();
    }

    @Override // io.sentry.IHub
    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        Sentry.addBreadcrumb(breadcrumb, obj);
    }

    @Override // io.sentry.IHub
    public void setLevel(SentryLevel sentryLevel) {
        Sentry.setLevel(sentryLevel);
    }

    @Override // io.sentry.IHub
    public void setTransaction(String str) {
        Sentry.setTransaction(str);
    }

    @Override // io.sentry.IHub
    public void setUser(User user) {
        Sentry.setUser(user);
    }

    @Override // io.sentry.IHub
    public void setFingerprint(List<String> list) {
        Sentry.setFingerprint(list);
    }

    @Override // io.sentry.IHub
    public void clearBreadcrumbs() {
        Sentry.clearBreadcrumbs();
    }

    @Override // io.sentry.IHub
    public void setTag(String str, String str2) {
        Sentry.setTag(str, str2);
    }

    @Override // io.sentry.IHub
    public void removeTag(String str) {
        Sentry.removeTag(str);
    }

    @Override // io.sentry.IHub
    public void setExtra(String str, String str2) {
        Sentry.setExtra(str, str2);
    }

    @Override // io.sentry.IHub
    public void removeExtra(String str) {
        Sentry.removeExtra(str);
    }

    @Override // io.sentry.IHub
    public SentryId getLastEventId() {
        return Sentry.getLastEventId();
    }

    @Override // io.sentry.IHub
    public void pushScope() {
        Sentry.pushScope();
    }

    @Override // io.sentry.IHub
    public void popScope() {
        Sentry.popScope();
    }

    @Override // io.sentry.IHub
    public void withScope(ScopeCallback scopeCallback) {
        Sentry.withScope(scopeCallback);
    }

    @Override // io.sentry.IHub
    public void configureScope(ScopeCallback scopeCallback) {
        Sentry.configureScope(scopeCallback);
    }

    @Override // io.sentry.IHub
    public void bindClient(ISentryClient iSentryClient) {
        Sentry.bindClient(iSentryClient);
    }

    @Override // io.sentry.IHub
    public void flush(long j) {
        Sentry.flush(j);
    }

    @Override // io.sentry.IHub
    public IHub clone() {
        return Sentry.getCurrentHub().clone();
    }

    @Override // io.sentry.IHub
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Object obj) {
        return Sentry.getCurrentHub().captureTransaction(sentryTransaction, traceState, obj);
    }

    @Override // io.sentry.IHub
    public ITransaction startTransaction(TransactionContext transactionContext) {
        return Sentry.startTransaction(transactionContext);
    }

    @Override // io.sentry.IHub
    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z) {
        return Sentry.startTransaction(transactionContext, customSamplingContext, z);
    }

    @Override // io.sentry.IHub
    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date) {
        return Sentry.startTransaction(transactionContext, customSamplingContext, z, date);
    }

    @Override // io.sentry.IHub
    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, boolean z, Date date, boolean z2, TransactionFinishedCallback transactionFinishedCallback) {
        return Sentry.startTransaction(transactionContext, customSamplingContext, z, date, z2, transactionFinishedCallback);
    }

    @Override // io.sentry.IHub
    public SentryTraceHeader traceHeaders() {
        return Sentry.traceHeaders();
    }

    @Override // io.sentry.IHub
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        Sentry.getCurrentHub().setSpanContext(th, iSpan, str);
    }

    @Override // io.sentry.IHub
    public ISpan getSpan() {
        return Sentry.getCurrentHub().getSpan();
    }

    @Override // io.sentry.IHub
    public SentryOptions getOptions() {
        return Sentry.getCurrentHub().getOptions();
    }

    @Override // io.sentry.IHub
    public Boolean isCrashedLastRun() {
        return Sentry.isCrashedLastRun();
    }
}
