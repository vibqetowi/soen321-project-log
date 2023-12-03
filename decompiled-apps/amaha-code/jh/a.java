package jh;

import java.util.HashMap;
/* compiled from: TrafficSource.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22023a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22024b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22025c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22026d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22027e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22028g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, String> f22029h;

    public a() {
        this.f22029h = new HashMap<>();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f22023a;
        String str2 = this.f22023a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = aVar.f22024b;
        String str4 = this.f22024b;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = aVar.f22025c;
        String str6 = this.f22025c;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = aVar.f22026d;
        String str8 = this.f22026d;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        String str9 = aVar.f;
        String str10 = this.f;
        if (str10 == null ? str9 != null : !str10.equals(str9)) {
            return false;
        }
        String str11 = aVar.f22028g;
        String str12 = this.f22028g;
        if (str12 == null ? str11 != null : !str12.equals(str11)) {
            return false;
        }
        return this.f22029h.equals(aVar.f22029h);
    }

    public final String toString() {
        return "{source : '" + this.f22023a + "', medium : '" + this.f22024b + "', campaignName : '" + this.f22025c + "', campaignId : '" + this.f22026d + "', sourceUrl : '" + this.f22027e + "', content : '" + this.f + "', term : '" + this.f22028g + "', extras : " + this.f22029h.toString() + '}';
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> hashMap) {
        this.f22023a = str;
        this.f22024b = str2;
        this.f22025c = str3;
        this.f22026d = str4;
        this.f = str5;
        this.f22028g = str6;
        this.f22027e = str7;
        this.f22029h = hashMap;
    }
}
