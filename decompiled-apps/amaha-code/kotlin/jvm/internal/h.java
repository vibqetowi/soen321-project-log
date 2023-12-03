package kotlin.jvm.internal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import at.j0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.internal.cast.r4;
import com.google.android.gms.internal.cast.s4;
import com.google.android.gms.internal.p000firebaseauthapi.b8;
import com.google.android.gms.internal.p000firebaseauthapi.d7;
import com.google.android.gms.internal.p000firebaseauthapi.d8;
import com.google.android.gms.internal.p000firebaseauthapi.e4;
import com.google.android.gms.internal.p000firebaseauthapi.e8;
import com.google.android.gms.internal.p000firebaseauthapi.f4;
import com.google.android.gms.internal.p000firebaseauthapi.w3;
import com.google.firebase.database.core.ValidationPath;
import com.google.zxing.WriterException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import du.a;
import eu.d;
import gt.e0;
import gt.g0;
import gt.k0;
import gt.v0;
import gu.g;
import hh.g;
import ht.h;
import iv.i;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.e1;
import org.json.JSONArray;
import pu.i;
import ta.s3;
import vs.c;
import wu.d1;
import wu.f1;
import wu.i0;
import wu.j1;
import wu.k1;
import wu.m1;
import wu.n1;
import wu.o;
import wu.x0;
import xu.a;
import yt.n;
import yt.r;
/* compiled from: PrimitiveCompanionObjects.kt */
/* loaded from: classes2.dex */
public class h implements a9.j, lv.l, CourseApiUtil.CourseApiUtilInterface, c4.o {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f23459u = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f23460v = {0, 0, 0, 1};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f23461w = {"", "A", "B", "C"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f23462x = {"_id", SessionManager.KEY_NAME, "value", "last_tracked_time", "datatype"};

    /* renamed from: y  reason: collision with root package name */
    public static final h f23463y = new h();

    /* renamed from: z  reason: collision with root package name */
    public static final h f23464z = new h();
    public static final h A = new h();
    public static final h B = new h();
    public static final h C = new h();
    public static final h D = new h();
    public static final r4 E = new r4();
    public static final s4 F = new s4();
    public static final d7 G = new d7(4, 0);
    public static final int[] H = {R.attr.cropAspectRatioX, R.attr.cropAspectRatioY, R.attr.cropAutoZoomEnabled, R.attr.cropBackgroundColor, R.attr.cropBorderCornerColor, R.attr.cropBorderCornerLength, R.attr.cropBorderCornerOffset, R.attr.cropBorderCornerThickness, R.attr.cropBorderLineColor, R.attr.cropBorderLineThickness, R.attr.cropCenterMoveEnabled, R.attr.cropFixAspectRatio, R.attr.cropFlipHorizontally, R.attr.cropFlipVertically, R.attr.cropGuidelines, R.attr.cropGuidelinesColor, R.attr.cropGuidelinesThickness, R.attr.cropInitialCropWindowPaddingRatio, R.attr.cropMaxCropResultHeightPX, R.attr.cropMaxCropResultWidthPX, R.attr.cropMaxZoom, R.attr.cropMinCropResultHeightPX, R.attr.cropMinCropResultWidthPX, R.attr.cropMinCropWindowHeight, R.attr.cropMinCropWindowWidth, R.attr.cropMultiTouchEnabled, R.attr.cropSaveBitmapToInstanceState, R.attr.cropScaleType, R.attr.cropShape, R.attr.cropShowCropOverlay, R.attr.cropShowProgressBar, R.attr.cropSnapRadius, R.attr.cropTouchRadius};
    public static final int[][] I = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, com.appsflyer.R.styleable.AppCompatTheme_viewInflaterClass, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, com.appsflyer.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 610, 287, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, SubsamplingScaleImageView.ORIENTATION_270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceListItem, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, com.appsflyer.R.styleable.AppCompatTheme_windowActionBarOverlay, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, com.appsflyer.R.styleable.AppCompatTheme_windowNoTitle, 32, 681, 331, 792, 620, 60, 609, 441, SubsamplingScaleImageView.ORIENTATION_180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, com.appsflyer.R.styleable.AppCompatTheme_windowActionBarOverlay, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, com.appsflyer.R.styleable.AppCompatTheme_windowFixedWidthMajor, 272, 383, 800, 485, 98, 752, 472, 761, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, SubsamplingScaleImageView.ORIENTATION_180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, ValidationPath.MAX_PATH_LENGTH_BYTES, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, com.appsflyer.R.styleable.AppCompatTheme_windowMinWidthMajor, 298, 332, 552, 43, 427, com.appsflyer.R.styleable.AppCompatTheme_windowActionModeOverlay, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, com.appsflyer.R.styleable.AppCompatTheme_viewInflaterClass, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceListItemSmall, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, ValidationPath.MAX_PATH_LENGTH_BYTES, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, com.appsflyer.R.styleable.AppCompatTheme_windowFixedHeightMinor, 303, 263}};
    public static final int[][] J = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] K = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] L = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, -1, -1}, new int[]{6, 28, 54, 80, com.appsflyer.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, -1, -1}, new int[]{6, 32, 58, 84, com.appsflyer.R.styleable.AppCompatTheme_textColorAlertDialogListItem, -1, -1}, new int[]{6, 30, 58, 86, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, -1, -1}, new int[]{6, 34, 62, 90, com.appsflyer.R.styleable.AppCompatTheme_windowActionBarOverlay, -1, -1}, new int[]{6, 26, 50, 74, 98, com.appsflyer.R.styleable.AppCompatTheme_windowFixedWidthMajor, -1}, new int[]{6, 30, 54, 78, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, com.appsflyer.R.styleable.AppCompatTheme_windowNoTitle, -1}, new int[]{6, 26, 52, 78, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 130, -1}, new int[]{6, 30, 56, 82, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 134, -1}, new int[]{6, 34, 60, 86, com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 138, -1}, new int[]{6, 30, 58, 86, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, 142, -1}, new int[]{6, 34, 62, 90, com.appsflyer.R.styleable.AppCompatTheme_windowActionBarOverlay, 146, -1}, new int[]{6, 30, 54, 78, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, com.appsflyer.R.styleable.AppCompatTheme_windowNoTitle, 150}, new int[]{6, 24, 50, 76, com.appsflyer.R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 128, 154}, new int[]{6, 28, 54, 80, com.appsflyer.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 132, 158}, new int[]{6, 32, 58, 84, com.appsflyer.R.styleable.AppCompatTheme_textColorAlertDialogListItem, 136, 162}, new int[]{6, 26, 54, 82, com.appsflyer.R.styleable.AppCompatTheme_textColorAlertDialogListItem, 138, 166}, new int[]{6, 30, 58, 86, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, 142, 170}};
    public static final int[][] M = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final ls.d[] N = new ls.d[0];
    public static final h O = new h();

    public /* synthetic */ h() {
    }

    public static final yt.r A(au.m proto, cu.c nameResolver, cu.e typeTable, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        i.g(proto, "proto");
        i.g(nameResolver, "nameResolver");
        i.g(typeTable, "typeTable");
        g.e<au.m, a.c> propertySignature = du.a.f13439d;
        i.f(propertySignature, "propertySignature");
        a.c cVar = (a.c) w(proto, propertySignature);
        if (cVar == null) {
            return null;
        }
        if (z10) {
            d.a b10 = eu.h.b(proto, nameResolver, typeTable, z12);
            if (b10 == null) {
                return null;
            }
            return r.a.a(b10);
        }
        if (z11) {
            if ((cVar.f13468v & 2) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                a.b bVar = cVar.f13470x;
                i.f(bVar, "signature.syntheticMethod");
                String name = nameResolver.getString(bVar.f13460w);
                String desc = nameResolver.getString(bVar.f13461x);
                i.g(name, "name");
                i.g(desc, "desc");
                return new yt.r(name.concat(desc));
            }
        }
        return null;
    }

    public static /* synthetic */ yt.r B(au.m mVar, cu.c cVar, cu.e eVar, boolean z10, boolean z11, int i6) {
        boolean z12;
        boolean z13;
        boolean z14;
        if ((i6 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i6 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i6 & 32) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        return A(mVar, cVar, eVar, z12, z13, z14);
    }

    public static final Object C(vu.i iVar, ys.m p10) {
        i.g(iVar, "<this>");
        i.g(p10, "p");
        return iVar.invoke();
    }

    public static Object D(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static final boolean E(d0 d0Var) {
        ls.f f02 = d0Var.f0();
        int i6 = c1.f23495m;
        c1 c1Var = (c1) f02.e(c1.b.f23496u);
        if (c1Var != null) {
            return c1Var.a();
        }
        return true;
    }

    public static boolean F(int i6) {
        if (i6 == -1) {
            return true;
        }
        return false;
    }

    public static final boolean G(e0 e0Var, fu.c fqName) {
        i.g(e0Var, "<this>");
        i.g(fqName, "fqName");
        if (e0Var instanceof g0) {
            return ((g0) e0Var).b(fqName);
        }
        return U(e0Var, fqName).isEmpty();
    }

    public static boolean H(jh.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (aVar == null) {
            return true;
        }
        String str = aVar.f22023a;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String str2 = aVar.f22024b;
            if (str2 != null && str2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                String str3 = aVar.f22025c;
                if (str3 != null && str3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    String str4 = aVar.f22026d;
                    if (str4 != null && str4.length() != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        String str5 = aVar.f;
                        if (str5 != null && str5.length() != 0) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (z14) {
                            String str6 = aVar.f22028g;
                            if (str6 != null && str6.length() != 0) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && aVar.f22029h.isEmpty()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean I(k0 k0Var) {
        i.g(k0Var, "<this>");
        if (k0Var.n() == null) {
            return true;
        }
        return false;
    }

    public static final boolean J(gt.e eVar) {
        fu.b bVar;
        LinkedHashSet linkedHashSet = dt.c.f13354a;
        if (iu.g.l(eVar)) {
            LinkedHashSet linkedHashSet2 = dt.c.f13354a;
            fu.b f = mu.a.f(eVar);
            if (f != null) {
                bVar = f.g();
            } else {
                bVar = null;
            }
            if (is.u.Z1(linkedHashSet2, bVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(String str) {
        int i6 = nc.g.f26000a;
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean L(wu.b0 b0Var) {
        v0 v0Var;
        gt.g a10 = b0Var.O0().a();
        if (a10 instanceof v0) {
            v0Var = (v0) a10;
        } else {
            v0Var = null;
        }
        if (v0Var == null) {
            return false;
        }
        return f0(hc.d.M(v0Var));
    }

    public static final is.b0 N(Object[] array) {
        i.g(array, "array");
        return new is.b0(array);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:6:0x0009, B:8:0x0011, B:11:0x001b, B:13:0x002b, B:19:0x0037), top: B:25:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final HashSet O(JSONArray jSONArray, boolean z10) {
        boolean z11;
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        try {
            int length = jSONArray.length();
            int i6 = 0;
            while (i6 < length) {
                int i10 = i6 + 1;
                String string = jSONArray.getString(i6);
                if (z10) {
                    i.f(string, "string");
                    string = string.toUpperCase(Locale.ROOT);
                    i.f(string, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                if (string != null && !gv.n.B0(string)) {
                    z11 = false;
                    if (z11) {
                        i.f(string, "string");
                        hashSet.add(string);
                    }
                    i6 = i10;
                }
                z11 = true;
                if (z11) {
                }
                i6 = i10;
            }
            return hashSet;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, di.a.f12874u);
            return hashSet;
        }
    }

    public static String P(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb2;
        String valueOf = String.valueOf(str);
        int i6 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(ri.e.c(hexString, name.length() + 1));
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf2 = String.valueOf(sb4);
                    if (valueOf2.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf2);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder n10 = defpackage.e.n(name2.length() + ri.e.c(sb4, 9), "<", sb4, " threw ", name2);
                    n10.append(">");
                    sb2 = n10.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i11 = 0;
        while (i6 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb5.append((CharSequence) valueOf, i11, indexOf);
            sb5.append(objArr[i6]);
            i11 = indexOf + 2;
            i6++;
        }
        sb5.append((CharSequence) valueOf, i11, valueOf.length());
        if (i6 < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i6]);
            for (int i12 = i6 + 1; i12 < objArr.length; i12++) {
                sb5.append(", ");
                sb5.append(objArr[i12]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final dv.d Q(ArrayList arrayList) {
        boolean z10;
        dv.d dVar = new dv.d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            pu.i iVar = (pu.i) next;
            if (iVar != null && iVar != i.b.f29008b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                dVar.add(next);
            }
        }
        return dVar;
    }

    public static final m1 R(m1 m1Var, boolean z10) {
        i.g(m1Var, "<this>");
        wu.o a10 = o.a.a(m1Var, z10);
        if (a10 == null) {
            i0 S = S(m1Var);
            if (S == null) {
                return m1Var.S0(false);
            }
            return S;
        }
        return a10;
    }

    public static final i0 S(wu.b0 b0Var) {
        wu.z zVar;
        wu.z zVar2;
        x0 O0 = b0Var.O0();
        if (O0 instanceof wu.z) {
            zVar = (wu.z) O0;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            return null;
        }
        LinkedHashSet<wu.b0> linkedHashSet = zVar.f37321b;
        ArrayList arrayList = new ArrayList(is.i.H1(linkedHashSet, 10));
        boolean z10 = false;
        for (wu.b0 b0Var2 : linkedHashSet) {
            if (k1.g(b0Var2)) {
                b0Var2 = R(b0Var2.R0(), false);
                z10 = true;
            }
            arrayList.add(b0Var2);
        }
        if (!z10) {
            zVar2 = null;
        } else {
            wu.b0 b0Var3 = zVar.f37320a;
            if (b0Var3 != null) {
                if (k1.g(b0Var3)) {
                    b0Var3 = R(b0Var3.R0(), false);
                }
            } else {
                b0Var3 = null;
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            zVar2 = new wu.z(linkedHashSet2, b0Var3);
        }
        if (zVar2 == null) {
            return null;
        }
        return zVar2.f();
    }

    public static final void T(Context context) {
        Map map;
        String str;
        File file;
        i.g(context, "context");
        File v10 = v(context);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23 && v10.exists()) {
            androidx.work.q.d().a(n2.x.f25859a, "Migrating WorkDatabase to the no-backup directory");
            if (i6 >= 23) {
                File v11 = v(context);
                if (i6 < 23) {
                    file = v(context);
                } else {
                    file = new File(n2.a.f25788a.a(context), "androidx.work.workdb");
                }
                String[] strArr = n2.x.f25860b;
                int P = sp.b.P(strArr.length);
                if (P < 16) {
                    P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P);
                for (String str2 : strArr) {
                    linkedHashMap.put(new File(v11.getPath() + str2), new File(file.getPath() + str2));
                }
                hs.f fVar = new hs.f(v11, file);
                if (linkedHashMap.isEmpty()) {
                    map = sp.b.Q(fVar);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put(v11, file);
                    map = linkedHashMap2;
                }
            } else {
                map = is.x.f20677u;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        androidx.work.q.d().g(n2.x.f25859a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    androidx.work.q.d().a(n2.x.f25859a, str);
                }
            }
        }
    }

    public static final ArrayList U(e0 e0Var, fu.c fqName) {
        i.g(e0Var, "<this>");
        i.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        n(e0Var, fqName, arrayList);
        return arrayList;
    }

    public static void V(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final int W(c.a random, xs.f fVar) {
        i.g(random, "random");
        try {
            return sp.b.R(random, fVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static final void X(ot.b bVar, ot.c cVar, gt.e scopeOwner, fu.e name) {
        i.g(bVar, "<this>");
        i.g(scopeOwner, "scopeOwner");
        i.g(name, "name");
    }

    public static final void Y(ot.b bVar, ot.c cVar, gt.d0 scopeOwner, fu.e name) {
        i.g(bVar, "<this>");
        i.g(scopeOwner, "scopeOwner");
        i.g(name, "name");
        scopeOwner.e().b();
        i.f(name.f(), "name.asString()");
    }

    public static final String Z(fu.e eVar) {
        boolean z10;
        boolean z11;
        i.g(eVar, "<this>");
        String f = eVar.f();
        i.f(f, "asString()");
        boolean z12 = true;
        if (!hu.n.f19585a.contains(f)) {
            int i6 = 0;
            while (true) {
                if (i6 < f.length()) {
                    char charAt = f.charAt(i6);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                        break;
                    }
                    i6++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                z12 = false;
            }
        }
        if (z12) {
            StringBuilder sb2 = new StringBuilder();
            String f2 = eVar.f();
            i.f(f2, "asString()");
            sb2.append("`".concat(f2));
            sb2.append('`');
            return sb2.toString();
        }
        String f10 = eVar.f();
        i.f(f10, "asString()");
        return f10;
    }

    public static final String a0(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fu.e eVar = (fu.e) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(Z(eVar));
        }
        String sb3 = sb2.toString();
        i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final i0 b0(i0 i0Var, List newArguments, wu.v0 newAttributes) {
        i.g(i0Var, "<this>");
        i.g(newArguments, "newArguments");
        i.g(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == i0Var.N0()) {
            return i0Var;
        }
        if (newArguments.isEmpty()) {
            return i0Var.U0(newAttributes);
        }
        return wu.c0.f(newAttributes, i0Var.O0(), newArguments, i0Var.P0(), null);
    }

    public static final kotlinx.coroutines.internal.c c(ls.f fVar) {
        if (fVar.e(c1.b.f23496u) == null) {
            fVar = fVar.h(new e1(null));
        }
        return new kotlinx.coroutines.internal.c(fVar);
    }

    public static wu.b0 c0(wu.b0 b0Var, List newArguments, ht.h newAnnotations, int i6) {
        List newArgumentsForUpperBound;
        if ((i6 & 1) != 0) {
            newArguments = b0Var.M0();
        }
        if ((i6 & 2) != 0) {
            newAnnotations = b0Var.getAnnotations();
        }
        if ((i6 & 4) != 0) {
            newArgumentsForUpperBound = newArguments;
        } else {
            newArgumentsForUpperBound = null;
        }
        i.g(b0Var, "<this>");
        i.g(newArguments, "newArguments");
        i.g(newAnnotations, "newAnnotations");
        i.g(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((!newArguments.isEmpty() && newArguments != b0Var.M0()) || newAnnotations != b0Var.getAnnotations()) {
            wu.v0 N0 = b0Var.N0();
            if ((newAnnotations instanceof ht.l) && newAnnotations.isEmpty()) {
                newAnnotations = h.a.f19495a;
            }
            wu.v0 g1 = ca.a.g1(N0, newAnnotations);
            m1 R0 = b0Var.R0();
            if (R0 instanceof wu.v) {
                wu.v vVar = (wu.v) R0;
                return wu.c0.c(b0(vVar.f37298v, newArguments, g1), b0(vVar.f37299w, newArgumentsForUpperBound, g1));
            } else if (R0 instanceof i0) {
                return b0((i0) R0, newArguments, g1);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b0Var;
    }

    public static final void d(Appendable appendable, Object obj, ss.l lVar) {
        boolean z10;
        i.g(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static /* synthetic */ i0 d0(i0 i0Var, List list, wu.v0 v0Var, int i6) {
        if ((i6 & 1) != 0) {
            list = i0Var.M0();
        }
        if ((i6 & 2) != 0) {
            v0Var = i0Var.N0();
        }
        return b0(i0Var, list, v0Var);
    }

    public static final bv.a e(wu.b0 type) {
        Object e0;
        n1 b10;
        bv.d dVar;
        i.g(type, "type");
        if (ca.a.J0(type)) {
            bv.a e10 = e(ca.a.V0(type));
            bv.a e11 = e(ca.a.A1(type));
            return new bv.a(ca.a.B0(wu.c0.c(ca.a.V0((wu.b0) e10.f4719a), ca.a.A1((wu.b0) e11.f4719a)), type), ca.a.B0(wu.c0.c(ca.a.V0((wu.b0) e10.f4720b), ca.a.A1((wu.b0) e11.f4720b)), type));
        }
        x0 O0 = type.O0();
        boolean z10 = true;
        if (type.O0() instanceof ju.b) {
            i.e(O0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            d1 e12 = ((ju.b) O0).e();
            wu.b0 a10 = e12.a();
            i.f(a10, "typeProjection.type");
            wu.b0 k10 = k1.k(a10, type.P0());
            int ordinal = e12.b().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i0 o10 = hc.d.F(type).o();
                    i.f(o10, "type.builtIns.nothingType");
                    return new bv.a(k1.k(o10, type.P0()), k10);
                }
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + e12);
            }
            i0 p10 = hc.d.F(type).p();
            i.f(p10, "type.builtIns.nullableAnyType");
            return new bv.a(k10, p10);
        } else if (!type.M0().isEmpty() && type.M0().size() == O0.getParameters().size()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<d1> M0 = type.M0();
            List<v0> parameters = O0.getParameters();
            i.f(parameters, "typeConstructor.parameters");
            Iterator it = is.u.O2(M0, parameters).iterator();
            while (it.hasNext()) {
                hs.f fVar = (hs.f) it.next();
                d1 d1Var = (d1) fVar.f19464u;
                v0 typeParameter = (v0) fVar.f19465v;
                i.f(typeParameter, "typeParameter");
                n1 O2 = typeParameter.O();
                if (O2 != null) {
                    if (d1Var != null) {
                        j1 j1Var = j1.f37255b;
                        if (d1Var.d()) {
                            b10 = n1.OUT_VARIANCE;
                        } else {
                            b10 = j1.b(O2, d1Var.b());
                        }
                        int ordinal2 = b10.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    i0 o11 = mu.a.e(typeParameter).o();
                                    i.f(o11, "typeParameter.builtIns.nothingType");
                                    wu.b0 type2 = d1Var.a();
                                    i.f(type2, "type");
                                    dVar = new bv.d(typeParameter, o11, type2);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                wu.b0 type3 = d1Var.a();
                                i.f(type3, "type");
                                i0 p11 = mu.a.e(typeParameter).p();
                                i.f(p11, "typeParameter.builtIns.nullableAnyType");
                                dVar = new bv.d(typeParameter, type3, p11);
                            }
                        } else {
                            wu.b0 type4 = d1Var.a();
                            i.f(type4, "type");
                            wu.b0 type5 = d1Var.a();
                            i.f(type5, "type");
                            dVar = new bv.d(typeParameter, type4, type5);
                        }
                        if (d1Var.d()) {
                            arrayList.add(dVar);
                            arrayList2.add(dVar);
                        } else {
                            bv.a e13 = e(dVar.f4723b);
                            bv.a e14 = e(dVar.f4724c);
                            v0 v0Var = dVar.f4722a;
                            bv.d dVar2 = new bv.d(v0Var, (wu.b0) e13.f4720b, (wu.b0) e14.f4719a);
                            bv.d dVar3 = new bv.d(v0Var, (wu.b0) e13.f4719a, (wu.b0) e14.f4720b);
                            arrayList.add(dVar2);
                            arrayList2.add(dVar3);
                        }
                    } else {
                        j1.a(36);
                        throw null;
                    }
                } else {
                    j1.a(35);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bv.d dVar4 = (bv.d) it2.next();
                    dVar4.getClass();
                    if (!xu.c.f38095a.d(dVar4.f4723b, dVar4.f4724c)) {
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                e0 = hc.d.F(type).o();
                i.f(e0, "type.builtIns.nothingType");
            } else {
                e0 = e0(arrayList, type);
            }
            return new bv.a(e0, e0(arrayList2, type));
        } else {
            return new bv.a(type, type);
        }
    }

    public static final wu.b0 e0(ArrayList arrayList, wu.b0 b0Var) {
        f1 f1Var;
        boolean z10;
        b0Var.M0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bv.d dVar = (bv.d) it.next();
            dVar.getClass();
            xu.c.f38095a.d(dVar.f4723b, dVar.f4724c);
            wu.b0 b0Var2 = dVar.f4723b;
            wu.b0 b0Var3 = dVar.f4724c;
            if (!i.b(b0Var2, b0Var3)) {
                v0 v0Var = dVar.f4722a;
                n1 O2 = v0Var.O();
                n1 n1Var = n1.IN_VARIANCE;
                if (O2 != n1Var) {
                    boolean F2 = dt.j.F(b0Var2);
                    n1 n1Var2 = n1.OUT_VARIANCE;
                    n1 n1Var3 = n1.INVARIANT;
                    if (F2 && v0Var.O() != n1Var) {
                        if (n1Var2 == v0Var.O()) {
                            n1Var2 = n1Var3;
                        }
                        f1Var = new f1(b0Var3, n1Var2);
                    } else if (b0Var3 != null) {
                        if (dt.j.y(b0Var3) && b0Var3.P0()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (n1Var == v0Var.O()) {
                                n1Var = n1Var3;
                            }
                            f1Var = new f1(b0Var2, n1Var);
                        } else {
                            if (n1Var2 == v0Var.O()) {
                                n1Var2 = n1Var3;
                            }
                            f1Var = new f1(b0Var3, n1Var2);
                        }
                    } else {
                        dt.j.a(140);
                        throw null;
                    }
                    arrayList2.add(f1Var);
                }
            }
            f1Var = new f1(b0Var2);
            arrayList2.add(f1Var);
        }
        return c0(b0Var, arrayList2, null, 6);
    }

    public static final i0 f(wu.b0 b0Var) {
        i0 i0Var;
        i.g(b0Var, "<this>");
        m1 R0 = b0Var.R0();
        if (R0 instanceof i0) {
            i0Var = (i0) R0;
        } else {
            i0Var = null;
        }
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + b0Var).toString());
    }

    public static final boolean f0(wu.b0 b0Var) {
        boolean z10;
        boolean z11;
        gt.g a10 = b0Var.O0().a();
        if (a10 != null) {
            if (iu.i.b(a10) && !i.b(mu.a.g((gt.e) a10), dt.n.f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = true;
                if (z10 && !L(b0Var)) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
        return true;
    }

    public static String g(int i6, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g0(u7.i iVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        long j10;
        int i6;
        boolean z14;
        long length = iVar.getLength();
        long j11 = 4096;
        long j12 = -1;
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i10 != 0 && length <= 4096) {
            j11 = length;
        }
        int i11 = (int) j11;
        c9.q qVar = new c9.q(64);
        boolean z15 = false;
        int i12 = 0;
        boolean z16 = false;
        while (i12 < i11) {
            qVar.x(8);
            if (!iVar.d(qVar.f5186a, z15 ? 1 : 0, 8, true)) {
                break;
            }
            long r = qVar.r();
            int c10 = qVar.c();
            if (r == 1) {
                iVar.b(8, qVar.f5186a, 8);
                i6 = 16;
                qVar.z(16);
                j10 = qVar.j();
            } else {
                if (r == 0) {
                    long length2 = iVar.getLength();
                    if (length2 != j12) {
                        r = (length2 - iVar.e()) + 8;
                    }
                }
                j10 = r;
                i6 = 8;
            }
            long j13 = i6;
            if (j10 < j13) {
                return z15;
            }
            i12 += i6;
            if (c10 == 1836019574) {
                i11 += (int) j10;
                if (i10 != 0 && i11 > length) {
                    i11 = (int) length;
                }
                j12 = -1;
            } else if (c10 != 1836019558 && c10 != 1836475768) {
                if ((i12 + j10) - j13 >= i11) {
                    break;
                }
                int i13 = (int) (j10 - j13);
                i12 += i13;
                if (c10 == 1718909296) {
                    if (i13 < 8) {
                        return false;
                    }
                    qVar.x(i13);
                    iVar.b(0, qVar.f5186a, i13);
                    int i14 = i13 / 4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            break;
                        }
                        if (i15 == 1) {
                            qVar.B(4);
                        } else {
                            int c11 = qVar.c();
                            if ((c11 >>> 8) != 3368816 && (c11 != 1751476579 || !z11)) {
                                int[] iArr = f23459u;
                                for (int i16 = 0; i16 < 29; i16++) {
                                    if (iArr[i16] != c11) {
                                    }
                                }
                                z14 = false;
                                if (!z14) {
                                    z16 = true;
                                    break;
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                        }
                        i15++;
                    }
                    if (!z16) {
                        return false;
                    }
                } else if (i13 != 0) {
                    iVar.f(i13);
                }
                j12 = -1;
                z15 = false;
            } else {
                z12 = true;
                z13 = true;
                break;
            }
        }
        z12 = true;
        z13 = false;
        if (!z16 || z10 != z13) {
            return false;
        }
        return z12;
    }

    public static String h(int i6, boolean z10, int i10, int i11, int[] iArr, int i12) {
        char c10;
        Object[] objArr = new Object[5];
        objArr[0] = f23461w[i6];
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        objArr[3] = Character.valueOf(c10);
        objArr[4] = Integer.valueOf(i12);
        StringBuilder sb2 = new StringBuilder(c9.w.k("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i13 = 0; i13 < length; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    public static final xs.d h0(xs.f fVar, int i6) {
        boolean z10;
        i.g(fVar, "<this>");
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer step = Integer.valueOf(i6);
        i.g(step, "step");
        if (z10) {
            if (fVar.f37998w <= 0) {
                i6 = -i6;
            }
            return new xs.d(fVar.f37996u, fVar.f37997v, i6);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static final gt.q i0(gt.c1 c1Var) {
        i.g(c1Var, "<this>");
        gt.q qVar = (gt.q) pt.t.f28957d.get(c1Var);
        if (qVar == null) {
            return gt.p.g(c1Var);
        }
        return qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(dg.a aVar, ig.a aVar2, ig.c cVar, int i6, jg.b bVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        for (byte[] bArr : (byte[][]) bVar.f22016d) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = J[0].length;
        r(0, 0, bVar);
        r(bVar.f22014b - length, 0, bVar);
        r(0, bVar.f22014b - length, bVar);
        q(0, 7, bVar);
        q(bVar.f22014b - 8, 7, bVar);
        q(0, bVar.f22014b - 8, bVar);
        s(7, 0, bVar);
        s((bVar.f22015c - 7) - 1, 0, bVar);
        s(7, bVar.f22015c - 7, bVar);
        if (bVar.a(8, bVar.f22015c - 8) != 0) {
            bVar.b(8, bVar.f22015c - 8, 1);
            int i16 = 5;
            int i17 = cVar.f20039a;
            if (i17 >= 2) {
                int[] iArr = L[i17 - 1];
                int length2 = iArr.length;
                int i18 = 0;
                while (i18 < length2) {
                    int i19 = iArr[i18];
                    if (i19 >= 0) {
                        int length3 = iArr.length;
                        int i20 = 0;
                        while (i20 < length3) {
                            int i21 = iArr[i20];
                            if (i21 >= 0 && F(bVar.a(i21, i19))) {
                                int i22 = i21 - 2;
                                int i23 = i19 - 2;
                                int i24 = 0;
                                while (i24 < i16) {
                                    int[] iArr2 = K[i24];
                                    int i25 = 0;
                                    while (i25 < i16) {
                                        bVar.b(i22 + i25, i23 + i24, iArr2[i25]);
                                        i25++;
                                        i16 = 5;
                                    }
                                    i24++;
                                    i16 = 5;
                                }
                            }
                            i20++;
                            i16 = 5;
                        }
                    }
                    i18++;
                    i16 = 5;
                }
            }
            int i26 = 8;
            while (i26 < bVar.f22014b - 8) {
                int i27 = i26 + 1;
                int i28 = i27 % 2;
                if (F(bVar.a(i26, 6))) {
                    bVar.b(i26, 6, i28);
                }
                if (F(bVar.a(6, i26))) {
                    bVar.b(6, i26, i28);
                }
                i26 = i27;
            }
            dg.a aVar3 = new dg.a();
            if (i6 >= 0 && i6 < 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i29 = (aVar2.f20031u << 3) | i6;
                aVar3.b(i29, 5);
                aVar3.b(k(i29, 1335), 10);
                dg.a aVar4 = new dg.a();
                aVar4.b(21522, 15);
                if (aVar3.f12845v == aVar4.f12845v) {
                    int i30 = 0;
                    while (true) {
                        int[] iArr3 = aVar3.f12844u;
                        if (i30 >= iArr3.length) {
                            break;
                        }
                        iArr3[i30] = iArr3[i30] ^ aVar4.f12844u[i30];
                        i30++;
                    }
                    if (aVar3.f12845v == 15) {
                        int i31 = 0;
                        while (true) {
                            int i32 = aVar3.f12845v;
                            if (i31 >= i32) {
                                break;
                            }
                            boolean d10 = aVar3.d((i32 - 1) - i31);
                            int[] iArr4 = M[i31];
                            bVar.c(iArr4[0], iArr4[1], d10);
                            if (i31 < 8) {
                                bVar.c((bVar.f22014b - i31) - 1, 8, d10);
                            } else {
                                bVar.c(8, (i31 - 8) + (bVar.f22015c - 7), d10);
                            }
                            i31++;
                        }
                        if (i17 >= 7) {
                            dg.a aVar5 = new dg.a();
                            aVar5.b(i17, 6);
                            aVar5.b(k(i17, 7973), 12);
                            if (aVar5.f12845v == 18) {
                                int i33 = 17;
                                for (int i34 = 0; i34 < 6; i34++) {
                                    for (int i35 = 0; i35 < 3; i35++) {
                                        boolean d11 = aVar5.d(i33);
                                        i33--;
                                        bVar.c(i34, (bVar.f22015c - 11) + i35, d11);
                                        bVar.c((bVar.f22015c - 11) + i35, i34, d11);
                                    }
                                }
                            } else {
                                throw new WriterException("should not happen but we got: " + aVar5.f12845v);
                            }
                        }
                        int i36 = bVar.f22014b - 1;
                        int i37 = bVar.f22015c - 1;
                        int i38 = 0;
                        int i39 = -1;
                        while (i36 > 0) {
                            if (i36 == 6) {
                                i36--;
                            }
                            while (i37 >= 0 && i37 < bVar.f22015c) {
                                for (int i40 = 0; i40 < 2; i40++) {
                                    int i41 = i36 - i40;
                                    if (F(bVar.a(i41, i37))) {
                                        if (i38 < aVar.f12845v) {
                                            z11 = aVar.d(i38);
                                            i38++;
                                        } else {
                                            z11 = false;
                                        }
                                        if (i6 != -1) {
                                            switch (i6) {
                                                case 0:
                                                    i10 = i37 + i41;
                                                    i11 = i10;
                                                    i13 = i11 & 1;
                                                    if (i13 != 0) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (z12) {
                                                        z11 = !z11;
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    i11 = i37;
                                                    i13 = i11 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                case 2:
                                                    i12 = i41 % 3;
                                                    i13 = i12;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                case 3:
                                                    i12 = (i37 + i41) % 3;
                                                    i13 = i12;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                case 4:
                                                    i10 = (i41 / 3) + (i37 / 2);
                                                    i11 = i10;
                                                    i13 = i11 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                case 5:
                                                    int i42 = i37 * i41;
                                                    i12 = (i42 % 3) + (i42 & 1);
                                                    i13 = i12;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                case 6:
                                                    int i43 = i37 * i41;
                                                    i14 = i43 & 1;
                                                    i15 = i43 % 3;
                                                    i10 = i15 + i14;
                                                    i11 = i10;
                                                    i13 = i11 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                case 7:
                                                    i15 = (i37 * i41) % 3;
                                                    i14 = (i37 + i41) & 1;
                                                    i10 = i15 + i14;
                                                    i11 = i10;
                                                    i13 = i11 & 1;
                                                    if (i13 != 0) {
                                                    }
                                                    if (z12) {
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i6)));
                                            }
                                        }
                                        bVar.c(i41, i37, z11);
                                    }
                                }
                                i37 += i39;
                            }
                            i39 = -i39;
                            i37 += i39;
                            i36 -= 2;
                        }
                        if (i38 == aVar.f12845v) {
                            return;
                        }
                        throw new WriterException("Not all bits consumed: " + i38 + '/' + aVar.f12845v);
                    }
                    throw new WriterException("should not happen but we got: " + aVar3.f12845v);
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    public static final Class j0(ClassLoader classLoader, String fqName) {
        i.g(classLoader, "<this>");
        i.g(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static int k(int i6, int i10) {
        if (i10 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i10);
            int i11 = i6 << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i11) >= numberOfLeadingZeros) {
                i11 ^= i10 << ((32 - Integer.numberOfLeadingZeros(i11)) - numberOfLeadingZeros);
            }
            return i11;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static final xs.f k0(int i6, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            xs.f fVar = xs.f.f38003x;
            return xs.f.f38003x;
        }
        return new xs.f(i6, i10 - 1);
    }

    public static final void l(d0 d0Var, CancellationException cancellationException) {
        ls.f f02 = d0Var.f0();
        int i6 = c1.f23495m;
        c1 c1Var = (c1) f02.e(c1.b.f23496u);
        if (c1Var != null) {
            c1Var.g(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + d0Var).toString());
    }

    public static final t.j l0(t.i receiver$0) {
        i.h(receiver$0, "receiver$0");
        return new t.j(receiver$0);
    }

    public static void m(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static final i0 m0(i0 i0Var, i0 abbreviatedType) {
        i.g(i0Var, "<this>");
        i.g(abbreviatedType, "abbreviatedType");
        if (ta.v.E(i0Var)) {
            return i0Var;
        }
        return new wu.a(i0Var, abbreviatedType);
    }

    public static final void n(e0 e0Var, fu.c fqName, ArrayList arrayList) {
        i.g(e0Var, "<this>");
        i.g(fqName, "fqName");
        if (e0Var instanceof g0) {
            ((g0) e0Var).a(fqName, arrayList);
        } else {
            arrayList.addAll(e0Var.c(fqName));
        }
    }

    public static e8 n0(e4 e4Var) {
        w3 w3Var;
        com.google.android.gms.internal.p000firebaseauthapi.q qVar = new com.google.android.gms.internal.p000firebaseauthapi.q();
        b8 b8Var = e4Var.f7816d;
        if (((ArrayList) qVar.f8071v) != null) {
            qVar.f8072w = b8Var;
            for (List<f4> list : e4Var.f7813a.values()) {
                for (f4 f4Var : list) {
                    int i6 = f4Var.f - 2;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                w3Var = w3.f8222d;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                        } else {
                            w3Var = w3.f8221c;
                        }
                    } else {
                        w3Var = w3.f8220b;
                    }
                    d7 z10 = f4Var.f7848e.z();
                    ArrayList arrayList = (ArrayList) qVar.f8071v;
                    if (arrayList != null) {
                        arrayList.add(new d8(w3Var, f4Var.f7847d, z10));
                    } else {
                        throw new IllegalStateException("addEntry cannot be called after build()");
                    }
                }
            }
            f4 f4Var2 = e4Var.f7814b;
            if (f4Var2 != null) {
                if (((ArrayList) qVar.f8071v) != null) {
                    qVar.f8073x = Integer.valueOf(f4Var2.f7847d);
                } else {
                    throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
                }
            }
            try {
                return qVar.c();
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public static final zu.h o(zu.h hVar, HashSet hashSet) {
        zu.h o10;
        boolean z10;
        f6.b bVar = f6.b.M;
        zu.l l02 = a.C0645a.l0(bVar, hVar);
        if (!hashSet.add(l02)) {
            return null;
        }
        v0 y10 = a.C0645a.y(l02);
        if (y10 != null) {
            wu.b0 v10 = a.C0645a.v(y10);
            o10 = o(v10, hashSet);
            if (o10 == null) {
                return null;
            }
            if (!a.C0645a.M(a.C0645a.l0(bVar, v10)) && (!(v10 instanceof zu.i) || !a.C0645a.S((zu.i) v10))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((o10 instanceof zu.i) && a.C0645a.S((zu.i) o10) && a.C0645a.R(hVar) && z10) {
                return bVar.M0(v10);
            }
            if (!a.C0645a.R(o10) && bVar.J0(hVar)) {
                return bVar.M0(o10);
            }
        } else if (a.C0645a.M(l02)) {
            i0 z11 = a.C0645a.z(hVar);
            if (z11 == null || (o10 = o(z11, hashSet)) == null) {
                return null;
            }
            if (a.C0645a.R(hVar)) {
                if (!a.C0645a.R(o10)) {
                    if (!(o10 instanceof zu.i) || !a.C0645a.S((zu.i) o10)) {
                        return bVar.M0(o10);
                    }
                    return hVar;
                }
                return hVar;
            }
        } else {
            return hVar;
        }
        return o10;
    }

    public static String o0(String str, List list) {
        String str2;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String upperCase = str.toUpperCase();
        if (!upperCase.matches("[A-F0-9]+")) {
            if (str.length() != 0) {
                str2 = "Invalid application ID: ".concat(str);
            } else {
                str2 = new String("Invalid application ID: ");
            }
            throw new IllegalArgumentException(str2);
        }
        sb2.append("/");
        sb2.append(upperCase);
        if (list != null) {
            if (!list.isEmpty()) {
                sb2.append("/");
                Iterator it = list.iterator();
                boolean z10 = true;
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    p9.a.d(str3);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!p9.a.f28027a.matcher(str3).matches()) {
                        StringBuilder sb3 = new StringBuilder(str3.length());
                        for (int i6 = 0; i6 < str3.length(); i6++) {
                            char charAt = str3.charAt(i6);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str3 = sb3.toString();
                    }
                    sb2.append(str3);
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (list == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static final Collection p(Collection collection, Collection collection2) {
        i.g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static String p0(String str, Object... objArr) {
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

    public static void q(int i6, int i10, jg.b bVar) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i6 + i11;
            if (F(bVar.a(i12, i10))) {
                bVar.b(i12, i10, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static /* synthetic */ boolean q0(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void r(int i6, int i10, jg.b bVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = J[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                bVar.b(i6 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static String r0(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i6 = 0; i6 < min; i6++) {
            String str2 = strArr[i6];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i6];
            }
        }
        return null;
    }

    public static void s(int i6, int i10, jg.b bVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (F(bVar.a(i6, i12))) {
                bVar.b(i6, i12, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static ArrayList s0(List list) {
        fd.n nVar;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.p000firebaseauthapi.a aVar = (com.google.android.gms.internal.p000firebaseauthapi.a) it.next();
                if (aVar != null && !TextUtils.isEmpty(aVar.f7695u)) {
                    String str = aVar.f7696v;
                    String str2 = aVar.f7697w;
                    long j10 = aVar.f7698x;
                    String str3 = aVar.f7695u;
                    v9.o.e(str3);
                    nVar = new fd.n(j10, str, str2, str3);
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:13:0x002d, B:26:0x0063, B:28:0x0067, B:30:0x006b, B:33:0x0071, B:41:0x007f, B:42:0x0080, B:44:0x0084, B:49:0x0095, B:51:0x0099, B:53:0x00a0, B:54:0x00a1, B:55:0x00b8, B:18:0x0042), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:13:0x002d, B:26:0x0063, B:28:0x0067, B:30:0x006b, B:33:0x0071, B:41:0x007f, B:42:0x0080, B:44:0x0084, B:49:0x0095, B:51:0x0099, B:53:0x00a0, B:54:0x00a1, B:55:0x00b8, B:18:0x0042), top: B:65:0x0021 }] */
    /* JADX WARN: Type inference failed for: r8v5, types: [iv.s] */
    /* JADX WARN: Type inference failed for: r8v7, types: [iv.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0090 -> B:14:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(kotlinx.coroutines.flow.e eVar, iv.p pVar, boolean z10, ls.d dVar) {
        kotlinx.coroutines.flow.f fVar;
        int i6;
        iv.p pVar2;
        Object obj;
        kotlinx.coroutines.flow.e eVar2;
        iv.p pVar3;
        boolean z11;
        Throwable th2;
        i.a aVar;
        Throwable th3;
        iv.p pVar4;
        try {
            if (dVar instanceof kotlinx.coroutines.flow.f) {
                fVar = (kotlinx.coroutines.flow.f) dVar;
                int i10 = fVar.f23517y;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    fVar.f23517y = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = fVar.f23516x;
                    ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                    i6 = fVar.f23517y;
                    if (i6 == 0) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                z11 = fVar.f23515w;
                                ?? r82 = fVar.f23514v;
                                eVar2 = fVar.f23513u;
                                sp.b.d0(obj2);
                                iv.p pVar5 = r82;
                                kotlinx.coroutines.flow.e eVar3 = eVar2;
                                z10 = z11;
                                eVar = eVar3;
                                pVar4 = pVar5;
                                try {
                                    fVar.f23513u = eVar;
                                    fVar.f23514v = pVar4;
                                    fVar.f23515w = z10;
                                    fVar.f23517y = 1;
                                    obj = pVar4.l(fVar);
                                    if (obj == aVar2) {
                                        return aVar2;
                                    }
                                    boolean z12 = z10;
                                    eVar2 = eVar;
                                    z11 = z12;
                                    pVar3 = pVar4;
                                    if (obj instanceof i.a) {
                                        if (obj instanceof i.a) {
                                            aVar = (i.a) obj;
                                        } else {
                                            aVar = null;
                                        }
                                        if (aVar != null) {
                                            th3 = aVar.f20747a;
                                        } else {
                                            th3 = null;
                                        }
                                        if (th3 == null) {
                                            if (z11) {
                                                sp.b.e(pVar3, null);
                                            }
                                            return hs.k.f19476a;
                                        }
                                        throw th3;
                                    } else if (!(obj instanceof i.b)) {
                                        fVar.f23513u = eVar2;
                                        fVar.f23514v = pVar3;
                                        fVar.f23515w = z11;
                                        fVar.f23517y = 2;
                                        pVar5 = pVar3;
                                        if (eVar2.b(obj, fVar) == aVar2) {
                                            return aVar2;
                                        }
                                        kotlinx.coroutines.flow.e eVar32 = eVar2;
                                        z10 = z11;
                                        eVar = eVar32;
                                        pVar4 = pVar5;
                                        fVar.f23513u = eVar;
                                        fVar.f23514v = pVar4;
                                        fVar.f23515w = z10;
                                        fVar.f23517y = 1;
                                        obj = pVar4.l(fVar);
                                        if (obj == aVar2) {
                                        }
                                    } else if ((obj instanceof i.a) && (th2 = ((i.a) obj).f20747a) != null) {
                                        throw th2;
                                    } else {
                                        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
                                    }
                                } catch (Throwable th4) {
                                    boolean z13 = z10;
                                    th = th4;
                                    eVar = z13;
                                    pVar2 = pVar4;
                                    try {
                                        throw th;
                                    } catch (Throwable th5) {
                                        if (eVar != null) {
                                            sp.b.e(pVar2, th);
                                        }
                                        throw th5;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z11 = fVar.f23515w;
                            ?? r83 = fVar.f23514v;
                            eVar2 = fVar.f23513u;
                            sp.b.d0(obj2);
                            obj = ((iv.i) obj2).f20746a;
                            pVar3 = r83;
                            if (obj instanceof i.a) {
                            }
                        }
                    } else {
                        sp.b.d0(obj2);
                        pVar4 = pVar;
                        if (eVar instanceof kotlinx.coroutines.flow.b0) {
                            ((kotlinx.coroutines.flow.b0) eVar).getClass();
                            throw null;
                        }
                        fVar.f23513u = eVar;
                        fVar.f23514v = pVar4;
                        fVar.f23515w = z10;
                        fVar.f23517y = 1;
                        obj = pVar4.l(fVar);
                        if (obj == aVar2) {
                        }
                    }
                }
            }
            if (i6 == 0) {
            }
        } catch (Throwable th6) {
            th = th6;
            pVar2 = pVar;
        }
        fVar = new kotlinx.coroutines.flow.f(dVar);
        Object obj22 = fVar.f23516x;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = fVar.f23517y;
    }

    public static String t0(Context context, String str) {
        v9.o.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = s3.a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static final yt.o u(yt.n nVar, fu.b classId) {
        i.g(nVar, "<this>");
        i.g(classId, "classId");
        n.a.b a10 = nVar.a(classId);
        if (a10 != null) {
            return a10.f39053a;
        }
        return null;
    }

    public static File v(Context context) {
        i.g(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        i.f(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public static final Object w(g.c cVar, g.e extension) {
        i.g(cVar, "<this>");
        i.g(extension, "extension");
        if (cVar.l(extension)) {
            return cVar.k(extension);
        }
        return null;
    }

    public static final Object x(g.c cVar, g.e eVar, int i6) {
        int size;
        i.g(cVar, "<this>");
        cVar.p(eVar);
        gu.f<g.d> fVar = cVar.f16859u;
        fVar.getClass();
        g.d dVar = eVar.f16870d;
        if (dVar.f16865w) {
            Object e10 = fVar.e(dVar);
            if (e10 == null) {
                size = 0;
            } else {
                size = ((List) e10).size();
            }
            if (i6 < size) {
                cVar.p(eVar);
                if (dVar.f16865w) {
                    Object e11 = fVar.e(dVar);
                    if (e11 != null) {
                        return eVar.a(((List) e11).get(i6));
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            return null;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ys.d y(ys.e eVar) {
        gt.e eVar2;
        boolean z10;
        if (eVar instanceof ys.d) {
            return (ys.d) eVar;
        }
        if (eVar instanceof ys.o) {
            List<ys.n> upperBounds = ((ys.o) eVar).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                eVar2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ys.n nVar = (ys.n) next;
                i.e(nVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                gt.g a10 = ((j0) nVar).f3527u.O0().a();
                if (a10 instanceof gt.e) {
                    eVar2 = (gt.e) a10;
                }
                if (eVar2 != null && eVar2.j() != 2 && eVar2.j() != 5) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    eVar2 = next;
                    break;
                }
            }
            ys.n nVar2 = (ys.n) eVar2;
            if (nVar2 == null) {
                nVar2 = (ys.n) is.u.i2(upperBounds);
            }
            if (nVar2 != null) {
                return z(nVar2);
            }
            return y.a(Object.class);
        }
        throw new hs.e("Cannot calculate JVM erasure for type: " + eVar, 2);
    }

    public static final ys.d z(ys.n nVar) {
        ys.d y10;
        i.g(nVar, "<this>");
        ys.e f = nVar.f();
        if (f != null && (y10 = y(f)) != null) {
            return y10;
        }
        throw new hs.e("Cannot calculate JVM erasure for type: " + nVar, 2);
    }

    public boolean M(String trackedUniqueId, Set uniqueIdRegexList) {
        i.g(uniqueIdRegexList, "uniqueIdRegexList");
        i.g(trackedUniqueId, "trackedUniqueId");
        if (gv.n.B0(trackedUniqueId)) {
            hh.a aVar = hh.g.f17610d;
            g.a.b(2, qg.u.f29576u, 2);
            return false;
        }
        try {
            Iterator it = uniqueIdRegexList.iterator();
            while (it.hasNext()) {
                if (Pattern.matches((String) it.next(), trackedUniqueId)) {
                    return false;
                }
            }
        } catch (Exception e10) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, e10, new qg.v(this));
        }
        return true;
    }

    @Override // lv.l
    public void a(lv.t url) {
        i.g(url, "url");
    }

    @Override // lv.l
    public void b(lv.t url, List list) {
        i.g(url, "url");
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public void errorLoadingData(Exception error) {
        i.g(error, "error");
    }

    @Override // c4.o
    public void i(c4.g gVar, List list) {
        i.g(gVar, "<anonymous parameter 0>");
        LogHelper.INSTANCE.d(PaymentUtils.INSTANCE.getTAG(), "purchase updated");
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public void notificationFetchComplete(boolean z10) {
        ApplicationPersistence.getInstance().setBooleanValueAsync("old_user_notification_reset", false);
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public void audioDownloadComplete() {
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public void courseApiComplete(boolean z10) {
    }
}
