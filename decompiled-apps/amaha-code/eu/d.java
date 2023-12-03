package eu;

import kotlin.jvm.internal.i;
/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes2.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f14559a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14560b;

        public a(String name, String desc) {
            i.g(name, "name");
            i.g(desc, "desc");
            this.f14559a = name;
            this.f14560b = desc;
        }

        @Override // eu.d
        public final String a() {
            return this.f14559a + ':' + this.f14560b;
        }

        @Override // eu.d
        public final String b() {
            return this.f14560b;
        }

        @Override // eu.d
        public final String c() {
            return this.f14559a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (i.b(this.f14559a, aVar.f14559a) && i.b(this.f14560b, aVar.f14560b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f14560b.hashCode() + (this.f14559a.hashCode() * 31);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    /* loaded from: classes2.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f14561a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14562b;

        public b(String name, String desc) {
            i.g(name, "name");
            i.g(desc, "desc");
            this.f14561a = name;
            this.f14562b = desc;
        }

        @Override // eu.d
        public final String a() {
            return this.f14561a + this.f14562b;
        }

        @Override // eu.d
        public final String b() {
            return this.f14562b;
        }

        @Override // eu.d
        public final String c() {
            return this.f14561a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (i.b(this.f14561a, bVar.f14561a) && i.b(this.f14562b, bVar.f14562b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f14562b.hashCode() + (this.f14561a.hashCode() * 31);
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
