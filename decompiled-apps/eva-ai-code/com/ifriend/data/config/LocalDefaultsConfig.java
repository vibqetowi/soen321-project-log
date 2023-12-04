package com.ifriend.data.config;

import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.config.LocalDefaultsConfigBuilder;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.models.Tag;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LocalDefaultsConfig.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002J\f\u0010\u000e\u001a\u00020\f*\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/config/LocalDefaultsConfig;", "", "localConfigExtractor", "Lcom/ifriend/data/config/LocalConfigExtractor;", "(Lcom/ifriend/data/config/LocalConfigExtractor;)V", "loadConfig", "Lcom/ifriend/domain/config/ConfigState$Loaded;", "tags", "", "Lcom/ifriend/domain/models/Tag;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "age", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder;", "neurons", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalDefaultsConfig {
    private final LocalConfigExtractor localConfigExtractor;

    @Inject
    public LocalDefaultsConfig(LocalConfigExtractor localConfigExtractor) {
        Intrinsics.checkNotNullParameter(localConfigExtractor, "localConfigExtractor");
        this.localConfigExtractor = localConfigExtractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadConfig(List<Tag> list, Continuation<? super ConfigState.Loaded> continuation) {
        LocalDefaultsConfig$loadConfig$1 localDefaultsConfig$loadConfig$1;
        int i;
        LocalDefaultsConfig localDefaultsConfig;
        if (continuation instanceof LocalDefaultsConfig$loadConfig$1) {
            localDefaultsConfig$loadConfig$1 = (LocalDefaultsConfig$loadConfig$1) continuation;
            if ((localDefaultsConfig$loadConfig$1.label & Integer.MIN_VALUE) != 0) {
                localDefaultsConfig$loadConfig$1.label -= Integer.MIN_VALUE;
                Object obj = localDefaultsConfig$loadConfig$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localDefaultsConfig$loadConfig$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    localDefaultsConfig$loadConfig$1.L$0 = this;
                    localDefaultsConfig$loadConfig$1.label = 1;
                    obj = LocalDefaultsConfigBuilder.Companion.config(list, new LocalDefaultsConfig$loadConfig$entities$1(this, null), localDefaultsConfig$loadConfig$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    localDefaultsConfig = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    localDefaultsConfig = (LocalDefaultsConfig) localDefaultsConfig$loadConfig$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new ConfigState.Loaded(CollectionsKt.plus((Collection) obj, (Iterable) localDefaultsConfig.localConfigExtractor.extract()));
            }
        }
        localDefaultsConfig$loadConfig$1 = new LocalDefaultsConfig$loadConfig$1(this, continuation);
        Object obj2 = localDefaultsConfig$loadConfig$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localDefaultsConfig$loadConfig$1.label;
        if (i != 0) {
        }
        return new ConfigState.Loaded(CollectionsKt.plus((Collection) obj2, (Iterable) localDefaultsConfig.localConfigExtractor.extract()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void neurons(LocalDefaultsConfigBuilder localDefaultsConfigBuilder) {
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "message_cost", (Object) 0, (String) null, (Function1) LocalDefaultsConfig$neurons$1.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.DAILY_NEURONS_BONUS.getKey(), (Object) 0, (String) null, (Function1) LocalDefaultsConfig$neurons$2.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, FeatureToggleKey.REGISTRATION_NEURONS_BONUS.getKey(), (Object) 0, (String) null, (Function1) LocalDefaultsConfig$neurons$3.INSTANCE, 4, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "neurons_packages_sort", "control", (String) null, LocalDefaultsConfig$neurons$4.INSTANCE, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void age(LocalDefaultsConfigBuilder localDefaultsConfigBuilder) {
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "bot_min_age", (Object) 0, (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "bot_max_age", (Object) 99, (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "user_min_age", (Object) 0, (String) null, (Function1) null, 12, (Object) null);
        LocalDefaultsConfigBuilder.feature$default(localDefaultsConfigBuilder, "user_max_age", (Object) 99, (String) null, (Function1) null, 12, (Object) null);
    }
}
