package com.bugsnag.android;

import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ImmutableConfig;
import kotlin.jvm.internal.k;
import ss.a;
/* compiled from: EventStorageModule.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bugsnag/android/EventStore;", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EventStorageModule$eventStore$2 extends k implements a<EventStore> {
    final /* synthetic */ BackgroundTaskService $bgTaskService;
    final /* synthetic */ CallbackState $callbackState;
    final /* synthetic */ Notifier $notifier;
    final /* synthetic */ EventStorageModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventStorageModule$eventStore$2(EventStorageModule eventStorageModule, Notifier notifier, BackgroundTaskService backgroundTaskService, CallbackState callbackState) {
        super(0);
        this.this$0 = eventStorageModule;
        this.$notifier = notifier;
        this.$bgTaskService = backgroundTaskService;
        this.$callbackState = callbackState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ss.a
    public final EventStore invoke() {
        ImmutableConfig immutableConfig;
        ImmutableConfig immutableConfig2;
        InternalReportDelegate delegate;
        immutableConfig = this.this$0.cfg;
        immutableConfig2 = this.this$0.cfg;
        Logger logger = immutableConfig2.getLogger();
        Notifier notifier = this.$notifier;
        BackgroundTaskService backgroundTaskService = this.$bgTaskService;
        delegate = this.this$0.getDelegate();
        return new EventStore(immutableConfig, logger, notifier, backgroundTaskService, delegate, this.$callbackState);
    }
}
