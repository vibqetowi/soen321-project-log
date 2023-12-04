package io.sentry.android.core;
/* loaded from: classes4.dex */
interface IHandler {
    Thread getThread();

    void post(Runnable runnable);
}
