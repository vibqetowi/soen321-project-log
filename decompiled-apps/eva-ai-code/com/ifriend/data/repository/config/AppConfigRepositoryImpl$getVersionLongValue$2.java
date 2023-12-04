package com.ifriend.data.repository.config;

import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.domain.config.AppconfigKt;
import com.ifriend.domain.config.ConfigEntity;
import com.ifriend.domain.config.LongPrimitiveValue;
import com.ifriend.domain.config.PrimitiveValue;
import com.ifriend.domain.config.StringPrimitiveValue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppConfigRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.config.AppConfigRepositoryImpl$getVersionLongValue$2", f = "AppConfigRepositoryImpl.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AppConfigRepositoryImpl$getVersionLongValue$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ AppConfigRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigRepositoryImpl$getVersionLongValue$2(AppConfigRepositoryImpl appConfigRepositoryImpl, String str, Continuation<? super AppConfigRepositoryImpl$getVersionLongValue$2> continuation) {
        super(2, continuation);
        this.this$0 = appConfigRepositoryImpl;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppConfigRepositoryImpl$getVersionLongValue$2(this.this$0, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((AppConfigRepositoryImpl$getVersionLongValue$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppConfigLocalDataSource appConfigLocalDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            appConfigLocalDataSource = this.this$0.appConfigLocalDataSource;
            this.label = 1;
            obj = appConfigLocalDataSource.getState().firstOrNull(new AppConfigRepositoryImpl$getVersionLongValue$2$value$1(AppconfigKt.appVersionKey(this.$key)), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        ConfigEntity configEntity = (ConfigEntity) obj;
        PrimitiveValue value = configEntity != null ? configEntity.getValue() : null;
        if (value instanceof LongPrimitiveValue) {
            return Boxing.boxLong(((LongPrimitiveValue) value).getValue());
        }
        if (value instanceof StringPrimitiveValue) {
            return StringsKt.toLongOrNull(((StringPrimitiveValue) value).getValue());
        }
        return null;
    }
}
