package pi;

import androidx.lifecycle.v;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: HtmlCampaignPayload.kt */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: h  reason: collision with root package name */
    public final String f28470h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28471i;

    /* renamed from: j  reason: collision with root package name */
    public final String f28472j;

    /* renamed from: k  reason: collision with root package name */
    public final long f28473k;

    /* renamed from: l  reason: collision with root package name */
    public final JSONObject f28474l;

    /* renamed from: m  reason: collision with root package name */
    public final aj.a f28475m;

    /* renamed from: n  reason: collision with root package name */
    public final int f28476n;

    /* renamed from: o  reason: collision with root package name */
    public final Set<ri.c> f28477o;

    /* renamed from: p  reason: collision with root package name */
    public final v f28478p;

    /* renamed from: q  reason: collision with root package name */
    public final String f28479q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String campaignId, String campaignName, String templateType, long j10, JSONObject jSONObject, aj.a aVar, int i6, LinkedHashSet linkedHashSet, v vVar, String htmlPayload) {
        super(campaignId, campaignName, templateType, j10, jSONObject, aVar, i6, linkedHashSet);
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        kotlin.jvm.internal.i.g(campaignName, "campaignName");
        kotlin.jvm.internal.i.g(templateType, "templateType");
        defpackage.d.j(i6, "inAppType");
        kotlin.jvm.internal.i.g(htmlPayload, "htmlPayload");
        this.f28470h = campaignId;
        this.f28471i = campaignName;
        this.f28472j = templateType;
        this.f28473k = j10;
        this.f28474l = jSONObject;
        this.f28475m = aVar;
        this.f28476n = i6;
        this.f28477o = linkedHashSet;
        this.f28478p = vVar;
        this.f28479q = htmlPayload;
    }

    @Override // pi.d
    public final aj.a a() {
        return this.f28475m;
    }

    @Override // pi.d
    public final String b() {
        return this.f28470h;
    }

    @Override // pi.d
    public final String c() {
        return this.f28471i;
    }

    @Override // pi.d
    public final long d() {
        return this.f28473k;
    }

    @Override // pi.d
    public final int e() {
        return this.f28476n;
    }

    @Override // pi.d
    public final Set<ri.c> f() {
        return this.f28477o;
    }

    @Override // pi.d
    public final String g() {
        return this.f28472j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(campaignId: ");
        sb2.append(this.f28470h);
        sb2.append(", campaignName: ");
        sb2.append(this.f28471i);
        sb2.append(", templateType: ");
        sb2.append(this.f28472j);
        sb2.append(", dismissInterval: ");
        sb2.append(this.f28473k);
        sb2.append(", payload: ");
        sb2.append(this.f28474l);
        sb2.append(", campaignContext; ");
        sb2.append(this.f28475m);
        sb2.append(", inAppType: ");
        sb2.append(pl.a.j(this.f28476n));
        sb2.append(", supportedOrientations: ");
        sb2.append(this.f28477o);
        sb2.append(", htmlAssets: ");
        sb2.append(this.f28478p);
        sb2.append(", htmlPayload: ");
        return v.g.c(sb2, this.f28479q, ')');
    }
}
