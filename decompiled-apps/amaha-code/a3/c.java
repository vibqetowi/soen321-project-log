package a3;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<i3.e>> f178c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, l> f179d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, f3.c> f180e;
    public List<f3.h> f;

    /* renamed from: g  reason: collision with root package name */
    public t.i<f3.d> f181g;

    /* renamed from: h  reason: collision with root package name */
    public t.e<i3.e> f182h;

    /* renamed from: i  reason: collision with root package name */
    public List<i3.e> f183i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f184j;

    /* renamed from: k  reason: collision with root package name */
    public float f185k;

    /* renamed from: l  reason: collision with root package name */
    public float f186l;

    /* renamed from: m  reason: collision with root package name */
    public float f187m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f188n;

    /* renamed from: a  reason: collision with root package name */
    public final s f176a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f177b = new HashSet<>();

    /* renamed from: o  reason: collision with root package name */
    public int f189o = 0;

    public final void a(String str) {
        m3.c.b(str);
        this.f177b.add(str);
    }

    public final float b() {
        return ((this.f186l - this.f185k) / this.f187m) * 1000.0f;
    }

    public final f3.h c(String str) {
        this.f.size();
        for (int i6 = 0; i6 < this.f.size(); i6++) {
            f3.h hVar = this.f.get(i6);
            String str2 = hVar.f14779a;
            boolean z10 = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z10 = false;
            }
            if (z10) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (i3.e eVar : this.f183i) {
            sb2.append(eVar.a("\t"));
        }
        return sb2.toString();
    }
}
