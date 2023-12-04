package com.ifriend.ui.components.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ContentDialog.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00010\bj\u0002`\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"ContentDialog", "", "contentAlignment", "Landroidx/compose/ui/Alignment;", "topPadding", "Landroidx/compose/ui/unit/Dp;", "bottomPadding", "onDismiss", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "scrimColor", "Landroidx/compose/ui/graphics/Brush;", "contentScrimColor", "isCancelable", "", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "ContentDialog-eWuZFaY", "(Landroidx/compose/ui/Alignment;FFLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentDialogKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* renamed from: ContentDialog-eWuZFaY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7039ContentDialogeWuZFaY(Alignment alignment, float f, float f2, Function0<Unit> onDismiss, Brush brush, Brush brush2, boolean z, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        float f3;
        float f4;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        int i6;
        boolean z2;
        int i7;
        float f5;
        float f6;
        Object obj4;
        Object obj5;
        Object obj6;
        Alignment alignment2;
        float f7;
        float f8;
        Brush brush3;
        Brush brush4;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-531645808);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContentDialog)P(2,7:c#ui.unit.Dp,0:c#ui.unit.Dp,5,6,3,4)");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            obj = alignment;
        } else if ((i & 14) == 0) {
            obj = alignment;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = alignment;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                f3 = f;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            f3 = f;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                f4 = f2;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            f4 = f2;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            obj2 = brush;
            i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                obj3 = brush2;
                i3 |= startRestartGroup.changed(obj3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Alignment center = i10 == 0 ? Alignment.Companion.getCenter() : obj;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                f3 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM();
                            }
                            if ((i2 & 4) != 0) {
                                f4 = AppTheme.INSTANCE.getDimensions(startRestartGroup, 6).m7175getMediumD9Ej5fM();
                                i3 &= -897;
                            }
                            if (i11 != 0) {
                                obj2 = Brush.Companion.m3248verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.Companion.m3326getTransparent0d7_KjU()), Color.m3281boximpl(Color.Companion.m3317getBlack0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                            }
                            if (i4 != 0) {
                                obj3 = Brush.Companion.m3248verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.Color(4278387459L)), Color.m3281boximpl(ColorKt.Color(4279900698L))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            }
                            z2 = i5 == 0 ? true : z;
                            i7 = i3;
                            f5 = f3;
                            f6 = f4;
                            obj4 = obj2;
                            obj5 = obj3;
                            obj6 = center;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            z2 = z;
                            i7 = i3;
                            f5 = f3;
                            f6 = f4;
                            obj4 = obj2;
                            obj5 = obj3;
                            obj6 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-531645808, i7, -1, "com.ifriend.ui.components.dialogs.ContentDialog (ContentDialog.kt:42)");
                        }
                        AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, null, false, false, 23, null), ComposableLambdaKt.composableLambda(startRestartGroup, 800182617, true, new ContentDialogKt$ContentDialog$1(obj4, f5, f6, z2, onDismiss, i7, obj6, obj5, content)), startRestartGroup, ((i7 >> 9) & 14) | 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        alignment2 = obj6;
                        f7 = f5;
                        f8 = f6;
                        brush3 = obj4;
                        brush4 = obj5;
                        z3 = z2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z3 = z;
                        alignment2 = obj;
                        f7 = f3;
                        f8 = f4;
                        brush3 = obj2;
                        brush4 = obj3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new ContentDialogKt$ContentDialog$2(alignment2, f7, f8, onDismiss, brush3, brush4, z3, content, i, i2));
                    return;
                }
                i6 = 12582912;
                i3 |= i6;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                i7 = i3;
                f5 = f3;
                f6 = f4;
                obj4 = obj2;
                obj5 = obj3;
                obj6 = center;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, null, false, false, 23, null), ComposableLambdaKt.composableLambda(startRestartGroup, 800182617, true, new ContentDialogKt$ContentDialog$1(obj4, f5, f6, z2, onDismiss, i7, obj6, obj5, content)), startRestartGroup, ((i7 >> 9) & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                alignment2 = obj6;
                f7 = f5;
                f8 = f6;
                brush3 = obj4;
                brush4 = obj5;
                z3 = z2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj3 = brush2;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            i7 = i3;
            f5 = f3;
            f6 = f4;
            obj4 = obj2;
            obj5 = obj3;
            obj6 = center;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, null, false, false, 23, null), ComposableLambdaKt.composableLambda(startRestartGroup, 800182617, true, new ContentDialogKt$ContentDialog$1(obj4, f5, f6, z2, onDismiss, i7, obj6, obj5, content)), startRestartGroup, ((i7 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            alignment2 = obj6;
            f7 = f5;
            f8 = f6;
            brush3 = obj4;
            brush4 = obj5;
            z3 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj2 = brush;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        obj3 = brush2;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i6;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        i7 = i3;
        f5 = f3;
        f6 = f4;
        obj4 = obj2;
        obj5 = obj3;
        obj6 = center;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, null, false, false, 23, null), ComposableLambdaKt.composableLambda(startRestartGroup, 800182617, true, new ContentDialogKt$ContentDialog$1(obj4, f5, f6, z2, onDismiss, i7, obj6, obj5, content)), startRestartGroup, ((i7 >> 9) & 14) | 432, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        alignment2 = obj6;
        f7 = f5;
        f8 = f6;
        brush3 = obj4;
        brush4 = obj5;
        z3 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
