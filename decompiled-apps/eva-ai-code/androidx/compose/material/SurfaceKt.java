package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010'\u001a/\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /* renamed from: Surface-F-jzlyU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1471SurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        long j3;
        long j4;
        int i4;
        Object obj3;
        int i5;
        int i6;
        float m5607constructorimpl;
        long j5;
        Object obj4;
        Object obj5;
        Object obj6;
        long j6;
        int i7;
        Modifier modifier2;
        Shape shape2;
        long j7;
        BorderStroke borderStroke2;
        long j8;
        float f2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1412203386);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)107@5308L6,108@5350L22,*113@5525L7,114@5549L894:Surface.kt#jmzs0o");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj2 = shape;
            i3 |= startRestartGroup.changed(obj2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                obj3 = borderStroke;
                i3 |= startRestartGroup.changed(obj3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 3670016) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.Companion : obj;
                            if (i10 != 0) {
                                obj2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                obj3 = null;
                            }
                            m5607constructorimpl = i5 == 0 ? Dp.m5607constructorimpl(0) : f;
                            j5 = j4;
                            obj4 = obj3;
                            obj5 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                m5607constructorimpl = f;
                                j5 = j4;
                                obj4 = obj3;
                                obj5 = obj;
                                obj6 = obj2;
                                j6 = j3;
                                i7 = i3 & (-7169);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1412203386, i7, -1, "androidx.compose.material.Surface (Surface.kt:104)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float m5607constructorimpl2 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + m5607constructorimpl);
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new SurfaceKt$Surface$1(obj5, obj6, j6, m5607constructorimpl2, i7, obj4, m5607constructorimpl, content)), startRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = obj5;
                                shape2 = obj6;
                                j7 = j6;
                                borderStroke2 = obj4;
                                j8 = j5;
                                f2 = m5607constructorimpl;
                            } else {
                                m5607constructorimpl = f;
                                j5 = j4;
                                obj4 = obj3;
                                obj5 = obj;
                            }
                        }
                        obj6 = obj2;
                        j6 = j3;
                        i7 = i3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float m5607constructorimpl22 = Dp.m5607constructorimpl(((Dp) consume2).m5621unboximpl() + m5607constructorimpl);
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new SurfaceKt$Surface$1(obj5, obj6, j6, m5607constructorimpl22, i7, obj4, m5607constructorimpl, content)), startRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = obj5;
                        shape2 = obj6;
                        j7 = j6;
                        borderStroke2 = obj4;
                        j8 = j5;
                        f2 = m5607constructorimpl;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        shape2 = obj2;
                        j7 = j3;
                        j8 = j4;
                        borderStroke2 = obj3;
                        f2 = f;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new SurfaceKt$Surface$2(modifier2, shape2, j7, j8, borderStroke2, f2, content, i, i2));
                    return;
                }
                i6 = 1572864;
                i3 |= i6;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                j5 = j4;
                obj4 = obj3;
                obj5 = companion;
                obj6 = obj2;
                j6 = j3;
                i7 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m5607constructorimpl222 = Dp.m5607constructorimpl(((Dp) consume22).m5621unboximpl() + m5607constructorimpl);
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl222))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new SurfaceKt$Surface$1(obj5, obj6, j6, m5607constructorimpl222, i7, obj4, m5607constructorimpl, content)), startRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj5;
                shape2 = obj6;
                j7 = j6;
                borderStroke2 = obj4;
                j8 = j5;
                f2 = m5607constructorimpl;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj3 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            j5 = j4;
            obj4 = obj3;
            obj5 = companion;
            obj6 = obj2;
            j6 = j3;
            i7 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m5607constructorimpl2222 = Dp.m5607constructorimpl(((Dp) consume222).m5621unboximpl() + m5607constructorimpl);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2222))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new SurfaceKt$Surface$1(obj5, obj6, j6, m5607constructorimpl2222, i7, obj4, m5607constructorimpl, content)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj5;
            shape2 = obj6;
            j7 = j6;
            borderStroke2 = obj4;
            j8 = j5;
            f2 = m5607constructorimpl;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj2 = shape;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        obj3 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        j5 = j4;
        obj4 = obj3;
        obj5 = companion;
        obj6 = obj2;
        j6 = j3;
        i7 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m5607constructorimpl22222 = Dp.m5607constructorimpl(((Dp) consume2222).m5621unboximpl() + m5607constructorimpl);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22222))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new SurfaceKt$Surface$1(obj5, obj6, j6, m5607constructorimpl22222, i7, obj4, m5607constructorimpl, content)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj5;
        shape2 = obj6;
        j7 = j6;
        borderStroke2 = obj4;
        j8 = j5;
        f2 = m5607constructorimpl;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* renamed from: Surface-LPr_se0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1472SurfaceLPr_se0(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Object obj;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j4;
        long j5;
        MutableInteractionSource mutableInteractionSource2;
        float f2;
        Object obj2;
        boolean z3;
        long j6;
        long j7;
        BorderStroke borderStroke2;
        int i11;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        boolean z4;
        Shape shape2;
        long j8;
        long j9;
        BorderStroke borderStroke3;
        float f3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1560876237);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(8,7,5,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)216@10794L6,217@10836L22,220@10970L39,*223@11102L7,224@11126L982:Surface.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj = shape;
                    i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i13 = 16384;
                                i3 |= i13;
                            }
                        } else {
                            j3 = j;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            i6 = i14;
                            if (startRestartGroup.changed(j2)) {
                                i12 = 131072;
                                i3 |= i12;
                            }
                        } else {
                            i6 = i14;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        i6 = i14;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i10 = startRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i6 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : obj;
                                if ((i2 & 16) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                    i3 &= -57345;
                                } else {
                                    j4 = j3;
                                }
                                if ((i2 & 32) != 0) {
                                    j5 = ColorsKt.m1327contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 12) & 14);
                                    i3 &= -458753;
                                } else {
                                    j5 = j2;
                                }
                                BorderStroke borderStroke4 = i7 != 0 ? null : borderStroke;
                                float m5607constructorimpl = i8 != 0 ? Dp.m5607constructorimpl(0) : f;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    f2 = m5607constructorimpl;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    f2 = m5607constructorimpl;
                                }
                                obj2 = rectangleShape;
                                z3 = z2;
                                j6 = j4;
                                j7 = j5;
                                borderStroke2 = borderStroke4;
                                i11 = i3;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    modifier2 = modifier;
                                    j7 = j2;
                                    borderStroke2 = borderStroke;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z3 = z2;
                                    obj2 = obj;
                                    j6 = j3;
                                    i11 = i3 & (-458753);
                                } else {
                                    modifier2 = modifier;
                                    j7 = j2;
                                    borderStroke2 = borderStroke;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z3 = z2;
                                    obj2 = obj;
                                    j6 = j3;
                                    i11 = i3;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1560876237, i11, -1, "androidx.compose.material.Surface (Surface.kt:211)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float m5607constructorimpl2 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + f2);
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new SurfaceKt$Surface$4(modifier2, obj2, j6, m5607constructorimpl2, i11, borderStroke2, f2, mutableInteractionSource2, z3, onClick, content)), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            shape2 = obj2;
                            j8 = j6;
                            j9 = j7;
                            borderStroke3 = borderStroke2;
                            f3 = f2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z4 = z2;
                            shape2 = obj;
                            j8 = j3;
                            composer2 = startRestartGroup;
                            j9 = j2;
                            borderStroke3 = borderStroke;
                            f3 = f;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new SurfaceKt$Surface$5(onClick, modifier3, z4, shape2, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, i, i2));
                        return;
                    }
                    i10 = C.ENCODING_PCM_32BIT;
                    i3 |= i10;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    obj2 = rectangleShape;
                    z3 = z2;
                    j6 = j4;
                    j7 = j5;
                    borderStroke2 = borderStroke4;
                    i11 = i3;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m5607constructorimpl22 = Dp.m5607constructorimpl(((Dp) consume2).m5621unboximpl() + f2);
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new SurfaceKt$Surface$4(modifier2, obj2, j6, m5607constructorimpl22, i11, borderStroke2, f2, mutableInteractionSource2, z3, onClick, content)), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    shape2 = obj2;
                    j8 = j6;
                    j9 = j7;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = shape;
                if ((57344 & i) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i10;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                obj2 = rectangleShape;
                z3 = z2;
                j6 = j4;
                j7 = j5;
                borderStroke2 = borderStroke4;
                i11 = i3;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m5607constructorimpl222 = Dp.m5607constructorimpl(((Dp) consume22).m5621unboximpl() + f2);
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new SurfaceKt$Surface$4(modifier2, obj2, j6, m5607constructorimpl222, i11, borderStroke2, f2, mutableInteractionSource2, z3, onClick, content)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z4 = z3;
                shape2 = obj2;
                j8 = j6;
                j9 = j7;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj = shape;
            if ((57344 & i) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i10;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            obj2 = rectangleShape;
            z3 = z2;
            j6 = j4;
            j7 = j5;
            borderStroke2 = borderStroke4;
            i11 = i3;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m5607constructorimpl2222 = Dp.m5607constructorimpl(((Dp) consume222).m5621unboximpl() + f2);
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new SurfaceKt$Surface$4(modifier2, obj2, j6, m5607constructorimpl2222, i11, borderStroke2, f2, mutableInteractionSource2, z3, onClick, content)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z4 = z3;
            shape2 = obj2;
            j8 = j6;
            j9 = j7;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj = shape;
        if ((57344 & i) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i10;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        obj2 = rectangleShape;
        z3 = z2;
        j6 = j4;
        j7 = j5;
        borderStroke2 = borderStroke4;
        i11 = i3;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m5607constructorimpl22222 = Dp.m5607constructorimpl(((Dp) consume2222).m5621unboximpl() + f2);
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new SurfaceKt$Surface$4(modifier2, obj2, j6, m5607constructorimpl22222, i11, borderStroke2, f2, mutableInteractionSource2, z3, onClick, content)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z4 = z3;
        shape2 = obj2;
        j8 = j6;
        j9 = j7;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /* renamed from: Surface-Ny5ogXk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1473SurfaceNy5ogXk(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j3;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        float f2;
        boolean z3;
        Object obj2;
        int i12;
        long j5;
        Modifier modifier2;
        long j6;
        Composer composer2;
        Modifier modifier3;
        boolean z4;
        Shape shape2;
        long j7;
        long j8;
        BorderStroke borderStroke3;
        float f3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(262027249);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,7,5,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)330@16547L6,331@16589L22,334@16723L39,*337@16855L7,338@16879L1024:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj = shape;
                    i4 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                    if ((i & 458752) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        i7 = i4 | (((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288);
                    } else {
                        i7 = i4;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i7 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i7 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i7 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i7 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i7 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i7 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            i11 = i2 | (startRestartGroup.changedInstance(content) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        if ((i7 & 1533916891) == 306783378 || (i11 & 11) != 2 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i13 != 0 ? Modifier.Companion : modifier;
                                boolean z5 = i5 != 0 ? true : z2;
                                Shape rectangleShape = i6 != 0 ? RectangleShapeKt.getRectangleShape() : obj;
                                if ((i3 & 32) != 0) {
                                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                    i7 &= -458753;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & 64) != 0) {
                                    j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i7 >> 15) & 14);
                                    i7 &= -3670017;
                                } else {
                                    j4 = j2;
                                }
                                BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke;
                                float m5607constructorimpl = i9 != 0 ? Dp.m5607constructorimpl(0) : f;
                                if (i10 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    borderStroke2 = borderStroke4;
                                    f2 = m5607constructorimpl;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    borderStroke2 = borderStroke4;
                                    f2 = m5607constructorimpl;
                                }
                                z3 = z5;
                                obj2 = rectangleShape;
                                i12 = i7;
                                j5 = j4;
                                modifier2 = companion;
                                j6 = j3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    int i14 = i7 & (-3670017);
                                    modifier2 = modifier;
                                    z3 = z2;
                                    j6 = j;
                                    j5 = j2;
                                    borderStroke2 = borderStroke;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i12 = i14;
                                    obj2 = obj;
                                } else {
                                    z3 = z2;
                                    j6 = j;
                                    j5 = j2;
                                    borderStroke2 = borderStroke;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    obj2 = obj;
                                    i12 = i7;
                                    modifier2 = modifier;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(262027249, i12, i11, "androidx.compose.material.Surface (Surface.kt:324)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float m5607constructorimpl2 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + f2);
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2))}, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new SurfaceKt$Surface$7(modifier2, obj2, j6, m5607constructorimpl2, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onClick, content, i11)), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            shape2 = obj2;
                            j7 = j6;
                            j8 = j5;
                            borderStroke3 = borderStroke2;
                            f3 = f2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z4 = z2;
                            j7 = j;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            shape2 = obj;
                            composer2 = startRestartGroup;
                            j8 = j2;
                            f3 = f;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new SurfaceKt$Surface$8(z, onClick, modifier3, z4, shape2, j7, j8, borderStroke3, f3, mutableInteractionSource3, content, i, i2, i3));
                        return;
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    z3 = z5;
                    obj2 = rectangleShape;
                    i12 = i7;
                    j5 = j4;
                    modifier2 = companion;
                    j6 = j3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m5607constructorimpl22 = Dp.m5607constructorimpl(((Dp) consume2).m5621unboximpl() + f2);
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22))}, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new SurfaceKt$Surface$7(modifier2, obj2, j6, m5607constructorimpl22, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onClick, content, i11)), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    shape2 = obj2;
                    j7 = j6;
                    j8 = j5;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = shape;
                if ((i & 458752) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                z3 = z5;
                obj2 = rectangleShape;
                i12 = i7;
                j5 = j4;
                modifier2 = companion;
                j6 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m5607constructorimpl222 = Dp.m5607constructorimpl(((Dp) consume22).m5621unboximpl() + f2);
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl222))}, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new SurfaceKt$Surface$7(modifier2, obj2, j6, m5607constructorimpl222, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onClick, content, i11)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z4 = z3;
                shape2 = obj2;
                j7 = j6;
                j8 = j5;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            obj = shape;
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            z3 = z5;
            obj2 = rectangleShape;
            i12 = i7;
            j5 = j4;
            modifier2 = companion;
            j6 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m5607constructorimpl2222 = Dp.m5607constructorimpl(((Dp) consume222).m5621unboximpl() + f2);
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2222))}, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new SurfaceKt$Surface$7(modifier2, obj2, j6, m5607constructorimpl2222, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onClick, content, i11)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z4 = z3;
            shape2 = obj2;
            j7 = j6;
            j8 = j5;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        obj = shape;
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        z3 = z5;
        obj2 = rectangleShape;
        i12 = i7;
        j5 = j4;
        modifier2 = companion;
        j6 = j3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m5607constructorimpl22222 = Dp.m5607constructorimpl(((Dp) consume2222).m5621unboximpl() + f2);
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22222))}, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new SurfaceKt$Surface$7(modifier2, obj2, j6, m5607constructorimpl22222, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onClick, content, i11)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z4 = z3;
        shape2 = obj2;
        j7 = j6;
        j8 = j5;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /* renamed from: Surface-Ny5ogXk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1474SurfaceNy5ogXk(boolean z, Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j3;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        float f2;
        boolean z3;
        Object obj2;
        int i12;
        long j5;
        Modifier modifier2;
        long j6;
        Composer composer2;
        Modifier modifier3;
        boolean z4;
        Shape shape2;
        long j7;
        long j8;
        BorderStroke borderStroke3;
        float f3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1341569296);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(1,9,8,6,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color!1,5:c#ui.unit.Dp,7)445@22417L6,446@22459L22,449@22593L39,*452@22725L7,453@22749L1034:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onCheckedChange) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj = shape;
                    i4 |= startRestartGroup.changed(obj) ? 16384 : 8192;
                    if ((i & 458752) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        i7 = i4 | (((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288);
                    } else {
                        i7 = i4;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i7 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i7 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i7 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i7 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i7 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i7 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            i11 = i2 | (startRestartGroup.changedInstance(content) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        if ((i7 & 1533916891) == 306783378 || (i11 & 11) != 2 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i13 != 0 ? Modifier.Companion : modifier;
                                boolean z5 = i5 != 0 ? true : z2;
                                Shape rectangleShape = i6 != 0 ? RectangleShapeKt.getRectangleShape() : obj;
                                if ((i3 & 32) != 0) {
                                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                                    i7 &= -458753;
                                } else {
                                    j3 = j;
                                }
                                if ((i3 & 64) != 0) {
                                    j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i7 >> 15) & 14);
                                    i7 &= -3670017;
                                } else {
                                    j4 = j2;
                                }
                                BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke;
                                float m5607constructorimpl = i9 != 0 ? Dp.m5607constructorimpl(0) : f;
                                if (i10 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    borderStroke2 = borderStroke4;
                                    f2 = m5607constructorimpl;
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    borderStroke2 = borderStroke4;
                                    f2 = m5607constructorimpl;
                                }
                                z3 = z5;
                                obj2 = rectangleShape;
                                i12 = i7;
                                j5 = j4;
                                modifier2 = companion;
                                j6 = j3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i7 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    int i14 = i7 & (-3670017);
                                    modifier2 = modifier;
                                    z3 = z2;
                                    j6 = j;
                                    j5 = j2;
                                    borderStroke2 = borderStroke;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i12 = i14;
                                    obj2 = obj;
                                } else {
                                    z3 = z2;
                                    j6 = j;
                                    j5 = j2;
                                    borderStroke2 = borderStroke;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    obj2 = obj;
                                    i12 = i7;
                                    modifier2 = modifier;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1341569296, i12, i11, "androidx.compose.material.Surface (Surface.kt:439)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float m5607constructorimpl2 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + f2);
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2))}, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new SurfaceKt$Surface$10(modifier2, obj2, j6, m5607constructorimpl2, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onCheckedChange, content, i11)), composer2, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            shape2 = obj2;
                            j7 = j6;
                            j8 = j5;
                            borderStroke3 = borderStroke2;
                            f3 = f2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z4 = z2;
                            j7 = j;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            shape2 = obj;
                            composer2 = startRestartGroup;
                            j8 = j2;
                            f3 = f;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new SurfaceKt$Surface$11(z, onCheckedChange, modifier3, z4, shape2, j7, j8, borderStroke3, f3, mutableInteractionSource3, content, i, i2, i3));
                        return;
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    z3 = z5;
                    obj2 = rectangleShape;
                    i12 = i7;
                    j5 = j4;
                    modifier2 = companion;
                    j6 = j3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m5607constructorimpl22 = Dp.m5607constructorimpl(((Dp) consume2).m5621unboximpl() + f2);
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22))}, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new SurfaceKt$Surface$10(modifier2, obj2, j6, m5607constructorimpl22, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onCheckedChange, content, i11)), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    shape2 = obj2;
                    j7 = j6;
                    j8 = j5;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = shape;
                if ((i & 458752) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                z3 = z5;
                obj2 = rectangleShape;
                i12 = i7;
                j5 = j4;
                modifier2 = companion;
                j6 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float m5607constructorimpl222 = Dp.m5607constructorimpl(((Dp) consume22).m5621unboximpl() + f2);
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl222))}, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new SurfaceKt$Surface$10(modifier2, obj2, j6, m5607constructorimpl222, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onCheckedChange, content, i11)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z4 = z3;
                shape2 = obj2;
                j7 = j6;
                j8 = j5;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            obj = shape;
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            z3 = z5;
            obj2 = rectangleShape;
            i12 = i7;
            j5 = j4;
            modifier2 = companion;
            j6 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m5607constructorimpl2222 = Dp.m5607constructorimpl(((Dp) consume222).m5621unboximpl() + f2);
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2222))}, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new SurfaceKt$Surface$10(modifier2, obj2, j6, m5607constructorimpl2222, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onCheckedChange, content, i11)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z4 = z3;
            shape2 = obj2;
            j7 = j6;
            j8 = j5;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        obj = shape;
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        z3 = z5;
        obj2 = rectangleShape;
        i12 = i7;
        j5 = j4;
        modifier2 = companion;
        j6 = j3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m5607constructorimpl22222 = Dp.m5607constructorimpl(((Dp) consume2222).m5621unboximpl() + f2);
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22222))}, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new SurfaceKt$Surface$10(modifier2, obj2, j6, m5607constructorimpl22222, i12, borderStroke2, f2, z, mutableInteractionSource2, z3, onCheckedChange, content, i11)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z4 = z3;
        shape2 = obj2;
        j7 = j6;
        j8 = j5;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    /* renamed from: Surface-9VG74zQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1470Surface9VG74zQ(Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        long j5;
        Indication indication2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource4;
        Role role2;
        Indication indication3;
        int i14;
        boolean z2;
        String str2;
        float f2;
        long j6;
        long j7;
        Shape shape3;
        BorderStroke borderStroke2;
        Composer composer2;
        Modifier modifier4;
        Shape shape4;
        BorderStroke borderStroke3;
        long j8;
        long j9;
        float f3;
        MutableInteractionSource mutableInteractionSource5;
        Indication indication4;
        boolean z3;
        String str3;
        Role role3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1585925488);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,12,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,7,6,5,10,11:c#ui.semantics.Role)573@28985L6,574@29027L22,577@29161L39,578@29248L7,*584@29435L7,585@29459L1128:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(shape) ? 256 : 128;
                if ((i & 7168) == 0) {
                    i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j)) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(indication)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i15;
                    }
                    i15 = 33554432;
                    i4 |= i15;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 112) == 0) {
                    i11 |= startRestartGroup.changed(role) ? 32 : 16;
                }
                int i17 = i11;
                if ((i3 & 4096) != 0) {
                    i17 |= 384;
                } else if ((i2 & 896) == 0) {
                    i17 |= startRestartGroup.changedInstance(content) ? 256 : 128;
                }
                i13 = i17;
                if ((1533916891 & i4) == 306783378 || (i13 & 731) != 146 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i16 != 0 ? Modifier.Companion : modifier;
                        Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape;
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                            modifier2 = companion;
                            shape2 = rectangleShape;
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1313getSurface0d7_KjU();
                        } else {
                            modifier2 = companion;
                            shape2 = rectangleShape;
                            j3 = j;
                        }
                        if ((i3 & 16) != 0) {
                            j4 = ColorsKt.m1327contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 9) & 14);
                            i4 &= -57345;
                        } else {
                            j4 = j2;
                        }
                        BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                        float m5607constructorimpl = i7 != 0 ? Dp.m5607constructorimpl(0) : f;
                        if (i8 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j5 = j3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(IndicationKt.getLocalIndication());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            indication2 = (Indication) consume;
                            i4 &= -234881025;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j5 = j3;
                            indication2 = indication;
                        }
                        boolean z4 = i9 != 0 ? true : z;
                        String str4 = i10 != 0 ? null : str;
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        if (i12 != 0) {
                            indication3 = indication2;
                            i14 = i4;
                            z2 = z4;
                            str2 = str4;
                            f2 = m5607constructorimpl;
                            j6 = j4;
                            role2 = null;
                        } else {
                            role2 = role;
                            indication3 = indication2;
                            i14 = i4;
                            z2 = z4;
                            str2 = str4;
                            f2 = m5607constructorimpl;
                            j6 = j4;
                        }
                        j7 = j5;
                        shape3 = shape2;
                        borderStroke2 = borderStroke4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 256) != 0) {
                            modifier3 = modifier;
                            shape3 = shape;
                            j7 = j;
                            j6 = j2;
                            borderStroke2 = borderStroke;
                            f2 = f;
                            mutableInteractionSource4 = mutableInteractionSource;
                            indication3 = indication;
                            z2 = z;
                            str2 = str;
                            role2 = role;
                            i14 = i4 & (-234881025);
                        } else {
                            modifier3 = modifier;
                            shape3 = shape;
                            j7 = j;
                            j6 = j2;
                            borderStroke2 = borderStroke;
                            f2 = f;
                            mutableInteractionSource4 = mutableInteractionSource;
                            indication3 = indication;
                            z2 = z;
                            str2 = str;
                            role2 = role;
                            i14 = i4;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1585925488, i14, i13, "androidx.compose.material.Surface (Surface.kt:569)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m5607constructorimpl2 = Dp.m5607constructorimpl(((Dp) consume2).m5621unboximpl() + f2);
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl2))}, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new SurfaceKt$Surface$13(modifier3, shape3, j7, m5607constructorimpl2, i14, borderStroke2, f2, mutableInteractionSource4, indication3, z2, str2, role2, onClick, content, i13)), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    borderStroke3 = borderStroke2;
                    j8 = j7;
                    j9 = j6;
                    f3 = f2;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    indication4 = indication3;
                    z3 = z2;
                    str3 = str2;
                    role3 = role2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    shape4 = shape;
                    j8 = j;
                    j9 = j2;
                    borderStroke3 = borderStroke;
                    f3 = f;
                    indication4 = indication;
                    z3 = z;
                    str3 = str;
                    role3 = role;
                    composer2 = startRestartGroup;
                    mutableInteractionSource5 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new SurfaceKt$Surface$14(onClick, modifier4, shape4, j8, j9, borderStroke3, f3, mutableInteractionSource5, indication4, z3, str3, role3, content, i, i2, i3));
                return;
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            int i172 = i11;
            if ((i3 & 4096) != 0) {
            }
            i13 = i172;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            modifier3 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            if (i12 != 0) {
            }
            j7 = j5;
            shape3 = shape2;
            borderStroke2 = borderStroke4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m5607constructorimpl22 = Dp.m5607constructorimpl(((Dp) consume22).m5621unboximpl() + f2);
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl22))}, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new SurfaceKt$Surface$13(modifier3, shape3, j7, m5607constructorimpl22, i14, borderStroke2, f2, mutableInteractionSource4, indication3, z2, str2, role2, onClick, content, i13)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            shape4 = shape3;
            borderStroke3 = borderStroke2;
            j8 = j7;
            j9 = j6;
            f3 = f2;
            mutableInteractionSource5 = mutableInteractionSource4;
            indication4 = indication3;
            z3 = z2;
            str3 = str2;
            role3 = role2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        int i1722 = i11;
        if ((i3 & 4096) != 0) {
        }
        i13 = i1722;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        modifier3 = modifier2;
        mutableInteractionSource4 = mutableInteractionSource3;
        if (i12 != 0) {
        }
        j7 = j5;
        shape3 = shape2;
        borderStroke2 = borderStroke4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float m5607constructorimpl222 = Dp.m5607constructorimpl(((Dp) consume222).m5621unboximpl() + f2);
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m5605boximpl(m5607constructorimpl222))}, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new SurfaceKt$Surface$13(modifier3, shape3, j7, m5607constructorimpl222, i14, borderStroke2, f2, mutableInteractionSource4, indication3, z2, str2, role2, onClick, content, i13)), composer2, 56);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        shape4 = shape3;
        borderStroke3 = borderStroke2;
        j8 = j7;
        j9 = j6;
        f3 = f2;
        mutableInteractionSource5 = mutableInteractionSource4;
        indication4 = indication3;
        z3 = z2;
        str3 = str2;
        role3 = role2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg  reason: not valid java name */
    public static final Modifier m1477surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape) : Modifier.Companion), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M  reason: not valid java name */
    public static final long m1478surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        ComposerKt.sourceInformation(composer, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)635@31093L6,636@31164L31:Surface.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:630)");
        }
        if (Color.m3292equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo1343apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
