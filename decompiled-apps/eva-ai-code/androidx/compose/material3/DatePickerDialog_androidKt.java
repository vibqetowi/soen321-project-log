package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DatePickerDialog.android.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009d\u0001\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DialogButtonsCrossAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DialogButtonsMainAxisSpacing", "DialogButtonsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "tonalElevation", "colors", "Landroidx/compose/material3/DatePickerColors;", "properties", "Landroidx/compose/ui/window/DialogProperties;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerDialog_androidKt {
    private static final float DialogButtonsCrossAxisSpacing = Dp.m5607constructorimpl(12);
    private static final float DialogButtonsMainAxisSpacing;
    private static final PaddingValues DialogButtonsPadding;

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* renamed from: DatePickerDialog-GmEhDVc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1736DatePickerDialogGmEhDVc(Function0<Unit> onDismissRequest, Function2<? super Composer, ? super Integer, Unit> confirmButton, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        Object obj3;
        int i5;
        float f2;
        int i6;
        Object obj4;
        int i7;
        Object obj5;
        int i8;
        Shape shape2;
        float m1735getTonalElevationD9Ej5fM;
        DatePickerColors datePickerColors2;
        DialogProperties dialogProperties2;
        Object obj6;
        Modifier modifier2;
        DatePickerColors datePickerColors3;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        DialogProperties dialogProperties3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        float f3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-36517340);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerDialog)P(5,1,4,3,7,8:c#ui.unit.Dp!1,6)69@3485L5,71@3602L8,75@3754L1602:DatePickerDialog.android.kt#uh7d8r");
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
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj2 = function2;
                i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = shape;
                        if (startRestartGroup.changed(obj3)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        obj3 = shape;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    obj3 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((3670016 & i) == 0) {
                        if ((i2 & 64) == 0 && startRestartGroup.changed(datePickerColors)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        obj4 = dialogProperties;
                    } else {
                        obj4 = dialogProperties;
                        if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(obj4) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) != 0) {
                        if ((234881024 & i) == 0) {
                            i7 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i11 != 0 ? Modifier.Companion : obj;
                                obj5 = i4 != 0 ? null : obj2;
                                if ((i2 & 16) != 0) {
                                    i8 = i3 & (-57345);
                                    shape2 = DatePickerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    i8 = i3;
                                    shape2 = obj3;
                                }
                                m1735getTonalElevationD9Ej5fM = i5 != 0 ? DatePickerDefaults.INSTANCE.m1735getTonalElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    datePickerColors2 = DatePickerDefaults.INSTANCE.m1734colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, C.ENCODING_PCM_32BIT, 524287);
                                    i8 &= -3670017;
                                } else {
                                    datePickerColors2 = datePickerColors;
                                }
                                dialogProperties2 = i6 != 0 ? new DialogProperties(false, false, null, false, false, 23, null) : dialogProperties;
                                obj6 = shape2;
                                modifier2 = companion;
                                datePickerColors3 = datePickerColors2;
                                i3 = i8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                datePickerColors3 = datePickerColors;
                                dialogProperties2 = dialogProperties;
                                modifier2 = obj;
                                obj5 = obj2;
                                obj6 = obj3;
                                m1735getTonalElevationD9Ej5fM = f2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-36517340, i3, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                            }
                            composer2 = startRestartGroup;
                            Modifier modifier4 = modifier2;
                            AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -476003174, true, new DatePickerDialog_androidKt$DatePickerDialog$1(obj6, datePickerColors3, m1735getTonalElevationD9Ej5fM, i3, content, obj5, confirmButton)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 >> 15) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            shape3 = obj6;
                            dialogProperties3 = dialogProperties2;
                            function22 = obj5;
                            f3 = m1735getTonalElevationD9Ej5fM;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            datePickerColors3 = datePickerColors;
                            modifier3 = obj;
                            function22 = obj2;
                            shape3 = obj3;
                            f3 = f2;
                            dialogProperties3 = obj4;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new DatePickerDialog_androidKt$DatePickerDialog$2(onDismissRequest, confirmButton, modifier3, function22, shape3, f3, datePickerColors3, dialogProperties3, content, i, i2));
                        return;
                    }
                    i7 = 100663296;
                    i3 |= i7;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    obj6 = shape2;
                    modifier2 = companion;
                    datePickerColors3 = datePickerColors2;
                    i3 = i8;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    Modifier modifier42 = modifier2;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -476003174, true, new DatePickerDialog_androidKt$DatePickerDialog$1(obj6, datePickerColors3, m1735getTonalElevationD9Ej5fM, i3, content, obj5, confirmButton)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    shape3 = obj6;
                    dialogProperties3 = dialogProperties2;
                    function22 = obj5;
                    f3 = m1735getTonalElevationD9Ej5fM;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                if ((3670016 & i) == 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                obj6 = shape2;
                modifier2 = companion;
                datePickerColors3 = datePickerColors2;
                i3 = i8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                Modifier modifier422 = modifier2;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -476003174, true, new DatePickerDialog_androidKt$DatePickerDialog$1(obj6, datePickerColors3, m1735getTonalElevationD9Ej5fM, i3, content, obj5, confirmButton)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier422;
                shape3 = obj6;
                dialogProperties3 = dialogProperties2;
                function22 = obj5;
                f3 = m1735getTonalElevationD9Ej5fM;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj2 = function2;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((3670016 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            obj6 = shape2;
            modifier2 = companion;
            datePickerColors3 = datePickerColors2;
            i3 = i8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Modifier modifier4222 = modifier2;
            AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -476003174, true, new DatePickerDialog_androidKt$DatePickerDialog$1(obj6, datePickerColors3, m1735getTonalElevationD9Ej5fM, i3, content, obj5, confirmButton)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 >> 15) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4222;
            shape3 = obj6;
            dialogProperties3 = dialogProperties2;
            function22 = obj5;
            f3 = m1735getTonalElevationD9Ej5fM;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = function2;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((3670016 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        obj6 = shape2;
        modifier2 = companion;
        datePickerColors3 = datePickerColors2;
        i3 = i8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Modifier modifier42222 = modifier2;
        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -476003174, true, new DatePickerDialog_androidKt$DatePickerDialog$1(obj6, datePickerColors3, m1735getTonalElevationD9Ej5fM, i3, content, obj5, confirmButton)), composer2, (i3 & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 >> 15) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier42222;
        shape3 = obj6;
        dialogProperties3 = dialogProperties2;
        function22 = obj5;
        f3 = m1735getTonalElevationD9Ej5fM;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static {
        float f = 8;
        DialogButtonsPadding = PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m5607constructorimpl(6), Dp.m5607constructorimpl(f), 3, null);
        DialogButtonsMainAxisSpacing = Dp.m5607constructorimpl(f);
    }
}
