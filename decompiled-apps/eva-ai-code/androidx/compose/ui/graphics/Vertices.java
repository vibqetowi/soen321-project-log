package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Vertices.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u001a\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0002ø\u0001\u0000J\u0019\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000R\u0011\u0010\b\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "vertexMode", "Landroidx/compose/ui/graphics/VertexMode;", "positions", "", "Landroidx/compose/ui/geometry/Offset;", "textureCoordinates", "colors", "Landroidx/compose/ui/graphics/Color;", "indices", "", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getColors", "()[I", "", "getIndices", "()[S", "", "getPositions", "()[F", "getTextureCoordinates", "getVertexMode-c2xauaI", "()I", "I", "encodeColorList", "encodePointList", "points", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }

    private Vertices(int i, List<Offset> positions, List<Offset> textureCoordinates, List<Color> colors, List<Integer> indices) {
        boolean z;
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(textureCoordinates, "textureCoordinates");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(indices, "indices");
        this.vertexMode = i;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(positions);
        if (textureCoordinates.size() != positions.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (colors.size() != positions.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = indices.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            } else if (vertices$outOfBounds$1.invoke((Vertices$outOfBounds$1) indices.get(i2)).booleanValue()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        }
        this.positions = encodePointList(positions);
        this.textureCoordinates = encodePointList(textureCoordinates);
        this.colors = encodeColorList(colors);
        int size2 = indices.size();
        short[] sArr = new short[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            sArr[i3] = (short) indices.get(i3).intValue();
        }
        this.indices = sArr;
    }

    /* renamed from: getVertexMode-c2xauaI  reason: not valid java name */
    public final int m3693getVertexModec2xauaI() {
        return this.vertexMode;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m3345toArgb8_81llA(list.get(i).m3301unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        float m3019getYimpl;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long m3028unboximpl = list.get(i / 2).m3028unboximpl();
            if (i % 2 == 0) {
                m3019getYimpl = Offset.m3018getXimpl(m3028unboximpl);
            } else {
                m3019getYimpl = Offset.m3019getYimpl(m3028unboximpl);
            }
            fArr[i] = m3019getYimpl;
        }
        return fArr;
    }
}
