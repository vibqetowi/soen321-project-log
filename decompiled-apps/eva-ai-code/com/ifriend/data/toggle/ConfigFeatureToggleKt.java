package com.ifriend.data.toggle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ConfigFeatureToggle.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"waitUntilFeatureToggleLoaded", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/data/toggle/TypedConfigFeatureToggle;", "(Lcom/ifriend/data/toggle/TypedConfigFeatureToggle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigFeatureToggleKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object waitUntilFeatureToggleLoaded(TypedConfigFeatureToggle<T> typedConfigFeatureToggle, Continuation<? super Unit> continuation) {
        ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1 configFeatureToggleKt$waitUntilFeatureToggleLoaded$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1) {
            configFeatureToggleKt$waitUntilFeatureToggleLoaded$1 = (ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1) continuation;
            if ((configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label & Integer.MIN_VALUE) != 0) {
                configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label -= Integer.MIN_VALUE;
                obj = configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label = 1;
                    obj = typedConfigFeatureToggle.valuesFlow(configFeatureToggleKt$waitUntilFeatureToggleLoaded$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label = 2;
                if (FlowKt.first((Flow) obj, new ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2(null), configFeatureToggleKt$waitUntilFeatureToggleLoaded$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        configFeatureToggleKt$waitUntilFeatureToggleLoaded$1 = new ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$1(continuation);
        obj = configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label;
        if (i != 0) {
        }
        configFeatureToggleKt$waitUntilFeatureToggleLoaded$1.label = 2;
        if (FlowKt.first((Flow) obj, new ConfigFeatureToggleKt$waitUntilFeatureToggleLoaded$2(null), configFeatureToggleKt$waitUntilFeatureToggleLoaded$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
