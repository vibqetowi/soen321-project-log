package ce;

import com.google.firebase.encoders.EncodingException;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ae.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5243a;

    @Override // ae.a
    public final void a(Object obj, ae.d dVar) {
        switch (this.f5243a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ae.d dVar2 = dVar;
                Charset charset = de.e.f;
                dVar2.b(de.e.f12819g, entry.getKey());
                dVar2.b(de.e.f12820h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
