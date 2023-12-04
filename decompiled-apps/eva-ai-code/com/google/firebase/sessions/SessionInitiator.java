package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
/* compiled from: SessionInitiator.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\u00020\u0012X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/SessionInitiator;", "", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "sessionInitiateListener", "Lcom/google/firebase/sessions/SessionInitiateListener;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "(Lcom/google/firebase/sessions/TimeProvider;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionInitiateListener;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;)V", "activityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getActivityLifecycleCallbacks$com_google_firebase_firebase_sessions", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "backgroundTime", "Lkotlin/time/Duration;", "J", "appBackgrounded", "", "appForegrounded", "initiateSession", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionInitiator {
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private final CoroutineContext backgroundDispatcher;
    private long backgroundTime;
    private final SessionGenerator sessionGenerator;
    private final SessionInitiateListener sessionInitiateListener;
    private final SessionsSettings sessionsSettings;
    private final TimeProvider timeProvider;

    public SessionInitiator(TimeProvider timeProvider, CoroutineContext backgroundDispatcher, SessionInitiateListener sessionInitiateListener, SessionsSettings sessionsSettings, SessionGenerator sessionGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(sessionInitiateListener, "sessionInitiateListener");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.timeProvider = timeProvider;
        this.backgroundDispatcher = backgroundDispatcher;
        this.sessionInitiateListener = sessionInitiateListener;
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.backgroundTime = timeProvider.mo6772elapsedRealtimeUwyO8pc();
        initiateSession();
        this.activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.google.firebase.sessions.SessionInitiator$activityLifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                SessionInitiator.this.appForegrounded();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                SessionInitiator.this.appBackgrounded();
            }
        };
    }

    public final void appBackgrounded() {
        this.backgroundTime = this.timeProvider.mo6772elapsedRealtimeUwyO8pc();
    }

    public final void appForegrounded() {
        if (Duration.m8639compareToLRDsOJo(Duration.m8675minusLRDsOJo(this.timeProvider.mo6772elapsedRealtimeUwyO8pc(), this.backgroundTime), this.sessionsSettings.m6775getSessionRestartTimeoutUwyO8pc()) > 0) {
            initiateSession();
        }
    }

    private final void initiateSession() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new SessionInitiator$initiateSession$1(this, this.sessionGenerator.generateNewSession(), null), 3, null);
    }

    public final Application.ActivityLifecycleCallbacks getActivityLifecycleCallbacks$com_google_firebase_firebase_sessions() {
        return this.activityLifecycleCallbacks;
    }
}
