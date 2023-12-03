package ht;

import is.e0;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: KotlinTarget.kt */
/* loaded from: classes2.dex */
public enum n {
    J(true),
    K(true),
    L(false),
    M(true),
    N(true),
    O(true),
    P(true),
    Q(true),
    R(true),
    S(true),
    T(true),
    U(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(false),
    V(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(false),
    W(false),
    X(false),
    Y(false),
    Z(false),
    f19512a0(false),
    f19513b0(false),
    c0(false),
    f19514d0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF302(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF313(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF324(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF335(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF346(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF357(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF368(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF379(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF390(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF401(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF412(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF424(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF436(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF447(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF458(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF469(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF480(false);
    
    public static final List<n> A;
    public static final List<n> B;
    public static final List<n> C;
    public static final List<n> D;
    public static final List<n> E;
    public static final List<n> F;
    public static final List<n> G;
    public static final List<n> H;
    public static final Map<e, n> I;

    /* renamed from: v  reason: collision with root package name */
    public static final HashMap<String, n> f19515v = new HashMap<>();

    /* renamed from: w  reason: collision with root package name */
    public static final List<n> f19516w;

    /* renamed from: x  reason: collision with root package name */
    public static final List<n> f19517x;

    /* renamed from: y  reason: collision with root package name */
    public static final List<n> f19518y;

    /* renamed from: z  reason: collision with root package name */
    public static final List<n> f19519z;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f19520u;

    static {
        n[] values;
        for (n nVar : values()) {
            f19515v.put(nVar.name(), nVar);
        }
        n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values2) {
            if (nVar2.f19520u) {
                arrayList.add(nVar2);
            }
        }
        u.M2(arrayList);
        is.k.k2(values());
        n nVar3 = J;
        f19516w = ca.a.P0(K, nVar3);
        f19517x = ca.a.P0(f19514d0, nVar3);
        f19518y = ca.a.P0(W, nVar3);
        n nVar4 = X;
        f19519z = ca.a.P0(Z, nVar4, nVar3);
        A = ca.a.P0(Y, nVar4, nVar3);
        B = ca.a.P0(f19512a0, nVar3);
        C = ca.a.P0(f19513b0, nVar3);
        n nVar5 = M;
        n nVar6 = N;
        D = ca.a.P0(c0, nVar5, nVar6);
        n nVar7 = T;
        E = ca.a.O0(nVar7);
        n nVar8 = S;
        F = ca.a.O0(nVar8);
        G = ca.a.O0(R);
        n nVar9 = V;
        H = ca.a.O0(nVar9);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar10 = P;
        I = e0.u0(new hs.f(eVar, nVar10), new hs.f(e.FIELD, nVar6), new hs.f(e.PROPERTY, nVar5), new hs.f(e.FILE, nVar9), new hs.f(e.PROPERTY_GETTER, nVar8), new hs.f(e.PROPERTY_SETTER, nVar7), new hs.f(e.RECEIVER, nVar10), new hs.f(e.SETTER_PARAMETER, nVar10), new hs.f(e.PROPERTY_DELEGATE_FIELD, nVar6));
    }

    n(boolean z10) {
        this.f19520u = z10;
    }
}
