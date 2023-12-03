package f3;

import h3.l;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<l> f14770a;

    /* renamed from: b  reason: collision with root package name */
    public final char f14771b;

    /* renamed from: c  reason: collision with root package name */
    public final double f14772c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14773d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14774e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f14770a = arrayList;
        this.f14771b = c10;
        this.f14772c = d10;
        this.f14773d = str;
        this.f14774e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + pl.a.c(str, (c10 + 0) * 31, 31);
    }

    public final int hashCode() {
        return a(this.f14771b, this.f14774e, this.f14773d);
    }
}
