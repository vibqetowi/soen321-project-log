package ta;

import android.content.Context;
import androidx.recyclerview.widget.k;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class j2 {
    public static final i2 A;
    public static final i2 B;
    public static final i2 C;
    public static final i2 D;
    public static final i2 E;
    public static final i2 F;
    public static final i2 G;
    public static final i2 H;
    public static final i2 I;
    public static final i2 J;
    public static final i2 K;
    public static final i2 L;
    public static final i2 M;
    public static final i2 N;
    public static final i2 O;
    public static final i2 P;
    public static final i2 Q;
    public static final i2 R;
    public static final i2 S;
    public static final i2 T;
    public static final i2 U;
    public static final i2 V;
    public static final i2 W;
    public static final i2 X;
    public static final i2 Y;
    public static final i2 Z;

    /* renamed from: a  reason: collision with root package name */
    public static final List f32639a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final i2 f32640a0;

    /* renamed from: b  reason: collision with root package name */
    public static final i2 f32641b;

    /* renamed from: b0  reason: collision with root package name */
    public static final i2 f32642b0;

    /* renamed from: c  reason: collision with root package name */
    public static final i2 f32643c;
    public static final i2 c0;

    /* renamed from: d  reason: collision with root package name */
    public static final i2 f32644d;

    /* renamed from: d0  reason: collision with root package name */
    public static final i2 f32645d0;

    /* renamed from: e  reason: collision with root package name */
    public static final i2 f32646e;
    public static final i2 e0;
    public static final i2 f;

    /* renamed from: f0  reason: collision with root package name */
    public static final i2 f32647f0;

    /* renamed from: g  reason: collision with root package name */
    public static final i2 f32648g;

    /* renamed from: g0  reason: collision with root package name */
    public static final i2 f32649g0;

    /* renamed from: h  reason: collision with root package name */
    public static final i2 f32650h;

    /* renamed from: h0  reason: collision with root package name */
    public static final i2 f32651h0;

    /* renamed from: i  reason: collision with root package name */
    public static final i2 f32652i;

    /* renamed from: i0  reason: collision with root package name */
    public static final i2 f32653i0;

    /* renamed from: j  reason: collision with root package name */
    public static final i2 f32654j;

    /* renamed from: j0  reason: collision with root package name */
    public static final i2 f32655j0;

    /* renamed from: k  reason: collision with root package name */
    public static final i2 f32656k;

    /* renamed from: k0  reason: collision with root package name */
    public static final i2 f32657k0;

    /* renamed from: l  reason: collision with root package name */
    public static final i2 f32658l;

    /* renamed from: l0  reason: collision with root package name */
    public static final i2 f32659l0;

    /* renamed from: m  reason: collision with root package name */
    public static final i2 f32660m;

    /* renamed from: m0  reason: collision with root package name */
    public static final i2 f32661m0;

    /* renamed from: n  reason: collision with root package name */
    public static final i2 f32662n;

    /* renamed from: n0  reason: collision with root package name */
    public static final i2 f32663n0;

    /* renamed from: o  reason: collision with root package name */
    public static final i2 f32664o;

    /* renamed from: o0  reason: collision with root package name */
    public static final i2 f32665o0;

    /* renamed from: p  reason: collision with root package name */
    public static final i2 f32666p;

    /* renamed from: p0  reason: collision with root package name */
    public static final i2 f32667p0;

    /* renamed from: q  reason: collision with root package name */
    public static final i2 f32668q;
    public static final i2 r;

    /* renamed from: s  reason: collision with root package name */
    public static final i2 f32669s;

    /* renamed from: t  reason: collision with root package name */
    public static final i2 f32670t;

    /* renamed from: u  reason: collision with root package name */
    public static final i2 f32671u;

    /* renamed from: v  reason: collision with root package name */
    public static final i2 f32672v;

    /* renamed from: w  reason: collision with root package name */
    public static final i2 f32673w;

    /* renamed from: x  reason: collision with root package name */
    public static final i2 f32674x;

    /* renamed from: y  reason: collision with root package name */
    public static final i2 f32675y;

    /* renamed from: z  reason: collision with root package name */
    public static final i2 f32676z;

    static {
        Collections.synchronizedSet(new HashSet());
        f32641b = a("measurement.ad_id_cache_time", 10000L, 10000L, z.f32960u);
        f32643c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, tr.r.f33559r0);
        f32644d = a("measurement.config.cache_time", 86400000L, 3600000L, c0.f32497u);
        f32646e = a("measurement.config.url_scheme", "https", "https", o0.f32778u);
        f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", b1.f32479u);
        f32648g = a("measurement.upload.max_bundles", 100, 100, n1.f32759u);
        f32650h = a("measurement.upload.max_batch_size", 65536, 65536, z1.f32962u);
        f32652i = a("measurement.upload.max_bundle_size", 65536, 65536, a2.f32459u);
        f32654j = a("measurement.upload.max_events_per_bundle", 1000, 1000, b2.f32480u);
        f32656k = a("measurement.upload.max_events_per_day", 100000, 100000, c2.f32499u);
        f32658l = a("measurement.upload.max_error_events_per_day", 1000, 1000, j0.f32637u);
        f32660m = a("measurement.upload.max_public_events_per_day", 50000, 50000, v0.f32903u);
        Integer valueOf = Integer.valueOf((int) Constants.TIMEOUT_MS);
        f32662n = a("measurement.upload.max_conversions_per_day", valueOf, valueOf, g1.f32569u);
        f32664o = a("measurement.upload.max_realtime_events_per_day", 10, 10, s1.f32863u);
        f32666p = a("measurement.store.max_stored_events_per_app", 100000, 100000, d2.f32517u);
        f32668q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", e2.f32538u);
        r = a("measurement.upload.backoff_period", 43200000L, 43200000L, f2.f32555u);
        f32669s = a("measurement.upload.window_interval", 3600000L, 3600000L, g2.f32570u);
        f32670t = a("measurement.upload.interval", 3600000L, 3600000L, v.f32900u);
        f32671u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, kc.f.f23224n0);
        f32672v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, ca.a.M);
        f32673w = a("measurement.upload.minimum_delay", 500L, 500L, w.f32919u);
        f32674x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, sc.b.P);
        f32675y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, kotlin.jvm.internal.b0.W);
        f32676z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, f6.b.J);
        A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, x.f32936u);
        B = a("measurement.upload.retry_time", 1800000L, 1800000L, y.f32948u);
        C = a("measurement.upload.retry_count", 6, 6, com.google.android.gms.internal.cast.w.B);
        D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, a0.f32457u);
        E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, b0.f32478u);
        Integer valueOf2 = Integer.valueOf((int) k.d.DEFAULT_DRAG_ANIMATION_DURATION);
        F = a("measurement.audience.filter_result_max_count", valueOf2, valueOf2, d0.f32515u);
        G = a("measurement.upload.max_public_user_properties", 25, 25, null);
        H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        I = a("measurement.upload.max_public_event_params", 25, 25, null);
        J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, e0.f32536u);
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, f0.f32553u);
        L = a("measurement.test.string_flag", "---", "---", g0.f32568u);
        M = a("measurement.test.long_flag", -1L, -1L, h0.f32585u);
        N = a("measurement.test.int_flag", -2, -2, i0.f32612u);
        Double valueOf3 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf3, valueOf3, k0.f32689u);
        P = a("measurement.experiment.max_ids", 50, 50, l0.f32702u);
        Q = a("measurement.max_bundles_per_iteration", 100, 100, m0.f32739u);
        R = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, n0.f32758u);
        S = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, q0.f32820u);
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, r0.f32837u);
        T = a("measurement.quality.checksum", bool, bool, null);
        U = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, s0.f32862u);
        V = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, t0.f32873u);
        W = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, u0.f32889u);
        X = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, w0.f32920u);
        Y = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, x0.f32937u);
        Z = a("measurement.lifecycle.app_in_background_parameter", bool, bool, y0.f32949u);
        f32640a0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, z0.f32961u);
        f32642b0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, a1.f32458u);
        c0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, c1.f32498u);
        f32645d0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, d1.f32516u);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, e1.f32537u);
        e0 = a("measurement.service.storage_consent_support_version", 203600, 203600, f1.f32554u);
        a("measurement.client.click_identifier_control.dev", bool, bool, h1.f32586u);
        a("measurement.service.click_identifier_control", bool, bool, i1.f32613u);
        f32647f0 = a("measurement.service.store_null_safelist", bool2, bool2, j1.f32638u);
        f32649g0 = a("measurement.service.store_safelist", bool2, bool2, k1.f32690u);
        a("measurement.collection.enable_session_stitching_token.service", bool, bool, l1.f32703u);
        f32651h0 = a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, m1.f32740u);
        f32653i0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, o1.f32779u);
        f32655j0 = a("measurement.session_stitching_token_enabled", bool, bool, p1.f32805u);
        f32657k0 = a("measurement.redaction.e_tag", bool2, bool2, r1.f32838u);
        f32659l0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, t1.f32874u);
        f32661m0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, u1.f32890u);
        a("measurement.redaction.scion_payload_generator", bool2, bool2, v1.f32904u);
        f32663n0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, w1.f32921u);
        f32665o0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, x1.f32938u);
        f32667p0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, y1.f32950u);
    }

    public static i2 a(String str, Object obj, Object obj2, h2 h2Var) {
        i2 i2Var = new i2(str, obj, obj2, h2Var);
        f32639a.add(i2Var);
        return i2Var;
    }

    public static Map b(Context context) {
        com.google.android.gms.internal.measurement.q3 a10 = com.google.android.gms.internal.measurement.q3.a(context.getContentResolver(), com.google.android.gms.internal.measurement.x3.a(), u.f32888u);
        if (a10 == null) {
            return Collections.emptyMap();
        }
        return a10.b();
    }
}
