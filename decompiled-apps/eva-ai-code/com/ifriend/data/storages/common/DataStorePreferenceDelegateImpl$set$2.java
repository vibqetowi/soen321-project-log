package com.ifriend.data.storages.common;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStorePreferenceDelegateImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"TValue", "Landroidx/datastore/preferences/core/MutablePreferences;", "preferences", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.storages.common.DataStorePreferenceDelegateImpl$set$2", f = "DataStorePreferenceDelegateImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DataStorePreferenceDelegateImpl$set$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ TValue $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStorePreferenceDelegateImpl<TValue> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStorePreferenceDelegateImpl$set$2(DataStorePreferenceDelegateImpl<TValue> dataStorePreferenceDelegateImpl, TValue tvalue, Continuation<? super DataStorePreferenceDelegateImpl$set$2> continuation) {
        super(2, continuation);
        this.this$0 = dataStorePreferenceDelegateImpl;
        this.$value = tvalue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataStorePreferenceDelegateImpl$set$2 dataStorePreferenceDelegateImpl$set$2 = new DataStorePreferenceDelegateImpl$set$2(this.this$0, this.$value, continuation);
        dataStorePreferenceDelegateImpl$set$2.L$0 = obj;
        return dataStorePreferenceDelegateImpl$set$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((DataStorePreferenceDelegateImpl$set$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            key = ((DataStorePreferenceDelegateImpl) this.this$0).key;
            ((MutablePreferences) this.L$0).set(key, this.$value);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
