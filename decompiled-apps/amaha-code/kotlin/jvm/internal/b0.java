package kotlin.jvm.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import com.google.android.gms.internal.measurement.l8;
import com.theinnerhour.b2b.R;
import gt.b;
import gt.d0;
import gt.v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y0;
import kotlinx.coroutines.z0;
import lv.g0;
import t0.p0;
import ta.h2;
import ta.j2;
import xu.d;
import xu.e;
/* compiled from: PrimitiveCompanionObjects.kt */
/* loaded from: classes2.dex */
public class b0 implements aa.c, k3.a0, lv.b, ya.b, p0, h2 {
    public static int U = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final b0 f23449u = new b0();

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f23450v = {R.attr.freezesAnimation, R.attr.loopCount};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f23451w = {"_id", "gtime", "details"};

    /* renamed from: x  reason: collision with root package name */
    public static final b0 f23452x = new b0();

    /* renamed from: y  reason: collision with root package name */
    public static final b0 f23453y = new b0();

    /* renamed from: z  reason: collision with root package name */
    public static final b0 f23454z = new b0();
    public static final b0 A = new b0();
    public static final b0 B = new b0();
    public static final b0 C = new b0();
    public static final b0 D = new b0();
    public static final int[] E = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] F = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] G = {67108863, 33554431};
    public static final int[] H = {26, 25};
    public static final b0 I = new b0();
    public static final b0 J = new b0();
    public static final kotlinx.coroutines.internal.r K = new kotlinx.coroutines.internal.r("NULL");
    public static final b0 L = new b0();
    public static final kotlinx.coroutines.internal.r M = new kotlinx.coroutines.internal.r("COMPLETING_ALREADY");
    public static final kotlinx.coroutines.internal.r N = new kotlinx.coroutines.internal.r("COMPLETING_WAITING_CHILDREN");
    public static final kotlinx.coroutines.internal.r O = new kotlinx.coroutines.internal.r("COMPLETING_RETRY");
    public static final kotlinx.coroutines.internal.r P = new kotlinx.coroutines.internal.r("TOO_LATE_TO_CANCEL");
    public static final kotlinx.coroutines.internal.r Q = new kotlinx.coroutines.internal.r("SEALED");
    public static final q0 R = new q0(false);
    public static final q0 S = new q0(true);
    public static final kotlinx.coroutines.internal.r T = new kotlinx.coroutines.internal.r("CONDITION_FALSE");
    public static final /* synthetic */ b0 V = new b0();
    public static final /* synthetic */ b0 W = new b0();
    public static final String[] X = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] Y = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] Z = {"items"};

    /* renamed from: a0  reason: collision with root package name */
    public static final String[] f23446a0 = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f23447b0 = {16842755};
    public static final int[] c0 = {16842755};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f23448d0 = {R.attr.defaultNavHost};

    public static void A(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = j11 + j11;
        long j13 = jArr2[1];
        long j14 = (jArr2[2] * j11) + (j13 * j13);
        long j15 = jArr2[2];
        long j16 = (jArr2[3] * j11) + (j13 * j15);
        long j17 = jArr2[3];
        long j18 = j12 * jArr2[4];
        long j19 = jArr2[4];
        long j20 = (jArr2[5] * j11) + (j13 * j19) + (j15 * j17);
        long j21 = jArr2[5];
        long j22 = ((j13 + j13) * j21) + (jArr2[6] * j11) + (j15 * j19) + (j17 * j17);
        long j23 = jArr2[6];
        long j24 = (jArr2[7] * j11) + (j13 * j23) + (j15 * j21) + (j17 * j19);
        long j25 = jArr2[8];
        long j26 = jArr2[7];
        long j27 = (j17 * j21) + (j13 * j26);
        long j28 = j27 + j27 + (j25 * j11) + (j15 * j23);
        long j29 = jArr2[8];
        long j30 = (j11 * jArr2[9]) + (j13 * j29) + (j15 * j26) + (j17 * j23) + (j19 * j21);
        long j31 = jArr2[9];
        long j32 = (j13 * j31) + (j17 * j26);
        long j33 = j32 + j32 + (j15 * j29) + (j19 * j23) + (j21 * j21);
        long j34 = (j15 * j31) + (j17 * j29) + (j19 * j26) + (j21 * j23);
        long j35 = (j17 * j31) + (j21 * j26);
        long j36 = j35 + j35 + (j19 * j29);
        long j37 = (j19 * j31) + (j21 * j29) + (j23 * j26);
        long j38 = ((j21 + j21) * j31) + (j23 * j29) + (j26 * j26);
        long j39 = (j23 * j31) + (j26 * j29);
        long[] jArr3 = {j10 * j10, jArr2[1] * j12, j14 + j14, j16 + j16, j18 + (j13 * 4 * j17) + (j15 * j15), j20 + j20, j22 + j22, j24 + j24, j28 + j28 + (j19 * j19), j30 + j30, j33 + j33, j34 + j34, j36 + j36 + (j23 * j23), j37 + j37, j38 + j38, j39 + j39, (j26 * 4 * j31) + (j29 * j29), (j29 + j29) * j31, (j31 + j31) * j31};
        z(jArr3);
        y(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void B(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i6 = 0; i6 < 10; i6++) {
            jArr[i6] = jArr2[i6] - jArr3[i6];
        }
    }

    public static void C(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i6 = 0; i6 < 10; i6++) {
            jArr[i6] = jArr2[i6] + jArr3[i6];
        }
    }

    public static byte[] D(long[] jArr) {
        int[] iArr;
        int i6;
        int i10;
        int[] iArr2;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i17 = 0;
        while (true) {
            iArr = H;
            if (i17 >= 2) {
                break;
            }
            int i18 = 0;
            while (i18 < 9) {
                long j12 = copyOf[i18];
                copyOf[i18] = j12 + (i16 << i15);
                i18++;
                copyOf[i18] = copyOf[i18] - (-((int) (((j12 >> 31) & j12) >> iArr[i18 & 1])));
            }
            long j13 = copyOf[9];
            int i19 = -((int) (((j13 >> 31) & j13) >> 25));
            copyOf[9] = j13 + (i19 << 25);
            copyOf[0] = copyOf[0] - (i19 * 19);
            i17++;
        }
        long j14 = copyOf[0];
        copyOf[0] = j14 + (i10 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j14 >> 31) & j14) >> 26)));
        int i20 = 0;
        while (true) {
            iArr2 = G;
            if (i20 >= 2) {
                break;
            }
            int i21 = 0;
            while (i21 < 9) {
                long j15 = copyOf[i21];
                int i22 = iArr[i21 & 1];
                copyOf[i21] = iArr2[i14] & j15;
                i21++;
                copyOf[i21] = copyOf[i21] + ((int) (j15 >> i22));
                iArr2 = iArr2;
            }
            i20++;
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (j10 >> 25)) * 19);
        int i23 = ~((((int) j11) - 67108845) >> 31);
        for (int i24 = 1; i24 < 10; i24++) {
            int i25 = ~(((int) copyOf[i24]) ^ iArr2[i24 & 1]);
            int i26 = i25 & (i25 << 16);
            int i27 = i26 & (i26 << 8);
            int i28 = i27 & (i27 << 4);
            int i29 = i28 & (i28 << 2);
            i23 &= (i29 & (i29 + i29)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i23);
        long j16 = 33554431 & i23;
        copyOf[1] = copyOf[1] - j16;
        for (i6 = 2; i6 < 10; i6 += 2) {
            copyOf[i6] = copyOf[i6] - (67108863 & i23);
            int i30 = i6 + 1;
            copyOf[i30] = copyOf[i30] - j16;
        }
        for (int i31 = 0; i31 < 10; i31++) {
            copyOf[i31] = copyOf[i31] << F[i31];
        }
        byte[] bArr = new byte[32];
        for (int i32 = 0; i32 < 10; i32++) {
            int i33 = E[i32];
            byte b10 = bArr[i33];
            long j17 = copyOf[i32];
            bArr[i33] = (byte) (b10 | (j17 & 255));
            bArr[i33 + 1] = (byte) (bArr[i11] | ((j17 >> 8) & 255));
            bArr[i33 + 2] = (byte) (bArr[i12] | ((j17 >> 16) & 255));
            bArr[i33 + 3] = (byte) (((j17 >> 24) & 255) | bArr[i13]);
        }
        return bArr;
    }

    public static boolean h(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (Integer.parseInt(Activity.class.getMethod("checkSelfPermission", String.class).invoke(context, str).toString()) == 0) {
            return true;
        }
        return false;
    }

    public static final m0 j(Fragment fragment, ys.d viewModelClass, ss.a aVar, ss.a aVar2, ss.a aVar3) {
        i.g(fragment, "<this>");
        i.g(viewModelClass, "viewModelClass");
        return new m0(viewModelClass, aVar, aVar3, aVar2);
    }

    public static void l(String str, String str2) {
        if (q(3)) {
            Log.d(str, str2);
        }
    }

    public static void m(String str, String str2) {
        if (q(6)) {
            Log.e(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        if (q(6)) {
            Log.e(str, str2, th2);
        }
    }

    public static final boolean p(String method) {
        i.g(method, "method");
        if (!i.b(method, "GET") && !i.b(method, "HEAD")) {
            return true;
        }
        return false;
    }

    public static boolean q(int i6) {
        if (U <= i6) {
            return true;
        }
        return false;
    }

    public static gt.q0 r(gt.a aVar) {
        while (aVar instanceof gt.b) {
            gt.b bVar = (gt.b) aVar;
            if (bVar.m0() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends gt.b> overriddenDescriptors = bVar.f();
            i.f(overriddenDescriptors, "overriddenDescriptors");
            aVar = (gt.b) is.u.z2(overriddenDescriptors);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.g();
    }

    public static final Object s(Object obj) {
        z0 z0Var;
        y0 y0Var;
        if (obj instanceof z0) {
            z0Var = (z0) obj;
        } else {
            z0Var = null;
        }
        if (z0Var != null && (y0Var = z0Var.f23720a) != null) {
            return y0Var;
        }
        return obj;
    }

    public static void t(String str, String str2) {
        if (q(2)) {
            Log.v(str, str2);
        }
    }

    public static void u(String str, String str2) {
        if (q(5)) {
            Log.w(str, str2);
        }
    }

    public static int v(int i6) {
        if (i6 != 1) {
            return i6 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        x(jArr4, jArr2, jArr3);
        z(jArr4);
        y(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static void x(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j10 = jArr2[0];
        long j11 = jArr2[1];
        long j12 = jArr3[0];
        jArr[1] = (j11 * j12) + (jArr3[1] * j10);
        long j13 = jArr2[1];
        long j14 = jArr3[1];
        jArr[2] = (jArr2[2] * j12) + (jArr3[2] * j10) + ((j13 + j13) * j14);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        jArr[3] = (jArr2[3] * j12) + (jArr3[3] * j10) + (j16 * j14) + (j13 * j15);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j18 * j14) + (j13 * j17);
        jArr[4] = (jArr2[4] * j12) + (jArr3[4] * j10) + j19 + j19 + (j16 * j15);
        long j20 = jArr3[4];
        long j21 = (j13 * j20) + (j18 * j15) + (j16 * j17);
        long j22 = jArr2[4];
        jArr[5] = (jArr2[5] * j12) + (jArr3[5] * j10) + (j22 * j14) + j21;
        long j23 = jArr3[5];
        long j24 = jArr2[5];
        long j25 = (j24 * j14) + (j13 * j23) + (j18 * j17);
        jArr[6] = (jArr2[6] * j12) + (jArr3[6] * j10) + (j22 * j15) + (j16 * j20) + j25 + j25;
        long j26 = (j24 * j15) + (j16 * j23) + (j22 * j17) + (j18 * j20);
        long j27 = jArr3[6];
        long j28 = (j13 * j27) + j26;
        long j29 = jArr2[6];
        jArr[7] = (jArr2[7] * j12) + (jArr3[7] * j10) + (j29 * j14) + j28;
        long j30 = jArr3[7];
        long j31 = (j13 * j30) + (j24 * j17) + (j18 * j23);
        long j32 = jArr2[7];
        long j33 = (j32 * j14) + j31;
        jArr[8] = (jArr2[8] * j12) + (jArr3[8] * j10) + (j29 * j15) + (j16 * j27) + j33 + j33 + (j22 * j20);
        long j34 = (j32 * j15) + (j16 * j30) + (j29 * j17) + (j18 * j27) + (j24 * j20) + (j22 * j23);
        long j35 = jArr3[8];
        long j36 = (j13 * j35) + j34;
        long j37 = jArr2[8];
        long j38 = (j37 * j14) + j36;
        jArr[9] = (jArr2[9] * j12) + (j10 * jArr3[9]) + j38;
        long j39 = (j32 * j17) + (j18 * j30) + (j24 * j23);
        long j40 = jArr3[9];
        long j41 = jArr2[9];
        long j42 = (j14 * j41) + (j13 * j40) + j39;
        long j43 = j29 * j20;
        jArr[10] = (j37 * j15) + (j16 * j35) + j43 + (j22 * j27) + j42 + j42;
        long j44 = j16 * j40;
        long j45 = j15 * j41;
        jArr[11] = j45 + j44 + (j37 * j17) + (j18 * j35) + (j32 * j20) + (j22 * j30) + (j29 * j23) + (j24 * j27);
        long j46 = j18 * j40;
        long j47 = j17 * j41;
        long j48 = j47 + j46 + (j32 * j23) + (j24 * j30);
        long j49 = j37 * j20;
        jArr[12] = j49 + (j22 * j35) + j48 + j48 + (j29 * j27);
        long j50 = j22 * j40;
        long j51 = j20 * j41;
        jArr[13] = j51 + j50 + (j37 * j23) + (j24 * j35) + (j32 * j27) + (j29 * j30);
        long j52 = j23 * j41;
        long j53 = j52 + (j24 * j40) + (j32 * j30);
        long j54 = j37 * j27;
        jArr[14] = j54 + (j29 * j35) + j53 + j53;
        long j55 = j29 * j40;
        long j56 = j27 * j41;
        jArr[15] = j56 + j55 + (j37 * j30) + (j32 * j35);
        long j57 = (j30 * j41) + (j32 * j40);
        jArr[16] = j57 + j57 + (j37 * j35);
        jArr[17] = (j35 * j41) + (j37 * j40);
        jArr[18] = (j41 + j41) * j40;
    }

    public static void y(long[] jArr) {
        jArr[10] = 0;
        int i6 = 0;
        while (i6 < 10) {
            long j10 = jArr[i6];
            long j11 = j10 / 67108864;
            jArr[i6] = j10 - (j11 << 26);
            int i10 = i6 + 1;
            long j12 = jArr[i10] + j11;
            jArr[i10] = j12;
            long j13 = j12 / 33554432;
            jArr[i10] = j12 - (j13 << 25);
            i6 += 2;
            jArr[i6] = jArr[i6] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void z(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    @Override // k3.a0
    public Object W(l3.c cVar, float f) {
        return k3.l.b(cVar, f);
    }

    @Override // ta.h2
    public Object a() {
        List list = j2.f32639a;
        return Long.valueOf(l8.f8459v.a().n());
    }

    public boolean f(gt.j jVar, gt.j jVar2, boolean z10, boolean z11) {
        if ((jVar instanceof gt.e) && (jVar2 instanceof gt.e)) {
            return i.b(((gt.e) jVar).l(), ((gt.e) jVar2).l());
        }
        if ((jVar instanceof v0) && (jVar2 instanceof v0)) {
            return g((v0) jVar, (v0) jVar2, z10, iu.e.f20687u);
        }
        if ((jVar instanceof gt.a) && (jVar2 instanceof gt.a)) {
            gt.a a10 = (gt.a) jVar;
            gt.a b10 = (gt.a) jVar2;
            e.a kotlinTypeRefiner = e.a.f38097b;
            i.g(a10, "a");
            i.g(b10, "b");
            i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (!i.b(a10, b10)) {
                if (i.b(a10.getName(), b10.getName()) && ((!z11 || !(a10 instanceof gt.y) || !(b10 instanceof gt.y) || ((gt.y) a10).M() == ((gt.y) b10).M()) && ((!i.b(a10.c(), b10.c()) || (z10 && i.b(r(a10), r(b10)))) && !iu.g.o(a10) && !iu.g.o(b10) && o(a10, b10, iu.c.f20681u, z10)))) {
                    iu.l lVar = new iu.l(new iu.d(a10, b10, z10), kotlinTypeRefiner, d.a.f38096v);
                    if (lVar.m(a10, b10, null, true).c() != 1 || lVar.m(b10, a10, null, true).c() != 1) {
                    }
                }
                return false;
            }
            return true;
        } else if ((jVar instanceof d0) && (jVar2 instanceof d0)) {
            return i.b(((d0) jVar).e(), ((d0) jVar2).e());
        } else {
            return i.b(jVar, jVar2);
        }
    }

    public boolean g(v0 a10, v0 b10, boolean z10, ss.p equivalentCallables) {
        i.g(a10, "a");
        i.g(b10, "b");
        i.g(equivalentCallables, "equivalentCallables");
        if (i.b(a10, b10)) {
            return true;
        }
        if (!i.b(a10.c(), b10.c()) && o(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex()) {
            return true;
        }
        return false;
    }

    public zc.a i(sc.e eVar) {
        return (zc.a) eVar.c(ed.c.class);
    }

    public long k() {
        return System.currentTimeMillis();
    }

    public boolean o(gt.j jVar, gt.j jVar2, ss.p pVar, boolean z10) {
        gt.j c10 = jVar.c();
        gt.j c11 = jVar2.c();
        if (!(c10 instanceof gt.b) && !(c11 instanceof gt.b)) {
            return f(c10, c11, z10, true);
        }
        return ((Boolean) pVar.invoke(c10, c11)).booleanValue();
    }

    @Override // ya.b
    public Object then(ya.h hVar) {
        if (hVar.isSuccessful()) {
            return (Bundle) hVar.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(hVar.getException());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", hVar.getException());
    }

    public void d() {
    }

    public void c(View view) {
    }

    @Override // lv.b
    public void b(g0 g0Var, lv.d0 d0Var) {
    }
}
