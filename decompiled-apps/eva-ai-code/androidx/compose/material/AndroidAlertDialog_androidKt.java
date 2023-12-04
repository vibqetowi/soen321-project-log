package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /* renamed from: AlertDialog-6oU6zVQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1232AlertDialog6oU6zVQ(Function0<Unit> onDismissRequest, Function2<? super Composer, ? super Integer, Unit> confirmButton, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        long j3;
        int i7;
        CornerBasedShape cornerBasedShape;
        int i8;
        Modifier modifier2;
        long j4;
        Modifier modifier3;
        DialogProperties dialogProperties2;
        long j5;
        Object obj2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        long j6;
        Shape shape2;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Modifier modifier4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape3;
        long j7;
        long j8;
        DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer startRestartGroup = composer.startRestartGroup(-606536823);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(5,1,4,3,9,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color)70@3471L6,71@3529L6,72@3571L32,75@3667L735:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(confirmButton) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        obj = function23;
                    } else {
                        obj = function23;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(obj) ? 131072 : 65536;
                        }
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j)) ? 8388608 : 4194304;
                    }
                    if ((i & 234881024) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    } else {
                        j3 = j2;
                    }
                    i7 = i2 & 512;
                    if (i7 == 0) {
                        i3 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i3 |= startRestartGroup.changed(dialogProperties) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : modifier;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i4 == 0 ? null : function2;
                            Function2<? super Composer, ? super Integer, Unit> function210 = i5 == 0 ? null : function22;
                            Object obj3 = i6 == 0 ? obj : null;
                            if ((i2 & 64) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                i3 &= -3670017;
                            } else {
                                cornerBasedShape = shape;
                            }
                            if ((i2 & 128) == 0) {
                                i8 = i3 & (-29360129);
                                modifier2 = companion;
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                            } else {
                                i8 = i3;
                                modifier2 = companion;
                                j4 = j;
                            }
                            if ((i2 & 256) != 0) {
                                j3 = ColorsKt.m1327contentColorForek8zF_U(j4, startRestartGroup, (i8 >> 21) & 14);
                                i8 &= -234881025;
                            }
                            if (i7 == 0) {
                                modifier3 = modifier2;
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                modifier3 = modifier2;
                                dialogProperties2 = dialogProperties;
                            }
                            j5 = j4;
                            obj2 = obj3;
                            function24 = function29;
                            i3 = i8;
                            function25 = function210;
                            j6 = j3;
                            shape2 = cornerBasedShape;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier3 = modifier;
                            function25 = function22;
                            shape2 = shape;
                            j5 = j;
                            dialogProperties2 = dialogProperties;
                            j6 = j3;
                            obj2 = obj;
                            function24 = function2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                        }
                        int i10 = i3 >> 3;
                        Function2<? super Composer, ? super Integer, Unit> function211 = function24;
                        composer2 = startRestartGroup;
                        m1233AlertDialogwqdebIU(onDismissRequest, ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new AndroidAlertDialog_androidKt$AlertDialog$1(function24, i3, confirmButton)), modifier3, function25, obj2, shape2, j5, j6, dialogProperties2, startRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function26 = function211;
                        modifier4 = modifier3;
                        function27 = function25;
                        function28 = obj2;
                        shape3 = shape2;
                        j7 = j5;
                        j8 = j6;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        function26 = function2;
                        function27 = function22;
                        dialogProperties3 = dialogProperties;
                        function28 = obj;
                        composer2 = startRestartGroup;
                        j8 = j3;
                        shape3 = shape;
                        j7 = j;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$2(onDismissRequest, confirmButton, modifier4, function26, function27, function28, shape3, j7, j8, dialogProperties3, i, i2));
                    return;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) != 0) {
                }
                i7 = i2 & 512;
                if (i7 == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if (i7 == 0) {
                }
                j5 = j4;
                obj2 = obj3;
                function24 = function29;
                i3 = i8;
                function25 = function210;
                j6 = j3;
                shape2 = cornerBasedShape;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function2112 = function24;
                composer2 = startRestartGroup;
                m1233AlertDialogwqdebIU(onDismissRequest, ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new AndroidAlertDialog_androidKt$AlertDialog$1(function24, i3, confirmButton)), modifier3, function25, obj2, shape2, j5, j6, dialogProperties2, startRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | (i102 & 29360128) | (i102 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function26 = function2112;
                modifier4 = modifier3;
                function27 = function25;
                function28 = obj2;
                shape3 = shape2;
                j7 = j5;
                j8 = j6;
                dialogProperties3 = dialogProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) != 0) {
            }
            i7 = i2 & 512;
            if (i7 == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if (i7 == 0) {
            }
            j5 = j4;
            obj2 = obj3;
            function24 = function29;
            i3 = i8;
            function25 = function210;
            j6 = j3;
            shape2 = cornerBasedShape;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i3 >> 3;
            Function2<? super Composer, ? super Integer, Unit> function21122 = function24;
            composer2 = startRestartGroup;
            m1233AlertDialogwqdebIU(onDismissRequest, ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new AndroidAlertDialog_androidKt$AlertDialog$1(function24, i3, confirmButton)), modifier3, function25, obj2, shape2, j5, j6, dialogProperties2, startRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | (i1022 & 29360128) | (i1022 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function26 = function21122;
            modifier4 = modifier3;
            function27 = function25;
            function28 = obj2;
            shape3 = shape2;
            j7 = j5;
            j8 = j6;
            dialogProperties3 = dialogProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) != 0) {
        }
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if (i7 == 0) {
        }
        j5 = j4;
        obj2 = obj3;
        function24 = function29;
        i3 = i8;
        function25 = function210;
        j6 = j3;
        shape2 = cornerBasedShape;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i3 >> 3;
        Function2<? super Composer, ? super Integer, Unit> function211222 = function24;
        composer2 = startRestartGroup;
        m1233AlertDialogwqdebIU(onDismissRequest, ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new AndroidAlertDialog_androidKt$AlertDialog$1(function24, i3, confirmButton)), modifier3, function25, obj2, shape2, j5, j6, dialogProperties2, startRestartGroup, (i3 & 14) | 48 | (i3 & 896) | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016) | (i10222 & 29360128) | (i10222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function26 = function211222;
        modifier4 = modifier3;
        function27 = function25;
        function28 = obj2;
        shape3 = shape2;
        j7 = j5;
        j8 = j6;
        dialogProperties3 = dialogProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* renamed from: AlertDialog-wqdebIU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1233AlertDialogwqdebIU(Function0<Unit> onDismissRequest, Function2<? super Composer, ? super Integer, Unit> buttons, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        Object obj3;
        long j3;
        int i6;
        Modifier.Companion companion;
        CornerBasedShape cornerBasedShape;
        long j4;
        long j5;
        DialogProperties dialogProperties2;
        Object obj4;
        Object obj5;
        Object obj6;
        long j6;
        long j7;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        long j8;
        long j9;
        DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(1035523925);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(4,1,3,8,7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color)131@6133L6,132@6191L6,133@6233L32,136@6329L366:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(buttons) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj = function2;
                i3 |= startRestartGroup.changedInstance(obj) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = function22;
                    i3 |= startRestartGroup.changedInstance(obj2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = shape;
                            if (startRestartGroup.changed(obj3)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            obj3 = shape;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        obj3 = shape;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            j3 = j;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j2)) {
                            i7 = 8388608;
                            i3 |= i7;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((234881024 & i) == 0) {
                        i3 |= startRestartGroup.changed(dialogProperties) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    obj = null;
                                }
                                Object obj7 = i5 == 0 ? obj2 : null;
                                if ((i2 & 32) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                    i3 &= -458753;
                                } else {
                                    cornerBasedShape = obj3;
                                }
                                if ((i2 & 64) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                    i3 &= -3670017;
                                } else {
                                    j4 = j3;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = ColorsKt.m1327contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    j5 = j2;
                                }
                                dialogProperties2 = i6 != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : dialogProperties;
                                obj4 = obj7;
                                obj5 = cornerBasedShape;
                                obj6 = obj;
                                j6 = j4;
                                j7 = j5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                j7 = j2;
                                dialogProperties2 = dialogProperties;
                                obj6 = obj;
                                obj4 = obj2;
                                obj5 = obj3;
                                j6 = j3;
                            }
                            int i11 = i3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1035523925, i11, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                            }
                            Function2<? super Composer, ? super Integer, Unit> function25 = obj6;
                            Modifier modifier3 = companion;
                            composer2 = startRestartGroup;
                            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new AndroidAlertDialog_androidKt$AlertDialog$3(buttons, companion, obj6, obj4, obj5, j6, j7, i11)), composer2, (i11 & 14) | 384 | ((i11 >> 21) & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function25;
                            modifier2 = modifier3;
                            function24 = obj4;
                            shape2 = obj5;
                            j8 = j6;
                            j9 = j7;
                            dialogProperties3 = dialogProperties2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function23 = obj;
                            function24 = obj2;
                            shape2 = obj3;
                            j8 = j3;
                            composer2 = startRestartGroup;
                            j9 = j2;
                            dialogProperties3 = dialogProperties;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$4(onDismissRequest, buttons, modifier2, function23, function24, shape2, j8, j9, dialogProperties3, i, i2));
                        return;
                    }
                    if ((i3 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    obj4 = obj7;
                    obj5 = cornerBasedShape;
                    obj6 = obj;
                    j6 = j4;
                    j7 = j5;
                    int i112 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function252 = obj6;
                    Modifier modifier32 = companion;
                    composer2 = startRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new AndroidAlertDialog_androidKt$AlertDialog$3(buttons, companion, obj6, obj4, obj5, j6, j7, i112)), composer2, (i112 & 14) | 384 | ((i112 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function23 = function252;
                    modifier2 = modifier32;
                    function24 = obj4;
                    shape2 = obj5;
                    j8 = j6;
                    j9 = j7;
                    dialogProperties3 = dialogProperties2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = function22;
                if ((458752 & i) != 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i6 != 0) {
                }
                obj4 = obj7;
                obj5 = cornerBasedShape;
                obj6 = obj;
                j6 = j4;
                j7 = j5;
                int i1122 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Function2<? super Composer, ? super Integer, Unit> function2522 = obj6;
                Modifier modifier322 = companion;
                composer2 = startRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new AndroidAlertDialog_androidKt$AlertDialog$3(buttons, companion, obj6, obj4, obj5, j6, j7, i1122)), composer2, (i1122 & 14) | 384 | ((i1122 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function23 = function2522;
                modifier2 = modifier322;
                function24 = obj4;
                shape2 = obj5;
                j8 = j6;
                j9 = j7;
                dialogProperties3 = dialogProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = function22;
            if ((458752 & i) != 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i6 != 0) {
            }
            obj4 = obj7;
            obj5 = cornerBasedShape;
            obj6 = obj;
            j6 = j4;
            j7 = j5;
            int i11222 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Function2<? super Composer, ? super Integer, Unit> function25222 = obj6;
            Modifier modifier3222 = companion;
            composer2 = startRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new AndroidAlertDialog_androidKt$AlertDialog$3(buttons, companion, obj6, obj4, obj5, j6, j7, i11222)), composer2, (i11222 & 14) | 384 | ((i11222 >> 21) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function23 = function25222;
            modifier2 = modifier3222;
            function24 = obj4;
            shape2 = obj5;
            j8 = j6;
            j9 = j7;
            dialogProperties3 = dialogProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = function22;
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i6 != 0) {
        }
        obj4 = obj7;
        obj5 = cornerBasedShape;
        obj6 = obj;
        j6 = j4;
        j7 = j5;
        int i112222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Function2<? super Composer, ? super Integer, Unit> function252222 = obj6;
        Modifier modifier32222 = companion;
        composer2 = startRestartGroup;
        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new AndroidAlertDialog_androidKt$AlertDialog$3(buttons, companion, obj6, obj4, obj5, j6, j7, i112222)), composer2, (i112222 & 14) | 384 | ((i112222 >> 21) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function23 = function252222;
        modifier2 = modifier32222;
        function24 = obj4;
        shape2 = obj5;
        j8 = j6;
        j9 = j7;
        dialogProperties3 = dialogProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
