package coil.compose;

import androidx.compose.runtime.SnapshotStateKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncImagePainter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AsyncImagePainter$onRemembered$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AsyncImagePainter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1(AsyncImagePainter asyncImagePainter, Continuation<? super AsyncImagePainter$onRemembered$1> continuation) {
        super(2, continuation);
        this.this$0 = asyncImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsyncImagePainter$onRemembered$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AsyncImagePainter$onRemembered$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImagePainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/request/ImageRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<ImageRequest> {
        final /* synthetic */ AsyncImagePainter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AsyncImagePainter asyncImagePainter) {
            super(0);
            this.this$0 = asyncImagePainter;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageRequest invoke() {
            return this.this$0.getRequest();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.mapLatest(SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.this$0)), new AnonymousClass2(this.this$0, null)).collect(new AnonymousClass3(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImagePainter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcoil/request/ImageRequest;", "it", "Lcoil/compose/AsyncImagePainter$State;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ImageRequest, Continuation<? super AsyncImagePainter.State>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ AsyncImagePainter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AsyncImagePainter asyncImagePainter, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = asyncImagePainter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ImageRequest imageRequest, Continuation<? super AsyncImagePainter.State> continuation) {
            return ((AnonymousClass2) create(imageRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ImageRequest updateRequest;
            AsyncImagePainter asyncImagePainter;
            AsyncImagePainter.State state;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AsyncImagePainter asyncImagePainter2 = this.this$0;
                ImageLoader imageLoader = asyncImagePainter2.getImageLoader();
                AsyncImagePainter asyncImagePainter3 = this.this$0;
                updateRequest = asyncImagePainter3.updateRequest(asyncImagePainter3.getRequest());
                this.L$0 = asyncImagePainter2;
                this.label = 1;
                Object execute = imageLoader.execute(updateRequest, this);
                if (execute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                asyncImagePainter = asyncImagePainter2;
                obj = execute;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                asyncImagePainter = (AsyncImagePainter) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            state = asyncImagePainter.toState((ImageResult) obj);
            return state;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImagePainter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class AnonymousClass3 implements FlowCollector, FunctionAdapter {
        final /* synthetic */ AsyncImagePainter $tmp0;

        AnonymousClass3(AsyncImagePainter asyncImagePainter) {
            this.$tmp0 = asyncImagePainter;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.$tmp0, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(AsyncImagePainter.State state, Continuation<? super Unit> continuation) {
            Object invokeSuspend$updateState = AsyncImagePainter$onRemembered$1.invokeSuspend$updateState(this.$tmp0, state, continuation);
            return invokeSuspend$updateState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invokeSuspend$updateState : Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((AsyncImagePainter.State) obj, (Continuation<? super Unit>) continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$updateState(AsyncImagePainter asyncImagePainter, AsyncImagePainter.State state, Continuation continuation) {
        asyncImagePainter.updateState(state);
        return Unit.INSTANCE;
    }
}
