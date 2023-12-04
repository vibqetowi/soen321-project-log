package com.ifriend.data.storages.config;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.config.AppconfigKt;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.config.PrimitiveValue;
import com.ifriend.domain.config.StringPrimitiveValue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AppConfigLocalDataSource.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ#\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/data/storages/config/AppConfigLocalDataSourceImpl;", "Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "()V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/config/ConfigState;", "get", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/config/PrimitiveValue;", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfigStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getEntity", "Lcom/ifriend/domain/config/ConfigEntity;", "fullKey", "getFeatureEndpointValue", "getFeatureEntity", "getFeatureLinkValue", "getFeatureLongValue", "", "getFeatureStringValue", "scope", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getState", "isFeatureEnabled", "", "updateState", "", "config", "(Lcom/ifriend/domain/config/ConfigState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppConfigLocalDataSourceImpl implements AppConfigLocalDataSource {
    private final MutableStateFlow<ConfigState> state = StateFlowKt.MutableStateFlow(ConfigState.Loading.INSTANCE);

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public ConfigState getState() {
        return this.state.getValue();
    }

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public StateFlow<ConfigState> getConfigStateFlow() {
        return FlowKt.asStateFlow(this.state);
    }

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public Object updateState(ConfigState configState, Continuation<? super Unit> continuation) {
        Object emit = this.state.emit(configState, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public Object isFeatureEnabled(String str, Continuation<? super Boolean> continuation) {
        return getState().getFeature(str, continuation);
    }

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public Object getFeatureLongValue(String str, Continuation<? super Long> continuation) {
        return getState().getLongFeature(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[ORIG_RETURN, RETURN] */
    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFeatureStringValue(String str, String str2, Continuation<? super String> continuation) {
        AppConfigLocalDataSourceImpl$getFeatureStringValue$1 appConfigLocalDataSourceImpl$getFeatureStringValue$1;
        int i;
        StringPrimitiveValue stringPrimitiveValue;
        if (continuation instanceof AppConfigLocalDataSourceImpl$getFeatureStringValue$1) {
            appConfigLocalDataSourceImpl$getFeatureStringValue$1 = (AppConfigLocalDataSourceImpl$getFeatureStringValue$1) continuation;
            if ((appConfigLocalDataSourceImpl$getFeatureStringValue$1.label & Integer.MIN_VALUE) != 0) {
                appConfigLocalDataSourceImpl$getFeatureStringValue$1.label -= Integer.MIN_VALUE;
                Object obj = appConfigLocalDataSourceImpl$getFeatureStringValue$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appConfigLocalDataSourceImpl$getFeatureStringValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String appKey = AppconfigKt.appKey(str, str2);
                    appConfigLocalDataSourceImpl$getFeatureStringValue$1.label = 1;
                    obj = get(appKey, appConfigLocalDataSourceImpl$getFeatureStringValue$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                stringPrimitiveValue = (StringPrimitiveValue) obj;
                if (stringPrimitiveValue == null) {
                    return stringPrimitiveValue.getValue();
                }
                return null;
            }
        }
        appConfigLocalDataSourceImpl$getFeatureStringValue$1 = new AppConfigLocalDataSourceImpl$getFeatureStringValue$1(this, continuation);
        Object obj2 = appConfigLocalDataSourceImpl$getFeatureStringValue$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appConfigLocalDataSourceImpl$getFeatureStringValue$1.label;
        if (i != 0) {
        }
        stringPrimitiveValue = (StringPrimitiveValue) obj2;
        if (stringPrimitiveValue == null) {
        }
    }

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public Object getFeatureStringValue(String str, Continuation<? super String> continuation) {
        return getState().getStringFeature(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[ORIG_RETURN, RETURN] */
    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFeatureLinkValue(String str, Continuation<? super String> continuation) {
        AppConfigLocalDataSourceImpl$getFeatureLinkValue$1 appConfigLocalDataSourceImpl$getFeatureLinkValue$1;
        int i;
        StringPrimitiveValue stringPrimitiveValue;
        if (continuation instanceof AppConfigLocalDataSourceImpl$getFeatureLinkValue$1) {
            appConfigLocalDataSourceImpl$getFeatureLinkValue$1 = (AppConfigLocalDataSourceImpl$getFeatureLinkValue$1) continuation;
            if ((appConfigLocalDataSourceImpl$getFeatureLinkValue$1.label & Integer.MIN_VALUE) != 0) {
                appConfigLocalDataSourceImpl$getFeatureLinkValue$1.label -= Integer.MIN_VALUE;
                Object obj = appConfigLocalDataSourceImpl$getFeatureLinkValue$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appConfigLocalDataSourceImpl$getFeatureLinkValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String appLinkKey = AppconfigKt.appLinkKey(str);
                    appConfigLocalDataSourceImpl$getFeatureLinkValue$1.label = 1;
                    obj = get(appLinkKey, appConfigLocalDataSourceImpl$getFeatureLinkValue$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                stringPrimitiveValue = (StringPrimitiveValue) obj;
                if (stringPrimitiveValue == null) {
                    return stringPrimitiveValue.getValue();
                }
                return null;
            }
        }
        appConfigLocalDataSourceImpl$getFeatureLinkValue$1 = new AppConfigLocalDataSourceImpl$getFeatureLinkValue$1(this, continuation);
        Object obj2 = appConfigLocalDataSourceImpl$getFeatureLinkValue$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appConfigLocalDataSourceImpl$getFeatureLinkValue$1.label;
        if (i != 0) {
        }
        stringPrimitiveValue = (StringPrimitiveValue) obj2;
        if (stringPrimitiveValue == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[ORIG_RETURN, RETURN] */
    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFeatureEndpointValue(String str, Continuation<? super String> continuation) {
        AppConfigLocalDataSourceImpl$getFeatureEndpointValue$1 appConfigLocalDataSourceImpl$getFeatureEndpointValue$1;
        int i;
        StringPrimitiveValue stringPrimitiveValue;
        if (continuation instanceof AppConfigLocalDataSourceImpl$getFeatureEndpointValue$1) {
            appConfigLocalDataSourceImpl$getFeatureEndpointValue$1 = (AppConfigLocalDataSourceImpl$getFeatureEndpointValue$1) continuation;
            if ((appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.label & Integer.MIN_VALUE) != 0) {
                appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.label -= Integer.MIN_VALUE;
                Object obj = appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String appEndpointKey = AppconfigKt.appEndpointKey(str);
                    appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.label = 1;
                    obj = get(appEndpointKey, appConfigLocalDataSourceImpl$getFeatureEndpointValue$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                stringPrimitiveValue = (StringPrimitiveValue) obj;
                if (stringPrimitiveValue == null) {
                    return stringPrimitiveValue.getValue();
                }
                return null;
            }
        }
        appConfigLocalDataSourceImpl$getFeatureEndpointValue$1 = new AppConfigLocalDataSourceImpl$getFeatureEndpointValue$1(this, continuation);
        Object obj2 = appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appConfigLocalDataSourceImpl$getFeatureEndpointValue$1.label;
        if (i != 0) {
        }
        stringPrimitiveValue = (StringPrimitiveValue) obj2;
        if (stringPrimitiveValue == null) {
        }
    }

    @Override // com.ifriend.data.storages.config.AppConfigLocalDataSource
    public Object getFeatureEntity(String str, Continuation<? super ConfigEntity> continuation) {
        return getState().firstOrNull(new AppConfigLocalDataSourceImpl$getFeatureEntity$2(str), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getEntity(String str, Continuation<? super ConfigEntity> continuation) {
        return getState().firstOrNull(new AppConfigLocalDataSourceImpl$getEntity$2(str), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends PrimitiveValue> Object get(String str, Continuation<? super T> continuation) {
        AppConfigLocalDataSourceImpl$get$1 appConfigLocalDataSourceImpl$get$1;
        int i;
        PrimitiveValue value;
        if (continuation instanceof AppConfigLocalDataSourceImpl$get$1) {
            appConfigLocalDataSourceImpl$get$1 = (AppConfigLocalDataSourceImpl$get$1) continuation;
            if ((appConfigLocalDataSourceImpl$get$1.label & Integer.MIN_VALUE) != 0) {
                appConfigLocalDataSourceImpl$get$1.label -= Integer.MIN_VALUE;
                Object obj = appConfigLocalDataSourceImpl$get$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appConfigLocalDataSourceImpl$get$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appConfigLocalDataSourceImpl$get$1.label = 1;
                    obj = getEntity(str, appConfigLocalDataSourceImpl$get$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                ConfigEntity configEntity = (ConfigEntity) obj;
                value = configEntity == null ? configEntity.getValue() : null;
                if (value instanceof PrimitiveValue) {
                    return null;
                }
                return value;
            }
        }
        appConfigLocalDataSourceImpl$get$1 = new AppConfigLocalDataSourceImpl$get$1(this, continuation);
        Object obj2 = appConfigLocalDataSourceImpl$get$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appConfigLocalDataSourceImpl$get$1.label;
        if (i != 0) {
        }
        ConfigEntity configEntity2 = (ConfigEntity) obj2;
        if (configEntity2 == null) {
        }
        if (value instanceof PrimitiveValue) {
        }
    }
}
