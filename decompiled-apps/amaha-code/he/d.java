package he;

import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.Executor;
/* compiled from: AsyncEventListener.java */
/* loaded from: classes.dex */
public final class d<T> implements fe.h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f17467a;

    /* renamed from: b  reason: collision with root package name */
    public final fe.h<T> f17468b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f17469c = false;

    public d(Executor executor, fe.f fVar) {
        this.f17467a = executor;
        this.f17468b = fVar;
    }

    @Override // fe.h
    public final void a(T t3, FirebaseFirestoreException firebaseFirestoreException) {
        this.f17467a.execute(new androidx.emoji2.text.g(11, this, t3, firebaseFirestoreException));
    }
}
