package a4;

import java.io.File;
/* compiled from: IdentityConfiguration.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f289a;

    /* renamed from: b  reason: collision with root package name */
    public final String f290b;

    /* renamed from: c  reason: collision with root package name */
    public final String f291c;

    /* renamed from: d  reason: collision with root package name */
    public final j f292d;

    /* renamed from: e  reason: collision with root package name */
    public final File f293e;

    public d(String instanceName, String str, df.b bVar, File file, int i6) {
        str = (i6 & 2) != 0 ? null : str;
        file = (i6 & 16) != 0 ? null : file;
        kotlin.jvm.internal.i.g(instanceName, "instanceName");
        this.f289a = instanceName;
        this.f290b = str;
        this.f291c = null;
        this.f292d = bVar;
        this.f293e = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.b(this.f289a, dVar.f289a) && kotlin.jvm.internal.i.b(this.f290b, dVar.f290b) && kotlin.jvm.internal.i.b(this.f291c, dVar.f291c) && kotlin.jvm.internal.i.b(this.f292d, dVar.f292d) && kotlin.jvm.internal.i.b(this.f293e, dVar.f293e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f289a.hashCode() * 31;
        int i6 = 0;
        String str = this.f290b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        String str2 = this.f291c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode4 = (this.f292d.hashCode() + ((i10 + hashCode2) * 31)) * 31;
        File file = this.f293e;
        if (file != null) {
            i6 = file.hashCode();
        }
        return hashCode4 + i6;
    }

    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.f289a + ", apiKey=" + ((Object) this.f290b) + ", experimentApiKey=" + ((Object) this.f291c) + ", identityStorageProvider=" + this.f292d + ", storageDirectory=" + this.f293e + ')';
    }
}
