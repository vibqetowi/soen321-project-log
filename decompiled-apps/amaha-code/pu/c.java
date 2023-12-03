package pu;

import pu.d;
/* compiled from: MemberScope.kt */
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28973a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f28974b;

        static {
            d.a aVar = d.f28976c;
            aVar.getClass();
            int i6 = d.f28983k;
            aVar.getClass();
            int i10 = d.f28981i;
            aVar.getClass();
            f28974b = (~(d.f28982j | i10)) & i6;
        }

        @Override // pu.c
        public final int a() {
            return f28974b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28975a = new b();

        @Override // pu.c
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
