package com.ifriend.ui.features.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.R;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import com.ifriend.ui.components.shadow.ColoredShadowKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAvatarContent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ChatAvatarContent", "", "avatarUri", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatAvatarContentKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatAvatarContent(String avatarUri, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Modifier m7067coloredShadowPRYyx80;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(avatarUri, "avatarUri");
        Composer startRestartGroup = composer.startRestartGroup(-1867296741);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatAvatarContent)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(avatarUri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1867296741, i3, -1, "com.ifriend.ui.features.chat.ChatAvatarContent (ChatAvatarContent.kt:24)");
                }
                int i5 = (i3 >> 3) & 14;
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                int i6 = i5 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i6 & 112) | (i6 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                int i7 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier2 = companion;
                AppAsyncImageKt.AppAsyncImage(avatarUri, SizeKt.fillMaxSize$default(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.getCircleShape()), 0.0f, 1, null), null, null, null, PainterResources_androidKt.painterResource(R.drawable.ic_default_bot_placeholder, startRestartGroup, 0), PainterResources_androidKt.painterResource(R.drawable.ic_default_bot_placeholder, startRestartGroup, 0), startRestartGroup, (i3 & 14) | 2359296, 28);
                float f = 5;
                m7067coloredShadowPRYyx80 = ColoredShadowKt.m7067coloredShadowPRYyx80(boxScopeInstance.align(SizeKt.m795size3ABfNKs(BackgroundKt.m420backgroundbw27NRU(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7168getExtraSmallD9Ej5fM(), 0.0f, 11, null), AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7100getLight0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m5607constructorimpl(10)), Alignment.Companion.getBottomEnd()), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : 0.7f, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
                BoxKt.Box(m7067coloredShadowPRYyx80, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                obj = modifier2;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ChatAvatarContentKt$ChatAvatarContent$2(avatarUri, obj, i, i2));
            return;
        }
        obj = modifier;
        if ((i3 & 91) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i52 = (i3 >> 3) & 14;
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        int i62 = i52 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i62 & 112) | (i62 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
        int i72 = ((((i52 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i72 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier modifier22 = companion;
        AppAsyncImageKt.AppAsyncImage(avatarUri, SizeKt.fillMaxSize$default(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.getCircleShape()), 0.0f, 1, null), null, null, null, PainterResources_androidKt.painterResource(R.drawable.ic_default_bot_placeholder, startRestartGroup, 0), PainterResources_androidKt.painterResource(R.drawable.ic_default_bot_placeholder, startRestartGroup, 0), startRestartGroup, (i3 & 14) | 2359296, 28);
        float f2 = 5;
        m7067coloredShadowPRYyx80 = ColoredShadowKt.m7067coloredShadowPRYyx80(boxScopeInstance2.align(SizeKt.m795size3ABfNKs(BackgroundKt.m420backgroundbw27NRU(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7168getExtraSmallD9Ej5fM(), 0.0f, 11, null), AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7100getLight0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m5607constructorimpl(10)), Alignment.Companion.getBottomEnd()), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : 0.7f, Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f2), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
        BoxKt.Box(m7067coloredShadowPRYyx80, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier22;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
