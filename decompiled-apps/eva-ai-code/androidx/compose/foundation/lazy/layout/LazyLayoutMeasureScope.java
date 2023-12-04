package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LazyLayoutMeasureScope.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001b\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u001c\u0010\u001b\u001a\u00020\r*\u00020\u0006H\u0017ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", FirebaseAnalytics.Param.INDEX, "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw  reason: not valid java name */
    List<Placeable> mo906measure0kLqBqw(int i, long j);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    float mo583toDpGaN1DYA(long j);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    float mo584toDpu2uoSUM(float f);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    float mo585toDpu2uoSUM(int i);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    long mo586toDpSizekrfVVM(long j);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    long mo589toSizeXkaWNTQ(long j);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    long mo590toSp0xMU5do(float f);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    long mo591toSpkPz2Gy4(float f);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    long mo592toSpkPz2Gy4(int i);

    /* compiled from: LazyLayoutMeasureScope.kt */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        /* renamed from: $default$toDp-GaN1DYA  reason: not valid java name */
        public static float m907$default$toDpGaN1DYA(LazyLayoutMeasureScope _this, long j) {
            if (!TextUnitType.m5816equalsimpl0(TextUnit.m5787getTypeUIouoOA(j), TextUnitType.Companion.m5821getSpUIouoOA())) {
                throw new IllegalStateException("Only Sp can convert to Px".toString());
            }
            return Dp.m5607constructorimpl(TextUnit.m5788getValueimpl(j) * _this.getFontScale());
        }

        /* renamed from: $default$toSize-XkaWNTQ  reason: not valid java name */
        public static long m911$default$toSizeXkaWNTQ(LazyLayoutMeasureScope _this, long j) {
            if (j != DpSize.Companion.m5714getUnspecifiedMYxV2XQ()) {
                return SizeKt.Size(_this.mo588toPx0680j_4(DpSize.m5705getWidthD9Ej5fM(j)), _this.mo588toPx0680j_4(DpSize.m5703getHeightD9Ej5fM(j)));
            }
            return Size.Companion.m3095getUnspecifiedNHjbRc();
        }

        /* renamed from: $default$toDpSize-k-rfVVM  reason: not valid java name */
        public static long m910$default$toDpSizekrfVVM(LazyLayoutMeasureScope _this, long j) {
            if (j != Size.Companion.m3095getUnspecifiedNHjbRc()) {
                return DpKt.m5629DpSizeYgX7TsA(_this.mo584toDpu2uoSUM(Size.m3087getWidthimpl(j)), _this.mo584toDpu2uoSUM(Size.m3084getHeightimpl(j)));
            }
            return DpSize.Companion.m5714getUnspecifiedMYxV2XQ();
        }
    }
}
