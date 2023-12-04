package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
public final class ChipKt$FilterChip$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    final /* synthetic */ State<Color> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Function2<Composer, Integer, Unit> $selectedIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$FilterChip$3(State<Color> state, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, SelectableChipColors selectableChipColors, boolean z2, int i2) {
        super(2);
        this.$contentColor = state;
        this.$leadingIcon = function2;
        this.$selected = z;
        this.$selectedIcon = function22;
        this.$trailingIcon = function23;
        this.$content = function3;
        this.$$dirty1 = i;
        this.$colors = selectableChipColors;
        this.$enabled = z2;
        this.$$dirty = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ State<Color> $contentColor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Function2<Composer, Integer, Unit> $selectedIcon;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, SelectableChipColors selectableChipColors, boolean z2, int i2, State<Color> state) {
            super(2);
            this.$leadingIcon = function2;
            this.$selected = z;
            this.$selectedIcon = function22;
            this.$trailingIcon = function23;
            this.$content = function3;
            this.$$dirty1 = i;
            this.$colors = selectableChipColors;
            this.$enabled = z2;
            this.$$dirty = i2;
            this.$contentColor = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C212@9835L10,211@9779L3543:Chip.kt#jmzs0o");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582291359, i, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1543702066, true, new C00321(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 48);
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
        /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00321 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ SelectableChipColors $colors;
            final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
            final /* synthetic */ State<Color> $contentColor;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
            final /* synthetic */ boolean $selected;
            final /* synthetic */ Function2<Composer, Integer, Unit> $selectedIcon;
            final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00321(Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, SelectableChipColors selectableChipColors, boolean z2, int i2, State<Color> state) {
                super(2);
                this.$leadingIcon = function2;
                this.$selected = z;
                this.$selectedIcon = function22;
                this.$trailingIcon = function23;
                this.$content = function3;
                this.$$dirty1 = i;
                this.$colors = selectableChipColors;
                this.$enabled = z2;
                this.$$dirty = i2;
                this.$contentColor = state;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                float m5607constructorimpl;
                float m5607constructorimpl2;
                float f;
                RowScopeInstance rowScopeInstance;
                Function3<RowScope, Composer, Integer, Unit> function3;
                int i2;
                float f2;
                int i3;
                float f3;
                float f4;
                float f5;
                ComposerKt.sourceInformation(composer, "C214@9884L3424:Chip.kt#jmzs0o");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1543702066, i, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
                    }
                    Modifier m780defaultMinSizeVpY3zN4$default = SizeKt.m780defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, ChipDefaults.INSTANCE.m1295getMinHeightD9Ej5fM(), 1, null);
                    if (this.$leadingIcon == null && (!this.$selected || this.$selectedIcon == null)) {
                        m5607constructorimpl = ChipKt.HorizontalPadding;
                    } else {
                        m5607constructorimpl = Dp.m5607constructorimpl(0);
                    }
                    float f6 = m5607constructorimpl;
                    if (this.$trailingIcon == null) {
                        m5607constructorimpl2 = ChipKt.HorizontalPadding;
                    } else {
                        m5607constructorimpl2 = Dp.m5607constructorimpl(0);
                    }
                    Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(m780defaultMinSizeVpY3zN4$default, f6, 0.0f, m5607constructorimpl2, 0.0f, 10, null);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    Function2<Composer, Integer, Unit> function2 = this.$leadingIcon;
                    boolean z = this.$selected;
                    Function2<Composer, Integer, Unit> function22 = this.$selectedIcon;
                    Function3<RowScope, Composer, Integer, Unit> function32 = this.$content;
                    int i4 = this.$$dirty1;
                    Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
                    SelectableChipColors selectableChipColors = this.$colors;
                    boolean z2 = this.$enabled;
                    int i5 = this.$$dirty;
                    State<Color> state = this.$contentColor;
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
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, -1943412047, "C276@13036L9:Chip.kt#jmzs0o");
                    composer.startReplaceableGroup(-1943412047);
                    ComposerKt.sourceInformation(composer, "237@10896L47,238@10968L1955,274@12948L45");
                    if (function2 != null || (z && function22 != null)) {
                        f = ChipKt.LeadingIconStartSpacing;
                        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, f), composer, 6);
                        composer.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                        composer.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        rowScopeInstance = rowScopeInstance2;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        function3 = function32;
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
                        i2 = i4;
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
                        Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, 649985685, "C:Chip.kt#jmzs0o");
                        composer.startReplaceableGroup(649985685);
                        ComposerKt.sourceInformation(composer, "240@11091L141,244@11265L297");
                        if (function2 != null) {
                            State<Color> leadingIconColor = selectableChipColors.leadingIconColor(z2, z, composer, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & 896));
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3293getAlphaimpl(leadingIconColor.getValue().m3301unboximpl())))}, function2, composer, ((i5 >> 21) & 112) | 8);
                        }
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-1943411233);
                        ComposerKt.sourceInformation(composer, "263@12416L451");
                        if (z && function22 != null) {
                            Modifier.Companion companion = Modifier.Companion;
                            long m3301unboximpl = state.getValue().m3301unboximpl();
                            composer.startReplaceableGroup(649986516);
                            ComposerKt.sourceInformation(composer, "261@12309L34");
                            if (function2 != null) {
                                f3 = ChipKt.SelectedIconContainerSize;
                                companion = ClipKt.clip(BackgroundKt.m420backgroundbw27NRU(SizeKt.m787requiredSize3ABfNKs(Modifier.Companion, f3), state.getValue().m3301unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                m3301unboximpl = selectableChipColors.backgroundColor(z2, z, composer, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & 896)).getValue().m3301unboximpl();
                            }
                            composer.endReplaceableGroup();
                            Alignment center = Alignment.Companion.getCenter();
                            composer.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                            composer.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(composer);
                            Updater.m2900setimpl(m2893constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (m2893constructorimpl3.getInserting() || !Intrinsics.areEqual(m2893constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m2893constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m2893constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                            composer.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, 333805201, "C267@12629L204:Chip.kt#jmzs0o");
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(m3301unboximpl))}, function22, composer, ((i5 >> 24) & 112) | 8);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        }
                        composer.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        f2 = ChipKt.LeadingIconEndSpacing;
                        Modifier m800width3ABfNKs = SizeKt.m800width3ABfNKs(Modifier.Companion, f2);
                        i3 = 6;
                        SpacerKt.Spacer(m800width3ABfNKs, composer, 6);
                    } else {
                        rowScopeInstance = rowScopeInstance2;
                        i3 = 6;
                        function3 = function32;
                        i2 = i4;
                    }
                    composer.endReplaceableGroup();
                    function3.invoke(rowScopeInstance, composer, Integer.valueOf((i2 & 112) | i3));
                    composer.startReplaceableGroup(-1181292829);
                    ComposerKt.sourceInformation(composer, "278@13118L43,279@13186L14,280@13225L43");
                    if (function23 != null) {
                        f4 = ChipKt.TrailingIconSpacing;
                        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, f4), composer, 6);
                        function23.invoke(composer, Integer.valueOf(i2 & 14));
                        f5 = ChipKt.TrailingIconSpacing;
                        SpacerKt.Spacer(SizeKt.m800width3ABfNKs(Modifier.Companion, f5), composer, 6);
                    }
                    composer.endReplaceableGroup();
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
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C210@9687L3645:Chip.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(722126431, i, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3293getAlphaimpl(this.$contentColor.getValue().m3301unboximpl())))}, ComposableLambdaKt.composableLambda(composer, 1582291359, true, new AnonymousClass1(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
