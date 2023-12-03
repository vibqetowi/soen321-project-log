package pm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import fe.q;
import fe.r;
import gv.n;
import hs.k;
import is.u;
import java.security.SecureRandom;
import kotlin.jvm.internal.i;
import ya.v;
/* compiled from: JournalFirebaseRepository.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: JournalFirebaseRepository.kt */
    /* renamed from: pm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0482a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f28673a;

        public C0482a(ls.h hVar) {
            this.f28673a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            i.g(it, "it");
            this.f28673a.resumeWith(Boolean.valueOf(it.isSuccessful()));
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ya.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f28674a;

        public b(ls.h hVar) {
            this.f28674a = hVar;
        }

        @Override // ya.c
        public final void b() {
            this.f28674a.resumeWith(Boolean.FALSE);
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<JournalModel> f28675a;

        public c(a aVar, ls.h hVar) {
            this.f28675a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<r> it) {
            k kVar;
            q qVar;
            JournalModel journalModel;
            q qVar2;
            i.g(it, "it");
            boolean isSuccessful = it.isSuccessful();
            ls.d<JournalModel> dVar = this.f28675a;
            if (isSuccessful) {
                r result = it.getResult();
                if (result != null && (qVar = (q) u.h2(result)) != null) {
                    r result2 = it.getResult();
                    if (result2 != null && (qVar2 = (q) u.h2(result2)) != null && (journalModel = (JournalModel) qVar2.d(JournalModel.class)) != null) {
                        journalModel.setFirestoreDocumentId(qVar.b());
                    } else {
                        journalModel = null;
                    }
                    dVar.resumeWith(journalModel);
                    kVar = k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    dVar.resumeWith(null);
                    return;
                }
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d implements ya.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<JournalModel> f28676a;

        public d(ls.h hVar) {
            this.f28676a = hVar;
        }

        @Override // ya.c
        public final void b() {
            this.f28676a.resumeWith(null);
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class e<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JournalModel f28677a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f28678b;

        public e(JournalModel journalModel, ls.h hVar) {
            this.f28677a = journalModel;
            this.f28678b = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            i.g(it, "it");
            if (it.isSuccessful()) {
                ApplicationPersistence.getInstance().setStringValue("journal_last_entry_date", new il.a().b(this.f28677a.getLastUpdated()));
            }
            this.f28678b.resumeWith(Boolean.valueOf(it.isSuccessful()));
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class f implements ya.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f28679a;

        public f(ls.h hVar) {
            this.f28679a = hVar;
        }

        @Override // ya.c
        public final void b() {
            this.f28679a.resumeWith(Boolean.FALSE);
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class g<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JournalModel f28680a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f28681b;

        public g(JournalModel journalModel, ls.h hVar) {
            this.f28680a = journalModel;
            this.f28681b = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<com.google.firebase.firestore.a> it) {
            i.g(it, "it");
            if (it.isSuccessful()) {
                ApplicationPersistence.getInstance().setStringValue("journal_last_entry_date", new il.a().b(this.f28680a.getLastUpdated()));
            }
            this.f28681b.resumeWith(Boolean.valueOf(it.isSuccessful()));
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class h implements ya.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f28682a;

        public h(ls.h hVar) {
            this.f28682a = hVar;
        }

        @Override // ya.c
        public final void b() {
            this.f28682a.resumeWith(Boolean.FALSE);
        }
    }

    public a() {
        LogHelper.INSTANCE.makeLogTag("JournalRepository");
    }

    public static Object a(String str, ls.d dVar) {
        String str2;
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str2 = fVar.j0();
        } else {
            str2 = null;
        }
        if (!n.B0(str) && str2 != null) {
            ya.h<Void> c10 = FirebaseFirestore.d().b("user_journal_list").q(str).c();
            c10.addOnCompleteListener(new C0482a(hVar));
            c10.addOnCanceledListener(new b(hVar));
        } else {
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    public static Object c(JournalModel journalModel, ls.d dVar) {
        String str;
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str = fVar.j0();
        } else {
            str = null;
        }
        if (!n.B0(journalModel.getId()) && str != null) {
            boolean z10 = false;
            if (journalModel.getFirestoreDocumentId() != null) {
                fe.c b10 = FirebaseFirestore.d().b("user_journal_list");
                String firestoreDocumentId = journalModel.getFirestoreDocumentId();
                i.d(firestoreDocumentId);
                com.google.firebase.firestore.a q10 = b10.q(firestoreDocumentId);
                String uid = journalModel.getUid();
                if ((uid == null || n.B0(uid)) ? true : true) {
                    journalModel.setUid(str);
                }
                q10.e(journalModel).addOnCompleteListener(new e(journalModel, hVar)).addOnCanceledListener(new f(hVar));
            } else {
                fe.c b11 = FirebaseFirestore.d().b("user_journal_list");
                journalModel.setUid(str);
                SecureRandom secureRandom = oe.n.f27432a;
                StringBuilder sb2 = new StringBuilder();
                for (int i6 = 0; i6 < 20; i6++) {
                    sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(oe.n.f27432a.nextInt(62)));
                }
                final com.google.firebase.firestore.a q11 = b11.q(sb2.toString());
                q11.e(journalModel).continueWith(oe.g.f27421b, new ya.b() { // from class: fe.b
                    @Override // ya.b
                    public final Object then(ya.h hVar2) {
                        boolean z11;
                        int i10 = r2;
                        com.google.firebase.firestore.a aVar = q11;
                        switch (i10) {
                            case 0:
                                hVar2.getResult();
                                return aVar;
                            default:
                                aVar.getClass();
                                ke.g gVar = (ke.g) hVar2.getResult();
                                if (gVar != null && gVar.d()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                return new g(aVar.f9626b, aVar.f9625a, gVar, true, z11);
                        }
                    }
                }).addOnCompleteListener(new g(journalModel, hVar)).addOnCanceledListener(new h(hVar));
            }
        } else {
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    public final Object b(String str, ls.d<? super JournalModel> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        v a10 = FirebaseFirestore.d().b("user_journal_list").m(str, SessionManager.KEY_UID).d("userEnteredDate").b(1L).a();
        a10.addOnCompleteListener(new c(this, hVar));
        a10.addOnCanceledListener(new d(hVar));
        return hVar.b();
    }
}
