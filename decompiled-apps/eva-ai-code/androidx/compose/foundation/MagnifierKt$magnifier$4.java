package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Magnifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
    final /* synthetic */ Function1<DpSize, Unit> $onSizeChanged;
    final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
    final /* synthetic */ Function1<Density, Offset> $sourceCenter;
    final /* synthetic */ MagnifierStyle $style;
    final /* synthetic */ float $zoom;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierKt$magnifier$4(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f, Function1<? super DpSize, Unit> function13, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
        super(3);
        this.$sourceCenter = function1;
        this.$magnifierCenter = function12;
        this.$zoom = f;
        this.$onSizeChanged = function13;
        this.$platformMagnifierFactory = platformMagnifierFactory;
        this.$style = magnifierStyle;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-454877003);
        ComposerKt.sourceInformation(composer, "C271@11563L7,272@11602L7,273@11650L47,274@11729L34,275@11798L37,276@11859L26,277@11918L35,278@11984L331,288@12344L62,293@12536L107,305@13220L2602,371@15879L344,383@16592L78:Magnifier.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-454877003, i, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:270)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(composer);
        View view = (View) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume2;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3007boximpl(Offset.Companion.m3033getUnspecifiedF1C5BW0()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
        State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
        State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer, 0);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(density, rememberUpdatedState, mutableState));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new MagnifierKt$magnifier$4$isMagnifierShown$2$1(state));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        State state2 = (State) rememberedValue3;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue4;
        float f = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
        MagnifierStyle magnifierStyle = this.$style;
        EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f), magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.Companion.getTextDefault()))}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, mutableSharedFlow, rememberUpdatedState4, state2, state, rememberUpdatedState2, mutableState, rememberUpdatedState3, null), composer, 72);
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(mutableState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = (Function1) new MagnifierKt$magnifier$4$2$1(mutableState);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier drawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, (Function1) rememberedValue5), new AnonymousClass3(mutableSharedFlow));
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(state);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = (Function1) new MagnifierKt$magnifier$4$4$1(state);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue6, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return semantics$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<Offset> mutableState) {
        return mutableState.getValue().m3028unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m3007boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {363}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
        final /* synthetic */ Density $density;
        final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
        final /* synthetic */ MutableSharedFlow<Unit> $onNeedsUpdate;
        final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
        final /* synthetic */ MagnifierStyle $style;
        final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
        final /* synthetic */ State<Function1<DpSize, Unit>> $updatedOnSizeChanged$delegate;
        final /* synthetic */ State<Float> $updatedZoom$delegate;
        final /* synthetic */ View $view;
        final /* synthetic */ float $zoom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f, MutableSharedFlow<Unit> mutableSharedFlow, State<? extends Function1<? super DpSize, Unit>> state, State<Boolean> state2, State<Offset> state3, State<? extends Function1<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
            this.$view = view;
            this.$density = density;
            this.$zoom = f;
            this.$onNeedsUpdate = mutableSharedFlow;
            this.$updatedOnSizeChanged$delegate = state;
            this.$isMagnifierShown$delegate = state2;
            this.$sourceCenterInRoot$delegate = state3;
            this.$updatedMagnifierCenter$delegate = state4;
            this.$anchorPositionInRoot$delegate = mutableState;
            this.$updatedZoom$delegate = state5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedOnSizeChanged$delegate, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
            final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            final /* synthetic */ Density $density;
            final /* synthetic */ State<Boolean> $isMagnifierShown$delegate;
            final /* synthetic */ PlatformMagnifier $magnifier;
            final /* synthetic */ Ref.LongRef $previousSize;
            final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;
            final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
            final /* synthetic */ State<Function1<DpSize, Unit>> $updatedOnSizeChanged$delegate;
            final /* synthetic */ State<Float> $updatedZoom$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(PlatformMagnifier platformMagnifier, Density density, State<Boolean> state, State<Offset> state2, State<? extends Function1<? super Density, Offset>> state3, MutableState<Offset> mutableState, State<Float> state4, Ref.LongRef longRef, State<? extends Function1<? super DpSize, Unit>> state5) {
                super(0);
                this.$magnifier = platformMagnifier;
                this.$density = density;
                this.$isMagnifierShown$delegate = state;
                this.$sourceCenterInRoot$delegate = state2;
                this.$updatedMagnifierCenter$delegate = state3;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedZoom$delegate = state4;
                this.$previousSize = longRef;
                this.$updatedOnSizeChanged$delegate = state5;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long m3033getUnspecifiedF1C5BW0;
                if (MagnifierKt$magnifier$4.invoke$lambda$10(this.$isMagnifierShown$delegate)) {
                    PlatformMagnifier platformMagnifier = this.$magnifier;
                    long invoke$lambda$8 = MagnifierKt$magnifier$4.invoke$lambda$8(this.$sourceCenterInRoot$delegate);
                    Object invoke = MagnifierKt$magnifier$4.invoke$lambda$4(this.$updatedMagnifierCenter$delegate).invoke(this.$density);
                    MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                    long m3028unboximpl = ((Offset) invoke).m3028unboximpl();
                    if (OffsetKt.m3037isSpecifiedk4lQ0M(m3028unboximpl)) {
                        m3033getUnspecifiedF1C5BW0 = Offset.m3023plusMKHz9U(MagnifierKt$magnifier$4.invoke$lambda$1(mutableState), m3028unboximpl);
                    } else {
                        m3033getUnspecifiedF1C5BW0 = Offset.Companion.m3033getUnspecifiedF1C5BW0();
                    }
                    platformMagnifier.mo505updateWko1d7g(invoke$lambda$8, m3033getUnspecifiedF1C5BW0, MagnifierKt$magnifier$4.invoke$lambda$5(this.$updatedZoom$delegate));
                    long mo504getSizeYbymL2g = this.$magnifier.mo504getSizeYbymL2g();
                    Ref.LongRef longRef = this.$previousSize;
                    Density density = this.$density;
                    State<Function1<DpSize, Unit>> state = this.$updatedOnSizeChanged$delegate;
                    if (IntSize.m5765equalsimpl0(mo504getSizeYbymL2g, longRef.element)) {
                        return;
                    }
                    longRef.element = mo504getSizeYbymL2g;
                    Function1 invoke$lambda$6 = MagnifierKt$magnifier$4.invoke$lambda$6(state);
                    if (invoke$lambda$6 != null) {
                        invoke$lambda$6.invoke(DpSize.m5693boximpl(density.mo586toDpSizekrfVVM(IntSizeKt.m5777toSizeozmzZPI(mo504getSizeYbymL2g))));
                        return;
                    }
                    return;
                }
                this.$magnifier.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00071 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final /* synthetic */ PlatformMagnifier $magnifier;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00071(PlatformMagnifier platformMagnifier, Continuation<? super C00071> continuation) {
                super(2, continuation);
                this.$magnifier = platformMagnifier;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00071(this.$magnifier, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return ((C00071) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$magnifier.updateContent();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PlatformMagnifier platformMagnifier;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PlatformMagnifier create = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                Ref.LongRef longRef = new Ref.LongRef();
                long mo504getSizeYbymL2g = create.mo504getSizeYbymL2g();
                Density density = this.$density;
                Function1 invoke$lambda$6 = MagnifierKt$magnifier$4.invoke$lambda$6(this.$updatedOnSizeChanged$delegate);
                if (invoke$lambda$6 != null) {
                    invoke$lambda$6.invoke(DpSize.m5693boximpl(density.mo586toDpSizekrfVVM(IntSizeKt.m5777toSizeozmzZPI(mo504getSizeYbymL2g))));
                }
                longRef.element = mo504getSizeYbymL2g;
                FlowKt.launchIn(FlowKt.onEach(this.$onNeedsUpdate, new C00071(create, null)), coroutineScope);
                try {
                    this.L$0 = create;
                    this.label = 1;
                    if (FlowKt.collect(SnapshotStateKt.snapshotFlow(new AnonymousClass2(create, this.$density, this.$isMagnifierShown$delegate, this.$sourceCenterInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedZoom$delegate, longRef, this.$updatedOnSizeChanged$delegate)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    platformMagnifier = create;
                } catch (Throwable th) {
                    th = th;
                    platformMagnifier = create;
                    platformMagnifier.dismiss();
                    throw th;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                platformMagnifier = (PlatformMagnifier) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }
            platformMagnifier.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Magnifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<DrawScope, Unit> {
        final /* synthetic */ MutableSharedFlow<Unit> $onNeedsUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(MutableSharedFlow<Unit> mutableSharedFlow) {
            super(1);
            this.$onNeedsUpdate = mutableSharedFlow;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            this.$onNeedsUpdate.tryEmit(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Density, Offset> invoke$lambda$3(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Density, Offset> invoke$lambda$4(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<DpSize, Unit> invoke$lambda$6(State<? extends Function1<? super DpSize, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$8(State<Offset> state) {
        return state.getValue().m3028unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
