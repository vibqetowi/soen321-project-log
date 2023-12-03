package com.google.firebase.firestore;

import android.util.SparseArray;
import com.google.firebase.FirebaseException;
/* loaded from: classes.dex */
public class FirebaseFirestoreException extends FirebaseException {

    /* loaded from: classes.dex */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_ARGUMENT(3),
        /* JADX INFO: Fake field, exist only in values array */
        DEADLINE_EXCEEDED(4),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_FOUND(5),
        /* JADX INFO: Fake field, exist only in values array */
        ALREADY_EXISTS(6),
        /* JADX INFO: Fake field, exist only in values array */
        PERMISSION_DENIED(7),
        /* JADX INFO: Fake field, exist only in values array */
        RESOURCE_EXHAUSTED(8),
        /* JADX INFO: Fake field, exist only in values array */
        FAILED_PRECONDITION(9),
        /* JADX INFO: Fake field, exist only in values array */
        ABORTED(10),
        /* JADX INFO: Fake field, exist only in values array */
        OUT_OF_RANGE(11),
        /* JADX INFO: Fake field, exist only in values array */
        UNIMPLEMENTED(12),
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL(13),
        UNAVAILABLE(14),
        /* JADX INFO: Fake field, exist only in values array */
        DATA_LOSS(15),
        /* JADX INFO: Fake field, exist only in values array */
        UNAUTHENTICATED(16);
        

        /* renamed from: z  reason: collision with root package name */
        public static final SparseArray<a> f9623z;

        /* renamed from: u  reason: collision with root package name */
        public final int f9624u;

        static {
            a[] values;
            SparseArray<a> sparseArray = new SparseArray<>();
            for (a aVar : values()) {
                a aVar2 = sparseArray.get(aVar.f9624u);
                if (aVar2 == null) {
                    sparseArray.put(aVar.f9624u, aVar);
                } else {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
            }
            f9623z = sparseArray;
        }

        a(int i6) {
            this.f9624u = i6;
        }
    }

    public FirebaseFirestoreException(String str, a aVar) {
        super(str);
        ca.a.u0(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
    }

    public FirebaseFirestoreException(String str, a aVar, Exception exc) {
        super(str, exc);
        if (str != null) {
            ca.a.u0(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
            if (aVar == null) {
                throw new NullPointerException("Provided code must not be null.");
            }
            return;
        }
        throw new NullPointerException("Provided message must not be null.");
    }
}
