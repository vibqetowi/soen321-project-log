package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.EventListener;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.size.Size;
import coil.transform.Transformation;
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
import kotlinx.coroutines.CoroutineScopeKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", i = {0, 0, 0}, l = {242}, m = "invokeSuspend", n = {"$this$withContext", "$this$foldIndices$iv", "i$iv"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes2.dex */
public final class EngineInterceptor$transform$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.ExecuteResult>, Object> {
    final /* synthetic */ EventListener $eventListener;
    final /* synthetic */ Options $options;
    final /* synthetic */ ImageRequest $request;
    final /* synthetic */ EngineInterceptor.ExecuteResult $result;
    final /* synthetic */ List<Transformation> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.ExecuteResult executeResult, Options options, List<? extends Transformation> list, EventListener eventListener, ImageRequest imageRequest, Continuation<? super EngineInterceptor$transform$3> continuation) {
        super(2, continuation);
        this.this$0 = engineInterceptor;
        this.$result = executeResult;
        this.$options = options;
        this.$transformations = list;
        this.$eventListener = eventListener;
        this.$request = imageRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, continuation);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EngineInterceptor.ExecuteResult> continuation) {
        return ((EngineInterceptor$transform$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007b -> B:13:0x007e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap convertDrawableToBitmap;
        Options options;
        EngineInterceptor$transform$3 engineInterceptor$transform$3;
        CoroutineScope coroutineScope;
        int size;
        List<Transformation> list;
        Bitmap bitmap;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            convertDrawableToBitmap = this.this$0.convertDrawableToBitmap(this.$result.getDrawable(), this.$options, this.$transformations);
            this.$eventListener.transformStart(this.$request, convertDrawableToBitmap);
            List<Transformation> list2 = this.$transformations;
            options = this.$options;
            engineInterceptor$transform$3 = this;
            coroutineScope = (CoroutineScope) this.L$0;
            size = list2.size();
            list = list2;
            bitmap = convertDrawableToBitmap;
            i = 0;
            if (i < size) {
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            size = this.I$1;
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            engineInterceptor$transform$3 = this;
            coroutineScope = (CoroutineScope) this.L$0;
            list = (List) this.L$1;
            options = (Options) this.L$2;
            Object transform = obj;
            bitmap = (Bitmap) transform;
            CoroutineScopeKt.ensureActive(coroutineScope);
            i++;
            if (i < size) {
                Size size2 = options.getSize();
                engineInterceptor$transform$3.L$0 = coroutineScope;
                engineInterceptor$transform$3.L$1 = list;
                engineInterceptor$transform$3.L$2 = options;
                engineInterceptor$transform$3.I$0 = i;
                engineInterceptor$transform$3.I$1 = size;
                engineInterceptor$transform$3.label = 1;
                transform = list.get(i).transform(bitmap, size2, engineInterceptor$transform$3);
                if (transform == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bitmap = (Bitmap) transform;
                CoroutineScopeKt.ensureActive(coroutineScope);
                i++;
                if (i < size) {
                    engineInterceptor$transform$3.$eventListener.transformEnd(engineInterceptor$transform$3.$request, bitmap);
                    return EngineInterceptor.ExecuteResult.copy$default(engineInterceptor$transform$3.$result, new BitmapDrawable(engineInterceptor$transform$3.$request.getContext().getResources(), bitmap), false, null, null, 14, null);
                }
            }
        }
    }
}
