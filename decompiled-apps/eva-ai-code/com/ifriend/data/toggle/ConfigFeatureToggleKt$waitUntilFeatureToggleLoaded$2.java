package com.ifriend.data.toggle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.toggle.ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2", f = "ConfigFeatureToggle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2(Continuation<? super ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2 configFeatureToggleKt$waitUntilFeatureToggleLoaded$2 = new ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2(continuation);
        configFeatureToggleKt$waitUntilFeatureToggleLoaded$2.L$0 = obj;
        return configFeatureToggleKt$waitUntilFeatureToggleLoaded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return invoke2((ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2) obj, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(T t, Continuation<? super Boolean> continuation) {
        return ((ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.L$0 != null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
