package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.rootScope = rootScope;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.IntIterator] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult mo272measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
        Placeable placeable;
        Placeable placeable2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = measurables.size();
        int i = 0;
        while (true) {
            placeable = null;
            boolean z = true;
            if (i >= size2) {
                break;
            }
            Measurable measurable = measurables.get(i);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if ((childData == null || !childData.isTarget()) ? false : false) {
                placeableArr[i] = measurable.mo4545measureBRTryo0(j);
            }
            i++;
        }
        int size3 = measurables.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Measurable measurable2 = measurables.get(i2);
            if (placeableArr[i2] == null) {
                placeableArr[i2] = measurable2.mo4545measureBRTryo0(j);
            }
        }
        if ((size == 0 ? 1 : null) != null) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int lastIndex = ArraysKt.getLastIndex(placeableArr);
            if (lastIndex != 0) {
                int width = placeable2 != null ? placeable2.getWidth() : 0;
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    Placeable placeable3 = placeableArr[it.nextInt()];
                    int width2 = placeable3 != null ? placeable3.getWidth() : 0;
                    if (width < width2) {
                        placeable2 = placeable3;
                        width = width2;
                    }
                }
            }
        }
        int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if ((size == 0 ? 1 : null) == null) {
            placeable = placeableArr[0];
            int lastIndex2 = ArraysKt.getLastIndex(placeableArr);
            if (lastIndex2 != 0) {
                int height = placeable != null ? placeable.getHeight() : 0;
                ?? it2 = new IntRange(1, lastIndex2).iterator();
                while (it2.hasNext()) {
                    Placeable placeable4 = placeableArr[it2.nextInt()];
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (height < height2) {
                        placeable = placeable4;
                        height = height2;
                    }
                }
            }
        }
        int height3 = placeable != null ? placeable.getHeight() : 0;
        this.rootScope.m297setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        return MeasureScope.CC.layout$default(measure, width3, height3, null, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, width3, height3), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt.map(CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt.map(CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt.map(CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull((Sequence<? extends Comparable>) SequencesKt.map(CollectionsKt.asSequence(measurables), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
