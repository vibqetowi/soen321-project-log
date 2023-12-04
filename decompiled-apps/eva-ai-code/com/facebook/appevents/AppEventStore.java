package com.facebook.appevents;

import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppEventStore.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/AppEventStore;", "", "()V", "TAG", "", "persistEvents", "", "accessTokenAppIdPair", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "appEvents", "Lcom/facebook/appevents/SessionEventsState;", "eventsToPersist", "Lcom/facebook/appevents/AppEventCollection;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventStore {
    public static final AppEventStore INSTANCE = new AppEventStore();
    private static final String TAG;

    private AppEventStore() {
    }

    static {
        String name = AppEventStore.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventStore::class.java.name");
        TAG = name;
    }

    @JvmStatic
    public static final synchronized void persistEvents(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState appEvents) {
        synchronized (AppEventStore.class) {
            if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
                return;
            }
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
            AppEventUtility.assertIsNotMainThread();
            AppEventDiskStore appEventDiskStore = AppEventDiskStore.INSTANCE;
            PersistedEvents readAndClearStore = AppEventDiskStore.readAndClearStore();
            readAndClearStore.addEvents(accessTokenAppIdPair, appEvents.getEventsToPersist());
            AppEventDiskStore appEventDiskStore2 = AppEventDiskStore.INSTANCE;
            AppEventDiskStore.saveEventsToDisk$facebook_core_release(readAndClearStore);
        }
    }

    @JvmStatic
    public static final synchronized void persistEvents(AppEventCollection eventsToPersist) {
        synchronized (AppEventStore.class) {
            if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
                return;
            }
            Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
            AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
            AppEventUtility.assertIsNotMainThread();
            AppEventDiskStore appEventDiskStore = AppEventDiskStore.INSTANCE;
            PersistedEvents readAndClearStore = AppEventDiskStore.readAndClearStore();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.keySet()) {
                SessionEventsState sessionEventsState = eventsToPersist.get(accessTokenAppIdPair);
                if (sessionEventsState == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                readAndClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
            }
            AppEventDiskStore appEventDiskStore2 = AppEventDiskStore.INSTANCE;
            AppEventDiskStore.saveEventsToDisk$facebook_core_release(readAndClearStore);
        }
    }
}
