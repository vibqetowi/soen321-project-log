package com.bugsnag.android;

import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.ConfigModule;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.DependencyModule;
import com.bugsnag.android.internal.dag.SystemServiceModule;
import hs.d;
import kotlin.jvm.internal.i;
/* compiled from: EventStorageModule.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/bugsnag/android/EventStorageModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "cfg", "Lcom/bugsnag/android/internal/ImmutableConfig;", "Lcom/bugsnag/android/InternalReportDelegate;", "delegate$delegate", "Lhs/d;", "getDelegate", "()Lcom/bugsnag/android/InternalReportDelegate;", "delegate", "Lcom/bugsnag/android/EventStore;", "eventStore$delegate", "getEventStore", "()Lcom/bugsnag/android/EventStore;", "eventStore", "Lcom/bugsnag/android/internal/dag/ContextModule;", "contextModule", "Lcom/bugsnag/android/internal/dag/ConfigModule;", "configModule", "Lcom/bugsnag/android/DataCollectionModule;", "dataCollectionModule", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "bgTaskService", "Lcom/bugsnag/android/TrackerModule;", "trackerModule", "Lcom/bugsnag/android/internal/dag/SystemServiceModule;", "systemServiceModule", "Lcom/bugsnag/android/Notifier;", "notifier", "Lcom/bugsnag/android/CallbackState;", "callbackState", "<init>", "(Lcom/bugsnag/android/internal/dag/ContextModule;Lcom/bugsnag/android/internal/dag/ConfigModule;Lcom/bugsnag/android/DataCollectionModule;Lcom/bugsnag/android/internal/BackgroundTaskService;Lcom/bugsnag/android/TrackerModule;Lcom/bugsnag/android/internal/dag/SystemServiceModule;Lcom/bugsnag/android/Notifier;Lcom/bugsnag/android/CallbackState;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EventStorageModule extends DependencyModule {
    private final ImmutableConfig cfg;
    private final d delegate$delegate;
    private final d eventStore$delegate;

    public EventStorageModule(ContextModule contextModule, ConfigModule configModule, DataCollectionModule dataCollectionModule, BackgroundTaskService bgTaskService, TrackerModule trackerModule, SystemServiceModule systemServiceModule, Notifier notifier, CallbackState callbackState) {
        i.h(contextModule, "contextModule");
        i.h(configModule, "configModule");
        i.h(dataCollectionModule, "dataCollectionModule");
        i.h(bgTaskService, "bgTaskService");
        i.h(trackerModule, "trackerModule");
        i.h(systemServiceModule, "systemServiceModule");
        i.h(notifier, "notifier");
        i.h(callbackState, "callbackState");
        this.cfg = configModule.getConfig();
        this.delegate$delegate = future(new EventStorageModule$delegate$2(this, contextModule, systemServiceModule, dataCollectionModule, trackerModule, notifier, bgTaskService));
        this.eventStore$delegate = future(new EventStorageModule$eventStore$2(this, notifier, bgTaskService, callbackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalReportDelegate getDelegate() {
        return (InternalReportDelegate) this.delegate$delegate.getValue();
    }

    public final EventStore getEventStore() {
        return (EventStore) this.eventStore$delegate.getValue();
    }
}
