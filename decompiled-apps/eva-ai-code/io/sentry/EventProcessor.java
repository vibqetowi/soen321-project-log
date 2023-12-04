package io.sentry;

import io.sentry.protocol.SentryTransaction;
/* loaded from: classes4.dex */
public interface EventProcessor {

    /* renamed from: io.sentry.EventProcessor$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static SentryEvent $default$process(EventProcessor _this, SentryEvent sentryEvent, Object obj) {
            return sentryEvent;
        }

        public static SentryTransaction $default$process(EventProcessor _this, SentryTransaction sentryTransaction, Object obj) {
            return sentryTransaction;
        }
    }

    SentryEvent process(SentryEvent sentryEvent, Object obj);

    SentryTransaction process(SentryTransaction sentryTransaction, Object obj);
}
