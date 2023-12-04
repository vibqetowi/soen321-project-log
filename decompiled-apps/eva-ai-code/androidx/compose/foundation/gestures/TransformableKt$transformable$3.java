package androidx.compose.foundation.gestures;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TransformableKt$transformable$3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function0<Boolean> $canPan;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ TransformableState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$3(boolean z, Function0<Boolean> function0, boolean z2, TransformableState transformableState) {
        super(3);
        this.$lockRotationOnZoomPan = z;
        this.$canPan = function0;
        this.$enabled = z2;
        this.$state = transformableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(298661433);
        ComposerKt.sourceInformation(composer, "C98@4744L43,99@4816L28,100@4867L66,121@5860L524:Transformable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298661433, i, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:97)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$lockRotationOnZoomPan), composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$canPan, composer, 0);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Channel channel = (Channel) rememberedValue;
        composer.startReplaceableGroup(-2015615917);
        ComposerKt.sourceInformation(composer, "102@4969L822");
        if (this.$enabled) {
            EffectsKt.LaunchedEffect(this.$state, new AnonymousClass1(channel, this.$state, null), composer, 64);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        TransformableKt$transformable$3$block$1$1 rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransformableKt$transformable$3$block$1$1(rememberUpdatedState, channel, rememberUpdatedState2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier.Companion pointerInput = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, channel, (Function2) rememberedValue2) : Modifier.Companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1", f = "Transformable.kt", i = {0, 0, 1}, l = {105, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {"$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<TransformEvent> $channel;
        final /* synthetic */ TransformableState $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Channel<TransformEvent> channel, TransformableState transformableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$state = transformableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$channel, this.$state, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Transformable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1", f = "Transformable.kt", i = {0}, l = {113}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
        /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00151 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Channel<TransformEvent> $channel;
            final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00151(Ref.ObjectRef<TransformEvent> objectRef, Channel<TransformEvent> channel, Continuation<? super C00151> continuation) {
                super(2, continuation);
                this.$event = objectRef;
                this.$channel = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00151 c00151 = new C00151(this.$event, this.$channel, continuation);
                c00151.L$0 = obj;
                return c00151;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
                return ((C00151) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:21:0x006c). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                TransformScope transformScope;
                C00151 c00151;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    transformScope = (TransformScope) this.L$0;
                    c00151 = this;
                    if (!(c00151.$event.element instanceof TransformEvent.TransformStopped)) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    TransformScope transformScope2 = (TransformScope) this.L$0;
                    Ref.ObjectRef<TransformEvent> objectRef = (Ref.ObjectRef) this.L$1;
                    Object obj2 = coroutine_suspended;
                    C00151 c001512 = this;
                    T t = obj;
                    objectRef.element = t;
                    c00151 = c001512;
                    coroutine_suspended = obj2;
                    transformScope = transformScope2;
                    if (!(c00151.$event.element instanceof TransformEvent.TransformStopped)) {
                        TransformEvent transformEvent = c00151.$event.element;
                        TransformEvent.TransformDelta transformDelta = transformEvent instanceof TransformEvent.TransformDelta ? (TransformEvent.TransformDelta) transformEvent : null;
                        if (transformDelta != null) {
                            transformScope.mo514transformByd4ec7I(transformDelta.getZoomChange(), transformDelta.m614getPanChangeF1C5BW0(), transformDelta.getRotationChange());
                        }
                        Ref.ObjectRef<TransformEvent> objectRef2 = c00151.$event;
                        c00151.L$0 = transformScope;
                        c00151.L$1 = objectRef2;
                        c00151.label = 1;
                        Object receive = c00151.$channel.receive(c00151);
                        if (receive == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object obj3 = coroutine_suspended;
                        c001512 = c00151;
                        t = receive;
                        transformScope2 = transformScope;
                        objectRef = objectRef2;
                        obj2 = obj3;
                        objectRef.element = t;
                        c00151 = c001512;
                        coroutine_suspended = obj2;
                        transformScope = transformScope2;
                        if (!(c00151.$event.element instanceof TransformEvent.TransformStopped)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0087 -> B:14:0x003a). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
            } else if (i == 1) {
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.L$2;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$1;
                AnonymousClass1 anonymousClass12 = this;
                T t = obj;
                objectRef.element = t;
                if (objectRef2.element instanceof TransformEvent.TransformStarted) {
                    anonymousClass12.L$0 = coroutineScope2;
                    anonymousClass12.L$1 = null;
                    anonymousClass12.L$2 = null;
                    anonymousClass12.label = 2;
                    if (anonymousClass12.$state.transform(MutatePriority.UserInput, new C00151(objectRef2, anonymousClass12.$channel, null), anonymousClass12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                anonymousClass1 = anonymousClass12;
                coroutineScope = coroutineScope2;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    anonymousClass1.L$0 = coroutineScope;
                    anonymousClass1.L$1 = objectRef3;
                    anonymousClass1.L$2 = objectRef3;
                    anonymousClass1.label = 1;
                    Object receive = anonymousClass1.$channel.receive(anonymousClass1);
                    if (receive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef3;
                    anonymousClass12 = anonymousClass1;
                    objectRef = objectRef2;
                    coroutineScope2 = coroutineScope;
                    t = receive;
                    objectRef.element = t;
                    if (objectRef2.element instanceof TransformEvent.TransformStarted) {
                    }
                    anonymousClass1 = anonymousClass12;
                    coroutineScope = coroutineScope2;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                        return Unit.INSTANCE;
                    }
                }
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                }
                coroutineScope = coroutineScope3;
            }
            anonymousClass1 = this;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
        }
    }
}
