package com.ifriend.ui.features.pager;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.R;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import com.ifriend.ui.features.chat.ChatAvatarContentKt;
import com.ifriend.ui.features.chat.ChatNameContentKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HorizontalSelectChatPageContent.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u008f\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2F\u0010\r\u001aB\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a%\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"AspectRatioAvatar", "", "HorizontalSelectChatPageContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "background", "Landroidx/compose/ui/graphics/Color;", "borderColor", "isNeedBorder", "", "horizontalContentPadding", "Landroidx/compose/ui/unit/Dp;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function3;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ParameterName;", "name", "maxWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalSelectChatPageContent-foz-QRw", "(Landroidx/compose/ui/Modifier;JJZFLkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "SelectChatAvatarContent", "avatarUrl", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "logoUrl", "isVerified", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalSelectChatPageContentKt {
    private static final float AspectRatioAvatar = 1.192f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0154  */
    /* renamed from: HorizontalSelectChatPageContent-foz-QRw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7081HorizontalSelectChatPageContentfozQRw(Modifier modifier, long j, long j2, boolean z, float f, Function5<? super BoxScope, ? super Dp, ? super Dp, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        boolean z2;
        int i5;
        float f2;
        int i6;
        long j5;
        boolean z3;
        float f3;
        Modifier modifier2;
        long j6;
        int i7;
        Modifier modifier3;
        long j7;
        boolean z4;
        long j8;
        float f4;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(594193306);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalSelectChatPageContent)P(5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,4,3:c#ui.unit.Dp)");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            j3 = j;
            i3 |= startRestartGroup.changed(j3) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j4 = j2;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                    if ((i2 & 32) != 0) {
                        if ((i & 458752) == 0) {
                            i6 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                        }
                        if ((i3 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i9 != 0 ? Modifier.Companion : modifier;
                                if (i10 != 0) {
                                    j3 = Color.Companion.m3317getBlack0d7_KjU();
                                }
                                if ((i2 & 4) != 0) {
                                    j4 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7100getLight0d7_KjU();
                                    i3 &= -897;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if (i5 != 0) {
                                    f3 = Dp.m5607constructorimpl(0);
                                    j6 = j3;
                                    j5 = j4;
                                    z3 = z2;
                                    modifier2 = companion;
                                    i7 = i3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(594193306, i7, -1, "com.ifriend.ui.features.pager.HorizontalSelectChatPageContent (HorizontalSelectChatPageContent.kt:40)");
                                    }
                                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -844839804, true, new HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$1(f3, modifier2, z3, j5, i7, j6, content)), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier2;
                                    j7 = j6;
                                    z4 = z3;
                                    j8 = j5;
                                    f4 = f3;
                                } else {
                                    j5 = j4;
                                    z3 = z2;
                                    f3 = f2;
                                    modifier2 = companion;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    j5 = j4;
                                    z3 = z2;
                                    f3 = f2;
                                    modifier2 = modifier;
                                    j6 = j3;
                                    i7 = i3 & (-897);
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -844839804, true, new HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$1(f3, modifier2, z3, j5, i7, j6, content)), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier2;
                                    j7 = j6;
                                    z4 = z3;
                                    j8 = j5;
                                    f4 = f3;
                                } else {
                                    j5 = j4;
                                    z3 = z2;
                                    f3 = f2;
                                    modifier2 = modifier;
                                }
                            }
                            j6 = j3;
                            i7 = i3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -844839804, true, new HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$1(f3, modifier2, z3, j5, i7, j6, content)), startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 7);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            j7 = j6;
                            z4 = z3;
                            j8 = j5;
                            f4 = f3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j7 = j3;
                            j8 = j4;
                            z4 = z2;
                            f4 = f2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new HorizontalSelectChatPageContentKt$HorizontalSelectChatPageContent$2(modifier3, j7, j8, z4, f4, content, i, i2));
                        return;
                    }
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i6;
                    if ((i3 & 374491) == 74898) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                }
                f2 = f;
                if ((i2 & 32) != 0) {
                }
                i3 |= i6;
                if ((i3 & 374491) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i2 & 32) != 0) {
            }
            i3 |= i6;
            if ((i3 & 374491) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
        }
        j3 = j;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i2 & 32) != 0) {
        }
        i3 |= i6;
        if ((i3 & 374491) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
    }

    public static final void SelectChatAvatarContent(String name, String logoUrl, boolean z, Composer composer, int i) {
        int i2;
        TextStyle m5100copyv2rsoow;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Composer startRestartGroup = composer.startRestartGroup(-505514306);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectChatAvatarContent)P(2,1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(name) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(logoUrl) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-505514306, i2, -1, "com.ifriend.ui.features.pager.SelectChatAvatarContent (HorizontalSelectChatPageContent.kt:70)");
            }
            Modifier m748padding3ABfNKs = PaddingKt.m748padding3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7167getExtraMediumD9Ej5fM());
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m748padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChatAvatarContentKt.ChatAvatarContent(logoUrl, SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(60)), startRestartGroup, ((i2 >> 3) & 14) | 48, 0);
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            m5100copyv2rsoow = r12.m5100copyv2rsoow((r48 & 1) != 0 ? r12.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r12.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(18), (r48 & 4) != 0 ? r12.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r12.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r12.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r12.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r12.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r12.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r12.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r12.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r12.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r12.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r12.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r12.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r12.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r12.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r12.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r12.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r12.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r12.platformStyle : null, (r48 & 1048576) != 0 ? r12.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r12.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r12.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? AppTheme.INSTANCE.getTypography(startRestartGroup, 6).getTitleItemBold().paragraphStyle.getTextMotion() : null);
            ChatNameContentKt.ChatNameContent(m752paddingqDBjuR0$default, name, z, m5100copyv2rsoow, startRestartGroup, ((i2 << 3) & 112) | (i2 & 896), 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new HorizontalSelectChatPageContentKt$SelectChatAvatarContent$2(name, logoUrl, z, i));
    }

    public static final void SelectChatAvatarContent(Modifier modifier, String avatarUrl, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Composer startRestartGroup = composer.startRestartGroup(335325792);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectChatAvatarContent)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(avatarUrl) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(335325792, i2, -1, "com.ifriend.ui.features.pager.SelectChatAvatarContent (HorizontalSelectChatPageContent.kt:94)");
            }
            AppAsyncImageKt.AppAsyncImage(avatarUrl, modifier, null, ContentScale.Companion.getCrop(), null, PainterResources_androidKt.painterResource(R.drawable.img_default_bot_placeholder, startRestartGroup, 0), PainterResources_androidKt.painterResource(R.drawable.img_default_bot_placeholder, startRestartGroup, 0), startRestartGroup, ((i2 >> 3) & 14) | 2362368 | ((i2 << 3) & 112), 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new HorizontalSelectChatPageContentKt$SelectChatAvatarContent$3(modifier, avatarUrl, i));
    }
}
