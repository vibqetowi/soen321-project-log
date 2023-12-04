package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.location.LocationRequestCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MotionLayout.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0016J4\u0010\f\u001a\u00020\n2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\n2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0004J(\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010%2\u0006\u0010\u0014\u001a\u00020\u0004J;\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b2\u00103Jc\u00104\u001a\u0002052\u0006\u0010,\u001a\u00020-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b<\u0010=Je\u0010>\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010?\u001a\u000201H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u00020\n*\u00020CH\u0007¢\u0006\u0002\u0010DJ1\u0010E\u001a\u00020\n*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\bL\u0010MJI\u0010N\u001a\u00020\n*\u00020F2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\bS\u0010TR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer;", "()V", Key.MOTIONPROGRESS, "", "transition", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "clearConstraintSets", "", "computeLayoutResult", "encodeKeyFrames", "json", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", FirebaseAnalytics.Param.LOCATION, "", "types", "", "progress", "count", "", "encodeRoot", "getCustomColor", "Landroidx/compose/ui/graphics/Color;", "id", "", "name", "getCustomColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "getCustomFloat", "getProgress", "initWith", TtmlNode.START, "Landroidx/constraintlayout/compose/ConstraintSet;", TtmlNode.END, "Landroidx/constraintlayout/compose/Transition;", "measureConstraintSet", "optimizationLevel", "constraintSet", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureConstraintSet--hBUhpc", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "needsRemeasure", "", "needsRemeasure-BRTryo0", "(J)Z", "performInterpolationMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "constraintSetStart", "constraintSetEnd", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "performInterpolationMeasure-OQbXsTc", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFLandroidx/compose/ui/layout/MeasureScope;)J", "recalculateInterpolation", "remeasure", "recalculateInterpolation-36Wf7g4", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFZ)V", "drawDebug", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "drawFrame", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", TypedValues.AttributesType.S_FRAME, "Landroidx/constraintlayout/core/state/WidgetFrame;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "color", "drawFrame-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrameDebug", "parentWidth", "parentHeight", "startFrame", "endFrame", "drawFrameDebug-PE3pjmc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionMeasurer extends Measurer {
    private float motionProgress;
    private final androidx.constraintlayout.core.state.Transition transition = new androidx.constraintlayout.core.state.Transition();

    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public final float getProgress() {
        return this.motionProgress;
    }

    /* renamed from: measureConstraintSet--hBUhpc  reason: not valid java name */
    private final void m5942measureConstraintSethBUhpc(int i, ConstraintSet constraintSet, List<? extends Measurable> list, long j) {
        String obj;
        getState().reset();
        constraintSet.applyTo(getState(), list);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        ArrayList<ConstraintWidget> arrayList = children;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.get(i2).setAnimated(true);
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        m5913applyRootSizeBRTryo0(j);
        getRoot().updateHierarchy();
        if (MotionLayoutKt.access$getDEBUG$p()) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            Intrinsics.checkNotNullExpressionValue(children2, "root.children");
            for (ConstraintWidget constraintWidget : children2) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                String str = "NOTAG";
                if (layoutId != null && (obj = layoutId.toString()) != null) {
                    str = obj;
                }
                constraintWidget.setDebugName(str);
            }
        }
        ArrayList<ConstraintWidget> children3 = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children3, "root.children");
        for (ConstraintWidget constraintWidget2 : children3) {
            Object companionWidget2 = constraintWidget2.getCompanionWidget();
            Measurable measurable2 = companionWidget2 instanceof Measurable ? (Measurable) companionWidget2 : null;
            Object layoutId2 = measurable2 == null ? null : LayoutIdKt.getLayoutId(measurable2);
            if (layoutId2 == null) {
                layoutId2 = measurable2 == null ? null : ConstraintLayoutTagKt.getConstraintLayoutId(measurable2);
            }
            constraintWidget2.stringId = layoutId2 == null ? null : layoutId2.toString();
        }
        getRoot().setOptimizationLevel(i);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r1.intValue() != Integer.MIN_VALUE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r10 != false) goto L23;
     */
    /* renamed from: performInterpolationMeasure-OQbXsTc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5946performInterpolationMeasureOQbXsTc(long j, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, Transition transition, List<? extends Measurable> measurables, int i, float f, MeasureScope measureScope) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSetStart, "constraintSetStart");
        Intrinsics.checkNotNullParameter(constraintSetEnd, "constraintSetEnd");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        setDensity(measureScope);
        setMeasureScope(measureScope);
        boolean m5943needsRemeasureBRTryo0 = m5943needsRemeasureBRTryo0(j);
        if (this.motionProgress == f) {
            LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
            Integer valueOf = layoutInformationReceiver == null ? null : Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            if (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver2 = getLayoutInformationReceiver();
                Integer valueOf2 = layoutInformationReceiver2 != null ? Integer.valueOf(layoutInformationReceiver2.getForcedHeight()) : null;
                if (valueOf2 != null) {
                }
            }
        }
        m5944recalculateInterpolation36Wf7g4(j, layoutDirection, constraintSetStart, constraintSetEnd, transition, measurables, i, f, m5943needsRemeasureBRTryo0);
        return IntSizeKt.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5 A[SYNTHETIC] */
    /* renamed from: needsRemeasure-BRTryo0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m5943needsRemeasureBRTryo0(long j) {
        WidgetFrame interpolated;
        Placeable placeable;
        boolean z;
        if (this.transition.isEmpty() || getFrameCache().isEmpty()) {
            return true;
        }
        if ((!Constraints.m5548getHasFixedHeightimpl(j) || getState().sameFixedHeight(Constraints.m5550getMaxHeightimpl(j))) && (!Constraints.m5549getHasFixedWidthimpl(j) || getState().sameFixedWidth(Constraints.m5551getMaxWidthimpl(j)))) {
            ArrayList<ConstraintWidget> children = getRoot().getChildren();
            Intrinsics.checkNotNullExpressionValue(children, "root.children");
            ArrayList<ConstraintWidget> arrayList = children;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    ConstraintWidget constraintWidget = arrayList.get(i);
                    Object companionWidget = constraintWidget.getCompanionWidget();
                    Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                    if (measurable != null && (interpolated = getTransition().getInterpolated(constraintWidget)) != null && (placeable = getPlaceables().get(measurable)) != null) {
                        int width = placeable.getWidth();
                        int height = placeable.getHeight();
                        if (width != interpolated.width() || height != interpolated.height()) {
                            z = true;
                            if (!z) {
                                return true;
                            }
                            if (i2 > size) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
        if (r9.intValue() != r7) goto L37;
     */
    /* renamed from: recalculateInterpolation-36Wf7g4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m5944recalculateInterpolation36Wf7g4(long j, LayoutDirection layoutDirection, ConstraintSet constraintSet, ConstraintSet constraintSet2, Transition transition, List<? extends Measurable> list, int i, float f, boolean z) {
        WidgetFrame interpolated;
        androidx.constraintlayout.core.state.Dimension min;
        androidx.constraintlayout.core.state.Dimension min2;
        this.motionProgress = f;
        int i2 = 0;
        if (z) {
            this.transition.clear();
            resetMeasureState$compose_release();
            getState().reset();
            State state = getState();
            if (Constraints.m5549getHasFixedWidthimpl(j)) {
                min = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m5551getMaxWidthimpl(j));
            } else {
                min = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m5553getMinWidthimpl(j));
            }
            state.width(min);
            State state2 = getState();
            if (Constraints.m5548getHasFixedHeightimpl(j)) {
                min2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m5550getMaxHeightimpl(j));
            } else {
                min2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m5552getMinHeightimpl(j));
            }
            state2.height(min2);
            getState().m5948setRootIncomingConstraintsBRTryo0(j);
            getState().setLayoutDirection(layoutDirection);
            m5942measureConstraintSethBUhpc(i, constraintSet, list, j);
            this.transition.updateFrom(getRoot(), 0);
            m5942measureConstraintSethBUhpc(i, constraintSet2, list, j);
            this.transition.updateFrom(getRoot(), 1);
            if (transition != null) {
                transition.applyTo(this.transition, 0);
            }
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f);
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        ArrayList<ConstraintWidget> arrayList = children;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = i2 + 1;
                ConstraintWidget constraintWidget = arrayList.get(i2);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable != null && (interpolated = getTransition().getInterpolated(constraintWidget)) != null) {
                    Placeable placeable = getPlaceables().get(measurable);
                    Integer valueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                    Integer valueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                    if (placeable != null) {
                        int width = interpolated.width();
                        if (valueOf != null && valueOf.intValue() == width) {
                            int height = interpolated.height();
                            if (valueOf2 != null) {
                            }
                        }
                    }
                    getPlaceables().put(measurable, measurable.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(interpolated.width(), interpolated.height())));
                    getFrameCache().put(measurable, interpolated);
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    private final void encodeKeyFrames(StringBuilder sb, float[] fArr, int[] iArr, int[] iArr2, int i) {
        if (i == 0) {
            return;
        }
        sb.append("keyTypes : [");
        int i2 = 0;
        if (i > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                sb.append(" " + iArr[i3] + ',');
                if (i4 >= i) {
                    break;
                }
                i3 = i4;
            }
        }
        sb.append("],\n");
        sb.append("keyPos : [");
        int i5 = i * 2;
        if (i5 > 0) {
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                sb.append(" " + fArr[i6] + ',');
                if (i7 >= i5) {
                    break;
                }
                i6 = i7;
            }
        }
        sb.append("],\n ");
        sb.append("keyFrames : [");
        if (i > 0) {
            while (true) {
                int i8 = i2 + 1;
                sb.append(" " + iArr2[i2] + ',');
                if (i8 >= i) {
                    break;
                }
                i2 = i8;
            }
        }
        sb.append("],\n ");
    }

    public final void encodeRoot(StringBuilder json) {
        Intrinsics.checkNotNullParameter(json, "json");
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().getWidth() + " ,");
        json.append("  bottom:  " + getRoot().getHeight() + " ,");
        json.append(" } }");
    }

    @Override // androidx.constraintlayout.compose.Measurer
    public void computeLayoutResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        Iterator<ConstraintWidget> it = getRoot().getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            WidgetFrame start = this.transition.getStart(next.stringId);
            WidgetFrame end = this.transition.getEnd(next.stringId);
            WidgetFrame interpolated = this.transition.getInterpolated(next.stringId);
            float[] path = this.transition.getPath(next.stringId);
            int keyFrames = this.transition.getKeyFrames(next.stringId, fArr, iArr, iArr2);
            sb.append(" " + ((Object) next.stringId) + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            Intrinsics.checkNotNullExpressionValue(path, "path");
            int length = path.length;
            int i = 0;
            while (i < length) {
                float f = path[i];
                i++;
                sb.append(" " + f + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver == null) {
            return;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "json.toString()");
        layoutInformationReceiver.setLayoutInformation(sb2);
    }

    public final void drawDebug(BoxScope boxScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(436942847);
        ComposerKt.sourceInformation(startRestartGroup, "C(drawDebug)");
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.Companion), new MotionMeasurer$drawDebug$1(this), startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new MotionMeasurer$drawDebug$2(this, boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawFrameDebug-PE3pjmc  reason: not valid java name */
    public final void m5941drawFrameDebugPE3pjmc(DrawScope drawScope, float f, float f2, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j) {
        m5940drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j);
        m5940drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f, (int) f2);
        if (numberKeyPositions == 0) {
            return;
        }
        float[] fArr = new float[numberKeyPositions];
        float[] fArr2 = new float[numberKeyPositions];
        float[] fArr3 = new float[numberKeyPositions];
        this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
        widgetFrame.centerX();
        widgetFrame.centerY();
        int i = numberKeyPositions - 1;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            float f3 = fArr3[i2] / 100.0f;
            float f4 = 1 - f3;
            float width = (widgetFrame.width() * f4) + (widgetFrame2.width() * f3);
            float height = (f4 * widgetFrame.height()) + (f3 * widgetFrame2.height());
            float f5 = (fArr[i2] * f) + (width / 2.0f);
            float f6 = (fArr2[i2] * f2) + (height / 2.0f);
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(f5 - 20.0f, f6);
            Path.lineTo(f5, f6 + 20.0f);
            Path.lineTo(f5 + 20.0f, f6);
            Path.lineTo(f5, f6 - 20.0f);
            Path.close();
            DrawScope.CC.m3838drawPathLG529CI$default(drawScope, Path, j, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
            if (i2 == i) {
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: drawFrame-g2O1Hgs  reason: not valid java name */
    private final void m5940drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.CC.m3842drawRectnJ9OG0$default(drawScope, j, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, LocationRequestCompat.QUALITY_LOW_POWER, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        float[] fArr = {widgetFrame.left, widgetFrame.top, widgetFrame.right, widgetFrame.top, widgetFrame.right, widgetFrame.bottom, widgetFrame.left, widgetFrame.bottom};
        matrix.mapPoints(fArr);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    /* renamed from: getCustomColor-WaAFU9c  reason: not valid java name */
    public final long m5945getCustomColorWaAFU9c(String id, String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.transition.contains(id)) {
            return Color.Companion.m3317getBlack0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), this.motionProgress);
        return ColorKt.Color(this.transition.getInterpolated(id).getCustomColor(name));
    }

    public final float getCustomFloat(String id, String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.transition.contains(id)) {
            WidgetFrame start = this.transition.getStart(id);
            WidgetFrame end = this.transition.getEnd(id);
            float customFloat = start.getCustomFloat(name);
            float customFloat2 = end.getCustomFloat(name);
            float f = this.motionProgress;
            return ((1.0f - f) * customFloat) + (f * customFloat2);
        }
        return 0.0f;
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    public final void initWith(ConstraintSet start, ConstraintSet end, Transition transition, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        clearConstraintSets();
        start.applyTo(this.transition, 0);
        end.applyTo(this.transition, 1);
        this.transition.interpolate(0, 0, f);
        if (transition == null) {
            return;
        }
        transition.applyTo(this.transition, 0);
    }
}
