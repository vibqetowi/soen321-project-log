package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.GraphRequest;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SessionEventsState.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bJ0\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/appevents/SessionEventsState;", "", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "", "(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;)V", "accumulatedEventCount", "", "getAccumulatedEventCount", "()I", "accumulatedEvents", "", "Lcom/facebook/appevents/AppEvent;", "eventsToPersist", "", "getEventsToPersist", "()Ljava/util/List;", "inFlightEvents", "numSkippedEventsDueToFullBuffer", "accumulatePersistedEvents", "", "events", "addEvent", NotificationCompat.CATEGORY_EVENT, "clearInFlightAndStats", "moveToAccumulated", "", "populateRequest", "request", "Lcom/facebook/GraphRequest;", "applicationContext", "Landroid/content/Context;", "includeImplicitEvents", "limitEventUsage", "numSkipped", "Lorg/json/JSONArray;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionEventsState {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_ACCUMULATED_LOG_EVENTS;
    private static final String TAG;
    private List<AppEvent> accumulatedEvents;
    private final String anonymousAppDeviceGUID;
    private final AttributionIdentifiers attributionIdentifiers;
    private final List<AppEvent> inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;

    public SessionEventsState(AttributionIdentifiers attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = anonymousAppDeviceGUID;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    public final synchronized void addEvent(AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= MAX_ACCUMULATED_LOG_EVENTS) {
            this.numSkippedEventsDueToFullBuffer++;
        } else {
            this.accumulatedEvents.add(event);
        }
    }

    public final synchronized int getAccumulatedEventCount() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        return this.accumulatedEvents.size();
    }

    public final synchronized void clearInFlightAndStats(boolean z) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (z) {
            this.accumulatedEvents.addAll(this.inFlightEvents);
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final int populateRequest(GraphRequest request, Context applicationContext, boolean z, boolean z2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                int i = this.numSkippedEventsDueToFullBuffer;
                EventDeactivationManager eventDeactivationManager = EventDeactivationManager.INSTANCE;
                EventDeactivationManager.processEvents(this.accumulatedEvents);
                this.inFlightEvents.addAll(this.accumulatedEvents);
                this.accumulatedEvents.clear();
                JSONArray jSONArray = new JSONArray();
                for (AppEvent appEvent : this.inFlightEvents) {
                    if (appEvent.isChecksumValid()) {
                        if (z || !appEvent.isImplicit()) {
                            jSONArray.put(appEvent.getJsonObject());
                        }
                    } else {
                        Utility utility = Utility.INSTANCE;
                        Utility.logd(TAG, Intrinsics.stringPlus("Event with invalid checksum: ", appEvent));
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                Unit unit = Unit.INSTANCE;
                populateRequest(request, applicationContext, i, jSONArray, z2);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final synchronized List<AppEvent> getEventsToPersist() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        List<AppEvent> list = this.accumulatedEvents;
        this.accumulatedEvents = new ArrayList();
        return list;
    }

    public final synchronized void accumulatePersistedEvents(List<AppEvent> events) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        Intrinsics.checkNotNullParameter(events, "events");
        this.accumulatedEvents.addAll(events);
    }

    private final void populateRequest(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.INSTANCE;
                jSONObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, z, context);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.setGraphObject(jSONObject);
            Bundle parameters = graphRequest.getParameters();
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            parameters.putString("custom_events", jSONArray2);
            graphRequest.setTag(jSONArray2);
            graphRequest.setParameters(parameters);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: SessionEventsState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/SessionEventsState$Companion;", "", "()V", "MAX_ACCUMULATED_LOG_EVENTS", "", "TAG", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("SessionEventsState", "SessionEventsState::class.java.simpleName");
        TAG = "SessionEventsState";
        MAX_ACCUMULATED_LOG_EVENTS = 1000;
    }
}
