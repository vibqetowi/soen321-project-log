package x1;

import android.content.Context;
import android.content.Intent;
import b2.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import x1.n;
/* compiled from: DatabaseConfiguration.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f37453a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37454b;

    /* renamed from: c  reason: collision with root package name */
    public final c.InterfaceC0074c f37455c;

    /* renamed from: d  reason: collision with root package name */
    public final n.c f37456d;

    /* renamed from: e  reason: collision with root package name */
    public final List<n.b> f37457e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f37458g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f37459h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f37460i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f37461j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f37462k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f37463l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<Integer> f37464m;

    /* renamed from: n  reason: collision with root package name */
    public final Callable<InputStream> f37465n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Object> f37466o;

    /* renamed from: p  reason: collision with root package name */
    public final List<df.b> f37467p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f37468q;

    public b(Context context, String str, c.InterfaceC0074c interfaceC0074c, n.c migrationContainer, ArrayList arrayList, boolean z10, int i6, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(migrationContainer, "migrationContainer");
        defpackage.d.j(i6, "journalMode");
        kotlin.jvm.internal.i.g(typeConverters, "typeConverters");
        kotlin.jvm.internal.i.g(autoMigrationSpecs, "autoMigrationSpecs");
        this.f37453a = context;
        this.f37454b = str;
        this.f37455c = interfaceC0074c;
        this.f37456d = migrationContainer;
        this.f37457e = arrayList;
        this.f = z10;
        this.f37458g = i6;
        this.f37459h = executor;
        this.f37460i = executor2;
        this.f37461j = null;
        this.f37462k = z11;
        this.f37463l = z12;
        this.f37464m = linkedHashSet;
        this.f37465n = null;
        this.f37466o = typeConverters;
        this.f37467p = autoMigrationSpecs;
        this.f37468q = false;
    }

    public final boolean a(int i6, int i10) {
        boolean z10;
        Set<Integer> set;
        if (i6 > i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((!z10 || !this.f37463l) && this.f37462k && ((set = this.f37464m) == null || !set.contains(Integer.valueOf(i6)))) {
            return true;
        }
        return false;
    }
}
