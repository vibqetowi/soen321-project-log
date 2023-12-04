package com.google.android.play.core.ktx;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends Lambda implements Function1<AppUpdatePassthroughListener, Unit> {
    final /* synthetic */ ProducerScope<AppUpdateResult> $$this$callbackFlow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(ProducerScope<? super AppUpdateResult> producerScope) {
        super(1);
        this.$$this$callbackFlow = producerScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(AppUpdatePassthroughListener appUpdatePassthroughListener) {
        invoke2(appUpdatePassthroughListener);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AppUpdatePassthroughListener $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        SendChannel.DefaultImpls.close$default(this.$$this$callbackFlow, null, 1, null);
    }
}
