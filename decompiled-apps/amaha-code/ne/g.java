package ne;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.Arrays;
import java.util.HashSet;
import tr.i0;
/* compiled from: Datastore.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f26221d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a  reason: collision with root package name */
    public final t f26222a;

    /* renamed from: b  reason: collision with root package name */
    public final oe.a f26223b;

    /* renamed from: c  reason: collision with root package name */
    public final n f26224c;

    public g(Context context, e9.c cVar, com.android.volley.toolbox.a aVar, com.android.volley.toolbox.a aVar2, q qVar, oe.a aVar3) {
        this.f26223b = aVar3;
        this.f26222a = new t((ke.f) cVar.f13869c);
        this.f26224c = new n(context, cVar, aVar, aVar2, qVar, aVar3);
    }

    public static boolean a(i0 i0Var) {
        FirebaseFirestoreException.a aVar = FirebaseFirestoreException.a.f9623z.get(i0Var.f33491a.f33498u, FirebaseFirestoreException.a.UNKNOWN);
        switch (aVar.ordinal()) {
            case 0:
                throw new IllegalArgumentException("Treated status OK as error");
            case 1:
            case 2:
            case 4:
            case 8:
            case 13:
            case 14:
            case 16:
                return false;
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }
}
