package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public WidgetFrame frame;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    private boolean horizontalSolvingPass;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;
    protected int mX;
    protected int mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public WidgetRun[] run;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;
    private boolean verticalSolvingPass;

    /* loaded from: classes3.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = false;
        } else if (i6 == 1) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = true;
        } else if (i6 == 2) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = true;
        } else {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.mY = i;
    }

    public void resetSolvingPassFlag() {
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.horizontalSolvingPass;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.verticalSolvingPass;
    }

    public void markHorizontalSolvingPassDone() {
        this.horizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.verticalSolvingPass = true;
    }

    public void setFinalHorizontal(int i, int i2) {
        if (this.resolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        if (this.resolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.setFinalValue(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setFinalBaseline(int i) {
        if (this.hasBaseline) {
            int i2 = i - this.mBaselineDistance;
            int i3 = this.mHeight + i2;
            this.mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3);
            this.mBaseline.setFinalValue(i);
            this.resolvedVertical = true;
        }
    }

    public boolean isResolvedHorizontally() {
        return this.resolvedHorizontal || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.resolvedVertical || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasResolvedTargets(int i, int i2) {
        return i == 0 ? this.mLeft.mTarget != null && this.mLeft.mTarget.hasFinalValue() && this.mRight.mTarget != null && this.mRight.mTarget.hasFinalValue() && (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i2 : this.mTop.mTarget != null && this.mTop.mTarget.hasFinalValue() && this.mBottom.mTarget != null && this.mBottom.mTarget.hasFinalValue() && (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i2;
        return false;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtualLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public boolean isInBarrier(int i) {
        return this.mIsInBarrier[i];
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.mWrapBehaviorInParent = i;
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        setMeasureRequested(false);
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    private void serializeAnchor(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(constraintAnchor.mGoneMargin);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void serializeCircle(StringBuilder sb, ConstraintAnchor constraintAnchor, float f) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(f);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void serializeAttribute(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private void serializeAttribute(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void serializeDimensionRatio(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    private void serializeSize(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "size", i, Integer.MIN_VALUE);
        serializeAttribute(sb, "min", i2, 0);
        serializeAttribute(sb, "max", i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "matchMin", i5, 0);
        serializeAttribute(sb, "matchDef", i6, 0);
        serializeAttribute(sb, "matchPercent", i6, 1);
        sb.append("},\n");
    }

    public StringBuilder serialize(StringBuilder sb) {
        sb.append("{\n");
        serializeAnchor(sb, "left", this.mLeft);
        serializeAnchor(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, this.mTop);
        serializeAnchor(sb, TtmlNode.RIGHT, this.mRight);
        serializeAnchor(sb, "bottom", this.mBottom);
        serializeAnchor(sb, "baseline", this.mBaseline);
        serializeAnchor(sb, "centerX", this.mCenterX);
        serializeAnchor(sb, "centerY", this.mCenterY);
        serializeCircle(sb, this.mCenter, this.mCircleConstraintAngle);
        serializeSize(sb, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        serializeSize(sb, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c = i == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        return dimensionBehaviourArr[i] == DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviourArr[c] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean oppositeDimensionsTied() {
        return this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        createObjectVariable5.setName(str + ".baseline");
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(")");
        return sb.toString();
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int i;
        int i2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultWidth == 1) {
                i = Math.max(this.mMatchConstraintMinWidth, i2);
            } else {
                i = this.mMatchConstraintMinWidth;
                if (i > 0) {
                    this.mWidth = i;
                } else {
                    i = 0;
                }
            }
            int i3 = this.mMatchConstraintMaxWidth;
            return (i3 <= 0 || i3 >= i) ? i : i3;
        }
        return i2;
    }

    public int getOptimizerWrapHeight() {
        int i;
        int i2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                i = Math.max(this.mMatchConstraintMinHeight, i2);
            } else {
                i = this.mMatchConstraintMinHeight;
                if (i > 0) {
                    this.mHeight = i;
                } else {
                    i = 0;
                }
            }
            int i3 = this.mMatchConstraintMaxHeight;
            return (i3 <= 0 || i3 >= i) ? i : i3;
        }
        return i2;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? 0 + constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? 0 + this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
        } else if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else if (i2 == 4) {
            this.mBottom.mGoneMargin = i;
        } else if (i2 != 5) {
        } else {
            this.mBaseline.mGoneMargin = i;
        }
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please submit an issue!!! */
    public void setDimensionRatio(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (!substring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            String substring2 = str.substring(i2, indexOf2);
            String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = Float.parseFloat(substring2);
                float parseFloat2 = Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i3 == 1) {
                        f = Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = i;
        } else {
            String substring4 = str.substring(i2);
            if (substring4.length() > 0) {
                f = Float.parseFloat(substring4);
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = f;
            this.mDimensionRatioSide = i3;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
        if (this.mMatchConstraintMaxWidth > 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, this.mMatchConstraintMaxWidth);
        }
        if (this.mMatchConstraintMaxHeight > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, this.mMatchConstraintMaxHeight);
        }
        int i11 = this.mWidth;
        if (i7 != i11) {
            this.mWidthOverride = i11;
        }
        int i12 = this.mHeight;
        if (i8 != i12) {
            this.mHeightOverride = i12;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    connect(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER), 0);
                } else if (z) {
                    getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_X), 0);
                } else if (z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0);
                }
            } else if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                connect(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
            } else if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                connect(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
            }
        } else if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT), 0);
            getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.TOP), 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
        } else {
            ConstraintAnchor anchor9 = getAnchor(type);
            ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
            if (anchor9.isValidConnection(anchor10)) {
                if (type == ConstraintAnchor.Type.BASELINE) {
                    ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                    if (anchor11 != null) {
                        anchor11.reset();
                    }
                    if (anchor12 != null) {
                        anchor12.reset();
                    }
                } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                    ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.BASELINE);
                    if (anchor13 != null) {
                        anchor13.reset();
                    }
                    ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.CENTER);
                    if (anchor14.getTarget() != anchor10) {
                        anchor14.reset();
                    }
                    ConstraintAnchor opposite = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor15 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                    if (anchor15.isConnected()) {
                        opposite.reset();
                        anchor15.reset();
                    }
                } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor anchor16 = getAnchor(ConstraintAnchor.Type.CENTER);
                    if (anchor16.getTarget() != anchor10) {
                        anchor16.reset();
                    }
                    ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor17 = getAnchor(ConstraintAnchor.Type.CENTER_X);
                    if (anchor17.isConnected()) {
                        opposite2.reset();
                        anchor17.reset();
                    }
                }
                anchor9.connect(anchor10, i);
            }
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget != null) {
                ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
                ConstraintAnchor constraintAnchor2 = this.mLeft;
                if (constraintAnchor == constraintAnchor2) {
                    return constraintAnchor2.mTarget.mOwner;
                }
                return null;
            }
            return null;
        } else if (i != 1 || this.mTop.mTarget == null) {
            return null;
        } else {
            ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
            ConstraintAnchor constraintAnchor4 = this.mTop;
            if (constraintAnchor3 == constraintAnchor4) {
                return constraintAnchor4.mTarget.mOwner;
            }
            return null;
        }
    }

    public ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget != null) {
                ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
                ConstraintAnchor constraintAnchor2 = this.mRight;
                if (constraintAnchor == constraintAnchor2) {
                    return constraintAnchor2.mTarget.mOwner;
                }
                return null;
            }
            return null;
        } else if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        } else {
            ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
            ConstraintAnchor constraintAnchor4 = this.mBottom;
            if (constraintAnchor3 == constraintAnchor4) {
                return constraintAnchor4.mTarget.mOwner;
            }
            return null;
        }
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (isInHorizontalChain()) {
            ConstraintWidget constraintWidget = this;
            ConstraintWidget constraintWidget2 = null;
            while (constraintWidget2 == null && constraintWidget != null) {
                ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
                ConstraintWidget owner = target == null ? null : target.getOwner();
                if (owner == getParent()) {
                    return constraintWidget;
                }
                ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
                if (target2 == null || target2.getOwner() == constraintWidget) {
                    constraintWidget = owner;
                } else {
                    constraintWidget2 = constraintWidget;
                }
            }
            return constraintWidget2;
        }
        return null;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (isInVerticalChain()) {
            ConstraintWidget constraintWidget = this;
            ConstraintWidget constraintWidget2 = null;
            while (constraintWidget2 == null && constraintWidget != null) {
                ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
                ConstraintWidget owner = target == null ? null : target.getOwner();
                if (owner == getParent()) {
                    return constraintWidget;
                }
                ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
                if (target2 == null || target2.getOwner() == constraintWidget) {
                    constraintWidget = owner;
                } else {
                    constraintWidget2 = constraintWidget;
                }
            }
            return constraintWidget2;
        }
        return null;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget != null) {
            ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
            ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z7;
        int i11;
        boolean z8;
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int i13;
        int i14;
        int i15;
        ConstraintWidget constraintWidget3;
        LinearSystem linearSystem2;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i16;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        ConstraintWidget constraintWidget4;
        boolean z15;
        HorizontalWidgetRun horizontalWidgetRun;
        int i17;
        boolean isInHorizontalChain;
        boolean isInVerticalChain;
        HorizontalWidgetRun horizontalWidgetRun2;
        boolean[] zArr;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget5 = this.mParent;
        if (constraintWidget5 != null) {
            boolean z16 = constraintWidget5 != null && constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            ConstraintWidget constraintWidget6 = this.mParent;
            boolean z17 = constraintWidget6 != null && constraintWidget6.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            int i18 = this.mWrapBehaviorInParent;
            if (i18 == 1) {
                z2 = z16;
                z3 = false;
            } else if (i18 == 2) {
                z3 = z17;
                z2 = false;
            } else if (i18 != 3) {
                z2 = z16;
                z3 = z17;
            }
            if (this.mVisibility == 8 && !this.mAnimated && !hasDependencies()) {
                zArr = this.mIsInBarrier;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
            z4 = this.resolvedHorizontal;
            if (!z4 || this.resolvedVertical) {
                if (z4) {
                    linearSystem.addEquality(createObjectVariable, this.mX);
                    linearSystem.addEquality(createObjectVariable2, this.mX + this.mWidth);
                    if (z2 && (constraintWidget2 = this.mParent) != null) {
                        if (this.OPTIMIZE_WRAP_ON_RESOLVED) {
                            ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                            constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                            constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mRight), createObjectVariable2, 0, 5);
                        }
                    }
                }
                if (this.resolvedVertical) {
                    linearSystem.addEquality(createObjectVariable3, this.mY);
                    linearSystem.addEquality(createObjectVariable4, this.mY + this.mHeight);
                    if (this.mBaseline.hasDependents()) {
                        linearSystem.addEquality(createObjectVariable5, this.mY + this.mBaselineDistance);
                    }
                    if (z3 && (constraintWidget = this.mParent) != null) {
                        if (this.OPTIMIZE_WRAP_ON_RESOLVED) {
                            ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                            constraintWidgetContainer2.addVerticalWrapMinVariable(this.mTop);
                            constraintWidgetContainer2.addVerticalWrapMaxVariable(this.mBottom);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mBottom), createObjectVariable4, 0, 5);
                        }
                    }
                }
                if (this.resolvedHorizontal && this.resolvedVertical) {
                    this.resolvedHorizontal = false;
                    this.resolvedVertical = false;
                    return;
                }
            }
            if (LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.widgets++;
            }
            if (!z && (horizontalWidgetRun2 = this.horizontalRun) != null && this.verticalRun != null && horizontalWidgetRun2.start.resolved && this.horizontalRun.end.resolved && this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
                if (LinearSystem.sMetrics != null) {
                    LinearSystem.sMetrics.graphSolved++;
                }
                linearSystem.addEquality(createObjectVariable, this.horizontalRun.start.value);
                linearSystem.addEquality(createObjectVariable2, this.horizontalRun.end.value);
                linearSystem.addEquality(createObjectVariable3, this.verticalRun.start.value);
                linearSystem.addEquality(createObjectVariable4, this.verticalRun.end.value);
                linearSystem.addEquality(createObjectVariable5, this.verticalRun.baseline.value);
                if (this.mParent != null) {
                    if (z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                    }
                    if (z3 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 8);
                    }
                }
                this.resolvedHorizontal = false;
                this.resolvedVertical = false;
                return;
            }
            if (LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.linearSolved++;
            }
            if (this.mParent == null) {
                if (isChainHead(0)) {
                    ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                    isInHorizontalChain = true;
                } else {
                    isInHorizontalChain = isInHorizontalChain();
                }
                if (isChainHead(1)) {
                    ((ConstraintWidgetContainer) this.mParent).addChain(this, 1);
                    isInVerticalChain = true;
                } else {
                    isInVerticalChain = isInVerticalChain();
                }
                if (!isInHorizontalChain && z2 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 1);
                }
                if (!isInVerticalChain && z3 && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 1);
                }
                z6 = isInHorizontalChain;
                z5 = isInVerticalChain;
            } else {
                z5 = false;
                z6 = false;
            }
            i = this.mWidth;
            i2 = this.mMinWidth;
            if (i < i2) {
                i = i2;
            }
            i3 = this.mHeight;
            i4 = this.mMinHeight;
            if (i3 < i4) {
                i3 = i4;
            }
            boolean z18 = this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z19 = this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
            this.mResolvedDimensionRatioSide = this.mDimensionRatioSide;
            f = this.mDimensionRatio;
            this.mResolvedDimensionRatio = f;
            i5 = this.mMatchConstraintDefaultWidth;
            i6 = this.mMatchConstraintDefaultHeight;
            int i19 = i;
            if (f <= 0.0f && this.mVisibility != 8) {
                if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i5 == 0) {
                    i5 = 3;
                }
                if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i6 == 0) {
                    i6 = 3;
                }
                if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i5 == 3 && i6 == 3) {
                    setupDimensionRatio(z2, z3, z18, z19);
                } else if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i5 == 3) {
                    this.mResolvedDimensionRatioSide = 0;
                    i10 = (int) (this.mResolvedDimensionRatio * this.mHeight);
                    i7 = i3;
                    i8 = i6;
                    if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                        i9 = 4;
                        z7 = false;
                        int[] iArr = this.mResolvedMatchConstraintDefault;
                        iArr[0] = i9;
                        iArr[1] = i8;
                        this.mResolvedHasRatio = z7;
                        if (z7) {
                            int i20 = this.mResolvedDimensionRatioSide;
                            i11 = -1;
                            if (i20 == 0 || i20 == -1) {
                                z8 = true;
                                boolean z20 = !z7 && ((i17 = this.mResolvedDimensionRatioSide) == 1 || i17 == i11);
                                z9 = this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer);
                                i12 = !z9 ? 0 : i10;
                                z10 = !this.mCenter.isConnected();
                                boolean[] zArr2 = this.mIsInBarrier;
                                z11 = zArr2[0];
                                boolean z21 = zArr2[1];
                                if (this.mHorizontalResolution != 2 && !this.resolvedHorizontal) {
                                    if (z || (horizontalWidgetRun = this.horizontalRun) == null || !horizontalWidgetRun.start.resolved || !this.horizontalRun.end.resolved) {
                                        ConstraintWidget constraintWidget7 = this.mParent;
                                        SolverVariable createObjectVariable6 = constraintWidget7 == null ? linearSystem.createObjectVariable(constraintWidget7.mRight) : null;
                                        ConstraintWidget constraintWidget8 = this.mParent;
                                        SolverVariable createObjectVariable7 = constraintWidget8 == null ? linearSystem.createObjectVariable(constraintWidget8.mLeft) : null;
                                        boolean z22 = this.isTerminalWidget[0];
                                        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
                                        z12 = z2;
                                        z13 = z3;
                                        z14 = z7;
                                        solverVariable = createObjectVariable5;
                                        solverVariable2 = createObjectVariable4;
                                        solverVariable3 = createObjectVariable3;
                                        solverVariable4 = createObjectVariable2;
                                        solverVariable5 = createObjectVariable;
                                        applyConstraints(linearSystem, true, z2, z3, z22, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr[0], z9, this.mLeft, this.mRight, this.mX, i12, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z8, dimensionBehaviourArr[1] != DimensionBehaviour.MATCH_CONSTRAINT, z6, z5, z11, i9, i8, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z10);
                                        if (z) {
                                            i13 = 8;
                                            i14 = 0;
                                            i15 = 1;
                                            constraintWidget3 = this;
                                            linearSystem2 = linearSystem;
                                            solverVariable6 = solverVariable;
                                            solverVariable7 = solverVariable2;
                                            solverVariable8 = solverVariable3;
                                        } else {
                                            constraintWidget3 = this;
                                            VerticalWidgetRun verticalWidgetRun = constraintWidget3.verticalRun;
                                            if (verticalWidgetRun != null && verticalWidgetRun.start.resolved && constraintWidget3.verticalRun.end.resolved) {
                                                linearSystem2 = linearSystem;
                                                solverVariable8 = solverVariable3;
                                                linearSystem2.addEquality(solverVariable8, constraintWidget3.verticalRun.start.value);
                                                solverVariable7 = solverVariable2;
                                                linearSystem2.addEquality(solverVariable7, constraintWidget3.verticalRun.end.value);
                                                solverVariable6 = solverVariable;
                                                linearSystem2.addEquality(solverVariable6, constraintWidget3.verticalRun.baseline.value);
                                                ConstraintWidget constraintWidget9 = constraintWidget3.mParent;
                                                if (constraintWidget9 == null || z5 || !z13) {
                                                    i13 = 8;
                                                    i14 = 0;
                                                    i15 = 1;
                                                } else {
                                                    i15 = 1;
                                                    if (constraintWidget3.isTerminalWidget[1]) {
                                                        i13 = 8;
                                                        i14 = 0;
                                                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget9.mBottom), solverVariable7, 0, 8);
                                                    } else {
                                                        i13 = 8;
                                                        i14 = 0;
                                                    }
                                                }
                                                i16 = i14;
                                                if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0 || constraintWidget3.resolvedVertical) {
                                                    solverVariable9 = solverVariable7;
                                                    solverVariable10 = solverVariable8;
                                                } else {
                                                    boolean z23 = (constraintWidget3.mListDimensionBehaviors[i15] == DimensionBehaviour.WRAP_CONTENT && (constraintWidget3 instanceof ConstraintWidgetContainer)) ? i15 : i14;
                                                    if (z23) {
                                                        i7 = i14;
                                                    }
                                                    ConstraintWidget constraintWidget10 = constraintWidget3.mParent;
                                                    SolverVariable createObjectVariable8 = constraintWidget10 != null ? linearSystem2.createObjectVariable(constraintWidget10.mBottom) : null;
                                                    ConstraintWidget constraintWidget11 = constraintWidget3.mParent;
                                                    SolverVariable createObjectVariable9 = constraintWidget11 != null ? linearSystem2.createObjectVariable(constraintWidget11.mTop) : null;
                                                    if (constraintWidget3.mBaselineDistance > 0 || constraintWidget3.mVisibility == i13) {
                                                        if (constraintWidget3.mBaseline.mTarget != null) {
                                                            linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i13);
                                                            linearSystem2.addEquality(solverVariable6, linearSystem2.createObjectVariable(constraintWidget3.mBaseline.mTarget), constraintWidget3.mBaseline.getMargin(), i13);
                                                            if (z13) {
                                                                linearSystem2.addGreaterThan(createObjectVariable8, linearSystem2.createObjectVariable(constraintWidget3.mBottom), i14, 5);
                                                            }
                                                            z15 = i14;
                                                            boolean z24 = constraintWidget3.isTerminalWidget[i15];
                                                            DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget3.mListDimensionBehaviors;
                                                            solverVariable9 = solverVariable7;
                                                            solverVariable10 = solverVariable8;
                                                            applyConstraints(linearSystem, false, z13, z12, z24, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr2[i15], z23, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i7, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i15], constraintWidget3.mVerticalBiasPercent, z20, dimensionBehaviourArr2[0] != DimensionBehaviour.MATCH_CONSTRAINT, z5, z6, z21, i8, i9, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z15);
                                                        } else if (constraintWidget3.mVisibility == i13) {
                                                            linearSystem2.addEquality(solverVariable6, solverVariable8, constraintWidget3.mBaseline.getMargin(), i13);
                                                        } else {
                                                            linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i13);
                                                        }
                                                    }
                                                    z15 = z10;
                                                    boolean z242 = constraintWidget3.isTerminalWidget[i15];
                                                    DimensionBehaviour[] dimensionBehaviourArr22 = constraintWidget3.mListDimensionBehaviors;
                                                    solverVariable9 = solverVariable7;
                                                    solverVariable10 = solverVariable8;
                                                    applyConstraints(linearSystem, false, z13, z12, z242, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr22[i15], z23, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i7, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i15], constraintWidget3.mVerticalBiasPercent, z20, dimensionBehaviourArr22[0] != DimensionBehaviour.MATCH_CONSTRAINT, z5, z6, z21, i8, i9, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z15);
                                                }
                                                if (z14) {
                                                    constraintWidget4 = this;
                                                    if (constraintWidget4.mResolvedDimensionRatioSide == 1) {
                                                        linearSystem.addRatio(solverVariable9, solverVariable10, solverVariable4, solverVariable5, constraintWidget4.mResolvedDimensionRatio, 8);
                                                    } else {
                                                        linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable9, solverVariable10, constraintWidget4.mResolvedDimensionRatio, 8);
                                                    }
                                                } else {
                                                    constraintWidget4 = this;
                                                }
                                                if (constraintWidget4.mCenter.isConnected()) {
                                                    linearSystem.addCenterPoint(constraintWidget4, constraintWidget4.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget4.mCircleConstraintAngle + 90.0f), constraintWidget4.mCenter.getMargin());
                                                }
                                                constraintWidget4.resolvedHorizontal = false;
                                                constraintWidget4.resolvedVertical = false;
                                            }
                                            linearSystem2 = linearSystem;
                                            solverVariable6 = solverVariable;
                                            solverVariable7 = solverVariable2;
                                            solverVariable8 = solverVariable3;
                                            i13 = 8;
                                            i14 = 0;
                                            i15 = 1;
                                        }
                                        i16 = i15;
                                        if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
                                        }
                                        solverVariable9 = solverVariable7;
                                        solverVariable10 = solverVariable8;
                                        if (z14) {
                                        }
                                        if (constraintWidget4.mCenter.isConnected()) {
                                        }
                                        constraintWidget4.resolvedHorizontal = false;
                                        constraintWidget4.resolvedVertical = false;
                                    } else if (z) {
                                        linearSystem.addEquality(createObjectVariable, this.horizontalRun.start.value);
                                        linearSystem.addEquality(createObjectVariable2, this.horizontalRun.end.value);
                                        if (this.mParent != null && z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                                        }
                                    }
                                }
                                z12 = z2;
                                z13 = z3;
                                z14 = z7;
                                solverVariable = createObjectVariable5;
                                solverVariable2 = createObjectVariable4;
                                solverVariable3 = createObjectVariable3;
                                solverVariable4 = createObjectVariable2;
                                solverVariable5 = createObjectVariable;
                                if (z) {
                                }
                                i16 = i15;
                                if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
                                }
                                solverVariable9 = solverVariable7;
                                solverVariable10 = solverVariable8;
                                if (z14) {
                                }
                                if (constraintWidget4.mCenter.isConnected()) {
                                }
                                constraintWidget4.resolvedHorizontal = false;
                                constraintWidget4.resolvedVertical = false;
                            }
                        } else {
                            i11 = -1;
                        }
                        z8 = false;
                        if (z7) {
                        }
                        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (!z9) {
                        }
                        z10 = !this.mCenter.isConnected();
                        boolean[] zArr22 = this.mIsInBarrier;
                        z11 = zArr22[0];
                        boolean z212 = zArr22[1];
                        if (this.mHorizontalResolution != 2) {
                            if (z) {
                            }
                            ConstraintWidget constraintWidget72 = this.mParent;
                            if (constraintWidget72 == null) {
                            }
                            ConstraintWidget constraintWidget82 = this.mParent;
                            if (constraintWidget82 == null) {
                            }
                            boolean z222 = this.isTerminalWidget[0];
                            DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                            z12 = z2;
                            z13 = z3;
                            z14 = z7;
                            solverVariable = createObjectVariable5;
                            solverVariable2 = createObjectVariable4;
                            solverVariable3 = createObjectVariable3;
                            solverVariable4 = createObjectVariable2;
                            solverVariable5 = createObjectVariable;
                            applyConstraints(linearSystem, true, z2, z3, z222, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr3[0], z9, this.mLeft, this.mRight, this.mX, i12, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z8, dimensionBehaviourArr3[1] != DimensionBehaviour.MATCH_CONSTRAINT, z6, z5, z11, i9, i8, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z10);
                            if (z) {
                            }
                            i16 = i15;
                            if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
                            }
                            solverVariable9 = solverVariable7;
                            solverVariable10 = solverVariable8;
                            if (z14) {
                            }
                            if (constraintWidget4.mCenter.isConnected()) {
                            }
                            constraintWidget4.resolvedHorizontal = false;
                            constraintWidget4.resolvedVertical = false;
                        }
                        z12 = z2;
                        z13 = z3;
                        z14 = z7;
                        solverVariable = createObjectVariable5;
                        solverVariable2 = createObjectVariable4;
                        solverVariable3 = createObjectVariable3;
                        solverVariable4 = createObjectVariable2;
                        solverVariable5 = createObjectVariable;
                        if (z) {
                        }
                        i16 = i15;
                        if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z14) {
                        }
                        if (constraintWidget4.mCenter.isConnected()) {
                        }
                        constraintWidget4.resolvedHorizontal = false;
                        constraintWidget4.resolvedVertical = false;
                    }
                    i9 = i5;
                    z7 = true;
                    int[] iArr2 = this.mResolvedMatchConstraintDefault;
                    iArr2[0] = i9;
                    iArr2[1] = i8;
                    this.mResolvedHasRatio = z7;
                    if (z7) {
                    }
                    z8 = false;
                    if (z7) {
                    }
                    if (this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    if (!z9) {
                    }
                    z10 = !this.mCenter.isConnected();
                    boolean[] zArr222 = this.mIsInBarrier;
                    z11 = zArr222[0];
                    boolean z2122 = zArr222[1];
                    if (this.mHorizontalResolution != 2) {
                    }
                    z12 = z2;
                    z13 = z3;
                    z14 = z7;
                    solverVariable = createObjectVariable5;
                    solverVariable2 = createObjectVariable4;
                    solverVariable3 = createObjectVariable3;
                    solverVariable4 = createObjectVariable2;
                    solverVariable5 = createObjectVariable;
                    if (z) {
                    }
                    i16 = i15;
                    if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
                    }
                    solverVariable9 = solverVariable7;
                    solverVariable10 = solverVariable8;
                    if (z14) {
                    }
                    if (constraintWidget4.mCenter.isConnected()) {
                    }
                    constraintWidget4.resolvedHorizontal = false;
                    constraintWidget4.resolvedVertical = false;
                } else if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i6 == 3) {
                    this.mResolvedDimensionRatioSide = 1;
                    if (this.mDimensionRatioSide == -1) {
                        this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                    }
                    i3 = (int) (this.mResolvedDimensionRatio * this.mWidth);
                    if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                        i7 = i3;
                        i9 = i5;
                        i8 = 4;
                    }
                }
                i7 = i3;
                i8 = i6;
                i9 = i5;
                i10 = i19;
                z7 = true;
                int[] iArr22 = this.mResolvedMatchConstraintDefault;
                iArr22[0] = i9;
                iArr22[1] = i8;
                this.mResolvedHasRatio = z7;
                if (z7) {
                }
                z8 = false;
                if (z7) {
                }
                if (this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
                }
                if (!z9) {
                }
                z10 = !this.mCenter.isConnected();
                boolean[] zArr2222 = this.mIsInBarrier;
                z11 = zArr2222[0];
                boolean z21222 = zArr2222[1];
                if (this.mHorizontalResolution != 2) {
                }
                z12 = z2;
                z13 = z3;
                z14 = z7;
                solverVariable = createObjectVariable5;
                solverVariable2 = createObjectVariable4;
                solverVariable3 = createObjectVariable3;
                solverVariable4 = createObjectVariable2;
                solverVariable5 = createObjectVariable;
                if (z) {
                }
                i16 = i15;
                if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
                }
                solverVariable9 = solverVariable7;
                solverVariable10 = solverVariable8;
                if (z14) {
                }
                if (constraintWidget4.mCenter.isConnected()) {
                }
                constraintWidget4.resolvedHorizontal = false;
                constraintWidget4.resolvedVertical = false;
            }
            i7 = i3;
            i8 = i6;
            i9 = i5;
            i10 = i19;
            z7 = false;
            int[] iArr222 = this.mResolvedMatchConstraintDefault;
            iArr222[0] = i9;
            iArr222[1] = i8;
            this.mResolvedHasRatio = z7;
            if (z7) {
            }
            z8 = false;
            if (z7) {
            }
            if (this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
            }
            if (!z9) {
            }
            z10 = !this.mCenter.isConnected();
            boolean[] zArr22222 = this.mIsInBarrier;
            z11 = zArr22222[0];
            boolean z212222 = zArr22222[1];
            if (this.mHorizontalResolution != 2) {
            }
            z12 = z2;
            z13 = z3;
            z14 = z7;
            solverVariable = createObjectVariable5;
            solverVariable2 = createObjectVariable4;
            solverVariable3 = createObjectVariable3;
            solverVariable4 = createObjectVariable2;
            solverVariable5 = createObjectVariable;
            if (z) {
            }
            i16 = i15;
            if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
            }
            solverVariable9 = solverVariable7;
            solverVariable10 = solverVariable8;
            if (z14) {
            }
            if (constraintWidget4.mCenter.isConnected()) {
            }
            constraintWidget4.resolvedHorizontal = false;
            constraintWidget4.resolvedVertical = false;
        }
        z2 = false;
        z3 = false;
        if (this.mVisibility == 8) {
            zArr = this.mIsInBarrier;
            if (!zArr[0]) {
                return;
            }
        }
        z4 = this.resolvedHorizontal;
        if (!z4) {
        }
        if (z4) {
        }
        if (this.resolvedVertical) {
        }
        if (this.resolvedHorizontal) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
            return;
        }
        if (LinearSystem.sMetrics != null) {
        }
        if (!z) {
        }
        if (LinearSystem.sMetrics != null) {
        }
        if (this.mParent == null) {
        }
        i = this.mWidth;
        i2 = this.mMinWidth;
        if (i < i2) {
        }
        i3 = this.mHeight;
        i4 = this.mMinHeight;
        if (i3 < i4) {
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
        }
        this.mResolvedDimensionRatioSide = this.mDimensionRatioSide;
        f = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f;
        i5 = this.mMatchConstraintDefaultWidth;
        i6 = this.mMatchConstraintDefaultHeight;
        int i192 = i;
        if (f <= 0.0f) {
        }
        i7 = i3;
        i8 = i6;
        i9 = i5;
        i10 = i192;
        z7 = false;
        int[] iArr2222 = this.mResolvedMatchConstraintDefault;
        iArr2222[0] = i9;
        iArr2222[1] = i8;
        this.mResolvedHasRatio = z7;
        if (z7) {
        }
        z8 = false;
        if (z7) {
        }
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT) {
        }
        if (!z9) {
        }
        z10 = !this.mCenter.isConnected();
        boolean[] zArr222222 = this.mIsInBarrier;
        z11 = zArr222222[0];
        boolean z2122222 = zArr222222[1];
        if (this.mHorizontalResolution != 2) {
        }
        z12 = z2;
        z13 = z3;
        z14 = z7;
        solverVariable = createObjectVariable5;
        solverVariable2 = createObjectVariable4;
        solverVariable3 = createObjectVariable3;
        solverVariable4 = createObjectVariable2;
        solverVariable5 = createObjectVariable;
        if (z) {
        }
        i16 = i15;
        if ((constraintWidget3.mVerticalResolution == 2 ? i14 : i16) != 0) {
        }
        solverVariable9 = solverVariable7;
        solverVariable10 = solverVariable8;
        if (z14) {
        }
        if (constraintWidget4.mCenter.isConnected()) {
        }
        constraintWidget4.resolvedHorizontal = false;
        constraintWidget4.resolvedVertical = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
            } else {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:380:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        SolverVariable solverVariable3;
        int i11;
        int i12;
        int i13;
        int i14;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int i15;
        boolean z13;
        boolean z14;
        SolverVariable createObjectVariable;
        SolverVariable createObjectVariable2;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i16;
        SolverVariable solverVariable10;
        int i17;
        int i18;
        int i19;
        SolverVariable solverVariable11;
        int i20;
        SolverVariable solverVariable12;
        int i21;
        int i22;
        int i23;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i24;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable13;
        SolverVariable solverVariable14;
        boolean z19;
        SolverVariable solverVariable15;
        ConstraintWidget constraintWidget3;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z20;
        int i29;
        int i30;
        int i31;
        boolean z21;
        int i32;
        boolean z22;
        ConstraintWidget constraintWidget4;
        int i33;
        SolverVariable solverVariable16;
        int i34;
        ConstraintWidget constraintWidget5;
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable createObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean isConnected = constraintAnchor.isConnected();
        boolean isConnected2 = constraintAnchor2.isConnected();
        boolean isConnected3 = this.mCenter.isConnected();
        int i35 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i35++;
        }
        int i36 = z6 ? 3 : i5;
        int i37 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        if (i37 == 1 || i37 == 2 || i37 == 3 || i37 != 4) {
            i9 = i36;
        } else {
            i9 = i36;
            if (i9 != 4) {
                z12 = true;
                i10 = this.mWidthOverride;
                if (i10 == -1 && z) {
                    this.mWidthOverride = -1;
                    solverVariable3 = createObjectVariable6;
                    z12 = false;
                } else {
                    i10 = i2;
                    solverVariable3 = createObjectVariable6;
                }
                i11 = this.mHeightOverride;
                if (i11 != -1 && !z) {
                    this.mHeightOverride = -1;
                    i10 = i11;
                    z12 = false;
                }
                if (this.mVisibility == 8) {
                    i10 = 0;
                    z12 = false;
                }
                if (z11) {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        linearSystem.addEquality(createObjectVariable3, i);
                    } else if (isConnected && !isConnected2) {
                        linearSystem.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                    }
                }
                if (z12) {
                    if (z5) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
                        if (i3 > 0) {
                            linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i3, 8);
                        }
                        if (i4 < Integer.MAX_VALUE) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i4, 8);
                        }
                    } else {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 8);
                    }
                    i12 = i8;
                    i14 = i35;
                    solverVariable4 = createObjectVariable5;
                    solverVariable5 = createObjectVariable4;
                    z13 = z12;
                    solverVariable6 = solverVariable3;
                    z14 = z4;
                    i15 = i7;
                } else if (i35 == 2 || z6 || !(i9 == 1 || i9 == 0)) {
                    int i38 = i7 == -2 ? i10 : i7;
                    i12 = i8 == -2 ? i10 : i8;
                    if (i10 > 0 && i9 != 1) {
                        i10 = 0;
                    }
                    if (i38 > 0) {
                        linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i38, 8);
                        i10 = Math.max(i10, i38);
                    }
                    if (i12 > 0) {
                        if ((z2 && i9 == 1) ? false : true) {
                            i13 = 8;
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i12, 8);
                        } else {
                            i13 = 8;
                        }
                        i10 = Math.min(i10, i12);
                    } else {
                        i13 = 8;
                    }
                    if (i9 == 1) {
                        if (z2) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, i13);
                        } else if (z8) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i10, i13);
                        } else {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i10, i13);
                        }
                        i14 = i35;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        z13 = z12;
                        solverVariable6 = solverVariable3;
                        z14 = z4;
                        i15 = i38;
                    } else if (i9 == 2) {
                        if (constraintAnchor.getType() == ConstraintAnchor.Type.TOP || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                            createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                            createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                            createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                        }
                        i14 = i35;
                        solverVariable6 = solverVariable3;
                        i15 = i38;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(createObjectVariable4, createObjectVariable3, createObjectVariable2, createObjectVariable, f2));
                        if (z2) {
                            z12 = false;
                        }
                        z13 = z12;
                        z14 = z4;
                    } else {
                        i14 = i35;
                        solverVariable4 = createObjectVariable5;
                        solverVariable5 = createObjectVariable4;
                        solverVariable6 = solverVariable3;
                        i15 = i38;
                        z13 = z12;
                        z14 = true;
                    }
                } else {
                    int max = Math.max(i7, i10);
                    if (i8 > 0) {
                        max = Math.min(i8, max);
                    }
                    linearSystem.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                    z14 = z4;
                    i12 = i8;
                    i14 = i35;
                    solverVariable5 = createObjectVariable4;
                    z13 = false;
                    solverVariable6 = solverVariable3;
                    i15 = i7;
                    solverVariable4 = createObjectVariable5;
                }
                if (z11) {
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable2;
                    solverVariable9 = solverVariable5;
                    i16 = 0;
                    solverVariable10 = createObjectVariable3;
                    i17 = i14;
                    i18 = 2;
                } else if (z8) {
                    solverVariable7 = solverVariable;
                    solverVariable8 = solverVariable2;
                    i17 = i14;
                    solverVariable9 = solverVariable5;
                    i16 = 0;
                    i18 = 2;
                    solverVariable10 = createObjectVariable3;
                } else {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        solverVariable15 = solverVariable5;
                        i26 = 5;
                        i27 = 0;
                    } else if (!isConnected || isConnected2) {
                        if (!isConnected && isConnected2) {
                            linearSystem.addEquality(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), 8);
                            if (z2) {
                                if (this.OPTIMIZE_WRAP && createObjectVariable3.isFinalValue && (constraintWidget4 = this.mParent) != null) {
                                    ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget4;
                                    if (z) {
                                        constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                                    } else {
                                        constraintWidgetContainer.addVerticalWrapMinVariable(constraintAnchor);
                                    }
                                } else {
                                    i26 = 5;
                                    linearSystem.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                                    i27 = 0;
                                    solverVariable15 = solverVariable5;
                                }
                            }
                        } else if (isConnected && isConnected2) {
                            ConstraintWidget constraintWidget6 = constraintAnchor.mTarget.mOwner;
                            ConstraintWidget constraintWidget7 = constraintAnchor2.mTarget.mOwner;
                            ConstraintWidget parent = getParent();
                            if (z13) {
                                if (i9 == 0) {
                                    if (i12 != 0 || i15 != 0) {
                                        z21 = false;
                                        i30 = 5;
                                        i32 = 5;
                                        z22 = true;
                                        z15 = true;
                                    } else if (solverVariable4.isFinalValue && solverVariable6.isFinalValue) {
                                        linearSystem.addEquality(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), 8);
                                        linearSystem.addEquality(solverVariable5, solverVariable6, -constraintAnchor2.getMargin(), 8);
                                        return;
                                    } else {
                                        z22 = false;
                                        z15 = false;
                                        i30 = 8;
                                        i32 = 8;
                                        z21 = true;
                                    }
                                    if ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                        solverVariable12 = solverVariable2;
                                        i21 = i30;
                                        i22 = 6;
                                        z17 = z21;
                                        z16 = z22;
                                        i23 = 4;
                                        if (z15 || solverVariable4 != solverVariable6 || constraintWidget6 == parent) {
                                            z18 = true;
                                        } else {
                                            z15 = false;
                                            z18 = false;
                                        }
                                        if (z16) {
                                            i24 = i9;
                                            constraintWidget = parent;
                                            constraintWidget2 = constraintWidget7;
                                            solverVariable13 = solverVariable5;
                                            solverVariable14 = createObjectVariable3;
                                            z19 = z2;
                                        } else {
                                            if (z13 || z7 || z9 || solverVariable4 != solverVariable || solverVariable6 != solverVariable12) {
                                                z19 = z2;
                                                i28 = i22;
                                                z20 = z18;
                                                i29 = i21;
                                            } else {
                                                z19 = false;
                                                i29 = 8;
                                                i28 = 8;
                                                z20 = false;
                                            }
                                            i24 = i9;
                                            constraintWidget = parent;
                                            constraintWidget2 = constraintWidget7;
                                            SolverVariable solverVariable17 = solverVariable5;
                                            solverVariable13 = solverVariable5;
                                            solverVariable14 = createObjectVariable3;
                                            linearSystem.addCentering(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), f, solverVariable6, solverVariable17, constraintAnchor2.getMargin(), i28);
                                            i21 = i29;
                                            z18 = z20;
                                        }
                                        if (this.mVisibility != 8 && !constraintAnchor2.hasDependents()) {
                                            return;
                                        }
                                        if (z15) {
                                            solverVariable15 = solverVariable13;
                                        } else {
                                            if (z19 && solverVariable4 != solverVariable6 && !z13 && ((constraintWidget6 instanceof Barrier) || (constraintWidget2 instanceof Barrier))) {
                                                i21 = 6;
                                            }
                                            linearSystem.addGreaterThan(solverVariable14, solverVariable4, constraintAnchor.getMargin(), i21);
                                            solverVariable15 = solverVariable13;
                                            linearSystem.addLowerThan(solverVariable15, solverVariable6, -constraintAnchor2.getMargin(), i21);
                                        }
                                        if (z19 || !z10 || (constraintWidget6 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                                            constraintWidget3 = constraintWidget;
                                        } else {
                                            constraintWidget3 = constraintWidget;
                                            if (constraintWidget2 != constraintWidget3) {
                                                i21 = 6;
                                                i25 = 6;
                                                z18 = true;
                                                if (z18) {
                                                    if (z17 && (!z9 || z3)) {
                                                        int i39 = (constraintWidget6 == constraintWidget3 || constraintWidget2 == constraintWidget3) ? 6 : i25;
                                                        i39 = ((constraintWidget6 instanceof Guideline) || (constraintWidget2 instanceof Guideline)) ? 5 : 5;
                                                        i39 = ((constraintWidget6 instanceof Barrier) || (constraintWidget2 instanceof Barrier)) ? 5 : 5;
                                                        if (z9) {
                                                            i39 = 5;
                                                        }
                                                        i25 = Math.max(i39, i25);
                                                    }
                                                    if (z19) {
                                                        i25 = (z6 && !z9 && (constraintWidget6 == constraintWidget3 || constraintWidget2 == constraintWidget3)) ? 4 : Math.min(i21, i25);
                                                    }
                                                    linearSystem.addEquality(solverVariable14, solverVariable4, constraintAnchor.getMargin(), i25);
                                                    linearSystem.addEquality(solverVariable15, solverVariable6, -constraintAnchor2.getMargin(), i25);
                                                }
                                                if (z19) {
                                                    int margin = solverVariable == solverVariable4 ? constraintAnchor.getMargin() : 0;
                                                    if (solverVariable4 != solverVariable) {
                                                        linearSystem.addGreaterThan(solverVariable14, solverVariable, margin, 5);
                                                    }
                                                }
                                                if (z19 || !z13 || i3 != 0 || i15 != 0) {
                                                    i26 = 5;
                                                    i27 = 0;
                                                } else if (z13 && i24 == 3) {
                                                    i27 = 0;
                                                    linearSystem.addGreaterThan(solverVariable15, solverVariable14, 0, 8);
                                                    i26 = 5;
                                                } else {
                                                    i27 = 0;
                                                    i26 = 5;
                                                    linearSystem.addGreaterThan(solverVariable15, solverVariable14, 0, 5);
                                                }
                                            }
                                        }
                                        i25 = i23;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i26 = 5;
                                        i27 = 0;
                                    } else {
                                        solverVariable12 = solverVariable2;
                                        z17 = z21;
                                        z16 = z22;
                                        i23 = i32;
                                        i21 = i30;
                                        i22 = 6;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i25 = i23;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i26 = 5;
                                        i27 = 0;
                                    }
                                } else if (i9 == 2) {
                                    if (!(constraintWidget6 instanceof Barrier) && !(constraintWidget7 instanceof Barrier)) {
                                        solverVariable12 = solverVariable2;
                                        i22 = 6;
                                        i21 = 5;
                                        i23 = 5;
                                        z16 = true;
                                        z15 = true;
                                        z17 = false;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i25 = i23;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i26 = 5;
                                        i27 = 0;
                                    }
                                } else if (i9 == 1) {
                                    solverVariable12 = solverVariable2;
                                    i22 = 6;
                                    i21 = 8;
                                    i23 = 4;
                                    z16 = true;
                                    z15 = true;
                                    z17 = false;
                                    if (z15) {
                                    }
                                    z18 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z15) {
                                    }
                                    if (z19) {
                                    }
                                    constraintWidget3 = constraintWidget;
                                    i25 = i23;
                                    if (z18) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i26 = 5;
                                    i27 = 0;
                                } else if (i9 == 3) {
                                    if (this.mResolvedDimensionRatioSide == -1) {
                                        if (z9) {
                                            solverVariable12 = solverVariable2;
                                            i22 = z2 ? 5 : 4;
                                        } else {
                                            solverVariable12 = solverVariable2;
                                            i22 = 8;
                                        }
                                        i21 = 8;
                                    } else if (z6) {
                                        if (i6 == 2 || i6 == 1) {
                                            i30 = 5;
                                            i31 = 4;
                                        } else {
                                            i30 = 8;
                                            i31 = 5;
                                        }
                                        solverVariable12 = solverVariable2;
                                        i23 = i31;
                                        z16 = true;
                                        z15 = true;
                                        z17 = true;
                                        i21 = i30;
                                        i22 = 6;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i25 = i23;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i26 = 5;
                                        i27 = 0;
                                    } else if (i12 > 0) {
                                        solverVariable12 = solverVariable2;
                                        i22 = 6;
                                        i21 = 5;
                                    } else {
                                        if (i12 != 0 || i15 != 0) {
                                            solverVariable12 = solverVariable2;
                                            i22 = 6;
                                            i21 = 5;
                                        } else if (z9) {
                                            solverVariable12 = solverVariable2;
                                            i21 = (constraintWidget6 == parent || constraintWidget7 == parent) ? 5 : 4;
                                            i22 = 6;
                                        } else {
                                            solverVariable12 = solverVariable2;
                                            i22 = 6;
                                            i21 = 5;
                                            i23 = 8;
                                            z16 = true;
                                            z15 = true;
                                            z17 = true;
                                            if (z15) {
                                            }
                                            z18 = true;
                                            if (z16) {
                                            }
                                            if (this.mVisibility != 8) {
                                            }
                                            if (z15) {
                                            }
                                            if (z19) {
                                            }
                                            constraintWidget3 = constraintWidget;
                                            i25 = i23;
                                            if (z18) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i26 = 5;
                                            i27 = 0;
                                        }
                                        i23 = 4;
                                        z16 = true;
                                        z15 = true;
                                        z17 = true;
                                        if (z15) {
                                        }
                                        z18 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != 8) {
                                        }
                                        if (z15) {
                                        }
                                        if (z19) {
                                        }
                                        constraintWidget3 = constraintWidget;
                                        i25 = i23;
                                        if (z18) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i26 = 5;
                                        i27 = 0;
                                    }
                                    i23 = 5;
                                    z16 = true;
                                    z15 = true;
                                    z17 = true;
                                    if (z15) {
                                    }
                                    z18 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z15) {
                                    }
                                    if (z19) {
                                    }
                                    constraintWidget3 = constraintWidget;
                                    i25 = i23;
                                    if (z18) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i26 = 5;
                                    i27 = 0;
                                } else {
                                    solverVariable12 = solverVariable2;
                                    i22 = 6;
                                    i21 = 5;
                                    i23 = 4;
                                    z16 = false;
                                    z15 = false;
                                    z17 = false;
                                    if (z15) {
                                    }
                                    z18 = true;
                                    if (z16) {
                                    }
                                    if (this.mVisibility != 8) {
                                    }
                                    if (z15) {
                                    }
                                    if (z19) {
                                    }
                                    constraintWidget3 = constraintWidget;
                                    i25 = i23;
                                    if (z18) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i26 = 5;
                                    i27 = 0;
                                }
                                i33 = i26;
                                if (z19 || !z14) {
                                    return;
                                }
                                if (constraintAnchor2.mTarget != null) {
                                    i34 = constraintAnchor2.getMargin();
                                    solverVariable16 = solverVariable2;
                                } else {
                                    solverVariable16 = solverVariable2;
                                    i34 = i27;
                                }
                                if (solverVariable6 != solverVariable16) {
                                    if (this.OPTIMIZE_WRAP && solverVariable15.isFinalValue && (constraintWidget5 = this.mParent) != null) {
                                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget5;
                                        if (z) {
                                            constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                                            return;
                                        } else {
                                            constraintWidgetContainer2.addVerticalWrapMaxVariable(constraintAnchor2);
                                            return;
                                        }
                                    }
                                    linearSystem.addGreaterThan(solverVariable16, solverVariable15, i34, i33);
                                    return;
                                }
                                return;
                            } else if (solverVariable4.isFinalValue && solverVariable6.isFinalValue) {
                                linearSystem.addCentering(createObjectVariable3, solverVariable4, constraintAnchor.getMargin(), f, solverVariable6, solverVariable5, constraintAnchor2.getMargin(), 8);
                                if (z2 && z14) {
                                    if (constraintAnchor2.mTarget != null) {
                                        i20 = constraintAnchor2.getMargin();
                                        solverVariable11 = solverVariable2;
                                    } else {
                                        solverVariable11 = solverVariable2;
                                        i20 = 0;
                                    }
                                    if (solverVariable6 != solverVariable11) {
                                        linearSystem.addGreaterThan(solverVariable11, solverVariable5, i20, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            solverVariable12 = solverVariable2;
                            i22 = 6;
                            i21 = 5;
                            i23 = 4;
                            z16 = true;
                            z15 = true;
                            z17 = false;
                            if (z15) {
                            }
                            z18 = true;
                            if (z16) {
                            }
                            if (this.mVisibility != 8) {
                            }
                            if (z15) {
                            }
                            if (z19) {
                            }
                            constraintWidget3 = constraintWidget;
                            i25 = i23;
                            if (z18) {
                            }
                            if (z19) {
                            }
                            if (z19) {
                            }
                            i26 = 5;
                            i27 = 0;
                            i33 = i26;
                            if (z19) {
                                return;
                            }
                            return;
                        }
                        i27 = 0;
                        solverVariable15 = solverVariable5;
                        i26 = 5;
                    } else {
                        z19 = z2;
                        i27 = 0;
                        i33 = (z2 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
                        solverVariable15 = solverVariable5;
                        if (z19) {
                        }
                    }
                    z19 = z2;
                    i33 = i26;
                    if (z19) {
                    }
                }
                if (i17 >= i18 && z2 && z14) {
                    linearSystem.addGreaterThan(solverVariable10, solverVariable7, i16, 8);
                    int i40 = (z || this.mBaseline.mTarget == null) ? 1 : i16;
                    if (z || this.mBaseline.mTarget == null) {
                        i19 = i40;
                    } else {
                        ConstraintWidget constraintWidget8 = this.mBaseline.mTarget.mOwner;
                        i19 = (constraintWidget8.mDimensionRatio != 0.0f && constraintWidget8.mListDimensionBehaviors[i16] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget8.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) ? 1 : i16;
                    }
                    if (i19 != 0) {
                        linearSystem.addGreaterThan(solverVariable8, solverVariable9, i16, 8);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z12 = false;
        i10 = this.mWidthOverride;
        if (i10 == -1) {
        }
        i10 = i2;
        solverVariable3 = createObjectVariable6;
        i11 = this.mHeightOverride;
        if (i11 != -1) {
            this.mHeightOverride = -1;
            i10 = i11;
            z12 = false;
        }
        if (this.mVisibility == 8) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (z11) {
        }
        if (i17 >= i18) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null && horizontalWidgetRun.start.resolved && this.horizontalRun.end.resolved) {
            objectVariableValue = this.horizontalRun.start.value;
            objectVariableValue3 = this.horizontalRun.end.value;
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null && verticalWidgetRun.start.resolved && this.verticalRun.end.resolved) {
            objectVariableValue2 = this.verticalRun.start.value;
            objectVariableValue4 = this.verticalRun.end.value;
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : hashMap.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? hashMap.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        int i3 = this.horizontalRun.start.value;
        int i4 = this.verticalRun.start.value;
        int i5 = this.horizontalRun.end.value;
        int i6 = this.verticalRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (isResolved) {
            this.mX = i3;
        }
        if (isResolved2) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    public void getSceneString(StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.mWidth);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.mHeight);
        sb.append("\n");
        sb.append("    actualLeft:" + this.mX);
        sb.append("\n");
        sb.append("    actualTop:" + this.mY);
        sb.append("\n");
        getSceneString(sb, "left", this.mLeft);
        getSceneString(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, this.mTop);
        getSceneString(sb, TtmlNode.RIGHT, this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        getSceneString(sb, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        getSceneString(sb, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb.append("  }");
    }

    private void getSceneString(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "      size", i, 0);
        serializeAttribute(sb, "      min", i2, 0);
        serializeAttribute(sb, "      max", i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "      matchMin", i5, 0);
        serializeAttribute(sb, "      matchDef", i6, 0);
        serializeAttribute(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void getSceneString(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("'");
        if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(",");
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.mGoneMargin);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }
}
