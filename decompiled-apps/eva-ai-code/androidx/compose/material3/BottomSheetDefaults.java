package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0014\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\nR\u0011\u0010\u0016\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "()V", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "ExpandedShape", "Landroidx/compose/ui/graphics/Shape;", "getExpandedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getHiddenShape", "ScrimColor", "getScrimColor", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "DragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "shape", "color", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float Elevation = SheetBottomTokens.INSTANCE.m2702getDockedModalContainerElevationD9Ej5fM();
    private static final float SheetPeekHeight = Dp.m5607constructorimpl(56);

    private BottomSheetDefaults() {
    }

    public final Shape getHiddenShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1971658024);
        ComposerKt.sourceInformation(composer, "C289@10707L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:288)");
        }
        Shape shape = ShapesKt.toShape(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getExpandedShape(Composer composer, int i) {
        composer.startReplaceableGroup(1683783414);
        ComposerKt.sourceInformation(composer, "C294@10917L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:293)");
        }
        Shape shape = ShapesKt.toShape(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(433375448);
        ComposerKt.sourceInformation(composer, "C299@11092L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:298)");
        }
        long color = ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m1586getElevationD9Ej5fM() {
        return Elevation;
    }

    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2040719176);
        ComposerKt.sourceInformation(composer, "C307@11388L9:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
        }
        long m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3290copywmQWz5c$default;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM  reason: not valid java name */
    public final float m1587getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(-511309409);
        ComposerKt.sourceInformation(composer, "C319@11725L29:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:319)");
        }
        WindowInsets m821onlybOOhFvg = WindowInsetsKt.m821onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8), WindowInsetsSides.Companion.m846getVerticalJoeWqyM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m821onlybOOhFvg;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5  */
    /* renamed from: DragHandle-lgZ2HuY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1585DragHandlelgZ2HuY(Modifier modifier, float f, float f2, Shape shape, long j, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        float f3;
        int i4;
        float f4;
        CornerBasedShape cornerBasedShape;
        long j2;
        Modifier.Companion companion;
        boolean changed;
        BottomSheetDefaults$DragHandle$1$1 rememberedValue;
        Shape shape2;
        float f5;
        float f6;
        long j3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1364277227);
        ComposerKt.sourceInformation(startRestartGroup, "C(DragHandle)P(2,4:c#ui.unit.Dp,1:c#ui.unit.Dp,3,0:c#ui.graphics.Color)329@12138L6,330@12220L9,333@12336L51,337@12527L46,334@12396L437:SheetDefaults.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        cornerBasedShape = shape;
                        if (startRestartGroup.changed(cornerBasedShape)) {
                            i6 = 2048;
                            i3 |= i6;
                        }
                    } else {
                        cornerBasedShape = shape;
                    }
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    cornerBasedShape = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i5 = 16384;
                            i3 |= i5;
                        }
                    } else {
                        j2 = j;
                    }
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i7 != 0 ? Modifier.Companion : obj;
                        if (i8 != 0) {
                            f3 = SheetBottomTokens.INSTANCE.m2701getDockedDragHandleWidthD9Ej5fM();
                        }
                        if (i4 != 0) {
                            f4 = SheetBottomTokens.INSTANCE.m2700getDockedDragHandleHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getExtraLarge();
                        }
                        if ((i2 & 16) != 0) {
                            j2 = Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), startRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -57345;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = obj;
                    }
                    int i9 = i3;
                    float f7 = f4;
                    Shape shape3 = cornerBasedShape;
                    long j4 = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1364277227, i9, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
                    }
                    String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1996getBottomSheetDragHandleDescriptionadMyvUU(), startRestartGroup, 6);
                    Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.access$getDragHandleVerticalPadding$p(), 1, null);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m2058getStringNWtq28);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new BottomSheetDefaults$DragHandle$1$1(m2058getStringNWtq28);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i10 = i9 >> 6;
                    SurfaceKt.m2067SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(m750paddingVpY3zN4$default, false, (Function1) rememberedValue, 1, null), shape3, j4, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1039573072, true, new BottomSheetDefaults$DragHandle$2(f3, f7)), startRestartGroup, (i10 & 112) | 12582912 | (i10 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = shape3;
                    f5 = f7;
                    f6 = f3;
                    j3 = j4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                    f6 = f3;
                    f5 = f4;
                    shape2 = cornerBasedShape;
                    j3 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new BottomSheetDefaults$DragHandle$3(this, companion, f6, f5, shape2, j3, i, i2));
                return;
            }
            f4 = f2;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            int i92 = i3;
            float f72 = f4;
            Shape shape32 = cornerBasedShape;
            long j42 = j2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1996getBottomSheetDragHandleDescriptionadMyvUU(), startRestartGroup, 6);
            Modifier m750paddingVpY3zN4$default2 = PaddingKt.m750paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.access$getDragHandleVerticalPadding$p(), 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m2058getStringNWtq282);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new BottomSheetDefaults$DragHandle$1$1(m2058getStringNWtq282);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            int i102 = i92 >> 6;
            SurfaceKt.m2067SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(m750paddingVpY3zN4$default2, false, (Function1) rememberedValue, 1, null), shape32, j42, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1039573072, true, new BottomSheetDefaults$DragHandle$2(f3, f72)), startRestartGroup, (i102 & 112) | 12582912 | (i102 & 896), 120);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape2 = shape32;
            f5 = f72;
            f6 = f3;
            j3 = j42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        int i922 = i3;
        float f722 = f4;
        Shape shape322 = cornerBasedShape;
        long j422 = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        String m2058getStringNWtq2822 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m1996getBottomSheetDragHandleDescriptionadMyvUU(), startRestartGroup, 6);
        Modifier m750paddingVpY3zN4$default22 = PaddingKt.m750paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.access$getDragHandleVerticalPadding$p(), 1, null);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m2058getStringNWtq2822);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new BottomSheetDefaults$DragHandle$1$1(m2058getStringNWtq2822);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i1022 = i922 >> 6;
        SurfaceKt.m2067SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(m750paddingVpY3zN4$default22, false, (Function1) rememberedValue, 1, null), shape322, j422, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1039573072, true, new BottomSheetDefaults$DragHandle$2(f3, f722)), startRestartGroup, (i1022 & 112) | 12582912 | (i1022 & 896), 120);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape2 = shape322;
        f5 = f722;
        f6 = f3;
        j3 = j422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
