package com.ifriend.presentation.common.observers.appevents;

import com.ifriend.presentation.common.observers.FlowObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: AppEventsObserver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0011\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0001j\u0002`\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEventsObserver;", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsFlow;", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "state", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "emit", "", "value", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppEventsObserver implements FlowObserver<AppEvents>, AppEventsEmitter {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final MutableSharedFlow<AppEvents> state;

    public AppEventsObserver(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.state = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.ifriend.presentation.common.observers.FlowObserver
    public Flow<AppEvents> subscribe() {
        return FlowKt.asSharedFlow(this.state);
    }

    @Override // com.ifriend.presentation.common.observers.appevents.AppEventsEmitter
    public void emit(AppEvents value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AppEventsObserver$emit$1(this, value, null), 3, null);
    }
}
