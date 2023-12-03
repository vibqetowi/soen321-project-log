package xf;

import java.sql.Date;
import java.sql.Timestamp;
import xf.a;
import xf.b;
import xf.c;
/* compiled from: SqlTypesSupport.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f37756a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.C0634a f37757b;

    /* renamed from: c  reason: collision with root package name */
    public static final b.a f37758c;

    /* renamed from: d  reason: collision with root package name */
    public static final c.a f37759d;

    /* compiled from: SqlTypesSupport.java */
    /* loaded from: classes.dex */
    public class a extends vf.d<Date> {
        public a() {
            super(Date.class);
        }
    }

    /* compiled from: SqlTypesSupport.java */
    /* loaded from: classes.dex */
    public class b extends vf.d<Timestamp> {
        public b() {
            super(Timestamp.class);
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f37756a = z10;
        if (z10) {
            new a();
            new b();
            f37757b = xf.a.f37750b;
            f37758c = xf.b.f37752b;
            f37759d = c.f37754b;
            return;
        }
        f37757b = null;
        f37758c = null;
        f37759d = null;
    }
}
