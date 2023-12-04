package com.ifriend.data.repository.config;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.data.config.FirebaseConfig;
import com.ifriend.data.config.LocalDefaultsConfig;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.models.Tag;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppConfigRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/config/ConfigState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.config.AppConfigRepositoryImpl$loadConfig$2", f = "AppConfigRepositoryImpl.kt", i = {1, 2, 3}, l = {45, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 57}, m = "invokeSuspend", n = {"localConfig", "remoteConfig", "remoteConfig"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class AppConfigRepositoryImpl$loadConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConfigState>, Object> {
    final /* synthetic */ List<Tag> $tags;
    Object L$0;
    int label;
    final /* synthetic */ AppConfigRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigRepositoryImpl$loadConfig$2(AppConfigRepositoryImpl appConfigRepositoryImpl, List<Tag> list, Continuation<? super AppConfigRepositoryImpl$loadConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = appConfigRepositoryImpl;
        this.$tags = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppConfigRepositoryImpl$loadConfig$2(this.this$0, this.$tags, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConfigState> continuation) {
        return ((AppConfigRepositoryImpl$loadConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalDefaultsConfig localDefaultsConfig;
        ConfigState.Loaded loaded;
        FirebaseConfig firebaseConfig;
        ConfigState configState;
        ConfigState mergeConfigs;
        AppConfigLocalDataSource appConfigLocalDataSource;
        AppConfigLocalDataSource appConfigLocalDataSource2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            localDefaultsConfig = this.this$0.localDefaultsConfig;
            this.label = 1;
            obj = localDefaultsConfig.loadConfig(this.$tags, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ConfigState configState2 = (ConfigState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return configState2;
                } else if (i == 4) {
                    ConfigState configState3 = (ConfigState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return configState3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            loaded = (ConfigState.Loaded) this.L$0;
            ResultKt.throwOnFailure(obj);
            configState = (ConfigState) obj;
            if (!(configState instanceof ConfigState.Error)) {
                appConfigLocalDataSource2 = this.this$0.appConfigLocalDataSource;
                this.L$0 = configState;
                this.label = 3;
                return appConfigLocalDataSource2.updateState(configState, this) == coroutine_suspended ? coroutine_suspended : configState;
            }
            mergeConfigs = this.this$0.mergeConfigs(loaded, configState);
            appConfigLocalDataSource = this.this$0.appConfigLocalDataSource;
            this.L$0 = configState;
            this.label = 4;
            return appConfigLocalDataSource.updateState(mergeConfigs, this) == coroutine_suspended ? coroutine_suspended : configState;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        loaded = (ConfigState.Loaded) obj;
        firebaseConfig = this.this$0.firebaseConfig;
        this.L$0 = loaded;
        this.label = 2;
        obj = firebaseConfig.loadConfig(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        configState = (ConfigState) obj;
        if (!(configState instanceof ConfigState.Error)) {
        }
    }
}
