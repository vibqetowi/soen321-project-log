package kc;

import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.v1;
import androidx.core.content.FileProvider;
import androidx.lifecycle.l0;
import androidx.work.d;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.u;
import c9.l;
import c9.w;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.p000firebaseauthapi.c7;
import com.google.android.gms.internal.p000firebaseauthapi.h8;
import com.google.android.gms.internal.p000firebaseauthapi.i6;
import com.google.android.gms.internal.p000firebaseauthapi.j7;
import com.google.android.gms.internal.p000firebaseauthapi.m7;
import com.google.android.gms.internal.p000firebaseauthapi.n7;
import com.google.android.gms.internal.p000firebaseauthapi.nc;
import com.google.android.gms.internal.p000firebaseauthapi.o7;
import com.google.android.gms.internal.p000firebaseauthapi.p7;
import com.google.android.gms.internal.p000firebaseauthapi.r0;
import com.google.android.gms.internal.p000firebaseauthapi.y6;
import com.google.android.gms.internal.p000firebaseauthapi.zzadn;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.R;
import g.x;
import gt.v0;
import is.q;
import is.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k3.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r1;
import qg.g0;
import s1.a0;
import s1.b0;
import ta.h2;
import ta.j2;
import uf.l;
import v2.s;
import wu.d1;
import wu.i0;
import wu.j1;
import wu.m1;
import wu.n1;
import wu.o;
import wu.w0;
import wu.x0;
import yt.m;
import zu.m;
import zu.n;
import zu.p;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class f implements i6, hd.e, a0, ValueEventListener, r3.a, h2, l {

    /* renamed from: u  reason: collision with root package name */
    public static q.f f23231u;

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f23232v = new byte[0];

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ f f23233w = new f();

    /* renamed from: x  reason: collision with root package name */
    public static final k7 f23234x = new k7();

    /* renamed from: y  reason: collision with root package name */
    public static final l7 f23235y = new l7();

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f23236z = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};
    public static final int[] A = {16842931};
    public static final int[] B = {16843071};
    public static final int[] C = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};
    public static final int[] D = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};
    public static final int[] E = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
    public static final int[] F = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};
    public static final int[] G = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
    public static final int[] H = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] I = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};
    public static final int[] J = {R.attr.allowStacking};
    public static final int[] K = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
    public static final int[] L = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] M = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
    public static final int[] N = {16843436, 16843437};
    public static final int[] O = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
    public static final int[] P = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] Q = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] R = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] S = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] T = {16842804, 16842970, 16843039, 16843087, 16843088, 16843296, 16843364, R.attr.animateMenuItems, R.attr.animateNavigationIcon, R.attr.autoShowKeyboard, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.headerLayout, R.attr.hideNavigationIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.searchPrefixText, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.useDrawerArrowDrawable, R.attr.voiceIcon};
    public static final int[] U = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] V = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};
    public static final int[] W = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] X = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] Y = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] Z = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f23213a0 = {16842960, 16842994, 16842995};

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ f f23214b0 = new f();
    public static final f c0 = new f();

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f23215d0 = {R.attr.shimmer_auto_start, R.attr.shimmer_base_alpha, R.attr.shimmer_base_color, R.attr.shimmer_clip_to_children, R.attr.shimmer_colored, R.attr.shimmer_direction, R.attr.shimmer_dropoff, R.attr.shimmer_duration, R.attr.shimmer_fixed_height, R.attr.shimmer_fixed_width, R.attr.shimmer_height_ratio, R.attr.shimmer_highlight_alpha, R.attr.shimmer_highlight_color, R.attr.shimmer_intensity, R.attr.shimmer_repeat_count, R.attr.shimmer_repeat_delay, R.attr.shimmer_repeat_mode, R.attr.shimmer_shape, R.attr.shimmer_tilt, R.attr.shimmer_width_ratio};
    public static final f e0 = new f();

    /* renamed from: f0  reason: collision with root package name */
    public static final Object[] f23216f0 = new Object[0];

    /* renamed from: g0  reason: collision with root package name */
    public static final r f23217g0 = new r("NO_VALUE");

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f23218h0 = {R.attr.castAdBreakMarkerColor, R.attr.castAdInProgressLabelTextAppearance, R.attr.castAdInProgressText, R.attr.castAdInProgressTextColor, R.attr.castAdLabelColor, R.attr.castAdLabelTextAppearance, R.attr.castAdLabelTextColor, R.attr.castButtonColor, R.attr.castClosedCaptionsButtonDrawable, R.attr.castControlButtons, R.attr.castDefaultAdPosterUrl, R.attr.castExpandedControllerLoadingIndicatorColor, R.attr.castForward30ButtonDrawable, R.attr.castLiveIndicatorColor, R.attr.castMuteToggleButtonDrawable, R.attr.castPauseButtonDrawable, R.attr.castPlayButtonDrawable, R.attr.castRewind30ButtonDrawable, R.attr.castSeekBarProgressAndThumbColor, R.attr.castSeekBarProgressDrawable, R.attr.castSeekBarSecondaryProgressColor, R.attr.castSeekBarThumbDrawable, R.attr.castSeekBarTooltipBackgroundColor, R.attr.castSeekBarUnseekableProgressColor, R.attr.castSkipNextButtonDrawable, R.attr.castSkipPreviousButtonDrawable, R.attr.castStopButtonDrawable};

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f23219i0 = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive, R.attr.popUpToSaveState, R.attr.restoreState};

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f23220j0 = {16842755, 16843245, R.attr.argType, R.attr.nullable};

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f23221k0 = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};

    /* renamed from: l0  reason: collision with root package name */
    public static final int[] f23222l0 = {R.attr.startDestination};

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f23223m0 = {16842753, 16842960, R.attr.route};

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ f f23224n0 = new f();

    /* renamed from: o0  reason: collision with root package name */
    public static final String[] f23225o0 = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};

    /* renamed from: p0  reason: collision with root package name */
    public static final String[] f23226p0 = {"ad_impression"};

    /* renamed from: q0  reason: collision with root package name */
    public static final String[] f23227q0 = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};

    /* renamed from: r0  reason: collision with root package name */
    public static final String[] f23228r0 = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: s0  reason: collision with root package name */
    public static final f f23229s0 = new f();

    /* renamed from: t0  reason: collision with root package name */
    public static final f f23230t0 = new f();

    public static void A(int i6, String str, String str2, Object... objArr) {
        if (i6 != 0) {
            int i10 = i6 - 1;
            if (i10 >= 1) {
                String str3 = String.format("(%s) [%s]: ", "24.4.4", str) + String.format(str2, objArr);
                if (i6 != 0) {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                throw new IllegalStateException("Trying to log something on level NONE");
                            }
                            return;
                        }
                        Log.w("Firestore", str3);
                        return;
                    }
                    Log.i("Firestore", str3);
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    public static void B() {
        if (w.f5205a >= 18) {
            Trace.endSection();
        }
    }

    public static boolean C(w0 state, zu.h a10, zu.h b10) {
        kotlin.jvm.internal.i.g(state, "state");
        kotlin.jvm.internal.i.g(a10, "a");
        kotlin.jvm.internal.i.g(b10, "b");
        if (a10 == b10) {
            return true;
        }
        f fVar = f23229s0;
        n nVar = state.f37304c;
        if (K(nVar, a10) && K(nVar, b10)) {
            androidx.work.k kVar = state.f37306e;
            zu.h d10 = state.d(kVar.y(a10));
            zu.h d11 = state.d(kVar.y(b10));
            zu.i o02 = nVar.o0(d10);
            if (!nVar.G(nVar.F(d10), nVar.F(d11))) {
                return false;
            }
            if (nVar.I(o02) == 0) {
                if (nVar.R(d10) || nVar.R(d11) || nVar.D(o02) == nVar.D(nVar.o0(d11))) {
                    return true;
                }
                return false;
            }
        }
        if (M(fVar, state, a10, b10) && M(fVar, state, b10, a10)) {
            return true;
        }
        return false;
    }

    public static String D(Context context) {
        if (i5.i.a() == null) {
            synchronized (i5.i.c()) {
                if (i5.i.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!b6.a.b(i5.i.class)) {
                        i5.i.f19863e = string;
                    }
                    if (i5.i.a() == null) {
                        UUID randomUUID = UUID.randomUUID();
                        kotlin.jvm.internal.i.f(randomUUID, "randomUUID()");
                        String n10 = kotlin.jvm.internal.i.n(randomUUID, "XZ");
                        if (!b6.a.b(i5.i.class)) {
                            i5.i.f19863e = n10;
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", i5.i.a()).apply();
                    }
                }
                hs.k kVar = hs.k.f19476a;
            }
        }
        String a10 = i5.i.a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static m F(n nVar, zu.h hVar, zu.i iVar) {
        m1 w10;
        int I2 = nVar.I(hVar);
        int i6 = 0;
        while (true) {
            zu.k kVar = null;
            if (i6 >= I2) {
                return null;
            }
            zu.k T2 = nVar.T(hVar, i6);
            boolean z10 = true;
            if (!nVar.A(T2)) {
                kVar = T2;
            }
            if (kVar != null && (w10 = nVar.w(kVar)) != null) {
                z10 = (nVar.p(nVar.o0(w10)) && nVar.p(nVar.o0(iVar))) ? false : false;
                if (kotlin.jvm.internal.i.b(w10, iVar) || (z10 && kotlin.jvm.internal.i.b(nVar.F(w10), nVar.F(iVar)))) {
                    break;
                }
                m F2 = F(nVar, w10, iVar);
                if (F2 != null) {
                    return F2;
                }
            }
            i6++;
        }
        return nVar.n0(nVar.F(hVar), i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x005a, B:26:0x0083, B:31:0x00af, B:35:0x00c9, B:32:0x00bb, B:34:0x00c6), top: B:62:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x005a, B:26:0x0083, B:31:0x00af, B:35:0x00c9, B:32:0x00bb, B:34:0x00c6), top: B:62:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[Catch: Exception -> 0x00fd, TRY_ENTER, TryCatch #2 {Exception -> 0x00fd, blocks: (B:7:0x002b, B:12:0x006b, B:37:0x00e7, B:39:0x00ec, B:44:0x00f4, B:46:0x00f9, B:47:0x00fc), top: B:63:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec A[Catch: Exception -> 0x00fd, TryCatch #2 {Exception -> 0x00fd, blocks: (B:7:0x002b, B:12:0x006b, B:37:0x00e7, B:39:0x00ec, B:44:0x00f4, B:46:0x00f9, B:47:0x00fc), top: B:63:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4 A[Catch: Exception -> 0x00fd, TryCatch #2 {Exception -> 0x00fd, blocks: (B:7:0x002b, B:12:0x006b, B:37:0x00e7, B:39:0x00ec, B:44:0x00f4, B:46:0x00f9, B:47:0x00fc), top: B:63:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[Catch: Exception -> 0x00fd, TryCatch #2 {Exception -> 0x00fd, blocks: (B:7:0x002b, B:12:0x006b, B:37:0x00e7, B:39:0x00ec, B:44:0x00f4, B:46:0x00f9, B:47:0x00fc), top: B:63:0x002b }] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.FileInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri G(Context context, File file) {
        File externalCacheDir;
        OutputStream outputStream;
        ?? r72;
        String str;
        FileOutputStream fileOutputStream;
        Exception e10;
        boolean z10;
        Path path;
        String str2 = context.getPackageName() + ".cropper.fileprovider";
        try {
            Log.i("CropLibGetUri", "Try get URI for scope storage - content://");
            Uri b10 = FileProvider.b(context, str2, file);
            kotlin.jvm.internal.i.f(b10, "FileProvider.getUriForFi…context, authority, file)");
            return b10;
        } catch (Exception e11) {
            boolean z11 = true;
            try {
                Log.e("CropLibGetUri", String.valueOf(e11.getMessage()));
                Log.w("CropLibGetUri", "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices");
                File file2 = new File(context.getCacheDir(), "CROP_LIB_CACHE");
                String name = file.getName();
                File file3 = new File(file2, name);
                ?? r32 = null;
                try {
                    try {
                        r72 = new FileInputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                        str = name;
                    }
                } catch (Exception e12) {
                    e = e12;
                    r72 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                    if (r32 != null) {
                        r32.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
                try {
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        ca.a.J(r72, fileOutputStream);
                        Log.i("CropLibGetUri", "Completed Android N+ file copy. Attempting to return the cached file");
                        Uri b11 = FileProvider.b(context, str2, file3);
                        kotlin.jvm.internal.i.f(b11, "FileProvider.getUriForFi…authority, cacheLocation)");
                        r72.close();
                        fileOutputStream.close();
                        return b11;
                    } catch (Exception e13) {
                        e10 = e13;
                        Log.e("CropLibGetUri", String.valueOf(e10.getMessage()));
                        Log.i("CropLibGetUri", "Trying to provide URI manually");
                        String str3 = "content://" + str2 + "/files/my_images/";
                        if (Build.VERSION.SDK_INT < 26) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            path = Paths.get(str3, new String[0]);
                            Files.createDirectories(path, new FileAttribute[0]);
                        } else {
                            File file4 = new File(str3);
                            if (!file4.exists()) {
                                file4.mkdirs();
                            }
                        }
                        Uri parse = Uri.parse(str3 + file.getName());
                        kotlin.jvm.internal.i.f(parse, "Uri.parse(\"$path${file.name}\")");
                        if (r72 != 0) {
                            r72.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return parse;
                    }
                } catch (Exception e14) {
                    e = e14;
                    fileOutputStream = null;
                    e10 = e;
                    Log.e("CropLibGetUri", String.valueOf(e10.getMessage()));
                    Log.i("CropLibGetUri", "Trying to provide URI manually");
                    String str32 = "content://" + str2 + "/files/my_images/";
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if (!z10) {
                    }
                    Uri parse2 = Uri.parse(str32 + file.getName());
                    kotlin.jvm.internal.i.f(parse2, "Uri.parse(\"$path${file.name}\")");
                    if (r72 != 0) {
                    }
                    if (fileOutputStream != null) {
                    }
                    return parse2;
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                    str = r72;
                    r32 = str;
                    if (r32 != null) {
                    }
                    if (outputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e15) {
                Log.e("CropLibGetUri", String.valueOf(e15.getMessage()));
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                if (!z11 && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Log.i("CropLibGetUri", "Use External storage, do not work for OS 29 and above");
                        Uri fromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        kotlin.jvm.internal.i.f(fromFile, "Uri.fromFile(File(cacheD…path, file.absolutePath))");
                        return fromFile;
                    } catch (Exception e16) {
                        Log.e("CropLibGetUri", String.valueOf(e16.getMessage()));
                        Log.i("CropLibGetUri", "Try get URI using file://");
                        Uri fromFile2 = Uri.fromFile(file);
                        kotlin.jvm.internal.i.f(fromFile2, "Uri.fromFile(file)");
                        return fromFile2;
                    }
                }
                Log.i("CropLibGetUri", "Try get URI using file://");
                Uri fromFile22 = Uri.fromFile(file);
                kotlin.jvm.internal.i.f(fromFile22, "Uri.fromFile(file)");
                return fromFile22;
            }
        }
    }

    public static final d0 H(l0 l0Var) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.i.g(l0Var, "<this>");
        HashMap hashMap = l0Var.f2436u;
        if (hashMap == null) {
            obj2 = null;
        } else {
            synchronized (hashMap) {
                obj = l0Var.f2436u.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        d0 d0Var = (d0) obj2;
        if (d0Var != null) {
            return d0Var;
        }
        r1 a10 = sp.b.a();
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        return (d0) l0Var.d(new androidx.lifecycle.d(a10.h(kotlinx.coroutines.internal.k.f23608a.L0())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a0, code lost:
        if (r0.equals("video/mp2t") == false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bf A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c1 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int I(Map map) {
        String str;
        char c10;
        List list = (List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        } else {
            str = null;
        }
        if (str != null) {
            ArrayList<l.a> arrayList = c9.l.f5151a;
            int hashCode = str.hashCode();
            char c11 = 2;
            if (hashCode != -1007807498) {
                if (hashCode != -586683234) {
                    if (hashCode == 187090231 && str.equals("audio/mp3")) {
                        c10 = 2;
                        if (c10 != 0) {
                            str = "audio/flac";
                        } else if (c10 == 1) {
                            str = "audio/wav";
                        } else if (c10 == 2) {
                            str = "audio/mpeg";
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1662384011:
                                if (str.equals("video/mp2p")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1662384007:
                                break;
                            case -1662095187:
                                if (str.equals("video/webm")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606874997:
                                if (str.equals("audio/amr-wb")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1487394660:
                                if (str.equals("image/jpeg")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1248337486:
                                if (str.equals("application/mp4")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1004728940:
                                if (str.equals("text/vtt")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -387023398:
                                if (str.equals("audio/x-matroska")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -43467528:
                                if (str.equals("application/webm")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 13915911:
                                if (str.equals("video/x-flv")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c11 = '\f';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187078669:
                                if (str.equals("audio/amr")) {
                                    c11 = '\r';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187090232:
                                if (str.equals("audio/mp4")) {
                                    c11 = 14;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187091926:
                                if (str.equals("audio/ogg")) {
                                    c11 = 15;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 187099443:
                                if (str.equals("audio/wav")) {
                                    c11 = 16;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1331848029:
                                if (str.equals("video/mp4")) {
                                    c11 = 17;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1503095341:
                                if (str.equals("audio/3gpp")) {
                                    c11 = 18;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c11 = 19;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1504619009:
                                if (str.equals("audio/flac")) {
                                    c11 = 20;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1504831518:
                                if (str.equals("audio/mpeg")) {
                                    c11 = 21;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1505118770:
                                if (str.equals("audio/webm")) {
                                    c11 = 22;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2039520277:
                                if (str.equals("video/x-matroska")) {
                                    c11 = 23;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 11:
                            case 19:
                                return 0;
                            case 1:
                                return 10;
                            case 2:
                                return 11;
                            case 3:
                            case '\b':
                            case '\t':
                            case 22:
                            case 23:
                                return 6;
                            case 4:
                            case '\r':
                            case 18:
                                return 3;
                            case 5:
                                return 14;
                            case 6:
                            case 14:
                            case 17:
                                return 8;
                            case 7:
                                return 13;
                            case '\n':
                                return 5;
                            case '\f':
                                return 1;
                            case 15:
                                return 9;
                            case 16:
                                return 12;
                            case 20:
                                return 4;
                            case 21:
                                return 7;
                        }
                    }
                    c10 = 65535;
                    if (c10 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c11) {
                    }
                } else {
                    if (str.equals("audio/x-wav")) {
                        c10 = 1;
                        if (c10 != 0) {
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                break;
                            case -1662384011:
                                break;
                            case -1662384007:
                                break;
                            case -1662095187:
                                break;
                            case -1606874997:
                                break;
                            case -1487394660:
                                break;
                            case -1248337486:
                                break;
                            case -1004728940:
                                break;
                            case -387023398:
                                break;
                            case -43467528:
                                break;
                            case 13915911:
                                break;
                            case 187078296:
                                break;
                            case 187078297:
                                break;
                            case 187078669:
                                break;
                            case 187090232:
                                break;
                            case 187091926:
                                break;
                            case 187099443:
                                break;
                            case 1331848029:
                                break;
                            case 1503095341:
                                break;
                            case 1504578661:
                                break;
                            case 1504619009:
                                break;
                            case 1504831518:
                                break;
                            case 1505118770:
                                break;
                            case 2039520277:
                                break;
                        }
                        switch (c11) {
                        }
                    }
                    c10 = 65535;
                    if (c10 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c11) {
                    }
                }
            } else {
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    if (c10 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c11) {
                    }
                }
                c10 = 65535;
                if (c10 != 0) {
                }
                switch (str.hashCode()) {
                    case -2123537834:
                        break;
                    case -1662384011:
                        break;
                    case -1662384007:
                        break;
                    case -1662095187:
                        break;
                    case -1606874997:
                        break;
                    case -1487394660:
                        break;
                    case -1248337486:
                        break;
                    case -1004728940:
                        break;
                    case -387023398:
                        break;
                    case -43467528:
                        break;
                    case 13915911:
                        break;
                    case 187078296:
                        break;
                    case 187078297:
                        break;
                    case 187078669:
                        break;
                    case 187090232:
                        break;
                    case 187091926:
                        break;
                    case 187099443:
                        break;
                    case 1331848029:
                        break;
                    case 1503095341:
                        break;
                    case 1504578661:
                        break;
                    case 1504619009:
                        break;
                    case 1504831518:
                        break;
                    case 1505118770:
                        break;
                    case 2039520277:
                        break;
                }
                switch (c11) {
                }
            }
        }
        return -1;
    }

    public static int J(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                    if (lastPathSegment.endsWith(".mp3")) {
                        return 7;
                    }
                    if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                            if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                    if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                        if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                            if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                return -1;
                                            }
                                            return 14;
                                        }
                                        return 13;
                                    }
                                    return 12;
                                }
                                return 11;
                            }
                            return 10;
                        }
                        return 9;
                    }
                    return 8;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    public static boolean K(n nVar, zu.h hVar) {
        if (nVar.z(nVar.F(hVar)) && !nVar.p0(hVar) && !nVar.U(hVar) && !nVar.l(hVar) && kotlin.jvm.internal.i.b(nVar.b(nVar.o0(hVar)), nVar.b(nVar.q(hVar)))) {
            return true;
        }
        return false;
    }

    public static boolean L(w0 w0Var, zu.j capturedSubArguments, zu.i superType) {
        boolean z10;
        boolean M2;
        kotlin.jvm.internal.i.g(w0Var, "<this>");
        kotlin.jvm.internal.i.g(capturedSubArguments, "capturedSubArguments");
        kotlin.jvm.internal.i.g(superType, "superType");
        n nVar = w0Var.f37304c;
        x0 b10 = nVar.b(superType);
        int j02 = nVar.j0(capturedSubArguments);
        int Q2 = nVar.Q(b10);
        if (j02 != Q2 || j02 != nVar.I(superType)) {
            return false;
        }
        for (int i6 = 0; i6 < Q2; i6++) {
            zu.k T2 = nVar.T(superType, i6);
            if (!nVar.A(T2)) {
                m1 w10 = nVar.w(T2);
                zu.k n10 = nVar.n(capturedSubArguments, i6);
                nVar.s(n10);
                m1 w11 = nVar.w(n10);
                int N2 = nVar.N(nVar.n0(b10, i6));
                int s10 = nVar.s(T2);
                defpackage.d.j(N2, "declared");
                defpackage.d.j(s10, "useSite");
                if (N2 == 3) {
                    N2 = s10;
                } else if (s10 != 3 && N2 != s10) {
                    N2 = 0;
                }
                if (N2 == 0) {
                    return w0Var.f37302a;
                }
                f fVar = f23229s0;
                if (N2 == 3 && (N(nVar, w11, w10, b10) || N(nVar, w10, w11, b10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    continue;
                } else {
                    int i10 = w0Var.f;
                    if (i10 <= 100) {
                        w0Var.f = i10 + 1;
                        int d10 = v.h.d(N2);
                        if (d10 != 0) {
                            if (d10 != 1) {
                                if (d10 == 2) {
                                    M2 = C(w0Var, w11, w10);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                M2 = M(fVar, w0Var, w11, w10);
                            }
                        } else {
                            M2 = M(fVar, w0Var, w10, w11);
                        }
                        w0Var.f--;
                        if (!M2) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + w11).toString());
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x016f, code lost:
        if (r10 != false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r10 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r11 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
        if (r10 == null) goto L360;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARN: Type inference failed for: r10v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean M(f fVar, w0 state, zu.h subType, zu.h superType) {
        Boolean valueOf;
        boolean z10;
        boolean z11;
        Boolean bool;
        boolean z12;
        boolean z13;
        List<zu.i> list;
        w0.b bVar;
        w0.b bVar2;
        boolean z14;
        m1 w10;
        w0.b bVar3;
        i0 i0Var;
        m1 m1Var;
        boolean z15;
        boolean z16;
        zu.h o10;
        i0 i0Var2;
        i0 i0Var3;
        boolean z17;
        boolean z18;
        fVar.getClass();
        kotlin.jvm.internal.i.g(state, "state");
        kotlin.jvm.internal.i.g(subType, "subType");
        kotlin.jvm.internal.i.g(superType, "superType");
        if (subType != superType) {
            if (state.b(subType, superType)) {
                androidx.work.k kVar = state.f37306e;
                zu.h subType2 = state.d(kVar.y(subType));
                zu.h superType2 = state.d(kVar.y(superType));
                n nVar = state.f37304c;
                zu.i subType3 = nVar.o0(subType2);
                zu.i q10 = nVar.q(superType2);
                boolean B2 = nVar.B(subType3);
                f fVar2 = f23229s0;
                if (!B2 && !nVar.B(q10)) {
                    boolean X2 = nVar.X(subType3);
                    boolean z19 = state.f37303b;
                    if (X2 && nVar.X(q10)) {
                        o v10 = nVar.v(subType3);
                        if (v10 != null) {
                            i0 k10 = nVar.k(v10);
                            i0Var2 = k10;
                        }
                        i0Var2 = subType3;
                        o v11 = nVar.v(q10);
                        if (v11 != null) {
                            i0 k11 = nVar.k(v11);
                            i0Var3 = k11;
                        }
                        i0Var3 = q10;
                        if (nVar.b(i0Var2) != nVar.b(i0Var3) || ((!nVar.U(subType3) && nVar.U(q10)) || (nVar.D(subType3) && !nVar.D(q10)))) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (!z17 && !z19) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        valueOf = Boolean.valueOf(z18);
                    } else if (!nVar.h0(subType3) && !nVar.h0(q10)) {
                        o v12 = nVar.v(q10);
                        if (v12 != null) {
                            i0 k12 = nVar.k(v12);
                            i0Var = k12;
                        }
                        i0Var = q10;
                        zu.d g5 = nVar.g(i0Var);
                        if (g5 != null) {
                            m1Var = nVar.j(g5);
                        } else {
                            m1Var = null;
                        }
                        if (g5 != null && m1Var != null) {
                            if (nVar.D(q10)) {
                                o10 = nVar.x(m1Var);
                            } else {
                                if (nVar.U(q10)) {
                                    o10 = nVar.o(m1Var);
                                }
                                kotlin.jvm.internal.i.g(subType3, "subType");
                                if (M(fVar2, state, subType3, m1Var)) {
                                    valueOf = Boolean.TRUE;
                                }
                            }
                            m1Var = o10;
                            kotlin.jvm.internal.i.g(subType3, "subType");
                            if (M(fVar2, state, subType3, m1Var)) {
                            }
                        }
                        x0 b10 = nVar.b(q10);
                        if (nVar.c0(b10)) {
                            nVar.D(q10);
                            Collection<zu.h> V2 = nVar.V(b10);
                            if (!(V2 instanceof Collection) || !V2.isEmpty()) {
                                for (zu.h hVar : V2) {
                                    if (!M(fVar2, state, subType3, hVar)) {
                                        z16 = false;
                                        break;
                                    }
                                }
                            }
                            z16 = true;
                            valueOf = Boolean.valueOf(z16);
                        } else {
                            x0 b11 = nVar.b(subType3);
                            if (!(subType3 instanceof zu.d)) {
                                if (nVar.c0(b11)) {
                                    Collection<zu.h> V3 = nVar.V(b11);
                                    if (!(V3 instanceof Collection) || !V3.isEmpty()) {
                                        for (zu.h hVar2 : V3) {
                                            if (!(hVar2 instanceof zu.d)) {
                                                z15 = false;
                                                break;
                                            }
                                        }
                                    }
                                    z15 = true;
                                }
                                valueOf = null;
                            }
                            m F2 = F(nVar, q10, subType3);
                            if (F2 != null && nVar.Y(F2, nVar.b(q10))) {
                                valueOf = Boolean.TRUE;
                            }
                            valueOf = null;
                        }
                    } else {
                        valueOf = Boolean.valueOf(z19);
                    }
                } else if (state.f37302a) {
                    valueOf = Boolean.TRUE;
                } else if (nVar.D(subType3) && !nVar.D(q10)) {
                    valueOf = Boolean.FALSE;
                } else {
                    i0 a10 = nVar.f(subType3, false);
                    i0 b12 = nVar.f(q10, false);
                    kotlin.jvm.internal.i.g(a10, "a");
                    kotlin.jvm.internal.i.g(b12, "b");
                    valueOf = Boolean.valueOf(uf.c.c(nVar, a10, b12));
                }
                if (valueOf != null) {
                    boolean booleanValue = valueOf.booleanValue();
                    kotlin.jvm.internal.i.g(subType2, "subType");
                    kotlin.jvm.internal.i.g(superType2, "superType");
                    return booleanValue;
                }
                kotlin.jvm.internal.i.g(subType2, "subType");
                kotlin.jvm.internal.i.g(superType2, "superType");
                zu.i subType4 = nVar.o0(subType2);
                zu.i superType3 = nVar.q(superType2);
                kotlin.jvm.internal.i.g(subType4, "subType");
                kotlin.jvm.internal.i.g(superType3, "superType");
                if (!nVar.D(superType3) && !nVar.U(subType4) && !nVar.l(subType4) && ((!(subType4 instanceof zu.d) || !nVar.P((zu.d) subType4)) && !sc.b.M(state, subType4, w0.b.C0626b.f37310a))) {
                    if (!nVar.U(superType3) && !sc.b.M(state, superType3, w0.b.d.f37312a) && !nVar.M(subType4)) {
                        x0 end = nVar.b(superType3);
                        kotlin.jvm.internal.i.g(end, "end");
                        if (!sc.b.O(state, subType4, end)) {
                            state.c();
                            ArrayDeque<zu.i> arrayDeque = state.f37307g;
                            kotlin.jvm.internal.i.d(arrayDeque);
                            dv.e eVar = state.f37308h;
                            kotlin.jvm.internal.i.d(eVar);
                            arrayDeque.push(subType4);
                            loop0: while (!arrayDeque.isEmpty()) {
                                if (eVar.f13522v <= 1000) {
                                    zu.i current = arrayDeque.pop();
                                    kotlin.jvm.internal.i.f(current, "current");
                                    if (eVar.add(current)) {
                                        if (nVar.D(current)) {
                                            bVar3 = w0.b.c.f37311a;
                                        } else {
                                            bVar3 = w0.b.C0626b.f37310a;
                                        }
                                        if (!(!kotlin.jvm.internal.i.b(bVar3, w0.b.c.f37311a))) {
                                            bVar3 = null;
                                        }
                                        if (bVar3 == null) {
                                            continue;
                                        } else {
                                            for (zu.h hVar3 : nVar.V(nVar.b(current))) {
                                                zu.i a11 = bVar3.a(state, hVar3);
                                                if (sc.b.O(state, a11, end)) {
                                                    state.a();
                                                } else {
                                                    arrayDeque.add(a11);
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException(("Too many supertypes for type: " + subType4 + ". Supertypes = " + u.m2(eVar, null, null, null, null, 63)).toString());
                                }
                            }
                            state.a();
                        }
                    }
                    z10 = false;
                    if (z10) {
                        zu.i o02 = nVar.o0(subType4);
                        zu.i q11 = nVar.q(superType3);
                        if (nVar.d0(o02) || nVar.d0(q11)) {
                            if (r(nVar, o02) && r(nVar, q11)) {
                                bool = Boolean.TRUE;
                            } else if (nVar.d0(o02)) {
                                if (s(nVar, state, o02, q11, false)) {
                                    bool = Boolean.TRUE;
                                }
                            } else if (nVar.d0(q11)) {
                                x0 b13 = nVar.b(o02);
                                if (b13 instanceof zu.g) {
                                    Collection<zu.h> V4 = nVar.V(b13);
                                    if (!(V4 instanceof Collection) || !V4.isEmpty()) {
                                        for (zu.h hVar4 : V4) {
                                            i0 e10 = nVar.e(hVar4);
                                            if (e10 != null && nVar.d0(e10)) {
                                                z12 = true;
                                                continue;
                                            } else {
                                                z12 = false;
                                                continue;
                                            }
                                            if (z12) {
                                                z13 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z13 = false;
                                    if (z13) {
                                        z11 = true;
                                        if (!z11 || s(nVar, state, q11, o02, true)) {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                }
                                z11 = false;
                                if (!z11) {
                                }
                                bool = Boolean.TRUE;
                            }
                            if (bool == null) {
                                return bool.booleanValue();
                            }
                            x0 superConstructor = nVar.b(superType3);
                            if ((!nVar.G(nVar.b(subType4), superConstructor) || nVar.Q(superConstructor) != 0) && !nVar.a0(nVar.b(superType3))) {
                                kotlin.jvm.internal.i.g(superConstructor, "superConstructor");
                                if (nVar.M(subType4)) {
                                    list = u(state, subType4, superConstructor);
                                } else if (!nVar.r(superConstructor) && !nVar.e0(superConstructor)) {
                                    list = t(state, subType4, superConstructor);
                                } else {
                                    dv.d dVar = new dv.d();
                                    state.c();
                                    ArrayDeque<zu.i> arrayDeque2 = state.f37307g;
                                    kotlin.jvm.internal.i.d(arrayDeque2);
                                    dv.e eVar2 = state.f37308h;
                                    kotlin.jvm.internal.i.d(eVar2);
                                    arrayDeque2.push(subType4);
                                    while (!arrayDeque2.isEmpty()) {
                                        if (eVar2.f13522v <= 1000) {
                                            zu.i current2 = arrayDeque2.pop();
                                            kotlin.jvm.internal.i.f(current2, "current");
                                            if (eVar2.add(current2)) {
                                                if (nVar.M(current2)) {
                                                    dVar.add(current2);
                                                    bVar = w0.b.c.f37311a;
                                                } else {
                                                    bVar = w0.b.C0626b.f37310a;
                                                }
                                                if (!(!kotlin.jvm.internal.i.b(bVar, w0.b.c.f37311a))) {
                                                    bVar = null;
                                                }
                                                if (bVar != null) {
                                                    for (zu.h hVar5 : nVar.V(nVar.b(current2))) {
                                                        arrayDeque2.add(bVar.a(state, hVar5));
                                                    }
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException(("Too many supertypes for type: " + subType4 + ". Supertypes = " + u.m2(eVar2, null, null, null, null, 63)).toString());
                                        }
                                    }
                                    state.a();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = dVar.iterator();
                                    while (it.hasNext()) {
                                        zu.i it2 = (zu.i) it.next();
                                        kotlin.jvm.internal.i.f(it2, "it");
                                        q.R1(u(state, it2, superConstructor), arrayList);
                                    }
                                    list = arrayList;
                                }
                                int i6 = 10;
                                ArrayList arrayList2 = new ArrayList(is.i.H1(list, 10));
                                for (zu.i iVar : list) {
                                    i0 e11 = nVar.e(state.d(iVar));
                                    if (e11 != null) {
                                        iVar = e11;
                                    }
                                    arrayList2.add(iVar);
                                }
                                int size = arrayList2.size();
                                if (size != 0) {
                                    if (size != 1) {
                                        zu.a aVar = new zu.a(nVar.Q(superConstructor));
                                        int Q2 = nVar.Q(superConstructor);
                                        int i10 = 0;
                                        boolean z20 = false;
                                        while (i10 < Q2) {
                                            if (!z20 && nVar.N(nVar.n0(superConstructor, i10)) == 2) {
                                                z20 = false;
                                            } else {
                                                z20 = true;
                                            }
                                            if (!z20) {
                                                ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, i6));
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    zu.i iVar2 = (zu.i) it3.next();
                                                    zu.k E2 = nVar.E(iVar2, i10);
                                                    if (E2 != null) {
                                                        if (nVar.s(E2) == 3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (!z14) {
                                                            E2 = null;
                                                        }
                                                        if (E2 != null && (w10 = nVar.w(E2)) != null) {
                                                            arrayList3.add(w10);
                                                        }
                                                    }
                                                    throw new IllegalStateException(("Incorrect type: " + iVar2 + ", subType: " + subType4 + ", superType: " + superType3).toString());
                                                }
                                                aVar.add(nVar.Z(nVar.S(arrayList3)));
                                            }
                                            i10++;
                                            i6 = 10;
                                        }
                                        if (z20 || !L(state, aVar, superType3)) {
                                            wu.e eVar3 = new wu.e(arrayList2, state, nVar, superType3);
                                            w0.a.C0625a c0625a = new w0.a.C0625a();
                                            eVar3.invoke(c0625a);
                                            return c0625a.f37309a;
                                        }
                                    } else {
                                        return L(state, nVar.K((zu.i) u.g2(arrayList2)), superType3);
                                    }
                                } else {
                                    x0 b14 = nVar.b(subType4);
                                    if (nVar.r(b14)) {
                                        return nVar.g0(b14);
                                    }
                                    if (!nVar.g0(nVar.b(subType4))) {
                                        state.c();
                                        ArrayDeque<zu.i> arrayDeque3 = state.f37307g;
                                        kotlin.jvm.internal.i.d(arrayDeque3);
                                        dv.e eVar4 = state.f37308h;
                                        kotlin.jvm.internal.i.d(eVar4);
                                        arrayDeque3.push(subType4);
                                        while (!arrayDeque3.isEmpty()) {
                                            if (eVar4.f13522v <= 1000) {
                                                zu.i current3 = arrayDeque3.pop();
                                                kotlin.jvm.internal.i.f(current3, "current");
                                                if (eVar4.add(current3)) {
                                                    if (nVar.M(current3)) {
                                                        bVar2 = w0.b.c.f37311a;
                                                    } else {
                                                        bVar2 = w0.b.C0626b.f37310a;
                                                    }
                                                    if (!(!kotlin.jvm.internal.i.b(bVar2, w0.b.c.f37311a))) {
                                                        bVar2 = null;
                                                    }
                                                    if (bVar2 == null) {
                                                        continue;
                                                    } else {
                                                        for (zu.h hVar6 : nVar.V(nVar.b(current3))) {
                                                            zu.i a12 = bVar2.a(state, hVar6);
                                                            if (nVar.g0(nVar.b(a12))) {
                                                                state.a();
                                                                return true;
                                                            }
                                                            arrayDeque3.add(a12);
                                                        }
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException(("Too many supertypes for type: " + subType4 + ". Supertypes = " + u.m2(eVar4, null, null, null, null, 63)).toString());
                                            }
                                        }
                                        state.a();
                                    }
                                }
                            }
                        }
                        bool = null;
                        if (bool == null) {
                        }
                    }
                }
                z10 = true;
                if (z10) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean N(n nVar, zu.h hVar, zu.h hVar2, zu.l lVar) {
        p pVar;
        v0 b02;
        i0 e10 = nVar.e(hVar);
        if (!(e10 instanceof zu.d)) {
            return false;
        }
        zu.d dVar = (zu.d) e10;
        if (nVar.J(dVar) || !nVar.A(nVar.L(nVar.C(dVar))) || nVar.h(dVar) != zu.b.FOR_SUBTYPING) {
            return false;
        }
        zu.l F2 = nVar.F(hVar2);
        if (F2 instanceof p) {
            pVar = (p) F2;
        } else {
            pVar = null;
        }
        if (pVar == null || (b02 = nVar.b0(pVar)) == null || !nVar.Y(b02, lVar)) {
            return false;
        }
        return true;
    }

    public static String O(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i6 = 0; i6 < str.length(); i6++) {
                sb2.append(str.charAt(i6));
                if (str2.length() > i6) {
                    sb2.append(str2.charAt(i6));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static final s1.a0 P(ss.l optionsBuilder) {
        kotlin.jvm.internal.i.g(optionsBuilder, "optionsBuilder");
        b0 b0Var = new b0();
        optionsBuilder.invoke(b0Var);
        boolean z10 = b0Var.f31087b;
        a0.a aVar = b0Var.f31086a;
        aVar.getClass();
        aVar.getClass();
        int i6 = b0Var.f31088c;
        boolean z11 = b0Var.f31089d;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        return new s1.a0(z10, false, i6, false, z11, aVar.f31078a, aVar.f31079b, aVar.f31080c, aVar.f31081d);
    }

    public static void Q(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof v1) {
                    editorInfo.hintText = ((v1) parent).a();
                    return;
                }
            }
        }
    }

    public static void R(Context context, ih.p sdkInstance, jh.a aVar) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        qg.w.f29578a.getClass();
        qg.w.a(context, sdkInstance).d(aVar);
        for (ih.p pVar : g0.f29557b.values()) {
            if (!kotlin.jvm.internal.i.b((String) pVar.f20102a.f5133c, (String) sdkInstance.f20102a.f5133c)) {
                qg.w.f29578a.getClass();
                sg.a a10 = qg.w.a(context, pVar);
                ih.p pVar2 = a10.f31520b;
                hh.g.b(pVar2.f20105d, 0, new sg.n(a10), 3);
                pVar2.f20106e.c(new ah.e("SOURCE_UPDATE_NOTIFICATION_CLICK", false, new ne.u(a10, 11, aVar)));
            }
        }
    }

    public static final Cursor S(x1.n db2, x1.p sqLiteQuery, boolean z10) {
        int i6;
        kotlin.jvm.internal.i.g(db2, "db");
        kotlin.jvm.internal.i.g(sqLiteQuery, "sqLiteQuery");
        Cursor c10 = db2.l(sqLiteQuery, null);
        if (z10 && (c10 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c10;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i6 = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i6 = count;
            }
            if (Build.VERSION.SDK_INT < 23 || i6 < count) {
                kotlin.jvm.internal.i.g(c10, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
                    while (c10.moveToNext()) {
                        Object[] objArr = new Object[c10.getColumnCount()];
                        int columnCount = c10.getColumnCount();
                        for (int i10 = 0; i10 < columnCount; i10++) {
                            int type = c10.getType(i10);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i10] = c10.getBlob(i10);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i10] = c10.getString(i10);
                                        }
                                    } else {
                                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                                    }
                                } else {
                                    objArr[i10] = Long.valueOf(c10.getLong(i10));
                                }
                            } else {
                                objArr[i10] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    ca.a.z(c10, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c10;
    }

    public static long T(c9.q qVar, int i6, int i10) {
        boolean z10;
        boolean z11;
        qVar.A(i6);
        if (qVar.f5188c - qVar.f5187b < 5) {
            return -9223372036854775807L;
        }
        int c10 = qVar.c();
        if ((8388608 & c10) != 0 || ((2096896 & c10) >> 8) != i10) {
            return -9223372036854775807L;
        }
        if ((c10 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && qVar.q() >= 7 && qVar.f5188c - qVar.f5187b >= 7) {
            if ((qVar.q() & 16) == 16) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                byte[] bArr = new byte[6];
                qVar.b(0, bArr, 6);
                return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static void U(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        defpackage.d.j(1, "tokenType");
        qg.w.f29578a.getClass();
        vg.d dVar = (vg.d) qg.w.d(sdkInstance).f29550e.getValue();
        dVar.getClass();
        ih.p pVar = dVar.f35081a;
        hh.g.b(pVar.f20105d, 0, new vg.g(dVar), 3);
        if (dVar.f35083c) {
            hh.g.b(pVar.f20105d, 0, new vg.h(dVar), 3);
            int d10 = v.h.d(1);
            if (d10 != 0) {
                if (d10 == 1) {
                    dVar.f = true;
                    return;
                }
                return;
            }
            dVar.f35085e = true;
            return;
        }
        dVar.a(context);
    }

    public static final void V(View view, androidx.activity.j onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.i.g(view, "<this>");
        kotlin.jvm.internal.i.g(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static final wu.b0 X(v0 v0Var) {
        kotlin.jvm.internal.i.g(v0Var, "<this>");
        gt.j c10 = v0Var.c();
        kotlin.jvm.internal.i.f(c10, "this.containingDeclaration");
        if (c10 instanceof gt.h) {
            List<v0> parameters = ((gt.h) c10).l().getParameters();
            kotlin.jvm.internal.i.f(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
            for (v0 v0Var2 : parameters) {
                x0 l2 = v0Var2.l();
                kotlin.jvm.internal.i.f(l2, "it.typeConstructor");
                arrayList.add(l2);
            }
            List<wu.b0> upperBounds = v0Var.getUpperBounds();
            kotlin.jvm.internal.i.f(upperBounds, "upperBounds");
            return k(arrayList, upperBounds, mu.a.e(v0Var));
        } else if (c10 instanceof gt.u) {
            List<v0> typeParameters = ((gt.u) c10).getTypeParameters();
            kotlin.jvm.internal.i.f(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList2 = new ArrayList(is.i.H1(typeParameters, 10));
            for (v0 v0Var3 : typeParameters) {
                x0 l10 = v0Var3.l();
                kotlin.jvm.internal.i.f(l10, "it.typeConstructor");
                arrayList2.add(l10);
            }
            List<wu.b0> upperBounds2 = v0Var.getUpperBounds();
            kotlin.jvm.internal.i.f(upperBounds2, "upperBounds");
            return k(arrayList2, upperBounds2, mu.a.e(v0Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }

    public static final Object[] Y(Collection collection) {
        kotlin.jvm.internal.i.g(collection, "collection");
        int size = collection.size();
        Object[] objArr = f23216f0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    objArr2[i6] = it.next();
                    if (i10 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i11 = ((i10 * 3) + 1) >>> 1;
                            if (i11 <= i10) {
                                i11 = 2147483645;
                                if (i10 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i11);
                            kotlin.jvm.internal.i.f(objArr2, "copyOf(result, newSize)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i10);
                        kotlin.jvm.internal.i.f(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i6 = i10;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] Z(Collection collection, Object[] objArr) {
        Object[] objArr2;
        kotlin.jvm.internal.i.g(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i6 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            kotlin.jvm.internal.i.e(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i10 = i6 + 1;
            objArr2[i6] = it.next();
            if (i10 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i11);
                kotlin.jvm.internal.i.f(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i10] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i10);
                kotlin.jvm.internal.i.f(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i6 = i10;
        }
    }

    public static String b0(yt.m type) {
        String h10;
        kotlin.jvm.internal.i.g(type, "type");
        if (type instanceof m.a) {
            return "[" + b0(((m.a) type).f39050i);
        } else if (type instanceof m.c) {
            nu.c cVar = ((m.c) type).f39052i;
            if (cVar == null || (h10 = cVar.h()) == null) {
                return "V";
            }
            return h10;
        } else if (type instanceof m.b) {
            return v.g.c(new StringBuilder("L"), ((m.b) type).f39051i, ';');
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final s c0(s sVar) {
        String name = ConstraintTrackingWorker.class.getName();
        String str = sVar.f34736c;
        if (kotlin.jvm.internal.i.b(str, name)) {
            return sVar;
        }
        androidx.work.c cVar = sVar.f34742j;
        if (!cVar.f3228d && !cVar.f3229e) {
            return sVar;
        }
        d.a aVar = new d.a();
        aVar.a(sVar.f34738e.f3236a);
        HashMap hashMap = aVar.f3237a;
        hashMap.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
        androidx.work.d dVar = new androidx.work.d(hashMap);
        androidx.work.d.b(dVar);
        String name2 = ConstraintTrackingWorker.class.getName();
        u.a state = sVar.f34735b;
        String str2 = sVar.f34737d;
        long j10 = sVar.f34739g;
        long j11 = sVar.f34740h;
        long j12 = sVar.f34741i;
        int i6 = sVar.f34743k;
        long j13 = sVar.f34745m;
        long j14 = sVar.f34746n;
        long j15 = sVar.f34747o;
        long j16 = sVar.f34748p;
        boolean z10 = sVar.f34749q;
        int i10 = sVar.f34750s;
        int i11 = sVar.f34751t;
        String id2 = sVar.f34734a;
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(state, "state");
        androidx.work.d output = sVar.f;
        kotlin.jvm.internal.i.g(output, "output");
        int i12 = sVar.f34744l;
        defpackage.d.j(i12, "backoffPolicy");
        int i13 = sVar.r;
        defpackage.d.j(i13, "outOfQuotaPolicy");
        return new s(id2, state, name2, str2, dVar, output, j10, j11, j12, cVar, i6, i12, j13, j14, j15, j16, z10, i13, i10, i11);
    }

    public static void d0(String str, String str2, Object... objArr) {
        A(2, str, str2, objArr);
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, Object obj, int i6, int i10) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i6, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i6 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i6, i10, 33);
    }

    public static boolean h(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void j(String str) {
        if (w.f5205a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static final wu.b0 k(ArrayList arrayList, List list, dt.j jVar) {
        wu.b0 k10 = j1.e(new wu.o0(arrayList)).k((wu.b0) is.u.g2(list), n1.OUT_VARIANCE);
        if (k10 == null) {
            return jVar.n();
        }
        return k10;
    }

    public static final UndeliveredElementException l(ss.l lVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                ca.a.h(undeliveredElementException, th2);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th2);
            }
        }
        return undeliveredElementException;
    }

    public static void m(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void n(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void o(int i6) {
        if (i6 >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void p(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean r(n nVar, zu.i iVar) {
        boolean z10;
        if (nVar.d0(iVar)) {
            return true;
        }
        if (iVar instanceof zu.d) {
            d1 L2 = nVar.L(nVar.C((zu.d) iVar));
            if (!nVar.A(L2) && nVar.d0(nVar.q(nVar.w(L2)))) {
                z10 = true;
                if (!z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public static final boolean s(n nVar, w0 w0Var, zu.i iVar, zu.i iVar2, boolean z10) {
        boolean z11;
        Set<zu.h> f02 = nVar.f0(iVar);
        if ((f02 instanceof Collection) && f02.isEmpty()) {
            return false;
        }
        for (zu.h hVar : f02) {
            if (!kotlin.jvm.internal.i.b(nVar.F(hVar), nVar.b(iVar2)) && (!z10 || !M(f23229s0, w0Var, iVar2, hVar))) {
                z11 = false;
                continue;
            } else {
                z11 = true;
                continue;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static List t(w0 w0Var, zu.i iVar, zu.l lVar) {
        w0.b i02;
        n nVar = w0Var.f37304c;
        nVar.u(iVar, lVar);
        boolean r = nVar.r(lVar);
        is.w wVar = is.w.f20676u;
        if (!r && nVar.M(iVar)) {
            return wVar;
        }
        if (nVar.k0(lVar)) {
            if (nVar.G(nVar.b(iVar), lVar)) {
                i0 H2 = nVar.H(iVar);
                if (H2 != null) {
                    iVar = H2;
                }
                return ca.a.O0(iVar);
            }
            return wVar;
        }
        dv.d dVar = new dv.d();
        w0Var.c();
        ArrayDeque<zu.i> arrayDeque = w0Var.f37307g;
        kotlin.jvm.internal.i.d(arrayDeque);
        dv.e eVar = w0Var.f37308h;
        kotlin.jvm.internal.i.d(eVar);
        arrayDeque.push(iVar);
        while (!arrayDeque.isEmpty()) {
            if (eVar.f13522v <= 1000) {
                zu.i current = arrayDeque.pop();
                kotlin.jvm.internal.i.f(current, "current");
                if (eVar.add(current)) {
                    i0 H3 = nVar.H(current);
                    if (H3 == null) {
                        H3 = current;
                    }
                    boolean G2 = nVar.G(nVar.b(H3), lVar);
                    n nVar2 = w0Var.f37304c;
                    if (G2) {
                        dVar.add(H3);
                        i02 = w0.b.c.f37311a;
                    } else if (nVar.I(H3) == 0) {
                        i02 = w0.b.C0626b.f37310a;
                    } else {
                        i02 = nVar2.i0(H3);
                    }
                    if (!(!kotlin.jvm.internal.i.b(i02, w0.b.c.f37311a))) {
                        i02 = null;
                    }
                    if (i02 != null) {
                        for (zu.h hVar : nVar2.V(nVar2.b(current))) {
                            arrayDeque.add(i02.a(w0Var, hVar));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + is.u.m2(eVar, null, null, null, null, 63)).toString());
            }
        }
        w0Var.a();
        return dVar;
    }

    public static List u(w0 w0Var, zu.i iVar, zu.l lVar) {
        boolean z10;
        List t3 = t(w0Var, iVar, lVar);
        if (t3.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = t3.iterator();
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                n nVar = w0Var.f37304c;
                zu.j K2 = nVar.K((zu.i) next);
                int j02 = nVar.j0(K2);
                int i6 = 0;
                while (true) {
                    if (i6 >= j02) {
                        break;
                    }
                    if (nVar.y(nVar.w(nVar.n(K2, i6))) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = false;
                        break;
                    }
                    i6++;
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return t3;
        }
        return t3;
    }

    public static final void v(File file) {
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException(kotlin.jvm.internal.i.n(file, "Could not create directory at "));
        }
    }

    public static yt.m w(String representation) {
        nu.c cVar;
        yt.m bVar;
        boolean z10;
        kotlin.jvm.internal.i.g(representation, "representation");
        char charAt = representation.charAt(0);
        nu.c[] values = nu.c.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                cVar = values[i6];
                if (cVar.h().charAt(0) == charAt) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i6++;
            } else {
                cVar = null;
                break;
            }
        }
        if (cVar != null) {
            return new m.c(cVar);
        }
        if (charAt == 'V') {
            return new m.c(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
            bVar = new m.a(w(substring));
        } else {
            if (charAt == 'L' && representation.length() > 0) {
                ca.a.S(representation.charAt(gv.r.K0(representation)), ';', false);
            }
            String substring2 = representation.substring(1, representation.length() - 1);
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            bVar = new m.b(substring2);
        }
        return bVar;
    }

    public static void z(String str, String str2, Object... objArr) {
        A(1, str, str2, objArr);
    }

    public m.b E() {
        return new m.b("java/lang/Class");
    }

    @Override // k3.a0
    public Object W(l3.c cVar, float f) {
        return Integer.valueOf(Math.round(k3.l.d(cVar) * f));
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().o());
    }

    public /* bridge */ /* synthetic */ String a0(Object obj) {
        return b0((yt.m) obj);
    }

    @Override // r3.a
    public void b() {
        if (v.h.a(2, 2) <= 0) {
            Log.i("Amplitude", "Skip event for opt out config.");
        }
    }

    @Override // r3.a
    public void c(String message) {
        kotlin.jvm.internal.i.g(message, "message");
        if (v.h.a(2, 4) <= 0) {
            Log.e("Amplitude", message);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i6
    public com.android.volley.toolbox.a d(c7 c7Var) {
        n7 n7Var;
        y6 y6Var = p7.f8049a;
        if (c7Var.f7757a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                h8 y10 = h8.y(c7Var.f7759c, r0.f8101b);
                if (y10.v() == 0) {
                    m7 m7Var = new m7();
                    m7Var.a(y10.A().m());
                    m7Var.b(y10.z().v());
                    int i6 = c7Var.f7761e;
                    int d10 = v.h.d(i6);
                    if (d10 != 1) {
                        if (d10 != 2) {
                            if (d10 != 3) {
                                if (d10 == 4) {
                                    n7Var = n7.f8008c;
                                } else {
                                    int d11 = defpackage.c.d(i6);
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + d11);
                                }
                            } else {
                                n7Var = n7.f8010e;
                            }
                        } else {
                            n7Var = n7.f8009d;
                        }
                    } else {
                        n7Var = n7.f8007b;
                    }
                    m7Var.f7982c = n7Var;
                    o7 c10 = m7Var.c();
                    j7 j7Var = new j7();
                    j7Var.f7916a = c10;
                    j7Var.f7917b = new x(20, nc.a(y10.A().K()));
                    j7Var.f7918c = c7Var.f;
                    return j7Var.a();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzadn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    @Override // hd.e
    public Object e(hd.p pVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0(pVar);
    }

    @Override // r3.a
    public void f(String message) {
        kotlin.jvm.internal.i.g(message, "message");
        if (v.h.a(2, 3) <= 0) {
            Log.w("Amplitude", message);
        }
    }

    @Override // uf.l
    public Object i() {
        return new uf.k();
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onCancelled(DatabaseError error) {
        kotlin.jvm.internal.i.g(error, "error");
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void onDataChange(DataSnapshot snapshot) {
        DatabaseReference ref;
        kotlin.jvm.internal.i.g(snapshot, "snapshot");
        if (snapshot.exists() && snapshot.hasChildren()) {
            Iterable<DataSnapshot> children = snapshot.getChildren();
            kotlin.jvm.internal.i.f(children, "snapshot.children");
            DataSnapshot dataSnapshot = (DataSnapshot) is.u.h2(children);
            if (dataSnapshot != null && (ref = dataSnapshot.getRef()) != null) {
                ref.removeValue();
            }
        }
    }

    public m.b x(String internalName) {
        kotlin.jvm.internal.i.g(internalName, "internalName");
        return new m.b(internalName);
    }

    public m.c y(dt.k kVar) {
        switch (kVar.ordinal()) {
            case 0:
                return yt.m.f39043a;
            case 1:
                return yt.m.f39044b;
            case 2:
                return yt.m.f39045c;
            case 3:
                return yt.m.f39046d;
            case 4:
                return yt.m.f39047e;
            case 5:
                return yt.m.f;
            case 6:
                return yt.m.f39048g;
            case 7:
                return yt.m.f39049h;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
