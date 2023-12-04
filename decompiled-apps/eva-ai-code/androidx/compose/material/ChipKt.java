package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.FrameMetricsAggregator;
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
/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u008e\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÄ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", "Chip", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconContentColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m5607constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m5607constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m5607constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        Object obj;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        ChipColors chipColors2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        boolean z2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        ChipColors chipColors3;
        Object obj2;
        Modifier modifier2;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape4;
        BorderStroke borderStroke2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        ChipColors chipColors4;
        boolean z3;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-368396408);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)P(7,6,3,4,8!2,5)91@4193L39,92@4267L6,94@4384L12,98@4529L21,104@4726L24,99@4555L1787:Chip.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((458752 & i) == 0) {
                        obj = borderStroke;
                        i3 |= startRestartGroup.changed(obj) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(chipColors)) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 234881024) == 0) {
                                i8 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i10 == 0 ? Modifier.Companion : modifier;
                                    boolean z4 = i4 == 0 ? true : z;
                                    if (i5 == 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    if ((i2 & 16) == 0) {
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i3 &= -57345;
                                    } else {
                                        cornerBasedShape = shape2;
                                    }
                                    if (i6 != 0) {
                                        obj = null;
                                    }
                                    if ((i2 & 64) == 0) {
                                        chipColors2 = ChipDefaults.INSTANCE.m1292chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                        i3 &= -3670017;
                                    } else {
                                        chipColors2 = chipColors;
                                    }
                                    if (i7 == 0) {
                                        z2 = z4;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape3 = cornerBasedShape;
                                        chipColors3 = chipColors2;
                                        obj2 = obj;
                                        function22 = null;
                                    } else {
                                        function22 = function2;
                                        z2 = z4;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape3 = cornerBasedShape;
                                        chipColors3 = chipColors2;
                                        obj2 = obj;
                                    }
                                    modifier2 = companion;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    z2 = z;
                                    function22 = function2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    shape3 = shape2;
                                    obj2 = obj;
                                    modifier2 = modifier;
                                    chipColors3 = chipColors;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-368396408, i3, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                                }
                                int i11 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                                State<Color> contentColor = chipColors3.contentColor(z2, startRestartGroup, i11);
                                ChipColors chipColors5 = chipColors3;
                                boolean z5 = z2;
                                Modifier modifier4 = modifier2;
                                composer2 = startRestartGroup;
                                SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$2.INSTANCE, 1, null), z2, shape3, chipColors3.backgroundColor(z2, startRestartGroup, i11).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(Chip$lambda$1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), obj2, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new ChipKt$Chip$3(contentColor, function22, chipColors3, z2, i3, content)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                borderStroke2 = obj2;
                                function23 = function22;
                                chipColors4 = chipColors5;
                                z3 = z5;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z3 = z;
                                mutableInteractionSource5 = mutableInteractionSource2;
                                shape4 = shape2;
                                borderStroke2 = obj;
                                composer2 = startRestartGroup;
                                chipColors4 = chipColors;
                                function23 = function2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new ChipKt$Chip$4(onClick, modifier3, z3, mutableInteractionSource5, shape4, borderStroke2, chipColors4, function23, content, i, i2));
                            return;
                        }
                        i8 = 100663296;
                        i3 |= i8;
                        if ((191739611 & i3) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        modifier2 = companion;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i112 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                        State<Color> contentColor2 = chipColors3.contentColor(z2, startRestartGroup, i112);
                        ChipColors chipColors52 = chipColors3;
                        boolean z52 = z2;
                        Modifier modifier42 = modifier2;
                        composer2 = startRestartGroup;
                        SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$2.INSTANCE, 1, null), z2, shape3, chipColors3.backgroundColor(z2, startRestartGroup, i112).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(Chip$lambda$1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), obj2, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new ChipKt$Chip$3(contentColor2, function22, chipColors3, z2, i3, content)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        borderStroke2 = obj2;
                        function23 = function22;
                        chipColors4 = chipColors52;
                        z3 = z52;
                        modifier3 = modifier42;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    obj = borderStroke;
                    if ((i & 3670016) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    i3 |= i8;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1122 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                    State<Color> contentColor22 = chipColors3.contentColor(z2, startRestartGroup, i1122);
                    ChipColors chipColors522 = chipColors3;
                    boolean z522 = z2;
                    Modifier modifier422 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$2.INSTANCE, 1, null), z2, shape3, chipColors3.backgroundColor(z2, startRestartGroup, i1122).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(Chip$lambda$1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), obj2, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new ChipKt$Chip$3(contentColor22, function22, chipColors3, z2, i3, content)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    borderStroke2 = obj2;
                    function23 = function22;
                    chipColors4 = chipColors522;
                    z3 = z522;
                    modifier3 = modifier422;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                obj = borderStroke;
                if ((i & 3670016) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i3 |= i8;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i7 == 0) {
                }
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i11222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                State<Color> contentColor222 = chipColors3.contentColor(z2, startRestartGroup, i11222);
                ChipColors chipColors5222 = chipColors3;
                boolean z5222 = z2;
                Modifier modifier4222 = modifier2;
                composer2 = startRestartGroup;
                SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$2.INSTANCE, 1, null), z2, shape3, chipColors3.backgroundColor(z2, startRestartGroup, i11222).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(Chip$lambda$1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), obj2, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new ChipKt$Chip$3(contentColor222, function22, chipColors3, z2, i3, content)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                borderStroke2 = obj2;
                function23 = function22;
                chipColors4 = chipColors5222;
                z3 = z5222;
                modifier3 = modifier4222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            obj = borderStroke;
            if ((i & 3670016) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i7 == 0) {
            }
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i112222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
            State<Color> contentColor2222 = chipColors3.contentColor(z2, startRestartGroup, i112222);
            ChipColors chipColors52222 = chipColors3;
            boolean z52222 = z2;
            Modifier modifier42222 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$2.INSTANCE, 1, null), z2, shape3, chipColors3.backgroundColor(z2, startRestartGroup, i112222).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(Chip$lambda$1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), obj2, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new ChipKt$Chip$3(contentColor2222, function22, chipColors3, z2, i3, content)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
            if (ComposerKt.isTraceInProgress()) {
            }
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            borderStroke2 = obj2;
            function23 = function22;
            chipColors4 = chipColors52222;
            z3 = z52222;
            modifier3 = modifier42222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        obj = borderStroke;
        if ((i & 3670016) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i7 == 0) {
        }
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1122222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
        State<Color> contentColor22222 = chipColors3.contentColor(z2, startRestartGroup, i1122222);
        ChipColors chipColors522222 = chipColors3;
        boolean z522222 = z2;
        Modifier modifier422222 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m1472SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$2.INSTANCE, 1, null), z2, shape3, chipColors3.backgroundColor(z2, startRestartGroup, i1122222).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(Chip$lambda$1(contentColor22222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), obj2, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new ChipKt$Chip$3(contentColor22222, function22, chipColors3, z2, i3, content)), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
        if (ComposerKt.isTraceInProgress()) {
        }
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        borderStroke2 = obj2;
        function23 = function22;
        chipColors4 = chipColors522222;
        z3 = z522222;
        modifier3 = modifier422222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        MutableInteractionSource mutableInteractionSource2;
        CornerBasedShape cornerBasedShape;
        SelectableChipColors selectableChipColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        BorderStroke borderStroke2;
        boolean z4;
        Modifier modifier2;
        SelectableChipColors selectableChipColors3;
        int i13;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        BorderStroke borderStroke3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        SelectableChipColors selectableChipColors4;
        boolean z5;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1259208246);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)P(8,7,6,3,4,10!2,5,9,11)188@8733L39,189@8807L6,191@8934L18,198@9265L31,205@9503L34,199@9301L4037:Chip.kt#jmzs0o");
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
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(selectableChipColors)) {
                        i14 = 8388608;
                        i4 |= i14;
                    }
                    i14 = 4194304;
                    i4 |= i14;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (startRestartGroup.changedInstance(function23) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i12 = i11 | 48;
                } else if ((i2 & 112) == 0) {
                    i12 = i11 | (startRestartGroup.changedInstance(content) ? 32 : 16);
                } else {
                    i12 = i11;
                }
                if ((i4 & 1533916891) == 306783378 || (i12 & 91) != 18 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i15 != 0 ? Modifier.Companion : modifier;
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
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
                        if ((i3 & 32) != 0) {
                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i4 &= -458753;
                        } else {
                            cornerBasedShape = shape;
                        }
                        BorderStroke borderStroke4 = i7 != 0 ? null : borderStroke;
                        Modifier modifier4 = companion;
                        if ((i3 & 128) != 0) {
                            selectableChipColors2 = ChipDefaults.INSTANCE.m1293filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, C.ENCODING_PCM_32BIT, FrameMetricsAggregator.EVERY_DURATION);
                            i4 &= -29360129;
                        } else {
                            selectableChipColors2 = selectableChipColors;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function210 = i8 != 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i9 != 0 ? null : function22;
                        if (i10 != 0) {
                            function25 = function210;
                            function26 = function211;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = cornerBasedShape;
                            borderStroke2 = borderStroke4;
                            z4 = z3;
                            function24 = null;
                        } else {
                            function24 = function23;
                            function25 = function210;
                            function26 = function211;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = cornerBasedShape;
                            borderStroke2 = borderStroke4;
                            z4 = z3;
                        }
                        modifier2 = modifier4;
                        selectableChipColors3 = selectableChipColors2;
                        i13 = i4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        modifier2 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                        shape2 = shape;
                        borderStroke2 = borderStroke;
                        selectableChipColors3 = selectableChipColors;
                        function25 = function2;
                        function26 = function22;
                        function24 = function23;
                        i13 = i4;
                        z4 = z3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1259208246, i13, i12, "androidx.compose.material.FilterChip (Chip.kt:183)");
                    }
                    int i16 = i13 << 3;
                    int i17 = ((i13 >> 9) & 14) | (i16 & 112) | ((i13 >> 15) & 896);
                    State<Color> contentColor = selectableChipColors3.contentColor(z4, z, startRestartGroup, i17);
                    int i18 = i13;
                    SelectableChipColors selectableChipColors5 = selectableChipColors3;
                    boolean z6 = z4;
                    Modifier modifier5 = modifier2;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1473SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$FilterChip$2.INSTANCE, 1, null), z6, shape2, selectableChipColors3.backgroundColor(z4, z, startRestartGroup, i17).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(contentColor.getValue().m3301unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new ChipKt$FilterChip$3(contentColor, function25, z, function26, function24, content, i12, selectableChipColors5, z6, i18)), startRestartGroup, (i18 & 14) | (i18 & 112) | (i18 & 7168) | ((i18 >> 3) & 57344) | (i16 & 29360128) | ((i18 << 15) & 1879048192), 6, 256);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape3 = shape2;
                    borderStroke3 = borderStroke2;
                    function27 = function25;
                    function28 = function26;
                    function29 = function24;
                    selectableChipColors4 = selectableChipColors5;
                    z5 = z6;
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    mutableInteractionSource4 = mutableInteractionSource;
                    shape3 = shape;
                    borderStroke3 = borderStroke;
                    selectableChipColors4 = selectableChipColors;
                    function28 = function22;
                    function29 = function23;
                    composer2 = startRestartGroup;
                    z5 = z3;
                    function27 = function2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new ChipKt$FilterChip$4(z, onClick, modifier3, z5, mutableInteractionSource4, shape3, borderStroke3, selectableChipColors4, function27, function28, function29, content, i, i2, i3));
                return;
            }
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            Modifier modifier42 = companion;
            if ((i3 & 128) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            modifier2 = modifier42;
            selectableChipColors3 = selectableChipColors2;
            i13 = i4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i162 = i13 << 3;
            int i172 = ((i13 >> 9) & 14) | (i162 & 112) | ((i13 >> 15) & 896);
            State<Color> contentColor2 = selectableChipColors3.contentColor(z4, z, startRestartGroup, i172);
            int i182 = i13;
            SelectableChipColors selectableChipColors52 = selectableChipColors3;
            boolean z62 = z4;
            Modifier modifier52 = modifier2;
            composer2 = startRestartGroup;
            SurfaceKt.m1473SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$FilterChip$2.INSTANCE, 1, null), z62, shape2, selectableChipColors3.backgroundColor(z4, z, startRestartGroup, i172).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(contentColor2.getValue().m3301unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new ChipKt$FilterChip$3(contentColor2, function25, z, function26, function24, content, i12, selectableChipColors52, z62, i182)), startRestartGroup, (i182 & 14) | (i182 & 112) | (i182 & 7168) | ((i182 >> 3) & 57344) | (i162 & 29360128) | ((i182 << 15) & 1879048192), 6, 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            mutableInteractionSource4 = mutableInteractionSource3;
            shape3 = shape2;
            borderStroke3 = borderStroke2;
            function27 = function25;
            function28 = function26;
            function29 = function24;
            selectableChipColors4 = selectableChipColors52;
            z5 = z62;
            modifier3 = modifier52;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        Modifier modifier422 = companion;
        if ((i3 & 128) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        modifier2 = modifier422;
        selectableChipColors3 = selectableChipColors2;
        i13 = i4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1622 = i13 << 3;
        int i1722 = ((i13 >> 9) & 14) | (i1622 & 112) | ((i13 >> 15) & 896);
        State<Color> contentColor22 = selectableChipColors3.contentColor(z4, z, startRestartGroup, i1722);
        int i1822 = i13;
        SelectableChipColors selectableChipColors522 = selectableChipColors3;
        boolean z622 = z4;
        Modifier modifier522 = modifier2;
        composer2 = startRestartGroup;
        SurfaceKt.m1473SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$FilterChip$2.INSTANCE, 1, null), z622, shape2, selectableChipColors3.backgroundColor(z4, z, startRestartGroup, i1722).getValue().m3301unboximpl(), Color.m3290copywmQWz5c$default(contentColor22.getValue().m3301unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new ChipKt$FilterChip$3(contentColor22, function25, z, function26, function24, content, i12, selectableChipColors522, z622, i1822)), startRestartGroup, (i1822 & 14) | (i1822 & 112) | (i1822 & 7168) | ((i1822 >> 3) & 57344) | (i1622 & 29360128) | ((i1822 << 15) & 1879048192), 6, 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        mutableInteractionSource4 = mutableInteractionSource3;
        shape3 = shape2;
        borderStroke3 = borderStroke2;
        function27 = function25;
        function28 = function26;
        function29 = function24;
        selectableChipColors4 = selectableChipColors522;
        z5 = z622;
        modifier3 = modifier522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$1(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = Dp.m5607constructorimpl(f);
        TrailingIconSpacing = Dp.m5607constructorimpl(f);
    }
}
