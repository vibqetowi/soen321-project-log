package com.ifriend.data.storages.config;

import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.ConfigState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
/* compiled from: AppConfigLocalDataSource.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H&J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/storages/config/AppConfigLocalDataSource;", "", "getConfigStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/config/ConfigState;", "getFeatureEndpointValue", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeatureEntity", "Lcom/ifriend/domain/config/ConfigEntity;", "getFeatureLinkValue", "getFeatureLongValue", "", "getFeatureStringValue", "scope", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getState", "isFeatureEnabled", "", "updateState", "", "config", "(Lcom/ifriend/domain/config/ConfigState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppConfigLocalDataSource {
    Flow<ConfigState> getConfigStateFlow();

    Object getFeatureEndpointValue(String str, Continuation<? super String> continuation);

    Object getFeatureEntity(String str, Continuation<? super ConfigEntity> continuation);

    Object getFeatureLinkValue(String str, Continuation<? super String> continuation);

    Object getFeatureLongValue(String str, Continuation<? super Long> continuation);

    Object getFeatureStringValue(String str, String str2, Continuation<? super String> continuation);

    Object getFeatureStringValue(String str, Continuation<? super String> continuation);

    ConfigState getState();

    Object isFeatureEnabled(String str, Continuation<? super Boolean> continuation);

    Object updateState(ConfigState configState, Continuation<? super Unit> continuation);
}
