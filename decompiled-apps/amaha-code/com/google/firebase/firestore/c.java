package com.google.firebase.firestore;
/* compiled from: FirebaseFirestoreSettings.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9630a = "firestore.googleapis.com";

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9631b = true;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9632c = true;

    /* renamed from: d  reason: collision with root package name */
    public final long f9633d = 104857600;

    /* compiled from: FirebaseFirestoreSettings.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public c(a aVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9630a.equals(cVar.f9630a) && this.f9631b == cVar.f9631b && this.f9632c == cVar.f9632c && this.f9633d == cVar.f9633d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f9630a.hashCode() * 31) + (this.f9631b ? 1 : 0)) * 31) + (this.f9632c ? 1 : 0)) * 31) + ((int) this.f9633d);
    }

    public final String toString() {
        return "FirebaseFirestoreSettings{host=" + this.f9630a + ", sslEnabled=" + this.f9631b + ", persistenceEnabled=" + this.f9632c + ", cacheSizeBytes=" + this.f9633d + "}";
    }
}
