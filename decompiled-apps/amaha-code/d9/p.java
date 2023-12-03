package d9;

import android.database.Cursor;
import android.os.Bundle;
import c9.j;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.w;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseException;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.FirebaseFirestoreException;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import je.s0;
import mf.e;
import pd.b0;
import re.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements f.a, TextInputLayout.f, e.a, ya.b, ya.g, hd.f, a.InterfaceC0519a, a7.e, ImmutableSortedMap.Builder.KeyTranslator, oe.i, oe.j, j.a, c9.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12711u;

    public /* synthetic */ p(int i6) {
        this.f12711u = i6;
    }

    @Override // hd.f
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // c9.e
    public void accept(Object obj) {
        ((c.a) obj).d(this.f12711u);
    }

    @Override // a7.e
    public Object apply(Object obj) {
        switch (this.f12711u) {
            case 19:
                b0 b0Var = (b0) obj;
                td.a.f32991b.getClass();
                ce.c cVar = qd.a.f29523a;
                cVar.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    cVar.a(b0Var, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
            case 20:
            case 21:
            case 23:
            case 24:
            default:
                return Long.valueOf(((Cursor) obj).getLong(0));
            case 22:
                return Boolean.valueOf(((he.k) obj).g());
            case 25:
                return Long.valueOf(((Cursor) obj).getLong(0));
            case 26:
                int i6 = s0.f21920k;
                return Long.valueOf(((Cursor) obj).getLong(0));
            case 27:
                int i10 = s0.f21920k;
                return Long.valueOf(((Cursor) obj).getLong(0));
        }
    }

    @Override // oe.j
    public void b(Object obj) {
        String str = (String) obj;
    }

    @Override // com.google.android.exoplayer2.f.a
    public com.google.android.exoplayer2.f c(Bundle bundle) {
        return new q(bundle.getFloat(q.b(3), 1.0f), bundle.getInt(q.b(0), 0), bundle.getInt(q.b(1), 0), bundle.getInt(q.b(2), 0));
    }

    @Override // ya.g
    public ya.h h(Object obj) {
        long e10;
        ad.a aVar = (ad.a) obj;
        int i6 = ad.b.f477d;
        v9.o.h(aVar);
        try {
            e10 = (long) (Double.parseDouble(aVar.f476b.replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map N0 = f6.b.N0(aVar.f475a);
            e10 = 1000 * (ad.b.e("exp", N0) - ad.b.e("iat", N0));
        }
        return ya.k.e(new ad.b(e10, aVar.f475a, System.currentTimeMillis()));
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        ((w.b) obj).y(this.f12711u);
    }

    @Override // ya.b
    public Object then(ya.h hVar) {
        switch (this.f12711u) {
            case 6:
                if (hVar.isSuccessful()) {
                    return ya.k.e(ad.c.c((zc.b) hVar.getResult()));
                }
                return ya.k.e(new ad.c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new FirebaseException(hVar.getException().getMessage(), hVar.getException())));
            case 21:
                if (hVar.isSuccessful()) {
                    return ya.k.e(((zc.c) hVar.getResult()).b());
                }
                return ya.k.d(hVar.getException());
            case 24:
                ke.g gVar = (ke.g) hVar.getResult();
                if (!gVar.b()) {
                    if (gVar.h()) {
                        return null;
                    }
                    throw new FirebaseFirestoreException("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", FirebaseFirestoreException.a.UNAVAILABLE);
                }
                return gVar;
            default:
                SecureRandom secureRandom = oe.n.f27432a;
                if (hVar.isSuccessful()) {
                    return (Void) hVar.getResult();
                }
                Exception exception = hVar.getException();
                if (exception instanceof StatusException) {
                    exception = oe.n.f(((StatusException) exception).f20422u);
                } else if (exception instanceof StatusRuntimeException) {
                    exception = oe.n.f(((StatusRuntimeException) exception).f20424u);
                }
                if (exception instanceof FirebaseFirestoreException) {
                    throw exception;
                }
                throw new FirebaseFirestoreException(exception.getMessage(), FirebaseFirestoreException.a.UNKNOWN, exception);
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
    public Object translate(Object obj) {
        Object lambda$static$0;
        lambda$static$0 = ImmutableSortedMap.Builder.lambda$static$0(obj);
        return lambda$static$0;
    }

    @Override // re.a.InterfaceC0519a
    public void i(re.b bVar) {
    }
}
