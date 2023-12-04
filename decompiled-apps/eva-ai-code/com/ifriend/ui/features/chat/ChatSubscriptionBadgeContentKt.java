package com.ifriend.ui.features.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.core.location.LocationRequestCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.R;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import com.ifriend.ui.components.text.AutoTextSizeKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionBadgeContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"ChatSubscriptionBadgeContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "chatName", "", "subscriptionStatusLabel", "isVerified", "", "enabled", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "shape", "Landroidx/compose/ui/graphics/Shape;", "ChatSubscriptionBadgeContent-1YH7lEI", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZZJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatSubscriptionBadgeContentKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b  */
    /* renamed from: ChatSubscriptionBadgeContent-1YH7lEI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7075ChatSubscriptionBadgeContent1YH7lEI(Modifier modifier, String chatName, String subscriptionStatusLabel, boolean z, boolean z2, long j, Function0<Unit> onClick, Shape shape, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        boolean z3;
        long j2;
        int i4;
        RoundedCornerShape roundedCornerShape;
        Modifier.Companion companion;
        int i5;
        long j3;
        boolean z4;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        long j4;
        AnnotatedString.Builder builder;
        int pushStyle;
        boolean z5;
        Shape shape2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(subscriptionStatusLabel, "subscriptionStatusLabel");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-402303282);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatSubscriptionBadgeContent)P(4,1,7,3,2,0:c#ui.graphics.Color)");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(chatName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(subscriptionStatusLabel) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        try {
            if (i9 != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                if ((458752 & i) != 0) {
                    if ((i2 & 32) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        j2 = j;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                if ((i2 & 64) != 0) {
                    if ((i & 3670016) == 0) {
                        i4 = startRestartGroup.changedInstance(onClick) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0) {
                            roundedCornerShape = shape;
                            if (startRestartGroup.changed(roundedCornerShape)) {
                                i6 = 8388608;
                                i3 |= i6;
                            }
                        } else {
                            roundedCornerShape = shape;
                        }
                        i6 = 4194304;
                        i3 |= i6;
                    } else {
                        roundedCornerShape = shape;
                    }
                    if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i8 != 0 ? Modifier.Companion : modifier;
                            boolean z6 = i9 != 0 ? true : z2;
                            if ((i2 & 32) != 0) {
                                j2 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7101getLight100d7_KjU();
                                i3 &= -458753;
                            }
                            if ((i2 & 128) != 0) {
                                roundedCornerShape = RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM());
                                i3 &= -29360129;
                            }
                            i5 = i3;
                            j3 = j2;
                            z4 = z6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            companion = modifier;
                            i5 = i3;
                            j3 = j2;
                            z4 = z2;
                        }
                        Shape shape3 = roundedCornerShape;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-402303282, i5, -1, "com.ifriend.ui.features.chat.ChatSubscriptionBadgeContent (ChatSubscriptionBadgeContent.kt:34)");
                        }
                        Modifier modifier3 = companion;
                        long j5 = j3;
                        Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(BackgroundKt.m420backgroundbw27NRU(ClickableModifierKt.noIndicationClickable(companion, z4, onClick), j3, shape3), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 1, null);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        startRestartGroup.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        j4 = j5;
                        ChatNameContentKt.ChatNameContent(null, chatName, z, null, startRestartGroup, (i5 & 112) | ((i5 >> 3) & 896), 9);
                        startRestartGroup.startReplaceableGroup(-1300107868);
                        builder = new AnnotatedString.Builder(0, 1, null);
                        builder.append(StringResources_androidKt.stringResource(R.string.common__subscription, startRestartGroup, 0));
                        builder.append(" ");
                        pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                        builder.append(subscriptionStatusLabel);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(pushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        startRestartGroup.endReplaceableGroup();
                        boolean z7 = z4;
                        AutoTextSizeKt.m7072AutoTextSizetoyU4E8(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), annotatedString, Color.Companion.m3328getWhite0d7_KjU(), (TextAlign) null, AppTheme.INSTANCE.getTypography(startRestartGroup, 6).getDescriptionItem(), 0L, 0L, 1, startRestartGroup, 12583296, (int) LocationRequestCompat.QUALITY_LOW_POWER);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z7;
                        shape2 = shape3;
                        modifier2 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        shape2 = roundedCornerShape;
                        modifier2 = obj;
                        z5 = z3;
                        j4 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ChatSubscriptionBadgeContentKt$ChatSubscriptionBadgeContent$2(modifier2, chatName, subscriptionStatusLabel, z, z5, j4, onClick, shape2, i, i2));
                    return;
                }
                i4 = 1572864;
                i3 |= i4;
                if ((i & 29360128) == 0) {
                }
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i5 = i3;
                j3 = j2;
                z4 = z6;
                Shape shape32 = roundedCornerShape;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier32 = companion;
                long j52 = j3;
                Modifier m750paddingVpY3zN4$default2 = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(BackgroundKt.m420backgroundbw27NRU(ClickableModifierKt.noIndicationClickable(companion, z4, onClick), j3, shape32), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 1, null);
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                j4 = j52;
                ChatNameContentKt.ChatNameContent(null, chatName, z, null, startRestartGroup, (i5 & 112) | ((i5 >> 3) & 896), 9);
                startRestartGroup.startReplaceableGroup(-1300107868);
                builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(StringResources_androidKt.stringResource(R.string.common__subscription, startRestartGroup, 0));
                builder.append(" ");
                pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                builder.append(subscriptionStatusLabel);
                Unit unit2 = Unit.INSTANCE;
                builder.pop(pushStyle);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                startRestartGroup.endReplaceableGroup();
                boolean z72 = z4;
                AutoTextSizeKt.m7072AutoTextSizetoyU4E8(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), annotatedString2, Color.Companion.m3328getWhite0d7_KjU(), (TextAlign) null, AppTheme.INSTANCE.getTypography(startRestartGroup, 6).getDescriptionItem(), 0L, 0L, 1, startRestartGroup, 12583296, (int) LocationRequestCompat.QUALITY_LOW_POWER);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z72;
                shape2 = shape32;
                modifier2 = modifier32;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            builder.append(subscriptionStatusLabel);
            Unit unit22 = Unit.INSTANCE;
            builder.pop(pushStyle);
            AnnotatedString annotatedString22 = builder.toAnnotatedString();
            startRestartGroup.endReplaceableGroup();
            boolean z722 = z4;
            AutoTextSizeKt.m7072AutoTextSizetoyU4E8(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), annotatedString22, Color.Companion.m3328getWhite0d7_KjU(), (TextAlign) null, AppTheme.INSTANCE.getTypography(startRestartGroup, 6).getDescriptionItem(), 0L, 0L, 1, startRestartGroup, 12583296, (int) LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z722;
            shape2 = shape32;
            modifier2 = modifier32;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        } catch (Throwable th) {
            builder.pop(pushStyle);
            throw th;
        }
        z3 = z2;
        if ((458752 & i) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i3 |= i4;
        if ((i & 29360128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i5 = i3;
        j3 = j2;
        z4 = z6;
        Shape shape322 = roundedCornerShape;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier322 = companion;
        long j522 = j3;
        Modifier m750paddingVpY3zN4$default22 = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(BackgroundKt.m420backgroundbw27NRU(ClickableModifierKt.noIndicationClickable(companion, z4, onClick), j3, shape322), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 1, null);
        Alignment.Vertical centerVertically22 = Alignment.Companion.getCenterVertically();
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m750paddingVpY3zN4$default22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        j4 = j522;
        ChatNameContentKt.ChatNameContent(null, chatName, z, null, startRestartGroup, (i5 & 112) | ((i5 >> 3) & 896), 9);
        startRestartGroup.startReplaceableGroup(-1300107868);
        builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.common__subscription, startRestartGroup, 0));
        builder.append(" ");
        pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
    }
}
