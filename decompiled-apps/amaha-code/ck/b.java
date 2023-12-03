package ck;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.utils.Constants;
import fd.f;
import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: MyApplication.kt */
@e(c = "com.theinnerhour.b2b.MyApplication$setUserStatusOffline$1", f = "MyApplication.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends i implements p<d0, d<? super k>, Object> {
    public b(d<? super b> dVar) {
        super(2, dVar);
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new b(dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return new b(dVar).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        sp.b.d0(obj);
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        StringBuilder sb2 = new StringBuilder("/Status/");
        f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str = fVar.j0();
        } else {
            str = null;
        }
        sb2.append(str);
        reference.child(sb2.toString()).setValue(Constants.OFFLINE);
        return k.f19476a;
    }
}
