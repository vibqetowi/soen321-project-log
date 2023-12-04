package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ int $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderTapModifier$2(boolean z, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i, boolean z2, MutableState<Float> mutableState, State<Float> state, State<? extends Function0<Unit>> state2) {
        super(3);
        this.$enabled = z;
        this.$draggableState = draggableState;
        this.$interactionSource = mutableInteractionSource;
        this.$maxPx = i;
        this.$isRtl = z2;
        this.$pressOffset = mutableState;
        this.$rawOffset = state;
        this.$gestureEndAction = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(2040469710);
        ComposerKt.sourceInformation(composer, "C1173@48923L24:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2040469710, i, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1171)");
        }
        if (this.$enabled) {
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{this.$draggableState, this.$interactionSource, Integer.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, coroutineScope, this.$draggableState, this.$gestureEndAction, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {1176}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DraggableState $draggableState;
        final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ int $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        final /* synthetic */ CoroutineScope $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, int i, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isRtl = z;
            this.$maxPx = i;
            this.$pressOffset = mutableState;
            this.$rawOffset = state;
            this.$scope = coroutineScope;
            this.$draggableState = draggableState;
            this.$gestureEndAction = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Slider.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<Offset, Unit> {
            final /* synthetic */ DraggableState $draggableState;
            final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state) {
                super(1);
                this.$scope = coroutineScope;
                this.$draggableState = draggableState;
                this.$gestureEndAction = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m1979invokek4lQ0M(offset.m3028unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m1979invokek4lQ0M(long j) {
                BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00591(this.$draggableState, this.$gestureEndAction, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {1188}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00591(DraggableState draggableState, State<? extends Function0<Unit>> state, Continuation<? super C00591> continuation) {
                    super(2, continuation);
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00591(this.$draggableState, this.$gestureEndAction, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00601 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C00601(Continuation<? super C00601> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C00601 c00601 = new C00601(continuation);
                        c00601.L$0 = obj;
                        return c00601;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                        return ((C00601) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            ((DragScope) this.L$0).dragBy(0.0f);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$draggableState.drag(MutatePriority.UserInput, new C00601(null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    this.$gestureEndAction.getValue().invoke();
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Slider.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {1181}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00581 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ int $maxPx;
            final /* synthetic */ MutableState<Float> $pressOffset;
            final /* synthetic */ State<Float> $rawOffset;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00581(boolean z, int i, MutableState<Float> mutableState, State<Float> state, Continuation<? super C00581> continuation) {
                super(3, continuation);
                this.$isRtl = z;
                this.$maxPx = i;
                this.$pressOffset = mutableState;
                this.$rawOffset = state;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m1978invoked4ec7I(pressGestureScope, offset.m3028unboximpl(), continuation);
            }

            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final Object m1978invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
                C00581 c00581 = new C00581(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                c00581.L$0 = pressGestureScope;
                c00581.J$0 = j;
                return c00581.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                        long j = this.J$0;
                        this.$pressOffset.setValue(Boxing.boxFloat((this.$isRtl ? this.$maxPx - Offset.m3018getXimpl(j) : Offset.m3018getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                        this.label = 1;
                        if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (GestureCancellationException unused) {
                    this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default((PointerInputScope) this.L$0, null, null, new C00581(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null), new AnonymousClass2(this.$scope, this.$draggableState, this.$gestureEndAction), this, 3, null) == coroutine_suspended) {
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
