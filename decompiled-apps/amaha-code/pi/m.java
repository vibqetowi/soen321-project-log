package pi;

import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: NativeCampaignPayload.kt */
/* loaded from: classes.dex */
public final class m extends d {

    /* renamed from: h  reason: collision with root package name */
    public final String f28493h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28494i;

    /* renamed from: j  reason: collision with root package name */
    public final String f28495j;

    /* renamed from: k  reason: collision with root package name */
    public final long f28496k;

    /* renamed from: l  reason: collision with root package name */
    public final aj.a f28497l;

    /* renamed from: m  reason: collision with root package name */
    public final int f28498m;

    /* renamed from: n  reason: collision with root package name */
    public final Set<ri.c> f28499n;

    /* renamed from: o  reason: collision with root package name */
    public final i f28500o;

    /* renamed from: p  reason: collision with root package name */
    public final int f28501p;

    public m() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, String str3, long j10, JSONObject jSONObject, aj.a aVar, int i6, LinkedHashSet linkedHashSet, i iVar, int i10, String str4) {
        super(str, str2, str3, j10, jSONObject, aVar, i6, linkedHashSet);
        defpackage.d.j(i6, "inAppType");
        defpackage.d.j(i10, "alignment");
        this.f28493h = str;
        this.f28494i = str2;
        this.f28495j = str3;
        this.f28496k = j10;
        this.f28497l = aVar;
        this.f28498m = i6;
        this.f28499n = linkedHashSet;
        this.f28500o = iVar;
        this.f28501p = i10;
    }

    @Override // pi.d
    public final aj.a a() {
        return this.f28497l;
    }

    @Override // pi.d
    public final String b() {
        return this.f28493h;
    }

    @Override // pi.d
    public final String c() {
        return this.f28494i;
    }

    @Override // pi.d
    public final long d() {
        return this.f28496k;
    }

    @Override // pi.d
    public final int e() {
        return this.f28498m;
    }

    @Override // pi.d
    public final Set<ri.c> f() {
        return this.f28499n;
    }

    @Override // pi.d
    public final String g() {
        return this.f28495j;
    }
}
