package e7;

import android.content.Context;
import r1.b0;
/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13814a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.a f13815b;

    /* renamed from: c  reason: collision with root package name */
    public final m7.a f13816c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13817d;

    public c(Context context, m7.a aVar, m7.a aVar2, String str) {
        if (context != null) {
            this.f13814a = context;
            if (aVar != null) {
                this.f13815b = aVar;
                if (aVar2 != null) {
                    this.f13816c = aVar2;
                    if (str != null) {
                        this.f13817d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // e7.h
    public final Context a() {
        return this.f13814a;
    }

    @Override // e7.h
    public final String b() {
        return this.f13817d;
    }

    @Override // e7.h
    public final m7.a c() {
        return this.f13816c;
    }

    @Override // e7.h
    public final m7.a d() {
        return this.f13815b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13814a.equals(hVar.a()) && this.f13815b.equals(hVar.d()) && this.f13816c.equals(hVar.c()) && this.f13817d.equals(hVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13814a.hashCode() ^ 1000003) * 1000003) ^ this.f13815b.hashCode()) * 1000003) ^ this.f13816c.hashCode()) * 1000003) ^ this.f13817d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f13814a);
        sb2.append(", wallClock=");
        sb2.append(this.f13815b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f13816c);
        sb2.append(", backendName=");
        return b0.b(sb2, this.f13817d, "}");
    }
}
