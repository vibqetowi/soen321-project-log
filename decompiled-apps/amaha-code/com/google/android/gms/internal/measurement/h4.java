package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public abstract class h4 {
    public static final Object f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static volatile o3 f8403g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f8404h;

    /* renamed from: a  reason: collision with root package name */
    public final e4 f8405a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8406b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8407c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f8408d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f8409e;

    static {
        new AtomicReference();
        new tr.r(0);
        f8404h = new AtomicInteger();
    }

    public /* synthetic */ h4(e4 e4Var, String str, Object obj) {
        if (e4Var.f8353a != null) {
            this.f8405a = e4Var;
            this.f8406b = str;
            this.f8407c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:17:0x004e, B:19:0x005b, B:37:0x008d, B:39:0x009b, B:41:0x00ac, B:44:0x00bb, B:46:0x00ce, B:47:0x00d1, B:48:0x00d5, B:25:0x0067, B:27:0x006d, B:31:0x007d, B:33:0x0083, B:36:0x008b, B:30:0x007b, B:15:0x0043, B:49:0x00da, B:50:0x00df, B:51:0x00e0), top: B:57:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:17:0x004e, B:19:0x005b, B:37:0x008d, B:39:0x009b, B:41:0x00ac, B:44:0x00bb, B:46:0x00ce, B:47:0x00d1, B:48:0x00d5, B:25:0x0067, B:27:0x006d, B:31:0x007d, B:33:0x0083, B:36:0x008b, B:30:0x007b, B:15:0x0043, B:49:0x00da, B:50:0x00df, B:51:0x00e0), top: B:57:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x001f, B:13:0x002b, B:17:0x004e, B:19:0x005b, B:37:0x008d, B:39:0x009b, B:41:0x00ac, B:44:0x00bb, B:46:0x00ce, B:47:0x00d1, B:48:0x00d5, B:25:0x0067, B:27:0x006d, B:31:0x007d, B:33:0x0083, B:36:0x008b, B:30:0x007b, B:15:0x0043, B:49:0x00da, B:50:0x00df, B:51:0x00e0), top: B:57:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        t3 a10;
        Object obj;
        String str;
        k4 k4Var;
        int i6 = f8404h.get();
        if (this.f8408d < i6) {
            synchronized (this) {
                try {
                    if (this.f8408d < i6) {
                        o3 o3Var = f8403g;
                        if (o3Var != null) {
                            e4 e4Var = this.f8405a;
                            e4Var.getClass();
                            String str2 = null;
                            if (e4Var.f8353a != null) {
                                if (w3.a(o3Var.f8527a, this.f8405a.f8353a)) {
                                    this.f8405a.getClass();
                                    a10 = q3.a(o3Var.f8527a.getContentResolver(), this.f8405a.f8353a, y3.f8700u);
                                } else {
                                    a10 = null;
                                }
                            } else {
                                this.f8405a.getClass();
                                a10 = i4.a();
                            }
                            if (a10 != null) {
                                this.f8405a.getClass();
                                Object f2 = a10.f(this.f8406b);
                                if (f2 != null) {
                                    obj = a(f2);
                                    if (obj == null) {
                                        if (!this.f8405a.f8354b) {
                                            u3 a11 = u3.a(o3Var.f8527a);
                                            if (this.f8405a.f8354b) {
                                                str = null;
                                            } else {
                                                str = this.f8406b;
                                            }
                                            String f10 = a11.f(str);
                                            if (f10 != null) {
                                                obj = a(f10);
                                                if (obj == null) {
                                                    obj = this.f8407c;
                                                }
                                            }
                                        }
                                        obj = null;
                                        if (obj == null) {
                                        }
                                    }
                                    k4Var = (k4) o3Var.f8528b.a();
                                    if (k4Var.b()) {
                                        s3 s3Var = (s3) k4Var.a();
                                        Uri uri = this.f8405a.f8353a;
                                        String str3 = this.f8406b;
                                        s3Var.getClass();
                                        if (uri != null) {
                                            t.h hVar = (t.h) s3Var.f8590a.getOrDefault(uri.toString(), null);
                                            if (hVar != null) {
                                                str2 = (String) hVar.getOrDefault("".concat(String.valueOf(str3)), null);
                                            }
                                        }
                                        if (str2 == null) {
                                            obj = this.f8407c;
                                        } else {
                                            obj = a(str2);
                                        }
                                    }
                                    this.f8409e = obj;
                                    this.f8408d = i6;
                                }
                            }
                            obj = null;
                            if (obj == null) {
                            }
                            k4Var = (k4) o3Var.f8528b.a();
                            if (k4Var.b()) {
                            }
                            this.f8409e = obj;
                            this.f8408d = i6;
                        } else {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f8409e;
    }
}
