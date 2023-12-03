package fe;

import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.ExecutionException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14981a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ya.i f14982b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ya.i f14983c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14984d = 1;

    public /* synthetic */ e(ya.i iVar, ya.i iVar2, int i6) {
        this.f14981a = i6;
        this.f14982b = iVar;
        this.f14983c = iVar2;
    }

    @Override // fe.h
    public final void a(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        boolean z10;
        int i6 = this.f14981a;
        int i10 = this.f14984d;
        ya.i iVar = this.f14982b;
        ya.i iVar2 = this.f14983c;
        switch (i6) {
            case 0:
                g gVar = (g) obj;
                if (firebaseFirestoreException != null) {
                    iVar.a(firebaseFirestoreException);
                    return;
                }
                try {
                    ((o) ya.k.a(iVar2.f38392a)).remove();
                    ke.g gVar2 = gVar.f14990c;
                    boolean z11 = true;
                    if (gVar2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u uVar = gVar.f14991d;
                    if (!z10 && uVar.f15016b) {
                        iVar.a(new FirebaseFirestoreException("Failed to get document because the client is offline.", FirebaseFirestoreException.a.UNAVAILABLE));
                    } else {
                        if (gVar2 == null) {
                            z11 = false;
                        }
                        if (z11 && uVar.f15016b && i10 == 2) {
                            iVar.a(new FirebaseFirestoreException("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", FirebaseFirestoreException.a.UNAVAILABLE));
                        } else {
                            iVar.b(gVar);
                        }
                    }
                    return;
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    ca.a.U("Failed to register a listener for a single document", e10, new Object[0]);
                    throw null;
                } catch (ExecutionException e11) {
                    ca.a.U("Failed to register a listener for a single document", e11, new Object[0]);
                    throw null;
                }
            default:
                r rVar = (r) obj;
                if (firebaseFirestoreException != null) {
                    iVar.a(firebaseFirestoreException);
                    return;
                }
                try {
                    ((o) ya.k.a(iVar2.f38392a)).remove();
                    if (rVar.f15008x.f15016b && i10 == 2) {
                        iVar.a(new FirebaseFirestoreException("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", FirebaseFirestoreException.a.UNAVAILABLE));
                    } else {
                        iVar.b(rVar);
                    }
                    return;
                } catch (InterruptedException e12) {
                    Thread.currentThread().interrupt();
                    ca.a.U("Failed to register a listener for a query result", e12, new Object[0]);
                    throw null;
                } catch (ExecutionException e13) {
                    ca.a.U("Failed to register a listener for a query result", e13, new Object[0]);
                    throw null;
                }
        }
    }
}
