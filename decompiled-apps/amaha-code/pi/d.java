package pi;

import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: CampaignPayload.kt */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f28456a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28457b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28458c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28459d;

    /* renamed from: e  reason: collision with root package name */
    public final aj.a f28460e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<ri.c> f28461g;

    public d(String campaignId, String campaignName, String templateType, long j10, JSONObject jSONObject, aj.a aVar, int i6, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        kotlin.jvm.internal.i.g(campaignName, "campaignName");
        kotlin.jvm.internal.i.g(templateType, "templateType");
        defpackage.d.j(i6, "inAppType");
        this.f28456a = campaignId;
        this.f28457b = campaignName;
        this.f28458c = templateType;
        this.f28459d = j10;
        this.f28460e = aVar;
        this.f = i6;
        this.f28461g = linkedHashSet;
    }

    public aj.a a() {
        return this.f28460e;
    }

    public String b() {
        return this.f28456a;
    }

    public String c() {
        return this.f28457b;
    }

    public long d() {
        return this.f28459d;
    }

    public int e() {
        return this.f;
    }

    public Set<ri.c> f() {
        return this.f28461g;
    }

    public String g() {
        return this.f28458c;
    }
}
