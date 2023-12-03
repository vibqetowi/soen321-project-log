package im;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.inAppFunneling.model.InAppPromptModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import fd.f;
import hs.k;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: InAppPromptRepository.kt */
@e(c = "com.theinnerhour.b2b.components.inAppFunneling.repositories.InAppPromptRepository$checkAndSetTeleActionRecordingOff$2", f = "InAppPromptRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, ls.d<? super k>, Object> {

    /* compiled from: InAppPromptRepository.kt */
    /* renamed from: im.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0304a implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ DatabaseReference f20390u;

        public C0304a(DatabaseReference databaseReference) {
            this.f20390u = databaseReference;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            InAppPromptModel inAppPromptModel;
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            if (snapshot.exists() && (inAppPromptModel = (InAppPromptModel) snapshot.getValue(InAppPromptModel.class)) != null) {
                if (!inAppPromptModel.isExperimentActive()) {
                    inAppPromptModel = null;
                }
                if (inAppPromptModel != null) {
                    inAppPromptModel.setPromptList(new ArrayList<>());
                    inAppPromptModel.setExperimentActive(false);
                    this.f20390u.setValue(inAppPromptModel);
                    ApplicationPersistence.getInstance().setBooleanValue("inAppTeleRecordingStopped", true);
                }
            }
        }
    }

    public a(ls.d<? super a> dVar) {
        super(2, dVar);
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new a(dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return new a(dVar).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String j02;
        sp.b.d0(obj);
        f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null) {
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_USER_IN_APP_FUNNELING_NODE.concat(j02));
            kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…APP_FUNNELING_NODE}$uid\")");
            reference.addListenerForSingleValueEvent(new C0304a(reference));
            return k.f19476a;
        }
        return k.f19476a;
    }
}
