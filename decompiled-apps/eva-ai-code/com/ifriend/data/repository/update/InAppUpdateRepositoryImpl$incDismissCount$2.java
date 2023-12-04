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
/* compiled from: InAppUpdateRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "prefs", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.update.InAppUpdateRepositoryImpl$incDismissCount$2", f = "InAppUpdateRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InAppUpdateRepositoryImpl$incDismissCount$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InAppUpdateRepositoryImpl$incDismissCount$2(Continuation<? super InAppUpdateRepositoryImpl$incDismissCount$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InAppUpdateRepositoryImpl$incDismissCount$2 inAppUpdateRepositoryImpl$incDismissCount$2 = new InAppUpdateRepositoryImpl$incDismissCount$2(continuation);
        inAppUpdateRepositoryImpl$incDismissCount$2.L$0 = obj;
        return inAppUpdateRepositoryImpl$incDismissCount$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((InAppUpdateRepositoryImpl$incDismissCount$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        Preferences.Key key2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            key = InAppUpdateRepositoryImpl.KEY_DISMISS_COUNT;
            key2 = InAppUpdateRepositoryImpl.KEY_DISMISS_COUNT;
            Integer num = (Integer) mutablePreferences.get(key2);
            mutablePreferences.set(key, Boxing.boxInt((num != null ? num.intValue() : 0) + 1));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
