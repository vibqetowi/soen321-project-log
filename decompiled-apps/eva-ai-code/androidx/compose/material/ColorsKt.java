package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u008b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m1330lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: darkColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m1329darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long Color = (i & 1) != 0 ? ColorKt.Color(4290479868L) : j;
        long Color2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long Color3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        return m1328darkColors2qZNXz8(Color, Color2, Color3, (i & 8) != 0 ? Color3 : j4, (i & 16) != 0 ? ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? Color.Companion.m3317getBlack0d7_KjU() : j8, (i & 256) != 0 ? Color.Companion.m3317getBlack0d7_KjU() : j9, (i & 512) != 0 ? Color.Companion.m3328getWhite0d7_KjU() : j10, (i & 1024) != 0 ? Color.Companion.m3328getWhite0d7_KjU() : j11, (i & 2048) != 0 ? Color.Companion.m3317getBlack0d7_KjU() : j12);
    }

    /* renamed from: darkColors-2qZNXz8  reason: not valid java name */
    public static final Colors m1328darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static final long getPrimarySurface(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m1309getPrimary0d7_KjU() : colors.m1313getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m1326contentColorFor4WTKRHQ(Colors contentColorFor, long j) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (!Color.m3292equalsimpl0(j, contentColorFor.m1309getPrimary0d7_KjU()) && !Color.m3292equalsimpl0(j, contentColorFor.m1310getPrimaryVariant0d7_KjU())) {
            if (!Color.m3292equalsimpl0(j, contentColorFor.m1311getSecondary0d7_KjU()) && !Color.m3292equalsimpl0(j, contentColorFor.m1312getSecondaryVariant0d7_KjU())) {
                return Color.m3292equalsimpl0(j, contentColorFor.m1302getBackground0d7_KjU()) ? contentColorFor.m1304getOnBackground0d7_KjU() : Color.m3292equalsimpl0(j, contentColorFor.m1313getSurface0d7_KjU()) ? contentColorFor.m1308getOnSurface0d7_KjU() : Color.m3292equalsimpl0(j, contentColorFor.m1303getError0d7_KjU()) ? contentColorFor.m1305getOnError0d7_KjU() : Color.Companion.m3327getUnspecified0d7_KjU();
            }
            return contentColorFor.m1307getOnSecondary0d7_KjU();
        }
        return contentColorFor.m1306getOnPrimary0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m1327contentColorForek8zF_U(long j, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 441849991, "C(contentColorFor)P(0:c#ui.graphics.Color)*296@11462L6,296@11533L7:Colors.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long m1326contentColorFor4WTKRHQ = m1326contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (!(m1326contentColorFor4WTKRHQ != Color.Companion.m3327getUnspecified0d7_KjU())) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            m1326contentColorFor4WTKRHQ = ((Color) consume).m3301unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m1326contentColorFor4WTKRHQ;
    }

    public static final void updateColorsFrom(Colors colors, Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m1321setPrimary8_81llA$material_release(other.m1309getPrimary0d7_KjU());
        colors.m1322setPrimaryVariant8_81llA$material_release(other.m1310getPrimaryVariant0d7_KjU());
        colors.m1323setSecondary8_81llA$material_release(other.m1311getSecondary0d7_KjU());
        colors.m1324setSecondaryVariant8_81llA$material_release(other.m1312getSecondaryVariant0d7_KjU());
        colors.m1314setBackground8_81llA$material_release(other.m1302getBackground0d7_KjU());
        colors.m1325setSurface8_81llA$material_release(other.m1313getSurface0d7_KjU());
        colors.m1315setError8_81llA$material_release(other.m1303getError0d7_KjU());
        colors.m1318setOnPrimary8_81llA$material_release(other.m1306getOnPrimary0d7_KjU());
        colors.m1319setOnSecondary8_81llA$material_release(other.m1307getOnSecondary0d7_KjU());
        colors.m1316setOnBackground8_81llA$material_release(other.m1304getOnBackground0d7_KjU());
        colors.m1320setOnSurface8_81llA$material_release(other.m1308getOnSurface0d7_KjU());
        colors.m1317setOnError8_81llA$material_release(other.m1305getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }
}
