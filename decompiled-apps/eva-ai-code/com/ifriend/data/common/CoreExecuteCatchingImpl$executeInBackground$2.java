package com.ifriend.data.common;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.data.exception.mappers.CoreExceptionMapper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoreExecuteCatching.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.common.CoreExecuteCatchingImpl$executeInBackground$2", f = "CoreExecuteCatching.kt", i = {0}, l = {28}, m = "invokeSuspend", n = {"error$iv"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CoreExecuteCatchingImpl$executeInBackground$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoreExecuteCatchingImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreExecuteCatchingImpl$executeInBackground$2(CoreExecuteCatchingImpl coreExecuteCatchingImpl, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super CoreExecuteCatchingImpl$executeInBackground$2> continuation) {
        super(2, continuation);
        this.this$0 = coreExecuteCatchingImpl;
        this.$action = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoreExecuteCatchingImpl$executeInBackground$2 coreExecuteCatchingImpl$executeInBackground$2 = new CoreExecuteCatchingImpl$executeInBackground$2(this.this$0, this.$action, continuation);
        coreExecuteCatchingImpl$executeInBackground$2.L$0 = obj;
        return coreExecuteCatchingImpl$executeInBackground$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((CoreExecuteCatchingImpl$executeInBackground$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoreExceptionMapper coreExceptionMapper;
        KAnnotatedElement kAnnotatedElement;
        Object m7271constructorimpl;
        Throwable m7274exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$action;
            coreExceptionMapper = this.this$0.coreExceptionMapper;
            KAnnotatedElement kAnnotatedElement2 = (KFunction) new AnonymousClass2(coreExceptionMapper);
            try {
                Result.Companion companion = Result.Companion;
                this.L$0 = kAnnotatedElement2;
                this.label = 1;
                obj = function2.invoke(coroutineScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kAnnotatedElement = kAnnotatedElement2;
            } catch (Throwable th) {
                th = th;
                kAnnotatedElement = kAnnotatedElement2;
                Result.Companion companion2 = Result.Companion;
                m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                if (m7274exceptionOrNullimpl == null) {
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            kAnnotatedElement = (KFunction) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.Companion;
                m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
                if (m7274exceptionOrNullimpl == null) {
                }
            }
        }
        m7271constructorimpl = Result.m7271constructorimpl(obj);
        m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
        if (m7274exceptionOrNullimpl == null) {
            return m7271constructorimpl;
        }
        throw ((Throwable) ((Function1) kAnnotatedElement).invoke(m7274exceptionOrNullimpl));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreExecuteCatching.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.common.CoreExecuteCatchingImpl$executeInBackground$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Throwable> {
        AnonymousClass2(Object obj) {
            super(1, obj, CoreExceptionMapper.class, "map", "map(Ljava/lang/Throwable;)Ljava/lang/Throwable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((CoreExceptionMapper) this.receiver).map(p0);
        }
    }
}
