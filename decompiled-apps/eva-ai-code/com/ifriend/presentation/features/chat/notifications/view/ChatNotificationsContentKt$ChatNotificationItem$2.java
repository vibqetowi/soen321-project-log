package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import com.ifriend.ui.components.shadow.SextingShadowContainerKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatNotificationsContentKt$ChatNotificationItem$2 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ChatNotificationUi $item;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsContentKt$ChatNotificationItem$2(Function0<Unit> function0, int i, ChatNotificationUi chatNotificationUi) {
        super(3);
        this.$onClick = function0;
        this.$$dirty = i;
        this.$item = chatNotificationUi;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope SwipeToDismiss, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SwipeToDismiss, "$this$SwipeToDismiss");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1182149379, i, -1, "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationItem.<anonymous> (ChatNotificationsContent.kt:171)");
            }
            CardColors m1607cardColorsro_MJ88 = CardDefaults.INSTANCE.m1607cardColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.in_app_notification_background, composer, 0), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
            RoundedCornerShape large = AppTheme.INSTANCE.getShapes(composer, AppTheme.$stable).getLarge();
            CardKt.Card(this.$onClick, SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl((float) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)), false, large, m1607cardColorsro_MJ88, null, null, null, ComposableLambdaKt.composableLambda(composer, 447596920, true, new AnonymousClass1(this.$item)), composer, 100663344 | ((this.$$dirty >> 3) & 14), 228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatNotificationsContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/ColumnScope;", "invoke", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContentKt$ChatNotificationItem$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ ChatNotificationUi $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatNotificationUi chatNotificationUi) {
            super(3);
            this.$item = chatNotificationUi;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope Card, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(447596920, i, -1, "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationItem.<anonymous>.<anonymous> (ChatNotificationsContent.kt:181)");
                }
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7168getExtraSmallD9Ej5fM(), 1, null);
                ChatNotificationUi chatNotificationUi = this.$item;
                composer.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
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
                AppAsyncImageKt.AppAsyncImage(chatNotificationUi.getAvatarUrl(), ClipKt.clip(SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), null, null, null, PainterResources_androidKt.painterResource(com.ifriend.ui.R.drawable.ic_default_bot_placeholder, composer, 0), PainterResources_androidKt.painterResource(com.ifriend.ui.R.drawable.ic_default_bot_placeholder, composer, 0), composer, 2359296, 28);
                Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                composer.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default);
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
                Updater.m2900setimpl(m2893constructorimpl2, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String title = chatNotificationUi.getTitle();
                long m7100getLight0d7_KjU = AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7100getLight0d7_KjU();
                FontFamily sfProDisplay = AppFontFamily.INSTANCE.getSfProDisplay();
                FontWeight bold = FontWeight.Companion.getBold();
                TextKt.m2145Text4IGK_g(title, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), m7100getLight0d7_KjU, TextUnitKt.getSp(14), (FontStyle) null, bold, sfProDisplay, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5517getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199728, 3120, 120720);
                SextingShadowContainerKt.SextingShadowContainer(null, chatNotificationUi.isContentHidden(), ComposableLambdaKt.composableLambda(composer, -2096352699, true, new ChatNotificationsContentKt$ChatNotificationItem$2$1$1$1$1(chatNotificationUi)), composer, 384, 1);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
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
