package ug;

import android.content.Context;
import android.location.Location;
import com.theinnerhour.b2b.R;
import h5.g0;
import hh.g;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import w5.l;
/* compiled from: DataUtils.kt */
/* loaded from: classes.dex */
public final class l implements v9.n {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f34119a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f34120b = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollColor, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f34121c = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f34122d = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeRadius, R.attr.badgeTextColor, R.attr.badgeWidePadding, R.attr.badgeWithTextRadius, R.attr.horizontalOffset, R.attr.horizontalOffsetWithText, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset, R.attr.verticalOffsetWithText};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f34123e = {16843072, R.attr.compatShadowEnabled, R.attr.itemHorizontalTranslationEnabled};
    public static final int[] f = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_significantVelocityThreshold, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.shouldRemoveExpandedCorners};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f34124g = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f34125h = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f34126i = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f34127j = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f34128k = {R.attr.collapsedTitleGravity, R.attr.collapsedTitleTextAppearance, R.attr.collapsedTitleTextColor, R.attr.contentScrim, R.attr.expandedTitleGravity, R.attr.expandedTitleMargin, R.attr.expandedTitleMarginBottom, R.attr.expandedTitleMarginEnd, R.attr.expandedTitleMarginStart, R.attr.expandedTitleMarginTop, R.attr.expandedTitleTextAppearance, R.attr.expandedTitleTextColor, R.attr.extraMultilineHeightEnabled, R.attr.forceApplySystemWindowInsetTop, R.attr.maxLines, R.attr.scrimAnimationDuration, R.attr.scrimVisibleHeightTrigger, R.attr.statusBarScrim, R.attr.title, R.attr.titleCollapseMode, R.attr.titleEnabled, R.attr.titlePositionInterpolator, R.attr.titleTextEllipsize, R.attr.toolbarId};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f34129l = {R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f34130m = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f34131n = {16842766, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.borderWidth, R.attr.elevation, R.attr.ensureMinTouchTargetSize, R.attr.fabCustomSize, R.attr.fabSize, R.attr.hideMotionSpec, R.attr.hoveredFocusedTranslationZ, R.attr.maxImageSize, R.attr.pressedTranslationZ, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.useCompatPadding};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f34132o = {R.attr.behavior_autoHide};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f34133p = {R.attr.itemSpacing, R.attr.lineSpacing};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f34134q = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] r = {16843296, 16843916, R.attr.simpleItemLayout, R.attr.simpleItemSelectedColor, R.attr.simpleItemSelectedRippleColor, R.attr.simpleItems};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f34135s = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth, R.attr.toggleCheckedStateOnClick};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f34136t = {16842766, R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f34137u = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f34138v = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f34139w = {16843015, R.attr.buttonCompat, R.attr.buttonIcon, R.attr.buttonIconTint, R.attr.buttonIconTintMode, R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.checkedState, R.attr.errorAccessibilityLabel, R.attr.errorShown, R.attr.useMaterialThemeColors};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f34140x = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f34141y = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f34142z = {16843958, 16844159, R.attr.lineHeight};
    public static final int[] A = {16842804, 16844159, R.attr.lineHeight};
    public static final int[] B = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};
    public static final int[] C = {16843093, 16843097, 16843173, R.attr.marginHorizontal, R.attr.shapeAppearance};
    public static final int[] D = {R.attr.backgroundTint, R.attr.elevation, R.attr.itemActiveIndicatorStyle, R.attr.itemBackground, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemPaddingBottom, R.attr.itemPaddingTop, R.attr.itemRippleColor, R.attr.itemTextAppearanceActive, R.attr.itemTextAppearanceInactive, R.attr.itemTextColor, R.attr.labelVisibilityMode, R.attr.menu};
    public static final int[] E = {16842931, 16842964, 16842973, 16843039, R.attr.bottomInsetScrimEnabled, R.attr.dividerInsetEnd, R.attr.dividerInsetStart, R.attr.drawerLayoutCornerSize, R.attr.elevation, R.attr.headerLayout, R.attr.itemBackground, R.attr.itemHorizontalPadding, R.attr.itemIconPadding, R.attr.itemIconSize, R.attr.itemIconTint, R.attr.itemMaxLines, R.attr.itemRippleColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemShapeFillColor, R.attr.itemShapeInsetBottom, R.attr.itemShapeInsetEnd, R.attr.itemShapeInsetStart, R.attr.itemShapeInsetTop, R.attr.itemTextAppearance, R.attr.itemTextColor, R.attr.itemVerticalPadding, R.attr.menu, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.subheaderColor, R.attr.subheaderInsetEnd, R.attr.subheaderInsetStart, R.attr.subheaderTextAppearance, R.attr.topInsetScrimEnabled};
    public static final int[] F = {R.attr.materialCircleRadius};
    public static final int[] G = {R.attr.insetForeground};
    public static final int[] H = {R.attr.behavior_overlapTop};
    public static final int[] I = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] J = {R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingEnd, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingStart, R.attr.contentPaddingTop, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] K = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.coplanarSiblingViewId, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] L = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] M = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextAppearance, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};
    public static final int[] N = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] O = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] P = {16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMinSize, R.attr.endIconMode, R.attr.endIconScaleType, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorAccessibilityLiveRegion, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconMinSize, R.attr.startIconScaleType, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] Q = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public static final int b(Object attribute) {
        boolean z10;
        kotlin.jvm.internal.i.g(attribute, "attribute");
        if (attribute instanceof Date) {
            return 2;
        }
        if (attribute instanceof Location) {
            z10 = true;
        } else {
            z10 = attribute instanceof fi.c;
        }
        if (z10) {
            return 3;
        }
        return 1;
    }

    public static final void c(Throwable th2) {
        HashMap hashMap;
        l.b feature;
        if (f34119a && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            kotlin.jvm.internal.i.f(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                w5.l lVar = w5.l.f36497a;
                String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.i.f(className, "it.className");
                synchronized (w5.l.f36497a) {
                    hashMap = w5.l.f36498b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(l.b.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(l.b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(l.b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(l.b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(l.b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(l.b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(l.b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(l.b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(l.b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(l.b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(l.b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(l.b.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(l.b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        feature = (l.b) entry.getKey();
                        String[] strArr = (String[]) entry.getValue();
                        int length = strArr.length;
                        int i6 = 0;
                        while (i6 < length) {
                            String str = strArr[i6];
                            i6++;
                            if (gv.n.H0(className, str)) {
                                break;
                            }
                        }
                    } else {
                        feature = l.b.Unknown;
                        break;
                    }
                }
                if (feature != l.b.Unknown) {
                    w5.l lVar2 = w5.l.f36497a;
                    kotlin.jvm.internal.i.g(feature, "feature");
                    h5.p.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(kotlin.jvm.internal.i.n(feature, "FBSDKFeature"), "16.0.1").apply();
                    hashSet.add(feature.toString());
                }
            }
            h5.p pVar = h5.p.f17269a;
            if (g0.b() && (!hashSet.isEmpty())) {
                new y5.a(new JSONArray((Collection) hashSet)).c();
            }
        }
    }

    public static final long d(LinkedHashMap sdkInstances) {
        kotlin.jvm.internal.i.g(sdkInstances, "sdkInstances");
        w wVar = new w();
        for (ih.p pVar : sdkInstances.values()) {
            long j10 = wVar.f23468u;
            pVar.f20103b.f12862i.getClass();
            wVar.f23468u = Math.max(j10, Math.max(-1L, pVar.f20104c.f33012c.f28427b));
        }
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new k(wVar), 3);
        return wVar.f23468u;
    }

    public static final boolean e(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        qg.w.f29578a.getClass();
        uh.b f2 = qg.w.f(context, sdkInstance);
        if (sdkInstance.f20104c.f33010a && f2.d() && !f2.Q().f20083a) {
            return true;
        }
        return false;
    }

    public static final void f(Context context, ih.i iVar, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        mh.c cVar = new mh.c(-1L, iVar.f20090c, iVar.f20091d);
        qg.w.f29578a.getClass();
        qg.w.f(context, sdkInstance).f34156b.d0(cVar);
    }

    @Override // v9.n
    public /* bridge */ /* synthetic */ Object a(t9.c cVar) {
        return null;
    }
}
