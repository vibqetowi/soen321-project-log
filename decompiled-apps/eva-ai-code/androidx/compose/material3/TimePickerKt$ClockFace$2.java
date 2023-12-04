package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$ClockFace$2 extends Lambda implements Function3<List<? extends Integer>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockFace$2(TimePickerState timePickerState, boolean z, TimePickerColors timePickerColors, int i) {
        super(3);
        this.$state = timePickerState;
        this.$autoSwitchToMinute = z;
        this.$colors = timePickerColors;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list, Composer composer, Integer num) {
        invoke((List<Integer>) list, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(List<Integer> screen, Composer composer, int i) {
        Modifier clockDial;
        Modifier drawSelector;
        float f;
        Intrinsics.checkNotNullParameter(screen, "screen");
        ComposerKt.sourceInformation(composer, "C1141@44425L1479:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1628166511, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1140)");
        }
        clockDial = TimePickerKt.clockDial(Modifier.Companion, this.$state, this.$autoSwitchToMinute);
        drawSelector = TimePickerKt.drawSelector(SizeKt.m795size3ABfNKs(clockDial, TimePickerTokens.INSTANCE.m2753getClockDialContainerSizeD9Ej5fM()), this.$state, this.$colors);
        f = TimePickerKt.OuterCircleSizeRadius;
        TimePickerKt.m2159CircularLayoutuFdPcIQ(drawSelector, f, ComposableLambdaKt.composableLambda(composer, -1385633737, true, new AnonymousClass1(this.$colors, screen, this.$state, this.$autoSwitchToMinute, this.$$dirty)), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ List<Integer> $screen;
        final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TimePickerColors timePickerColors, List<Integer> list, TimePickerState timePickerState, boolean z, int i) {
            super(2);
            this.$colors = timePickerColors;
            this.$screen = list;
            this.$state = timePickerState;
            this.$autoSwitchToMinute = z;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C1148@44687L1207:TimePicker.kt#uh7d8r");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1385633737, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1147)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(this.$colors.m2148clockDialContentColorvNxB06k$material3_release(false)))}, ComposableLambdaKt.composableLambda(composer, -2018362505, true, new C00621(this.$screen, this.$state, this.$autoSwitchToMinute, this.$$dirty)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TimePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00621 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ List<Integer> $screen;
            final /* synthetic */ TimePickerState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00621(List<Integer> list, TimePickerState timePickerState, boolean z, int i) {
                super(2);
                this.$screen = list;
                this.$state = timePickerState;
                this.$autoSwitchToMinute = z;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                float f;
                int intValue;
                ComposerKt.sourceInformation(composer, "C1161@45270L592:TimePicker.kt#uh7d8r");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2018362505, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1150)");
                    }
                    composer.startReplaceableGroup(-504302349);
                    ComposerKt.sourceInformation(composer, "*1157@45091L64");
                    int size = this.$screen.size();
                    TimePickerState timePickerState = this.$state;
                    List<Integer> list = this.$screen;
                    boolean z = this.$autoSwitchToMinute;
                    int i2 = this.$$dirty;
                    for (int i3 = 0; i3 < size; i3++) {
                        if (!timePickerState.is24hour() || Selection.m1968equalsimpl0(timePickerState.m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1973getMinuteJiIwxys())) {
                            intValue = list.get(i3).intValue();
                        } else {
                            intValue = list.get(i3).intValue() % 12;
                        }
                        TimePickerKt.ClockText(timePickerState, intValue, z, composer, (i2 & 14) | (i2 & 896));
                    }
                    composer.endReplaceableGroup();
                    if (Selection.m1968equalsimpl0(this.$state.m2185getSelectionJiIwxys$material3_release(), Selection.Companion.m1972getHourJiIwxys()) && this.$state.is24hour()) {
                        Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(SizeKt.m795size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m2753getClockDialContainerSizeD9Ej5fM()), Color.Companion.m3326getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                        f = TimePickerKt.InnerCircleRadius;
                        TimePickerKt.m2159CircularLayoutuFdPcIQ(m420backgroundbw27NRU, f, ComposableLambdaKt.composableLambda(composer, -448649404, true, new AnonymousClass2(this.$state, this.$autoSwitchToMinute, this.$$dirty)), composer, 432, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TimePicker.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ int $$dirty;
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TimePickerState timePickerState, boolean z, int i) {
                    super(2);
                    this.$state = timePickerState;
                    this.$autoSwitchToMinute = z;
                    this.$$dirty = i;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    List list;
                    List list2;
                    ComposerKt.sourceInformation(composer, "C*1170@45750L64:TimePicker.kt#uh7d8r");
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-448649404, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1167)");
                        }
                        list = TimePickerKt.ExtraHours;
                        int size = list.size();
                        TimePickerState timePickerState = this.$state;
                        boolean z = this.$autoSwitchToMinute;
                        int i2 = this.$$dirty;
                        for (int i3 = 0; i3 < size; i3++) {
                            list2 = TimePickerKt.ExtraHours;
                            TimePickerKt.ClockText(timePickerState, ((Number) list2.get(i3)).intValue(), z, composer, (i2 & 14) | (i2 & 896));
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }
        }
    }
}
