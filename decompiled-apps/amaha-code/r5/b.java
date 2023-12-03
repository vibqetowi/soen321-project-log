package r5;

import hs.f;
import is.e0;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import r5.c;
/* compiled from: Model.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap f30455m = e0.s0(new f("embedding.weight", "embed.weight"), new f("dense1.weight", "fc1.weight"), new f("dense2.weight", "fc2.weight"), new f("dense3.weight", "fc3.weight"), new f("dense1.bias", "fc1.bias"), new f("dense2.bias", "fc2.bias"), new f("dense3.bias", "fc3.bias"));

    /* renamed from: a  reason: collision with root package name */
    public final a f30456a;

    /* renamed from: b  reason: collision with root package name */
    public final a f30457b;

    /* renamed from: c  reason: collision with root package name */
    public final a f30458c;

    /* renamed from: d  reason: collision with root package name */
    public final a f30459d;

    /* renamed from: e  reason: collision with root package name */
    public final a f30460e;
    public final a f;

    /* renamed from: g  reason: collision with root package name */
    public final a f30461g;

    /* renamed from: h  reason: collision with root package name */
    public final a f30462h;

    /* renamed from: i  reason: collision with root package name */
    public final a f30463i;

    /* renamed from: j  reason: collision with root package name */
    public final a f30464j;

    /* renamed from: k  reason: collision with root package name */
    public final a f30465k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f30466l;

    public b() {
        throw null;
    }

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.f30456a = (a) obj;
            int i6 = d.f30481a;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.f30457b = d.l((a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.f30458c = d.l((a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f30459d = d.l((a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f30460e = (a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f = (a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f30461g = (a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f30462h = d.k((a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f30463i = d.k((a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f30464j = (a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f30465k = (a) obj11;
                                                    this.f30466l = new HashMap();
                                                    for (String str : ca.a.m1(c.a.MTML_INTEGRITY_DETECT.d(), c.a.MTML_APP_EVENT_PREDICTION.d())) {
                                                        String n10 = i.n(".weight", str);
                                                        String n11 = i.n(".bias", str);
                                                        a aVar = (a) hashMap.get(n10);
                                                        a aVar2 = (a) hashMap.get(n11);
                                                        if (aVar != null) {
                                                            this.f30466l.put(n10, d.k(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f30466l.put(n11, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final a a(a aVar, String[] strArr, String str) {
        HashMap hashMap = this.f30466l;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            int i6 = d.f30481a;
            a c10 = d.c(d.e(strArr, this.f30456a), this.f30457b);
            d.a(c10, this.f30460e);
            d.i(c10);
            a c11 = d.c(c10, this.f30458c);
            d.a(c11, this.f);
            d.i(c11);
            a g5 = d.g(c11, 2);
            a c12 = d.c(g5, this.f30459d);
            d.a(c12, this.f30461g);
            d.i(c12);
            a g10 = d.g(c10, c10.f30452a[1]);
            a g11 = d.g(g5, g5.f30452a[1]);
            a g12 = d.g(c12, c12.f30452a[1]);
            d.f(g10);
            d.f(g11);
            d.f(g12);
            a d10 = d.d(d.b(new a[]{g10, g11, g12, aVar}), this.f30462h, this.f30464j);
            d.i(d10);
            a d11 = d.d(d10, this.f30463i, this.f30465k);
            d.i(d11);
            a aVar2 = (a) hashMap.get(i.n(".weight", str));
            a aVar3 = (a) hashMap.get(i.n(".bias", str));
            if (aVar2 != null && aVar3 != null) {
                a d12 = d.d(d11, aVar2, aVar3);
                d.j(d12);
                return d12;
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
