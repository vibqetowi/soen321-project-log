package com.ifriend.ui.components.dialogs;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppMessageInfoPopup.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aS\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000bH\u0003¢\u0006\u0002\u0010\r\u001aq\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00010\nj\u0002`\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"AppMessageInfoButtons", "", "modifier", "Landroidx/compose/ui/Modifier;", "actionLabel", "", "isVisibleActionButton", "", "isVisibleCancelButton", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "onCancelClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AppMessageInfoPopup", "title", "description", "onDismiss", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "AppMessageInfoPopupPreview", "(Landroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppMessageInfoPopupKt {
    public static final void AppMessageInfoPopupPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-615352467);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppMessageInfoPopupPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615352467, i, -1, "com.ifriend.ui.components.dialogs.AppMessageInfoPopupPreview (AppMessageInfoPopup.kt:34)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableSingletons$AppMessageInfoPopupKt.INSTANCE.m7037getLambda3$common_ui_release(), startRestartGroup, 24576, 15);
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
        endRestartGroup.updateScope(new AppMessageInfoPopupKt$AppMessageInfoPopupPreview$1(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppMessageInfoPopup(String title, String description, String str, Function0<Unit> onClick, Function0<Unit> onCancelClick, Function0<Unit> onDismiss, boolean z, boolean z2, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        Composer composer2;
        String str2;
        boolean z5;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1604936500);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppMessageInfoPopup)P(7,1!1,5,4,6)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(description) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(onCancelClick) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((458752 & i) == 0) {
                    i4 = startRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                        if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            String str3 = i7 != 0 ? "" : str;
                            boolean z7 = i5 != 0 ? true : z3;
                            boolean z8 = i6 != 0 ? true : z4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1604936500, i3, -1, "com.ifriend.ui.components.dialogs.AppMessageInfoPopup (AppMessageInfoPopup.kt:77)");
                            }
                            int i8 = i3;
                            composer2 = startRestartGroup;
                            ContentDialogKt.m7039ContentDialogeWuZFaY(Alignment.Companion.getBottomCenter(), 0.0f, 0.0f, onDismiss, null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -535550309, true, new AppMessageInfoPopupKt$AppMessageInfoPopup$1(title, i8, description, str3, z7, z8, onClick, onCancelClick)), composer2, ((i8 >> 6) & 7168) | 14155782, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str2 = str3;
                            z5 = z7;
                            z6 = z8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str2 = str;
                            composer2 = startRestartGroup;
                            z6 = z4;
                            z5 = z3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AppMessageInfoPopupKt$AppMessageInfoPopup$2(title, description, str2, onClick, onCancelClick, onDismiss, z5, z6, i, i2));
                        return;
                    }
                    z4 = z2;
                    if ((i3 & 23967451) == 4793490) {
                    }
                    if (i7 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3;
                    composer2 = startRestartGroup;
                    ContentDialogKt.m7039ContentDialogeWuZFaY(Alignment.Companion.getBottomCenter(), 0.0f, 0.0f, onDismiss, null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -535550309, true, new AppMessageInfoPopupKt$AppMessageInfoPopup$1(title, i82, description, str3, z7, z8, onClick, onCancelClick)), composer2, ((i82 >> 6) & 7168) | 14155782, 54);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str2 = str3;
                    z5 = z7;
                    z6 = z8;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                z4 = z2;
                if ((i3 & 23967451) == 4793490) {
                }
                if (i7 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3;
                composer2 = startRestartGroup;
                ContentDialogKt.m7039ContentDialogeWuZFaY(Alignment.Companion.getBottomCenter(), 0.0f, 0.0f, onDismiss, null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -535550309, true, new AppMessageInfoPopupKt$AppMessageInfoPopup$1(title, i822, description, str3, z7, z8, onClick, onCancelClick)), composer2, ((i822 >> 6) & 7168) | 14155782, 54);
                if (ComposerKt.isTraceInProgress()) {
                }
                str2 = str3;
                z5 = z7;
                z6 = z8;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i3 |= i4;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            z4 = z2;
            if ((i3 & 23967451) == 4793490) {
            }
            if (i7 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3;
            composer2 = startRestartGroup;
            ContentDialogKt.m7039ContentDialogeWuZFaY(Alignment.Companion.getBottomCenter(), 0.0f, 0.0f, onDismiss, null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -535550309, true, new AppMessageInfoPopupKt$AppMessageInfoPopup$1(title, i8222, description, str3, z7, z8, onClick, onCancelClick)), composer2, ((i8222 >> 6) & 7168) | 14155782, 54);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = str3;
            z5 = z7;
            z6 = z8;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i4;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        z4 = z2;
        if ((i3 & 23967451) == 4793490) {
        }
        if (i7 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3;
        composer2 = startRestartGroup;
        ContentDialogKt.m7039ContentDialogeWuZFaY(Alignment.Companion.getBottomCenter(), 0.0f, 0.0f, onDismiss, null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -535550309, true, new AppMessageInfoPopupKt$AppMessageInfoPopup$1(title, i82222, description, str3, z7, z8, onClick, onCancelClick)), composer2, ((i82222 >> 6) & 7168) | 14155782, 54);
        if (ComposerKt.isTraceInProgress()) {
        }
        str2 = str3;
        z5 = z7;
        z6 = z8;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppMessageInfoButtons(Modifier modifier, String str, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1711919990);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = startRestartGroup.changedInstance(function02) ? 131072 : 65536;
            }
            i5 = i3;
            if ((374491 & i5) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i6 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1711919990, i5, -1, "com.ifriend.ui.components.dialogs.AppMessageInfoButtons (AppMessageInfoPopup.kt:140)");
                }
                int i7 = i5 & 14;
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
                int i8 = i7 >> 3;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, (i8 & 112) | (i8 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier2 = companion;
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
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i9 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = ((((i7 >> 6) & 112) | 6) & 14) | 1572864;
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 613731278, true, new AppMessageInfoPopupKt$AppMessageInfoButtons$1$1(function02, i5)), startRestartGroup, i10 | ((i5 >> 6) & 112), 30);
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -2106031369, true, new AppMessageInfoPopupKt$AppMessageInfoButtons$1$2(rowScopeInstance, function0, i5, str)), startRestartGroup, i10 | ((i5 >> 3) & 112), 30);
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
            endRestartGroup.updateScope(new AppMessageInfoPopupKt$AppMessageInfoButtons$2(obj, str, z, z2, function0, function02, i, i2));
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        i5 = i3;
        if ((374491 & i5) == 74898) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i72 = i5 & 14;
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
        int i82 = i72 >> 3;
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, (i82 & 112) | (i82 & 14));
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
        int i92 = ((((i72 << 3) & 112) << 9) & 7168) | 6;
        Modifier modifier22 = companion;
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
        modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i92 >> 3) & 112));
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        int i102 = ((((i72 >> 6) & 112) | 6) & 14) | 1572864;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance2, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 613731278, true, new AppMessageInfoPopupKt$AppMessageInfoButtons$1$1(function02, i5)), startRestartGroup, i102 | ((i5 >> 6) & 112), 30);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance2, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -2106031369, true, new AppMessageInfoPopupKt$AppMessageInfoButtons$1$2(rowScopeInstance2, function0, i5, str)), startRestartGroup, i102 | ((i5 >> 3) & 112), 30);
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
