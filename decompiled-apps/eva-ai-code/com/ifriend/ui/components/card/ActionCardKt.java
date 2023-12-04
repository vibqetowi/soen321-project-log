package com.ifriend.ui.components.card;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.ui.R;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActionCard.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0004H\u0007¢\u0006\u0002\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"ActionCard", "", "onClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "modifier", "Landroidx/compose/ui/Modifier;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "tintColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "iconHeight", "iconWidth", "resId", "", "enabled", "", "ActionCard-drCWNGk", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;FFJJLandroidx/compose/ui/graphics/Shape;FFIZLandroidx/compose/runtime/Composer;III)V", "CloseActionCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActionCardKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /* renamed from: ActionCard-drCWNGk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7034ActionCarddrCWNGk(Function0<Unit> onClick, Modifier modifier, float f, float f2, long j, long j2, Shape shape, float f3, float f4, int i, boolean z, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        float f5;
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j4;
        long j5;
        RoundedCornerShape roundedCornerShape;
        boolean z2;
        float f6;
        float f7;
        Modifier modifier2;
        Shape shape2;
        float f8;
        long j6;
        int i15;
        float f9;
        Composer composer2;
        float f10;
        Shape shape3;
        float f11;
        float f12;
        long j7;
        long j8;
        float f13;
        boolean z3;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1370177129);
        ComposerKt.sourceInformation(startRestartGroup, "C(ActionCard)P(6,5,2:c#ui.unit.Dp,10:c#ui.unit.Dp,0:c#ui.graphics.Color,9:c#ui.graphics.Color,8,3:c#ui.unit.Dp,4:c#ui.unit.Dp,7)");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                i5 |= startRestartGroup.changed(f) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i2 & 7168) == 0) {
                    f5 = f2;
                    i5 |= startRestartGroup.changed(f5) ? 2048 : 1024;
                    if ((i2 & 57344) != 0) {
                        if ((i4 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i16 = 16384;
                                i5 |= i16;
                            }
                        } else {
                            j3 = j;
                        }
                        i16 = 8192;
                        i5 |= i16;
                    } else {
                        j3 = j;
                    }
                    if ((i2 & 458752) != 0) {
                        i8 = i17;
                        i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(j2)) ? 131072 : 65536;
                    } else {
                        i8 = i17;
                    }
                    if ((i2 & 3670016) == 0) {
                        i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 29360128) == 0) {
                        i5 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i5 |= startRestartGroup.changed(f4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i4 & 512) == 0) {
                        i5 |= C.ENCODING_PCM_32BIT;
                    } else if ((1879048192 & i2) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                        i11 = i4 & 1024;
                        if (i11 != 0) {
                            i13 = i3 | 6;
                        } else if ((i3 & 14) != 0) {
                            i12 = i3;
                            if ((i5 & 1533916891) == 306783378 || (i12 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i8 == 0 ? Modifier.Companion : modifier;
                                    float m5607constructorimpl = i6 == 0 ? Dp.m5607constructorimpl(40) : f;
                                    float m5607constructorimpl2 = i7 == 0 ? Dp.m5607constructorimpl(45) : f5;
                                    if ((i4 & 16) == 0) {
                                        j4 = AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7101getLight100d7_KjU();
                                        i5 &= -57345;
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        j4 = j3;
                                    }
                                    if ((i4 & 32) == 0) {
                                        j5 = AppTheme.INSTANCE.getColors(startRestartGroup, i14).m7100getLight0d7_KjU();
                                        i5 &= -458753;
                                    } else {
                                        j5 = j2;
                                    }
                                    if ((i4 & 64) == 0) {
                                        roundedCornerShape = AppTheme.INSTANCE.getShapes(startRestartGroup, i14).getLarge();
                                        i5 &= -3670017;
                                    } else {
                                        roundedCornerShape = shape;
                                    }
                                    float m5607constructorimpl3 = i9 == 0 ? Dp.m5607constructorimpl(24) : f3;
                                    float m5607constructorimpl4 = i10 == 0 ? Dp.m5607constructorimpl(24) : f4;
                                    if (i11 == 0) {
                                        f6 = m5607constructorimpl3;
                                        f7 = m5607constructorimpl4;
                                        modifier2 = companion;
                                        shape2 = roundedCornerShape;
                                        f8 = m5607constructorimpl;
                                        j6 = j5;
                                        z2 = true;
                                    } else {
                                        z2 = z;
                                        f6 = m5607constructorimpl3;
                                        f7 = m5607constructorimpl4;
                                        modifier2 = companion;
                                        shape2 = roundedCornerShape;
                                        f8 = m5607constructorimpl;
                                        j6 = j5;
                                    }
                                    i15 = i5;
                                    f9 = m5607constructorimpl2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i4 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    modifier2 = modifier;
                                    f8 = f;
                                    j6 = j2;
                                    shape2 = shape;
                                    f6 = f3;
                                    f7 = f4;
                                    z2 = z;
                                    j4 = j3;
                                    i15 = i5;
                                    f9 = f5;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1370177129, i15, i12, "com.ifriend.ui.components.card.ActionCard (ActionCard.kt:33)");
                                }
                                float f14 = f9;
                                float f15 = f8;
                                Modifier modifier4 = modifier2;
                                composer2 = startRestartGroup;
                                SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(modifier2, f8), f9), z2, shape2, j4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1902296446, true, new ActionCardKt$ActionCard$1(f6, f7, i, i15, j6)), composer2, (i15 & 14) | ((i12 << 6) & 896) | ((i15 >> 9) & 7168) | (57344 & i15), 6, 992);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f10 = f14;
                                shape3 = shape2;
                                f11 = f15;
                                f12 = f6;
                                j7 = j4;
                                j8 = j6;
                                f13 = f7;
                                z3 = z2;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                j8 = j2;
                                shape3 = shape;
                                f12 = f3;
                                f13 = f4;
                                z3 = z;
                                composer2 = startRestartGroup;
                                f10 = f5;
                                j7 = j3;
                                f11 = f;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new ActionCardKt$ActionCard$2(onClick, modifier3, f11, f10, j7, j8, shape3, f12, f13, i, z3, i2, i3, i4));
                            return;
                        } else {
                            i13 = i3 | (startRestartGroup.changed(z) ? 4 : 2);
                        }
                        i12 = i13;
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i4 & 16) == 0) {
                        }
                        if ((i4 & 32) == 0) {
                        }
                        if ((i4 & 64) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        i15 = i5;
                        f9 = m5607constructorimpl2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        float f142 = f9;
                        float f152 = f8;
                        Modifier modifier42 = modifier2;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(modifier2, f8), f9), z2, shape2, j4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1902296446, true, new ActionCardKt$ActionCard$1(f6, f7, i, i15, j6)), composer2, (i15 & 14) | ((i12 << 6) & 896) | ((i15 >> 9) & 7168) | (57344 & i15), 6, 992);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f10 = f142;
                        shape3 = shape2;
                        f11 = f152;
                        f12 = f6;
                        j7 = j4;
                        j8 = j6;
                        f13 = f7;
                        z3 = z2;
                        modifier3 = modifier42;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i4 & 1024;
                    if (i11 != 0) {
                    }
                    i12 = i13;
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i4 & 16) == 0) {
                    }
                    if ((i4 & 32) == 0) {
                    }
                    if ((i4 & 64) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    i15 = i5;
                    f9 = m5607constructorimpl2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float f1422 = f9;
                    float f1522 = f8;
                    Modifier modifier422 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(modifier2, f8), f9), z2, shape2, j4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1902296446, true, new ActionCardKt$ActionCard$1(f6, f7, i, i15, j6)), composer2, (i15 & 14) | ((i12 << 6) & 896) | ((i15 >> 9) & 7168) | (57344 & i15), 6, 992);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f10 = f1422;
                    shape3 = shape2;
                    f11 = f1522;
                    f12 = f6;
                    j7 = j4;
                    j8 = j6;
                    f13 = f7;
                    z3 = z2;
                    modifier3 = modifier422;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f5 = f2;
                if ((i2 & 57344) != 0) {
                }
                if ((i2 & 458752) != 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                i11 = i4 & 1024;
                if (i11 != 0) {
                }
                i12 = i13;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 16) == 0) {
                }
                if ((i4 & 32) == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                i15 = i5;
                f9 = m5607constructorimpl2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                float f14222 = f9;
                float f15222 = f8;
                Modifier modifier4222 = modifier2;
                composer2 = startRestartGroup;
                SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(modifier2, f8), f9), z2, shape2, j4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1902296446, true, new ActionCardKt$ActionCard$1(f6, f7, i, i15, j6)), composer2, (i15 & 14) | ((i12 << 6) & 896) | ((i15 >> 9) & 7168) | (57344 & i15), 6, 992);
                if (ComposerKt.isTraceInProgress()) {
                }
                f10 = f14222;
                shape3 = shape2;
                f11 = f15222;
                f12 = f6;
                j7 = j4;
                j8 = j6;
                f13 = f7;
                z3 = z2;
                modifier3 = modifier4222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            f5 = f2;
            if ((i2 & 57344) != 0) {
            }
            if ((i2 & 458752) != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            i12 = i13;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 16) == 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            i15 = i5;
            f9 = m5607constructorimpl2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            float f142222 = f9;
            float f152222 = f8;
            Modifier modifier42222 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(modifier2, f8), f9), z2, shape2, j4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1902296446, true, new ActionCardKt$ActionCard$1(f6, f7, i, i15, j6)), composer2, (i15 & 14) | ((i12 << 6) & 896) | ((i15 >> 9) & 7168) | (57344 & i15), 6, 992);
            if (ComposerKt.isTraceInProgress()) {
            }
            f10 = f142222;
            shape3 = shape2;
            f11 = f152222;
            f12 = f6;
            j7 = j4;
            j8 = j6;
            f13 = f7;
            z3 = z2;
            modifier3 = modifier42222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        f5 = f2;
        if ((i2 & 57344) != 0) {
        }
        if ((i2 & 458752) != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        i12 = i13;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        i15 = i5;
        f9 = m5607constructorimpl2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        float f1422222 = f9;
        float f1522222 = f8;
        Modifier modifier422222 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(modifier2, f8), f9), z2, shape2, j4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1902296446, true, new ActionCardKt$ActionCard$1(f6, f7, i, i15, j6)), composer2, (i15 & 14) | ((i12 << 6) & 896) | ((i15 >> 9) & 7168) | (57344 & i15), 6, 992);
        if (ComposerKt.isTraceInProgress()) {
        }
        f10 = f1422222;
        shape3 = shape2;
        f11 = f1522222;
        f12 = f6;
        j7 = j4;
        j8 = j6;
        f13 = f7;
        z3 = z2;
        modifier3 = modifier422222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CloseActionCard(Function0<Unit> onClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(435069482);
        ComposerKt.sourceInformation(startRestartGroup, "C(CloseActionCard)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435069482, i2, -1, "com.ifriend.ui.components.card.CloseActionCard (ActionCard.kt:60)");
            }
            composer2 = startRestartGroup;
            m7034ActionCarddrCWNGk(onClick, null, 0.0f, 0.0f, AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7104getLight50d7_KjU(), 0L, null, 0.0f, 0.0f, R.drawable.ic_close, false, composer2, i2 & 14, 0, 1518);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ActionCardKt$CloseActionCard$1(onClick, i));
    }
}
