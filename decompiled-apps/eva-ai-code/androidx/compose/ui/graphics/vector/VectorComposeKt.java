package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.motion.widget.Key;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import io.grpc.netty.shaded.io.netty.handler.codec.http.cookie.CookieHeaderNames;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a©\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Group", "", "name", "", Key.ROTATION, "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", CookieHeaderNames.PATH, "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        float f8;
        int i5;
        float f9;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        List<? extends PathNode> emptyPath;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        List<? extends PathNode> list2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-213417674);
        ComposerKt.sourceInformation(startRestartGroup, "C(Group)P(2,5,3,4,6,7,8,9)58@2500L585:VectorCompose.kt#huu6hf");
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                f8 = f2;
                i3 |= startRestartGroup.changed(f8) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    f9 = f3;
                    i3 |= startRestartGroup.changed(f9) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(f5) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(f7) ? 8388608 : 4194304;
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i11 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if (i10 == 256 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                str2 = i12 != 0 ? "" : str;
                                f10 = i13 != 0 ? 0.0f : f;
                                if (i4 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i5 != 0) {
                                    f9 = 0.0f;
                                }
                                f11 = i6 != 0 ? 1.0f : f4;
                                f12 = i7 == 0 ? f5 : 1.0f;
                                f13 = i8 != 0 ? 0.0f : f6;
                                f14 = i9 == 0 ? f7 : 0.0f;
                                if (i10 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                                    }
                                    VectorComposeKt$Group$1 vectorComposeKt$Group$1 = VectorComposeKt$Group$1.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-548224868);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(vectorComposeKt$Group$1);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                                    Updater.m2900setimpl(m2893constructorimpl, str2, VectorComposeKt$Group$2$1.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f10), VectorComposeKt$Group$2$2.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f8), VectorComposeKt$Group$2$3.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f9), VectorComposeKt$Group$2$4.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f12), VectorComposeKt$Group$2$6.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f13), VectorComposeKt$Group$2$7.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f14), VectorComposeKt$Group$2$8.INSTANCE);
                                    Updater.m2900setimpl(m2893constructorimpl, emptyPath, VectorComposeKt$Group$2$9.INSTANCE);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                                    content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f15 = f14;
                                    f16 = f12;
                                    f17 = f8;
                                    f18 = f9;
                                    f19 = f13;
                                    list2 = emptyPath;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i10 != 0) {
                                    i3 &= -234881025;
                                }
                                str2 = str;
                                f10 = f;
                                f11 = f4;
                                f12 = f5;
                                f13 = f6;
                                f14 = f7;
                            }
                            emptyPath = list;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            VectorComposeKt$Group$1 vectorComposeKt$Group$12 = VectorComposeKt$Group$1.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-548224868);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                            }
                            startRestartGroup.startNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl2, str2, VectorComposeKt$Group$2$1.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f10), VectorComposeKt$Group$2$2.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f8), VectorComposeKt$Group$2$3.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f9), VectorComposeKt$Group$2$4.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f12), VectorComposeKt$Group$2$6.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f13), VectorComposeKt$Group$2$7.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, Float.valueOf(f14), VectorComposeKt$Group$2$8.INSTANCE);
                            Updater.m2900setimpl(m2893constructorimpl2, emptyPath, VectorComposeKt$Group$2$9.INSTANCE);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f15 = f14;
                            f16 = f12;
                            f17 = f8;
                            f18 = f9;
                            f19 = f13;
                            list2 = emptyPath;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str2 = str;
                            f10 = f;
                            f11 = f4;
                            f16 = f5;
                            f19 = f6;
                            f15 = f7;
                            f17 = f8;
                            f18 = f9;
                            list2 = list;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new VectorComposeKt$Group$4(str2, f10, f17, f18, f11, f16, f19, f15, list2, content, i, i2));
                        return;
                    }
                    i11 = C.ENCODING_PCM_32BIT;
                    i3 |= i11;
                    if (i10 == 256) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    emptyPath = list;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    VectorComposeKt$Group$1 vectorComposeKt$Group$122 = VectorComposeKt$Group$1.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-548224868);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                    }
                    startRestartGroup.startNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m2893constructorimpl22 = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl22, str2, VectorComposeKt$Group$2$1.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f10), VectorComposeKt$Group$2$2.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f8), VectorComposeKt$Group$2$3.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f9), VectorComposeKt$Group$2$4.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f12), VectorComposeKt$Group$2$6.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f13), VectorComposeKt$Group$2$7.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, Float.valueOf(f14), VectorComposeKt$Group$2$8.INSTANCE);
                    Updater.m2900setimpl(m2893constructorimpl22, emptyPath, VectorComposeKt$Group$2$9.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                    content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f9 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i11;
                if (i10 == 256) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                emptyPath = list;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                VectorComposeKt$Group$1 vectorComposeKt$Group$1222 = VectorComposeKt$Group$1.INSTANCE;
                startRestartGroup.startReplaceableGroup(-548224868);
                ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                }
                startRestartGroup.startNode();
                if (!startRestartGroup.getInserting()) {
                }
                Composer m2893constructorimpl222 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl222, str2, VectorComposeKt$Group$2$1.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f10), VectorComposeKt$Group$2$2.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f8), VectorComposeKt$Group$2$3.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f9), VectorComposeKt$Group$2$4.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f12), VectorComposeKt$Group$2$6.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f13), VectorComposeKt$Group$2$7.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, Float.valueOf(f14), VectorComposeKt$Group$2$8.INSTANCE);
                Updater.m2900setimpl(m2893constructorimpl222, emptyPath, VectorComposeKt$Group$2$9.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
                content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f8 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f9 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i11;
            if (i10 == 256) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            emptyPath = list;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            VectorComposeKt$Group$1 vectorComposeKt$Group$12222 = VectorComposeKt$Group$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-548224868);
            ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            }
            startRestartGroup.startNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m2893constructorimpl2222 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2222, str2, VectorComposeKt$Group$2$1.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f10), VectorComposeKt$Group$2$2.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f8), VectorComposeKt$Group$2$3.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f9), VectorComposeKt$Group$2$4.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f12), VectorComposeKt$Group$2$6.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f13), VectorComposeKt$Group$2$7.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, Float.valueOf(f14), VectorComposeKt$Group$2$8.INSTANCE);
            Updater.m2900setimpl(m2893constructorimpl2222, emptyPath, VectorComposeKt$Group$2$9.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            f15 = f14;
            f16 = f12;
            f17 = f8;
            f18 = f9;
            f19 = f13;
            list2 = emptyPath;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f8 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f9 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i11;
        if (i10 == 256) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        emptyPath = list;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        VectorComposeKt$Group$1 vectorComposeKt$Group$122222 = VectorComposeKt$Group$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(-548224868);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode)P(1,2)332@12475L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
        }
        startRestartGroup.startNode();
        if (!startRestartGroup.getInserting()) {
        }
        Composer m2893constructorimpl22222 = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl22222, str2, VectorComposeKt$Group$2$1.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f10), VectorComposeKt$Group$2$2.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f8), VectorComposeKt$Group$2$3.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f9), VectorComposeKt$Group$2$4.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f11), VectorComposeKt$Group$2$5.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f12), VectorComposeKt$Group$2$6.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f13), VectorComposeKt$Group$2$7.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, Float.valueOf(f14), VectorComposeKt$Group$2$8.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl22222, emptyPath, VectorComposeKt$Group$2$9.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1894406143, "C72@3070L9:VectorCompose.kt#huu6hf");
        content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        f15 = f14;
        f16 = f12;
        f17 = f8;
        f18 = f9;
        f19 = f13;
        list2 = emptyPath;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Path-9cdaXJ4  reason: not valid java name */
    public static final void m3936Path9cdaXJ4(List<? extends PathNode> pathData, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, Composer composer, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        ComposerKt.sourceInformation(startRestartGroup, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)115@5068L876:VectorCompose.kt#huu6hf");
        int defaultFillType = (i6 & 2) != 0 ? VectorKt.getDefaultFillType() : i;
        String str2 = (i6 & 4) != 0 ? "" : str;
        Brush brush3 = (i6 & 8) != 0 ? null : brush;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        Brush brush4 = (i6 & 32) == 0 ? brush2 : null;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i6 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i6 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i4, i5, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        }
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(1886828752);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
        } else {
            startRestartGroup.useNode();
        }
        Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, str2, VectorComposeKt$Path$2$1.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, pathData, VectorComposeKt$Path$2$2.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, PathFillType.m3567boximpl(defaultFillType), VectorComposeKt$Path$2$3.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, brush3, VectorComposeKt$Path$2$4.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f8), VectorComposeKt$Path$2$5.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, brush4, VectorComposeKt$Path$2$6.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f9), VectorComposeKt$Path$2$7.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f10), VectorComposeKt$Path$2$8.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, StrokeJoin.m3647boximpl(defaultStrokeLineJoin), VectorComposeKt$Path$2$9.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, StrokeCap.m3637boximpl(defaultStrokeLineCap), VectorComposeKt$Path$2$10.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f11), VectorComposeKt$Path$2$11.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f12), VectorComposeKt$Path$2$12.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f13), VectorComposeKt$Path$2$13.INSTANCE);
        Updater.m2900setimpl(m2893constructorimpl, Float.valueOf(f14), VectorComposeKt$Path$2$14.INSTANCE);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new VectorComposeKt$Path$3(pathData, defaultFillType, str2, brush3, f8, brush4, f9, f10, defaultStrokeLineCap, defaultStrokeLineJoin, f11, f12, f13, f14, i4, i5, i6));
    }
}
