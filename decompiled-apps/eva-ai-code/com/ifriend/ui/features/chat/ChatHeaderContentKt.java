package com.ifriend.ui.features.chat;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import com.ifriend.ui.features.avatar.AvatarContentKt;
import com.ifriend.ui.imageView.animatedAvatarView.AnimatedAvatarViewState;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aÿ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001a³\u0001\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00142\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u0014H\u0007¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"ChatHeaderContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "animatedAvatarState", "Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;", "title", "", "lvlLabel", "lvlProgress", "", "isVisibleLvlProgress", "", "isVisibleUpdateIndicator", "isVisibleVerified", "isVisibleBackButton", "isVisibleUnreadIndicator", "unreadMessagesLabel", "onTitleClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "onAvatarClick", "onGenerationClick", "onPlayClick", "onPauseClick", "onBackClick", "additionalContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;Ljava/lang/String;Ljava/lang/String;FZZZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ChatHeaderTitleContent", "(Landroidx/compose/ui/Modifier;Lcom/ifriend/ui/imageView/animatedAvatarView/AnimatedAvatarViewState;Ljava/lang/String;Ljava/lang/String;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "UnreadIndicator", "isVisible", "countLabel", "(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatHeaderContentKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatHeaderContent(Modifier modifier, AnimatedAvatarViewState animatedAvatarState, String title, String lvlLabel, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String unreadMessagesLabel, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj;
        int i12;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Composer composer2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Function0<Unit> function012;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(animatedAvatarState, "animatedAvatarState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
        Intrinsics.checkNotNullParameter(unreadMessagesLabel, "unreadMessagesLabel");
        Composer startRestartGroup = composer.startRestartGroup(74404100);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatHeaderContent)P(9,1,16,7,8,3,5,6,2,4,17,15,10,12,14,13,11)");
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(animatedAvatarState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(lvlLabel) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changed(f) ? 16384 : 8192;
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((29360128 & i) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((234881024 & i) == 0) {
                    i4 |= startRestartGroup.changed(z4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    if ((i3 & 512) == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((1879048192 & i) == 0) {
                        i4 |= startRestartGroup.changed(z5) ? 536870912 : 268435456;
                        if ((i3 & 1024) != 0) {
                            i5 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            i5 = i2 | (startRestartGroup.changed(unreadMessagesLabel) ? 4 : 2);
                        } else {
                            i5 = i2;
                        }
                        i6 = i3 & 2048;
                        if (i6 != 0) {
                            i5 |= 48;
                        } else if ((i2 & 112) == 0) {
                            i5 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
                        }
                        i7 = i3 & 4096;
                        if (i7 != 0) {
                            i5 |= 384;
                        } else if ((i2 & 896) == 0) {
                            i5 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                            i8 = i3 & 8192;
                            if (i8 == 0) {
                                i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                            } else if ((i2 & 7168) == 0) {
                                i5 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                                i9 = i3 & 16384;
                                if (i9 != 0) {
                                    i5 |= 24576;
                                } else if ((i2 & 57344) == 0) {
                                    i5 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                                }
                                i10 = i3 & 32768;
                                if (i10 != 0) {
                                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & 458752) == 0) {
                                    i5 |= startRestartGroup.changedInstance(function05) ? 131072 : 65536;
                                }
                                i11 = i3 & 65536;
                                if (i11 != 0) {
                                    i5 |= 1572864;
                                    obj = function06;
                                } else {
                                    obj = function06;
                                    if ((i2 & 3670016) == 0) {
                                        i5 |= startRestartGroup.changedInstance(obj) ? 1048576 : 524288;
                                    }
                                }
                                i12 = i3 & 131072;
                                if (i12 != 0) {
                                    i5 |= 12582912;
                                } else if ((i2 & 29360128) == 0) {
                                    i5 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                                }
                                if ((i4 & 1533916891) == 306783378 || (23967451 & i5) != 4793490 || !startRestartGroup.getSkipping()) {
                                    companion = i13 != 0 ? Modifier.Companion : modifier;
                                    ChatHeaderContentKt$ChatHeaderContent$1 chatHeaderContentKt$ChatHeaderContent$1 = i6 != 0 ? ChatHeaderContentKt$ChatHeaderContent$1.INSTANCE : function0;
                                    ChatHeaderContentKt$ChatHeaderContent$2 chatHeaderContentKt$ChatHeaderContent$2 = i7 != 0 ? ChatHeaderContentKt$ChatHeaderContent$2.INSTANCE : function02;
                                    ChatHeaderContentKt$ChatHeaderContent$3 chatHeaderContentKt$ChatHeaderContent$3 = i8 != 0 ? ChatHeaderContentKt$ChatHeaderContent$3.INSTANCE : function03;
                                    ChatHeaderContentKt$ChatHeaderContent$4 chatHeaderContentKt$ChatHeaderContent$4 = i9 != 0 ? ChatHeaderContentKt$ChatHeaderContent$4.INSTANCE : function04;
                                    ChatHeaderContentKt$ChatHeaderContent$5 chatHeaderContentKt$ChatHeaderContent$5 = i10 != 0 ? ChatHeaderContentKt$ChatHeaderContent$5.INSTANCE : function05;
                                    ChatHeaderContentKt$ChatHeaderContent$6 chatHeaderContentKt$ChatHeaderContent$6 = i11 != 0 ? ChatHeaderContentKt$ChatHeaderContent$6.INSTANCE : obj;
                                    Function3<RowScope, Composer, Integer, Unit> m7076getLambda1$common_ui_release = i12 != 0 ? ComposableSingletons$ChatHeaderContentKt.INSTANCE.m7076getLambda1$common_ui_release() : function3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(74404100, i4, i5, "com.ifriend.ui.features.chat.ChatHeaderContent (ChatHeaderContent.kt:55)");
                                    }
                                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                    int i14 = (i4 & 14) | 384;
                                    startRestartGroup.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                                    int i15 = i14 >> 3;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, (i15 & 112) | (i15 & 14));
                                    startRestartGroup.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                                    int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
                                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = m7076getLambda1$common_ui_release;
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
                                    modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i16 >> 3) & 112));
                                    startRestartGroup.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    int i17 = (((i14 >> 6) & 112) | 6) & 14;
                                    int i18 = i5;
                                    AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i17 | 1572864 | ((i4 >> 21) & 112), 30);
                                    int i19 = i18 << 21;
                                    int i20 = i18 >> 9;
                                    ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i19) | (i19 & 1879048192), (i20 & 14) | (i20 & 112) | (i20 & 896), 0);
                                    composer2 = startRestartGroup;
                                    function33.invoke(rowScopeInstance, composer2, Integer.valueOf(i17 | ((i18 >> 18) & 112)));
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function32 = function33;
                                    function07 = chatHeaderContentKt$ChatHeaderContent$1;
                                    function08 = chatHeaderContentKt$ChatHeaderContent$2;
                                    function09 = chatHeaderContentKt$ChatHeaderContent$3;
                                    function010 = chatHeaderContentKt$ChatHeaderContent$4;
                                    function011 = chatHeaderContentKt$ChatHeaderContent$5;
                                    function012 = chatHeaderContentKt$ChatHeaderContent$6;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    companion = modifier;
                                    function07 = function0;
                                    function08 = function02;
                                    function09 = function03;
                                    function010 = function04;
                                    function011 = function05;
                                    function32 = function3;
                                    composer2 = startRestartGroup;
                                    function012 = obj;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new ChatHeaderContentKt$ChatHeaderContent$8(companion, animatedAvatarState, title, lvlLabel, f, z, z2, z3, z4, z5, unreadMessagesLabel, function07, function08, function09, function010, function011, function012, function32, i, i2, i3));
                                return;
                            }
                            i9 = i3 & 16384;
                            if (i9 != 0) {
                            }
                            i10 = i3 & 32768;
                            if (i10 != 0) {
                            }
                            i11 = i3 & 65536;
                            if (i11 != 0) {
                            }
                            i12 = i3 & 131072;
                            if (i12 != 0) {
                            }
                            if ((i4 & 1533916891) == 306783378) {
                            }
                            if (i13 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                            int i142 = (i4 & 14) | 384;
                            startRestartGroup.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                            int i152 = i142 >> 3;
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, (i152 & 112) | (i152 & 14));
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                            int i162 = ((((i142 << 3) & 112) << 9) & 7168) | 6;
                            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332 = m7076getLambda1$common_ui_release;
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
                            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i162 >> 3) & 112));
                            startRestartGroup.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            int i172 = (((i142 >> 6) & 112) | 6) & 14;
                            int i182 = i5;
                            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance2, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i172 | 1572864 | ((i4 >> 21) & 112), 30);
                            int i192 = i182 << 21;
                            int i202 = i182 >> 9;
                            ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i192) | (i192 & 1879048192), (i202 & 14) | (i202 & 112) | (i202 & 896), 0);
                            composer2 = startRestartGroup;
                            function332.invoke(rowScopeInstance2, composer2, Integer.valueOf(i172 | ((i182 >> 18) & 112)));
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function32 = function332;
                            function07 = chatHeaderContentKt$ChatHeaderContent$1;
                            function08 = chatHeaderContentKt$ChatHeaderContent$2;
                            function09 = chatHeaderContentKt$ChatHeaderContent$3;
                            function010 = chatHeaderContentKt$ChatHeaderContent$4;
                            function011 = chatHeaderContentKt$ChatHeaderContent$5;
                            function012 = chatHeaderContentKt$ChatHeaderContent$6;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i8 = i3 & 8192;
                        if (i8 == 0) {
                        }
                        i9 = i3 & 16384;
                        if (i9 != 0) {
                        }
                        i10 = i3 & 32768;
                        if (i10 != 0) {
                        }
                        i11 = i3 & 65536;
                        if (i11 != 0) {
                        }
                        i12 = i3 & 131072;
                        if (i12 != 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        if (i13 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Alignment.Vertical centerVertically22 = Alignment.Companion.getCenterVertically();
                        int i1422 = (i4 & 14) | 384;
                        startRestartGroup.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                        int i1522 = i1422 >> 3;
                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, (i1522 & 112) | (i1522 & 14));
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion);
                        int i1622 = ((((i1422 << 3) & 112) << 9) & 7168) | 6;
                        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3322 = m7076getLambda1$common_ui_release;
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
                        modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i1622 >> 3) & 112));
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                        int i1722 = (((i1422 >> 6) & 112) | 6) & 14;
                        int i1822 = i5;
                        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance22, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i1722 | 1572864 | ((i4 >> 21) & 112), 30);
                        int i1922 = i1822 << 21;
                        int i2022 = i1822 >> 9;
                        ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance22, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i1922) | (i1922 & 1879048192), (i2022 & 14) | (i2022 & 112) | (i2022 & 896), 0);
                        composer2 = startRestartGroup;
                        function3322.invoke(rowScopeInstance22, composer2, Integer.valueOf(i1722 | ((i1822 >> 18) & 112)));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function32 = function3322;
                        function07 = chatHeaderContentKt$ChatHeaderContent$1;
                        function08 = chatHeaderContentKt$ChatHeaderContent$2;
                        function09 = chatHeaderContentKt$ChatHeaderContent$3;
                        function010 = chatHeaderContentKt$ChatHeaderContent$4;
                        function011 = chatHeaderContentKt$ChatHeaderContent$5;
                        function012 = chatHeaderContentKt$ChatHeaderContent$6;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    i6 = i3 & 2048;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 == 0) {
                    }
                    i9 = i3 & 16384;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 32768;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 65536;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 131072;
                    if (i12 != 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    if (i13 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment.Vertical centerVertically222 = Alignment.Companion.getCenterVertically();
                    int i14222 = (i4 & 14) | 384;
                    startRestartGroup.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                    int i15222 = i14222 >> 3;
                    MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, (i15222 & 112) | (i15222 & 14));
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(companion);
                    int i16222 = ((((i14222 << 3) & 112) << 9) & 7168) | 6;
                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33222 = m7076getLambda1$common_ui_release;
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i16222 >> 3) & 112));
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                    int i17222 = (((i14222 >> 6) & 112) | 6) & 14;
                    int i18222 = i5;
                    AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance222, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i17222 | 1572864 | ((i4 >> 21) & 112), 30);
                    int i19222 = i18222 << 21;
                    int i20222 = i18222 >> 9;
                    ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance222, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i19222) | (i19222 & 1879048192), (i20222 & 14) | (i20222 & 112) | (i20222 & 896), 0);
                    composer2 = startRestartGroup;
                    function33222.invoke(rowScopeInstance222, composer2, Integer.valueOf(i17222 | ((i18222 >> 18) & 112)));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function32 = function33222;
                    function07 = chatHeaderContentKt$ChatHeaderContent$1;
                    function08 = chatHeaderContentKt$ChatHeaderContent$2;
                    function09 = chatHeaderContentKt$ChatHeaderContent$3;
                    function010 = chatHeaderContentKt$ChatHeaderContent$4;
                    function011 = chatHeaderContentKt$ChatHeaderContent$5;
                    function012 = chatHeaderContentKt$ChatHeaderContent$6;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i3 & 512) == 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                i6 = i3 & 2048;
                if (i6 != 0) {
                }
                i7 = i3 & 4096;
                if (i7 != 0) {
                }
                i8 = i3 & 8192;
                if (i8 == 0) {
                }
                i9 = i3 & 16384;
                if (i9 != 0) {
                }
                i10 = i3 & 32768;
                if (i10 != 0) {
                }
                i11 = i3 & 65536;
                if (i11 != 0) {
                }
                i12 = i3 & 131072;
                if (i12 != 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                if (i13 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Vertical centerVertically2222 = Alignment.Companion.getCenterVertically();
                int i142222 = (i4 & 14) | 384;
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                int i152222 = i142222 >> 3;
                MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, (i152222 & 112) | (i152222 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(companion);
                int i162222 = ((((i142222 << 3) & 112) << 9) & 7168) | 6;
                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332222 = m7076getLambda1$common_ui_release;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                modifierMaterializerOf2222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i162222 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                int i172222 = (((i142222 >> 6) & 112) | 6) & 14;
                int i182222 = i5;
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance2222, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i172222 | 1572864 | ((i4 >> 21) & 112), 30);
                int i192222 = i182222 << 21;
                int i202222 = i182222 >> 9;
                ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance2222, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i192222) | (i192222 & 1879048192), (i202222 & 14) | (i202222 & 112) | (i202222 & 896), 0);
                composer2 = startRestartGroup;
                function332222.invoke(rowScopeInstance2222, composer2, Integer.valueOf(i172222 | ((i182222 >> 18) & 112)));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                function32 = function332222;
                function07 = chatHeaderContentKt$ChatHeaderContent$1;
                function08 = chatHeaderContentKt$ChatHeaderContent$2;
                function09 = chatHeaderContentKt$ChatHeaderContent$3;
                function010 = chatHeaderContentKt$ChatHeaderContent$4;
                function011 = chatHeaderContentKt$ChatHeaderContent$5;
                function012 = chatHeaderContentKt$ChatHeaderContent$6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            i6 = i3 & 2048;
            if (i6 != 0) {
            }
            i7 = i3 & 4096;
            if (i7 != 0) {
            }
            i8 = i3 & 8192;
            if (i8 == 0) {
            }
            i9 = i3 & 16384;
            if (i9 != 0) {
            }
            i10 = i3 & 32768;
            if (i10 != 0) {
            }
            i11 = i3 & 65536;
            if (i11 != 0) {
            }
            i12 = i3 & 131072;
            if (i12 != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            if (i13 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically22222 = Alignment.Companion.getCenterVertically();
            int i1422222 = (i4 & 14) | 384;
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            int i1522222 = i1422222 >> 3;
            MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22222, startRestartGroup, (i1522222 & 112) | (i1522222 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(companion);
            int i1622222 = ((((i1422222 << 3) & 112) << 9) & 7168) | 6;
            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3322222 = m7076getLambda1$common_ui_release;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy22222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            modifierMaterializerOf22222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i1622222 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
            int i1722222 = (((i1422222 >> 6) & 112) | 6) & 14;
            int i1822222 = i5;
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance22222, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i1722222 | 1572864 | ((i4 >> 21) & 112), 30);
            int i1922222 = i1822222 << 21;
            int i2022222 = i1822222 >> 9;
            ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance22222, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i1922222) | (i1922222 & 1879048192), (i2022222 & 14) | (i2022222 & 112) | (i2022222 & 896), 0);
            composer2 = startRestartGroup;
            function3322222.invoke(rowScopeInstance22222, composer2, Integer.valueOf(i1722222 | ((i1822222 >> 18) & 112)));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function32 = function3322222;
            function07 = chatHeaderContentKt$ChatHeaderContent$1;
            function08 = chatHeaderContentKt$ChatHeaderContent$2;
            function09 = chatHeaderContentKt$ChatHeaderContent$3;
            function010 = chatHeaderContentKt$ChatHeaderContent$4;
            function011 = chatHeaderContentKt$ChatHeaderContent$5;
            function012 = chatHeaderContentKt$ChatHeaderContent$6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i6 = i3 & 2048;
        if (i6 != 0) {
        }
        i7 = i3 & 4096;
        if (i7 != 0) {
        }
        i8 = i3 & 8192;
        if (i8 == 0) {
        }
        i9 = i3 & 16384;
        if (i9 != 0) {
        }
        i10 = i3 & 32768;
        if (i10 != 0) {
        }
        i11 = i3 & 65536;
        if (i11 != 0) {
        }
        i12 = i3 & 131072;
        if (i12 != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        if (i13 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Alignment.Vertical centerVertically222222 = Alignment.Companion.getCenterVertically();
        int i14222222 = (i4 & 14) | 384;
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        int i15222222 = i14222222 >> 3;
        MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222222, startRestartGroup, (i15222222 & 112) | (i15222222 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222222 = LayoutKt.modifierMaterializerOf(companion);
        int i16222222 = ((((i14222222 << 3) & 112) << 9) & 7168) | 6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33222222 = m7076getLambda1$common_ui_release;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy222222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        modifierMaterializerOf222222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i16222222 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222222 = RowScopeInstance.INSTANCE;
        int i17222222 = (((i14222222 >> 6) & 112) | 6) & 14;
        int i18222222 = i5;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance222222, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1723896000, true, new ChatHeaderContentKt$ChatHeaderContent$7$1(chatHeaderContentKt$ChatHeaderContent$6, i5, z5, unreadMessagesLabel, i4)), startRestartGroup, i17222222 | 1572864 | ((i4 >> 21) & 112), 30);
        int i19222222 = i18222222 << 21;
        int i20222222 = i18222222 >> 9;
        ChatHeaderTitleContent(RowScope.CC.weight$default(rowScopeInstance222222, Modifier.Companion, 1.0f, false, 2, null), animatedAvatarState, title, lvlLabel, f, z, z2, z3, chatHeaderContentKt$ChatHeaderContent$1, chatHeaderContentKt$ChatHeaderContent$2, chatHeaderContentKt$ChatHeaderContent$3, chatHeaderContentKt$ChatHeaderContent$4, chatHeaderContentKt$ChatHeaderContent$5, startRestartGroup, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i19222222) | (i19222222 & 1879048192), (i20222222 & 14) | (i20222222 & 112) | (i20222222 & 896), 0);
        composer2 = startRestartGroup;
        function33222222.invoke(rowScopeInstance222222, composer2, Integer.valueOf(i17222222 | ((i18222222 >> 18) & 112)));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function32 = function33222222;
        function07 = chatHeaderContentKt$ChatHeaderContent$1;
        function08 = chatHeaderContentKt$ChatHeaderContent$2;
        function09 = chatHeaderContentKt$ChatHeaderContent$3;
        function010 = chatHeaderContentKt$ChatHeaderContent$4;
        function011 = chatHeaderContentKt$ChatHeaderContent$5;
        function012 = chatHeaderContentKt$ChatHeaderContent$6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatHeaderTitleContent(Modifier modifier, AnimatedAvatarViewState animatedAvatarState, String title, String lvlLabel, float f, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        Composer composer2;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        Modifier modifier2;
        Function0<Unit> function010;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(animatedAvatarState, "animatedAvatarState");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lvlLabel, "lvlLabel");
        Composer startRestartGroup = composer.startRestartGroup(-1601627174);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatHeaderTitleContent)P(6!1,12,4,5!3,11!2,10)");
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(animatedAvatarState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(lvlLabel) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changed(f) ? 16384 : 8192;
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((29360128 & i) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                i5 = i3 & 256;
                if (i5 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changedInstance(function0) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i6 = i3 & 512;
                if (i6 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changedInstance(function02) ? 536870912 : 268435456;
                }
                i7 = i3 & 1024;
                if (i7 != 0) {
                    i8 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i8 = i2 | (startRestartGroup.changedInstance(function03) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i8 |= 48;
                } else if ((i2 & 112) == 0) {
                    i8 |= startRestartGroup.changedInstance(function04) ? 32 : 16;
                }
                int i12 = i8;
                i10 = i3 & 4096;
                if (i10 != 0) {
                    i12 |= 384;
                } else if ((i2 & 896) == 0) {
                    i12 |= startRestartGroup.changedInstance(function05) ? 256 : 128;
                    if ((i4 & 1533916891) == 306783378 || (i12 & 731) != 146 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i11 == 0 ? Modifier.Companion : modifier;
                        ChatHeaderContentKt$ChatHeaderTitleContent$1 chatHeaderContentKt$ChatHeaderTitleContent$1 = i5 == 0 ? ChatHeaderContentKt$ChatHeaderTitleContent$1.INSTANCE : function0;
                        ChatHeaderContentKt$ChatHeaderTitleContent$2 chatHeaderContentKt$ChatHeaderTitleContent$2 = i6 == 0 ? ChatHeaderContentKt$ChatHeaderTitleContent$2.INSTANCE : function02;
                        ChatHeaderContentKt$ChatHeaderTitleContent$3 chatHeaderContentKt$ChatHeaderTitleContent$3 = i7 == 0 ? ChatHeaderContentKt$ChatHeaderTitleContent$3.INSTANCE : function03;
                        ChatHeaderContentKt$ChatHeaderTitleContent$4 chatHeaderContentKt$ChatHeaderTitleContent$4 = i9 == 0 ? ChatHeaderContentKt$ChatHeaderTitleContent$4.INSTANCE : function04;
                        ChatHeaderContentKt$ChatHeaderTitleContent$5 chatHeaderContentKt$ChatHeaderTitleContent$5 = i10 == 0 ? ChatHeaderContentKt$ChatHeaderTitleContent$5.INSTANCE : function05;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1601627174, i4, i12, "com.ifriend.ui.features.chat.ChatHeaderTitleContent (ChatHeaderContent.kt:118)");
                        }
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        int i13 = (i4 & 14) | 384;
                        startRestartGroup.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                        int i14 = i13 >> 3;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, (i14 & 112) | (i14 & 14));
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                        Modifier modifier3 = companion;
                        int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
                        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i15 >> 3) & 112));
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i16 = i12 << 3;
                        Function0<Unit> function011 = chatHeaderContentKt$ChatHeaderTitleContent$2;
                        AvatarContentKt.AvatarContent(animatedAvatarState, chatHeaderContentKt$ChatHeaderTitleContent$3, chatHeaderContentKt$ChatHeaderTitleContent$4, chatHeaderContentKt$ChatHeaderTitleContent$5, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, chatHeaderContentKt$ChatHeaderTitleContent$2, 1, null), startRestartGroup, ((i4 >> 3) & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168), 0);
                        int i17 = i4 >> 6;
                        int i18 = (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752);
                        Function0<Unit> function012 = chatHeaderContentKt$ChatHeaderTitleContent$1;
                        composer2 = startRestartGroup;
                        ChatTitleContentKt.ChatTitleContent(title, lvlLabel, f, z, z2, z3, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m750paddingVpY3zN4$default(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, chatHeaderContentKt$ChatHeaderTitleContent$1, 1, null), composer2, i18, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function06 = function012;
                        function07 = chatHeaderContentKt$ChatHeaderTitleContent$3;
                        function08 = chatHeaderContentKt$ChatHeaderTitleContent$4;
                        function09 = chatHeaderContentKt$ChatHeaderTitleContent$5;
                        modifier2 = modifier3;
                        function010 = function011;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function06 = function0;
                        function07 = function03;
                        function08 = function04;
                        function09 = function05;
                        composer2 = startRestartGroup;
                        function010 = function02;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ChatHeaderContentKt$ChatHeaderTitleContent$7(modifier2, animatedAvatarState, title, lvlLabel, f, z, z2, z3, function06, function010, function07, function08, function09, i, i2, i3));
                    return;
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                if (i11 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                int i132 = (i4 & 14) | 384;
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                int i142 = i132 >> 3;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, (i142 & 112) | (i142 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                Modifier modifier32 = companion;
                int i152 = ((((i132 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i152 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i162 = i12 << 3;
                Function0<Unit> function0112 = chatHeaderContentKt$ChatHeaderTitleContent$2;
                AvatarContentKt.AvatarContent(animatedAvatarState, chatHeaderContentKt$ChatHeaderTitleContent$3, chatHeaderContentKt$ChatHeaderTitleContent$4, chatHeaderContentKt$ChatHeaderTitleContent$5, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, chatHeaderContentKt$ChatHeaderTitleContent$2, 1, null), startRestartGroup, ((i4 >> 3) & 14) | (i162 & 112) | (i162 & 896) | (i162 & 7168), 0);
                int i172 = i4 >> 6;
                int i182 = (i172 & 14) | (i172 & 112) | (i172 & 896) | (i172 & 7168) | (i172 & 57344) | (i172 & 458752);
                Function0<Unit> function0122 = chatHeaderContentKt$ChatHeaderTitleContent$1;
                composer2 = startRestartGroup;
                ChatTitleContentKt.ChatTitleContent(title, lvlLabel, f, z, z2, z3, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m750paddingVpY3zN4$default(RowScope.CC.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, chatHeaderContentKt$ChatHeaderTitleContent$1, 1, null), composer2, i182, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                function06 = function0122;
                function07 = chatHeaderContentKt$ChatHeaderTitleContent$3;
                function08 = chatHeaderContentKt$ChatHeaderTitleContent$4;
                function09 = chatHeaderContentKt$ChatHeaderTitleContent$5;
                modifier2 = modifier32;
                function010 = function0112;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 256;
            if (i5 != 0) {
            }
            i6 = i3 & 512;
            if (i6 != 0) {
            }
            i7 = i3 & 1024;
            if (i7 != 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            int i122 = i8;
            i10 = i3 & 4096;
            if (i10 != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            if (i11 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically22 = Alignment.Companion.getCenterVertically();
            int i1322 = (i4 & 14) | 384;
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            int i1422 = i1322 >> 3;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, (i1422 & 112) | (i1422 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion);
            Modifier modifier322 = companion;
            int i1522 = ((((i1322 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i1522 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i1622 = i122 << 3;
            Function0<Unit> function01122 = chatHeaderContentKt$ChatHeaderTitleContent$2;
            AvatarContentKt.AvatarContent(animatedAvatarState, chatHeaderContentKt$ChatHeaderTitleContent$3, chatHeaderContentKt$ChatHeaderTitleContent$4, chatHeaderContentKt$ChatHeaderTitleContent$5, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, chatHeaderContentKt$ChatHeaderTitleContent$2, 1, null), startRestartGroup, ((i4 >> 3) & 14) | (i1622 & 112) | (i1622 & 896) | (i1622 & 7168), 0);
            int i1722 = i4 >> 6;
            int i1822 = (i1722 & 14) | (i1722 & 112) | (i1722 & 896) | (i1722 & 7168) | (i1722 & 57344) | (i1722 & 458752);
            Function0<Unit> function01222 = chatHeaderContentKt$ChatHeaderTitleContent$1;
            composer2 = startRestartGroup;
            ChatTitleContentKt.ChatTitleContent(title, lvlLabel, f, z, z2, z3, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m750paddingVpY3zN4$default(RowScope.CC.weight$default(rowScopeInstance22, Modifier.Companion, 1.0f, false, 2, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, chatHeaderContentKt$ChatHeaderTitleContent$1, 1, null), composer2, i1822, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function06 = function01222;
            function07 = chatHeaderContentKt$ChatHeaderTitleContent$3;
            function08 = chatHeaderContentKt$ChatHeaderTitleContent$4;
            function09 = chatHeaderContentKt$ChatHeaderTitleContent$5;
            modifier2 = modifier322;
            function010 = function01122;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i5 = i3 & 256;
        if (i5 != 0) {
        }
        i6 = i3 & 512;
        if (i6 != 0) {
        }
        i7 = i3 & 1024;
        if (i7 != 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        int i1222 = i8;
        i10 = i3 & 4096;
        if (i10 != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        if (i11 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Alignment.Vertical centerVertically222 = Alignment.Companion.getCenterVertically();
        int i13222 = (i4 & 14) | 384;
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        int i14222 = i13222 >> 3;
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, (i14222 & 112) | (i14222 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(companion);
        Modifier modifier3222 = companion;
        int i15222 = ((((i13222 << 3) & 112) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i15222 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        int i16222 = i1222 << 3;
        Function0<Unit> function011222 = chatHeaderContentKt$ChatHeaderTitleContent$2;
        AvatarContentKt.AvatarContent(animatedAvatarState, chatHeaderContentKt$ChatHeaderTitleContent$3, chatHeaderContentKt$ChatHeaderTitleContent$4, chatHeaderContentKt$ChatHeaderTitleContent$5, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, chatHeaderContentKt$ChatHeaderTitleContent$2, 1, null), startRestartGroup, ((i4 >> 3) & 14) | (i16222 & 112) | (i16222 & 896) | (i16222 & 7168), 0);
        int i17222 = i4 >> 6;
        int i18222 = (i17222 & 14) | (i17222 & 112) | (i17222 & 896) | (i17222 & 7168) | (i17222 & 57344) | (i17222 & 458752);
        Function0<Unit> function012222 = chatHeaderContentKt$ChatHeaderTitleContent$1;
        composer2 = startRestartGroup;
        ChatTitleContentKt.ChatTitleContent(title, lvlLabel, f, z, z2, z3, ClickableModifierKt.noIndicationClickable$default(PaddingKt.m750paddingVpY3zN4$default(RowScope.CC.weight$default(rowScopeInstance222, Modifier.Companion, 1.0f, false, 2, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM(), 0.0f, 2, null), false, chatHeaderContentKt$ChatHeaderTitleContent$1, 1, null), composer2, i18222, 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function06 = function012222;
        function07 = chatHeaderContentKt$ChatHeaderTitleContent$3;
        function08 = chatHeaderContentKt$ChatHeaderTitleContent$4;
        function09 = chatHeaderContentKt$ChatHeaderTitleContent$5;
        modifier2 = modifier3222;
        function010 = function011222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnreadIndicator(boolean z, String str, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(58578806);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58578806, i2, -1, "com.ifriend.ui.features.chat.UnreadIndicator (ChatHeaderContent.kt:151)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 986181022, true, new ChatHeaderContentKt$UnreadIndicator$1(str, i2)), startRestartGroup, (i2 & 14) | 200064, 18);
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
        endRestartGroup.updateScope(new ChatHeaderContentKt$UnreadIndicator$2(z, str, i));
    }
}
