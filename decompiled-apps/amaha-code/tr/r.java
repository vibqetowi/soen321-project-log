package tr;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.cardview.widget.CardView;
import b2.c;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.k5;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.p000firebaseauthapi.a6;
import com.google.android.gms.internal.p000firebaseauthapi.c5;
import com.google.android.gms.internal.p000firebaseauthapi.ie;
import com.google.android.gms.internal.p000firebaseauthapi.je;
import com.google.android.gms.internal.p000firebaseauthapi.ke;
import com.google.android.gms.internal.p000firebaseauthapi.ne;
import com.google.android.gms.internal.p000firebaseauthapi.q5;
import com.google.android.gms.internal.p000firebaseauthapi.r5;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.gms.internal.p000firebaseauthapi.sa;
import com.google.android.gms.internal.p000firebaseauthapi.se;
import com.google.android.gms.internal.p000firebaseauthapi.t5;
import com.google.android.gms.internal.p000firebaseauthapi.w5;
import com.google.android.gms.internal.p000firebaseauthapi.yb;
import com.google.android.gms.internal.p000firebaseauthapi.zzvg;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.conditionSelection.activity.ConditionSelectionA3Activity;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.onboarding.activity.NewOnBoardingInfoScreenActivity;
import com.theinnerhour.b2b.components.onboarding.activity.OnboardingFlowActivity;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import dv.b;
import hh.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mi.t1;
import org.json.JSONException;
import org.json.JSONObject;
import ta.h2;
import ta.j2;
/* compiled from: GlobalInterceptors.java */
/* loaded from: classes2.dex */
public class r implements c.InterfaceC0074c, InstallReferrerStateListener, g3, k3.a0, com.google.android.gms.common.api.internal.n, lv.n, ya.g, u3.h, h2, b.InterfaceC0206b, h4.j, w4.k, je.x, bg.d, fg.b, uf.l {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f33561u = {R.attr.dotsClickable, R.attr.dotsColor, R.attr.dotsCornerRadius, R.attr.dotsElevation, R.attr.dotsSize, R.attr.dotsSpacing, R.attr.dotsWidthFactor, R.attr.progressMode, R.attr.selectedDotColor};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f33562v = {R.attr.dampingRatio, R.attr.dotsClickable, R.attr.dotsColor, R.attr.dotsCornerRadius, R.attr.dotsSize, R.attr.dotsSpacing, R.attr.dotsStrokeColor, R.attr.dotsStrokeWidth, R.attr.stiffness};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f33563w = {R.attr.dotsClickable, R.attr.dotsColor, R.attr.dotsCornerRadius, R.attr.dotsSize, R.attr.dotsSpacing, R.attr.dotsStrokeColor, R.attr.dotsStrokeWidth};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f33564x = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f33565y = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f33566z = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};
    public static final int[] A = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintRotate, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionSteps, R.attr.transitionEasing, R.attr.transitionPathRotate};
    public static final int[] B = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};
    public static final int[] C = {16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate};
    public static final int[] D = {16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveOffset, R.attr.wavePeriod, R.attr.wavePhase, R.attr.waveShape, R.attr.waveVariesBy};
    public static final int[] E = {R.attr.curveFit, R.attr.drawPath, R.attr.framePosition, R.attr.keyPositionType, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.percentHeight, R.attr.percentWidth, R.attr.percentX, R.attr.percentY, R.attr.sizePercent, R.attr.transitionEasing};
    public static final int[] F = {16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveDecay, R.attr.waveOffset, R.attr.wavePeriod, R.attr.wavePhase, R.attr.waveShape};
    public static final int[] G = {R.attr.framePosition, R.attr.motionTarget, R.attr.motion_postLayoutCollision, R.attr.motion_triggerOnCollision, R.attr.onCross, R.attr.onNegativeCross, R.attr.onPositiveCross, R.attr.triggerId, R.attr.triggerReceiver, R.attr.triggerSlack, R.attr.viewTransitionOnCross, R.attr.viewTransitionOnNegativeCross, R.attr.viewTransitionOnPositiveCross};
    public static final int[] H = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};
    public static final int[] I = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};
    public static final int[] J = {R.attr.onHide, R.attr.onShow};
    public static final int[] K = {R.attr.applyMotionScene, R.attr.currentState, R.attr.layoutDescription, R.attr.motionDebug, R.attr.motionProgress, R.attr.showPaths};
    public static final int[] L = {R.attr.defaultDuration, R.attr.layoutDuringTransition};
    public static final int[] M = {R.attr.clickAction, R.attr.targetId};
    public static final int[] N = {R.attr.autoCompleteMode, R.attr.dragDirection, R.attr.dragScale, R.attr.dragThreshold, R.attr.limitBoundsTo, R.attr.maxAcceleration, R.attr.maxVelocity, R.attr.moveWhenScrollAtTop, R.attr.nestedScrollFlags, R.attr.onTouchUp, R.attr.rotationCenterId, R.attr.springBoundary, R.attr.springDamping, R.attr.springMass, R.attr.springStiffness, R.attr.springStopThreshold, R.attr.touchAnchorId, R.attr.touchAnchorSide, R.attr.touchRegionId};
    public static final int[] O = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};
    public static final int[] P = {16842960, R.attr.constraints};
    public static final int[] Q = {R.attr.defaultState};
    public static final int[] R = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};
    public static final int[] S = {16842960, R.attr.autoTransition, R.attr.constraintSetEnd, R.attr.constraintSetStart, R.attr.duration, R.attr.layoutDuringTransition, R.attr.motionInterpolator, R.attr.pathMotionArc, R.attr.staggered, R.attr.transitionDisable, R.attr.transitionFlags};
    public static final int[] T = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};
    public static final int[] U = {16842960, R.attr.SharedValue, R.attr.SharedValueId, R.attr.clearsTag, R.attr.duration, R.attr.ifTagNotSet, R.attr.ifTagSet, R.attr.motionInterpolator, R.attr.motionTarget, R.attr.onStateTransition, R.attr.pathMotionArc, R.attr.setsTag, R.attr.transitionDisable, R.attr.upDuration, R.attr.viewTransitionMode};
    public static final int[] V = {R.attr.constraintSet};
    public static final r W = new r();
    public static final r X = new r();
    public static final r Y = new r();
    public static final r Z = new r();

    /* renamed from: a0  reason: collision with root package name */
    public static final r f33544a0 = new r();

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f33545b0 = {16842755, 16842960, 16842961};
    public static final int[] c0 = {16842755, 16842961};

    /* renamed from: d0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33546d0 = new kotlinx.coroutines.internal.r("EMPTY");
    public static final kotlinx.coroutines.internal.r e0 = new kotlinx.coroutines.internal.r("OFFER_SUCCESS");

    /* renamed from: f0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33547f0 = new kotlinx.coroutines.internal.r("OFFER_FAILED");

    /* renamed from: g0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33548g0 = new kotlinx.coroutines.internal.r("POLL_FAILED");

    /* renamed from: h0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33549h0 = new kotlinx.coroutines.internal.r("ENQUEUE_FAILED");

    /* renamed from: i0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33550i0 = new kotlinx.coroutines.internal.r("ON_CLOSE_HANDLER_INVOKED");

    /* renamed from: j0  reason: collision with root package name */
    public static final r f33551j0 = new r();

    /* renamed from: k0  reason: collision with root package name */
    public static final r f33552k0 = new r();

    /* renamed from: l0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33553l0 = new kotlinx.coroutines.internal.r("NONE");

    /* renamed from: m0  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f33554m0 = new kotlinx.coroutines.internal.r("PENDING");

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f33555n0 = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f33556o0 = new int[0];

    /* renamed from: p0  reason: collision with root package name */
    public static final long[] f33557p0 = new long[0];

    /* renamed from: q0  reason: collision with root package name */
    public static final Object[] f33558q0 = new Object[0];

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ r f33559r0 = new r();

    /* renamed from: s0  reason: collision with root package name */
    public static final r f33560s0 = new r();

    public /* synthetic */ r() {
    }

    public static String A(com.google.android.gms.internal.p000firebaseauthapi.h0 h0Var) {
        StringBuilder sb2 = new StringBuilder(h0Var.m());
        for (int i6 = 0; i6 < h0Var.m(); i6++) {
            byte e10 = h0Var.e(i6);
            if (e10 != 34) {
                if (e10 != 39) {
                    if (e10 != 92) {
                        switch (e10) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (e10 >= 32 && e10 <= 126) {
                                    sb2.append((char) e10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((e10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((e10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((e10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static String B(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (invoke != null && String.class.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String C(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i6 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(i6 >> 4));
            sb2.append("0123456789abcdef".charAt(i6 & 15));
        }
        return sb2.toString();
    }

    public static void D(String str, je jeVar, se seVar, Class cls, ne neVar) {
        try {
            v9.o.h(jeVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = jeVar.S().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            neVar.a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                L(httpURLConnection, seVar, cls);
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (NullPointerException e10) {
            e = e10;
            seVar.e(e.getMessage());
        } catch (SocketTimeoutException unused2) {
            seVar.e("TIMEOUT");
        } catch (UnknownHostException unused3) {
            seVar.e("<<Network Error>>");
        } catch (IOException e11) {
            e = e11;
            seVar.e(e.getMessage());
        } catch (JSONException e12) {
            e = e12;
            seVar.e(e.getMessage());
        }
    }

    public static final void E(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i6) {
        if (i6 >= 0 && byteBuffer2.remaining() >= i6 && byteBuffer3.remaining() >= i6 && byteBuffer.remaining() >= i6) {
            for (int i10 = 0; i10 < i6; i10++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static boolean F(int i6) {
        Boolean bool;
        if (i6 - 1 != 0) {
            if (c5.a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    c5.f7750a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    bool = Boolean.FALSE;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        } else if (!c5.a()) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean G(byte[] bArr, int i6) {
        int i10;
        int i11 = 0;
        while (i11 < i6 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 < i6) {
            while (i11 < i6) {
                int i12 = i11 + 1;
                i10 = bArr[i11];
                if (i10 < 0) {
                    if (i10 < -32) {
                        if (i12 < i6) {
                            if (i10 >= -62) {
                                i11 = i12 + 1;
                                if (bArr[i12] > -65) {
                                }
                            }
                            i10 = -1;
                            break;
                        }
                        break;
                    } else if (i10 < -16) {
                        if (i12 >= i6 - 1) {
                            i10 = k5.c(i12, bArr, i6);
                            break;
                        }
                        int i13 = i12 + 1;
                        char c10 = bArr[i12];
                        if (c10 <= -65 && ((i10 != -32 || c10 >= -96) && (i10 != -19 || c10 < -96))) {
                            i11 = i13 + 1;
                            if (bArr[i13] > -65) {
                            }
                        }
                        i10 = -1;
                        break;
                    } else if (i12 >= i6 - 2) {
                        i10 = k5.c(i12, bArr, i6);
                        break;
                    } else {
                        int i14 = i12 + 1;
                        int i15 = bArr[i12];
                        if (i15 <= -65) {
                            if ((((i15 + com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (i10 << 28)) >> 30) == 0) {
                                int i16 = i14 + 1;
                                if (bArr[i14] <= -65) {
                                    i12 = i16 + 1;
                                    if (bArr[i16] > -65) {
                                    }
                                }
                            }
                        }
                        i10 = -1;
                        break;
                    }
                }
                i11 = i12;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            return false;
        }
        return true;
    }

    public static byte[] H(byte[] bArr, byte[] bArr2) {
        long j10 = 67108863;
        long N2 = (N(bArr, 0) >> 0) & 67108863;
        long N3 = (N(bArr, 3) >> 2) & 67108863 & 67108611;
        long N4 = (N(bArr, 6) >> 4) & 67108863 & 67092735;
        long N5 = (N(bArr, 9) >> 6) & 67108863 & 66076671;
        long N6 = (N(bArr, 12) >> 8) & 67108863 & 1048575;
        long j11 = N3 * 5;
        long j12 = N4 * 5;
        long j13 = N5 * 5;
        long j14 = N6 * 5;
        int i6 = 17;
        byte[] bArr3 = new byte[17];
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i10 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 < length) {
                int min = Math.min(16, length - i10);
                System.arraycopy(bArr2, i10, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i6, (byte) 0);
                }
                long N7 = j19 + ((N(bArr3, 0) >> 0) & j10);
                long N8 = j15 + ((N(bArr3, 3) >> 2) & j10);
                long N9 = j16 + ((N(bArr3, 6) >> 4) & j10);
                long N10 = j17 + ((N(bArr3, 9) >> 6) & j10);
                long N11 = j18 + (((N(bArr3, 12) >> 8) & j10) | (bArr3[16] << 24));
                long j20 = (N11 * j11) + (N10 * j12) + (N9 * j13) + (N8 * j14) + (N7 * N2);
                long j21 = (N11 * j12) + (N10 * j13) + (N9 * j14) + (N8 * N2) + (N7 * N3) + (j20 >> 26);
                long j22 = (N11 * j13) + (N10 * j14) + (N9 * N2) + (N8 * N3) + (N7 * N4) + (j21 >> 26);
                long j23 = (N11 * j14) + (N10 * N2) + (N9 * N3) + (N8 * N4) + (N7 * N5) + (j22 >> 26);
                long j24 = N10 * N3;
                long j25 = N11 * N2;
                long j26 = j25 + j24 + (N9 * N4) + (N8 * N5) + (N7 * N6) + (j23 >> 26);
                long j27 = ((j26 >> 26) * 5) + (j20 & 67108863);
                j19 = j27 & 67108863;
                long j28 = (j21 & 67108863) + (j27 >> 26);
                i10 += 16;
                j18 = j26 & 67108863;
                j17 = j23 & 67108863;
                j16 = j22 & 67108863;
                i6 = 17;
                j15 = j28;
                j10 = 67108863;
            } else {
                long j29 = j10;
                long j30 = j16 + (j15 >> 26);
                long j31 = j30 & j29;
                long j32 = j17 + (j30 >> 26);
                long j33 = j32 & j29;
                long j34 = j18 + (j32 >> 26);
                long j35 = j34 & j29;
                long j36 = ((j34 >> 26) * 5) + j19;
                long j37 = j36 & j29;
                long j38 = (j15 & j29) + (j36 >> 26);
                long j39 = j37 + 5;
                long j40 = (j39 >> 26) + j38;
                long j41 = j31 + (j40 >> 26);
                long j42 = j33 + (j41 >> 26);
                long j43 = (j35 + (j42 >> 26)) - 67108864;
                long j44 = j43 >> 63;
                long j45 = ~j44;
                long j46 = (j40 & 67108863 & j45) | (j38 & j44);
                long j47 = (j31 & j44) | (j41 & 67108863 & j45);
                long j48 = (j33 & j44) | (j42 & 67108863 & j45);
                long N12 = N(bArr, 16) + (((j37 & j44) | (j39 & 67108863 & j45) | (j46 << 26)) & 4294967295L);
                long N13 = N(bArr, 20) + (((j46 >> 6) | (j47 << 20)) & 4294967295L) + (N12 >> 32);
                long N14 = N(bArr, 24) + (((j48 << 14) | (j47 >> 12)) & 4294967295L) + (N13 >> 32);
                long N15 = N(bArr, 28);
                byte[] bArr4 = new byte[16];
                R(bArr4, 0, N12 & 4294967295L);
                R(bArr4, 4, N13 & 4294967295L);
                R(bArr4, 8, N14 & 4294967295L);
                R(bArr4, 12, ((((j48 >> 18) | (((j35 & j44) | (j43 & j45)) << 8)) & 4294967295L) + N15 + (N14 >> 32)) & 4294967295L);
                return bArr4;
            }
        }
    }

    public static byte[] I(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            int i6 = 0;
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i10 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i10;
            copyOf[31] = (byte) (i10 | 64);
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i11 = 0; i11 < 7; i11++) {
                    byte[][] bArr3 = yb.f8259a;
                    if (M(bArr3[i11], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(C(bArr3[i11])));
                    }
                }
                int i12 = 10;
                long[] jArr2 = new long[10];
                for (int i13 = 0; i13 < 10; i13++) {
                    int i14 = kotlin.jvm.internal.b0.E[i13];
                    jArr2[i13] = ((((copyOf2[i14 + 3] & 255) << 24) | (((copyOf2[i14] & 255) | ((copyOf2[i14 + 1] & 255) << 8)) | ((copyOf2[i14 + 2] & 255) << 16))) >> kotlin.jvm.internal.b0.F[i13]) & kotlin.jvm.internal.b0.G[i13 & 1];
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                int i15 = 0;
                while (i15 < 32) {
                    int i16 = copyOf[(32 - i15) - 1] & 255;
                    int i17 = 8;
                    while (i6 < i17) {
                        int i18 = (i16 >> (7 - i6)) & 1;
                        yb.a(jArr5, jArr3, i18);
                        yb.a(jArr6, jArr4, i18);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr5, i12);
                        int i19 = i16;
                        long[] jArr11 = new long[19];
                        long[] jArr12 = jArr;
                        long[] jArr13 = new long[19];
                        int i20 = i15;
                        long[] jArr14 = new long[19];
                        int i21 = i6;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = new long[19];
                        long[] jArr17 = jArr10;
                        long[] jArr18 = new long[19];
                        long[] jArr19 = new long[19];
                        kotlin.jvm.internal.b0.C(jArr5, jArr5, jArr6);
                        kotlin.jvm.internal.b0.B(jArr6, copyOf3, jArr6);
                        long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                        kotlin.jvm.internal.b0.C(jArr3, jArr3, jArr4);
                        kotlin.jvm.internal.b0.B(jArr4, copyOf4, jArr4);
                        kotlin.jvm.internal.b0.x(jArr15, jArr3, jArr6);
                        kotlin.jvm.internal.b0.x(jArr16, jArr5, jArr4);
                        kotlin.jvm.internal.b0.z(jArr15);
                        kotlin.jvm.internal.b0.y(jArr15);
                        kotlin.jvm.internal.b0.z(jArr16);
                        kotlin.jvm.internal.b0.y(jArr16);
                        long[] jArr20 = jArr3;
                        System.arraycopy(jArr15, 0, copyOf4, 0, 10);
                        kotlin.jvm.internal.b0.C(jArr15, jArr15, jArr16);
                        kotlin.jvm.internal.b0.B(jArr16, copyOf4, jArr16);
                        kotlin.jvm.internal.b0.A(jArr19, jArr15);
                        kotlin.jvm.internal.b0.A(jArr18, jArr16);
                        kotlin.jvm.internal.b0.x(jArr16, jArr18, jArr2);
                        kotlin.jvm.internal.b0.z(jArr16);
                        kotlin.jvm.internal.b0.y(jArr16);
                        System.arraycopy(jArr19, 0, jArr7, 0, 10);
                        System.arraycopy(jArr16, 0, jArr8, 0, 10);
                        kotlin.jvm.internal.b0.A(jArr13, jArr5);
                        kotlin.jvm.internal.b0.A(jArr14, jArr6);
                        kotlin.jvm.internal.b0.x(jArr9, jArr13, jArr14);
                        kotlin.jvm.internal.b0.z(jArr9);
                        kotlin.jvm.internal.b0.y(jArr9);
                        kotlin.jvm.internal.b0.B(jArr14, jArr13, jArr14);
                        Arrays.fill(jArr11, 10, 18, 0L);
                        int i22 = 0;
                        for (int i23 = 10; i22 < i23; i23 = 10) {
                            jArr11[i22] = jArr14[i22] * 121665;
                            i22++;
                        }
                        kotlin.jvm.internal.b0.y(jArr11);
                        kotlin.jvm.internal.b0.C(jArr11, jArr11, jArr13);
                        kotlin.jvm.internal.b0.x(jArr17, jArr14, jArr11);
                        kotlin.jvm.internal.b0.z(jArr17);
                        kotlin.jvm.internal.b0.y(jArr17);
                        yb.a(jArr9, jArr7, i18);
                        yb.a(jArr17, jArr8, i18);
                        i6 = i21 + 1;
                        jArr3 = jArr7;
                        i16 = i19;
                        copyOf = bArr4;
                        jArr = jArr12;
                        i15 = i20;
                        jArr7 = jArr20;
                        i12 = 10;
                        i17 = 8;
                        long[] jArr21 = jArr6;
                        jArr6 = jArr17;
                        jArr10 = jArr21;
                        long[] jArr22 = jArr5;
                        jArr5 = jArr9;
                        jArr9 = jArr22;
                        long[] jArr23 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr23;
                    }
                    i15++;
                    i6 = 0;
                    i12 = 10;
                }
                long[] jArr24 = jArr;
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[10];
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = jArr3;
                long[] jArr36 = new long[10];
                kotlin.jvm.internal.b0.A(jArr26, jArr6);
                kotlin.jvm.internal.b0.A(jArr36, jArr26);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                kotlin.jvm.internal.b0.w(jArr27, jArr34, jArr6);
                kotlin.jvm.internal.b0.w(jArr28, jArr27, jArr26);
                kotlin.jvm.internal.b0.A(jArr34, jArr28);
                kotlin.jvm.internal.b0.w(jArr29, jArr34, jArr27);
                kotlin.jvm.internal.b0.A(jArr34, jArr29);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                kotlin.jvm.internal.b0.w(jArr30, jArr34, jArr29);
                kotlin.jvm.internal.b0.A(jArr34, jArr30);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                for (int i24 = 2; i24 < 10; i24 += 2) {
                    kotlin.jvm.internal.b0.A(jArr34, jArr36);
                    kotlin.jvm.internal.b0.A(jArr36, jArr34);
                }
                kotlin.jvm.internal.b0.w(jArr31, jArr36, jArr30);
                kotlin.jvm.internal.b0.A(jArr34, jArr31);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                for (int i25 = 2; i25 < 20; i25 += 2) {
                    kotlin.jvm.internal.b0.A(jArr34, jArr36);
                    kotlin.jvm.internal.b0.A(jArr36, jArr34);
                }
                kotlin.jvm.internal.b0.w(jArr34, jArr36, jArr31);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                for (int i26 = 2; i26 < 10; i26 += 2) {
                    kotlin.jvm.internal.b0.A(jArr36, jArr34);
                    kotlin.jvm.internal.b0.A(jArr34, jArr36);
                }
                kotlin.jvm.internal.b0.w(jArr32, jArr34, jArr30);
                kotlin.jvm.internal.b0.A(jArr34, jArr32);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                for (int i27 = 2; i27 < 50; i27 += 2) {
                    kotlin.jvm.internal.b0.A(jArr34, jArr36);
                    kotlin.jvm.internal.b0.A(jArr36, jArr34);
                }
                kotlin.jvm.internal.b0.w(jArr33, jArr36, jArr32);
                kotlin.jvm.internal.b0.A(jArr36, jArr33);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                for (int i28 = 2; i28 < 100; i28 += 2) {
                    kotlin.jvm.internal.b0.A(jArr36, jArr34);
                    kotlin.jvm.internal.b0.A(jArr34, jArr36);
                }
                kotlin.jvm.internal.b0.w(jArr36, jArr34, jArr33);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                for (int i29 = 2; i29 < 50; i29 += 2) {
                    kotlin.jvm.internal.b0.A(jArr34, jArr36);
                    kotlin.jvm.internal.b0.A(jArr36, jArr34);
                }
                kotlin.jvm.internal.b0.w(jArr34, jArr36, jArr32);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                kotlin.jvm.internal.b0.A(jArr34, jArr36);
                kotlin.jvm.internal.b0.A(jArr36, jArr34);
                kotlin.jvm.internal.b0.w(jArr25, jArr36, jArr28);
                kotlin.jvm.internal.b0.w(jArr24, jArr5, jArr25);
                long[] jArr37 = new long[10];
                long[] jArr38 = new long[10];
                long[] jArr39 = new long[11];
                long[] jArr40 = new long[11];
                long[] jArr41 = new long[11];
                kotlin.jvm.internal.b0.w(jArr37, jArr2, jArr24);
                kotlin.jvm.internal.b0.C(jArr38, jArr2, jArr24);
                long[] jArr42 = new long[10];
                jArr42[0] = 486662;
                kotlin.jvm.internal.b0.C(jArr40, jArr38, jArr42);
                kotlin.jvm.internal.b0.w(jArr40, jArr40, jArr4);
                kotlin.jvm.internal.b0.C(jArr40, jArr40, jArr35);
                kotlin.jvm.internal.b0.w(jArr40, jArr40, jArr37);
                kotlin.jvm.internal.b0.w(jArr40, jArr40, jArr35);
                for (int i30 = 0; i30 < 10; i30++) {
                    jArr39[i30] = jArr40[i30] * 4;
                }
                kotlin.jvm.internal.b0.y(jArr39);
                kotlin.jvm.internal.b0.w(jArr40, jArr37, jArr4);
                kotlin.jvm.internal.b0.B(jArr40, jArr40, jArr4);
                kotlin.jvm.internal.b0.w(jArr41, jArr38, jArr35);
                kotlin.jvm.internal.b0.C(jArr40, jArr40, jArr41);
                kotlin.jvm.internal.b0.A(jArr40, jArr40);
                if (M(kotlin.jvm.internal.b0.D(jArr39), kotlin.jvm.internal.b0.D(jArr40))) {
                    return kotlin.jvm.internal.b0.D(jArr24);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(C(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static w5 J(sa saVar) {
        if (saVar.A() == 3) {
            return new g.x(17, new s5("HmacSha256", 0, 0));
        }
        if (saVar.A() == 4) {
            return a6.a(1);
        }
        if (saVar.A() == 5) {
            return a6.a(2);
        }
        if (saVar.A() == 6) {
            return a6.a(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static String K(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder g5 = defpackage.d.g("<", str2, " threw ");
                    g5.append(e10.getClass().getName());
                    g5.append(">");
                    sb2 = g5.toString();
                }
            }
            objArr[i10] = sb2;
            i10++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i6 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i11, indexOf);
            sb3.append(objArr[i6]);
            i11 = indexOf + 2;
            i6++;
        }
        sb3.append((CharSequence) str, i11, str.length());
        if (i6 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i6]);
            for (int i12 = i6 + 1; i12 < objArr.length; i12++) {
                sb3.append(", ");
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static void L(HttpURLConnection httpURLConnection, se seVar, Class cls) {
        boolean z10;
        InputStream errorStream;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                boolean z11 = true;
                if (responseCode >= 200 && responseCode < 300) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (responseCode < 200 || responseCode >= 300) {
                    z11 = false;
                }
                if (!z11) {
                    seVar.e((String) ie.a(sb3, String.class));
                } else {
                    seVar.j((ke) ie.a(sb3, cls));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th4) {
                httpURLConnection.disconnect();
                throw th4;
            }
        } catch (zzvg e10) {
            e = e10;
            seVar.e(e.getMessage());
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException unused2) {
            seVar.e("TIMEOUT");
            httpURLConnection.disconnect();
        } catch (IOException e11) {
            e = e11;
            seVar.e(e.getMessage());
            httpURLConnection.disconnect();
        }
    }

    public static final boolean M(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i6 = 0;
            for (int i10 = 0; i10 < bArr.length; i10++) {
                i6 |= bArr[i10] ^ bArr2[i10];
            }
            if (i6 == 0) {
                return true;
            }
        }
        return false;
    }

    public static long N(byte[] bArr, int i6) {
        return (((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16)) & 4294967295L;
    }

    public static s5 P(sa saVar) {
        if (saVar.z() == 3) {
            return new s5("HmacSha256", 0, 0);
        }
        if (saVar.z() == 4) {
            return new s5("HmacSha384", 0, 0);
        }
        if (saVar.z() == 5) {
            return new s5("HmacSha512", 0, 0);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static byte[] Q(byte[]... bArr) {
        int i6 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i6 <= SubsamplingScaleImageView.TILE_SIZE_AUTO - length) {
                i6 += length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i6];
        int i10 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i10, length2);
            i10 += length2;
        }
        return bArr3;
    }

    public static void R(byte[] bArr, int i6, long j10) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i6 + i10] = (byte) (255 & j10);
            i10++;
            j10 >>= 8;
        }
    }

    public static final byte[] S(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return U(0, 0, length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static boolean T(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static final byte[] U(int i6, int i10, int i11, byte[] bArr, byte[] bArr2) {
        if (bArr.length - i11 >= i6 && bArr2.length - i11 >= i10) {
            byte[] bArr3 = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr3[i12] = (byte) (bArr[i12 + i6] ^ bArr2[i12 + i10]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final kotlinx.coroutines.flow.x f(Serializable serializable) {
        Object obj = serializable;
        if (serializable == null) {
            obj = kotlin.jvm.internal.b0.K;
        }
        return new kotlinx.coroutines.flow.x(obj);
    }

    public static final Object g(ya.v vVar, ls.d dVar) {
        if (vVar.isComplete()) {
            Exception exception = vVar.getException();
            if (exception == null) {
                if (!vVar.f38419d) {
                    return vVar.getResult();
                }
                throw new CancellationException("Task " + vVar + " was cancelled normally.");
            }
            throw exception;
        }
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        vVar.addOnCompleteListener(kv.a.f23957u, new kv.b(kVar));
        return kVar.s();
    }

    public static int j(int i6, int i10, int[] iArr) {
        int i11 = i6 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static int k(long[] jArr, int i6, long j10) {
        int i10 = i6 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = (jArr[i12] > j10 ? 1 : (jArr[i12] == j10 ? 0 : -1));
            if (i13 < 0) {
                i11 = i12 + 1;
            } else if (i13 > 0) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }

    public static JSONObject l(oh.b bVar) {
        s1.s sVar = bVar.f27464h;
        JSONObject jSONObject = (JSONObject) sVar.f31224v;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        v.c cVar = (v.c) sVar.f31225w;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bid", (String) cVar.f34631v);
        jSONObject2.put("request_time", (String) cVar.f34632w);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("e_t_p", !((ih.g) cVar.f34633x).f20083a);
        jSONObject2.put("dev_pref", jSONObject3);
        if (!((List) cVar.f34634y).isEmpty()) {
            jSONObject2.put("integrations", f6.b.F0((List) cVar.f34634y));
        }
        jSONObject.put("meta", jSONObject2);
        JSONObject value = (JSONObject) sVar.f31226x;
        kotlin.jvm.internal.i.g(value, "value");
        jSONObject.put("query_params", value);
        return jSONObject;
    }

    public static JSONObject n(oh.a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject value = ((di.l) ((jg.d) aVar.f27461h).f22021d).f12898b;
        kotlin.jvm.internal.i.g(value, "value");
        jSONObject.put("query_params", value);
        List list = (List) aVar.f27462i;
        if (!list.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("integrations", f6.b.F0(list));
            jSONObject.put("meta", jSONObject2);
        }
        return jSONObject;
    }

    public static ContentValues q(mh.e eVar) {
        ContentValues contentValues = new ContentValues();
        if (eVar.a() != -1) {
            contentValues.put("_id", Long.valueOf(eVar.a()));
        }
        contentValues.put("campaign_payload", (String) eVar.f25072e);
        contentValues.put("expiry_time", Long.valueOf(eVar.f25071d));
        contentValues.put(Constants.CAMPAIGN_ID, (String) eVar.f25070c);
        return contentValues;
    }

    public static Intent r(Activity activity) {
        Object obj;
        String str;
        ArrayList<MiniCourse> arrayList;
        boolean z10;
        Intent intent;
        boolean z11;
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(activity, "activity");
        User user = FirebasePersistence.getInstance().getUser();
        ArrayList<MiniCourse> arrayList2 = null;
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            str = "default";
        }
        boolean booleanValue = ApplicationPersistence.getInstance().getBooleanValue(Constants.IS_INFO_SCREEN_VISITED, false);
        User user2 = FirebasePersistence.getInstance().getUser();
        if (user2 != null) {
            arrayList = user2.getMiniCourses();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (kotlin.jvm.internal.i.b(str, "variant_a") && z10 && !booleanValue) {
            intent = new Intent(activity, NewOnBoardingInfoScreenActivity.class);
        } else if (kotlin.jvm.internal.i.b(str, "variant_a") && z10 && !MyApplication.V.a().M) {
            intent = new Intent(activity, OnboardingFlowActivity.class);
        } else {
            intent = new Intent(activity, ConditionSelectionA3Activity.class);
        }
        User user3 = FirebasePersistence.getInstance().getUser();
        if (user3 != null) {
            arrayList2 = user3.getMiniCourses();
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((!z11) || ApplicationPersistence.getInstance().getBooleanValue("existing_user", false)) {
            intent.putExtra("existing_user", true);
        }
        return intent;
    }

    public static Intent s(Activity activity, boolean z10) {
        kotlin.jvm.internal.i.g(activity, "activity");
        if (pn.a.f28723a.getBoolean("campaign_active", false)) {
            if (z10) {
                return new Intent(activity, MiniMonetizationActivity.class);
            }
            return new Intent(activity, MonetizationActivity.class);
        } else if (z10) {
            return new Intent(activity, MiniMonetizationActivity.class);
        } else {
            return new Intent(activity, MonetizationActivity.class);
        }
    }

    public static ng.c w(String str, String str2, String str3, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ng.c cVar = new ng.c();
        if (str != null && !gv.n.B0(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && t1.h(str)) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                if (key != null && !gv.n.B0(key)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (!z16) {
                    kotlin.jvm.internal.i.f(key, "key");
                    cVar.a(jSONObject.get(key), key);
                }
            }
        }
        if (str2 != null && !gv.n.B0(str2)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12 && t1.h(str2)) {
            JSONObject jSONObject2 = new JSONObject(str2);
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String key2 = keys2.next();
                Object obj = jSONObject2.get(key2);
                if (obj != null) {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    if (key2 != null && !gv.n.B0(key2)) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (!z15) {
                        kotlin.jvm.internal.i.f(key2, "key");
                        cVar.a(new fi.c(jSONObject3.getDouble("latitude"), jSONObject3.getDouble("longitude")), key2);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            }
        }
        if (str3 != null && !gv.n.B0(str3)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z13 && t1.h(str3)) {
            JSONObject jSONObject4 = new JSONObject(str3);
            Iterator<String> keys3 = jSONObject4.keys();
            while (keys3.hasNext()) {
                String key3 = keys3.next();
                if (key3 != null && !gv.n.B0(key3)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (!z14) {
                    kotlin.jvm.internal.i.f(key3, "key");
                    String string = jSONObject4.getString(key3);
                    kotlin.jvm.internal.i.f(string, "dateAttributeJson.getString(key)");
                    if (!gv.n.B0(key3)) {
                        ug.m mVar = cVar.f26313a;
                        mVar.getClass();
                        try {
                            ug.m.g(key3);
                            if (gv.n.B0(string)) {
                                hh.a aVar = hh.g.f17610d;
                                g.a.b(2, new ug.o(mVar), 2);
                            }
                            mVar.c(di.k.d(string).getTime(), key3);
                        } catch (Exception e10) {
                            hh.a aVar2 = hh.g.f17610d;
                            g.a.a(1, e10, new ug.p(mVar));
                        }
                    }
                }
            }
        }
        if (z10) {
            cVar.b();
        }
        return cVar;
    }

    public static com.google.android.gms.internal.p000firebaseauthapi.s x(fd.m mVar) {
        String str = mVar.f14964z;
        if (!TextUtils.isEmpty(str)) {
            boolean z10 = mVar.f14963y;
            com.google.android.gms.internal.p000firebaseauthapi.s sVar = new com.google.android.gms.internal.p000firebaseauthapi.s();
            String str2 = mVar.f14962x;
            v9.o.e(str2);
            sVar.f8114u = str2;
            v9.o.e(str);
            sVar.f8118y = str;
            sVar.f8116w = z10;
            return sVar;
        }
        boolean z11 = mVar.f14963y;
        com.google.android.gms.internal.p000firebaseauthapi.s sVar2 = new com.google.android.gms.internal.p000firebaseauthapi.s();
        String str3 = mVar.f14959u;
        v9.o.e(str3);
        sVar2.f8115v = str3;
        String str4 = mVar.f14960v;
        v9.o.e(str4);
        sVar2.f8117x = str4;
        sVar2.f8116w = z11;
        return sVar2;
    }

    public static t5 y(sa saVar) {
        if (saVar.y() == 3) {
            return new q5(16);
        }
        if (saVar.y() == 4) {
            return new q5(32);
        }
        if (saVar.y() == 5) {
            return new r5();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static String z() {
        Locale locale = Locale.getDefault();
        StringBuilder sb2 = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb2.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb2.append("-");
                sb2.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb2.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb2.append("-");
                    sb2.append(country2);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044f  */
    @Override // bg.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        int i11;
        byte[] bArr;
        int i12;
        dg.a aVar2;
        boolean z10;
        int i13;
        int i14;
        int i15;
        dg.a y10;
        int i16;
        int i17;
        int i18;
        Charset charset = StandardCharsets.ISO_8859_1;
        if (map != null) {
            bg.c cVar = bg.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset = Charset.forName(map.get(cVar).toString());
            }
            bg.c cVar2 = bg.c.ERROR_CORRECTION;
            r2 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            bg.c cVar3 = bg.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i11 = Integer.parseInt(map.get(cVar3).toString());
                if (aVar != bg.a.AZTEC) {
                    cg.d dVar = new cg.d(str.getBytes(charset));
                    List<cg.f> singletonList = Collections.singletonList(cg.f.f5278e);
                    int i19 = 0;
                    while (true) {
                        bArr = dVar.f5275a;
                        int i20 = 4;
                        int i21 = 2;
                        if (i19 >= bArr.length) {
                            break;
                        }
                        int i22 = i19 + 1;
                        byte b10 = i22 < bArr.length ? bArr[i22] : (byte) 0;
                        byte b11 = bArr[i19];
                        if (b11 == 13) {
                            if (b10 == 10) {
                                i17 = 2;
                            }
                            i17 = 0;
                        } else if (b11 == 44) {
                            if (b10 == 32) {
                                i17 = 4;
                            }
                            i17 = 0;
                        } else if (b11 != 46) {
                            if (b11 == 58 && b10 == 32) {
                                i17 = 5;
                            }
                            i17 = 0;
                        } else {
                            if (b10 == 32) {
                                i17 = 3;
                            }
                            i17 = 0;
                        }
                        if (i17 > 0) {
                            LinkedList linkedList = new LinkedList();
                            for (cg.f fVar : singletonList) {
                                cg.f b12 = fVar.b(i19);
                                linkedList.add(b12.d(4, i17));
                                if (fVar.f5279a != 4) {
                                    linkedList.add(b12.e(4, i17));
                                }
                                if (i17 == 3 || i17 == 4) {
                                    linkedList.add(b12.d(2, 16 - i17).d(2, 1));
                                }
                                if (fVar.f5281c > 0) {
                                    linkedList.add(fVar.a(i19).a(i22));
                                }
                            }
                            singletonList = cg.d.a(linkedList);
                            i19 = i22;
                        } else {
                            LinkedList linkedList2 = new LinkedList();
                            for (cg.f fVar2 : singletonList) {
                                char c10 = (char) (bArr[i19] & 255);
                                int i23 = fVar2.f5279a;
                                int[][] iArr = cg.d.f5273d;
                                boolean z11 = iArr[i23][c10] > 0;
                                int i24 = 0;
                                cg.f fVar3 = null;
                                while (true) {
                                    i18 = fVar2.f5279a;
                                    if (i24 > i20) {
                                        break;
                                    }
                                    int i25 = iArr[i24][c10];
                                    if (i25 > 0) {
                                        if (fVar3 == null) {
                                            fVar3 = fVar2.b(i19);
                                        }
                                        if (!z11 || i24 == i18 || i24 == i21) {
                                            linkedList2.add(fVar3.d(i24, i25));
                                        }
                                        if (!z11 && cg.d.f5274e[i18][i24] >= 0) {
                                            linkedList2.add(fVar3.e(i24, i25));
                                        }
                                    }
                                    i24++;
                                    i20 = 4;
                                    i21 = 2;
                                }
                                if (fVar2.f5281c > 0 || iArr[i18][c10] == 0) {
                                    linkedList2.add(fVar2.a(i19));
                                }
                                i20 = 4;
                                i21 = 2;
                            }
                            singletonList = cg.d.a(linkedList2);
                        }
                        i19++;
                    }
                    cg.f fVar4 = (cg.f) Collections.min(singletonList, new cg.c());
                    fVar4.getClass();
                    LinkedList<cg.g> linkedList3 = new LinkedList();
                    for (cg.g gVar = fVar4.b(bArr.length).f5280b; gVar != null; gVar = gVar.f5284a) {
                        linkedList3.addFirst(gVar);
                    }
                    dg.a aVar3 = new dg.a();
                    for (cg.g gVar2 : linkedList3) {
                        gVar2.a(aVar3, bArr);
                    }
                    int i26 = aVar3.f12845v;
                    int b13 = pl.a.b(r2, i26, 100, 11);
                    int i27 = i26 + b13;
                    int[] iArr2 = hc.d.D;
                    if (i11 != 0) {
                        z10 = i11 < 0;
                        i14 = Math.abs(i11);
                        if (i14 <= (z10 ? 4 : 32)) {
                            i15 = ((z10 ? 88 : com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (i14 << 4)) * i14;
                            i13 = iArr2[i14];
                            int i28 = i15 - (i15 % i13);
                            aVar2 = hc.d.h0(i13, aVar3);
                            int i29 = aVar2.f12845v;
                            if (b13 + i29 > i28) {
                                throw new IllegalArgumentException("Data to large for user specified layer");
                            }
                            if (z10 && i29 > (i13 << 6)) {
                                throw new IllegalArgumentException("Data to large for user specified layer");
                            }
                        } else {
                            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
                        }
                    } else {
                        dg.a aVar4 = null;
                        int i30 = 0;
                        int i31 = 0;
                        while (i30 <= i12) {
                            boolean z12 = i30 <= 3;
                            int i32 = z12 ? i30 + 1 : i30;
                            int i33 = ((z12 ? 88 : com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (i32 << 4)) * i32;
                            if (i27 <= i33) {
                                if (aVar4 == null || i31 != iArr2[i32]) {
                                    int i34 = iArr2[i32];
                                    i31 = i34;
                                    aVar4 = hc.d.h0(i34, aVar3);
                                }
                                int i35 = i33 - (i33 % i31);
                                if ((!z12 || aVar4.f12845v <= (i31 << 6)) && aVar4.f12845v + b13 <= i35) {
                                    aVar2 = aVar4;
                                    z10 = z12;
                                    i13 = i31;
                                    i14 = i32;
                                    i15 = i33;
                                }
                            }
                            i30++;
                            i12 = 32;
                        }
                        throw new IllegalArgumentException("Data too large for an Aztec code");
                    }
                    dg.a y11 = hc.d.y(aVar2, i15, i13);
                    int i36 = aVar2.f12845v / i13;
                    dg.a aVar5 = new dg.a();
                    if (z10) {
                        aVar5.b(i14 - 1, 2);
                        aVar5.b(i36 - 1, 6);
                        y10 = hc.d.y(aVar5, 28, 4);
                    } else {
                        aVar5.b(i14 - 1, 5);
                        aVar5.b(i36 - 1, 11);
                        y10 = hc.d.y(aVar5, 40, 4);
                    }
                    int i37 = (z10 ? 11 : 14) + (i14 << 2);
                    int[] iArr3 = new int[i37];
                    if (z10) {
                        for (int i38 = 0; i38 < i37; i38++) {
                            iArr3[i38] = i38;
                        }
                        i16 = i37;
                    } else {
                        int i39 = i37 / 2;
                        i16 = (((i39 - 1) / 15) * 2) + i37 + 1;
                        int i40 = i16 / 2;
                        for (int i41 = 0; i41 < i39; i41++) {
                            int i42 = (i41 / 15) + i41;
                            iArr3[(i39 - i41) - 1] = (i40 - i42) - 1;
                            iArr3[i39 + i41] = i42 + i40 + 1;
                        }
                    }
                    dg.b bVar = new dg.b(i16, i16);
                    int i43 = 0;
                    for (int i44 = 0; i44 < i14; i44++) {
                        int i45 = ((i14 - i44) << 2) + (z10 ? 9 : 12);
                        for (int i46 = 0; i46 < i45; i46++) {
                            int i47 = i46 << 1;
                            for (int i48 = 0; i48 < 2; i48++) {
                                if (y11.d(i43 + i47 + i48)) {
                                    int i49 = i44 << 1;
                                    bVar.b(iArr3[i49 + i48], iArr3[i49 + i46]);
                                }
                                if (y11.d((i45 << 1) + i43 + i47 + i48)) {
                                    int i50 = i44 << 1;
                                    bVar.b(iArr3[i50 + i46], iArr3[((i37 - 1) - i50) - i48]);
                                }
                                if (y11.d((i45 << 2) + i43 + i47 + i48)) {
                                    int i51 = (i37 - 1) - (i44 << 1);
                                    bVar.b(iArr3[i51 - i48], iArr3[i51 - i46]);
                                }
                                if (y11.d((i45 * 6) + i43 + i47 + i48)) {
                                    int i52 = i44 << 1;
                                    bVar.b(iArr3[((i37 - 1) - i52) - i46], iArr3[i52 + i48]);
                                }
                            }
                        }
                        i43 += i45 << 3;
                    }
                    int i53 = i16 / 2;
                    if (z10) {
                        for (int i54 = 0; i54 < 7; i54++) {
                            int i55 = (i53 - 3) + i54;
                            if (y10.d(i54)) {
                                bVar.b(i55, i53 - 5);
                            }
                            if (y10.d(i54 + 7)) {
                                bVar.b(i53 + 5, i55);
                            }
                            if (y10.d(20 - i54)) {
                                bVar.b(i55, i53 + 5);
                            }
                            if (y10.d(27 - i54)) {
                                bVar.b(i53 - 5, i55);
                            }
                        }
                    } else {
                        for (int i56 = 0; i56 < 10; i56++) {
                            int i57 = (i56 / 5) + (i53 - 5) + i56;
                            if (y10.d(i56)) {
                                bVar.b(i57, i53 - 7);
                            }
                            if (y10.d(i56 + 10)) {
                                bVar.b(i53 + 7, i57);
                            }
                            if (y10.d(29 - i56)) {
                                bVar.b(i57, i53 + 7);
                            }
                            if (y10.d(39 - i56)) {
                                bVar.b(i53 - 7, i57);
                            }
                        }
                    }
                    if (z10) {
                        hc.d.r(bVar, i53, 5);
                    } else {
                        hc.d.r(bVar, i53, 7);
                        int i58 = 0;
                        int i59 = 0;
                        while (i58 < (i37 / 2) - 1) {
                            for (int i60 = i53 & 1; i60 < i16; i60 += 2) {
                                int i61 = i53 - i59;
                                bVar.b(i61, i60);
                                int i62 = i53 + i59;
                                bVar.b(i62, i60);
                                bVar.b(i60, i61);
                                bVar.b(i60, i62);
                            }
                            i58 += 15;
                            i59 += 16;
                        }
                    }
                    int i63 = bVar.f12846u;
                    int max = Math.max(i6, i63);
                    int i64 = bVar.f12847v;
                    int max2 = Math.max(i10, i64);
                    int min = Math.min(max / i63, max2 / i64);
                    int i65 = (max - (i63 * min)) / 2;
                    int i66 = (max2 - (i64 * min)) / 2;
                    dg.b bVar2 = new dg.b(max, max2);
                    int i67 = 0;
                    while (i67 < i64) {
                        int i68 = 0;
                        int i69 = i65;
                        while (i68 < i63) {
                            if (bVar.a(i68, i67)) {
                                bVar2.c(i69, i66, min, min);
                            }
                            i68++;
                            i69 += min;
                        }
                        i67++;
                        i66 += min;
                    }
                    return bVar2;
                }
                throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
            }
        }
        i11 = 0;
        if (aVar != bg.a.AZTEC) {
        }
    }

    @Override // k3.a0
    public Object W(l3.c cVar, float f) {
        boolean z10 = true;
        if (cVar.J() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.a();
        }
        double s10 = cVar.s();
        double s11 = cVar.s();
        double s12 = cVar.s();
        double s13 = cVar.s();
        if (z10) {
            cVar.g();
        }
        if (s10 <= 1.0d && s11 <= 1.0d && s12 <= 1.0d && s13 <= 1.0d) {
            s10 *= 255.0d;
            s11 *= 255.0d;
            s12 *= 255.0d;
            s13 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) s13, (int) s10, (int) s11, (int) s12));
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().s());
    }

    @Override // lv.n
    public List b(String hostname) {
        kotlin.jvm.internal.i.g(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            kotlin.jvm.internal.i.f(allByName, "getAllByName(hostname)");
            return is.k.i2(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(kotlin.jvm.internal.i.n(hostname, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    @Override // fg.b
    public void c(fg.c cVar) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!cVar.c()) {
                break;
            }
            sb2.append(cVar.b());
            int i6 = cVar.f + 1;
            cVar.f = i6;
            if (ca.a.U0(cVar.f15031a, i6, 5) != 5) {
                cVar.f15036g = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int a10 = cVar.a() + length + 1;
        cVar.d(a10);
        if (cVar.f15037h.f15045b - a10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cVar.c() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            int a11 = (((cVar.a() + 1) * 149) % 255) + 1 + sb2.charAt(i10);
            if (a11 > 255) {
                a11 -= 256;
            }
            cVar.e((char) a11);
        }
    }

    @Override // b2.c.InterfaceC0074c
    public b2.c d(c.b bVar) {
        return new c2.c(bVar.f3938a, bVar.f3939b, bVar.f3940c, bVar.f3941d, bVar.f3942e);
    }

    @Override // u3.h
    public q3.b e(u3.b amplitude) {
        kotlin.jvm.internal.i.g(amplitude, "amplitude");
        o3.e eVar = (o3.e) amplitude.f33766a;
        return new q3.b(eVar.f27015c, eVar.f33786a);
    }

    @Override // ya.g
    public ya.h h(Object obj) {
        Void r12 = (Void) obj;
        return ya.k.e(Boolean.TRUE);
    }

    @Override // uf.l
    public Object i() {
        return new TreeSet();
    }

    @Override // dv.b.InterfaceC0206b
    public Iterable m(Object obj) {
        Collection<wu.b0> c10 = ((gt.e) obj).l().c();
        kotlin.jvm.internal.i.f(c10, "it.typeConstructor.supertypes");
        return new fv.q(fv.t.H0(is.u.X1(c10), tt.v.f33694u));
    }

    @Override // h4.d
    public boolean o(Object obj, File file, h4.g gVar) {
        try {
            d5.a.b(((GifDrawable) ((k4.v) obj).get()).f5980u.f5986a.f5987a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void p(a.e eVar, Object obj) {
        p9.b bVar = k9.f0.G;
        p9.e eVar2 = (p9.e) ((p9.z) eVar).y();
        eVar2.S1(eVar2.z(), 19);
        ((ya.i) obj).b(Boolean.TRUE);
    }

    public void u(s.a aVar, float f) {
        float f2;
        CardView.a aVar2 = (CardView.a) aVar;
        s.b bVar = (s.b) aVar2.f1591a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        CardView cardView = CardView.this;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != bVar.f31056e || bVar.f != useCompatPadding || bVar.f31057g != preventCornerOverlap) {
            bVar.f31056e = f;
            bVar.f = useCompatPadding;
            bVar.f31057g = preventCornerOverlap;
            bVar.c(null);
            bVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar2.f1591a;
        float f10 = ((s.b) drawable).f31056e;
        float f11 = ((s.b) drawable).f31052a;
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - s.c.f31062a) * f11) + f10);
        } else {
            int i6 = s.c.f31063b;
            f2 = f10;
        }
        int ceil = (int) Math.ceil(f2);
        int ceil2 = (int) Math.ceil(s.c.a(f10, f11, cardView.getPreventCornerOverlap()));
        aVar2.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // h4.j
    public h4.c v(h4.g gVar) {
        return h4.c.SOURCE;
    }

    public /* synthetic */ r(Object obj) {
    }

    public /* synthetic */ r(int i6) {
        Object obj = h4.f;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // je.x
    public void run() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i6) {
    }
}
