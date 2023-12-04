package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.WavUtil;
import com.ifriend.ui.components.MultipleEventsCutterManager;
import com.ifriend.ui.components.modifier.ColoredShadowModifierKt;
import com.ifriend.ui.theme.AppFontFamily;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlowingButton.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "eventsManager", "Lcom/ifriend/ui/components/MultipleEventsCutterManager;", "invoke", "(Lcom/ifriend/ui/components/MultipleEventsCutterManager;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowingButtonKt$GlowingButton$1 extends Lambda implements Function3<MultipleEventsCutterManager, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Color> $animatedButtonColor$delegate;
    final /* synthetic */ State<Color> $animatedButtonTextColor$delegate;
    final /* synthetic */ State<Float> $animatedShadowAlpha$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowingButtonKt$GlowingButton$1(Modifier modifier, boolean z, int i, State<Float> state, State<Color> state2, State<Color> state3, Function0<Unit> function0, String str) {
        super(3);
        this.$modifier = modifier;
        this.$isActive = z;
        this.$$dirty = i;
        this.$animatedShadowAlpha$delegate = state;
        this.$animatedButtonColor$delegate = state2;
        this.$animatedButtonTextColor$delegate = state3;
        this.$onClick = function0;
        this.$text = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlowingButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.components.buttons.GlowingButtonKt$GlowingButton$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MultipleEventsCutterManager $eventsManager;
        final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MultipleEventsCutterManager multipleEventsCutterManager, Function0<Unit> function0) {
            super(0);
            this.$eventsManager = multipleEventsCutterManager;
            this.$onClick = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GlowingButton.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.ui.components.buttons.GlowingButtonKt$GlowingButton$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C01871 extends Lambda implements Function0<Unit> {
            final /* synthetic */ Function0<Unit> $onClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01871(Function0<Unit> function0) {
                super(0);
                this.$onClick = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$onClick.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$eventsManager.processEvent(new C01871(this.$onClick));
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MultipleEventsCutterManager multipleEventsCutterManager, Composer composer, Integer num) {
        invoke(multipleEventsCutterManager, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(MultipleEventsCutterManager eventsManager, Composer composer, int i) {
        int i2;
        float GlowingButton$lambda$2;
        Modifier m7044coloredShadowPRYyx80;
        long GlowingButton$lambda$1;
        long GlowingButton$lambda$12;
        long GlowingButton$lambda$0;
        long GlowingButton$lambda$02;
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        if ((i & 14) == 0) {
            i2 = (composer.changed(eventsManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2034023463, i, -1, "com.ifriend.ui.components.buttons.GlowingButton.<anonymous> (GlowingButton.kt:38)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m781height3ABfNKs(this.$modifier, Dp.m5607constructorimpl(55)), 0.0f, 1, null);
        long m3328getWhite0d7_KjU = Color.Companion.m3328getWhite0d7_KjU();
        float m5607constructorimpl = Dp.m5607constructorimpl(19);
        GlowingButton$lambda$2 = GlowingButtonKt.GlowingButton$lambda$2(this.$animatedShadowAlpha$delegate);
        m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(fillMaxWidth$default, m3328getWhite0d7_KjU, (r17 & 2) != 0 ? 0.2f : GlowingButton$lambda$2, (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : m5607constructorimpl, (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        GlowingButton$lambda$1 = GlowingButtonKt.GlowingButton$lambda$1(this.$animatedButtonColor$delegate);
        GlowingButton$lambda$12 = GlowingButtonKt.GlowingButton$lambda$1(this.$animatedButtonColor$delegate);
        GlowingButton$lambda$0 = GlowingButtonKt.GlowingButton$lambda$0(this.$animatedButtonTextColor$delegate);
        GlowingButton$lambda$02 = GlowingButtonKt.GlowingButton$lambda$0(this.$animatedButtonTextColor$delegate);
        ButtonKt.Button(new AnonymousClass1(eventsManager, this.$onClick), m7044coloredShadowPRYyx80, this.$isActive, null, buttonDefaults.m1595buttonColorsro_MJ88(GlowingButton$lambda$1, GlowingButton$lambda$0, GlowingButton$lambda$12, GlowingButton$lambda$02, composer, ButtonDefaults.$stable << 12, 0), null, null, null, null, ComposableLambdaKt.composableLambda(composer, -463461431, true, new AnonymousClass2(this.$text, this.$$dirty, this.$animatedButtonTextColor$delegate)), composer, (this.$$dirty & 896) | C.ENCODING_PCM_32BIT, 488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlowingButton.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.components.buttons.GlowingButtonKt$GlowingButton$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ State<Color> $animatedButtonTextColor$delegate;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, int i, State<Color> state) {
            super(3);
            this.$text = str;
            this.$$dirty = i;
            this.$animatedButtonTextColor$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            long GlowingButton$lambda$0;
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-463461431, i, -1, "com.ifriend.ui.components.buttons.GlowingButton.<anonymous>.<anonymous> (GlowingButton.kt:57)");
                }
                String str = this.$text;
                GlowingButton$lambda$0 = GlowingButtonKt.GlowingButton$lambda$0(this.$animatedButtonTextColor$delegate);
                FontFamily sfProDisplay = AppFontFamily.INSTANCE.getSfProDisplay();
                TextKt.m2145Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(GlowingButton$lambda$0, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, sfProDisplay, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, (this.$$dirty >> 3) & 14, 0, (int) WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
