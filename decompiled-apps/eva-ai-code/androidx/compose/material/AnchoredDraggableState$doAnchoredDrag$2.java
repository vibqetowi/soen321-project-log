package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.exifinterface.media.ExifInterface;
import io.grpc.internal.GrpcUtil;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {441}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$doAnchoredDrag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$doAnchoredDrag$2(T t, AnchoredDraggableState<T> anchoredDraggableState, MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnchoredDraggableState$doAnchoredDrag$2> continuation) {
        super(2, continuation);
        this.$targetValue = t;
        this.this$0 = anchoredDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchoredDraggableState$doAnchoredDrag$2(this.$targetValue, this.this$0, this.$dragPriority, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnchoredDraggableState$doAnchoredDrag$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object key;
        boolean z;
        InternalMutatorMutex internalMutatorMutex;
        Object obj3;
        boolean z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$targetValue != 0 && !this.this$0.getAnchors$material_release().containsKey(this.$targetValue)) {
                    if (((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(this.$targetValue)).booleanValue()) {
                        this.this$0.setCurrentValue(this.$targetValue);
                    }
                    return Unit.INSTANCE;
                }
                internalMutatorMutex = ((AnchoredDraggableState) this.this$0).dragMutex;
                this.label = 1;
                if (internalMutatorMutex.mutate(this.$dragPriority, new AnonymousClass1(this.$targetValue, this.this$0, this.$block, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (this.$targetValue != 0) {
                this.this$0.setAnimationTarget(null);
            }
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            Iterator it = this.this$0.getAnchors$material_release().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (Math.abs(((Number) ((Map.Entry) obj3).getValue()).floatValue() - anchoredDraggableState.getOffset()) < 0.5f) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj3;
            key = entry != null ? entry.getKey() : null;
            if (key != null && ((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(key)).booleanValue()) {
                this.this$0.setCurrentValue(key);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (this.$targetValue != 0) {
                this.this$0.setAnimationTarget(null);
            }
            AnchoredDraggableState<T> anchoredDraggableState2 = this.this$0;
            Iterator it2 = this.this$0.getAnchors$material_release().entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Math.abs(((Number) ((Map.Entry) obj2).getValue()).floatValue() - anchoredDraggableState2.getOffset()) < 0.5f) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            key = entry2 != null ? entry2.getKey() : null;
            if (key != null && ((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(key)).booleanValue()) {
                this.this$0.setCurrentValue(key);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", f = "AnchoredDraggable.kt", i = {}, l = {GrpcUtil.DEFAULT_PORT_SSL}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t, AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$targetValue = t;
            this.this$0 = anchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$targetValue, this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
            return invoke2(continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnchoredDragScope anchoredDragScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                T t = this.$targetValue;
                if (t != 0) {
                    this.this$0.setAnimationTarget(t);
                }
                Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> function3 = this.$block;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                Map anchors$material_release = this.this$0.getAnchors$material_release();
                this.label = 1;
                if (function3.invoke(anchoredDragScope, anchors$material_release, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
