package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Icon.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "Icon", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m795size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m2527getIconSizeD9Ej5fM());

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1829Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        long j2;
        Modifier.Companion companion;
        long m3301unboximpl;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        Composer startRestartGroup = composer.startRestartGroup(-126890956);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(1!,3:c#ui.graphics.Color)64@3206L7,67@3246L34,66@3222L163:Icon.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = modifier;
                i3 |= startRestartGroup.changed(obj) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        j2 = j;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i4 != 0 ? Modifier.Companion : obj;
                        if ((i2 & 8) != 0) {
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            i3 &= -7169;
                            m3301unboximpl = ((Color) consume).m3301unboximpl();
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-126890956, i3, -1, "androidx.compose.material3.Icon (Icon.kt:60)");
                            }
                            m1828Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str, companion, m3301unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            j2 = m3301unboximpl;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        companion = obj;
                    }
                    m3301unboximpl = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m1828Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str, companion, m3301unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    j2 = m3301unboximpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = obj;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new IconKt$Icon$1(imageVector, str, modifier2, j2, i, i2));
                return;
            }
            obj = modifier;
            if ((i & 7168) == 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            m3301unboximpl = j2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m1828Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str, companion, m3301unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            j2 = m3301unboximpl;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = modifier;
        if ((i & 7168) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        m3301unboximpl = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1828Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str, companion, m3301unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        j2 = m3301unboximpl;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m1827Iconww6aTOc(ImageBitmap bitmap, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Composer startRestartGroup = composer.startRestartGroup(-1092052280);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(!,3:c#ui.graphics.Color)99@4907L7,101@4937L42,102@4984L136:Icon.kt#uh7d8r");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            j2 = ((Color) consume).m3301unboximpl();
            i3 = i & (-7169);
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092052280, i3, -1, "androidx.compose.material3.Icon (Icon.kt:95)");
        }
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(bitmap);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            startRestartGroup.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        startRestartGroup.endReplaceableGroup();
        m1828Iconww6aTOc((BitmapPainter) rememberedValue, str, companion, j2, startRestartGroup, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new IconKt$Icon$2(bitmap, str, companion, j2, i, i2));
    }

    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m1828Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-2142239481);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(2!,3:c#ui.graphics.Color)135@6639L7,147@6998L217:Icon.kt#uh7d8r");
        Modifier.Companion companion2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-7169);
            j2 = ((Color) consume).m3301unboximpl();
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:131)");
        }
        ColorFilter m3332tintxETnrds$default = Color.m3292equalsimpl0(j2, Color.Companion.m3327getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m3332tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, null);
        startRestartGroup.startReplaceableGroup(69356817);
        ComposerKt.sourceInformation(startRestartGroup, "140@6830L115");
        if (str != null) {
            Modifier.Companion companion3 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(str);
            IconKt$Icon$semantics$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new IconKt$Icon$semantics$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            companion = SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue, 1, null);
        } else {
            companion = Modifier.Companion;
        }
        startRestartGroup.endReplaceableGroup();
        long j3 = j2;
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(companion2), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, m3332tintxETnrds$default, 22, null).then(companion), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new IconKt$Icon$3(painter, str, companion2, j3, i, i2));
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier.Companion companion;
        if (Size.m3083equalsimpl0(painter.mo3914getIntrinsicSizeNHjbRc(), Size.Companion.m3095getUnspecifiedNHjbRc()) || m1830isInfiniteuvyYCjk(painter.mo3914getIntrinsicSizeNHjbRc())) {
            companion = DefaultIconSizeModifier;
        } else {
            companion = Modifier.Companion;
        }
        return modifier.then(companion);
    }

    /* renamed from: isInfinite-uvyYCjk  reason: not valid java name */
    private static final boolean m1830isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Size.m3087getWidthimpl(j)) && Float.isInfinite(Size.m3084getHeightimpl(j));
    }
}
