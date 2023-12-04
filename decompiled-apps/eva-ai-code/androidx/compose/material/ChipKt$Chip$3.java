package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$Chip$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    final /* synthetic */ State<Color> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$Chip$3(State<Color> state, Function2<? super Composer, ? super Integer, Unit> function2, ChipColors chipColors, boolean z, int i, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$contentColor$delegate = state;
        this.$leadingIcon = function2;
        this.$colors = chipColors;
        this.$enabled = z;
        this.$$dirty = i;
        this.$content = function3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ChipKt$Chip$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, ChipColors chipColors, boolean z, int i, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.$leadingIcon = function2;
            this.$colors = chipColors;
            this.$enabled = z;
            this.$$dirty = i;
            this.$content = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C111@5036L10,110@4980L1346:Chip.kt#jmzs0o");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(667535631, i, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:109)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1131213696, true, new C00311(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Chip.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.ChipKt$Chip$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00311 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ ChipColors $colors;
            final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00311(Function2<? super Composer, ? super Integer, Unit> function2, ChipColors chipColors, boolean z, int i, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
                super(2);
                this.$leadingIcon = function2;
                this.$colors = chipColors;
                this.$enabled = z;
                this.$$dirty = i;
                this.$content = function3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                float m5607constructorimpl;
                float f;
                float f2;
                float f3;
                ComposerKt.sourceInformation(composer, "C113@5085L1227:Chip.kt#jmzs0o");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1131213696, i, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:112)");
                    }
                    Modifier m780defaultMinSizeVpY3zN4$default = SizeKt.m780defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, ChipDefaults.INSTANCE.m1295getMinHeightD9Ej5fM(), 1, null);
                    if (this.$leadingIcon == null) {
                        m5607constructorimpl = ChipKt.HorizontalPadding;
                    } else {
                        m5607constructorimpl = Dp.m5607constructorimpl(0);
                    }
                    f = ChipKt.HorizontalPadding;
                    Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(m780defaultMinSizeVpY3zN4$default, m5607constructorimpl, 0.0f, f, 0.0f, 10, null);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    Function2<Composer, Integer, Unit> function2 = this.$leadingIcon;
                    ChipColors chipColors = this.$colors;
                    boolean z = this.$enabled;
                    int i2 = this.$$dirty;
                    Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
                    composer.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                    composer.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
                    Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, 2084788937, "C137@6285L9:Chip.kt#jmzs0o");
                    composer.startReplaceableGroup(2084788937);
                    ComposerKt.sourceInformation(composer, "128@5738L47,129@5848L32,130@5905L267,135@6197L45");
                    if (function2 != null) {
                        f2 = ChipKt.LeadingIconStartSpacing;
                        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, f2), composer, 6);
                        State<Color> leadingIconContentColor = chipColors.leadingIconContentColor(z, composer, ((i2 >> 6) & 14) | ((i2 >> 15) & 112));
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3293getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, function2, composer, ((i2 >> 18) & 112) | 8);
                        f3 = ChipKt.LeadingIconEndSpacing;
                        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, f3), composer, 6);
                    }
                    composer.endReplaceableGroup();
                    function3.invoke(rowScopeInstance, composer, Integer.valueOf(((i2 >> 21) & 112) | 6));
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                return state.getValue().m3301unboximpl();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long Chip$lambda$1;
        ComposerKt.sourceInformation(composer, "C109@4894L1442:Chip.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(139076687, i, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:108)");
            }
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            Chip$lambda$1 = ChipKt.Chip$lambda$1(this.$contentColor$delegate);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(Color.m3293getAlphaimpl(Chip$lambda$1)))}, ComposableLambdaKt.composableLambda(composer, 667535631, true, new AnonymousClass1(this.$leadingIcon, this.$colors, this.$enabled, this.$$dirty, this.$content)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
