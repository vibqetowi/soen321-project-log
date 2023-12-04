package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aâ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aB\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ButtonsCrossAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonsMainAxisSpacing", "AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", FirebaseAnalytics.Param.CONTENT, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    private static final float ButtonsMainAxisSpacing = Dp.m5607constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = Dp.m5607constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    /* renamed from: AlertDialog-Oix01E0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1568AlertDialogOix01E0(Function0<Unit> onDismissRequest, Function2<? super Composer, ? super Integer, Unit> confirmButton, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier.Companion companion;
        int i5;
        Object obj;
        int i6;
        Object obj2;
        int i7;
        Object obj3;
        int i8;
        Object obj4;
        Object obj5;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        long j5;
        long j6;
        long j7;
        long j8;
        DialogProperties dialogProperties2;
        float f2;
        Object obj6;
        Object obj7;
        Object obj8;
        long j9;
        Object obj9;
        long j10;
        long j11;
        int i13;
        Object obj10;
        Object obj11;
        long j12;
        Composer composer2;
        Modifier modifier2;
        Object obj12;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape3;
        long j13;
        long j14;
        long j15;
        long j16;
        float f3;
        DialogProperties dialogProperties3;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer startRestartGroup = composer.startRestartGroup(-2081346864);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(6!1,5,2,3,11,9,8,1:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,10:c#ui.graphics.Color,13:c#ui.unit.Dp)84@4214L5,85@4269L14,86@4335L16,87@4404L17,88@4473L16,91@4610L1104:AndroidAlertDialog.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(confirmButton) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            companion = modifier;
            i4 |= startRestartGroup.changed(companion) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj = function2;
                i4 |= startRestartGroup.changedInstance(obj) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                    obj2 = function22;
                } else {
                    obj2 = function22;
                    if ((i & 57344) == 0) {
                        i4 |= startRestartGroup.changedInstance(obj2) ? 16384 : 8192;
                    }
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj3 = function23;
                } else {
                    obj3 = function23;
                    if ((i & 458752) == 0) {
                        i4 |= startRestartGroup.changedInstance(obj3) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    obj4 = function24;
                } else {
                    obj4 = function24;
                    if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changedInstance(obj4) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        obj5 = shape;
                        if (startRestartGroup.changed(obj5)) {
                            i15 = 8388608;
                            i4 |= i15;
                        }
                    } else {
                        obj5 = shape;
                    }
                    i15 = 4194304;
                    i4 |= i15;
                } else {
                    obj5 = shape;
                }
                if ((i & 234881024) == 0) {
                    i9 = i4 | (((i3 & 256) == 0 && startRestartGroup.changed(j)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432);
                } else {
                    i9 = i4;
                }
                if ((i & 1879048192) == 0) {
                    i9 |= ((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? 536870912 : 268435456;
                }
                if ((i2 & 14) == 0) {
                    i10 = i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(j3)) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if ((i2 & 112) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(j4)) {
                        i14 = 32;
                        i10 |= i14;
                    }
                    i14 = 16;
                    i10 |= i14;
                }
                i11 = i3 & 4096;
                if (i11 != 0) {
                    i10 |= 384;
                } else if ((i2 & 896) == 0) {
                    i10 |= startRestartGroup.changed(f) ? 256 : 128;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i10 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                    } else if ((i2 & 7168) == 0) {
                        i10 |= startRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                        if ((i9 & 1533916891) == 306783378 || (i10 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i16 != 0) {
                                    companion = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    obj = null;
                                }
                                if (i6 != 0) {
                                    obj2 = null;
                                }
                                if (i7 != 0) {
                                    obj3 = null;
                                }
                                Object obj13 = i8 == 0 ? obj4 : null;
                                if ((i3 & 128) != 0) {
                                    shape2 = AlertDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i9 &= -29360129;
                                } else {
                                    shape2 = obj5;
                                }
                                if ((i3 & 256) != 0) {
                                    j5 = AlertDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i9 &= -234881025;
                                } else {
                                    j5 = j;
                                }
                                if ((i3 & 512) != 0) {
                                    j6 = AlertDialogDefaults.INSTANCE.getIconContentColor(startRestartGroup, 6);
                                    i9 &= -1879048193;
                                } else {
                                    j6 = j2;
                                }
                                if ((i3 & 1024) != 0) {
                                    j7 = AlertDialogDefaults.INSTANCE.getTitleContentColor(startRestartGroup, 6);
                                    i10 &= -15;
                                } else {
                                    j7 = j3;
                                }
                                if ((i3 & 2048) != 0) {
                                    j8 = AlertDialogDefaults.INSTANCE.getTextContentColor(startRestartGroup, 6);
                                    i10 &= -113;
                                } else {
                                    j8 = j4;
                                }
                                float m1565getTonalElevationD9Ej5fM = i11 != 0 ? AlertDialogDefaults.INSTANCE.m1565getTonalElevationD9Ej5fM() : f;
                                if (i12 != 0) {
                                    f2 = m1565getTonalElevationD9Ej5fM;
                                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                                } else {
                                    dialogProperties2 = dialogProperties;
                                    f2 = m1565getTonalElevationD9Ej5fM;
                                }
                                obj6 = obj13;
                                obj7 = obj;
                                obj8 = shape2;
                                j9 = j8;
                                obj9 = companion;
                                j10 = j5;
                                j11 = j7;
                                i13 = i9;
                                obj10 = obj2;
                                obj11 = obj3;
                                j12 = j6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i9 &= -234881025;
                                }
                                if ((i3 & 512) != 0) {
                                    i9 &= -1879048193;
                                }
                                if ((i3 & 1024) != 0) {
                                    i10 &= -15;
                                }
                                if ((i3 & 2048) != 0) {
                                    i10 &= -113;
                                }
                                j10 = j;
                                j11 = j3;
                                j9 = j4;
                                f2 = f;
                                dialogProperties2 = dialogProperties;
                                obj7 = obj;
                                obj10 = obj2;
                                obj11 = obj3;
                                obj6 = obj4;
                                obj8 = obj5;
                                obj9 = companion;
                                i13 = i9;
                                j12 = j2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2081346864, i13, i10, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:76)");
                            }
                            Modifier modifier3 = obj9;
                            int i17 = i10;
                            int i18 = i13;
                            composer2 = startRestartGroup;
                            AlertDialog(onDismissRequest, modifier3, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new AndroidAlertDialog_androidKt$AlertDialog$1(obj10, obj11, obj6, obj8, j10, f2, j12, j11, j9, i18, i17, obj7, confirmButton)), composer2, (i18 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i18 >> 3) & 112) | ((i17 >> 3) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            obj12 = obj7;
                            function25 = obj11;
                            function26 = obj6;
                            shape3 = obj8;
                            j13 = j10;
                            j14 = j12;
                            j15 = j11;
                            j16 = j9;
                            f3 = f2;
                            dialogProperties3 = dialogProperties2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            j16 = j4;
                            f3 = f;
                            dialogProperties3 = dialogProperties;
                            obj10 = obj2;
                            function25 = obj3;
                            function26 = obj4;
                            shape3 = obj5;
                            modifier2 = companion;
                            j13 = j;
                            j14 = j2;
                            obj12 = obj;
                            composer2 = startRestartGroup;
                            j15 = j3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$2(onDismissRequest, confirmButton, modifier2, obj12, obj10, function25, function26, shape3, j13, j14, j15, j16, f3, dialogProperties3, i, i2, i3));
                        return;
                    }
                    if ((i9 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    obj6 = obj13;
                    obj7 = obj;
                    obj8 = shape2;
                    j9 = j8;
                    obj9 = companion;
                    j10 = j5;
                    j11 = j7;
                    i13 = i9;
                    obj10 = obj2;
                    obj11 = obj3;
                    j12 = j6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier32 = obj9;
                    int i172 = i10;
                    int i182 = i13;
                    composer2 = startRestartGroup;
                    AlertDialog(onDismissRequest, modifier32, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new AndroidAlertDialog_androidKt$AlertDialog$1(obj10, obj11, obj6, obj8, j10, f2, j12, j11, j9, i182, i172, obj7, confirmButton)), composer2, (i182 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i182 >> 3) & 112) | ((i172 >> 3) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier32;
                    obj12 = obj7;
                    function25 = obj11;
                    function26 = obj6;
                    shape3 = obj8;
                    j13 = j10;
                    j14 = j12;
                    j15 = j11;
                    j16 = j9;
                    f3 = f2;
                    dialogProperties3 = dialogProperties2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if ((i9 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                obj6 = obj13;
                obj7 = obj;
                obj8 = shape2;
                j9 = j8;
                obj9 = companion;
                j10 = j5;
                j11 = j7;
                i13 = i9;
                obj10 = obj2;
                obj11 = obj3;
                j12 = j6;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier322 = obj9;
                int i1722 = i10;
                int i1822 = i13;
                composer2 = startRestartGroup;
                AlertDialog(onDismissRequest, modifier322, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new AndroidAlertDialog_androidKt$AlertDialog$1(obj10, obj11, obj6, obj8, j10, f2, j12, j11, j9, i1822, i1722, obj7, confirmButton)), composer2, (i1822 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i1822 >> 3) & 112) | ((i1722 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier322;
                obj12 = obj7;
                function25 = obj11;
                function26 = obj6;
                shape3 = obj8;
                j13 = j10;
                j14 = j12;
                j15 = j11;
                j16 = j9;
                f3 = f2;
                dialogProperties3 = dialogProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = function2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i2 & 14) == 0) {
            }
            if ((i2 & 112) == 0) {
            }
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if ((i9 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            obj6 = obj13;
            obj7 = obj;
            obj8 = shape2;
            j9 = j8;
            obj9 = companion;
            j10 = j5;
            j11 = j7;
            i13 = i9;
            obj10 = obj2;
            obj11 = obj3;
            j12 = j6;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier3222 = obj9;
            int i17222 = i10;
            int i18222 = i13;
            composer2 = startRestartGroup;
            AlertDialog(onDismissRequest, modifier3222, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new AndroidAlertDialog_androidKt$AlertDialog$1(obj10, obj11, obj6, obj8, j10, f2, j12, j11, j9, i18222, i17222, obj7, confirmButton)), composer2, (i18222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i18222 >> 3) & 112) | ((i17222 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3222;
            obj12 = obj7;
            function25 = obj11;
            function26 = obj6;
            shape3 = obj8;
            j13 = j10;
            j14 = j12;
            j15 = j11;
            j16 = j9;
            f3 = f2;
            dialogProperties3 = dialogProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        companion = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        obj = function2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) == 0) {
        }
        if ((i2 & 112) == 0) {
        }
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if ((i9 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        obj6 = obj13;
        obj7 = obj;
        obj8 = shape2;
        j9 = j8;
        obj9 = companion;
        j10 = j5;
        j11 = j7;
        i13 = i9;
        obj10 = obj2;
        obj11 = obj3;
        j12 = j6;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier32222 = obj9;
        int i172222 = i10;
        int i182222 = i13;
        composer2 = startRestartGroup;
        AlertDialog(onDismissRequest, modifier32222, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, 741647174, true, new AndroidAlertDialog_androidKt$AlertDialog$1(obj10, obj11, obj6, obj8, j10, f2, j12, j11, j9, i182222, i172222, obj7, confirmButton)), composer2, (i182222 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i182222 >> 3) & 112) | ((i172222 >> 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32222;
        obj12 = obj7;
        function25 = obj11;
        function26 = obj6;
        shape3 = obj8;
        j13 = j10;
        j14 = j12;
        j15 = j11;
        j16 = j9;
        f3 = f2;
        dialogProperties3 = dialogProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertDialog(Function0<Unit> onDismissRequest, Modifier modifier, DialogProperties dialogProperties, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        Modifier modifier2;
        DialogProperties dialogProperties2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(63450171);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(2,1,3)150@7189L452:AndroidAlertDialog.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = dialogProperties;
                i3 |= startRestartGroup.changed(obj2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.Companion : obj;
                    DialogProperties dialogProperties3 = i4 != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(63450171, i3, -1, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:144)");
                    }
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 823217604, true, new AndroidAlertDialog_androidKt$AlertDialog$3(companion, content, i3)), startRestartGroup, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    dialogProperties2 = dialogProperties3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = obj;
                    dialogProperties2 = obj2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new AndroidAlertDialog_androidKt$AlertDialog$4(onDismissRequest, modifier2, dialogProperties2, content, i, i2));
                return;
            }
            obj2 = dialogProperties;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 823217604, true, new AndroidAlertDialog_androidKt$AlertDialog$3(companion, content, i3)), startRestartGroup, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            dialogProperties2 = dialogProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj2 = dialogProperties;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 823217604, true, new AndroidAlertDialog_androidKt$AlertDialog$3(companion, content, i3)), startRestartGroup, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        dialogProperties2 = dialogProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
