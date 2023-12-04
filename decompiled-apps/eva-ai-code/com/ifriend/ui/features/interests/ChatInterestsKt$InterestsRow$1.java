package com.ifriend.ui.features.interests;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.theme.AppColors;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInterests.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ChatInterestsKt$InterestsRow$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ List<String> $items;
    final /* synthetic */ float $itemsSpacing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInterestsKt$InterestsRow$1(List<String> list, float f) {
        super(1);
        this.$items = list;
        this.$itemsSpacing = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInterests.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.features.interests.ChatInterestsKt$InterestsRow$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ List<String> $items;
        final /* synthetic */ float $itemsSpacing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list, float f) {
            super(4);
            this.$items = list;
            this.$itemsSpacing = f;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 112) == 0) {
                i3 = (composer.changed(i) ? 32 : 16) | i2;
            } else {
                i3 = i2;
            }
            if ((i3 & 721) != 144 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-300245161, i2, -1, "com.ifriend.ui.features.interests.InterestsRow.<anonymous>.<anonymous> (ChatInterests.kt:40)");
                }
                List<String> list = this.$items;
                String str = list.get(i % list.size());
                Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, this.$itemsSpacing, 0.0f, 0.0f, 0.0f, 14, null), AppColors.Companion.m7141getTranslucentCardColor0d7_KjU(), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(15)));
                composer.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m420backgroundbw27NRU);
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
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                long sp = TextUnitKt.getSp(16);
                FontFamily sfProDisplay = AppFontFamily.INSTANCE.getSfProDisplay();
                TextKt.m2145Text4IGK_g(str, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, 6).m7176getSmallD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, 6).m7178getSmallestD9Ej5fM(), 1, null), AppTheme.INSTANCE.getColors(composer, 6).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, FontWeight.Companion.getBold(), sfProDisplay, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 1772544, 0, 130448);
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

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.CC.items$default(LazyRow, Integer.MAX_VALUE, null, null, ComposableLambdaKt.composableLambdaInstance(-300245161, true, new AnonymousClass1(this.$items, this.$itemsSpacing)), 6, null);
    }
}
