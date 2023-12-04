package com.ifriend.data.repository.update;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
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
/* compiled from: InAppUpdateRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "prefs", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$refresh$2", f = "InAppUpdateRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InAppUpdateRepositoryImpl$refresh$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $currentVersionCode;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateRepositoryImpl$refresh$2(long j, Continuation<? super InAppUpdateRepositoryImpl$refresh$2> continuation) {
        super(2, continuation);
        this.$currentVersionCode = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InAppUpdateRepositoryImpl$refresh$2 inAppUpdateRepositoryImpl$refresh$2 = new InAppUpdateRepositoryImpl$refresh$2(this.$currentVersionCode, continuation);
        inAppUpdateRepositoryImpl$refresh$2.L$0 = obj;
        return inAppUpdateRepositoryImpl$refresh$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((InAppUpdateRepositoryImpl$refresh$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        Preferences.Key key2;
        Preferences.Key key3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        long j = this.$currentVersionCode;
        key = InAppUpdateRepositoryImpl.KEY_DISMISS_COUNT;
        mutablePreferences.remove(key);
        key2 = InAppUpdateRepositoryImpl.KEY_LAST_DISMISS_TIMESTAMP;
        mutablePreferences.set(key2, Boxing.boxLong(System.currentTimeMillis()));
        key3 = InAppUpdateRepositoryImpl.KEY_LAST_VERSION_CODE;
        mutablePreferences.set(key3, Boxing.boxLong(j));
        return Unit.INSTANCE;
    }
}
