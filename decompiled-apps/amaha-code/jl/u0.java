package jl;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.b;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import he.k;
/* compiled from: NotV4DashboardRepository.kt */
/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22359a;

    public u0() {
        FirebaseFirestore.d();
        this.f22359a = LogHelper.INSTANCE.makeLogTag("NotV4DashboardRepository");
    }

    public static final Integer a(u0 u0Var) {
        String g5 = defpackage.b.g();
        if (g5 != null) {
            switch (g5.hashCode()) {
                case -2114782937:
                    if (g5.equals(Constants.COURSE_HAPPINESS)) {
                        return Integer.valueOf((int) R.raw.happiness_suggested);
                    }
                    break;
                case -1617042330:
                    if (g5.equals(Constants.COURSE_DEPRESSION)) {
                        return Integer.valueOf((int) R.raw.depression_suggested);
                    }
                    break;
                case -891989580:
                    if (g5.equals(Constants.COURSE_STRESS)) {
                        return Integer.valueOf((int) R.raw.stress_suggested);
                    }
                    break;
                case 92960775:
                    if (g5.equals(Constants.COURSE_ANGER)) {
                        return Integer.valueOf((int) R.raw.anger_suggested);
                    }
                    break;
                case 109522647:
                    if (g5.equals(Constants.COURSE_SLEEP)) {
                        return Integer.valueOf((int) R.raw.sleep_suggested);
                    }
                    break;
                case 113319009:
                    if (g5.equals(Constants.COURSE_WORRY)) {
                        return Integer.valueOf((int) R.raw.worry_suggested);
                    }
                    break;
            }
        }
        return null;
    }

    public static kotlinx.coroutines.flow.r c(kotlinx.coroutines.flow.x lastVisibleItemAccessDate, int i6) {
        String str;
        kotlin.jvm.internal.i.g(lastVisibleItemAccessDate, "lastVisibleItemAccessDate");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        StringBuilder sb2 = new StringBuilder("userLibraryProgress/");
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str = fVar.j0();
        } else {
            str = null;
        }
        sb2.append(str);
        DatabaseReference reference = firebaseDatabase.getReference(sb2.toString());
        kotlin.jvm.internal.i.f(reference, "getInstance()\n          …nce().currentUser?.uid}\")");
        reference.keepSynced(true);
        return new kotlinx.coroutines.flow.r(new q0(lastVisibleItemAccessDate, reference, i6, null));
    }

    public final Object b(String str, ns.c cVar) {
        ls.h hVar = new ls.h(ca.a.G0(cVar));
        try {
            ya.v a10 = FirebaseFirestore.d().b("content_posts_new").k(new b.a(fe.j.f14995c, k.a.EQUAL, str)).a();
            a10.addOnCompleteListener(new l0(hVar));
            a10.addOnFailureListener(new m0(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22359a, e10);
        }
        return hVar.b();
    }
}
