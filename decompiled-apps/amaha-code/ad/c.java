package ad;

import com.google.firebase.FirebaseException;
import v9.o;
/* compiled from: DefaultAppCheckTokenResult.java */
/* loaded from: classes.dex */
public final class c extends zc.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f481a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseException f482b;

    public c(String str, FirebaseException firebaseException) {
        o.e(str);
        this.f481a = str;
        this.f482b = firebaseException;
    }

    public static c c(zc.b bVar) {
        o.h(bVar);
        return new c(bVar.b(), null);
    }

    @Override // zc.c
    public final FirebaseException a() {
        return this.f482b;
    }

    @Override // zc.c
    public final String b() {
        return this.f481a;
    }
}
