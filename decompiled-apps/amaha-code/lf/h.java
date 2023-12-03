package lf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import com.theinnerhour.b2b.utils.Constants;
import java.util.List;
/* compiled from: NetworkRequestMetric.java */
/* loaded from: classes.dex */
public final class h extends v<h, a> implements r0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile z0<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private k0<String, String> customAttributes_ = k0.f9995v;
    private String url_ = "";
    private String responseContentType_ = "";
    private y.d<k> perfSessions_ = c1.f9893x;

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<h, a> implements r0 {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, String> f24240a;

        static {
            s1.a aVar = s1.f10037x;
            f24240a = new j0<>(aVar, aVar, "");
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes.dex */
    public enum c implements y.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f24246u;

        /* compiled from: NetworkRequestMetric.java */
        /* loaded from: classes.dex */
        public static final class a implements y.b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24247a = new a();

            @Override // com.google.protobuf.y.b
            public final boolean a(int i6) {
                if (c.d(i6) != null) {
                    return true;
                }
                return false;
            }
        }

        c(int i6) {
            this.f24246u = i6;
        }

        public static c d(int i6) {
            switch (i6) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.y.a
        public final int e() {
            return this.f24246u;
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* loaded from: classes.dex */
    public enum d implements y.a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f24251u;

        /* compiled from: NetworkRequestMetric.java */
        /* loaded from: classes.dex */
        public static final class a implements y.b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24252a = new a();

            @Override // com.google.protobuf.y.b
            public final boolean a(int i6) {
                d dVar;
                if (i6 != 0) {
                    if (i6 != 1) {
                        dVar = null;
                    } else {
                        dVar = d.GENERIC_CLIENT_ERROR;
                    }
                } else {
                    dVar = d.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                if (dVar != null) {
                    return true;
                }
                return false;
            }
        }

        d(int i6) {
            this.f24251u = i6;
        }

        @Override // com.google.protobuf.y.a
        public final int e() {
            return this.f24251u;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        v.J(h.class, hVar);
    }

    public static void M(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 1;
        hVar.url_ = str;
    }

    public static void N(h hVar) {
        hVar.getClass();
        hVar.networkClientErrorReason_ = 1;
        hVar.bitField0_ |= 16;
    }

    public static void O(h hVar, int i6) {
        hVar.bitField0_ |= 32;
        hVar.httpResponseCode_ = i6;
    }

    public static void P(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 64;
        hVar.responseContentType_ = str;
    }

    public static void Q(h hVar) {
        hVar.bitField0_ &= -65;
        hVar.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void R(h hVar, long j10) {
        hVar.bitField0_ |= 128;
        hVar.clientStartTimeUs_ = j10;
    }

    public static void S(h hVar, long j10) {
        hVar.bitField0_ |= 256;
        hVar.timeToRequestCompletedUs_ = j10;
    }

    public static void T(h hVar, long j10) {
        hVar.bitField0_ |= 512;
        hVar.timeToResponseInitiatedUs_ = j10;
    }

    public static void U(h hVar, long j10) {
        hVar.bitField0_ |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        hVar.timeToResponseCompletedUs_ = j10;
    }

    public static void V(h hVar, List list) {
        y.d<k> dVar = hVar.perfSessions_;
        if (!dVar.d0()) {
            hVar.perfSessions_ = v.G(dVar);
        }
        com.google.protobuf.a.g(list, hVar.perfSessions_);
    }

    public static void W(h hVar, c cVar) {
        hVar.getClass();
        hVar.httpMethod_ = cVar.f24246u;
        hVar.bitField0_ |= 2;
    }

    public static void X(h hVar, long j10) {
        hVar.bitField0_ |= 4;
        hVar.requestPayloadBytes_ = j10;
    }

    public static void Y(h hVar, long j10) {
        hVar.bitField0_ |= 8;
        hVar.responsePayloadBytes_ = j10;
    }

    public static h a0() {
        return DEFAULT_INSTANCE;
    }

    public static a s0() {
        return DEFAULT_INSTANCE.x();
    }

    public final long Z() {
        return this.clientStartTimeUs_;
    }

    public final c b0() {
        c d10 = c.d(this.httpMethod_);
        if (d10 == null) {
            return c.HTTP_METHOD_UNKNOWN;
        }
        return d10;
    }

    public final int c0() {
        return this.httpResponseCode_;
    }

    public final y.d d0() {
        return this.perfSessions_;
    }

    public final long e0() {
        return this.requestPayloadBytes_;
    }

    public final long f0() {
        return this.responsePayloadBytes_;
    }

    public final long g0() {
        return this.timeToRequestCompletedUs_;
    }

    public final long h0() {
        return this.timeToResponseCompletedUs_;
    }

    public final long i0() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String j0() {
        return this.url_;
    }

    public final boolean k0() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p0() {
        if ((this.bitField0_ & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q0() {
        if ((this.bitField0_ & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", c.a.f24247a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", d.a.f24252a, "customAttributes_", b.f24240a, "perfSessions_", k.class});
            case 3:
                return new h();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<h> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (h.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new v.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
