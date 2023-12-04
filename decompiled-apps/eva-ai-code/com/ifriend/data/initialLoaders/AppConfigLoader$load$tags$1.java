package com.ifriend.data.initialLoaders;

import com.ifriend.domain.models.Tag;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: AppConfigLoader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/models/Tag;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.initialLoaders.AppConfigLoader$load$tags$1", f = "AppConfigLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AppConfigLoader$load$tags$1 extends SuspendLambda implements Function2<List<? extends Tag>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppConfigLoader$load$tags$1(Continuation<? super AppConfigLoader$load$tags$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppConfigLoader$load$tags$1 appConfigLoader$load$tags$1 = new AppConfigLoader$load$tags$1(continuation);
        appConfigLoader$load$tags$1.L$0 = obj;
        return appConfigLoader$load$tags$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Tag> list, Continuation<? super Boolean> continuation) {
        return invoke2((List<Tag>) list, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<Tag> list, Continuation<? super Boolean> continuation) {
        return ((AppConfigLoader$load$tags$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((List) this.L$0) != null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
