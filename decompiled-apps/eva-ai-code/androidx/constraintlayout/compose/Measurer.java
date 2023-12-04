package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010*J\u001d\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020HH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ\b\u0010K\u001a\u00020DH\u0016J\r\u0010L\u001a\u00020DH\u0007¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020DH\u0016J)\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010R\u001a\u00020PH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ \u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020 2\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020\u0005H\u0016J\u001c\u0010Y\u001a\u00020Z2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\\H\u0002J\u0018\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020_2\u0006\u0010]\u001a\u00020`H\u0016JH\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020 2\u0006\u0010f\u001a\u00020 2\u0006\u0010g\u001a\u00020 2\u0006\u0010h\u001a\u00020b2\u0006\u0010i\u001a\u00020b2\u0006\u0010j\u001a\u00020 2\u0006\u0010k\u001a\u00020\u001dH\u0002J\u000e\u0010l\u001a\u00020D2\u0006\u0010m\u001a\u00020nJI\u0010o\u001a\u00020p2\u0006\u0010G\u001a\u00020H2\u0006\u0010q\u001a\u00020r2\u0006\u0010m\u001a\u00020n2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00180t2\u0006\u0010u\u001a\u00020 2\u0006\u0010/\u001a\u000200ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020DH\u0000¢\u0006\u0002\byJ\u001f\u0010z\u001a\u00020D*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010]\u001a\u00020`H\u0002¢\u0006\u0002\u0010{J\u0019\u0010|\u001a\u00020D*\u00020}2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010~J\u0019\u0010\u007f\u001a\u00020D*\u00030\u0080\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00180tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002060\u0017X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001bR\u0014\u00108\u001a\u000209X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001b\u0010<\u001a\u00020=8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u000e\u0010B\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0081\u0001"}, d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "()V", "computedLayoutResult", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "designElements", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "forcedScaleFactor", "", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "frameCache", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/constraintlayout/core/state/WidgetFrame;", "getFrameCache", "()Ljava/util/Map;", "heightConstraintsHolder", "", "lastMeasures", "", "", "layoutCurrentHeight", "getLayoutCurrentHeight", "()I", "setLayoutCurrentHeight", "(I)V", "layoutCurrentWidth", "getLayoutCurrentWidth", "setLayoutCurrentWidth", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "setMeasureScope", "(Landroidx/compose/ui/layout/MeasureScope;)V", "placeables", "Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "state", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "state$delegate", "Lkotlin/Lazy;", "widthConstraintsHolder", "addLayoutInformationReceiver", "", "layoutReceiver", "applyRootSize", "constraints", "Landroidx/compose/ui/unit/Constraints;", "applyRootSize-BRTryo0", "(J)V", "computeLayoutResult", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "didMeasures", "getColor", "Landroidx/compose/ui/graphics/Color;", "str", "defaultColor", "getColor-wrIjXm8", "(Ljava/lang/String;J)J", "getDesignInfo", "startX", "startY", "args", "getTextStyle", "Landroidx/compose/ui/text/TextStyle;", NativeProtocol.WEB_DIALOG_PARAMS, "Ljava/util/HashMap;", "measure", "constraintWidget", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "obtainConstraints", "", "dimensionBehaviour", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "outConstraints", "parseDesignElements", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "performMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "measurables", "", "optimizationLevel", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J", "resetMeasureState", "resetMeasureState$compose_release", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "drawDebugBounds", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "performLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {
    private String computedLayoutResult = "";
    protected Density density;
    private ArrayList<DesignElement> designElements;
    private float forcedScaleFactor;
    private final Map<Measurable, WidgetFrame> frameCache;
    private final int[] heightConstraintsHolder;
    private final Map<Measurable, Integer[]> lastMeasures;
    private int layoutCurrentHeight;
    private int layoutCurrentWidth;
    private LayoutInformationReceiver layoutInformationReceiver;
    protected MeasureScope measureScope;
    private final Map<Measurable, Placeable> placeables;
    private final ConstraintWidgetContainer root;
    private final Lazy state$delegate;
    private final int[] widthConstraintsHolder;

    /* compiled from: ConstraintLayout.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    public Measurer() {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        Unit unit = Unit.INSTANCE;
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Measurer$state$2(this));
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    protected final void setLayoutInformationReceiver(LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Density getDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        Intrinsics.throwUninitializedPropertyAccessException("density");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setDensity(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    protected final MeasureScope getMeasureScope() {
        MeasureScope measureScope = this.measureScope;
        if (measureScope != null) {
            return measureScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("measureScope");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setMeasureScope(MeasureScope measureScope) {
        Intrinsics.checkNotNullParameter(measureScope, "<set-?>");
        this.measureScope = measureScope;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final State getState() {
        return (State) this.state$delegate.getValue();
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    public final void setForcedScaleFactor(float f) {
        this.forcedScaleFactor = f;
    }

    public final int getLayoutCurrentWidth() {
        return this.layoutCurrentWidth;
    }

    public final void setLayoutCurrentWidth(int i) {
        this.layoutCurrentWidth = i;
    }

    public final int getLayoutCurrentHeight() {
        return this.layoutCurrentHeight;
    }

    public final void setLayoutCurrentHeight(int i) {
        this.layoutCurrentHeight = i;
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    public String getDesignInfo(int i, int i2, String args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return ToolingUtilsKt.parseConstraintsToJson(this.root, getState(), i, i2, args);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void measure(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
        boolean z;
        Integer num;
        Integer num2;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        String debugString;
        String debugString2;
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        Intrinsics.checkNotNullParameter(measure, "measure");
        ?? companionWidget = constraintWidget.getCompanionWidget();
        if (companionWidget instanceof Measurable) {
            z = ConstraintLayoutKt.DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder("Measuring ");
                sb.append(LayoutIdKt.getLayoutId((Measurable) companionWidget));
                sb.append(" with: ");
                debugString = ConstraintLayoutKt.toDebugString(constraintWidget);
                sb.append(debugString);
                sb.append('\n');
                debugString2 = ConstraintLayoutKt.toDebugString(measure);
                sb.append(debugString2);
                Log.d("CCL", sb.toString());
            }
            Integer[] numArr = this.lastMeasures.get(companionWidget);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour, "measure.horizontalBehavior");
            boolean z6 = false;
            obtainConstraints(dimensionBehaviour, measure.horizontalDimension, constraintWidget.mMatchConstraintDefaultWidth, measure.measureStrategy, ((numArr != null && (num = numArr[1]) != null) ? num.intValue() : 0) == constraintWidget.getHeight(), constraintWidget.isResolvedHorizontally(), Constraints.m5551getMaxWidthimpl(getState().m5947getRootIncomingConstraintsmsEJaDk()), this.widthConstraintsHolder);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.verticalBehavior;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.verticalBehavior");
            obtainConstraints(dimensionBehaviour2, measure.verticalDimension, constraintWidget.mMatchConstraintDefaultHeight, measure.measureStrategy, ((numArr != null && (num2 = numArr[0]) != null) ? num2.intValue() : 0) == constraintWidget.getWidth(), constraintWidget.isResolvedVertically(), Constraints.m5550getMaxHeightimpl(getState().m5947getRootIncomingConstraintsmsEJaDk()), this.heightConstraintsHolder);
            int[] iArr = this.widthConstraintsHolder;
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = this.heightConstraintsHolder;
            long Constraints = ConstraintsKt.Constraints(i, i2, iArr2[0], iArr2[1]);
            if (measure.measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measure.measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || measure.horizontalBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultWidth != 0 || measure.verticalBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultHeight != 0) {
                z2 = ConstraintLayoutKt.DEBUG;
                if (z2) {
                    str = "CCL";
                    Log.d(str, "Measuring " + LayoutIdKt.getLayoutId((Measurable) companionWidget) + " with " + ((Object) Constraints.m5556toStringimpl(Constraints)));
                } else {
                    str = "CCL";
                }
                Measurable measurable = (Measurable) companionWidget;
                Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints);
                getPlaceables().put(companionWidget, mo4545measureBRTryo0);
                constraintWidget.setMeasureRequested(false);
                z3 = ConstraintLayoutKt.DEBUG;
                if (z3) {
                    Log.d(str, LayoutIdKt.getLayoutId(measurable) + " is size " + mo4545measureBRTryo0.getWidth() + ' ' + mo4545measureBRTryo0.getHeight());
                }
                Integer valueOf = Integer.valueOf(mo4545measureBRTryo0.getWidth());
                Integer valueOf2 = Integer.valueOf(constraintWidget.mMatchConstraintMinWidth);
                if (!(valueOf2.intValue() > 0)) {
                    valueOf2 = null;
                }
                Integer num3 = valueOf2;
                Integer valueOf3 = Integer.valueOf(constraintWidget.mMatchConstraintMaxWidth);
                if (!(valueOf3.intValue() > 0)) {
                    valueOf3 = null;
                }
                int intValue = ((Number) RangesKt.coerceIn(valueOf, num3, valueOf3)).intValue();
                Integer valueOf4 = Integer.valueOf(mo4545measureBRTryo0.getHeight());
                Integer valueOf5 = Integer.valueOf(constraintWidget.mMatchConstraintMinHeight);
                if (!(valueOf5.intValue() > 0)) {
                    valueOf5 = null;
                }
                Integer num4 = valueOf5;
                Integer valueOf6 = Integer.valueOf(constraintWidget.mMatchConstraintMaxHeight);
                if (!(valueOf6.intValue() > 0)) {
                    valueOf6 = null;
                }
                int intValue2 = ((Number) RangesKt.coerceIn(valueOf4, num4, valueOf6)).intValue();
                if (intValue != mo4545measureBRTryo0.getWidth()) {
                    Constraints = ConstraintsKt.Constraints(intValue, intValue, Constraints.m5552getMinHeightimpl(Constraints), Constraints.m5550getMaxHeightimpl(Constraints));
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (intValue2 != mo4545measureBRTryo0.getHeight()) {
                    Constraints = ConstraintsKt.Constraints(Constraints.m5553getMinWidthimpl(Constraints), Constraints.m5551getMaxWidthimpl(Constraints), intValue2, intValue2);
                    z4 = true;
                }
                if (z4) {
                    z5 = ConstraintLayoutKt.DEBUG;
                    if (z5) {
                        Log.d(str, "Remeasuring coerced " + LayoutIdKt.getLayoutId(measurable) + " with " + ((Object) Constraints.m5556toStringimpl(Constraints)));
                    }
                    getPlaceables().put(companionWidget, measurable.mo4545measureBRTryo0(Constraints));
                    constraintWidget.setMeasureRequested(false);
                }
            }
            Placeable placeable = this.placeables.get(companionWidget);
            Integer valueOf7 = placeable == null ? null : Integer.valueOf(placeable.getWidth());
            measure.measuredWidth = valueOf7 == null ? constraintWidget.getWidth() : valueOf7.intValue();
            Integer valueOf8 = placeable != null ? Integer.valueOf(placeable.getHeight()) : null;
            measure.measuredHeight = valueOf8 == null ? constraintWidget.getHeight() : valueOf8.intValue();
            int i3 = (placeable == null || !getState().isBaselineNeeded$compose_release(constraintWidget)) ? Integer.MIN_VALUE : placeable.get(AlignmentLineKt.getFirstBaseline());
            measure.measuredHasBaseline = i3 != Integer.MIN_VALUE;
            measure.measuredBaseline = i3;
            Map<Measurable, Integer[]> map = this.lastMeasures;
            Object obj = map.get(companionWidget);
            Object obj2 = obj;
            if (obj == null) {
                Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
                map.put(companionWidget, numArr2);
                obj2 = numArr2;
            }
            copyFrom((Integer[]) obj2, measure);
            if (measure.measuredWidth != measure.horizontalDimension || measure.measuredHeight != measure.verticalDimension) {
                z6 = true;
            }
            measure.measuredNeedsSolverPass = z6;
        }
    }

    public final void addLayoutInformationReceiver(LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
        if (layoutInformationReceiver == null) {
            return;
        }
        layoutInformationReceiver.setLayoutInformation(this.computedLayoutResult);
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{   root: {interpolated: { left:  0,  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (!(companionWidget instanceof Measurable)) {
                if (next instanceof Guideline) {
                    sb.append(" " + ((Object) next.stringId) + ": {");
                    Guideline guideline = (Guideline) next;
                    if (guideline.getOrientation() == 0) {
                        sb.append(" type: 'hGuideline', ");
                    } else {
                        sb.append(" type: 'vGuideline', ");
                    }
                    sb.append(" interpolated: ");
                    sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                    sb.append("}, ");
                }
            } else {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId == null ? null : layoutId.toString();
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(" " + ((Object) next.stringId) + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            }
        }
        sb.append(" }");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "json.toString()");
        this.computedLayoutResult = sb2;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver == null) {
            return;
        }
        layoutInformationReceiver.setLayoutInformation(sb2);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        boolean z3;
        boolean z4;
        int i5 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
        } else if (i5 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
            return true;
        } else if (i5 == 3) {
            z3 = ConstraintLayoutKt.DEBUG;
            if (z3) {
                Log.d("CCL", Intrinsics.stringPlus("Measure strategy ", Integer.valueOf(i3)));
                Log.d("CCL", Intrinsics.stringPlus("DW ", Integer.valueOf(i2)));
                Log.d("CCL", Intrinsics.stringPlus("ODR ", Boolean.valueOf(z)));
                Log.d("CCL", Intrinsics.stringPlus("IRH ", Boolean.valueOf(z2)));
            }
            boolean z5 = z2 || ((i3 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i3 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i3 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || i2 != 1 || z));
            z4 = ConstraintLayoutKt.DEBUG;
            if (z4) {
                Log.d("CCL", Intrinsics.stringPlus("UD ", Boolean.valueOf(z5)));
            }
            iArr[0] = z5 ? i : 0;
            if (!z5) {
                i = i4;
            }
            iArr[1] = i;
            if (!z5) {
                return true;
            }
        } else if (i5 == 4) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
        return false;
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* renamed from: performMeasure-DjhGOtQ  reason: not valid java name */
    public final long m5914performMeasureDjhGOtQ(long j, LayoutDirection layoutDirection, ConstraintSet constraintSet, List<? extends Measurable> measurables, int i, MeasureScope measureScope) {
        androidx.constraintlayout.core.state.Dimension min;
        androidx.constraintlayout.core.state.Dimension min2;
        boolean z;
        boolean z2;
        boolean z3;
        String debugString;
        String debugString2;
        String obj;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        setDensity(measureScope);
        setMeasureScope(measureScope);
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
        resetMeasureState$compose_release();
        if (constraintSet.isDirty(measurables)) {
            getState().reset();
            constraintSet.applyTo(getState(), measurables);
            ConstraintLayoutKt.buildMapping(getState(), measurables);
            getState().apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(getState(), measurables);
        }
        m5913applyRootSizeBRTryo0(j);
        this.root.updateHierarchy();
        z = ConstraintLayoutKt.DEBUG;
        if (z) {
            this.root.setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            Intrinsics.checkNotNullExpressionValue(children, "root.children");
            for (ConstraintWidget constraintWidget : children) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                String str = "NOTAG";
                if (layoutId != null && (obj = layoutId.toString()) != null) {
                    str = obj;
                }
                constraintWidget.setDebugName(str);
            }
            Log.d("CCL", Intrinsics.stringPlus("ConstraintLayout is asked to measure with ", Constraints.m5556toStringimpl(j)));
            debugString = ConstraintLayoutKt.toDebugString(this.root);
            Log.d("CCL", debugString);
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget child = it.next();
                Intrinsics.checkNotNullExpressionValue(child, "child");
                debugString2 = ConstraintLayoutKt.toDebugString(child);
                Log.d("CCL", debugString2);
            }
        }
        this.root.setOptimizationLevel(i);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<ConstraintWidget> it2 = this.root.getChildren().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            ?? companionWidget2 = next.getCompanionWidget();
            if (companionWidget2 instanceof Measurable) {
                Placeable placeable = this.placeables.get(companionWidget2);
                Integer valueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                Integer valueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                int width = next.getWidth();
                if (valueOf != null && width == valueOf.intValue()) {
                    int height = next.getHeight();
                    if (valueOf2 != null && height == valueOf2.intValue()) {
                    }
                }
                z3 = ConstraintLayoutKt.DEBUG;
                if (z3) {
                    Log.d("CCL", "Final measurement for " + LayoutIdKt.getLayoutId((Measurable) companionWidget2) + " to confirm size " + next.getWidth() + ' ' + next.getHeight());
                }
                getPlaceables().put(companionWidget2, ((Measurable) companionWidget2).mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(next.getWidth(), next.getHeight())));
            }
        }
        z2 = ConstraintLayoutKt.DEBUG;
        if (z2) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.root.getWidth() + ' ' + this.root.getHeight());
        }
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: applyRootSize-BRTryo0  reason: not valid java name */
    public final void m5913applyRootSizeBRTryo0(long j) {
        this.root.setWidth(Constraints.m5551getMaxWidthimpl(j));
        this.root.setHeight(Constraints.m5550getMaxHeightimpl(j));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            Integer valueOf = layoutInformationReceiver == null ? null : Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            if (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver2);
                int forcedWidth = layoutInformationReceiver2.getForcedWidth();
                if (forcedWidth > this.root.getWidth()) {
                    this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
                } else {
                    this.forcedScaleFactor = 1.0f;
                }
                this.root.setWidth(forcedWidth);
            }
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            Integer valueOf2 = layoutInformationReceiver3 != null ? Integer.valueOf(layoutInformationReceiver3.getForcedHeight()) : null;
            if (valueOf2 == null || valueOf2.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
        this.layoutCurrentWidth = this.root.getWidth();
        this.layoutCurrentHeight = this.root.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(Placeable.PlacementScope placementScope, List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(placementScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.frameCache.isEmpty()) {
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Object companionWidget = next.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(next.frame.update()));
                }
            }
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Measurable measurable = measurables.get(i);
                WidgetFrame widgetFrame = getFrameCache().get(measurable);
                if (widgetFrame == null) {
                    return;
                }
                if (widgetFrame.isDefaultTransform()) {
                    WidgetFrame widgetFrame2 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame2);
                    int i3 = widgetFrame2.left;
                    WidgetFrame widgetFrame3 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame3);
                    int i4 = widgetFrame3.top;
                    Placeable placeable = getPlaceables().get(measurable);
                    if (placeable != null) {
                        Placeable.PlacementScope.m4604place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(i3, i4), 0.0f, 2, null);
                    }
                } else {
                    Measurer$performLayout$1$layerBlock$1 measurer$performLayout$1$layerBlock$1 = new Measurer$performLayout$1$layerBlock$1(widgetFrame);
                    WidgetFrame widgetFrame4 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame4);
                    int i5 = widgetFrame4.left;
                    WidgetFrame widgetFrame5 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame5);
                    int i6 = widgetFrame5.top;
                    float f = Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ;
                    Placeable placeable2 = getPlaceables().get(measurable);
                    if (placeable2 != null) {
                        placementScope.placeWithLayer(placeable2, i5, i6, f, measurer$performLayout$1$layerBlock$1);
                    }
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver == null ? null : layoutInformationReceiver.getLayoutInformationMode()) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    public final void drawDebugBounds(BoxScope boxScope, float f, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-756996390);
        ComposerKt.sourceInformation(startRestartGroup, "C(drawDebugBounds)");
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.Companion), new Measurer$drawDebugBounds$1(this, f), startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Measurer$drawDebugBounds$2(this, boxScope, f, i));
    }

    /* renamed from: getColor-wrIjXm8$default  reason: not valid java name */
    static /* synthetic */ long m5912getColorwrIjXm8$default(Measurer measurer, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Color.Companion.m3317getBlack0d7_KjU();
            }
            return measurer.m5911getColorwrIjXm8(str, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
    }

    /* renamed from: getColor-wrIjXm8  reason: not valid java name */
    private final long m5911getColorwrIjXm8(String str, long j) {
        if (str != null && StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = Intrinsics.stringPlus("FF", substring);
            }
            try {
                return ColorKt.Color((int) Long.parseLong(substring, 16));
            } catch (Exception unused) {
            }
        }
        return j;
    }

    private final TextStyle getTextStyle(HashMap<String, String> hashMap) {
        String str = hashMap.get("size");
        long m5799getUnspecifiedXSAIIZE = TextUnit.Companion.m5799getUnspecifiedXSAIIZE();
        if (str != null) {
            m5799getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m5912getColorwrIjXm8$default(this, hashMap.get("color"), 0L, 2, null), m5799getUnspecifiedXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262140, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void createDesignElements(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-186576797);
        ComposerKt.sourceInformation(startRestartGroup, "C(createDesignElements)");
        Iterator<DesignElement> it = this.designElements.iterator();
        while (it.hasNext()) {
            DesignElement next = it.next();
            String id = next.getId();
            Function4<String, HashMap<String, String>, Composer, Integer, Unit> function4 = DesignElements.INSTANCE.getMap().get(next.getType());
            if (function4 != null) {
                startRestartGroup.startReplaceableGroup(-186576600);
                function4.invoke(id, next.getParams(), startRestartGroup, 64);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-186576534);
                String type = next.getType();
                switch (type.hashCode()) {
                    case -1377687758:
                        if (type.equals("button")) {
                            startRestartGroup.startReplaceableGroup(-186576462);
                            String str = next.getParams().get("text");
                            if (str == null) {
                                str = "text";
                            }
                            BasicTextKt.m1015BasicTextBpD7jsM(str, PaddingKt.m748padding3ABfNKs(BackgroundKt.m421backgroundbw27NRU$default(ClipKt.clip(ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), RoundedCornerShapeKt.RoundedCornerShape(20)), m5911getColorwrIjXm8(next.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.Companion.m3323getLightGray0d7_KjU()), null, 2, null), Dp.m5607constructorimpl(8)), getTextStyle(next.getParams()), null, 0, false, 0, startRestartGroup, 32768, 120);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        startRestartGroup.startReplaceableGroup(-186574342);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case -1031434259:
                        if (type.equals("textfield")) {
                            startRestartGroup.startReplaceableGroup(-186575007);
                            String str2 = next.getParams().get("text");
                            if (str2 == null) {
                                str2 = "text";
                            }
                            BasicTextFieldKt.BasicTextField(str2, (Function1) Measurer$createDesignElements$2.INSTANCE, ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, (VisualTransformation) null, (Function1) null, (MutableInteractionSource) null, (Brush) null, (Function3) null, startRestartGroup, 0, 0, 32760);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        startRestartGroup.startReplaceableGroup(-186574342);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 97739:
                        if (type.equals("box")) {
                            startRestartGroup.startReplaceableGroup(-186575900);
                            String str3 = next.getParams().get("text");
                            if (str3 == null) {
                                str3 = "";
                            }
                            Modifier m421backgroundbw27NRU$default = BackgroundKt.m421backgroundbw27NRU$default(ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), m5911getColorwrIjXm8(next.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.Companion.m3323getLightGray0d7_KjU()), null, 2, null);
                            startRestartGroup.startReplaceableGroup(-1990474327);
                            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(1376089335);
                            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)71@2788L7,72@2843L7,73@2855L389:Layout.kt#80mrfh");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m421backgroundbw27NRU$default);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            startRestartGroup.disableReusing();
                            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-1253629305);
                            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BasicTextKt.m1015BasicTextBpD7jsM(str3, PaddingKt.m748padding3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(8)), getTextStyle(next.getParams()), null, 0, false, 0, startRestartGroup, 32816, 120);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        startRestartGroup.startReplaceableGroup(-186574342);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 3556653:
                        if (type.equals("text")) {
                            startRestartGroup.startReplaceableGroup(-186575281);
                            String str4 = next.getParams().get("text");
                            if (str4 == null) {
                                str4 = "text";
                            }
                            BasicTextKt.m1015BasicTextBpD7jsM(str4, ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), getTextStyle(next.getParams()), null, 0, false, 0, startRestartGroup, 32768, 120);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        startRestartGroup.startReplaceableGroup(-186574342);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    case 100313435:
                        if (type.equals("image")) {
                            startRestartGroup.startReplaceableGroup(-186574667);
                            ImageKt.Image(PainterResources_androidKt.painterResource(17301567, startRestartGroup, 0), "Placeholder Image", ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, id, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
                            startRestartGroup.endReplaceableGroup();
                            break;
                        }
                        startRestartGroup.startReplaceableGroup(-186574342);
                        startRestartGroup.endReplaceableGroup();
                        break;
                    default:
                        startRestartGroup.startReplaceableGroup(-186574342);
                        startRestartGroup.endReplaceableGroup();
                        break;
                }
                startRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Measurer$createDesignElements$3(this, i));
    }

    public final void parseDesignElements(ConstraintSet constraintSet) {
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }
}
