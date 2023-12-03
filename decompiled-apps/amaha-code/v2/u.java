package v2;

import android.database.Cursor;
import android.os.Build;
import androidx.recyclerview.widget.k;
import androidx.work.c;
import androidx.work.u;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import t.g;
import v2.s;
/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34760a;

    /* renamed from: b  reason: collision with root package name */
    public final e f34761b;

    /* renamed from: c  reason: collision with root package name */
    public final g f34762c;

    /* renamed from: d  reason: collision with root package name */
    public final h f34763d;

    /* renamed from: e  reason: collision with root package name */
    public final i f34764e;
    public final j f;

    /* renamed from: g  reason: collision with root package name */
    public final k f34765g;

    /* renamed from: h  reason: collision with root package name */
    public final l f34766h;

    /* renamed from: i  reason: collision with root package name */
    public final m f34767i;

    /* renamed from: j  reason: collision with root package name */
    public final a f34768j;

    /* renamed from: k  reason: collision with root package name */
    public final b f34769k;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends x1.u {
        public a(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends x1.u {
        public b(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends x1.u {
        public c(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class d extends x1.u {
        public d(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class e extends x1.e<s> {
        public e(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // x1.e
        public final void e(b2.f fVar, s sVar) {
            int i6;
            int i10;
            byte[] byteArray;
            s sVar2 = sVar;
            String str = sVar2.f34734a;
            int i11 = 1;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.t(1, str);
            }
            fVar.M(2, ca.a.p1(sVar2.f34735b));
            String str2 = sVar2.f34736c;
            if (str2 == null) {
                fVar.i0(3);
            } else {
                fVar.t(3, str2);
            }
            String str3 = sVar2.f34737d;
            if (str3 == null) {
                fVar.i0(4);
            } else {
                fVar.t(4, str3);
            }
            byte[] b10 = androidx.work.d.b(sVar2.f34738e);
            if (b10 == null) {
                fVar.i0(5);
            } else {
                fVar.W(b10, 5);
            }
            byte[] b11 = androidx.work.d.b(sVar2.f);
            if (b11 == null) {
                fVar.i0(6);
            } else {
                fVar.W(b11, 6);
            }
            fVar.M(7, sVar2.f34739g);
            fVar.M(8, sVar2.f34740h);
            fVar.M(9, sVar2.f34741i);
            fVar.M(10, sVar2.f34743k);
            int i12 = sVar2.f34744l;
            defpackage.d.j(i12, "backoffPolicy");
            int d10 = v.h.d(i12);
            if (d10 != 0) {
                if (d10 == 1) {
                    i6 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i6 = 0;
            }
            fVar.M(11, i6);
            fVar.M(12, sVar2.f34745m);
            fVar.M(13, sVar2.f34746n);
            fVar.M(14, sVar2.f34747o);
            fVar.M(15, sVar2.f34748p);
            fVar.M(16, sVar2.f34749q ? 1L : 0L);
            int i13 = sVar2.r;
            defpackage.d.j(i13, "policy");
            int d11 = v.h.d(i13);
            if (d11 != 0) {
                if (d11 == 1) {
                    i10 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = 0;
            }
            fVar.M(17, i10);
            fVar.M(18, sVar2.f34750s);
            fVar.M(19, sVar2.f34751t);
            androidx.work.c cVar = sVar2.f34742j;
            if (cVar != null) {
                int i14 = cVar.f3225a;
                defpackage.d.j(i14, "networkType");
                int d12 = v.h.d(i14);
                if (d12 != 0) {
                    if (d12 != 1) {
                        if (d12 != 2) {
                            if (d12 != 3) {
                                if (d12 != 4) {
                                    if (Build.VERSION.SDK_INT >= 30 && i14 == 6) {
                                        i11 = 5;
                                    } else {
                                        throw new IllegalArgumentException("Could not convert " + defpackage.c.E(i14) + " to int");
                                    }
                                } else {
                                    i11 = 4;
                                }
                            } else {
                                i11 = 3;
                            }
                        } else {
                            i11 = 2;
                        }
                    }
                } else {
                    i11 = 0;
                }
                fVar.M(20, i11);
                fVar.M(21, cVar.f3226b ? 1L : 0L);
                fVar.M(22, cVar.f3227c ? 1L : 0L);
                fVar.M(23, cVar.f3228d ? 1L : 0L);
                fVar.M(24, cVar.f3229e ? 1L : 0L);
                fVar.M(25, cVar.f);
                fVar.M(26, cVar.f3230g);
                Set<c.a> triggers = cVar.f3231h;
                kotlin.jvm.internal.i.g(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        objectOutputStream.writeInt(triggers.size());
                        for (c.a aVar : triggers) {
                            objectOutputStream.writeUTF(aVar.f3232a.toString());
                            objectOutputStream.writeBoolean(aVar.f3233b);
                        }
                        hs.k kVar = hs.k.f19476a;
                        ca.a.z(objectOutputStream, null);
                        ca.a.z(byteArrayOutputStream, null);
                        byteArray = byteArrayOutputStream.toByteArray();
                        kotlin.jvm.internal.i.f(byteArray, "outputStream.toByteArray()");
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ca.a.z(byteArrayOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                fVar.W(byteArray, 27);
                return;
            }
            fVar.i0(20);
            fVar.i0(21);
            fVar.i0(22);
            fVar.i0(23);
            fVar.i0(24);
            fVar.i0(25);
            fVar.i0(26);
            fVar.i0(27);
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class f extends x1.d<s> {
        public f(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class g extends x1.u {
        public g(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class h extends x1.u {
        public h(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class i extends x1.u {
        public i(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class j extends x1.u {
        public j(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class k extends x1.u {
        public k(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class l extends x1.u {
        public l(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class m extends x1.u {
        public m(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public u(x1.n nVar) {
        this.f34760a = nVar;
        this.f34761b = new e(nVar);
        new f(nVar);
        this.f34762c = new g(nVar);
        this.f34763d = new h(nVar);
        this.f34764e = new i(nVar);
        this.f = new j(nVar);
        this.f34765g = new k(nVar);
        this.f34766h = new l(nVar);
        this.f34767i = new m(nVar);
        this.f34768j = new a(nVar);
        this.f34769k = new b(nVar);
        new c(nVar);
        new d(nVar);
    }

    @Override // v2.t
    public final void a(String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        g gVar = this.f34762c;
        b2.f a10 = gVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            gVar.d(a10);
        }
    }

    @Override // v2.t
    public final ArrayList b() {
        x1.p pVar;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        x1.p g5 = x1.p.g(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        g5.M(1, (long) k.d.DEFAULT_DRAG_ANIMATION_DURATION);
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            int d02 = ca.a.d0(S, "id");
            int d03 = ca.a.d0(S, "state");
            int d04 = ca.a.d0(S, "worker_class_name");
            int d05 = ca.a.d0(S, "input_merger_class_name");
            int d06 = ca.a.d0(S, "input");
            int d07 = ca.a.d0(S, "output");
            int d08 = ca.a.d0(S, "initial_delay");
            int d09 = ca.a.d0(S, "interval_duration");
            int d010 = ca.a.d0(S, "flex_duration");
            int d011 = ca.a.d0(S, "run_attempt_count");
            int d012 = ca.a.d0(S, "backoff_policy");
            int d013 = ca.a.d0(S, "backoff_delay_duration");
            int d014 = ca.a.d0(S, "last_enqueue_time");
            int d015 = ca.a.d0(S, "minimum_retention_duration");
            pVar = g5;
            try {
                int d016 = ca.a.d0(S, "schedule_requested_at");
                int d017 = ca.a.d0(S, "run_in_foreground");
                int d018 = ca.a.d0(S, "out_of_quota_policy");
                int d019 = ca.a.d0(S, "period_count");
                int d020 = ca.a.d0(S, "generation");
                int d021 = ca.a.d0(S, "required_network_type");
                int d022 = ca.a.d0(S, "requires_charging");
                int d023 = ca.a.d0(S, "requires_device_idle");
                int d024 = ca.a.d0(S, "requires_battery_not_low");
                int d025 = ca.a.d0(S, "requires_storage_not_low");
                int d026 = ca.a.d0(S, "trigger_content_update_delay");
                int d027 = ca.a.d0(S, "trigger_max_content_delay");
                int d028 = ca.a.d0(S, "content_uri_triggers");
                int i14 = d015;
                ArrayList arrayList = new ArrayList(S.getCount());
                while (S.moveToNext()) {
                    byte[] bArr = null;
                    if (S.isNull(d02)) {
                        string = null;
                    } else {
                        string = S.getString(d02);
                    }
                    u.a F0 = ca.a.F0(S.getInt(d03));
                    if (S.isNull(d04)) {
                        string2 = null;
                    } else {
                        string2 = S.getString(d04);
                    }
                    if (S.isNull(d05)) {
                        string3 = null;
                    } else {
                        string3 = S.getString(d05);
                    }
                    if (S.isNull(d06)) {
                        blob = null;
                    } else {
                        blob = S.getBlob(d06);
                    }
                    androidx.work.d a10 = androidx.work.d.a(blob);
                    if (S.isNull(d07)) {
                        blob2 = null;
                    } else {
                        blob2 = S.getBlob(d07);
                    }
                    androidx.work.d a11 = androidx.work.d.a(blob2);
                    long j10 = S.getLong(d08);
                    long j11 = S.getLong(d09);
                    long j12 = S.getLong(d010);
                    int i15 = S.getInt(d011);
                    int C0 = ca.a.C0(S.getInt(d012));
                    long j13 = S.getLong(d013);
                    long j14 = S.getLong(d014);
                    int i16 = i14;
                    long j15 = S.getLong(i16);
                    int i17 = d02;
                    int i18 = d016;
                    long j16 = S.getLong(i18);
                    d016 = i18;
                    int i19 = d017;
                    if (S.getInt(i19) != 0) {
                        d017 = i19;
                        i6 = d018;
                        z10 = true;
                    } else {
                        d017 = i19;
                        i6 = d018;
                        z10 = false;
                    }
                    int E0 = ca.a.E0(S.getInt(i6));
                    d018 = i6;
                    int i20 = d019;
                    int i21 = S.getInt(i20);
                    d019 = i20;
                    int i22 = d020;
                    int i23 = S.getInt(i22);
                    d020 = i22;
                    int i24 = d021;
                    int D0 = ca.a.D0(S.getInt(i24));
                    d021 = i24;
                    int i25 = d022;
                    if (S.getInt(i25) != 0) {
                        d022 = i25;
                        i10 = d023;
                        z11 = true;
                    } else {
                        d022 = i25;
                        i10 = d023;
                        z11 = false;
                    }
                    if (S.getInt(i10) != 0) {
                        d023 = i10;
                        i11 = d024;
                        z12 = true;
                    } else {
                        d023 = i10;
                        i11 = d024;
                        z12 = false;
                    }
                    if (S.getInt(i11) != 0) {
                        d024 = i11;
                        i12 = d025;
                        z13 = true;
                    } else {
                        d024 = i11;
                        i12 = d025;
                        z13 = false;
                    }
                    if (S.getInt(i12) != 0) {
                        d025 = i12;
                        i13 = d026;
                        z14 = true;
                    } else {
                        d025 = i12;
                        i13 = d026;
                        z14 = false;
                    }
                    long j17 = S.getLong(i13);
                    d026 = i13;
                    int i26 = d027;
                    long j18 = S.getLong(i26);
                    d027 = i26;
                    int i27 = d028;
                    if (!S.isNull(i27)) {
                        bArr = S.getBlob(i27);
                    }
                    d028 = i27;
                    arrayList.add(new s(string, F0, string2, string3, a10, a11, j10, j11, j12, new androidx.work.c(D0, z11, z12, z13, z14, j17, j18, ca.a.t(bArr)), i15, C0, j13, j14, j15, j16, z10, E0, i21, i23));
                    d02 = i17;
                    i14 = i16;
                }
                S.close();
                pVar.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                S.close();
                pVar.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = g5;
        }
    }

    @Override // v2.t
    public final void c(String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        i iVar = this.f34764e;
        b2.f a10 = iVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            iVar.d(a10);
        }
    }

    @Override // v2.t
    public final int d(long j10, String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        a aVar = this.f34768j;
        b2.f a10 = aVar.a();
        a10.M(1, j10);
        if (str == null) {
            a10.i0(2);
        } else {
            a10.t(2, str);
        }
        nVar.c();
        try {
            int v10 = a10.v();
            nVar.n();
            return v10;
        } finally {
            nVar.j();
            aVar.d(a10);
        }
    }

    @Override // v2.t
    public final ArrayList e(String str) {
        String string;
        x1.p g5 = x1.p.g(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            ArrayList arrayList = new ArrayList(S.getCount());
            while (S.moveToNext()) {
                if (S.isNull(0)) {
                    string = null;
                } else {
                    string = S.getString(0);
                }
                arrayList.add(new s.a(ca.a.F0(S.getInt(1)), string));
            }
            return arrayList;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.t
    public final ArrayList f(long j10) {
        x1.p pVar;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        x1.p g5 = x1.p.g(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        g5.M(1, j10);
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            int d02 = ca.a.d0(S, "id");
            int d03 = ca.a.d0(S, "state");
            int d04 = ca.a.d0(S, "worker_class_name");
            int d05 = ca.a.d0(S, "input_merger_class_name");
            int d06 = ca.a.d0(S, "input");
            int d07 = ca.a.d0(S, "output");
            int d08 = ca.a.d0(S, "initial_delay");
            int d09 = ca.a.d0(S, "interval_duration");
            int d010 = ca.a.d0(S, "flex_duration");
            int d011 = ca.a.d0(S, "run_attempt_count");
            int d012 = ca.a.d0(S, "backoff_policy");
            int d013 = ca.a.d0(S, "backoff_delay_duration");
            int d014 = ca.a.d0(S, "last_enqueue_time");
            int d015 = ca.a.d0(S, "minimum_retention_duration");
            pVar = g5;
            try {
                int d016 = ca.a.d0(S, "schedule_requested_at");
                int d017 = ca.a.d0(S, "run_in_foreground");
                int d018 = ca.a.d0(S, "out_of_quota_policy");
                int d019 = ca.a.d0(S, "period_count");
                int d020 = ca.a.d0(S, "generation");
                int d021 = ca.a.d0(S, "required_network_type");
                int d022 = ca.a.d0(S, "requires_charging");
                int d023 = ca.a.d0(S, "requires_device_idle");
                int d024 = ca.a.d0(S, "requires_battery_not_low");
                int d025 = ca.a.d0(S, "requires_storage_not_low");
                int d026 = ca.a.d0(S, "trigger_content_update_delay");
                int d027 = ca.a.d0(S, "trigger_max_content_delay");
                int d028 = ca.a.d0(S, "content_uri_triggers");
                int i14 = d015;
                ArrayList arrayList = new ArrayList(S.getCount());
                while (S.moveToNext()) {
                    byte[] bArr = null;
                    if (S.isNull(d02)) {
                        string = null;
                    } else {
                        string = S.getString(d02);
                    }
                    u.a F0 = ca.a.F0(S.getInt(d03));
                    if (S.isNull(d04)) {
                        string2 = null;
                    } else {
                        string2 = S.getString(d04);
                    }
                    if (S.isNull(d05)) {
                        string3 = null;
                    } else {
                        string3 = S.getString(d05);
                    }
                    if (S.isNull(d06)) {
                        blob = null;
                    } else {
                        blob = S.getBlob(d06);
                    }
                    androidx.work.d a10 = androidx.work.d.a(blob);
                    if (S.isNull(d07)) {
                        blob2 = null;
                    } else {
                        blob2 = S.getBlob(d07);
                    }
                    androidx.work.d a11 = androidx.work.d.a(blob2);
                    long j11 = S.getLong(d08);
                    long j12 = S.getLong(d09);
                    long j13 = S.getLong(d010);
                    int i15 = S.getInt(d011);
                    int C0 = ca.a.C0(S.getInt(d012));
                    long j14 = S.getLong(d013);
                    long j15 = S.getLong(d014);
                    int i16 = i14;
                    long j16 = S.getLong(i16);
                    int i17 = d02;
                    int i18 = d016;
                    long j17 = S.getLong(i18);
                    d016 = i18;
                    int i19 = d017;
                    if (S.getInt(i19) != 0) {
                        d017 = i19;
                        i6 = d018;
                        z10 = true;
                    } else {
                        d017 = i19;
                        i6 = d018;
                        z10 = false;
                    }
                    int E0 = ca.a.E0(S.getInt(i6));
                    d018 = i6;
                    int i20 = d019;
                    int i21 = S.getInt(i20);
                    d019 = i20;
                    int i22 = d020;
                    int i23 = S.getInt(i22);
                    d020 = i22;
                    int i24 = d021;
                    int D0 = ca.a.D0(S.getInt(i24));
                    d021 = i24;
                    int i25 = d022;
                    if (S.getInt(i25) != 0) {
                        d022 = i25;
                        i10 = d023;
                        z11 = true;
                    } else {
                        d022 = i25;
                        i10 = d023;
                        z11 = false;
                    }
                    if (S.getInt(i10) != 0) {
                        d023 = i10;
                        i11 = d024;
                        z12 = true;
                    } else {
                        d023 = i10;
                        i11 = d024;
                        z12 = false;
                    }
                    if (S.getInt(i11) != 0) {
                        d024 = i11;
                        i12 = d025;
                        z13 = true;
                    } else {
                        d024 = i11;
                        i12 = d025;
                        z13 = false;
                    }
                    if (S.getInt(i12) != 0) {
                        d025 = i12;
                        i13 = d026;
                        z14 = true;
                    } else {
                        d025 = i12;
                        i13 = d026;
                        z14 = false;
                    }
                    long j18 = S.getLong(i13);
                    d026 = i13;
                    int i26 = d027;
                    long j19 = S.getLong(i26);
                    d027 = i26;
                    int i27 = d028;
                    if (!S.isNull(i27)) {
                        bArr = S.getBlob(i27);
                    }
                    d028 = i27;
                    arrayList.add(new s(string, F0, string2, string3, a10, a11, j11, j12, j13, new androidx.work.c(D0, z11, z12, z13, z14, j18, j19, ca.a.t(bArr)), i15, C0, j14, j15, j16, j17, z10, E0, i21, i23));
                    d02 = i17;
                    i14 = i16;
                }
                S.close();
                pVar.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                S.close();
                pVar.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = g5;
        }
    }

    @Override // v2.t
    public final ArrayList g(int i6) {
        x1.p pVar;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        x1.p g5 = x1.p.g(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        g5.M(1, i6);
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            int d02 = ca.a.d0(S, "id");
            int d03 = ca.a.d0(S, "state");
            int d04 = ca.a.d0(S, "worker_class_name");
            int d05 = ca.a.d0(S, "input_merger_class_name");
            int d06 = ca.a.d0(S, "input");
            int d07 = ca.a.d0(S, "output");
            int d08 = ca.a.d0(S, "initial_delay");
            int d09 = ca.a.d0(S, "interval_duration");
            int d010 = ca.a.d0(S, "flex_duration");
            int d011 = ca.a.d0(S, "run_attempt_count");
            int d012 = ca.a.d0(S, "backoff_policy");
            int d013 = ca.a.d0(S, "backoff_delay_duration");
            int d014 = ca.a.d0(S, "last_enqueue_time");
            int d015 = ca.a.d0(S, "minimum_retention_duration");
            pVar = g5;
            try {
                int d016 = ca.a.d0(S, "schedule_requested_at");
                int d017 = ca.a.d0(S, "run_in_foreground");
                int d018 = ca.a.d0(S, "out_of_quota_policy");
                int d019 = ca.a.d0(S, "period_count");
                int d020 = ca.a.d0(S, "generation");
                int d021 = ca.a.d0(S, "required_network_type");
                int d022 = ca.a.d0(S, "requires_charging");
                int d023 = ca.a.d0(S, "requires_device_idle");
                int d024 = ca.a.d0(S, "requires_battery_not_low");
                int d025 = ca.a.d0(S, "requires_storage_not_low");
                int d026 = ca.a.d0(S, "trigger_content_update_delay");
                int d027 = ca.a.d0(S, "trigger_max_content_delay");
                int d028 = ca.a.d0(S, "content_uri_triggers");
                int i15 = d015;
                ArrayList arrayList = new ArrayList(S.getCount());
                while (S.moveToNext()) {
                    byte[] bArr = null;
                    if (S.isNull(d02)) {
                        string = null;
                    } else {
                        string = S.getString(d02);
                    }
                    u.a F0 = ca.a.F0(S.getInt(d03));
                    if (S.isNull(d04)) {
                        string2 = null;
                    } else {
                        string2 = S.getString(d04);
                    }
                    if (S.isNull(d05)) {
                        string3 = null;
                    } else {
                        string3 = S.getString(d05);
                    }
                    if (S.isNull(d06)) {
                        blob = null;
                    } else {
                        blob = S.getBlob(d06);
                    }
                    androidx.work.d a10 = androidx.work.d.a(blob);
                    if (S.isNull(d07)) {
                        blob2 = null;
                    } else {
                        blob2 = S.getBlob(d07);
                    }
                    androidx.work.d a11 = androidx.work.d.a(blob2);
                    long j10 = S.getLong(d08);
                    long j11 = S.getLong(d09);
                    long j12 = S.getLong(d010);
                    int i16 = S.getInt(d011);
                    int C0 = ca.a.C0(S.getInt(d012));
                    long j13 = S.getLong(d013);
                    long j14 = S.getLong(d014);
                    int i17 = i15;
                    long j15 = S.getLong(i17);
                    int i18 = d02;
                    int i19 = d016;
                    long j16 = S.getLong(i19);
                    d016 = i19;
                    int i20 = d017;
                    if (S.getInt(i20) != 0) {
                        d017 = i20;
                        i10 = d018;
                        z10 = true;
                    } else {
                        d017 = i20;
                        i10 = d018;
                        z10 = false;
                    }
                    int E0 = ca.a.E0(S.getInt(i10));
                    d018 = i10;
                    int i21 = d019;
                    int i22 = S.getInt(i21);
                    d019 = i21;
                    int i23 = d020;
                    int i24 = S.getInt(i23);
                    d020 = i23;
                    int i25 = d021;
                    int D0 = ca.a.D0(S.getInt(i25));
                    d021 = i25;
                    int i26 = d022;
                    if (S.getInt(i26) != 0) {
                        d022 = i26;
                        i11 = d023;
                        z11 = true;
                    } else {
                        d022 = i26;
                        i11 = d023;
                        z11 = false;
                    }
                    if (S.getInt(i11) != 0) {
                        d023 = i11;
                        i12 = d024;
                        z12 = true;
                    } else {
                        d023 = i11;
                        i12 = d024;
                        z12 = false;
                    }
                    if (S.getInt(i12) != 0) {
                        d024 = i12;
                        i13 = d025;
                        z13 = true;
                    } else {
                        d024 = i12;
                        i13 = d025;
                        z13 = false;
                    }
                    if (S.getInt(i13) != 0) {
                        d025 = i13;
                        i14 = d026;
                        z14 = true;
                    } else {
                        d025 = i13;
                        i14 = d026;
                        z14 = false;
                    }
                    long j17 = S.getLong(i14);
                    d026 = i14;
                    int i27 = d027;
                    long j18 = S.getLong(i27);
                    d027 = i27;
                    int i28 = d028;
                    if (!S.isNull(i28)) {
                        bArr = S.getBlob(i28);
                    }
                    d028 = i28;
                    arrayList.add(new s(string, F0, string2, string3, a10, a11, j10, j11, j12, new androidx.work.c(D0, z11, z12, z13, z14, j17, j18, ca.a.t(bArr)), i16, C0, j13, j14, j15, j16, z10, E0, i22, i24));
                    d02 = i18;
                    i15 = i17;
                }
                S.close();
                pVar.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                S.close();
                pVar.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = g5;
        }
    }

    @Override // v2.t
    public final int h(u.a aVar, String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        h hVar = this.f34763d;
        b2.f a10 = hVar.a();
        a10.M(1, ca.a.p1(aVar));
        if (str == null) {
            a10.i0(2);
        } else {
            a10.t(2, str);
        }
        nVar.c();
        try {
            int v10 = a10.v();
            nVar.n();
            return v10;
        } finally {
            nVar.j();
            hVar.d(a10);
        }
    }

    @Override // v2.t
    public final ArrayList i() {
        x1.p pVar;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        x1.p g5 = x1.p.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            int d02 = ca.a.d0(S, "id");
            int d03 = ca.a.d0(S, "state");
            int d04 = ca.a.d0(S, "worker_class_name");
            int d05 = ca.a.d0(S, "input_merger_class_name");
            int d06 = ca.a.d0(S, "input");
            int d07 = ca.a.d0(S, "output");
            int d08 = ca.a.d0(S, "initial_delay");
            int d09 = ca.a.d0(S, "interval_duration");
            int d010 = ca.a.d0(S, "flex_duration");
            int d011 = ca.a.d0(S, "run_attempt_count");
            int d012 = ca.a.d0(S, "backoff_policy");
            int d013 = ca.a.d0(S, "backoff_delay_duration");
            int d014 = ca.a.d0(S, "last_enqueue_time");
            int d015 = ca.a.d0(S, "minimum_retention_duration");
            pVar = g5;
            try {
                int d016 = ca.a.d0(S, "schedule_requested_at");
                int d017 = ca.a.d0(S, "run_in_foreground");
                int d018 = ca.a.d0(S, "out_of_quota_policy");
                int d019 = ca.a.d0(S, "period_count");
                int d020 = ca.a.d0(S, "generation");
                int d021 = ca.a.d0(S, "required_network_type");
                int d022 = ca.a.d0(S, "requires_charging");
                int d023 = ca.a.d0(S, "requires_device_idle");
                int d024 = ca.a.d0(S, "requires_battery_not_low");
                int d025 = ca.a.d0(S, "requires_storage_not_low");
                int d026 = ca.a.d0(S, "trigger_content_update_delay");
                int d027 = ca.a.d0(S, "trigger_max_content_delay");
                int d028 = ca.a.d0(S, "content_uri_triggers");
                int i14 = d015;
                ArrayList arrayList = new ArrayList(S.getCount());
                while (S.moveToNext()) {
                    byte[] bArr = null;
                    if (S.isNull(d02)) {
                        string = null;
                    } else {
                        string = S.getString(d02);
                    }
                    u.a F0 = ca.a.F0(S.getInt(d03));
                    if (S.isNull(d04)) {
                        string2 = null;
                    } else {
                        string2 = S.getString(d04);
                    }
                    if (S.isNull(d05)) {
                        string3 = null;
                    } else {
                        string3 = S.getString(d05);
                    }
                    if (S.isNull(d06)) {
                        blob = null;
                    } else {
                        blob = S.getBlob(d06);
                    }
                    androidx.work.d a10 = androidx.work.d.a(blob);
                    if (S.isNull(d07)) {
                        blob2 = null;
                    } else {
                        blob2 = S.getBlob(d07);
                    }
                    androidx.work.d a11 = androidx.work.d.a(blob2);
                    long j10 = S.getLong(d08);
                    long j11 = S.getLong(d09);
                    long j12 = S.getLong(d010);
                    int i15 = S.getInt(d011);
                    int C0 = ca.a.C0(S.getInt(d012));
                    long j13 = S.getLong(d013);
                    long j14 = S.getLong(d014);
                    int i16 = i14;
                    long j15 = S.getLong(i16);
                    int i17 = d02;
                    int i18 = d016;
                    long j16 = S.getLong(i18);
                    d016 = i18;
                    int i19 = d017;
                    if (S.getInt(i19) != 0) {
                        d017 = i19;
                        i6 = d018;
                        z10 = true;
                    } else {
                        d017 = i19;
                        i6 = d018;
                        z10 = false;
                    }
                    int E0 = ca.a.E0(S.getInt(i6));
                    d018 = i6;
                    int i20 = d019;
                    int i21 = S.getInt(i20);
                    d019 = i20;
                    int i22 = d020;
                    int i23 = S.getInt(i22);
                    d020 = i22;
                    int i24 = d021;
                    int D0 = ca.a.D0(S.getInt(i24));
                    d021 = i24;
                    int i25 = d022;
                    if (S.getInt(i25) != 0) {
                        d022 = i25;
                        i10 = d023;
                        z11 = true;
                    } else {
                        d022 = i25;
                        i10 = d023;
                        z11 = false;
                    }
                    if (S.getInt(i10) != 0) {
                        d023 = i10;
                        i11 = d024;
                        z12 = true;
                    } else {
                        d023 = i10;
                        i11 = d024;
                        z12 = false;
                    }
                    if (S.getInt(i11) != 0) {
                        d024 = i11;
                        i12 = d025;
                        z13 = true;
                    } else {
                        d024 = i11;
                        i12 = d025;
                        z13 = false;
                    }
                    if (S.getInt(i12) != 0) {
                        d025 = i12;
                        i13 = d026;
                        z14 = true;
                    } else {
                        d025 = i12;
                        i13 = d026;
                        z14 = false;
                    }
                    long j17 = S.getLong(i13);
                    d026 = i13;
                    int i26 = d027;
                    long j18 = S.getLong(i26);
                    d027 = i26;
                    int i27 = d028;
                    if (!S.isNull(i27)) {
                        bArr = S.getBlob(i27);
                    }
                    d028 = i27;
                    arrayList.add(new s(string, F0, string2, string3, a10, a11, j10, j11, j12, new androidx.work.c(D0, z11, z12, z13, z14, j17, j18, ca.a.t(bArr)), i15, C0, j13, j14, j15, j16, z10, E0, i21, i23));
                    d02 = i17;
                    i14 = i16;
                }
                S.close();
                pVar.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                S.close();
                pVar.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = g5;
        }
    }

    @Override // v2.t
    public final void j(String str, androidx.work.d dVar) {
        x1.n nVar = this.f34760a;
        nVar.b();
        j jVar = this.f;
        b2.f a10 = jVar.a();
        byte[] b10 = androidx.work.d.b(dVar);
        if (b10 == null) {
            a10.i0(1);
        } else {
            a10.W(b10, 1);
        }
        if (str == null) {
            a10.i0(2);
        } else {
            a10.t(2, str);
        }
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            jVar.d(a10);
        }
    }

    @Override // v2.t
    public final void k(long j10, String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        k kVar = this.f34765g;
        b2.f a10 = kVar.a();
        a10.M(1, j10);
        if (str == null) {
            a10.i0(2);
        } else {
            a10.t(2, str);
        }
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            kVar.d(a10);
        }
    }

    @Override // v2.t
    public final ArrayList l() {
        x1.p pVar;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        x1.p g5 = x1.p.g(0, "SELECT * FROM workspec WHERE state=1");
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            int d02 = ca.a.d0(S, "id");
            int d03 = ca.a.d0(S, "state");
            int d04 = ca.a.d0(S, "worker_class_name");
            int d05 = ca.a.d0(S, "input_merger_class_name");
            int d06 = ca.a.d0(S, "input");
            int d07 = ca.a.d0(S, "output");
            int d08 = ca.a.d0(S, "initial_delay");
            int d09 = ca.a.d0(S, "interval_duration");
            int d010 = ca.a.d0(S, "flex_duration");
            int d011 = ca.a.d0(S, "run_attempt_count");
            int d012 = ca.a.d0(S, "backoff_policy");
            int d013 = ca.a.d0(S, "backoff_delay_duration");
            int d014 = ca.a.d0(S, "last_enqueue_time");
            int d015 = ca.a.d0(S, "minimum_retention_duration");
            pVar = g5;
            try {
                int d016 = ca.a.d0(S, "schedule_requested_at");
                int d017 = ca.a.d0(S, "run_in_foreground");
                int d018 = ca.a.d0(S, "out_of_quota_policy");
                int d019 = ca.a.d0(S, "period_count");
                int d020 = ca.a.d0(S, "generation");
                int d021 = ca.a.d0(S, "required_network_type");
                int d022 = ca.a.d0(S, "requires_charging");
                int d023 = ca.a.d0(S, "requires_device_idle");
                int d024 = ca.a.d0(S, "requires_battery_not_low");
                int d025 = ca.a.d0(S, "requires_storage_not_low");
                int d026 = ca.a.d0(S, "trigger_content_update_delay");
                int d027 = ca.a.d0(S, "trigger_max_content_delay");
                int d028 = ca.a.d0(S, "content_uri_triggers");
                int i14 = d015;
                ArrayList arrayList = new ArrayList(S.getCount());
                while (S.moveToNext()) {
                    byte[] bArr = null;
                    if (S.isNull(d02)) {
                        string = null;
                    } else {
                        string = S.getString(d02);
                    }
                    u.a F0 = ca.a.F0(S.getInt(d03));
                    if (S.isNull(d04)) {
                        string2 = null;
                    } else {
                        string2 = S.getString(d04);
                    }
                    if (S.isNull(d05)) {
                        string3 = null;
                    } else {
                        string3 = S.getString(d05);
                    }
                    if (S.isNull(d06)) {
                        blob = null;
                    } else {
                        blob = S.getBlob(d06);
                    }
                    androidx.work.d a10 = androidx.work.d.a(blob);
                    if (S.isNull(d07)) {
                        blob2 = null;
                    } else {
                        blob2 = S.getBlob(d07);
                    }
                    androidx.work.d a11 = androidx.work.d.a(blob2);
                    long j10 = S.getLong(d08);
                    long j11 = S.getLong(d09);
                    long j12 = S.getLong(d010);
                    int i15 = S.getInt(d011);
                    int C0 = ca.a.C0(S.getInt(d012));
                    long j13 = S.getLong(d013);
                    long j14 = S.getLong(d014);
                    int i16 = i14;
                    long j15 = S.getLong(i16);
                    int i17 = d02;
                    int i18 = d016;
                    long j16 = S.getLong(i18);
                    d016 = i18;
                    int i19 = d017;
                    if (S.getInt(i19) != 0) {
                        d017 = i19;
                        i6 = d018;
                        z10 = true;
                    } else {
                        d017 = i19;
                        i6 = d018;
                        z10 = false;
                    }
                    int E0 = ca.a.E0(S.getInt(i6));
                    d018 = i6;
                    int i20 = d019;
                    int i21 = S.getInt(i20);
                    d019 = i20;
                    int i22 = d020;
                    int i23 = S.getInt(i22);
                    d020 = i22;
                    int i24 = d021;
                    int D0 = ca.a.D0(S.getInt(i24));
                    d021 = i24;
                    int i25 = d022;
                    if (S.getInt(i25) != 0) {
                        d022 = i25;
                        i10 = d023;
                        z11 = true;
                    } else {
                        d022 = i25;
                        i10 = d023;
                        z11 = false;
                    }
                    if (S.getInt(i10) != 0) {
                        d023 = i10;
                        i11 = d024;
                        z12 = true;
                    } else {
                        d023 = i10;
                        i11 = d024;
                        z12 = false;
                    }
                    if (S.getInt(i11) != 0) {
                        d024 = i11;
                        i12 = d025;
                        z13 = true;
                    } else {
                        d024 = i11;
                        i12 = d025;
                        z13 = false;
                    }
                    if (S.getInt(i12) != 0) {
                        d025 = i12;
                        i13 = d026;
                        z14 = true;
                    } else {
                        d025 = i12;
                        i13 = d026;
                        z14 = false;
                    }
                    long j17 = S.getLong(i13);
                    d026 = i13;
                    int i26 = d027;
                    long j18 = S.getLong(i26);
                    d027 = i26;
                    int i27 = d028;
                    if (!S.isNull(i27)) {
                        bArr = S.getBlob(i27);
                    }
                    d028 = i27;
                    arrayList.add(new s(string, F0, string2, string3, a10, a11, j10, j11, j12, new androidx.work.c(D0, z11, z12, z13, z14, j17, j18, ca.a.t(bArr)), i15, C0, j13, j14, j15, j16, z10, E0, i21, i23));
                    d02 = i17;
                    i14 = i16;
                }
                S.close();
                pVar.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                S.close();
                pVar.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = g5;
        }
    }

    @Override // v2.t
    public final boolean m() {
        boolean z10 = false;
        x1.p g5 = x1.p.g(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            if (S.moveToFirst()) {
                if (S.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.t
    public final ArrayList n(String str) {
        String string;
        x1.p g5 = x1.p.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            ArrayList arrayList = new ArrayList(S.getCount());
            while (S.moveToNext()) {
                if (S.isNull(0)) {
                    string = null;
                } else {
                    string = S.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.t
    public final u.a o(String str) {
        Integer valueOf;
        x1.p g5 = x1.p.g(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            u.a aVar = null;
            if (S.moveToFirst()) {
                if (S.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(S.getInt(0));
                }
                if (valueOf != null) {
                    aVar = ca.a.F0(valueOf.intValue());
                }
            }
            return aVar;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.t
    public final s p(String str) {
        x1.p pVar;
        int d02;
        int d03;
        int d04;
        int d05;
        int d06;
        int d07;
        int d08;
        int d09;
        int d010;
        int d011;
        int d012;
        int d013;
        int d014;
        int d015;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        x1.p g5 = x1.p.g(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            d02 = ca.a.d0(S, "id");
            d03 = ca.a.d0(S, "state");
            d04 = ca.a.d0(S, "worker_class_name");
            d05 = ca.a.d0(S, "input_merger_class_name");
            d06 = ca.a.d0(S, "input");
            d07 = ca.a.d0(S, "output");
            d08 = ca.a.d0(S, "initial_delay");
            d09 = ca.a.d0(S, "interval_duration");
            d010 = ca.a.d0(S, "flex_duration");
            d011 = ca.a.d0(S, "run_attempt_count");
            d012 = ca.a.d0(S, "backoff_policy");
            d013 = ca.a.d0(S, "backoff_delay_duration");
            d014 = ca.a.d0(S, "last_enqueue_time");
            d015 = ca.a.d0(S, "minimum_retention_duration");
            pVar = g5;
        } catch (Throwable th2) {
            th = th2;
            pVar = g5;
        }
        try {
            int d016 = ca.a.d0(S, "schedule_requested_at");
            int d017 = ca.a.d0(S, "run_in_foreground");
            int d018 = ca.a.d0(S, "out_of_quota_policy");
            int d019 = ca.a.d0(S, "period_count");
            int d020 = ca.a.d0(S, "generation");
            int d021 = ca.a.d0(S, "required_network_type");
            int d022 = ca.a.d0(S, "requires_charging");
            int d023 = ca.a.d0(S, "requires_device_idle");
            int d024 = ca.a.d0(S, "requires_battery_not_low");
            int d025 = ca.a.d0(S, "requires_storage_not_low");
            int d026 = ca.a.d0(S, "trigger_content_update_delay");
            int d027 = ca.a.d0(S, "trigger_max_content_delay");
            int d028 = ca.a.d0(S, "content_uri_triggers");
            s sVar = null;
            byte[] blob3 = null;
            if (S.moveToFirst()) {
                if (S.isNull(d02)) {
                    string = null;
                } else {
                    string = S.getString(d02);
                }
                u.a F0 = ca.a.F0(S.getInt(d03));
                if (S.isNull(d04)) {
                    string2 = null;
                } else {
                    string2 = S.getString(d04);
                }
                if (S.isNull(d05)) {
                    string3 = null;
                } else {
                    string3 = S.getString(d05);
                }
                if (S.isNull(d06)) {
                    blob = null;
                } else {
                    blob = S.getBlob(d06);
                }
                androidx.work.d a10 = androidx.work.d.a(blob);
                if (S.isNull(d07)) {
                    blob2 = null;
                } else {
                    blob2 = S.getBlob(d07);
                }
                androidx.work.d a11 = androidx.work.d.a(blob2);
                long j10 = S.getLong(d08);
                long j11 = S.getLong(d09);
                long j12 = S.getLong(d010);
                int i14 = S.getInt(d011);
                int C0 = ca.a.C0(S.getInt(d012));
                long j13 = S.getLong(d013);
                long j14 = S.getLong(d014);
                long j15 = S.getLong(d015);
                long j16 = S.getLong(d016);
                if (S.getInt(d017) != 0) {
                    i6 = d018;
                    z10 = true;
                } else {
                    i6 = d018;
                    z10 = false;
                }
                int E0 = ca.a.E0(S.getInt(i6));
                int i15 = S.getInt(d019);
                int i16 = S.getInt(d020);
                int D0 = ca.a.D0(S.getInt(d021));
                if (S.getInt(d022) != 0) {
                    i10 = d023;
                    z11 = true;
                } else {
                    i10 = d023;
                    z11 = false;
                }
                if (S.getInt(i10) != 0) {
                    i11 = d024;
                    z12 = true;
                } else {
                    i11 = d024;
                    z12 = false;
                }
                if (S.getInt(i11) != 0) {
                    i12 = d025;
                    z13 = true;
                } else {
                    i12 = d025;
                    z13 = false;
                }
                if (S.getInt(i12) != 0) {
                    i13 = d026;
                    z14 = true;
                } else {
                    i13 = d026;
                    z14 = false;
                }
                long j17 = S.getLong(i13);
                long j18 = S.getLong(d027);
                if (!S.isNull(d028)) {
                    blob3 = S.getBlob(d028);
                }
                sVar = new s(string, F0, string2, string3, a10, a11, j10, j11, j12, new androidx.work.c(D0, z11, z12, z13, z14, j17, j18, ca.a.t(blob3)), i14, C0, j13, j14, j15, j16, z10, E0, i15, i16);
            }
            S.close();
            pVar.h();
            return sVar;
        } catch (Throwable th3) {
            th = th3;
            S.close();
            pVar.h();
            throw th;
        }
    }

    @Override // v2.t
    public final int q(String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        m mVar = this.f34767i;
        b2.f a10 = mVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        nVar.c();
        try {
            int v10 = a10.v();
            nVar.n();
            return v10;
        } finally {
            nVar.j();
            mVar.d(a10);
        }
    }

    @Override // v2.t
    public final x1.s r(List list) {
        StringBuilder c10 = v.h.c("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        ta.v.e(size, c10);
        c10.append(")");
        x1.p g5 = x1.p.g(size + 0, c10.toString());
        Iterator it = list.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                g5.i0(i6);
            } else {
                g5.t(i6, str);
            }
            i6++;
        }
        x1.h hVar = this.f34760a.f37519e;
        v vVar = new v(this, g5);
        hVar.getClass();
        String[] d10 = hVar.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        for (String str2 : d10) {
            LinkedHashMap linkedHashMap = hVar.f37476d;
            Locale US = Locale.US;
            kotlin.jvm.internal.i.f(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!linkedHashMap.containsKey(lowerCase)) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
            }
        }
        androidx.appcompat.widget.l lVar = hVar.f37481j;
        lVar.getClass();
        return new x1.s((x1.n) lVar.f1471v, lVar, vVar, d10);
    }

    @Override // v2.t
    public final ArrayList s(String str) {
        byte[] blob;
        x1.p g5 = x1.p.g(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34760a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            ArrayList arrayList = new ArrayList(S.getCount());
            while (S.moveToNext()) {
                if (S.isNull(0)) {
                    blob = null;
                } else {
                    blob = S.getBlob(0);
                }
                arrayList.add(androidx.work.d.a(blob));
            }
            return arrayList;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.t
    public final int t(String str) {
        x1.n nVar = this.f34760a;
        nVar.b();
        l lVar = this.f34766h;
        b2.f a10 = lVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        nVar.c();
        try {
            int v10 = a10.v();
            nVar.n();
            return v10;
        } finally {
            nVar.j();
            lVar.d(a10);
        }
    }

    @Override // v2.t
    public final void u(s sVar) {
        x1.n nVar = this.f34760a;
        nVar.b();
        nVar.c();
        try {
            this.f34761b.f(sVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }

    @Override // v2.t
    public final int v() {
        x1.n nVar = this.f34760a;
        nVar.b();
        b bVar = this.f34769k;
        b2.f a10 = bVar.a();
        nVar.c();
        try {
            int v10 = a10.v();
            nVar.n();
            return v10;
        } finally {
            nVar.j();
            bVar.d(a10);
        }
    }

    public final void w(t.b<String, ArrayList<androidx.work.d>> bVar) {
        int i6;
        g.c cVar = (g.c) bVar.keySet();
        if (cVar.isEmpty()) {
            return;
        }
        if (bVar.f32260w > 999) {
            t.b<String, ArrayList<androidx.work.d>> bVar2 = new t.b<>(999);
            int i10 = bVar.f32260w;
            int i11 = 0;
            loop0: while (true) {
                i6 = 0;
                while (i11 < i10) {
                    bVar2.put(bVar.i(i11), bVar.m(i11));
                    i11++;
                    i6++;
                    if (i6 == 999) {
                        break;
                    }
                }
                w(bVar2);
                bVar2 = new t.b<>(999);
            }
            if (i6 > 0) {
                w(bVar2);
                return;
            }
            return;
        }
        StringBuilder c10 = v.h.c("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = cVar.size();
        ta.v.e(size, c10);
        c10.append(")");
        x1.p g5 = x1.p.g(size + 0, c10.toString());
        Iterator it = cVar.iterator();
        int i12 = 1;
        while (true) {
            g.a aVar = (g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            String str = (String) aVar.next();
            if (str == null) {
                g5.i0(i12);
            } else {
                g5.t(i12, str);
            }
            i12++;
        }
        Cursor S = kc.f.S(this.f34760a, g5, false);
        try {
            int c0 = ca.a.c0(S, "work_spec_id");
            if (c0 == -1) {
                return;
            }
            while (S.moveToNext()) {
                byte[] bArr = null;
                ArrayList<androidx.work.d> orDefault = bVar.getOrDefault(S.getString(c0), null);
                if (orDefault != null) {
                    if (!S.isNull(0)) {
                        bArr = S.getBlob(0);
                    }
                    orDefault.add(androidx.work.d.a(bArr));
                }
            }
        } finally {
            S.close();
        }
    }

    public final void x(t.b<String, ArrayList<String>> bVar) {
        int i6;
        g.c cVar = (g.c) bVar.keySet();
        if (cVar.isEmpty()) {
            return;
        }
        if (bVar.f32260w > 999) {
            t.b<String, ArrayList<String>> bVar2 = new t.b<>(999);
            int i10 = bVar.f32260w;
            int i11 = 0;
            loop0: while (true) {
                i6 = 0;
                while (i11 < i10) {
                    bVar2.put(bVar.i(i11), bVar.m(i11));
                    i11++;
                    i6++;
                    if (i6 == 999) {
                        break;
                    }
                }
                x(bVar2);
                bVar2 = new t.b<>(999);
            }
            if (i6 > 0) {
                x(bVar2);
                return;
            }
            return;
        }
        StringBuilder c10 = v.h.c("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = cVar.size();
        ta.v.e(size, c10);
        c10.append(")");
        x1.p g5 = x1.p.g(size + 0, c10.toString());
        Iterator it = cVar.iterator();
        int i12 = 1;
        while (true) {
            g.a aVar = (g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            String str = (String) aVar.next();
            if (str == null) {
                g5.i0(i12);
            } else {
                g5.t(i12, str);
            }
            i12++;
        }
        Cursor S = kc.f.S(this.f34760a, g5, false);
        try {
            int c0 = ca.a.c0(S, "work_spec_id");
            if (c0 == -1) {
                return;
            }
            while (S.moveToNext()) {
                String str2 = null;
                ArrayList<String> orDefault = bVar.getOrDefault(S.getString(c0), null);
                if (orDefault != null) {
                    if (!S.isNull(0)) {
                        str2 = S.getString(0);
                    }
                    orDefault.add(str2);
                }
            }
        } finally {
            S.close();
        }
    }
}
