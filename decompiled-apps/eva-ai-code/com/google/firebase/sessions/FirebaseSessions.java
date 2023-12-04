package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import io.sentry.protocol.App;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: FirebaseSessions.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "blockingDispatcher", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/google/firebase/inject/Provider;)V", "applicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLogger;", "sessionCoordinator", "Lcom/google/firebase/sessions/SessionCoordinator;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "initiateSessionStart", "", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "(Lcom/google/firebase/sessions/SessionDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "subscriber", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "shouldCollectEvents", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FirebaseSessions {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FirebaseSessions";
    private final ApplicationInfo applicationInfo;
    private final EventGDTLogger eventGDTLogger;
    private final FirebaseApp firebaseApp;
    private final SessionCoordinator sessionCoordinator;
    private final SessionGenerator sessionGenerator;
    private final SessionsSettings sessionSettings;
    private final TimeProvider timeProvider;

    public static final FirebaseSessions getInstance() {
        return Companion.getInstance();
    }

    @JvmStatic
    public static final FirebaseSessions getInstance(FirebaseApp firebaseApp) {
        return Companion.getInstance(firebaseApp);
    }

    public FirebaseSessions(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, CoroutineDispatcher backgroundDispatcher, CoroutineDispatcher blockingDispatcher, Provider<TransportFactory> transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.firebaseApp = firebaseApp;
        ApplicationInfo applicationInfo = SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
        this.applicationInfo = applicationInfo;
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        CoroutineDispatcher coroutineDispatcher = backgroundDispatcher;
        SessionsSettings sessionsSettings = new SessionsSettings(applicationContext, blockingDispatcher, coroutineDispatcher, firebaseInstallations, applicationInfo);
        this.sessionSettings = sessionsSettings;
        Time time = new Time();
        this.timeProvider = time;
        EventGDTLogger eventGDTLogger = new EventGDTLogger(transportFactoryProvider);
        this.eventGDTLogger = eventGDTLogger;
        this.sessionCoordinator = new SessionCoordinator(firebaseInstallations, eventGDTLogger);
        SessionGenerator sessionGenerator = new SessionGenerator(shouldCollectEvents(), time, null, 4, null);
        this.sessionGenerator = sessionGenerator;
        SessionInitiator sessionInitiator = new SessionInitiator(time, coroutineDispatcher, new SessionInitiateListener() { // from class: com.google.firebase.sessions.FirebaseSessions$sessionInitiateListener$1
            @Override // com.google.firebase.sessions.SessionInitiateListener
            public Object onInitiateSession(SessionDetails sessionDetails, Continuation<? super Unit> continuation) {
                Object initiateSessionStart;
                initiateSessionStart = FirebaseSessions.this.initiateSessionStart(sessionDetails, continuation);
                return initiateSessionStart == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? initiateSessionStart : Unit.INSTANCE;
            }
        }, sessionsSettings, sessionGenerator);
        Context applicationContext2 = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(sessionInitiator.getActivityLifecycleCallbacks$com_google_firebase_firebase_sessions());
            return;
        }
        Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext2.getClass() + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }

    public final void register(SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        FirebaseSessionsDependencies.INSTANCE.register$com_google_firebase_firebase_sessions(subscriber);
        Log.d(TAG, "Registering Sessions SDK subscriber with name: " + subscriber.getSessionSubscriberName() + ", data collection enabled: " + subscriber.isDataCollectionEnabled());
        if (this.sessionGenerator.getHasGenerateSession()) {
            subscriber.onSessionChanged(new SessionSubscriber.SessionDetails(this.sessionGenerator.getCurrentSession().getSessionId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiateSessionStart(SessionDetails sessionDetails, Continuation<? super Unit> continuation) {
        FirebaseSessions$initiateSessionStart$1 firebaseSessions$initiateSessionStart$1;
        int i;
        FirebaseSessions firebaseSessions;
        Map map;
        if (continuation instanceof FirebaseSessions$initiateSessionStart$1) {
            firebaseSessions$initiateSessionStart$1 = (FirebaseSessions$initiateSessionStart$1) continuation;
            if ((firebaseSessions$initiateSessionStart$1.label & Integer.MIN_VALUE) != 0) {
                firebaseSessions$initiateSessionStart$1.label -= Integer.MIN_VALUE;
                Object obj = firebaseSessions$initiateSessionStart$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseSessions$initiateSessionStart$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                    firebaseSessions$initiateSessionStart$1.L$0 = this;
                    firebaseSessions$initiateSessionStart$1.L$1 = sessionDetails;
                    firebaseSessions$initiateSessionStart$1.label = 1;
                    obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(firebaseSessions$initiateSessionStart$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    firebaseSessions = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionDetails = (SessionDetails) firebaseSessions$initiateSessionStart$1.L$1;
                    firebaseSessions = (FirebaseSessions) firebaseSessions$initiateSessionStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (firebaseSessions.sessionSettings.getSessionsEnabled()) {
                        Log.d(TAG, "Sessions SDK disabled. Events will not be sent.");
                        return Unit.INSTANCE;
                    } else if (!firebaseSessions.sessionGenerator.getCollectEvents()) {
                        Log.d(TAG, "Sessions SDK has dropped this session due to sampling.");
                        return Unit.INSTANCE;
                    } else {
                        SessionCoordinator sessionCoordinator = firebaseSessions.sessionCoordinator;
                        SessionEvent startSession = SessionEvents.INSTANCE.startSession(firebaseSessions.firebaseApp, sessionDetails, firebaseSessions.sessionSettings);
                        firebaseSessions$initiateSessionStart$1.L$0 = null;
                        firebaseSessions$initiateSessionStart$1.L$1 = null;
                        firebaseSessions$initiateSessionStart$1.label = 3;
                        if (sessionCoordinator.attemptLoggingSessionEvent(startSession, firebaseSessions$initiateSessionStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    sessionDetails = (SessionDetails) firebaseSessions$initiateSessionStart$1.L$1;
                    firebaseSessions = (FirebaseSessions) firebaseSessions$initiateSessionStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                map = (Map) obj;
                if (!map.isEmpty()) {
                    Log.d(TAG, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                    return Unit.INSTANCE;
                }
                for (SessionSubscriber sessionSubscriber : map.values()) {
                    sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(sessionDetails.getSessionId()));
                }
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    Log.d(TAG, "Data Collection is disabled for all subscribers. Skipping this Session Event");
                    return Unit.INSTANCE;
                }
                Log.d(TAG, "Data Collection is enabled for at least one Subscriber");
                SessionsSettings sessionsSettings = firebaseSessions.sessionSettings;
                firebaseSessions$initiateSessionStart$1.L$0 = firebaseSessions;
                firebaseSessions$initiateSessionStart$1.L$1 = sessionDetails;
                firebaseSessions$initiateSessionStart$1.label = 2;
                if (sessionsSettings.updateSettings(firebaseSessions$initiateSessionStart$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (firebaseSessions.sessionSettings.getSessionsEnabled()) {
                }
            }
        }
        firebaseSessions$initiateSessionStart$1 = new FirebaseSessions$initiateSessionStart$1(this, continuation);
        Object obj2 = firebaseSessions$initiateSessionStart$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseSessions$initiateSessionStart$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        map = (Map) obj2;
        if (!map.isEmpty()) {
        }
    }

    private final boolean shouldCollectEvents() {
        return Math.random() <= this.sessionSettings.getSamplingRate();
    }

    /* compiled from: FirebaseSessions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance$annotations", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", App.TYPE, "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final FirebaseSessions getInstance() {
            return getInstance(FirebaseKt.getApp(Firebase.INSTANCE));
        }

        @JvmStatic
        public final FirebaseSessions getInstance(FirebaseApp app) {
            Intrinsics.checkNotNullParameter(app, "app");
            Object obj = app.get(FirebaseSessions.class);
            Intrinsics.checkNotNullExpressionValue(obj, "app.get(FirebaseSessions::class.java)");
            return (FirebaseSessions) obj;
        }
    }
}
