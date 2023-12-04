package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.sessions.api.SessionSubscriber;
/* loaded from: classes7.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {
    private String appQualitySessionId = null;
    private final DataCollectionArbiter dataCollectionArbiter;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter) {
        this.dataCollectionArbiter = dataCollectionArbiter;
    }

    public String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(SessionSubscriber.SessionDetails sessionDetails) {
        Logger logger = Logger.getLogger();
        logger.d("App Quality Sessions session changed: " + sessionDetails);
        this.appQualitySessionId = sessionDetails.getSessionId();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }
}
