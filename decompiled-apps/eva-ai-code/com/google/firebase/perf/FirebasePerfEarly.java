package com.google.firebase.perf;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.concurrent.Executor;
/* loaded from: classes7.dex */
public class FirebasePerfEarly {
    public FirebasePerfEarly(FirebaseApp firebaseApp, FirebaseSessions firebaseSessions, StartupTime startupTime, Executor executor) {
        Context applicationContext = firebaseApp.getApplicationContext();
        ConfigResolver.getInstance().setApplicationContext(applicationContext);
        AppStateMonitor appStateMonitor = AppStateMonitor.getInstance();
        appStateMonitor.registerActivityLifecycleCallbacks(applicationContext);
        appStateMonitor.registerForAppColdStart(new FirebasePerformanceInitializer());
        if (startupTime != null) {
            AppStartTrace appStartTrace = AppStartTrace.getInstance();
            appStartTrace.registerActivityLifecycleCallbacks(applicationContext);
            executor.execute(new AppStartTrace.StartFromBackgroundRunnable(appStartTrace));
        }
        firebaseSessions.register(new SessionSubscriber() { // from class: com.google.firebase.perf.FirebasePerfEarly.1
            @Override // com.google.firebase.sessions.api.SessionSubscriber
            public boolean isDataCollectionEnabled() {
                return false;
            }

            @Override // com.google.firebase.sessions.api.SessionSubscriber
            public void onSessionChanged(SessionSubscriber.SessionDetails sessionDetails) {
                SessionManager.getInstance().updatePerfSession(PerfSession.createWithId(sessionDetails.getSessionId()));
            }

            @Override // com.google.firebase.sessions.api.SessionSubscriber
            public SessionSubscriber.Name getSessionSubscriberName() {
                return SessionSubscriber.Name.PERFORMANCE;
            }
        });
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
